package org.eclipse.amp.axf.core;

import org.eclipse.amp.axf.core.EngineStateAdapter.EngineState;

/**
 * This is another concept to propagate state changes from a {@link IEngine}. How does it differ from
 * {@link ILifeCycleListener}? - Well, {@link ILifeCycleListener#stateChange(Object, Object)}s doesn't get called upon
 * pause events. For GUI updates, pause events are central.
 * <p/>
 * Instances of classes that implement this interface can be added to an {@link IEngine} of an {@link IModel} as
 * observers.
 * 
 * @author jonas.ruettimann
 */
public interface IEngineObserver {

	public void engineStateChanged(IEngine engine, EngineState state);

}
