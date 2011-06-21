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
import org.eclipse.amp.axf.ide.ModelViewManager;
import org.eclipse.amp.axf.time.ITimeGranularity;
import org.eclipse.amp.axf.view.SWTAsyncModelListener;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPart;

/**
 * The Class StatusLineView.
 */
public class StatusLineView extends SWTAsyncModelListener implements IPartListener {

	IViewPart part;

	// There should only be one status line view at a time..
	private static StatusLineView view;

	/**
	 * Instantiates a new status line view.
	 */
	private StatusLineView() {
		super(null, "Status Line View", 2500);
		setWaitForUpdate(false);
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

	@Override
	public void update(IModel model) {
		if (model == ModelViewManager.getInstance().getActiveModel()) {
			String msg = model.getName();
			msg += " " + model.getTimeDescription();
			if (model.getEngine().isPaused()) {
				msg += " [PAUSED]";
			} else {
				ITimeGranularity updateGranularity = model.getEngine().getUpdateGranularity();
				if (!updateGranularity.toString().equals("1")) {
					msg += " [" + updateGranularity + "]";
				}
			}
			updateMessage(msg);
		}
	}

	private void updateMessage(final String msg) {
		if (part != null) {
			IViewSite site = (IViewSite) part.getSite();
			IActionBars actionBars = site.getActionBars();
			actionBars.getStatusLineManager().setMessage(msg);
			actionBars.updateActionBars();
		}
	}

	/**
	 * Sets the part.
	 * 
	 * @param part
	 *          the new part
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
	 * @param part
	 * @see org.eclipse.ui.IPartListener#partActivated(org.eclipse.ui.IWorkbenchPart)
	 */
	public void partActivated(IWorkbenchPart part) {
		assignPart(part);
	}

	/**
	 * @param part
	 * @see org.eclipse.ui.IPartListener#partBroughtToTop(org.eclipse.ui.IWorkbenchPart)
	 */
	public void partBroughtToTop(IWorkbenchPart part) {
		assignPart(part);
	}

	private void assignPart(IWorkbenchPart part) {
		if (part instanceof IViewPart) {
			this.part = (IViewPart) part;
		} else {
			this.part = null;
		}
	}

	/**
	 * @param part
	 * @see org.eclipse.ui.IPartListener#partClosed(org.eclipse.ui.IWorkbenchPart)
	 */
	public void partClosed(IWorkbenchPart part) {
		if (part == this.part) {
			this.part = null;
		}
	}

	/**
	 * @param part
	 * @see org.eclipse.ui.IPartListener#partDeactivated(org.eclipse.ui.IWorkbenchPart)
	 */
	public void partDeactivated(IWorkbenchPart part) {
	}

	/**
	 * @param part
	 * @see org.eclipse.ui.IPartListener#partOpened(org.eclipse.ui.IWorkbenchPart)
	 */
	public void partOpened(IWorkbenchPart part) {
	}

	public static StatusLineView getDefault() {
		if (view == null) {
			view = new StatusLineView();
		}
		return view;
	}
}
