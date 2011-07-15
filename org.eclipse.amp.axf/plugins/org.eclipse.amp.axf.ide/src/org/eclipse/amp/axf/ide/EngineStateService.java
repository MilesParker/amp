package org.eclipse.amp.axf.ide;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.amp.axf.core.EngineStateAdapter;
import org.eclipse.amp.axf.core.EngineStateAdapter.EngineState;
import org.eclipse.amp.axf.core.IEngine;
import org.eclipse.amp.axf.core.IEngineObserver;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.core.commands.IHandler;
import org.eclipse.ui.AbstractSourceProvider;
import org.eclipse.ui.ISourceProvider;
import org.eclipse.ui.ISources;
import org.eclipse.ui.IWorkbenchPart;

/**
 * This {@link ISourceProvider} defines states that can be used to enable or
 * disable {@link IHandler}s or other GUI elements. The states are related to
 * the execution of only the active {@link IModel}. They are a simplification of
 * all possible states of an {@link IEngine}.
 * 
 * @author jonas.ruettimann
 */
public class EngineStateService extends AbstractSourceProvider implements IModelWorkbenchListener, IEngineObserver {

	public static final String ID = "org.eclipse.amp.axf.ide.engine.state";

	private IModel activeModel = null;

	private EngineState lastState = EngineState.IDLE;

	public EngineStateService() {
		ModelViewManager.getInstance().getManagerListeners().addModelManagerListener(this);
	}

	public Map<String, String> getCurrentState() {
		Map<String, String> map = new HashMap<String, String>(1);
		map.put(ID, lastState.toString());
		return map;
	}

	public String[] getProvidedSourceNames() {
		return new String[] { ID };
	}

	public void engineStateChanged(IEngine engine, EngineState state) {
		possibleStateChange(state);
	}

	private void possibleStateChange(EngineState currentState) {
		if (currentState != lastState) {
			lastState = currentState;
			notifyObservers(currentState);
		}
	}

	/**
	 * This method has been extracted to be able to test notification behavior.
	 * 
	 * @param currentState
	 */
	protected void notifyObservers(EngineState currentState) {
		fireSourceChanged(ISources.WORKBENCH, ID, currentState.toString());
	}

	private void unregister() {
		if (activeModel != null) {
			assert activeModel.getEngine() != null : "Engine occurs to be null.";
			activeModel.getEngine().removeEngineObserver(this);
			activeModel = null;
		}
	}

	public void modelActivated(IModel newModel) {
		unregister();

		IEngine engine = newModel.getEngine();
		assert engine != null : "Engine occurs to be null.";

		engine.addEngineObserver(this);
		activeModel = newModel;

		boolean isStepping = engine.isPaused(); // There is no stepping state. Use pause instead, that has the same effect.
		boolean isEnded = activeModel.isEnded(); // The engine does not know whether it's stopped. Lets ask the model.

		/*
		 * Just before executing a model it's being activated. So a state that is generated right here might not be as
		 * relevant since it will be changed to running in a few instances anyway.
		 */
		possibleStateChange(new EngineStateAdapter(engine.isRunning(), isStepping, engine.isPaused(), isEnded).getState());
	}

	public void modelAdded(IModel model) {
		//
	}

	public void modelRemoved(IModel model) {
		if (model == activeModel) {
			unregister();
			possibleStateChange(EngineState.IDLE);
		}
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

	public void dispose() {
		unregister();
	}

}
