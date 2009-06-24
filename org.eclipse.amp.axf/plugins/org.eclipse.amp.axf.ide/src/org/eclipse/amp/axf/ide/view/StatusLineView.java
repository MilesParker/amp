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
package org.eclipse.amp.axf.ide.view;

import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.core.IObservationProvider;
import org.eclipse.amp.axf.ide.IModelWorkbenchListener;
import org.eclipse.amp.axf.view.SWTAsyncModelListener;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;

// TODO: Auto-generated Javadoc
/**
 * The Class StatusLineView.
 */
public class StatusLineView extends SWTAsyncModelListener implements IModelWorkbenchListener {

    IViewPart part;

    /**
     * Instantiates a new status line view.
     */
    public StatusLineView() {
        super(null, "Status Line View", 100);
    }

    /**
     * @param model
     * @see org.eclipse.amp.axf.core.AbstractLifecycleListener#observeStart(org.eclipse.amp.axf.core.IObservationProvider)
     */
    public void observeStart(IObservationProvider model) {
        updateMessage("Started");
    }

    /**
     * @param model
     * @see org.eclipse.amp.axf.core.AbstractLifecycleListener#observeStop(org.eclipse.amp.axf.core.IObservationProvider)
     */
    public void observeStop(IObservationProvider model) {
        updateMessage("Stopped");
    }

    /**
     * @param model
     * @see org.eclipse.amp.axf.view.SWTThreadModelListener#update(org.eclipse.amp.axf.core.IModel)
     */
    public void update(IModel model) {
        // IViewPart viewPart = (IViewPart) part.getAdapter(IViewPart.class);

        String msg = model.getName();
        msg += " " + model.getTimeDescription();
        if (model.getEngine().isPaused()) {
            msg += " [PAUSED]";
        } else {
            msg += " " + model.getEngine().getUpdateGranularity();
        }
        updateMessage(msg);
    }

    private void updateMessage(String msg) {
        if (part instanceof IViewPart) {
            IViewSite site = (IViewSite) part.getSite();
            IActionBars actionBars = site.getActionBars();
            actionBars.getStatusLineManager().setMessage(msg);
            actionBars.updateActionBars();
        }
    }

    /**
     * Sets the part.
     * 
     * @param part the new part
     */
    public void setPart(IViewPart part) {
        this.part = part;
    }

    /**
     * Gets the part.
     * 
     * @return the part
     */
    public IViewPart getPart() {
        return part;
    }

    /**
     * @param model
     * @see org.eclipse.amp.axf.ide.IModelWorkbenchListener#modelActivated(org.eclipse.amp.axf.core.IObservationProvider)
     */
    public void modelActivated(IObservationProvider model) {
    }

    /**
     * @param model
     * @see org.eclipse.amp.axf.ide.IModelWorkbenchListener#modelAdded(org.eclipse.amp.axf.core.IObservationProvider)
     */
    public void modelAdded(IObservationProvider model) {
    }

    /**
     * @param model
     * @see org.eclipse.amp.axf.ide.IModelWorkbenchListener#modelRemoved(org.eclipse.amp.axf.core.IObservationProvider)
     */
    public void modelRemoved(IObservationProvider model) {
    }

    /**
     * @param part
     * @see org.eclipse.amp.axf.ide.IModelWorkbenchListener#viewActivated(org.eclipse.ui.IWorkbenchPart)
     */
    public void viewActivated(IWorkbenchPart part) {
        if (part instanceof IViewPart) {
            this.part = (IViewPart) part;
        } else {
            this.part = null;
        }
    }

    /**
     * @param part
     * @see org.eclipse.amp.axf.ide.IModelWorkbenchListener#viewAdded(org.eclipse.ui.IWorkbenchPart)
     */
    public void viewAdded(IWorkbenchPart part) {
    }

    /**
     * @param part
     * @see org.eclipse.amp.axf.ide.IModelWorkbenchListener#viewRemoved(org.eclipse.ui.IWorkbenchPart)
     */
    public void viewRemoved(IWorkbenchPart part) {
        if (part == this.part) {
            this.part = null;
        }
    }
}
