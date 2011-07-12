package org.eclipse.amp.axf.core;

/**
 * An {@link IEngine} has an awful lot of booleans that define its internal state. For many tasks, we're not interested
 * in a complex inner state. Instead we want to be informed if a simulation is running, stopped or paused. That's what
 * this adapter does for you. It simplifies the inner state of an {@link IEngine} and keeps track of the former state.
 * That way state changes can be detected.
 * <p/>
 * Obviously, there is no state "STOPPED". Why not? - It's just not needed at this point in time. If you need it,
 * implement it!
 * 
 * @author jonas.ruettimann
 */
public class EngineStateAdapter {

	public enum EngineState {
		/** Simulation has not been started at all or is in undefined state. */
		IDLE,

		/** Simulation is currently running. */
		RUNNING,

		/** Simulation was running but has been set to pause. */
		PAUSED
	}

	public EngineStateAdapter(boolean isRunning, boolean isStepping, boolean isPausing) {
		update(isRunning, isStepping, isPausing);
	}

	private boolean running;

	private boolean stepping;

	private boolean pausing;

	/**
	 * @param isRunning
	 * @param isStepping
	 * @param isPausing
	 * @return <code>true</code> if a new {@link EngineState} is detected
	 */
	public boolean update(boolean isRunning, boolean isStepping, boolean isPausing) {
		EngineState stateBefore = getState();

		this.running = isRunning;
		this.stepping = isStepping;
		this.pausing = isPausing;

		return stateBefore != getState();
	}

	public EngineState getState() {
		if (!isRunning()) {
			return EngineState.IDLE;
		}

		if (isStepping() || isPausing()) {
			return EngineState.PAUSED;
		}

		return EngineState.RUNNING;
	}

	public boolean isPausing() {
		return pausing;
	}

	public boolean isRunning() {
		return running;
	}

	public boolean isStepping() {
		return stepping;
	}

}