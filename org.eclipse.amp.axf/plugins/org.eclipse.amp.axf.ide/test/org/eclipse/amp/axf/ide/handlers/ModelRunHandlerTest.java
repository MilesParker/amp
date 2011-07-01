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

		@Override
		public boolean isCreated() {
			return false;
		}

		@Override
		public boolean isInitialized() {
			return false;
		}

		@Override
		public boolean isStopped() {
			return false;
		}

		@Override
		public boolean isRunning() {
			return running;
		}

		@Override
		public boolean isPaused() {
			return paused;
		}

		@Override
		public boolean isActive() {
			return false;
		}

		@Override
		public boolean isEnding() {
			return false;
		}

		@Override
		public boolean isEnded() {
			return false;
		}

		@Override
		public void addModelListener(ILifeCycleListener listener) {
		}

		@Override
		public Collection<ILifeCycleListener> getModelListeners() {
			return null;
		}

		@Override
		public void removeModelListener(ILifeCycleListener listener) {
		}

		@Override
		public String getTimeDescription() {
			return null;
		}

		@Override
		public DummyEngine getEngine() {
			return engine;
		}

		@Override
		public Object getRoot() {
			return null;
		}

		@Override
		public String getName() {
			return null;
		}

		@Override
		public int getPeriod() {
			return 0;
		}

		@Override
		public int getStopPeriod() {
			return 0;
		}
	}

	private class DummyEngine implements IEngine {

		private DummyModel dummyModel;

		public DummyEngine(DummyModel model) {
			this.dummyModel = model;
		}

		@Override
		public void close() {
		}

		@Override
		public void closeFinally() {
		}

		@Override
		public boolean isCloseRequested() {
			return false;
		}

		@Override
		public boolean isThreadAlive() {
			return false;
		}

		@Override
		public boolean isRunning() {
			return getModel().isRunning();
		}

		@Override
		public boolean isPaused() {
			return getModel().isPaused();
		}

		@Override
		public void stop() {
		}

		@Override
		public void control(EngineControl ModelControl) {
		}

		@Override
		public void observationComplete(ILifeCycleListener observer) {
		}

		@Override
		public IObservationProvider getModel() {
			return dummyModel;
		}

		@Override
		public void setUpdateGranularity(ITimeGranularity granularity) {
		}

		@Override
		public ITimeGranularity getUpdateGranularity() {
			return null;
		}

	}

}
