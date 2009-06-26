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
package org.eclipse.amp.agf.ide;

import org.eclipse.jface.action.IAction;

// TODO: Auto-generated Javadoc
/**
 * The Class ZoomFreeAction.
 */
public class ZoomFreeAction extends ZoomFitAction {

    /**
     * @param action
     * @see org.eclipse.amp.agf.ide.ZoomFitAction#run(org.eclipse.jface.action.IAction)
     */
    public void run(IAction action) {
        view.setZoomFit("");
    }

    /**
     * @return
     * @see org.eclipse.amp.agf.ide.ZoomFitAction#getZoomContribution()
     */
    @Override
    protected String getZoomContribution() {
        return null;
    }
}
