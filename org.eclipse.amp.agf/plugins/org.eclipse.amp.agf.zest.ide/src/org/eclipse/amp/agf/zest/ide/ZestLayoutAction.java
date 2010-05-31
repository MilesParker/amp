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
package org.eclipse.amp.agf.zest.ide;

import org.eclipse.amp.agf.zest.GraphViewPart;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.zest.layouts.LayoutAlgorithm;

// TODO: Auto-generated Javadoc
/**
 * The Class ZestLayoutAction.
 */
public abstract class ZestLayoutAction implements IViewActionDelegate {

    protected GraphViewPart view;

    /**
     * @param view
     * @see org.eclipse.ui.IViewActionDelegate#init(org.eclipse.ui.IViewPart)
     */
    public void init(IViewPart view) {
        this.view = (GraphViewPart) view;
    }

    /**
     * @param action
     * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
     */
    public void run(IAction action) {
        view.getViewSite().getShell().getDisplay().asyncExec(new Runnable() {
            public void run() {
                view.setLayoutAlgorithm(createLayout());
            }
        });
    }

    /**
     * @param action
     * @param selection
     * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
     */
    public void selectionChanged(IAction action, ISelection selection) {
    }

    /**
     * Creates the layout.
     * 
     * @return the layout algorithm
     */
    protected abstract LayoutAlgorithm createLayout();
}
