/**
 * <copyright>
 *
 * Copyright (c) 2009 Metascape, LLC.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Metascape - Initial API and Implementation
 *
 * </copyright>
 *
 */
package org.eclipse.amp.amf.testing.ide;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.time.DateFormatUtils;
import org.eclipse.amp.amf.abase.IInterpreterProvider;
import org.eclipse.amp.amf.parameters.AParFactory;
import org.eclipse.amp.amf.testing.ATestInterpreter;
import org.eclipse.amp.amf.testing.aTest.Model;
import org.eclipse.amp.amf.testing.aTest.TestMember;
import org.eclipse.amp.amf.testing.ares.ResultType;
import org.eclipse.amp.amf.testing.ares.RunSet;
import org.eclipse.amp.amf.testing.ares.impl.AresFactoryImpl;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
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

    private RunSet runSet;

    public final static IPath RESULTS_FOLDER = new Path("test-results");

    int testRunCount;
    int testInFlightCount;
    int testCompleteCount;
    int testSuccessCount;

    List<IResource> uniqueTests;

    private List lookupTable = new ArrayList();

    private IProgressMonitor monitor;

    private MultiStatus status;

    private IInterpreterProvider aParPool;

    /**
     * The total number of tests waiting including multiple runs per resource
     */
    private List<Resource> testsWaiting;

    IProject project;

    int runsPerTest;

    private XMLParserPool parserPool = new XMLParserPoolImpl();

    private Map nameToFeatureMap = new HashMap();

    private ResourceSet resourceSet;

    private final IResource firstResource;

    public TestRunSet(IProject project, IResource res, List<IResource> testResources, int runsPerTest) {
        super();
        this.firstResource = res;
        this.uniqueTests = testResources;
        // use first test location for project
        this.project = project;
        this.runsPerTest = runsPerTest;

        name = getName();
    }

    private String getName() {
        String name = "";
        if (firstResource instanceof IFolder) {
            name += ((IFolder) firstResource).getName();
        } else if (uniqueTests.size() < 3) {
            for (IResource res : uniqueTests) {
                name += res.getProjectRelativePath().removeFileExtension().lastSegment() + "_";
            }
        } else {
            for (IResource res : uniqueTests) {
                name += res.getName().substring(0, Math.max(5, res.getName().length() - 1)) + "_";
            }
        }
        name += DateFormatUtils.format(System.currentTimeMillis(), "MM-dd-yy_HH-mm-S");
        return name;
    }

    protected void initialize() {
        monitor.subTask("Creating Test Resource");
        resourceSet = new ResourceSetImpl();

        resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
        resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
        resourceSet.getLoadOptions().put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.TRUE);
        resourceSet.getLoadOptions().put(XMLResource.OPTION_USE_PARSER_POOL, parserPool);
        resourceSet.getLoadOptions().put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, nameToFeatureMap);

        aParPool = AParFactory.createPooled(resourceSet);

        monitor.subTask("Creating Results");

        IResource firstResource = uniqueTests.get(0);
        // Get rid of test folder
        IPath projectPath = RESULTS_FOLDER.append(
                                                  firstResource.getProjectRelativePath().removeFirstSegments(1)
                                                  .removeLastSegments(1)).append(name + ".ares");

        URI fileURI = URI.createPlatformResourceURI(project.getName() + "/" + projectPath, true);
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
        testsWaiting = Collections.synchronizedList(new ArrayList<Resource>());
        for (IResource resource : uniqueTests) {

            IPath modelPath = ((IFile) resource).getFullPath();
            URI aTestURI = URI.createPlatformResourceURI(modelPath.toString(), true);
            Resource atestResource = resourceSet.getResource(aTestURI, true);
            Model testmodel = (Model) atestResource.getContents().get(0);
            if (testmodel.getContains().size() == 0) {
                for (int i = 0; i < runsPerTest; i++) {
                    testsWaiting.add(atestResource);
                }
            } else {
                for (TestMember member : testmodel.getContains()) {
                    Resource emfResource = resourceSet.getResource(URI.createURI(ATestInterpreter.convertURI(member)),
                                                                   true);
                    for (int i = 0; i < runsPerTest; i++) {
                        testsWaiting.add(emfResource);
                    }
                }
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
            final Resource nextATest = testsWaiting.remove(0);
            testInFlightCount++;
            // We don't want to block on load interpreter
            new Thread() {
                public void run() {
                    TestRun nextRun = new TestRun(TestRunSet.this, runSet, project, nextATest, aParPool);
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
    public void testComplete(TestRun run, Throwable failureCondition) {
        synchronized (this) {
            if (run.getRun() != null && run.getRun().getResult() == ResultType.SUCCESS) {
                testSuccessCount++;
            }
            testCompleteCount++;
            testInFlightCount--;
            if (failureCondition == null) {
                runSet.getRuns().add(run.getRun());
            }
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

    public ResourceSet getResourceSet() {
        return resourceSet;
    }
}
