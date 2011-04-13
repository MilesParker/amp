package org.eclipse.amp.axf.sd.model;

/**
 * Super class for all dynamic variables of the type "stock".
 * 
 * @author fei
 */
public abstract class AbstractStock extends AbstractVariable {

	@Override
	protected final double equation() {
		Double retValue = getSimResult().getValue(getCurrentTime());
		if (retValue != null) {
			return retValue;
		}
		retValue = getIntegrationMethod().integrateStock(this);
		getSimResult().put(getCurrentTime(), retValue);
		return getSimResult().getValue(getCurrentTime());
	}

	public abstract double getInitialValue();

	public abstract double integral();

	@Override
	public void startSimulation() {
		super.startSimulation();
		getSimResult().put(0, getInitialValue());
		getSimResult().put(1, getInitialValue());
	}
}
