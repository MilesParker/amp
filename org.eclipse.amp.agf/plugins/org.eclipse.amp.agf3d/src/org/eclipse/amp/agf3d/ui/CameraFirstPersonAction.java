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
package org.eclipse.amp.agf3d.ui;

import org.eclipse.amp.agf3d.GEF3DViewPart;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

// TODO: Auto-generated Javadoc
/**
 * The Class ZoomFitAction.
 */
public class CameraFirstPersonAction implements IViewActionDelegate {

    GEF3DViewPart view;

    /**
     * @param view
     * @see org.eclipse.ui.IViewActionDelegate#init(org.eclipse.ui.IViewPart)
     */
    public void init(IViewPart view) {
        this.view = (GEF3DViewPart) view;
    }

    /**
     * @param action
     * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
     */
    public void run(IAction action) {
        //        getZoomer().setZoomLevelContributions(Collections.singletonList(getZoomContribution()));
        //        getZoomer().setZoomLevels(GEFModelViewPart.ZOOM_LEVELS);
        view.moveCameraFirstPerson();
    }

    /**
     * @param action
     * @param selection
     * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction,
     *      org.eclipse.jface.viewers.ISelection)
     */
    public void selectionChanged(IAction action, ISelection selection) {
    }
}
