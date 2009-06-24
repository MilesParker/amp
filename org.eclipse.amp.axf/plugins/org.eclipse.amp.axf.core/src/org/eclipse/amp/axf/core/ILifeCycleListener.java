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

// TODO: Auto-generated Javadoc
/**
 * An observer (listener) for any model component. For performance reasons, observers typically monitor the overall
 * model, but they might also observe other model components such as sub-models or even individual agents.
 * 
 * @author milesparker
 */
public interface ILifeCycleListener extends IStateListener {

    /**
     * Notifies that the model is now aware of this observer. Note that models may defer addition of listeners so a
     * listener adding itself to a model should not assume that it has actually been added until this notification has
     * occurred.
     * 
     * @param observed the observed
     */
    public void observing(IObservationProvider observed);


    /**
     * Notifies that the model has been instantiated but has not yet been initialized. At this point it is appropriate
     * to update settings and parameterizations.
     * 
     * @param observed the model event
     */
    public void observeCreate(IObservationProvider observed);

    /**
     * Notifies that the model's initial state has been reached.
     * 
     * @param observed the observed
     */
    public void observeInitialize(IObservationProvider observed);

    /**
     * Notifies that the model is just starting execution.
     * 
     * @param observed the model event
     */
    public void observeStart(IObservationProvider observed);

    /**
     * Notifies that the model has completed one period of execution at the appropriate level of granularity. Currently
     * this is always once every period but that will change when more control of update granularity is introduced.
     * 
     * @param observed the model event
     */
    public void observeUpdate(IObservationProvider observed);

    /**
     * Notifies that the model has stopped execution. This does not imply that the model is dead, simply that it will no
     * longer be executing within the context of the life-cycle. In particular, a model may be re-initialized and
     * re-started.
     * 
     * @param observed the model event
     */
    public void observeStop(IObservationProvider observed);

    /**
     * Notifies that the model is about to be closed. The model should still be available for observation at this point.
     * 
     * @param observed the model event
     */
    public void observationEnding(IObservationProvider observed);

    /**
     * Notifies that the model is no longer providing observations. Typically it has been disposed at this point.
     * 
     * @param observed the model removed event
     * 
     * @see modelAdded
     */
    public void observationEnd(IObservationProvider observed);

}
