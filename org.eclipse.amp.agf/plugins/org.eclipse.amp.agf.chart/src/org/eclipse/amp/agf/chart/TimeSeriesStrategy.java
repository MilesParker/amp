package org.eclipse.amp.agf.chart;

import org.eclipse.birt.chart.model.type.LineSeries;
import org.eclipse.birt.chart.model.type.impl.LineSeriesImpl;

public class TimeSeriesStrategy extends BasicAxesChartStrategy {

    public void addValueSet(Object valueSet) {
        LineSeries series = (LineSeries) LineSeriesImpl.create();
        series.getMarkers().clear();
        series.setPaletteLineColor(true);
        addValueSeries(series, valueSet);
    }
}
