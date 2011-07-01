package org.eclipse.amp.axf.ide.handlers;

public class ResumeHandlerTest extends ModelRunHandlerTest {

	@Override
	protected String getCommandToTestId() {
		return "org.eclipse.amp.axf.ui.resume";
	}

	@Override
	protected boolean needsRunningStateToBeEnabled() {
		return true;
	}

	@Override
	protected boolean needsPauseStateToBeEnabled() {
		return true;
	}

}
