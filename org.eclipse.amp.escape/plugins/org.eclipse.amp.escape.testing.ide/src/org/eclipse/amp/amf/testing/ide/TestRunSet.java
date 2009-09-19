package org.eclipse.amp.amf.testing.ide;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.amp.amf.abase.IInterpreterProvider;
import org.eclipse.amp.amf.testing.ATestProvider;
import org.eclipse.amp.amf.testing.ares.ResultType;
import org.eclipse.amp.amf.testing.ares.RunSet;
import org.eclipse.amp.amf.testing.ares.impl.AresFactoryImpl;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLParserPool;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;

public class TestRunSet {

    // TODO allow maximum threads to be preferences
    private static final int MAX_THREADS = 8;

    String name;

    private Resource aResResource;

    RunSet runSet;

    int testRunCount;
    int testInFlightCount;
    int testCompleteCount;
    int testSuccessCount;

    List<IResource> uniqueTests;

    private List lookupTable = new ArrayList();

    private IProgressMonitor monitor;

    private MultiStatus status;

    private IInterpreterProvider aTestPool;

    /**
     * The total number of tests waiting including multiple runs per resource
     */
    private List<IResource> testsWaiting;

    IProject project;

    int runsPerTest;

    private XMLParserPool parserPool = new XMLParserPoolImpl();

    private Map nameToFeatureMap = new HashMap();

    public TestRunSet(IProject project, List<IResource> testResources, String name, int runsPerTest) {
        super();
        this.uniqueTests = testResources;
        this.name = name;
        // use first test location for project
        this.project = project;
        this.runsPerTest = runsPerTest;
    }

    protected void initialize() {
        monitor.subTask("Creating Test Resource");
        ResourceSet resourceSet = new ResourceSetImpl();

        resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
        resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
        resourceSet.getLoadOptions().put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.TRUE);
        resourceSet.getLoadOptions().put(XMLResource.OPTION_USE_PARSER_POOL, parserPool);
        resourceSet.getLoadOptions().put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, nameToFeatureMap);

        aTestPool = ATestProvider.createPooled(resourceSet);

        monitor.subTask("Creating Results");
        IFolder resultsFolder = project.getFolder("results");
        IFile resultsFile = resultsFolder.getFile(name + ".ares");
        URI fileURI = URI.createPlatformResourceURI(project.getName() + "/" + resultsFile.getProjectRelativePath(),
                                                    true);
        aResResource = resourceSet.createResource(fileURI);

        runSet = AresFactoryImpl.eINSTANCE.createRunSet();

        if (runSet != null) {
            aResResource.getContents().add(runSet);
        } else {
            throw new RuntimeException("Couldn't create resource.");
        }
        if (monitor.isCanceled()) {
            return;
        }
        saveResults();
    }


    private synchronized void saveResults() {
        Map<Object, Object> saveOptions = new HashMap<Object, Object>();
        saveOptions.put(XMLResource.OPTION_CONFIGURATION_CACHE, Boolean.TRUE);
        saveOptions.put(XMLResource.OPTION_USE_CACHED_LOOKUP_TABLE, lookupTable);
        monitor.subTask("Saving Results");
        try {
            aResResource.save(saveOptions);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void runTests(final IProgressMonitor monitor, final MultiStatus status) {
        this.monitor = monitor;
        this.status = status;
        monitor.beginTask("Executing Escape Tests: " + name, uniqueTests.size());

        initialize();
        monitor.subTask("Preparing Tests");
        testsWaiting = Collections.synchronizedList(new ArrayList<IResource>());
        for (IResource resource : uniqueTests) {
            for (int i = 0; i < runsPerTest; i++) {
                testsWaiting.add(resource);
            }
        }
        // Release the unique tests so that the underlying resources can be gc'd when individual tests are removed.
        uniqueTests = null;
        testRunCount = testsWaiting.size();
        testCompleteCount = 0;
        testSuccessCount = 0;

        fillThreads();
        while (testCompleteCount < testRunCount && !monitor.isCanceled()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
        if (!monitor.isCanceled()) {
            if (testSuccessCount == testRunCount) {
                runSet.setResult(ResultType.SUCCESS);
            } else {
                runSet.setResult(ResultType.FAILURE);
            }
            saveResults();
        }
        monitor.done();
    }

    private synchronized void fillThreads() {
        monitor.subTask("(Filling Threads)");
        while (testsWaiting.size() > 0 && testInFlightCount < MAX_THREADS && !monitor.isCanceled()) {
            final IResource nextATest = testsWaiting.remove(0);
            testInFlightCount++;
            // We don't want to block on load interpreter
            new Thread() {
                public void run() {
                    TestRun nextRun = new TestRun(TestRunSet.this, runSet, project, nextATest, aTestPool);
                    nextRun.runTest(monitor, status, false);
                };
            }.start();
            updateMonitor();
        }
    }

    public void run() {
        Job escapeRun = new Job("Run " + name) {
            protected IStatus run(IProgressMonitor monitor) {
                final MultiStatus status = new MultiStatus("org.eclipse.amp.amf.testing.ide", Status.OK,
                                                           "Executing Tests", null);
                runTests(monitor, status);
                return status;
            }
        };
        escapeRun.setPriority(Job.LONG);
        escapeRun.schedule();
    }

    /**
     * @param thread
     */
    public void testComplete(TestRun run) {
        synchronized (this) {
            if (run.getRun() != null && run.getRun().getResult() == ResultType.SUCCESS) {
                testSuccessCount++;
            }
            testCompleteCount++;
            testInFlightCount--;
            runSet.getRuns().add(run.getRun());
            fillThreads();
        }
        saveResults();
        updateMonitor();
        monitor.worked(1);
    }

    private void updateMonitor() {
        // Don't block on ui monitor update
        monitor.subTask("Completed " + testCompleteCount + " of " + testRunCount + " ("
                        + (testCompleteCount - testSuccessCount) + " failures)");
    }

    public RunSet getRunSet() {
        return runSet;
    }

    public XMLParserPool getParserPool() {
        return parserPool;
    }

    public Map getNameToFeatureMap() {
        return nameToFeatureMap;
    }
}
