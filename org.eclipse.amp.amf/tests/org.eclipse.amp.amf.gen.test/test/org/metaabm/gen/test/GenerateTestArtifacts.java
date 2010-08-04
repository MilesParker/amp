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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.statushandlers.StatusManager;

public class GenerateTestArtifacts extends AbstractGenerateBaseTest {
    
//    public void executeGenerate(String projectName, String targetName) {
//        System.setProperty("METAABM_TESTING", "true");
//        System.out.println("proj");
//        try {
//            loadProject(projectName);
//            System.out.println(projectName);
//            IResource[] genFiles = getTestProject().members();
//            MetaABMBuilder builder = new InterfaceModelBuilder();
//            generateForBuilder(genFiles, builder, targetName);
//            builder = new TestCaseBuilder();
//            generateForBuilder(genFiles, builder, targetName);
//        } catch (CoreException e) {
//            StatusManager.getManager().handle(
//                    new Status(IStatus.ERROR, projectName, "Couldn't generate metaABM code.", e));
//        }
//    }
//
//    private void generateForBuilder(IResource[] genFiles, MetaABMBuilder builder, String targetName)
//            throws CoreException {
//        builder.getGenProperties().put("outputPath", getTestProject().getRawLocation().toOSString());
//        builder.getGenProperties().put("targetID", targetID);
//        System.out.println(genFiles.length);
//        for (IResource genFile : genFiles) {
//            System.out.println(genFile);
//            if (genFile instanceof IFile && genFile.getFileExtension().equals("metaabm")) {
//                builder.generateWorkspaceModel(genFile);
//                System.out.println("Generate");
//            }
//        }
//    }    
    
    public final static String[] BASE_TEST_MOVE_CLASS_NAMES = { "BasicModelTestCase", "OperationsAgentTestCase", "StateAgentTestCase",
    "BasicMovementModelTestCase", "BasicSpaceAgentTestCase", "ComplexMovementAgentTestCase", "LocationTestCase" };


    public void testGenerateBaseArtifacts() {
        executeGeneration("org.eclipse.amp.amf.gen.test", BASE_ACT_MOVE_MODEL_NAMES, BASE_TEST_MOVE_CLASS_NAMES);
    }
}
