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
package org.metaabm.gen.test.share;

import java.util.Date;

import junit.framework.TestCase;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

public abstract class AbstractGenerateBaseTest extends TestCase {

    // TODO Make this settable from junit plugin test arguments..
    public static String REPOS_PATH = "/Resources/Developer/repos/metaabm/";
    private static String BASE_PROJECT_NAME = "org.eclipse.amp.amf.gen.test";

    public static final int EXPECTED_BUILD_TIME = 30000;
    private static final String GEN_PACKAGE = "org/metaabm/gen/test/";
    private static final String SRCGEN_LOC = "srcgen/" + GEN_PACKAGE;
    private static final String BIN_LOC = "bin/" + GEN_PACKAGE;
    public final static String[] BASE_MODEL_NAMES = { "TestGeneration.metaabm" };
    public final static String[] BASE_CLASS_NAMES = { "GeneratedModel", "GeneratedMemberAgent" };
    public final static String[] BASE_ACT_MOVE_MODEL_NAMES = { "TestBasics.metaabm", "TestActs.metaabm",
    "TestSpatial.metaabm" };
    public final static String[] BASE_ACT_MOVE_CLASS_NAMES = { "BasicModel", "OperationsAgent", "StateAgent",
        "BasicMovementModel", "BasicMovementAgent", "ComplexMovementAgent", "ComplexLocation" };

    // private IJavaProject javaProject;
    // private IProject testProject;

    protected void executeGeneration(final String projectName, final String[] modelNames, final String[] classNames) {
        // builder.setCreateMarkers(false);
        System.setProperty("METAABM_TESTING", "true");
        final IWorkspace workspace = ResourcesPlugin.getWorkspace();
        IWorkspaceRunnable runTest = new IWorkspaceRunnable() {

            public void run(IProgressMonitor monitor) throws CoreException {
                try {
                    // ResourcesPlugin.getWorkspace().getDescription().
                    // setAutoBuilding(false);
                    IProject testProject = createExistingProject(projectName, monitor);
                    assertTrue(testProject.exists());
                    LockMonitor buildMonitor = new LockMonitor();
                    IJavaProject javaProject = JavaCore.create(testProject);
                    assertNotNull(javaProject);
                    assertTrue(javaProject.exists());
                    javaProject.open(monitor);
                    testProject.refreshLocal(IResource.DEPTH_INFINITE, monitor);
                    // if (!projectName.equals(baseProjectName)) {
                    // IProject baseProject = ResourcesPlugin.getWorkspace().getRoot().getProject(baseProjectName);
                    // baseProject.create(buildMonitor);
                    // baseProject.open(monitor);
                    // for (IResource res : baseProject.members()) {
                    // if (res instanceof IFile && res.getFileExtension().equals("metaabm")) {
                    // IPath destPath = testProject.getFullPath().append(res.getProjectRelativePath());
                    // IFile replaced = workspace.getRoot().getFile(destPath);
                    // if (replaced.exists()) {
                    // replaced.delete(true, monitor);
                    // }
                    // res.copy(destPath, true, monitor);
                    // }
                    // }
                    // }
                    IFolder genFolder = testProject.getFolder(SRCGEN_LOC);
                    assertTrue(genFolder.exists());
                    if (genFolder != null) {
                        for (IResource res : genFolder.members()) {
                            res.delete(true, buildMonitor);
                            buildMonitor.blockContinue();
                        }
                    }
                    assertTrue(testProject.getFolder(SRCGEN_LOC).members(true).length == 0);
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
                        postBuildForFile(className, testProject);
                    }
                } catch (CoreException e) {
                    throw new RuntimeException(e.getLocalizedMessage(), e);
                }
            }
        };
        try {
            workspace.run(runTest, workspace.getRoot(), IWorkspace.AVOID_UPDATE, null);

        } catch (CoreException e) {
            throw new RuntimeException(e);
        }
    }

    boolean projectCreated;

    private synchronized IProject createExistingProject(String createProjectName, IProgressMonitor monitor) {
        try {
            IProject targetProject = ResourcesPlugin.getWorkspace().getRoot().getProject(createProjectName);
            targetProject.open(IResource.NONE, new SubProgressMonitor(monitor, 70));

            return targetProject;
        } catch (CoreException e) {
            throw new RuntimeException(e);
        } finally {
            monitor.done();
        }

    }

    protected void preBuildForFile(String fileName, IProject project) {
        assertTrue(!project.getFile(SRCGEN_LOC + fileName + ".java").exists());
        assertTrue(!project.getFile(BIN_LOC + fileName + ".class").exists());
    }

    public static void postBuildForFile(String fileName, IProject project) {
        IFile generatedJava = project.getFile(SRCGEN_LOC + fileName + ".java");
        assertNotNull(generatedJava);
        assertTrue("No source file at: " + project.getLocation() + "/" + generatedJava.getProjectRelativePath(),
                   generatedJava.exists());
        String classLoc = GEN_PACKAGE + fileName + ".class";
        IFile generatedClass = project.getFile("bin/" + classLoc);
        assertTrue("No compiled file at: " + project.getLocation() + "/" + generatedClass.getProjectRelativePath(),
                   generatedClass.exists());
        long genTime = generatedJava.getLocalTimeStamp();
        long expectedTime = System.currentTimeMillis() - EXPECTED_BUILD_TIME;
        assertTrue("Generate time: " + new Date(genTime).toString() + "   expected time: "
                   + new Date(expectedTime).toString(), genTime > expectedTime);
    }
}
