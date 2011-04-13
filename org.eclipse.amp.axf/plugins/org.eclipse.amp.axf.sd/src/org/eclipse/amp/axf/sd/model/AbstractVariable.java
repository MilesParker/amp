package org.eclipse.amp.axf.sd.model;

import org.eclipse.amp.axf.sd.calculators.EulerIntegration;
import org.eclipse.amp.axf.sd.model.result.SimResult;

/**
 * @author fei
 */
public abstract class AbstractVariable {
	/** Integration method. */
	private static EulerIntegration integrationMethod;

	private AbstractSDModel parent;

	/** Current time of simulation. */
	private int currentTime;

	/** Simulation results. */
	private SimResult simResult;

	static {
		integrationMethod = new EulerIntegration();
	}

	public AbstractVariable() {
		startSimulation();
	}

	protected static EulerIntegration getIntegrationMethod() {
		return integrationMethod;
	}

	public void init(AbstractSDModel parentModel) {
		this.parent = parentModel;
	}

	public AbstractSDModel getParent() {
		return parent;
	}

	/**
	 * @return the calculated value
	 */
	public final double calculate(int time) {
		int oldTime = currentTime; // enable recursive calculations with "stocks"
		currentTime = time;
		double retValue = equation();
		if (simResult.getValue(time) == null) {
			simResult.put(time, retValue);
		}
		currentTime = oldTime;
		return retValue;
	}

	/**
	 * @return the equation that calculates the value of this variable
	 */
	protected abstract double equation();

	/**
	 * This method is called before the simulation starts.
	 */
	public void startSimulation() {
		simResult = new SimResult();
	}

	public int getCurrentTime() {
		return currentTime;
	}

	/**
	 * This method should be called before the calculation of this variable takes place.
	 * 
	 * @param currentTime
	 */
	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}

	public SimResult getSimResult() {
		return simResult;
	}
}
