package org.eclipse.amp.agf.chart;

import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.type.AreaSeries;
import org.eclipse.birt.chart.model.type.impl.AreaSeriesImpl;

public class StackAreaStrategy extends BasicAxesChartStrategy {

    public void addValueSet(Object valueSet) {
        Series series = AreaSeriesImpl.create();
        ((AreaSeries) series).getMarkers().clear();
        ((AreaSeries) series).setStacked(true);
        addValueSeries(series, valueSet);
    }
}
