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

import org.eclipse.amp.amf.parameters.AParInterpreter;
import org.eclipse.amp.escape.command.ExecuteHandler;
import org.eclipse.amp.escape.ide.EclipseEscapeRunner;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;

// TODO: Auto-generated Javadoc
/**
 * The Class ExecuteParameterHandler.
 */
public class ExecuteParameterHandler extends ExecuteHandler {

    /**
     * Instantiates a new execute parameter handler.
     * 
     * @param headless the headless
     */
    public ExecuteParameterHandler(boolean headless) {
        super(headless);
    }

    /**
     * Instantiates a new execute parameter handler.
     */
    public ExecuteParameterHandler() {
        super(false);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.amp.escape.command.ExecuteHandler#executeOpen(org.eclipse.amp.escape.ide.EclipseEscapeRunner,
     * java.lang.Object, org.eclipse.core.runtime.IProgressMonitor)
     */
    protected void executeOpen(EclipseEscapeRunner eclipseRunner, Object executed, IProgressMonitor monitor) {
        if (executed instanceof IResource) {
            IResource modelResource = (IResource) executed;
            IProject project = modelResource.getProject();
            if (modelResource.getFileExtension().equals("apar")) {
                AParInterpreter interpreter = new AParInterpreter();
                interpreter.load(modelResource);
                eclipseRunner.open(project, interpreter.getTargetModel().getImplementation().getQualifiedName(),
                                   interpreter.getRunName(), interpreter.getArgs());
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.amp.escape.command.ExecuteHandler#handleSelect(java.lang.Object)
     */
    protected boolean handleSelect(Object sel) {
        return sel instanceof IResource && ((IResource) sel).getFileExtension() != null
        && ((IResource) sel).getFileExtension().equals("apar");
    }
}
