package org.eclipse.amp.axf.ide.handlers;

public class StepHandlerTest extends ModelRunHandlerTest {

	@Override
	protected String getCommandToTestId() {
		return "org.eclipse.amp.axf.ui.step";
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
