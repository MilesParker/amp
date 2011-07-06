package org.eclipse.amp.axf.ide.handlers;

public class RestartHandlerTest extends ModelRunHandlerTest {

	@Override
	protected String getCommandToTestId() {
		return "org.eclipse.amp.axf.ui.restart";
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
