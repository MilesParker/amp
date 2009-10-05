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
package org.metaabm.gen.test;

import java.util.Date;

import junit.framework.TestCase;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaModelMarker;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;

public abstract class AbstractGenerateBaseTest extends TestCase {

    public final static String[] BASE_MODEL_NAMES = { "TestGeneration.metaabm" };
    public final static String[] BASE_CLASS_NAMES = { "GeneratedModel", "GeneratedMemberAgent" };
    public final static String[] BASE_ACT_MOVE_MODEL_NAMES = { "TestBasics.metaabm", "TestActs.metaabm",
            "TestSpatial.metaabm" };
    public final static String[] BASE_ACT_MOVE_CLASS_NAMES = { "BasicModel", "OperationsAgent", "StateAgent",
            "BasicMovementModel", "BasicMovementAgent", "ComplexMovementAgent", "Location" };
    private IJavaProject javaProject;
    private IProject testProject;

    protected void executeGeneration(String projectName, String[] modelNames, String[] classNames) {
        // builder.setCreateMarkers(false);
        LockMonitor buildMonitor = new LockMonitor();
        System.setProperty("METAABM_TESTING", "true");
        try {
            ResourcesPlugin.getWorkspace().getDescription().setAutoBuilding(false);
            loadProject(projectName);
            IFolder genFolder = testProject.getFolder("srcgen/org/metaabm/gen/test");
            if (genFolder != null) {
                for (IResource res : genFolder.members()) {
                    res.delete(true, buildMonitor);
                    buildMonitor.blockContinue();
                }
            }
            assertTrue(testProject.getFolder("srcgen/org/metaabm/gen/test").members(true).length == 0);
            testProject.build(IncrementalProjectBuilder.CLEAN_BUILD, buildMonitor);
            buildMonitor.blockContinue();
            assertTrue(testProject.getFolder("bin").members(true).length == 0);
            assertTrue(!buildMonitor.isDoneFlag());
            testProject.build(IncrementalProjectBuilder.FULL_BUILD, buildMonitor);
            assertTrue(!buildMonitor.isCanceled());
            buildMonitor.block();
            assertTrue(buildMonitor.isDoneFlag());
            buildMonitor.reset();
            testProject.refreshLocal(IResource.DEPTH_INFINITE, buildMonitor);
            buildMonitor.block();
            assertTrue(buildMonitor.doneFlag);
            for (String className : classNames) {
                postBuildForFile(testProject, className);
            }
        } catch (CoreException e) {
            e.printStackTrace();
            fail(e.getLocalizedMessage());
        }
        ResourcesPlugin.getWorkspace().getDescription().setAutoBuilding(true);
    }

    public void loadProject(String projectName) throws CoreException, JavaModelException {
        testProject = (IProject) ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
        assertNotNull(testProject);
        testProject.open(null);
        javaProject = JavaCore.create(testProject);
        javaProject.open(null);
        testProject.refreshLocal(IResource.DEPTH_INFINITE, null);
    }

    // public void testGenerate() {
    // executeGeneration(new MetaABMBuilder(), "org.eclipse.amp.amf.gen.test",
    // BASE_MODEL_NAMES, BASE_CLASS_NAMES);
    // }

    // protected void buildModel(MetaABMBuilder builder, IProject testProject,
    // String modelName) throws CoreException {
    // IFile genFile = testProject.getFile(modelName);
    // assertNotNull(genFile);
    // assertNotNull(genFile.getLocation());
    // builder.loadPropertiesFromResource(genFile);
    // builder.getGenProperties().put("asTest", "true");
    // builder.getGenProperties().put("outputPath",
    // testProject.getRawLocation().toOSString());
    // builder.generateModel();
    // }

    protected void preBuildForFile(IProject gentTestProject, String fileName) {
        assertTrue(!testProject.getFile("srcgen/org/metaabm/gen/test/" + fileName + ".java").exists());
        assertTrue(!testProject.getFile("bin/org/metaabm/gen/test/" + fileName + ".class").exists());
    }

    protected void postBuildForFile(IProject gentTestProject, String fileName) {
        IFile generatedJava = gentTestProject.getFile("srcgen/org/metaabm/gen/test/" + fileName + ".java");
        assertNotNull(generatedJava);
        assertTrue("No source file for: " + fileName, generatedJava.exists());
        String classLoc = "org/metaabm/gen/test/" + fileName + ".class";
        IFile generatedClass = gentTestProject.getFile("bin/" + classLoc);
        assertTrue("Problem compiling class for: " + fileName, generatedClass.exists());
        try {
            ICompilationUnit classFile = (ICompilationUnit) javaProject.findElement(new Path(classLoc));
            try {
                IMarker[] markers = classFile.getUnderlyingResource().findMarkers(
                        IJavaModelMarker.JAVA_MODEL_PROBLEM_MARKER, true, IResource.DEPTH_INFINITE);
                for (IMarker marker : markers) {
                    if (marker.getAttribute(IMarker.SEVERITY, IMarker.SEVERITY_INFO) == IMarker.SEVERITY_ERROR) {
                        int line = marker.getAttribute(IMarker.LINE_NUMBER, 0);
                        String msg = marker.getAttribute(IMarker.MESSAGE, "");
                        fail("Compiliation error in " + fileName + " @ " + line + ": " + msg);
                    }
                }
            } catch (CoreException e) {
                fail("Problem compiling:" + fileName);
            }
        } catch (JavaModelException e) {
            fail("Java Model Issue: " + e);
        }
        // was built no more than 30 seconds ago
        long genTime = generatedJava.getLocalTimeStamp();
        long expectedTime = System.currentTimeMillis() - 30000;
        assertTrue("Generate time: " + new Date(genTime).toString() + "   expected time: "
                + new Date(expectedTime).toString(), genTime > expectedTime);
    }

    public IJavaProject getJavaProject() {
        return javaProject;
    }

    public IProject getTestProject() {
        return testProject;
    }
}
