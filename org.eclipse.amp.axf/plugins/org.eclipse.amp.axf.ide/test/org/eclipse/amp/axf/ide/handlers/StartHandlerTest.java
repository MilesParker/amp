package org.eclipse.amp.axf.ide.handlers;

public class StartHandlerTest extends ModelRunHandlerTest {

	@Override
	protected String getCommandToTestId() {
		return "org.eclipse.amp.axf.ui.start";
	}

	@Override
	protected boolean needsRunningStateToBeEnabled() {
		return false;
	}

	@Override
	protected boolean needsPauseStateToBeEnabled() {
		return false;
	}

}
