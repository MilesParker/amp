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
package org.eclipse.amp.axf.view;

import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.core.LifeCycleState;
import org.eclipse.amp.axf.time.TimeGranularity;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;

// TODO: Auto-generated Javadoc
/**
 * The listener interface for receiving SWTAsyncModel events. The class that is interested in processing a SWTAsyncModel
 * event implements this interface, and the object created with that class is registered with a component using the
 * component's <code>addSWTAsyncModelListener<code> method. When
 * the SWTAsyncModel event occurs, that object's appropriate
 * method is invoked.
 * 
 * @see SWTAsyncModelEvent
 */
public abstract class SWTAsyncModelListener extends SWTThreadModelListener {

    private final class ReportingRunner implements Runnable {
        private final LifeCycleState key;
        private final IModel model;
        Exception t;

        public ReportingRunner(LifeCycleState key, IModel model) {
            this.key = key;
            this.model = model;
        }

        public void run() {
            try {
                doUpdate(key, model);
            } catch (Exception e) {
                t = e;
            } finally {
                updating = false;
                if (t != null) {
                    painting = false;
                    t.printStackTrace();
                    throw new RuntimeException("Problem in view updating for " + getName(), t);
                }
            }
        }
    }

    private boolean waitForPaint = true;

    private long minTimeBetweenUpdates = 10000;

    protected boolean updating = false;

    private boolean painting = false;

    private long lastUpdate;

    /**
     * Instantiates a new sWT async model listener.
     * 
     * @param widget the widget
     * @param name the name
     */
    public SWTAsyncModelListener(Control widget, String name) {
        super(widget, name);
    }

    /**
     * Instantiates a new sWT async model listener.
     * 
     * @param widget the widget
     * @param name the name
     * @param updatePeriod the update period
     */
    public SWTAsyncModelListener(Control widget, String name, long updatePeriod) {
        super(widget, name);
        this.minTimeBetweenUpdates = updatePeriod;
    }

    /**
     * @param key
     * @param observed
     * @see org.eclipse.amp.axf.core.AbstractLifecycleListener#stateChange(java.lang.Object, java.lang.Object)
     */
    @Override
    public void stateChange(Object key, Object observed) {
        IModel model = (IModel) observed;
        if (model.getEngine().isRunning()
                && (System.currentTimeMillis() > lastUpdate + minTimeBetweenUpdates || model.getPeriod()
                        % ((TimeGranularity) model.getEngine().getUpdateGranularity()).getUpdateFrequency() == 0)) {
            lastUpdate = System.currentTimeMillis();
            updating = true;
            ReportingRunner runnable = new ReportingRunner((LifeCycleState) key, model);
            if (AXFViewPlugin.getDefault() != null) {
                Display display = AXFViewPlugin.getDefault().getWorkbench().getDisplay();
                if (!display.isDisposed()) {
                    display.asyncExec(runnable);
                    while ((updating || painting) && isWaitForUpdate()
                            && (getWidget() == null || !getWidget().isDisposed())) {
                        try {
                            // Assume best case of 60fps + allow compute
                            Thread.sleep(5);
                        } catch (InterruptedException e) {
                        }
                    }
                }
            }
            if (runnable.t != null) {
                runnable.t.printStackTrace();
            }
        } else if (key == LifeCycleState.OBSERVED || key == LifeCycleState.END) {
            SWTAsyncModelListener.super.stateChange(key, model);
        }
        // Even though model is not null on method entrance (state change), it could become null during execution of
        // reporting runner
        if (model != null) {
            forceModelNotify(model);
        }
    }

    private void doUpdate(Object key, final IModel model) {
        // Have to check visibility within UI thread
        if (getWidget() == null || !getWidget().isDisposed() && getWidget().isVisible()) {
            update(model);
            getListener().stateChange(key, model);
        }
        // If the update method hasn't explicitly indicated beginPainting, we are not waiting for the
        // actual update or it has already occurred.
        if (!painting) {
        }
    }

    /**
     * Force model notify.
     * 
     * @param model the model
     */
    public void forceModelNotify(IModel model) {
        model.getEngine().observationComplete(this);
    }

    /**
     * Begin painting.
     */
    public void beginPainting() {
        this.painting = true;
    }

    /**
     * End painting.
     */
    public void endPainting() {
        this.painting = false;
    }

    /**
     * Sets the wait for paint.
     * 
     * @param waitForPaint the new wait for paint
     */
    public void setWaitForUpdate(boolean waitForPaint) {
        this.waitForPaint = waitForPaint;
    }

    /**
     * Checks if is wait for paint.
     * 
     * @return true, if is wait for paint
     */
    public boolean isWaitForUpdate() {
        return waitForPaint;
    }
}
