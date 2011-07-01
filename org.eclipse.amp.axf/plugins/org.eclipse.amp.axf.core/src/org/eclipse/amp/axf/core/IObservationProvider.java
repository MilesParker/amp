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
 *   Metascape - Initial API and Development
 *
 * </copyright>
 *
 */
package org.eclipse.amp.axf.core;

/**
 * A model object capable of providing complete independent life-cycle
 * information and change reporting. During the course of its existence as an
 * instantiation within a computational context (i.e. a given vm or distributed
 * system), a model may only transition through the following changes in state:
 * 
 * <pre>
 * [Object creation] -> Created
 * [Object creation] -> Ending, Ended (Typically, a failure creating model)
 * Stopped -> Created
 * Created -> Initialized, Stopped (need not transition through active or initialized)
 * Initialized -> Started, Stopped (need not transition through active)
 * Started -> Active, Stopped (need not transition through active)
 * Active -> Stopped
 * Stopped -> Initialized
 * Stopped -> Created (optional? TBD)
 * Stopped -> Ending
 * Ending -> Ended
 * </pre>
 * 
 * Of course, a model may treat any transition as trivially as desired and so
 * may effectively transition through multiple state changes at once (though any
 * models also implementing ILifecycle notifier must report each of these
 * transitions individually). A given model then should not undergo the
 * following transition at any point:
 * 
 * <pre>
 * Ended -> {Any other state}
 * </pre>
 * 
 * A model can be in multiple states at once; in fact, given the transition
 * rules above, if a model is in one of the following states then they must also
 * be in one of the first set of states and cannot be in any of the following
 * set of states.
 * 
 * <pre>
 * Initialized: {Created} {Stopped, Ended, Ending}
 * Started: {Created, Initialized} {Stopped, Ended, Ending}
 * Active: {Created, Initialized, Started} {Stopped, Ending, Ended}
 * Stopped: {Created, Ending, Ended} {Active, Started}
 * Ending: {Stopped} {Active, Started}
 * Ended: {Created, Initialized} {Active, Started, Ending}
 * </pre>
 * 
 * See individual states for more details.
 */
public interface IObservationProvider {

	/**
	 * Has the model been created? Should return true if observable start time
	 * components have been created. It is up to implementation to define
	 * semantics of when a model is created vs. when it is initialized, but the
	 * following guidelines are recommended to ensure good model repeatability and
	 * performance. To be considered created, a model needs:
	 * 
	 * <pre>
	 * 1. Internally consistent state.
	 * 2. Consistent start state across invocations with same input sets.
	 * 3. Consistent (and ideally, useful and complete!) external state through all supplied providers.
	 * 4. Accurately updated life cycle state.
	 * 5. In general, all basic component structure constructed.
	 * </pre>
	 * 
	 * A good way to think of this state is as having all scaffolding in place. As
	 * outlined in #isInitialized, there should be no calls to random functions
	 * before the model has passed through this state.
	 * 
	 * It is up to the implementation to decide (and seems generally reasonable)
	 * whether to allow a model to be re-created, and clients should generally
	 * handle this situation gracefully.
	 * 
	 * @see isInitialized for important issue re: randomness and repeatability
	 * 
	 * @return true, if the model is created
	 */
	public abstract boolean isCreated();

	/**
	 * Has the model been initialized? Should return true if all time 0 components
	 * have been created and initialized. It is up to implementation to define
	 * semantics of when a model is created vs. when it is initialized, but the
	 * following guidelines are recommended to ensure good model repeatability and
	 * performance. To be considered initialized, a model ideally has:
	 * 
	 * <pre>
	 * 1. All model components necessary for running the model forward have been created and had initial state set.
	 * 2. Model state should be recoverable to initialized state after stopping and (re) starting without passing through created state.
	 * 3. For a given set of inputs, under (2) this state should be be consistent, regardless of whether the model has been newly created or repeatedly returned to initialized state.
	 * </pre>
	 * 
	 * Note a very important consequence of the above guidelines for initialized
	 * state. No random decisions affecting model state should occur before the
	 * model leaves the start state and enters the initializing state as those
	 * decisions would make it impossible to consistently re-enter the same state.
	 * 
	 * @return true, if the model is fully initialized
	 */
	public abstract boolean isInitialized();

	/**
	 * Has the model been stopped? When a model has been stopped, it cannot return
	 * to active state without being (re) started.
	 * 
	 * @return the period
	 */
	boolean isStopped();

	/**
	 * Has the model been started?
	 * 
	 * @return the period
	 */
	boolean isRunning();

	/**
	 * @return true if the model has been set to pause
	 */
	boolean isPaused();

	/**
	 * Is the model currently active? Any model that has been started and has not
	 * stopped is considered active, even if the model is not actively executing
	 * (using CPU cycles or advancing from one state to another.)
	 * 
	 * @return the period
	 */
	boolean isActive();

	/**
	 * Is the model currently in the process of ending itself? This state gives
	 * views a chance to get any final state while the model is still guaranteed
	 * to be available and consistent.
	 * 
	 * @return the period
	 */
	boolean isEnding();

	/**
	 * Has model has ended? In general, a model that has ended can never be (re)
	 * started. It is up to implementations to define whether model state is
	 * consistent and stable following the transition to ended state.
	 * 
	 * @return the period
	 */
	boolean isEnded();
}