package org.eclipse.amp.axf.ide;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.amp.axf.core.IEngine;
import org.eclipse.amp.axf.core.ILifeCycleListener;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.core.IObservationProvider;
import org.eclipse.amp.axf.core.LifeCycleState;
import org.eclipse.ui.AbstractSourceProvider;
import org.eclipse.ui.ISourceProvider;
import org.eclipse.ui.ISources;
import org.eclipse.ui.IWorkbenchPart;

/**
 * This {@link ISourceProvider} defines states that can be used to enable or
 * disable handlers. The states are related to the execution of only the active
 * {@link IModel}s. Execution states are {@link #IDLE}, {@link #RUNNING} and
 * {@link #PAUSED}. This is a simplification of all {@link IEngine} states that
 * are possible.
 * 
 * @author jonas.ruettimann
 */
public class EngineStateService extends AbstractSourceProvider implements IModelWorkbenchListener, ILifeCycleListener {
	public static final String ID = "org.eclipse.amp.axf.ide.engine.state";

	/** Simulation has been stopped or not even started. */
	public static final String IDLE = "IDLE";

	/** Simulation is currently running. */
	public static final String RUNNING = "RUNNING";

	/** Simulation was running but has been set to pause. */
	public static final String PAUSED = "PAUSED";

	/** Simulation has stopped running, but the {@link Thread} is still alive. */
	public static final String ZOMBIE = "ZOMBIE";

	private IModel activeModel = null;

	private String lastState;

	public EngineStateService() {
		ModelViewManager.getInstance().getManagerListeners().addModelManagerListener(this);
	}

	public Map<String, String> getCurrentState() {
		Map<String, String> map = new HashMap<String, String>(1);
		map.put(ID, getEngineState());
		return map;
	}

	public String[] getProvidedSourceNames() {
		return new String[] { ID };
	}

	private String getEngineState() {
		if (activeModel != null && activeModel.getEngine() != null && !activeModel.getEngine().isCloseRequested()) {
			if (activeModel.isPaused()) {
				return PAUSED;
			}
			if (activeModel.isRunning()) {
				return RUNNING;
			}
			if (activeModel.getEngine().isThreadAlive()) {
				return ZOMBIE;
			}
		}

		return IDLE; // used as default
	}

	public void stateChange(Object key, Object updated) {
		if (key instanceof LifeCycleState) {
			possibleStateChange();
		}
	}

	private void possibleStateChange() {
		String currentState = getEngineState();
		if (!currentState.equals(lastState)) {
			lastState = currentState;
			notifyObservers(currentState);
		}
	}

	/**
	 * This method has been extracted to be able to test notification behavior.
	 * 
	 * @param currentState
	 */
	protected void notifyObservers(String currentState) {
		fireSourceChanged(ISources.WORKBENCH, ID, currentState);
	}

	public void dispose() {
		unregister();
	}

	public void modelActivated(IModel newModel) {
		unregister();

		newModel.addModelListener(this);
		activeModel = newModel;

		possibleStateChange();
	}

	private void unregister() {
		if (activeModel != null) {
			activeModel.removeModelListener(this);
		}
	}

	public void modelAdded(IModel model) {
		//
	}

	public void modelRemoved(IModel model) {
		//
	}

	public void viewAdded(IWorkbenchPart part) {
		//
	}

	public void viewRemoved(IWorkbenchPart part) {
		//
	}

	public void viewActivated(IWorkbenchPart part) {
		//
	}

	public void observing(IObservationProvider observed) {
		//
	}

	public void observeCreate(IObservationProvider observed) {
		//
	}

	public void observeInitialize(IObservationProvider observed) {
		//
	}

	public void observeStart(IObservationProvider observed) {
		//
	}

	public void observeUpdate(IObservationProvider observed) {
		//
	}

	public void observeStop(IObservationProvider observed) {
		//
	}

	public void observationEnding(IObservationProvider observed) {
		//
	}

	public void observationEnd(IObservationProvider observed) {
		//
	}
 
}
