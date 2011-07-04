package org.eclipse.amp.axf.ide.handlers;

/**
 * Stopping should be enabled when paused or running.
 * 
 * @author jonas.ruettimann
 */
public class StopHandlerTest extends ModelRunHandlerTest {

	@Override
	protected String getCommandToTestId() {
		return "org.eclipse.amp.axf.ui.stop";
	}

	@Override
	protected TestRunningState[] getEnabledStates() {
		return new TestRunningState[] { STATE_RUNNING, STATE_PAUSED };
	}

	@Override
	protected TestRunningState[] getDisabledStates() {
		return new TestRunningState[] { STATE_IDLE, STATE_STOPPED, STATE_ENDING };
	}

}
