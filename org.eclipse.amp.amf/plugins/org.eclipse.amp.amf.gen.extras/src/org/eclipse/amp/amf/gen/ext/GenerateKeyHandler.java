/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Metascape - Initial development and maintenance
 *
 * </copyright>
 */
package org.eclipse.amp.amf.gen.ext;

import org.eclipse.amp.amf.gen.ide.ResourceJobHandler;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.ui.statushandlers.StatusManager;


public class GenerateKeyHandler extends ResourceJobHandler {

    protected ClassLoader mainLoader;
    protected ClassLoader delegateLoader;

	@Override
	public void execute(IResource resource) throws ExecutionException {
		try {
            IProject modelProject = resource.getProject();
            modelProject.open(null);
            addSrcDir(modelProject, "srcutil");
			KeyModelBuilder.getKeyBuilderDefault().handleModifiedResource(resource);
			KeyGraphicsLaunchAction graphicsWriterLauncher = new KeyGraphicsLaunchAction();
			graphicsWriterLauncher.launchWithResource(resource);
            resource.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
            IStatus ioStatus = new Status(Status.WARNING, "org.eclipse.amp.amf.gen.ext", "Problem Generating "
                    + resource + " Graphics", e);
            StatusManager.getManager().handle(ioStatus);
		}
	}

    public void addSrcDir(IProject modelProject, String path) throws CoreException, JavaModelException {
        IFolder utilSrc = modelProject.getFolder(path);
        if (!utilSrc.exists()) {
            IJavaProject javaProject = JavaCore.create(modelProject);
            utilSrc.create(false, false, null);
            IClasspathEntry[] entries= javaProject.getRawClasspath();
            IClasspathEntry[] newEntries= new IClasspathEntry[entries.length + 1];
            System.arraycopy(entries, 0, newEntries, 0, entries.length);
            newEntries[entries.length] = JavaCore.newSourceEntry(utilSrc.getFullPath());
            javaProject.setRawClasspath(newEntries, null);
        }
    }
}
