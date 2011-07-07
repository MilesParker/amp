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

import java.util.List;

import org.eclipse.jface.viewers.ILabelProvider;

// TODO: Auto-generated Javadoc

public interface IDataProvider extends ILabelProvider {
	
	public static final String ID = "org.eclipse.amp.agf.chart.IDataProvider";
	/**
	 * Gets the data source.
	 * 
	 * @param model the model
	 * 
	 * @return the data source
	 */
	public Object getDataSource(Object model);

	/**
	 * Adds the listener.
	 * 
	 * @param dataSource the data source
	 * @param listener the listener
	 */
	public void addListener(Object dataSource, IDataSelectionListener listener);

	/**
	 * Removes the listener.
	 * 
	 * @param dataSource the data source
	 * @param listener the listener
	 */
	public void removeListener(Object dataSource, IDataSelectionListener listener);

	/**
	 * Gets the values.
	 * 
	 * @param valueSet the value set
	 * 
	 * @return the values
	 */
	public Object getValues(Object valueSet);

	/**
	 * Gets the value sets.
	 * 
	 * @param valueSelection the value selection
	 * 
	 * @return the value sets
	 */
	public List getValueSets(Object valueSelection);

	/**
	 * Gets the category labels.
	 * 
	 * @param dataSource the data source
	 * 
	 * @return the category labels
	 */
	public List<String> getCategoryLabels(Object dataSource);
}
