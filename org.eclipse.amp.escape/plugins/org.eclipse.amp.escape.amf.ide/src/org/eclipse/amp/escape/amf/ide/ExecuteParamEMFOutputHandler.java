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

import org.ascape.runtime.Runner;
import org.eclipse.amp.escape.ide.EclipseEscapeRunner;
import org.eclipse.amp.escape.view.EMFDataOutputView;

// TODO: Auto-generated Javadoc
/**
 * The Class ExecuteParameterHandler.
 */
public class ExecuteParamEMFOutputHandler extends ExecuteParameterHeadlessHandler {

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
                getScape().addView(new EMFDataOutputView(modelResource));
                super.run();
            }

            /**
             * @param args
             * @param block
             * @see org.ascape.runtime.Runner#openImplementation(java.lang.String[], boolean)
             */
            public void openImplementation(String[] args, boolean block) {
                getInterpreter().assignValues(new Object[] { getRootScape(), this }, null);
                super.openImplementation(args, block);
            }

        };
        return runner;
    }

}
