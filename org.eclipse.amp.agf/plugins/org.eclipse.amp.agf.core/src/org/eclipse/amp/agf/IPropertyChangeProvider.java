package org.eclipse.amp.agf;

import java.beans.PropertyChangeListener;

public interface IPropertyChangeProvider {

    /**
     * Adds the property change listener.
     * 
     * @param l the l
     */
    public abstract void addPropertyChangeListener(PropertyChangeListener l);

    /**
     * Removes the property change listener.
     * 
     * @param l the l
     */
    public abstract void removePropertyChangeListener(PropertyChangeListener l);

}