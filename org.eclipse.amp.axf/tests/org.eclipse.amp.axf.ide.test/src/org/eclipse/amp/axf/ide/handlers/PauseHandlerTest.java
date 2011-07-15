package org.eclipse.amp.axf.ide.handlers;

import org.eclipse.amp.axf.core.EngineStateAdapter;

/**
 * Pausing should be enabled whenever a simulation is running and
 * <emph>not</emph> in pause state.
 * 
 * @author jonas.ruettimann
 */
public class PauseHandlerTest extends ModelRunHandlerTest {

	@Override
	protected String getCommandToTestId() {
		return "org.eclipse.amp.axf.ui.pause";
	}

	@Override
	protected EngineStateAdapter[] getEnabledStates() {
		return new EngineStateAdapter[] { STATE_RUNNING };
	}

	@Override
	protected EngineStateAdapter[] getDisabledStates() {
		return new EngineStateAdapter[] { STATE_IDLE, STATE_PAUSED, STATE_ENDED };
	}

}
