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

import java.io.IOException;

import junit.framework.TestCase;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.metaabm.gen.test.share.AbstractGenerateBaseTest;

/**
 * 
 * @author mparker
 * 
 */
public class GenerateTest extends TestCase {
    private static final String GEN_PACKAGE = "org/eclipse/amp/amf/gen/test/";

    private static String BASE_PROJECT_NAME = "org.eclipse.amp.amf.gen.test";

    private static final String SRCGEN_LOC = "srcgen/" + GEN_PACKAGE;
    private static final String BIN_LOC = "bin/" + GEN_PACKAGE;

    public void testBasicProject() {
        String projectName = "gen.test";
        CreateProjectsTest.subtestCreateProject("Basic MetaABM Project", projectName);

        // Click the Finish button
        CreateProjectsTest.bot.button("Finish").click();
        CreateProjectsTest.bot.sleep(3000);
        IProject testProject = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
        try {
            testProject.open(IResource.NONE, null);
            assertTrue(testProject.exists());
            CreateProjectsTest.copyFiles("org.eclipse.amp.amf.gen.test", "TestBasics.metaabm", projectName);
            CreateProjectsTest.copyFiles("org.eclipse.amp.amf.gen.test", "TestMovement.metaabm", projectName);
            CreateProjectsTest.copyFiles("org.eclipse.amp.amf.gen.test", "TestSpatial.metaabm", projectName);
            CreateProjectsTest.bot.sleep(3000);
            IFolder genFolderBase = testProject.getFolder("doc");
            assertTrue(genFolderBase.exists());
            assertTrue(genFolderBase.members(true).length == 6);
        } catch (CoreException e1) {
            throw new RuntimeException(e1);
        } catch (IOException e1) {
            throw new RuntimeException(e1);
        }
        for (String className : AbstractGenerateBaseTest.BASE_ACT_MOVE_CLASS_NAMES) {
            AbstractGenerateBaseTest.postBuildForFile(className, testProject);
        }
    }
}
