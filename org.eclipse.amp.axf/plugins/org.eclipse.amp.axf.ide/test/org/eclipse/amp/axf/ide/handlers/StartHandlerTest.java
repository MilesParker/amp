package org.eclipse.amp.axf.ide.handlers;

public class StartHandlerTest extends ModelRunHandlerTest {

	@Override
	protected String getCommandToTestId() {
		return "org.eclipse.amp.axf.ui.start";
	}

	@Override
	protected TestRunningState[] getEnabledStates() {
		return new TestRunningState[] { STATE_STOPPED };
	}

	@Override
	protected TestRunningState[] getDisabledStates() {
		return new TestRunningState[] { STATE_IDLE, STATE_RUNNING, STATE_PAUSED, STATE_ENDING };
	}

}
