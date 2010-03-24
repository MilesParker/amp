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
import org.eclipse.core.resources.IResource;
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

    protected void executeOpen(EclipseEscapeRunner eclipseRunner, Object executed, IProgressMonitor monitor) {
        if (executed instanceof IResource) {
            modelResource = (IResource) executed;
            File file = modelResource.getLocation().toFile();
            if (modelResource.getFileExtension().equals("metaabm")) {
                try {
                    model = MetaABMPersist.create(file).load();
                    SImplementation impl = model.getImplementation();
                    final String modelClassName = impl.getQualifiedName();
                    eclipseRunner.open(modelResource, modelClassName, model.getLabel());
                } catch (IOException e) {
                    EscapeIDEPlugin.warn("Couldn't load model.", e);
                }
            }
        }
    }

    protected boolean handleSelect(Object sel) {
        return sel instanceof IResource && ((IResource) sel).getFileExtension() != null
        && ((IResource) sel).getFileExtension().equals("metaabm");
    }

    /**
     * @return the model
     */
    public SContext getModel() {
        return model;
    }
}
