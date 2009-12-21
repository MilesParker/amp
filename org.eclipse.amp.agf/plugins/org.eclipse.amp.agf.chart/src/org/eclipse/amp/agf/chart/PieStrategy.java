package org.eclipse.amp.agf.chart;

import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.ChartWithoutAxes;
import org.eclipse.birt.chart.model.attribute.ChartDimension;
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.component.impl.SeriesImpl;
import org.eclipse.birt.chart.model.data.NumberDataSet;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.data.TextDataSet;
import org.eclipse.birt.chart.model.data.impl.NumberDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.SeriesDefinitionImpl;
import org.eclipse.birt.chart.model.data.impl.TextDataSetImpl;
import org.eclipse.birt.chart.model.impl.ChartWithoutAxesImpl;
import org.eclipse.birt.chart.model.type.PieSeries;
import org.eclipse.birt.chart.model.type.impl.PieSeriesImpl;

public class PieStrategy extends LastValueStrategy {

    private PieSeries numberSeries;
    private Series labelSeries;
    private SeriesDefinition labelDefinition;
    private SeriesDefinition numberDefinition;

    public Chart createChart(IDataProvider dataProvider, Object dataSource) {
        this.dataProvider = dataProvider;
        this.dataSource = dataSource;
        ChartWithoutAxes chart = ChartWithoutAxesImpl.create();
        setChart(chart);
        chart.setDimension(ChartDimension.TWO_DIMENSIONAL_LITERAL);
        chart.setType("Pie Chart"); //$NON-NLS-1$
        chart.setSubType("Standard Pie Chart"); //$NON-NLS-1$

        // Plot
        chart.setSeriesThickness(10);

        // Data Set
        TextDataSet labelSet = TextDataSetImpl.create(getLabels());//$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
        NumberDataSet numberSet = NumberDataSetImpl.create(getNumbers());

        labelSeries = SeriesImpl.create();
        labelSeries.setDataSet(labelSet);

        labelDefinition = SeriesDefinitionImpl.create();
        chart.getSeriesDefinitions().add(labelDefinition);
        labelDefinition.getSeriesPalette().shift(0);
        labelDefinition.getSeries().add(labelSeries);

        numberSeries = (PieSeries) PieSeriesImpl.create();
        numberSeries.setDataSet(numberSet);
        numberSeries.setExplosion(0);

        numberDefinition = SeriesDefinitionImpl.create();
        numberDefinition.getSeries().add(numberSeries);
        labelDefinition.getSeriesDefinitions().add(numberDefinition);
        return chart;
    }

    public SeriesDefinition getValueSetsDefinition() {
        return labelDefinition;
    }
}
