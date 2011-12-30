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

import org.eclipse.amp.axf.core.IEngine;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.ide.IModelWorkbenchListener;
import org.eclipse.amp.axf.ide.ModelViewManager;
import org.eclipse.amp.axf.time.TimeGranularity;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.menus.WorkbenchWindowControlContribution;

/**
 * 
 * @author mparker
 * @author jonas.ruettimann
 */
public class ScaleGranularityControl extends WorkbenchWindowControlContribution implements IModelWorkbenchListener {

	IEngine engine;

	Scale scale;

	private static int SCALE_MID = 50;

	private static int SCALE_MAX = 110;

	// Around the center area we want to have scale snap to middle.
	private static int CENTER_RANGE = 5;

	@Override
	protected Control createControl(Composite parent) {
		scale = new Scale(parent, SWT.HORIZONTAL);
		scale.setMaximum(SCALE_MAX);
		scale.setSelection(SCALE_MID);
		scale.addSelectionListener(new SelectionListener() {

			public void widgetSelected(SelectionEvent e) {
				scaleToEngineGranularity();
			}

			public void widgetDefaultSelected(SelectionEvent e) {
			}
		});

		ModelViewManager.getInstance().getManagerListeners().addModelManagerListener(ScaleGranularityControl.this);
		return scale;
	}

	void scaleToEngineGranularity() {
		TimeGranularity newGranularity = null;

		if (Math.abs(scale.getSelection() - SCALE_MID) > CENTER_RANGE) {
			if (scale.getSelection() == scale.getMaximum()) {
				newGranularity = TimeGranularity.createFrequencyGranularity(Integer.MAX_VALUE);
			} else if (scale.getSelection() > SCALE_MID) {
				newGranularity = TimeGranularity
						.createFrequencyGranularity((scale.getSelection() - SCALE_MID - CENTER_RANGE) * 2);
			} else {
				if (scale.getSelection() > 0) {
					newGranularity = TimeGranularity.createDelayGranularity((SCALE_MID - scale.getSelection()) * 50);
				}
			}

		} else {
			if (scale.getSelection() != SCALE_MID) {
				// recursive call w/o blocking
				setScaleSelection(SCALE_MID);
			} else {
				newGranularity = TimeGranularity.DEFAULT_GRANULARITY;
			}
		}

		if (newGranularity != null && engine != null) {
			engine.setUpdateGranularity(newGranularity);
		}
	}

	/**
     * 
     */
	private void engineGranularityToScale() {
		if (engine.getUpdateGranularity() instanceof TimeGranularity) {
			TimeGranularity granularity = (TimeGranularity) engine.getUpdateGranularity();
			if (granularity.getUpdateDelay() > 0) {
				setScaleSelection((int) (granularity.getUpdateDelay() / 50));
			} else if (granularity.getUpdateFrequency() > 1) {
				setScaleSelection((granularity.getUpdateFrequency() / 2 + SCALE_MID));
			} else {
				setScaleSelection(SCALE_MID);
			}
		}
	}

	protected void setScaleSelection(final int value) {
		Display.getDefault().asyncExec(new Runnable() {

			public void run() {
				if (scale != null && !scale.isDisposed()) {
					scale.setSelection(value);
				}
			}
		});
	}

	/**
	 * @param model
	 * @see org.eclipse.amp.axf.ide.IModelWorkbenchListener#modelActivated(IModel)
	 */
	public void modelActivated(IModel model) {
		if (model != null) {
			Display.getDefault().asyncExec(new Runnable() {

				public void run() {
					if (scale != null && !scale.isDisposed()) {
						scale.setEnabled(true);
					}
				}
			});
			engine = model.getEngine();
			engineGranularityToScale();
		} else {
			engine = null;
			Display.getDefault().asyncExec(new Runnable() {

				public void run() {
					if (scale != null && !scale.isDisposed()) {
						scale.setEnabled(false);
					}
				}
			});
		}

	}

	/**
	 * @param model
	 * @see org.eclipse.amp.axf.ide.IModelWorkbenchListener#modelAdded(IModel)
	 */
	public void modelAdded(IModel model) {
	}

	/**
	 * @param model
	 * @see org.eclipse.amp.axf.ide.IModelWorkbenchListener#modelRemoved(IModel)
	 */
	public void modelRemoved(IModel model) {
	}

	/**
	 * @param part
	 * @see org.eclipse.amp.axf.ide.IModelWorkbenchListener#viewActivated(org.eclipse.ui.IWorkbenchPart)
	 */
	public void viewActivated(IWorkbenchPart part) {
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
	}
}
