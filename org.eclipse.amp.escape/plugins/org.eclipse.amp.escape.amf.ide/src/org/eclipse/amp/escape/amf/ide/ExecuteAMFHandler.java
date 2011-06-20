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
package org.eclipse.amp.escape.amf.ide;

import java.io.File;
import java.io.IOException;

import org.eclipse.amp.escape.command.ExecuteHandler;
import org.eclipse.amp.escape.ide.EclipseEscapeRunner;
import org.eclipse.amp.escape.ide.EscapeIDEPlugin;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.metaabm.SContext;
import org.metaabm.SImplementation;
import org.metaabm.xsd.MetaABMPersist;

public class ExecuteAMFHandler extends ExecuteHandler {

    protected IResource modelResource;
    private SContext model;

    public ExecuteAMFHandler() {
        super(false);
    }

    public ExecuteAMFHandler(boolean headless) {
        super(headless);
    }

    @Override
		protected EclipseEscapeRunner executeOpen(Object executed, IProgressMonitor monitor) {
        if (executed instanceof IResource) {
            modelResource = (IResource) executed;
            File file = modelResource.getLocation().toFile();

            if (modelResource.getFileExtension().equals("metaabm")) {
                try {
                    model = MetaABMPersist.create(file).load();
                    SImplementation impl = model.getImplementation();
                    final String modelClassName = getModelClass(impl);
                    EclipseEscapeRunner eclipseRunner = createRunner();
                    eclipseRunner.open(modelResource, modelClassName, model.getLabel());
                    return eclipseRunner;
                } catch (IOException e) {
                    EscapeIDEPlugin.warn("Couldn't load model.", e);
                }
            }
        }
        return null;
    }

    protected String getModelClass(SImplementation impl) {
        final String modelClassName = impl.getQualifiedName();
        return modelClassName;
    }

    @Override
		protected boolean handleSelect(Object sel) {
        if (sel instanceof IResource) {
            IResource res = (IResource) sel;
            if (res.getFileExtension() != null && res.getFileExtension().equals("metaabm")) {
                IProject project = res.getProject();
                try {
                    ICommand[] buildSpec = project.getDescription().getBuildSpec();
                    for (ICommand cmd : buildSpec) {
                        String buildName = EscapeAMFPlugin.PLUGIN_ID + "."
                        + EscapeModelBuilder.ESCAPE_BUILDER_ID;
                        if (cmd.getBuilderName().equals(buildName)) {
                            return true;
                        }
                    }
                } catch (CoreException e) {
                    // safe to ignore
                    return false;
                }
            }
        }
        return false;
    }

    /**
     * @return the model
     */
    public SContext getModel() {
        return model;
    }
}
