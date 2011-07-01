package org.eclipse.amp.axf.ide.handlers;

public class CloseHandlerTest extends ModelRunHandlerTest {

	@Override
	protected String getCommandToTestId() {
		return "org.eclipse.amp.axf.ui.close";
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
