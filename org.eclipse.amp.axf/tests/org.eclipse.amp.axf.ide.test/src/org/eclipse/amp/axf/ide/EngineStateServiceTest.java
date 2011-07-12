package org.eclipse.amp.axf.ide;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.amp.axf.core.EngineControl;
import org.eclipse.amp.axf.core.EngineStateAdapter.EngineState;
import org.eclipse.amp.axf.core.IEngine;
import org.eclipse.amp.axf.core.IEngineObserver;
import org.eclipse.amp.axf.core.ILifeCycleListener;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.time.ITimeGranularity;
import org.eclipse.ui.ISourceProvider;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.services.ISourceProviderService;
import org.junit.Before;
import org.junit.Test;

/**
 * @author jonas.ruettimann
 */
public class EngineStateServiceTest {

	private EngineStateServiceMock classToTest;

	@Before
	public void setUp() {
		classToTest = new EngineStateServiceMock();
	}

	/**
	 * Was the {@link EngineStateService} registered by the plugin.xml?
	 */
	@Test
	public void testWasRegisteredByPluginXML() {
		ISourceProviderService service = (ISourceProviderService) PlatformUI.getWorkbench().getService(
				ISourceProviderService.class);
		ISourceProvider sourceProvider = service.getSourceProvider(EngineStateService.ID);
		assertTrue(sourceProvider instanceof EngineStateService);
	}

	/**
	 * Does the {@link EngineStateService} register itself as a {@link IModelWorkbenchListener} on the
	 * {@link ModelManagerListeners}?
	 */
	@Test
	public void testEngineStateService() {
		ModelViewManager.getInstance().getManagerListeners().isListening(classToTest);
	}

	/**
	 * The activation of an {@link IModel} should cause the {@link EngineStateService} to be registered as an
	 * {@link ILifeCycleListener} on the active {@link IModel}.
	 */
	@Test
	public void testModelActivated() {
		DummyModel modelA = new DummyModel();
		DummyModel modelB = new DummyModel();

		// not registered:
		assertFalse(modelA.getEngine().observers.contains(classToTest));
		assertFalse(modelB.getEngine().observers.contains(classToTest));

		// register to modelA:
		classToTest.modelActivated(modelA);
		assertTrue(modelA.getEngine().observers.contains(classToTest));
		assertFalse(modelB.getEngine().observers.contains(classToTest));

		// unregister at modelA, register at modelB:
		classToTest.modelActivated(modelB);
		assertTrue(modelB.getEngine().observers.contains(classToTest));
		assertFalse(modelA.getEngine().observers.contains(classToTest));
	}

	/**
	 * Without an active {@link IModel} the default state {@link EngineState#IDLE} should be returned. Otherwise the state
	 * of the {@link IEngine} matters.
	 */
	@Test
	public void testGetCurrentState() {
		assertEquals(EngineState.IDLE.toString(), classToTest.getCurrentState().get(EngineStateService.ID));

		DummyModel model = new DummyModel();
		model.getEngine().running = true;
		classToTest.modelActivated(model);
		assertEquals(EngineState.RUNNING.toString(), classToTest.getCurrentState().get(EngineStateService.ID));

		classToTest.modelRemoved(model);
		assertEquals(EngineState.IDLE.toString(), classToTest.getCurrentState().get(EngineStateService.ID));
	}

	/**
	 * Only a change of state should cause notifications to be fired. An engine state change without any change state
	 * change in the {@link EngineStateService} should not lead to a notification being fired. No unnecessary events,
	 * please!
	 */
	@Test
	public void testEngineStateChanged() {
		assertFalse(classToTest.notificationFired);
		assertEquals(EngineState.IDLE.toString(), classToTest.getCurrentState().get(EngineStateService.ID));

		classToTest.engineStateChanged(null, EngineState.IDLE);
		assertFalse(classToTest.notificationFired); // No state change.

		classToTest.engineStateChanged(null, EngineState.RUNNING);
		assertTrue(classToTest.notificationFired); // New state.
	}

	/**
	 * Even when activating a new {@link IModel}, a notification should only be fired if the {@link EngineStateService}
	 * state changes. No unnecessary events, please!
	 */
	@Test
	public void testEngineStateChanged_newModel() {
		classToTest.engineStateChanged(null, EngineState.RUNNING);
		classToTest.notificationFired = false;

		DummyModel modelA = new DummyModel();
		modelA.getEngine().running = true;
		classToTest.modelActivated(modelA);
		assertFalse(classToTest.notificationFired); // New model, but no new state.

		DummyModel modelB = new DummyModel();
		classToTest.modelActivated(modelB);
		assertTrue(classToTest.notificationFired); // New model, new state.
	}

	/**
	 * Disposing the {@link EngineStateService} should unregister itself at the {@link IEngine} of the active
	 * {@link IModel}.
	 */
	@Test
	public void testDispose() {
		DummyModel modelA = new DummyModel();
		assertFalse(modelA.getEngine().observers.contains(classToTest));

		classToTest.modelActivated(modelA);
		assertTrue(modelA.getEngine().observers.contains(classToTest));

		classToTest.dispose();
		assertFalse(modelA.getEngine().observers.contains(classToTest));
	}

	/**
	 * Disposing the {@link EngineStateService} without an active {@link IModel} should not lead to an {@link Exception}.
	 */
	@Test
	public void testDispose_noActiveModel() {
		try {
			classToTest.dispose();
			assertTrue(true);

		} catch (Exception e) {
			fail("No active model causes an Exception: " + e.getMessage());
		}
	}

	private class EngineStateServiceMock extends EngineStateService {

		boolean notificationFired = false;

		public EngineStateServiceMock() {
		}

		@Override
		protected void notifyObservers(EngineState currentState) {
			super.notifyObservers(currentState);
			notificationFired = true;
		}

	}

	private class DummyModel implements IModel {

		private DummyEngine engine;

		public DummyModel() {
			engine = new DummyEngine(this);
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

		public void removeModelListener(ILifeCycleListener listener) {
			//
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

		ArrayList<IEngineObserver> observers = new ArrayList<IEngineObserver>();

		boolean running = false;

		boolean paused = false;

		private DummyModel model;

		public DummyEngine(DummyModel model) {
			this.model = model;
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

		public void observationComplete(ILifeCycleListener observer) {
			//
		}

		public DummyModel getModel() {
			return model;
		}

		public void setUpdateGranularity(ITimeGranularity granularity) {
			//
		}

		public ITimeGranularity getUpdateGranularity() {
			return null;
		}

		public void addEngineObserver(IEngineObserver observer) {
			observers.add(observer);
		}

		public void removeEngineObserver(IEngineObserver observer) {
			observers.remove(observer);
		}

	}
}
