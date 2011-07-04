package org.eclipse.amp.axf.ide.handlers;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Collection;

import org.eclipse.amp.axf.core.EngineControl;
import org.eclipse.amp.axf.core.IEngine;
import org.eclipse.amp.axf.core.ILifeCycleListener;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.core.IObservationProvider;
import org.eclipse.amp.axf.core.LifeCycleState;
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

	private DummyModel model;

	private EngineStateService stateService;

	private IHandlerService handlerService;

	protected abstract String getCommandToTestId();

	protected abstract boolean needsRunningStateToBeEnabled();

	protected abstract boolean needsPauseStateToBeEnabled();

	@Before
	public void setUp() {
		model = new DummyModel();

		ISourceProviderService sourceProviderService = (ISourceProviderService) PlatformUI.getWorkbench().getService(ISourceProviderService.class);
		stateService = (EngineStateService) sourceProviderService.getSourceProvider(EngineStateService.ID);

		handlerService = (IHandlerService) PlatformUI.getWorkbench().getService(IHandlerService.class);

		ModelViewManager.getInstance().getModels().add(model);
		ModelViewManager.getInstance().setActiveModel(model);
	}

	@Test
	public void testEnabled() {
		model.running = needsRunningStateToBeEnabled();
		model.paused = needsPauseStateToBeEnabled();
		stateService.stateChange(LifeCycleState.UPDATE, "");

		try {
			handlerService.executeCommand(getCommandToTestId(), null);
			assertTrue(true); // There should not be an Exception.

		} catch (Exception e) {
			fail("Executing " + getCommandToTestId() + " caused an Exception:" + e.getMessage());
		}
	}

	@Test
	public void testDisabled() throws ExecutionException, NotDefinedException, NotHandledException {
		model.running = !needsRunningStateToBeEnabled();
		model.paused = !needsPauseStateToBeEnabled();
		stateService.stateChange(LifeCycleState.UPDATE, "");

		try {
			handlerService.executeCommand(getCommandToTestId(), null);
			fail(getCommandToTestId() + " should not be enabled if model is not running.");

		} catch (NotEnabledException e) {
			assertTrue(true); // This is expected to happen.
		}
	}

	private class DummyModel implements IModel {

		boolean running = false;

		boolean paused = false;

		private DummyEngine engine = new DummyEngine(this);

		public DummyModel() {
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
			return running;
		}

		public boolean isPaused() {
			return paused;
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
		}

		public Collection<ILifeCycleListener> getModelListeners() {
			return null;
		}

		public void removeModelListener(ILifeCycleListener listener) {
		}

		public String getTimeDescription() {
			return null;
		}

		public DummyEngine getEngine() {
			return engine;
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

		private DummyModel dummyModel;

		public DummyEngine(DummyModel model) {
			this.dummyModel = model;
		}

		public void close() {
		}

		public void closeFinally() {
		}

		public boolean isCloseRequested() {
			return false;
		}

		public boolean isThreadAlive() {
			return false;
		}

		public boolean isRunning() {
			return getModel().isRunning();
		}

		public boolean isPaused() {
			return getModel().isPaused();
		}

		public void stop() {
		}

		public void control(EngineControl ModelControl) {
		}

		public void observationComplete(ILifeCycleListener observer) {
		}

		public IObservationProvider getModel() {
			return dummyModel;
		}

		public void setUpdateGranularity(ITimeGranularity granularity) {
		}

		public ITimeGranularity getUpdateGranularity() {
			return null;
		}

	}

}
