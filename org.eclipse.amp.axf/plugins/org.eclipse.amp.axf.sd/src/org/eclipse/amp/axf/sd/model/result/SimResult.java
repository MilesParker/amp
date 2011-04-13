package org.eclipse.amp.axf.sd.model.result;

import java.util.HashMap;

/**
 * Enthält das Resultat der Simulation
 * @author fei
 */
public class SimResult {
	/**Enthält zu jedem Zeitschrit der Berechnetet wert*/
	private HashMap<Integer, Double> values;
	
	public SimResult(){
		values = new HashMap<Integer, Double>();
	}
	/**
	 * Fügt ein Element zu den Berechneten Werten hinzu. Ist das Element mit dem definierten Zeitschrit
	 * bereits vorhanden so wird dieses ersetzt
	 * @param time
	 * @param value
	 */
	public void put(int time, double value){
		values.put(time, value);
	}
	/**
	 * Gibt das Element zum Zeitpunkt time zurück. Ist es nicht vorhanden --> null
	 * @param time
	 * @return
	 */
	public Double getValue(int time){
		return values.get(time);
	}
}
