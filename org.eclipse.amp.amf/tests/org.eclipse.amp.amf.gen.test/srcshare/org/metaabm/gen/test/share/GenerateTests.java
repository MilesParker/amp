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

import junit.framework.TestCase;

import org.eclipse.amp.amf.gen.ide.MetaABMBuilder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

public class GenerateTests extends TestCase {
    public void testGeneration() {
        IProject genProject = ResourcesPlugin.getWorkspace().getRoot().getProject("org.eclipse.amp.amf.gen.test");
        IResource[] members;
        try {
            members = genProject.members();
            for (IResource resource : members) {
                if (resource.getFileExtension() != null && resource.getFileExtension().equals("metaabm")) {
                    MetaABMBuilder.getBaseBuilderDefault().handleModifiedResource(resource);
                }
            }
        } catch (CoreException e) {
            throw new RuntimeException("Couldn't generate test case", e);
        }
    }
}
