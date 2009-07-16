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
