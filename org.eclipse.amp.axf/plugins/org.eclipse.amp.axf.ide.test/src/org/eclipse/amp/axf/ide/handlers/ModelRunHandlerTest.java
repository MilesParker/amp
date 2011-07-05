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

	static final TestRunningState STATE_IDLE = new TestRunningState("IDLE", false, false, false, false, false, true, false, false);

	static final TestRunningState STATE_STOPPED = new TestRunningState("STOPPED", true, false, false, false, false, true, false, false);

	static final TestRunningState STATE_RUNNING = new TestRunningState("RUNNING", true, true, true, true, false, false, false, false);

	static final TestRunningState STATE_PAUSED = new TestRunningState("PAUSED", true, true, true, true, true, false, false, false);

	static final TestRunningState STATE_ENDING = new TestRunningState("ENDING", true, false, false, false, false, true, true, false);

	private DummyModel model;

	private EngineStateService stateService;

	private IHandlerService handlerService;

	protected abstract String getCommandToTestId();

	protected abstract TestRunningState[] getEnabledStates();

	protected abstract TestRunningState[] getDisabledStates();

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
		for (TestRunningState state : getEnabledStates()) {
			applyTestState(state);
			try {
				handlerService.executeCommand(getCommandToTestId(), null);
				assertTrue(true); // There should not be an Exception.

			} catch (Exception e) {
				fail("Exception during state " + state + ": " + e.getMessage());
			}
		}
	}

	@Test
	public void testDisabled() throws ExecutionException, NotDefinedException, NotHandledException {
		for (TestRunningState state : getDisabledStates()) {
			applyTestState(state);
			try {
				handlerService.executeCommand(getCommandToTestId(), null);
				fail(getCommandToTestId() + " should not be enabled during state " + state + ".");

			} catch (NotEnabledException e) {
				assertTrue(true); // This is expected to happen.
			}
		}
	}

	private void applyTestState(TestRunningState testState) {
		testState.applyTo(model);
		stateService.stateChange(LifeCycleState.UPDATE, ""); // Cause state update.
	}

	private class DummyModel implements IModel {

		boolean initialized = false;

		boolean created = false;

		boolean active = false;

		boolean running = false;

		boolean paused = false;

		boolean stopped = false;

		boolean ending = false;

		boolean ended = false;

		public DummyModel() {
		}

		public boolean isCreated() {
			return created;
		}

		public boolean isInitialized() {
			return initialized;
		}

		public boolean isStopped() {
			return stopped;
		}

		public boolean isRunning() {
			return running;
		}

		public boolean isPaused() {
			return paused;
		}

		public boolean isActive() {
			return active;
		}

		public boolean isEnding() {
			return ending;
		}

		public boolean isEnded() {
			return ended;
		}

		public void addModelListener(ILifeCycleListener listener) {
			//
		}

		public Collection<ILifeCycleListener> getModelListeners() {
			return null;
		}

		public void removeModelListener(ILifeCycleListener listener) {
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

		public IEngine getEngine() {
			return new IEngine() {

				public void stop() {
					//
				}

				public void setUpdateGranularity(ITimeGranularity granularity) {
					//
				}

				public void observationComplete(ILifeCycleListener observer) {
					//
				}

				public boolean isThreadAlive() {
					return false;
				}

				public boolean isRunning() {
					return false;
				}

				public boolean isPaused() {
					return false;
				}

				public boolean isCloseRequested() {
					return false;
				}

				public ITimeGranularity getUpdateGranularity() {
					return null;
				}

				public IObservationProvider getModel() {
					return DummyModel.this;
				}

				public void control(EngineControl ModelControl) {
					//
				}

				public void closeFinally() {
					//
				}

				public void close() {
					//
				}
			};
		}
	}

	static class TestRunningState {
		private String name;

		private boolean initialized;

		private boolean created;

		private boolean active;

		private boolean running;

		private boolean paused;

		private boolean stopped;

		private boolean ending;

		private boolean ended;

		public TestRunningState(String name, boolean initialized, boolean created, boolean active, boolean running, boolean paused, boolean stopped, boolean ending, boolean ended) {
			this.name = name;
			this.initialized = initialized;
			this.created = created;
			this.active = active;
			this.running = running;
			this.paused = paused;
			this.stopped = stopped;
			this.ending = ending;
			this.ended = ended;
		}

		public void applyTo(DummyModel model) {
			model.initialized = initialized;
			model.created = created;
			model.active = active;
			model.running = running;
			model.paused = paused;
			model.stopped = stopped;
			model.ending = ending;
			model.ended = ended;
		}

		@Override
		public String toString() {
			return name;
		}
	}

}
