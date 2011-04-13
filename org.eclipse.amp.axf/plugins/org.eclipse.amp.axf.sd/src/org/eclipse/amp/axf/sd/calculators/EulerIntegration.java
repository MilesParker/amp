package org.eclipse.amp.axf.sd.calculators;

import org.eclipse.amp.axf.sd.model.AbstractStock;

/**
 * Mathematical integration with a method from Euler.
 * 
 * @author fei
 */
public class EulerIntegration {

	public double integrateStock(AbstractStock stock) {
		int time = stock.getCurrentTime();
		double lastValue = stock.getSimResult().getValue(time - 1);
		stock.setCurrentTime(time - 1);
		double retValue = lastValue + stock.integral() * 1; // * dt
		stock.setCurrentTime(time);
		return retValue;
	}
}
