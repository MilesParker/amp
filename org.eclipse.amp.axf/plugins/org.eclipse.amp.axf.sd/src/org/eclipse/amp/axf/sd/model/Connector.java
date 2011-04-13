package org.eclipse.amp.axf.sd.model;

/**
 * Connection between two dynamic variables. For example between a "stock" and a "flow".
 * 
 * @author fei
 */
public class Connector {
	/** The element to connect to. */
	private AbstractVariable toElement;

	/**
	 * @param toElement
	 *          {@link #toElement}
	 */
	public void setToElement(AbstractVariable toElement) {
		this.toElement = toElement;
	}

	public AbstractVariable getToElement() {
		return toElement;
	}
}
