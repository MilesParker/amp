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

import org.eclipse.amp.escape.ide.EclipseEscapeRunner;

// TODO: Auto-generated Javadoc
/**
 * The Class ExecuteParameterHeadlessHandler.
 */
public class ExecuteParameterHeadlessHandler extends ExecuteParameterHandler {

    /**
     * Instantiates a new execute parameter headless handler.
     */
    public ExecuteParameterHeadlessHandler() {
        super(true);
    }

    /**
     * @return
     * @see org.eclipse.amp.escape.amf.ide.ExecuteParameterHandler#createRunner()
     */
    protected EclipseEscapeRunner createRunner() {
        EclipseEscapeRunner runner = super.createRunner();
        runner.setCloseOnStop(true);
        runner.setAutoRestart(false);
        return runner;
    }
}
