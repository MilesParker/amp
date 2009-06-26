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
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.HandlerEvent;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPart;

// TODO: Auto-generated Javadoc
/**
 * The Class ModelRunHandler.
 */
public abstract class ModelRunHandler extends AbstractHandler implements ILifeCycleListener, IModelWorkbenchListener {


    private IModel model;

    private EngineControl control;

    private IStateListener delegate;

    /**
     * Instantiates a new model run handler.
     * 
     * @param control the control
     */
    public ModelRunHandler(EngineControl control) {
        this.control = control;
        delegate = new LifecycleObservationAdapter(this);
    }

    /**
     * @param event
     * @return
     * @throws ExecutionException
     * @see org.eclipse.core.commands.AbstractHandler#execute(org.eclipse.core.commands.ExecutionEvent)
     */
    public Object execute(ExecutionEvent event) throws ExecutionException {
        getRunner().control(control);
        AXFWorkbenchPlugin.getDefault().getManager().getHandlers().notifyHandlers();
        return null;
    }

    /**
     * Gets the runner.
     * 
     * @return the runner
     */
    public IEngine getRunner() {
        return model != null ? model.getEngine() : null;
    }

    /**
     * @return
     * @see org.eclipse.core.commands.AbstractHandler#isEnabled()
     */
    public boolean isEnabled() {
        return getRunner() != null && !getRunner().isCloseRequested();
    }

    /**
     * Notify change.
     */
    public void notifyChange() {
        // its possible we've already left workbench
        if (AXFWorkbenchPlugin.getDefault() != null) {
            IWorkbench workbench = AXFWorkbenchPlugin.getDefault().getWorkbench();
            if (model != null && workbench.getDisplay() != null && !workbench.getDisplay().isDisposed()) {
                workbench.getDisplay().asyncExec(new Runnable() {
                    public void run() {
                        fireHandlerChanged(new HandlerEvent(ModelRunHandler.this, true, false));
                    }
                });
            }
        }
    }

    public synchronized void observing(IObservationProvider model) {
        this.model = (IModel) model;
    }

    public synchronized void observationEnd(IObservationProvider model) {
        this.model = null;
    }

    public void stateChange(Object key, Object updated) {
        delegate.stateChange(key, updated);
        notifyChange();
    }

    public synchronized void modelActivated(IObservationProvider model) {
        this.model = (IModel) model;
        notifyChange();
    }

    public void modelAdded(IObservationProvider model) {
    }

    public void modelRemoved(IObservationProvider model) {
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
