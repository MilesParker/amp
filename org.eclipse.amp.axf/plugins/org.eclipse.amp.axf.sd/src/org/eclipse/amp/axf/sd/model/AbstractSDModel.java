package org.eclipse.amp.axf.sd.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.amp.escape.runtime.extension.IAgentChild;

/**
 * Super class for all SD containers.
 * 
 * @author fei
 */
public abstract class AbstractSDModel implements IAgentChild {
	private List<AbstractVariable> variables;

	public AbstractSDModel() {
		variables = new ArrayList<AbstractVariable>();
	}

	public void addVariable(AbstractVariable var) {
		variables.add(var);
	}

	public void removeVariable(AbstractVariable varToRemove) {
		variables.remove(varToRemove);
	}

	public AbstractVariable getVariable(String className) {
		for (AbstractVariable tmp : variables) {
			String name = tmp.getClass().getName();
			name = name.substring(name.lastIndexOf(".")+1, name.length());
			if (name.equals(className)) {
				return tmp;
			}
		}
		throw new RuntimeException("Class not found: " + className);
	}

	public List<AbstractVariable> getVariable() {
		return Collections.unmodifiableList(variables);
	}

	public void calculate(int time) {
		calculateAux(time);
		calculateStock(time);
		calculateFlow(time);
	}

	public void startSimulation(int time) {
		for (AbstractVariable tmp : variables) {
			tmp.startSimulation();
		}
	}

	private void calculateAux(int time) {
		for (AbstractVariable tmp : variables) {
			tmp.calculate(time);
			// TODO
		}
	}

	private void calculateStock(int time) {
		for (AbstractVariable tmp : variables) {
			// TODO
		}
	}

	private void calculateFlow(int time) {
		for (AbstractVariable tmp : variables) {
			// TODO
		}
	}
}
