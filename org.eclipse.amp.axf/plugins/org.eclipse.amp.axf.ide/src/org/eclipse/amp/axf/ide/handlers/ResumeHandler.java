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
package org.eclipse.amp.axf.ide.handlers;

import org.eclipse.amp.axf.core.EngineControl;

// TODO: Auto-generated Javadoc
/**
 * The Class ResumeHandler.
 */
public class ResumeHandler extends ModelRunHandler {

    /**
     * Instantiates a new resume handler.
     */
    public ResumeHandler() {
        super(EngineControl.RESUME);
    }

    /**
     * @return
     * @see org.eclipse.amp.axf.ide.handlers.ModelRunHandler#isEnabled()
     */
    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return super.isEnabled() && getRunner().isPaused();
    }
}
