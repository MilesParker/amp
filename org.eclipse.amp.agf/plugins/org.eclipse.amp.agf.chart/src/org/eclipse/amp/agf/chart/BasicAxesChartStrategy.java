package org.eclipse.amp.agf.chart;

import java.util.List;

import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.ChartWithAxes;
import org.eclipse.birt.chart.model.attribute.AxisType;
import org.eclipse.birt.chart.model.attribute.IntersectionType;
import org.eclipse.birt.chart.model.attribute.LegendItemType;
import org.eclipse.birt.chart.model.attribute.TickStyle;
import org.eclipse.birt.chart.model.attribute.impl.PaletteImpl;
import org.eclipse.birt.chart.model.component.Axis;
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.component.impl.SeriesImpl;
import org.eclipse.birt.chart.model.data.DataSet;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.data.impl.NumberDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.SeriesDefinitionImpl;
import org.eclipse.birt.chart.model.data.impl.TextDataSetImpl;
import org.eclipse.birt.chart.model.impl.ChartWithAxesImpl;


public abstract class BasicAxesChartStrategy extends BasicChartStrategy {

    public void update() {
    }

    public Chart createChart(IDataProvider dataProvider, Object dataSource) {
        this.dataProvider = dataProvider;
        this.dataSource = dataSource;
        ChartWithAxes chart = ChartWithAxesImpl.create();
        setChart(chart);
        chart.setUnitSpacing(20);

        // X-Axis
        Axis xAxisPrimary = getXAxisPrimary();
        xAxisPrimary.setType(AxisType.TEXT_LITERAL);
        xAxisPrimary.getTitle().getCaption().setValue("Period");
        xAxisPrimary.getTitle().setVisible(true);
        xAxisPrimary.getMajorGrid().setTickStyle(TickStyle.BELOW_LITERAL);
        xAxisPrimary.getOrigin().setType(IntersectionType.VALUE_LITERAL);
        createXSeriesDefinition();

        Axis yAxisPrimary = getYAxisPrimary();
        yAxisPrimary.getMajorGrid().setTickStyle(TickStyle.LEFT_LITERAL);
        yAxisPrimary.setType(AxisType.LINEAR_LITERAL);
        yAxisPrimary.getLabel().getCaption().getFont().setRotation(90);
        createYSeriesDefinition();

        DataSet periods = TextDataSetImpl.create(dataProvider.getCategoryLabels(dataSource));
        SeriesDefinition xSeriesDefinition = getXSeriesDefinition();
        xSeriesDefinition.getSeries().get(0).setDataSet(periods);
        return chart;
    }

    public void createLegend() {
        super.createLegend();
        getLegend().setItemType(LegendItemType.SERIES_LITERAL);
    }

    protected abstract void addValueSet(Object valueSet);

    public void updateSelection() {
        List valueSets = dataProvider.getValueSets(dataSource);
        getValueSetsDefinition().getSeries().clear();
        for (Object valueSet : valueSets) {
            addValueSet(valueSet);
        }
    }

    private void createXSeriesDefinition() {
        SeriesDefinition xSeriesDefinition = SeriesDefinitionImpl.create();
        Axis xAxisPrimary = getXAxisPrimary();
        xAxisPrimary.getSeriesDefinitions().clear();
        xAxisPrimary.getSeriesDefinitions().add(xSeriesDefinition);
        xSeriesDefinition.getSeriesPalette().shift(0);

        Series xSeriesCategory = SeriesImpl.create();
        xSeriesDefinition.getSeries().clear();
        xSeriesDefinition.getSeries().add(xSeriesCategory);
    }

    private void createYSeriesDefinition() {
        SeriesDefinition ySeriesDefinition = SeriesDefinitionImpl.create();
        Axis yAxisPrimary = getYAxisPrimary();
        yAxisPrimary.getSeriesDefinitions().clear();
        yAxisPrimary.getSeriesDefinitions().add(ySeriesDefinition);
        ySeriesDefinition.setSeriesPalette(PaletteImpl.create(0, true));
    }

    protected void addValueSeries(Series series, Object valueSet) {
        DataSet data = NumberDataSetImpl.create(dataProvider.getValues(valueSet));
        series.setDataSet(data);
        getValueSetsDefinition().getSeries().add(series);
        series.getLabel().setVisible(false);
        series.setSeriesIdentifier(dataProvider.getText(valueSet));
    }

    /**
     * @return
     * @see org.eclipse.amp.agf.chart.IChartDesignStrategy#isInitialized()
     */
    public boolean isInitialized() {
        return getXSeriesDefinition().getSeries().size() > 0
        && getXSeriesDefinition().getSeries().get(0).getDataSet() != null
            && !((List) getXSeriesDefinition().getSeries().get(0).getDataSet().getValues()).isEmpty();
    }

    private Axis getXAxisPrimary() {
        return ((ChartWithAxes) getChart()).getPrimaryBaseAxes()[0];
    }

    private Axis getYAxisPrimary() {
        return ((ChartWithAxes) getChart()).getPrimaryOrthogonalAxis(getXAxisPrimary());
    }

    private SeriesDefinition getYSeriesDefinition() {
        return getYAxisPrimary().getSeriesDefinitions().get(0);
    }

    private SeriesDefinition getXSeriesDefinition() {
        return getXAxisPrimary().getSeriesDefinitions().get(0);
    }

    public SeriesDefinition getValueSetsDefinition() {
        return getYSeriesDefinition();
    }
}
