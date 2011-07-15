package org.eclipse.amp.axf.ide.handlers;

import org.eclipse.amp.axf.core.EngineStateAdapter;

/**
 * Restarting should be enabled while running or paused.
 * 
 * @author jonas.ruettimann
 */
public class RestartHandlerTest extends ModelRunHandlerTest {

	@Override
	protected String getCommandToTestId() {
		return "org.eclipse.amp.axf.ui.restart";
	}

	@Override
	protected EngineStateAdapter[] getEnabledStates() {
		return new EngineStateAdapter[] { STATE_RUNNING, STATE_PAUSED, STATE_ENDED };
	}

	@Override
	protected EngineStateAdapter[] getDisabledStates() {
		return new EngineStateAdapter[] { STATE_IDLE };
	}

}
