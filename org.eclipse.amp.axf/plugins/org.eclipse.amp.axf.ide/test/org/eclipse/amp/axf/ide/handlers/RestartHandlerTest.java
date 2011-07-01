package org.eclipse.amp.axf.ide.handlers;

public class RestartHandlerTest extends ModelRunHandlerTest {

	@Override
	protected String getCommandToTestId() {
		return "org.eclipse.amp.axf.ui.restart";
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
