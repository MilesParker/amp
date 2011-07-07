package org.eclipse.amp.axf.ide.handlers;

import org.eclipse.amp.axf.ide.EngineStateService;

/**
 * Closing should be enabled when {@link EngineStateService#IDLE},
 * {@link EngineStateService#RUNNING}, {@link EngineStateService#PAUSED} and
 * {@link EngineStateService#STOPPED}. So basically at all times, except when
 * already closing.
 * 
 * @author jonas.ruettimann
 */
public class CloseHandlerTest extends ModelRunHandlerTest {

	@Override
	protected String getCommandToTestId() {
		return "org.eclipse.amp.axf.ui.close";
	}

	@Override
	protected TestRunningState[] getEnabledStates() {
		return new TestRunningState[] { STATE_IDLE, STATE_PAUSED, STATE_RUNNING, STATE_STOPPED };
	}

	@Override
	protected TestRunningState[] getDisabledStates() {
		return new TestRunningState[] { STATE_ENDING };
	}

}
