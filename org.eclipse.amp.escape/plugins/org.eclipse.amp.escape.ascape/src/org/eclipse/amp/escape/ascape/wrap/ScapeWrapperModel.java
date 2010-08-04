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
package org.eclipse.amp.escape.ascape.wrap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.ascape.model.Scape;
import org.eclipse.amp.axf.core.IEngine;
import org.eclipse.amp.axf.core.ILifeCycleListener;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.jface.viewers.ILabelProviderListener;



// TODO: Auto-generated Javadoc
/**
 * The Class ScapeWrapperModel.
 */
public class ScapeWrapperModel implements IModel {

    Scape scape;

    IModel model;

    EditPartFactory factory;

    EditPartFactory treeFactory;

    Collection<ILifeCycleListener> listeners = new ArrayList<ILifeCycleListener>();

    Map<ILifeCycleListener, ModelWrapperScapeListener> wrapperForListener = new HashMap<ILifeCycleListener, ModelWrapperScapeListener>();

    boolean closed;

    /**
     * Instantiates a new scape wrapper model.
     * 
     * @param scape the scape
     */
    public ScapeWrapperModel(Scape scape) {
        super();
        this.scape = scape;
        if (!scape.isRoot()) {
            model = new ScapeWrapperModel(scape.getRoot());
        } else {
            model = this;
        }
    }

    /**
     * @return
     * @see org.eclipse.amp.axf.core.IModel#getName()
     */
    public String getName() {
        return scape.getName();
    }

    /**
     * @return
     * @see org.eclipse.amp.axf.core.IModel#getPeriod()
     */
    public int getPeriod() {
        return scape.getPeriod();
    }

    /**
     * @return
     * @see org.eclipse.amp.axf.core.IModel#getEngine()
     */
    public IEngine getEngine() {
        return (IEngine) scape.getRunner();
    }

    /**
     * @return
     * @see org.eclipse.amp.axf.core.IModel#getRoot()
     */
    public Object getRoot() {
        return getScape();
    }

    /**
     * @return
     * @see org.eclipse.amp.axf.core.IModel#getStopPeriod()
     */
    public int getStopPeriod() {
        return scape.getStopPeriod();
    }

    /**
     * @return
     * @see org.eclipse.amp.axf.core.IModel#getTimeDescription()
     */
    public String getTimeDescription() {
        return scape.getPeriodDescription();
    }

    /**
     * @param listener
     * @see org.eclipse.amp.axf.core.IObservationProvider#addModelListener(org.eclipse.amp.axf.core.ILifeCycleListener)
     */
    public void addModelListener(final ILifeCycleListener listener) {
        new Thread() {
            public void run() {
                listeners.add(listener);
                if (!(listener instanceof ScapeWrapperModelListener)) {
                    ModelWrapperScapeListener wrapper = new ModelWrapperScapeListener(ScapeWrapperModel.this, scape,
                                                                                      listener);
                    scape.addView(wrapper);
                    wrapperForListener.put(listener, wrapper);
                }
            };
        }.start();
    }

    /**
     * @return
     * @see org.eclipse.amp.axf.core.IObservationProvider#getModelListeners()
     */
    public Collection<ILifeCycleListener> getModelListeners() {
        return listeners;
    }

    /**
     * @param listener
     * @see org.eclipse.amp.axf.core.IObservationProvider#removeModelListener(org.eclipse.amp.axf.core.ILifeCycleListener)
     */
    public void removeModelListener(final ILifeCycleListener listener) {
        new Thread() {
            public void run() {
                listeners.remove(listener);
                if (listener instanceof ScapeWrapperModelListener) {
                    scape.removeScapeListener(((ScapeWrapperModelListener) listener).getWrapped());
                }
                // ModelWrapperScapeListener wrapper = wrapperForListener.get(listener);
                // if (wrapper != null) {
                // scape.removeScapeListener(wrapper);
                // }
                listener.observationEnd(ScapeWrapperModel.this);
            }
        }.start();
    }

    /**
     * @return
     * @see org.eclipse.amp.axf.core.IObservationProvider#isInitialized()
     */
    public boolean isInitialized() {
        return scape.isInitialized();
    }

    /**
     * Gets the scape.
     * 
     * @return the scape
     */
    public Scape getScape() {
        return scape;
    }

    /**
     * Gets the text.
     * 
     * @param element the element
     * 
     * @return the text
     */
    public String getText(Object element) {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * Adds the listener.
     * 
     * @param listener the listener
     */
    public void addListener(ILabelProviderListener listener) {
        // TODO Auto-generated method stub

    }

    /**
     * Dispose.
     */
    public void dispose() {
        // TODO Auto-generated method stub

    }

    /**
     * Checks if is label property.
     * 
     * @param element the element
     * @param property the property
     * 
     * @return true, if is label property
     */
    public boolean isLabelProperty(Object element, String property) {
        // TODO Auto-generated method stub
        return false;
    }

    /**
     * Removes the listener.
     * 
     * @param listener the listener
     */
    public void removeListener(ILabelProviderListener listener) {
        // TODO Auto-generated method stub

    }

    /**
     * @return
     * @see org.eclipse.amp.axf.core.IObservationProvider#isActive()
     */
    public boolean isActive() {
        return getScape().isRunning();
    }

    /**
     * @return
     * @see org.eclipse.amp.axf.core.IObservationProvider#isCreated()
     */
    public boolean isCreated() {
        return getScape().isRunning();
    }

    /**
     * @return
     * @see org.eclipse.amp.axf.core.IObservationProvider#isEnded()
     */
    public boolean isEnded() {
        return closed;
    }

    /**
     * @return
     * @see org.eclipse.amp.axf.core.IObservationProvider#isEnding()
     */
    public boolean isEnding() {
        return getScape().getRunner().isCloseRequested();
    }

    /**
     * @return
     * @see org.eclipse.amp.axf.core.IObservationProvider#isStarted()
     */
    public boolean isStarted() {
        return getScape().isInitialized() && getScape().isRunning();
    }

    /**
     * @return
     * @see org.eclipse.amp.axf.core.IObservationProvider#isStopped()
     */
    public boolean isStopped() {
        return !getScape().getRunner().isRunning() && !isEnded();
    }

    /**
     * @param closed the closed to set
     */
    public void setClosed(boolean closed) {
        this.closed = closed;
    }
}
