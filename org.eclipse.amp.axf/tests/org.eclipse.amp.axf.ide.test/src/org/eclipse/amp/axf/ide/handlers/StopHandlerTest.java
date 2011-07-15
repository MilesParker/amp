package org.eclipse.amp.axf.ide.handlers;

import org.eclipse.amp.axf.core.EngineStateAdapter;

/**
 * Stopping should be enabled when paused or running.
 * 
 * @author jonas.ruettimann
 */
public class StopHandlerTest extends ModelRunHandlerTest {

	@Override
	protected String getCommandToTestId() {
		return "org.eclipse.amp.axf.ui.stop";
	}

	@Override
	protected EngineStateAdapter[] getEnabledStates() {
		return new EngineStateAdapter[] { STATE_RUNNING, STATE_PAUSED };
	}

	@Override
	protected EngineStateAdapter[] getDisabledStates() {
		return new EngineStateAdapter[] { STATE_IDLE, STATE_ENDED };
	}

}
