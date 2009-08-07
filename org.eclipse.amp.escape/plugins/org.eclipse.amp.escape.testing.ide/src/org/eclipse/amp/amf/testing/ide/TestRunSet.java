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

public class TestRunSet {

    // TODO allow maximum threads to be preferences
    private static final int MAX_THREADS = 8;

    String name;

    private Resource aResResource;

    RunSet runSet;

    List<ATestInterpreter> interpreters;

    IProject project;

    int runsPerTest;

    public TestRunSet(IProject project, List<IResource> testResources, String name, int runsPerTest) {
        super();
        interpreters = new ArrayList<ATestInterpreter>();
        for (IResource resource : testResources) {
            interpreters.add(new ATestInterpreter(resource));
        }
        this.name = name;
        if (name == null) {
            for (ATestInterpreter atest : interpreters) {
                name += atest.getModel().eResource().getURI().trimFileExtension().lastSegment();
            }
        }
        // use first test location for project
        this.project = project;
        this.runsPerTest = runsPerTest;
    }

    protected void initialize() {
        ResourceSet resourceSet = new ResourceSetImpl();

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
        saveResults();
    }

    private synchronized void saveResults() {
        Map<Object, Object> options = new HashMap<Object, Object>();
        try {
            aResResource.save(options);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    int testsStarted;
    int testsCompleted;
    int testSuccessCount;

    public void runTests(final IProgressMonitor monitor, final MultiStatus status) {
        monitor.beginTask("Executing Escape Tests: " + name, interpreters.size());
        initialize();
        List<TestRun> runs = new ArrayList<TestRun>();
        for (final ATestInterpreter atest : interpreters) {
            for (int i = 0; i < runsPerTest; i++) {
                runs.add(new TestRun(runSet, project, atest));
            }
        }
        List<TestRun> runSpawns = new ArrayList<TestRun>(runs);
        int testCount = runSpawns.size();
        testsCompleted = 0;
        testSuccessCount = 0;
        testsStarted = 0;
        while (testsStarted < testCount && !monitor.isCanceled()) {
            final TestRun nextRun = runSpawns.remove(0);
            testsStarted++;
            new Thread() {
                public void run() {
                    try {
                        nextRun.runTest(monitor, status);
                    } finally {
                        testsCompleted++;
                        if (nextRun.getRun().getResult() == ResultType.SUCCESS) {
                            testSuccessCount++;
                        }
                        monitor.worked(1);
                    }
                    saveResults();
                }
            }.start();
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
