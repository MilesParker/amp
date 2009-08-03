package org.eclipse.amp.amf.testing.ide;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.amp.amf.testing.ATestInterpreter;
import org.eclipse.amp.amf.testing.ares.Result;
import org.eclipse.amp.amf.testing.ares.RunSet;
import org.eclipse.amp.amf.testing.ares.impl.AresFactoryImpl;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class TestRunSet {

    String name;

    private Resource aResResource;

    RunSet runSet;

    List<ATestInterpreter> interpreters;

    IProject project;

    public TestRunSet(IProject project, List<ATestInterpreter> interpreters) {
        super();
        this.interpreters = interpreters;
        name = "";
        for (ATestInterpreter atest : interpreters) {
            name += atest.getModel().eResource().getURI().trimFileExtension().lastSegment();
        }
        //use first test location for project
        this.project = project;
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

    private void saveResults() {
        Map<Object, Object> options = new HashMap<Object, Object>();
        try {
            aResResource.save(options);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void runTests(IProgressMonitor monitor, final MultiStatus status) {
        initialize();
        List<TestRun> runs = new ArrayList<TestRun>();
        for (final ATestInterpreter atest : interpreters) {
            runs.add(new TestRun(runSet, project, atest));
        }
        for (TestRun testRun : runs) {
            testRun.runTest(monitor, status);
        }
        int testCount = runs.size();
        int testSuccessCount = 0;
        for (TestRun testRun : runs) {
            if (testRun.getRun().getResult() == Result.SUCCESS) {
                testSuccessCount++;
            }
        }
        if (testSuccessCount == testCount) {
            runSet.setResult(Result.SUCCESS);
        } else {
            runSet.setResult(Result.FAILURE);
        }
        saveResults();
    }

    public RunSet getRunSet() {
        return runSet;
    }
}
