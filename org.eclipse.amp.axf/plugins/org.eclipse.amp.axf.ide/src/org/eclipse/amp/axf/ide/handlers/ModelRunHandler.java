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
import org.eclipse.amp.axf.core.IEngine;
import org.eclipse.amp.axf.core.ILifeCycleListener;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.core.IObservationProvider;
import org.eclipse.amp.axf.core.IStateListener;
import org.eclipse.amp.axf.core.LifecycleObservationAdapter;
import org.eclipse.amp.axf.ide.AXFWorkbenchPlugin;
import org.eclipse.amp.axf.ide.IModelWorkbenchListener;
import org.eclipse.amp.axf.ide.ModelViewManager;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.HandlerEvent;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPart;

/**
 * Super class for all {@link AbstractHandler}s to control the {@link IEngine}
 * execution.
 * 
 * @author jonas.ruettimann
 */
public abstract class ModelRunHandler extends AbstractHandler implements ILifeCycleListener, IModelWorkbenchListener {

	private EngineControl control;

	private IStateListener delegate;

	public ModelRunHandler(EngineControl control) {
		this.control = control;
		delegate = new LifecycleObservationAdapter(this);
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		getRunner().control(control);
		return null;
	}

	protected IEngine getRunner() {
		IModel model = ModelViewManager.getInstance().getActiveModel();
		if (model == null) {
			return null;
		}
		return model.getEngine();
	}

	@Override
	public boolean isEnabled() {
		assert getRunner() != null && !getRunner().isCloseRequested() : "Obviously, this command was declarately enabled not the way it's ment to be.";
		return super.isEnabled();
	}

	public void notifyChange() {
		// its possible we've already left workbench
		if (AXFWorkbenchPlugin.getDefault() != null) {
			IWorkbench workbench = AXFWorkbenchPlugin.getDefault().getWorkbench();
			if (workbench.getDisplay() != null && !workbench.getDisplay().isDisposed()) {
				workbench.getDisplay().asyncExec(new Runnable() {
					public void run() {
						fireChangeEvent();
					}
				});
			}
		}
	}

	protected void fireChangeEvent() {
		fireHandlerChanged(new HandlerEvent(this, true, false));
	}

	public void stateChange(Object key, Object updated) {
		delegate.stateChange(key, updated);
		notifyChange();
	}

	public synchronized void modelActivated(IModel model) {
		notifyChange();
	}

	public synchronized void observing(IObservationProvider model) {
	}

	public synchronized void observationEnd(IObservationProvider model) {
	}

	public void modelAdded(IModel model) {
	}

	public void modelRemoved(IModel model) {
	}

	public void viewActivated(IWorkbenchPart part) {
	}

	public void viewAdded(IWorkbenchPart part) {
	}

	public void viewRemoved(IWorkbenchPart part) {
	}

	public void observationEnding(IObservationProvider observed) {
	}

	public void observeCreate(IObservationProvider observed) {
	}

	public void observeInitialize(IObservationProvider observed) {
	}

	public void observeStart(IObservationProvider observed) {
	}

	public void observeStop(IObservationProvider observed) {
	}

	public void observeUpdate(IObservationProvider observed) {
	}
}
