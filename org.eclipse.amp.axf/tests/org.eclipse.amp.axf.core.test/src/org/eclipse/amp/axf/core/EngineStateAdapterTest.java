package org.eclipse.amp.axf.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.eclipse.amp.axf.core.EngineStateAdapter.EngineState;
import org.junit.Before;
import org.junit.Test;

public class EngineStateAdapterTest {

	private EngineStateAdapter classToTest;

	@Before
	public void setUp() {
		classToTest = new EngineStateAdapter(false, false, false);
	}

	/**
	 * A change in running state or a change in step and pause state should lead to an update.
	 */
	@Test
	public void testUpdate() {
		classToTest.update(false, false, false); // reset.
		assertFalse(classToTest.update(false, false, false));

		classToTest.update(false, false, false); // reset.
		assertTrue(classToTest.update(true, false, false));

		classToTest.update(false, false, false); // reset.
		assertTrue(classToTest.update(true, true, false));

		classToTest.update(false, false, false); // reset.
		assertTrue(classToTest.update(true, false, true));

		classToTest.update(false, false, false); // reset.
		assertTrue(classToTest.update(true, false, true));

		classToTest.update(true, true, true); // reset.
		assertTrue(classToTest.update(true, false, false));

		classToTest.update(true, true, true); // reset.
		assertFalse(classToTest.update(true, false, true)); // Still paused.

		classToTest.update(true, true, true); // reset.
		assertFalse(classToTest.update(true, true, false)); // Still paused.

		classToTest.update(true, false, true); // reset.
		assertFalse(classToTest.update(true, true, false)); // Still paused.
	}

	@Test
	public void testGetState() {
		assertEquals(EngineState.IDLE, classToTest.getState()); // default.

		classToTest.update(false, false, false); // not running, not paused. Same as default.
		assertEquals(EngineState.IDLE, classToTest.getState());

		classToTest.update(true, false, false); // running.
		assertEquals(EngineState.RUNNING, classToTest.getState());

		classToTest.update(true, true, false); // paused.
		assertEquals(EngineState.PAUSED, classToTest.getState());

		classToTest.update(true, false, true); // stepping - should also lead to paused state.
		assertEquals(EngineState.PAUSED, classToTest.getState());
	}

	@Test
	public void testGetState_invalidStates() {
		classToTest.update(false, true, false); // paused without running makes no sense.
		assertEquals(EngineState.IDLE, classToTest.getState());

		classToTest.update(false, false, true); // stepping without running neither.
		assertEquals(EngineState.IDLE, classToTest.getState());
	}
}
