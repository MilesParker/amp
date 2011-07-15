package org.eclipse.amp.axf.ide.handlers;

import org.eclipse.amp.axf.core.EngineStateAdapter;
import org.eclipse.amp.axf.core.EngineStateAdapter.EngineState;

/**
 * Closing should be enabled when {@link EngineState#IDLE}, {@link EngineState#RUNNING}, {@link EngineState#PAUSED}.
 * basically at all times.
 * 
 * @author jonas.ruettimann
 */
public class CloseHandlerTest extends ModelRunHandlerTest {

	@Override
	protected String getCommandToTestId() {
		return "org.eclipse.amp.axf.ui.close";
	}

	@Override
	protected EngineStateAdapter[] getEnabledStates() {
		return new EngineStateAdapter[] { STATE_IDLE, STATE_PAUSED, STATE_RUNNING, STATE_ENDED };
	}

	@Override
	protected EngineStateAdapter[] getDisabledStates() {
		return new EngineStateAdapter[] {};
	}

}
