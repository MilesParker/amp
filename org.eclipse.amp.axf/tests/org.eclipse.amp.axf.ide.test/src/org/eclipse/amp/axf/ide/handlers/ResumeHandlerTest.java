package org.eclipse.amp.axf.ide.handlers;

import org.eclipse.amp.axf.core.EngineStateAdapter;

/**
 * Resuming should only be possible if in paused state.
 * 
 * @author jonas.ruettimann
 */
public class ResumeHandlerTest extends ModelRunHandlerTest {

	@Override
	protected String getCommandToTestId() {
		return "org.eclipse.amp.axf.ui.resume";
	}

	@Override
	protected EngineStateAdapter[] getEnabledStates() {
		return new EngineStateAdapter[] { STATE_PAUSED };
	}

	@Override
	protected EngineStateAdapter[] getDisabledStates() {
		return new EngineStateAdapter[] { STATE_IDLE, STATE_RUNNING, STATE_ENDED };
	}

}
