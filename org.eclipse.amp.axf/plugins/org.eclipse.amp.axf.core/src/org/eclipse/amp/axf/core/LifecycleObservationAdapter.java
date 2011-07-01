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
 * The Class LifecycleObservationAdapter.
 */
public class LifecycleObservationAdapter implements IStateListener {

	ILifeCycleListener lifeCycleListener;

	/**
	 * Instantiates a new lifecycle observation adapter.
	 * 
	 * @param lifeCycleListener
	 *          the life cycle listener
	 */
	public LifecycleObservationAdapter(ILifeCycleListener lifeCycleListener) {
		super();
		this.lifeCycleListener = lifeCycleListener;
	}

	/**
	 * @param notifyType
	 * @param observed
	 * @see org.eclipse.amp.axf.core.IStateListener#stateChange(java.lang.Object,
	 *      java.lang.Object)
	 */
	public void stateChange(Object notifyType, Object observed) {
		if (notifyType instanceof LifeCycleState && observed instanceof IObservationProvider) {
			IObservationProvider provider = (IObservationProvider) observed;
			switch ((LifeCycleState) notifyType) {
				case OBSERVED:
					lifeCycleListener.observing(provider);
					return;
				case CREATE:
					lifeCycleListener.observeCreate(provider);
					return;
				case INITIALIZE:
					lifeCycleListener.observeInitialize(provider);
					return;
				case START:
					lifeCycleListener.observeStart(provider);
					return;
				case UPDATE:
					lifeCycleListener.observeUpdate(provider);
					return;
				case STOP:
					lifeCycleListener.observeStop(provider);
					return;
				case END:
					lifeCycleListener.observationEnd(provider);
					return;
				case ENDING:
					lifeCycleListener.observationEnding(provider);
					return;
			}
		}
	}

}
