package org.eclipse.amp.amf.testing.ide;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.amp.amf.testing.ATestInterpreter;
import org.eclipse.amp.amf.testing.ares.ResultType;
import org.eclipse.amp.amf.testing.ares.RunSet;
import org.eclipse.amp.amf.testing.ares.impl.AresFactoryImpl;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
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

    List<IResource> aTests;

    List<ATestInterpreter> interpreters;

    IProject project;

    int runsPerTest;

    private XMLParserPool parserPool = new XMLParserPoolImpl();

    private class ThreadLocalFeatureMap extends ThreadLocal {
        private Map nameToFeatureMap = new HashMap();
        /**
         * @return the nameToFeatureMap
         */
        public Map nameToFeatureMap() {
            return nameToFeatureMap;
        }
    }

    ThreadLocalFeatureMap featureMap = new ThreadLocalFeatureMap();

    private Map getFeatureMap() {
        return featureMap.nameToFeatureMap();
    }

    public TestRunSet(IProject project, List<IResource> testResources, String name, int runsPerTest) {
        super();
        this.aTests = testResources;
        this.name = name;
        // use first test location for project
        this.project = project;
        this.runsPerTest = runsPerTest;
    }

    protected void initialize(final IProgressMonitor monitor) {
        monitor.subTask("Loading Tests");
        interpreters = new ArrayList<ATestInterpreter>();
        int currentTest = 0;
        int testCount = aTests.size();
        for (IResource resource : aTests) {
            currentTest++;
            monitor.subTask("Creating Test " + currentTest + " of " + testCount);
            ATestInterpreter aTestInterpreter = new ATestInterpreter(resource);
            aTestInterpreter.setParserPool(parserPool);
            aTestInterpreter.setNameToFeatureMap(getFeatureMap());
            aTestInterpreter.load();
            interpreters.add(aTestInterpreter);
            if (monitor.isCanceled()) {
                return;
            }
        }
        if (name == null) {
            for (ATestInterpreter atest : interpreters) {
                name += atest.getModel().eResource().getURI().trimFileExtension().lastSegment();
            }
        }
        ResourceSet resourceSet = new ResourceSetImpl();

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

    private List lookupTable = new ArrayList();

    private synchronized void saveResults() {
        Map<Object, Object> saveOptions = new HashMap<Object, Object>();
        saveOptions.put(XMLResource.OPTION_CONFIGURATION_CACHE,
                        Boolean.TRUE);
        saveOptions.put(XMLResource.OPTION_USE_CACHED_LOOKUP_TABLE,
                        lookupTable);
        try {
            aResResource.save(saveOptions);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    int testsStarted;
    int testsCompleted;
    int testSuccessCount;

    public void runTests(final IProgressMonitor monitor, final MultiStatus status) {
        monitor.beginTask("Executing Escape Tests: " + name, aTests.size());
        initialize(monitor);
        monitor.subTask("Preparing Tests");
        List<TestRun> runs = new ArrayList<TestRun>();
        int n = 0;
        int c = interpreters.size();
        for (final ATestInterpreter atest : interpreters) {
            monitor.subTask("Creating Test " + n + " of " + c);
            for (int i = 0; i < runsPerTest; i++) {
                runs.add(new TestRun(runSet, project, atest));
            }
        }
        List<TestRun> runSpawns = new ArrayList<TestRun>(runs);
        final int testCount = runSpawns.size();
        testsCompleted = 0;
        testSuccessCount = 0;
        testsStarted = 0;
        monitor.subTask("Spawning Tests");
        ThreadGroup testGroup = new ThreadGroup("Test Execution: " + name);
        while (testsStarted < testCount && !monitor.isCanceled()) {
            final TestRun nextRun = runSpawns.remove(0);
            testsStarted++;
            // TODO any advantage to using Java Fixed Thread Pool here?
            Thread testRun = new Thread(testGroup, "Test " + testsStarted) {
                public void run() {
                    try {
                        nextRun.runTest(monitor, status);
                    } finally {
                        testsCompleted++;
                        if (nextRun.getRun().getResult() == ResultType.SUCCESS) {
                            testSuccessCount++;
                        }
                        monitor.subTask("Completed " + testsCompleted + " of " + testCount + " ("
                                        + (testsCompleted - testSuccessCount) + " failures)");
                        monitor.worked(1);
                        if (testsCompleted % MAX_THREADS == 0) {

                        }
                    }
                }
            };
            testRun.start();
            while (testsStarted - testsCompleted >= MAX_THREADS && !monitor.isCanceled()) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                }
            }
        }
        while (testsCompleted < testCount && !monitor.isCanceled()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
        if (!monitor.isCanceled()) {
            if (testSuccessCount == runs.size()) {
                runSet.setResult(ResultType.SUCCESS);
            } else {
                runSet.setResult(ResultType.FAILURE);
            }
            saveResults();
        }
        monitor.done();
    }

    public RunSet getRunSet() {
        return runSet;
    }
}
