/**
 * <copyright>
 *
 * Copyright (c) 2010 Metascape, LLC.
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

package org.eclipse.amp.agf.chart.ide;

import org.eclipse.amp.agf.chart.ChartEditPart;
import org.eclipse.amp.agf.chart.ChartViewPart;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;

/**
 * 
 * @author mparker
 *
 */
public abstract class ChartAction implements IViewActionDelegate {

    protected ChartViewPart viewPart;

    /**
     * 
     */
    public ChartAction() {
        super();
    }

    /**
     *
     * @see org.eclipse.ui.IViewActionDelegate#init(org.eclipse.ui.IViewPart)
     */
    public void init(IViewPart view) {
        viewPart = (ChartViewPart) view;
    }

    /**
     *
     * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
     */
    public void selectionChanged(IAction action, ISelection selection) {
    }


    public ChartEditPart getEditor() {
        return (ChartEditPart) viewPart.getEditPart();
    }

    /**
     * @param action
     * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
     */
    public abstract void run(IAction action);
}