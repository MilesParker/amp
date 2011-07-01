package org.eclipse.amp.axf.ide.handlers;

public class StopHandlerTest extends ModelRunHandlerTest {

	@Override
	protected String getCommandToTestId() {
		return "org.eclipse.amp.axf.ui.stop";
	}

	@Override
	protected boolean needsRunningStateToBeEnabled() {
		return true;
	}

	@Override
	protected boolean needsPauseStateToBeEnabled() {
		return false;
	}

}
