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
package org.eclipse.amp.axf.core;

/**
 * The listener interface for receiving abstractModel events. The class that is
 * interested in processing a abstractModel event implements this interface, and
 * the object created with that class is registered with a component using the
 * component's <code>addAbstractModelListener<code> method. When
 * the abstractModel event occurs, that object's appropriate
 * method is invoked.
 * 
 * @see AbstractModelEvent
 */
public class AbstractLifecycleListener implements ILifeCycleListener {

	private String name;

	private IStateListener listener;

	/**
	 * Instantiates a new abstract model listener.
	 */
	public AbstractLifecycleListener() {
		listener = new LifecycleObservationAdapter(this);
	}

	/**
	 * Instantiates a new abstract model listener.
	 * 
	 * @param name
	 *          the name
	 */
	public AbstractLifecycleListener(String name) {
		this();
		this.name = name;
	}

	/**
	 * @param observed
	 * @see org.eclipse.amp.axf.core.ILifeCycleListener#observationEnd(org.eclipse.amp.axf.core.IObservationProvider)
	 */
	public void observationEnd(IObservationProvider observed) {
	}

	/**
	 * @param observed
	 * @see org.eclipse.amp.axf.core.ILifeCycleListener#observationEnding(org.eclipse.amp.axf.core.IObservationProvider)
	 */
	public void observationEnding(IObservationProvider observed) {
	}

	/**
	 * @param observed
	 * @see org.eclipse.amp.axf.core.ILifeCycleListener#observeCreate(org.eclipse.amp.axf.core.IObservationProvider)
	 */
	public void observeCreate(IObservationProvider observed) {
	}

	/**
	 * @param observed
	 * @see org.eclipse.amp.axf.core.ILifeCycleListener#observeInitialize(org.eclipse.amp.axf.core.IObservationProvider)
	 */
	public void observeInitialize(IObservationProvider observed) {
	}

	/**
	 * @param observed
	 * @see org.eclipse.amp.axf.core.ILifeCycleListener#observeStart(org.eclipse.amp.axf.core.IObservationProvider)
	 */
	public void observeStart(IObservationProvider observed) {
	}

	/**
	 * @param observed
	 * @see org.eclipse.amp.axf.core.ILifeCycleListener#observeStop(org.eclipse.amp.axf.core.IObservationProvider)
	 */
	public void observeStop(IObservationProvider observed) {
	}

	/**
	 * @param observed
	 * @see org.eclipse.amp.axf.core.ILifeCycleListener#observeUpdate(org.eclipse.amp.axf.core.IObservationProvider)
	 */
	public void observeUpdate(IObservationProvider observed) {
	}

	/**
	 * @param observed
	 * @see org.eclipse.amp.axf.core.ILifeCycleListener#observing(org.eclipse.amp.axf.core.IObservationProvider)
	 */
	public void observing(IObservationProvider observed) {
	}

	/**
	 * @param key
	 * @param updated
	 * @see org.eclipse.amp.axf.core.IStateListener#stateChange(java.lang.Object,
	 *      java.lang.Object)
	 */
	public void stateChange(Object key, Object updated) {
		listener.stateChange(key, updated);
	}

	/**
	 * @return the listener
	 */
	public IStateListener getListener() {
		return listener;
	}

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 * 
	 * @param name
	 *          the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
