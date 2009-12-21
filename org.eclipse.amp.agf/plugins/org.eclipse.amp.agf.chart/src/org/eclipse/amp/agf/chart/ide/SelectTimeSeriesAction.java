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
package org.eclipse.amp.agf.chart.ide;

import org.eclipse.amp.agf.chart.ChartEditPart;
import org.eclipse.amp.agf.chart.ChartType;
import org.eclipse.amp.agf.chart.ChartViewPart;
import org.eclipse.amp.agf.chart.IChartDesignStrategy;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;


// TODO: Auto-generated Javadoc
/**
 * The Class DisplayLegendAction.
 */
public class SelectTimeSeriesAction implements IViewActionDelegate {

    ChartEditPart editor;

    /**
     *
     * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
     */
    public void run(IAction action) {
        IChartDesignStrategy createChart = ChartType.TIME_SERIES.createStrategy();
        editor.setChartStrategy(createChart);
        createChart.update();
    }

    /**
     *
     * @see org.eclipse.ui.IViewActionDelegate#init(org.eclipse.ui.IViewPart)
     */
    public void init(IViewPart view) {
        editor = (ChartEditPart) ((ChartViewPart) view).getEditPart();
    }

    /**
     *
     * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
     */
    public void selectionChanged(IAction action, ISelection selection) {
    }

}
