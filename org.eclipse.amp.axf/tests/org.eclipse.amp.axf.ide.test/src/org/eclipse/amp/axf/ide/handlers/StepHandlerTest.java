package org.eclipse.amp.axf.ide.handlers;

public class StepHandlerTest extends ModelRunHandlerTest {

	@Override
	protected String getCommandToTestId() {
		return "org.eclipse.amp.axf.ui.step";
	}

	@Override
	protected TestRunningState[] getEnabledStates() {
		return new TestRunningState[] { STATE_PAUSED };
	}

	@Override
	protected TestRunningState[] getDisabledStates() {
		return new TestRunningState[] { STATE_IDLE, STATE_STOPPED, STATE_RUNNING, STATE_ENDING };
	}

}
