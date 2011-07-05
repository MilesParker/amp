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
import org.eclipse.amp.amf.gen.ide.TestCaseModelBuilder;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.statushandlers.StatusManager;

public class GenerateGraphVisHandler extends ResourceJobHandler {

	@Override
	public void execute(IResource resource) throws ExecutionException {
		try {
            IProject modelProject = resource.getProject();
            modelProject.open(null);
			GraphVisBuilder.getGraphVisBuilderDefault().handleModifiedResource(resource);
            resource.getProject().refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
            IStatus ioStatus = new Status(Status.WARNING, "org.eclipse.amp.amf.gen.ext", "Problem Generating "
                    + resource + " Graphics", e);
            StatusManager.getManager().handle(ioStatus);
		}
	}
}
