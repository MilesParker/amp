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

import org.eclipse.amp.escape.command.ExecuteJavaHeadlessHandler;
import org.eclipse.amp.escape.ide.EclipseEscapeRunner;
import org.eclipse.core.resources.IResource;

import org.ascape.runtime.Runner;

// TODO: Auto-generated Javadoc
/**
 * The Class ExecuteParameterHandler.
 */
public class ExecuteJavaEMFOutputHandler extends ExecuteJavaHeadlessHandler {

    protected IResource modelResource;


    /**
     * @return
     * @see org.eclipse.amp.escape.command.ExecuteHandler#createRunner()
     */
    protected EclipseEscapeRunner createRunner() {
        Runner.setDisplayGraphics(!isHeadless());
        EclipseEscapeRunner runner = new EclipseEscapeRunner() {
            private static final long serialVersionUID = 1L;

            /**
             * 
             * @see org.ascape.runtime.Runner#run()
             */
            public synchronized void run() {
                // getScape().addView(new EMFDataOutputView(modelResource));
                super.run();
            }
        };
        return runner;
    }
}
