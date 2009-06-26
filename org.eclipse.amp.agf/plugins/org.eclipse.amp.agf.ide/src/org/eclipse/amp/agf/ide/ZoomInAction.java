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
 * The Class ZoomInAction.
 */
public class ZoomInAction extends ZoomFreeAction {

    /**
     * @param action
     * @see org.eclipse.amp.agf.ide.ZoomFreeAction#run(org.eclipse.jface.action.IAction)
     */
    @Override
    public void run(IAction action) {
        super.run(action);
        getZoomer().zoomIn();
    }

    /**
     * @return
     * @see org.eclipse.amp.agf.ide.ZoomFreeAction#getZoomContribution()
     */
    @Override
    protected String getZoomContribution() {
        return "";
    }

}
