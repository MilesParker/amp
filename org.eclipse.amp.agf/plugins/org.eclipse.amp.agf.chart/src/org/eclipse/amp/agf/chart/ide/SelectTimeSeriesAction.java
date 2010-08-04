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

import org.eclipse.amp.agf.chart.ChartType;
import org.eclipse.amp.agf.chart.IChartDesignStrategy;
import org.eclipse.jface.action.IAction;


// TODO: Auto-generated Javadoc
/**
 * The Class DisplayLegendAction.
 */
public class SelectTimeSeriesAction extends ChartAction {

    /**
     *
     * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
     */
    public void run(IAction action) {
        IChartDesignStrategy createChart = ChartType.TIME_SERIES.createStrategy();
        getEditor().setChartStrategy(createChart);
        createChart.update();
    }
}

