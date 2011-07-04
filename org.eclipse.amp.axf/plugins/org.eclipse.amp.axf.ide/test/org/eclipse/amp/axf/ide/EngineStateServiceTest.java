package org.eclipse.amp.axf.ide;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.amp.axf.core.IEngine;
import org.eclipse.amp.axf.core.ILifeCycleListener;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.core.LifeCycleState;
import org.eclipse.ui.ISourceProvider;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.services.ISourceProviderService;
import org.junit.Before;
import org.junit.Test;

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
		ISourceProviderService service = (ISourceProviderService) PlatformUI.getWorkbench().getService(ISourceProviderService.class);
		ISourceProvider sourceProvider = service.getSourceProvider(EngineStateService.ID);
		assertTrue(sourceProvider instanceof EngineStateService);
	}

	/**
	 * Does the {@link EngineStateService} register itself as a
	 * {@link IModelWorkbenchListener} on the {@link ModelManagerListeners}?
	 */
	@Test
	public void testEngineStateService() {
		ModelViewManager.getInstance().getManagerListeners().manangerListeners.contains(classToTest);
	}

	/**
	 * The activation of an {@link IModel} should cause the
	 * {@link EngineStateService} to be registered as an
	 * {@link ILifeCycleListener} on the active {@link IModel}.
	 */
	@Test
	public void testModelActivated() {
		IModel modelA = new DummyModel();
		IModel modelB = new DummyModel();

		// not registered:
		assertFalse(modelA.getModelListeners().contains(classToTest));
		assertFalse(modelB.getModelListeners().contains(classToTest));

		// register to modelA:
		classToTest.modelActivated(modelA);
		assertTrue(modelA.getModelListeners().contains(classToTest));
		assertFalse(modelB.getModelListeners().contains(classToTest));

		// unregister at modelA, register at modelB:
		classToTest.modelActivated(modelB);
		assertTrue(modelB.getModelListeners().contains(classToTest));
		assertFalse(modelA.getModelListeners().contains(classToTest));
	}

	/**
	 * Without an active {@link IModel} the default state
	 * {@link EngineStateService#IDLE} should be returned. Otherwise the state of
	 * the {@link IModel} matters.
	 */
	@Test
	public void testGetCurrentState() {
		assertEquals(EngineStateService.IDLE, classToTest.getCurrentState().get(EngineStateService.ID));

		DummyModel model = new DummyModel();
		classToTest.modelActivated(model);
		assertEquals(EngineStateService.IDLE, classToTest.getCurrentState().get(EngineStateService.ID));

		model.initialized = true;
		model.stopped = true;
		assertEquals(EngineStateService.STOPPED, classToTest.getCurrentState().get(EngineStateService.ID));

		model.initialized = true;
		model.created = true;
		model.active = true;
		model.running = true;
		model.stopped = false;
		assertEquals(EngineStateService.RUNNING, classToTest.getCurrentState().get(EngineStateService.ID));

		model.paused = true;
		assertEquals(EngineStateService.PAUSED, classToTest.getCurrentState().get(EngineStateService.ID));

		model.created = false;
		model.active = false;
		model.running = false;
		model.initialized = true;
		model.stopped = true;
		model.ending = true;
		assertEquals(EngineStateService.CLOSING, classToTest.getCurrentState().get(EngineStateService.ID));
	}

	/**
	 * Only a changing state should lead to firing an event.
	 */
	@Test
	public void testStateChange() {
		DummyModel model = new DummyModel();

		// First state change ever; this should cause a notification:
		classToTest.modelActivated(model);
		assertTrue(classToTest.isNotificationFired());

		// Not another notification:
		classToTest.stateChange(LifeCycleState.UPDATE, "");
		assertFalse(classToTest.isNotificationFired());

		// Changing the state should cause notification:
		model.initialized = true;
		model.stopped = true;
		classToTest.stateChange(LifeCycleState.UPDATE, "");
		assertTrue(classToTest.isNotificationFired());

		// Not another notification:
		classToTest.stateChange(LifeCycleState.UPDATE, "");
		assertFalse(classToTest.isNotificationFired());

		// A new model that is different should cause notification:
		DummyModel differentModel = new DummyModel();
		classToTest.modelActivated(differentModel);
		assertTrue(classToTest.isNotificationFired());

		// But not an equal one:
		DummyModel equalModel = new DummyModel();
		classToTest.modelActivated(equalModel);
		assertFalse(classToTest.isNotificationFired());
	}

	/**
	 * Disposing the {@link EngineStateService} should unregister itself at the
	 * active {@link IModel}.
	 */
	@Test
	public void testDispose() {
		IModel modelA = new DummyModel();
		assertFalse(modelA.getModelListeners().contains(classToTest));

		classToTest.modelActivated(modelA);
		assertTrue(modelA.getModelListeners().contains(classToTest));

		classToTest.dispose();
		assertFalse(modelA.getModelListeners().contains(classToTest));
	}

	/**
	 * Disposing the {@link EngineStateService} without an active {@link IModel}
	 * should not lead to an {@link Exception}.
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
		private boolean notificationFired = false;

		public EngineStateServiceMock() {
		}

		public boolean isNotificationFired() {
			return notificationFired;
		}

		@Override
		public void stateChange(Object key, Object updated) {
			notificationFired = false;
			super.stateChange(key, updated);
		}

		@Override
		public void modelActivated(IModel newModel) {
			notificationFired = false;
			super.modelActivated(newModel);
		}

		@Override
		protected void notifyObservers(String currentState) {
			notificationFired = true;
			super.notifyObservers(currentState);
		}
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

		private List<ILifeCycleListener> listeners = new ArrayList<ILifeCycleListener>();

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
			listeners.add(listener);
		}

		public Collection<ILifeCycleListener> getModelListeners() {
			return listeners;
		}

		public void removeModelListener(ILifeCycleListener listener) {
			listeners.remove(listener);
		}

		public String getTimeDescription() {
			return null;
		}

		public IEngine getEngine() {
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

}
