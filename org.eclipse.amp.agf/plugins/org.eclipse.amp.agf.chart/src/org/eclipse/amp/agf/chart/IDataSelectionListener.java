/**
 * <copyright>
 *
 * Copyright (c) 2009 Metascape, LLC.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Metascape - Initial API and Implementation
 *
 * </copyright>
 *
 */
package org.eclipse.amp.agf.chart;

// TODO: Auto-generated Javadoc
/**
 * The listener interface for receiving IDataSelection events. The class that is interested in processing a
 * IDataSelection event implements this interface, and the object created with that class is registered with a component
 * using the component's <code>addDataSelectionListener<code> method. When
 * the IDataSelection event occurs, that object's appropriate
 * method is invoked.
 * 
 * @see IDataSelectionEvent
 */
public interface IDataSelectionListener {

    /**
     * Selection changed.
     * 
     * @param dataSet the data set
     */
    public void selectionChanged(Object dataSet);
}
