package org.eclipse.amp.axf.ide.handlers;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Collection;

import org.eclipse.amp.axf.core.EngineControl;
import org.eclipse.amp.axf.core.EngineStateAdapter;
import org.eclipse.amp.axf.core.IEngine;
import org.eclipse.amp.axf.core.IEngineObserver;
import org.eclipse.amp.axf.core.ILifeCycleListener;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.core.IObservationProvider;
import org.eclipse.amp.axf.ide.EngineStateService;
import org.eclipse.amp.axf.ide.ModelViewManager;
import org.eclipse.amp.axf.time.ITimeGranularity;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.services.ISourceProviderService;
import org.junit.Before;
import org.junit.Test;

public abstract class ModelRunHandlerTest {

	/**
	 * Using the adapter as a state container. This is kind of a hack.
	 */
	static final EngineStateAdapter STATE_IDLE = new EngineStateAdapter(false, false, false, false);

	/**
	 * Using the adapter as a state container. This is kind of a hack.
	 */
	static final EngineStateAdapter STATE_RUNNING = new EngineStateAdapter(true, false, false, false);

	/**
	 * Using the adapter as a state container. This is kind of a hack. The {@link IEngine} is paused. Instead we could
	 * have used the "step" state with the same effects.
	 */
	static final EngineStateAdapter STATE_PAUSED = new EngineStateAdapter(true, true, false, false);

	/**
	 * Using the adapter as a state container. This is kind of a hack. The {@link IEngine} is has stopped executing since
	 * it has reached the simulation end period.
	 */
	static final EngineStateAdapter STATE_ENDED = new EngineStateAdapter(false, false, false, true);

	private DummyModel model;

	private EngineStateService stateService;

	private IHandlerService handlerService;

	protected abstract String getCommandToTestId();

	protected abstract EngineStateAdapter[] getEnabledStates();

	protected abstract EngineStateAdapter[] getDisabledStates();

	@Before
	public void setUp() {
		model = new DummyModel();

		ISourceProviderService sourceProviderService = (ISourceProviderService) PlatformUI.getWorkbench().getService(
				ISourceProviderService.class);
		stateService = (EngineStateService) sourceProviderService.getSourceProvider(EngineStateService.ID);

		handlerService = (IHandlerService) PlatformUI.getWorkbench().getService(IHandlerService.class);

		ModelViewManager.getInstance().getModels().add(model);
		ModelViewManager.getInstance().setActiveModel(model);
	}

	@Test
	public void testEnabled() {
		for (EngineStateAdapter state : getEnabledStates()) {
			applyTestState(state);
			try {
				handlerService.executeCommand(getCommandToTestId(), null);
				assertTrue(true); // There should not be an Exception.

			} catch (Exception e) {
				fail("Exception during state " + state.getState() + ": " + e.getMessage());
			}
		}
	}

	@Test
	public void testDisabled() throws ExecutionException, NotDefinedException, NotHandledException {
		for (EngineStateAdapter state : getDisabledStates()) {
			applyTestState(state);
			try {
				handlerService.executeCommand(getCommandToTestId(), null);
				fail(getCommandToTestId() + " should not be enabled during state " + state.getState() + ".");

			} catch (NotEnabledException e) {
				assertTrue(true); // This is expected to happen.
			}
		}
	}

	private void applyTestState(EngineStateAdapter testState) {
		model.getEngine().running = testState.isRunning();
		model.getEngine().paused = testState.isPausing();
		stateService.engineStateChanged(model.getEngine(), testState.getState()); // Enforce a state update.
	}

	private class DummyModel implements IModel {

		private DummyEngine engine;

		public DummyModel() {
			engine = new DummyEngine();
		}

		public DummyEngine getEngine() {
			return engine;
		}

		public boolean isCreated() {
			return false;
		}

		public boolean isInitialized() {
			return false;
		}

		public boolean isStopped() {
			return false;
		}

		public boolean isRunning() {
			return false;
		}

		public boolean isPaused() {
			return false;
		}

		public boolean isActive() {
			return false;
		}

		public boolean isEnding() {
			return false;
		}

		public boolean isEnded() {
			return false;
		}

		public void addModelListener(ILifeCycleListener listener) {
			//
		}

		public Collection<ILifeCycleListener> getModelListeners() {
			return null;
		}

		public void removeModelListener(ILifeCycleListener view) {
			//
		}

		public String getTimeDescription() {
			return null;
		}

		public Object getRoot() {
			return null;
		}

		public String getName() {
			return null;
		}

		public int getPeriod() {
			return 0;
		}

		public int getStopPeriod() {
			return 0;
		}
	}

	private class DummyEngine implements IEngine {

		boolean running = false;

		boolean paused = false;

		public DummyEngine() {
		}

		public void close() {
			//
		}

		public void closeFinally() {
			//
		}

		public boolean isCloseRequested() {
			return false;
		}

		public boolean isThreadAlive() {
			return false;
		}

		public boolean isRunning() {
			return running;
		}

		public boolean isPaused() {
			return paused;
		}

		public void stop() {
			//
		}

		public void control(EngineControl ModelControl) {
			//
		}

		public void addEngineObserver(IEngineObserver observer) {
			//
		}

		public void removeEngineObserver(IEngineObserver observer) {
			//
		}

		public void observationComplete(ILifeCycleListener observer) {
			//
		}

		public IObservationProvider getModel() {
			return null;
		}

		public void setUpdateGranularity(ITimeGranularity granularity) {
			//
		}

		public ITimeGranularity getUpdateGranularity() {
			return null;
		}
	}

}
