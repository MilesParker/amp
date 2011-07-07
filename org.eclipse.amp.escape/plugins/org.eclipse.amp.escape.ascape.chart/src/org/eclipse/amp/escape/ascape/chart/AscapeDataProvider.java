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
package org.eclipse.amp.escape.ascape.chart;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import org.ascape.model.Scape;
import org.ascape.util.data.DataSelection;
import org.ascape.util.data.DataSeriesStore;
import org.eclipse.amp.agf.chart.IDataProvider;
import org.eclipse.amp.agf.chart.IDataSelectionListener;
import org.eclipse.amp.escape.ascape.wrap.ScapeWrapperModel;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;

// TODO: Auto-generated Javadoc

public class AscapeDataProvider implements IDataProvider, ILabelProvider {

    private Map<Scape, DataSelection> dataSelectionForScape = new HashMap<Scape, DataSelection>();

    private Map<IDataSelectionListener, Observer> observerForListener = new HashMap<IDataSelectionListener, Observer>();

    /**
     * @param model
     * @return
     * @see org.eclipse.amp.agf.chart.IDataProvider#getDataSource(java.lang.Object)
     */
    public Object getDataSource(Object model) {
        Scape scape = ((ScapeWrapperModel) model).getScape();
        DataSelection dataSelection = dataSelectionForScape.get(scape);
        if (dataSelection == null) {
            dataSelection = new DataSelection();
            dataSelection.setData(scape.getData());
            dataSelectionForScape.put(scape, dataSelection);
        }
        return dataSelection;
    }

    /**
     * @param dataSource
     * @return
     * @see org.eclipse.amp.agf.chart.IDataProvider#getCategoryLabels(java.lang.Object)
     */
    @SuppressWarnings("unchecked")
    public List<String> getCategoryLabels(Object dataSource) {
        return ((DataSelection) dataSource).getData().getPeriods();
    }

    /**
     * @param valueSource
     * @return
     * @see org.eclipse.amp.agf.chart.IDataProvider#getValues(java.lang.Object)
     */
    public Object getValues(Object valueSource) {
        return ((DataSeriesStore) valueSource).toList();
    }

    /**
     * @param valueSelection
     * @return
     * @see org.eclipse.amp.agf.chart.IDataProvider#getValueSets(java.lang.Object)
     */
    public List getValueSets(Object valueSelection) {
        return ((DataSelection) valueSelection).getSelectedSeries();
    }

    // TODO use normal selection paradigm?
    /**
     * @param dataSource
     * @param listener
     * @see org.eclipse.amp.agf.chart.IDataProvider#addListener(java.lang.Object, org.eclipse.amp.agf.chart.IDataSelectionListener)
     */
    public void addListener(final Object dataSource, final IDataSelectionListener listener) {
        DataSelection selection = (DataSelection) dataSource;
        Observer observer = new Observer() {
            public void update(Observable arg0, Object arg1) {
                listener.selectionChanged(dataSource);
            }
        };
        observerForListener.put(listener, observer);
        selection.addObserver(observer);
    }

    /**
     * @param dataSource
     * @param listener
     * @see org.eclipse.amp.agf.chart.IDataProvider#removeListener(java.lang.Object, org.eclipse.amp.agf.chart.IDataSelectionListener)
     */
    public void removeListener(final Object dataSource, IDataSelectionListener listener) {
        DataSelection selection = (DataSelection) dataSource;
        Observer observer = observerForListener.get(listener);
        selection.deleteObserver(observer);
    }

    /**
     * @param element
     * @return
     * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
     */
    public Image getImage(Object element) {
        return null;
    }

    /**
     * @param valueSource
     * @return
     * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
     */
    public String getText(Object valueSource) {
        return ((DataSeriesStore) valueSource).getName();
    }

    /**
     * @param listener
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
     */
    public void addListener(ILabelProviderListener listener) {
    	//
    }

    /**
     * 
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
     */
    public void dispose() {
    	//
    }

    /**
     * @param element
     * @param property
     * @return
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang.Object, java.lang.String)
     */
    public boolean isLabelProperty(Object element, String property) {
        return false;
    }

    /**
     * @param listener
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse.jface.viewers.ILabelProviderListener)
     */
    public void removeListener(ILabelProviderListener listener) {
    	//
    }
}
