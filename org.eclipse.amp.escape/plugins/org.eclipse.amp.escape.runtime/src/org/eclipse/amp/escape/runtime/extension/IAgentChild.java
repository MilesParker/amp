package org.eclipse.amp.escape.runtime.extension;
/**
 * Interface to extend an Agent at runtime
 * @author fei
 *
 */
public interface IAgentChild {
	/**
	 * Will be called at start time of the simulation
	 * @param startTime the time on which the simulation start
	 */
	public void startSimulation(int startTime);
	/**
	 * Will be called on every timestamp
	 * @param simulationTime the current simulation time
	 */
	public void calculate(int simulationTime);
	/**
	 * @param object contains some simulationinformation 
	 */
	public void addDataCollectors(Object object);
}
