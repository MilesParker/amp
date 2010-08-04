package org.eclipse.amp.agf.chart;

import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.data.SeriesDefinition;

public interface IChartDesignStrategy {
    void update();

    Chart createChart(IDataProvider dataProvider, Object dataSource);

    public SeriesDefinition getValueSetsDefinition();

    Chart getChart();

    void setChart(Chart chart);

    void updateSelection();

    /**
     * @return
     */
    boolean isInitialized();

}
