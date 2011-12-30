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

public class ScapeWrapperModel implements IModel {

	Collection<ILifeCycleListener> listeners = new ArrayList<ILifeCycleListener>();

	Map<ILifeCycleListener, ModelWrapperScapeListener> wrapperForListener = new HashMap<ILifeCycleListener, ModelWrapperScapeListener>();

	private Scape scape;

	private boolean closed;

	/**
	 * Instantiates a new scape wrapper model.
	 * 
	 * @param scape
	 *          the scape
	 */
	public ScapeWrapperModel(Scape scape) {
		super();
		this.scape = scape;
	}

	public String getName() {
		return scape.getName();
	}

	public int getPeriod() {
		return scape.getPeriod();
	}

	public IEngine getEngine() {
		return (IEngine) scape.getRunner();
	}

	public Object getRoot() {
		return getScape();
	}

	public int getStopPeriod() {
		return scape.getStopPeriod();
	}

	public String getTimeDescription() {
		return scape.getPeriodDescription();
	}

	public void addModelListener(final ILifeCycleListener listener) {
		new Thread() {
			@Override
			public void run() {
				listeners.add(listener);
				if (!(listener instanceof ScapeWrapperModelListener)) {
					ModelWrapperScapeListener wrapper = new ModelWrapperScapeListener(ScapeWrapperModel.this, getScape(), listener);
					getScape().addView(wrapper);
					wrapperForListener.put(listener, wrapper);
				}
			}
		}.start();
	}

	public Collection<ILifeCycleListener> getModelListeners() {
		return listeners;
	}

	public void removeModelListener(final ILifeCycleListener listener) {
		new Thread() {
			@Override
			public void run() {
				listeners.remove(listener);
				if (listener instanceof ScapeWrapperModelListener) {
					getScape().removeScapeListener(((ScapeWrapperModelListener) listener).getWrapped());
				}
				listener.observationEnd(ScapeWrapperModel.this);
			}
		}.start();
	}

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

	public boolean isActive() {
		return getScape().isRunning();
	}

	public boolean isCreated() {
		return getScape().isRunning();
	}

	public boolean isEnded() {
		return closed;
	}

	public boolean isEnding() {
		return getScape().getRunner().isCloseRequested();
	}

	public boolean isRunning() {
		return getScape().isInitialized() && getScape().isRunning();
	}

	public boolean isPaused() {
		return getScape().isInitialized() && getScape().isPaused();
	}

	public boolean isStopped() {
		return !getScape().getRunner().isRunning() && !isEnded();
	}

	/**
	 * @param closed
	 *          the closed to set
	 */
	public void setClosed(boolean closed) {
		this.closed = closed;
	}
}
