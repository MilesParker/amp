package org.eclipse.amp.axf.ide.handlers;

public class PauseHandlerTest extends ModelRunHandlerTest {

	@Override
	protected String getCommandToTestId() {
		return "org.eclipse.amp.axf.ui.pause";
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
