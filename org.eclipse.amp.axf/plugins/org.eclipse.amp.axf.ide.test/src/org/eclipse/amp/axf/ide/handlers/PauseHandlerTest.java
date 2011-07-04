package org.eclipse.amp.axf.ide.handlers;

/**
 * Pausing should be enabled whenever a simulation is running and
 * <emph>not</emph> in pause state.
 * 
 * @author jonas.ruettimann
 */
public class PauseHandlerTest extends ModelRunHandlerTest {

	@Override
	protected String getCommandToTestId() {
		return "org.eclipse.amp.axf.ui.pause";
	}

	@Override
	protected TestRunningState[] getEnabledStates() {
		return new TestRunningState[] { STATE_RUNNING };
	}

	@Override
	protected TestRunningState[] getDisabledStates() {
		return new TestRunningState[] { STATE_IDLE, STATE_STOPPED, STATE_PAUSED, STATE_ENDING };
	}

}
