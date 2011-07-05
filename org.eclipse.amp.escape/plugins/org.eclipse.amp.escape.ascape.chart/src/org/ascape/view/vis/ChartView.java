/*******************************************************************************
 * Copyright (c) 2009, Metascape LLC, Miles Parker.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Miles Parker - initial API and implementation
 ******************************************************************************/
package org.ascape.view.vis;
import java.util.Collection;
import java.util.HashSet;

import org.ascape.util.data.DataSelection;
import org.eclipse.amp.agf.chart.CachedColorProvider;
import org.eclipse.amp.agf.chart.ChartEditPart;
import org.eclipse.amp.agf.chart.ChartViewPart;
import org.eclipse.amp.escape.ascape.view.EditPartScapeView;
import org.eclipse.gef.EditPart;
import org.eclipse.swt.graphics.Color;



public class ChartView extends EditPartScapeView {

    private static final long serialVersionUID = 1L;
    private ChartEditPart chartPart;
    private Collection<String> seriesCache = new HashSet<String>();
    CachedColorProvider seriesColorProvider = new CachedColorProvider();

    public ChartView() {
        super(ChartViewPart.VIEW_ID, null, "Chart View");
    }

    public EditPart createEditPart(EditPart context, Object model) {
        chartPart = new ChartEditPart();
        chartPart.setSeriesColorProvider(seriesColorProvider);

        chartPart.setModel(model);
        synchCache(model);
        return chartPart;
    }

    private void synchCache(Object model) {
        DataSelection dataSelection = (DataSelection) chartPart.getDataProvider().getDataSource(model);
        for (String series : seriesCache) {
            dataSelection.setSelected(series, true);
        }
    }

    /**
     * Adds a series to the chart being viewed. Convenience method (could also get view model and set select group.)
     * 
     * @param valueName
     *        the name of the series to add
     */
    public void addSeries(String valueName) {
        seriesCache.add(valueName);
        if (chartPart != null) {
            synchCache(chartPart.getModel());
        }
    }

    /**
     * Adds a series to the chart being viewed. Convenience method.
     * 
     * @param valueName
     *        the name of the series to add
     * @param color
     *        the color to use for the series in the chart
     */
    public void addSeries(String valueName, Color color) {
        seriesColorProvider.putForegroundColor(valueName, color);
        addSeries(valueName);
    }
}
