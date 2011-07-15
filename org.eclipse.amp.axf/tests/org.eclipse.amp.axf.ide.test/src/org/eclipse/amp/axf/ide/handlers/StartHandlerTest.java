package org.eclipse.amp.axf.ide.handlers;

import org.eclipse.amp.axf.core.EngineStateAdapter;

/**
 * Starting makes no sense in running state. Otherwise it does.
 * 
 * @author jonas.ruettimann
 */
public class StartHandlerTest extends ModelRunHandlerTest {

	@Override
	protected String getCommandToTestId() {
		return "org.eclipse.amp.axf.ui.start";
	}

	@Override
	protected EngineStateAdapter[] getEnabledStates() {
		return new EngineStateAdapter[] { STATE_IDLE, STATE_ENDED };
	}

	@Override
	protected EngineStateAdapter[] getDisabledStates() {
		return new EngineStateAdapter[] { STATE_PAUSED, STATE_RUNNING };
	}

}
