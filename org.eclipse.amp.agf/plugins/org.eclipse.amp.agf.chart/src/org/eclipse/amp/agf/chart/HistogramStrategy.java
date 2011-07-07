package org.eclipse.amp.agf.chart;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.ChartWithAxes;
import org.eclipse.birt.chart.model.attribute.AxisType;
import org.eclipse.birt.chart.model.attribute.IntersectionType;
import org.eclipse.birt.chart.model.attribute.LegendItemType;
import org.eclipse.birt.chart.model.attribute.Position;
import org.eclipse.birt.chart.model.attribute.TickStyle;
import org.eclipse.birt.chart.model.attribute.impl.ColorDefinitionImpl;
import org.eclipse.birt.chart.model.component.Axis;
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.component.impl.SeriesImpl;
import org.eclipse.birt.chart.model.data.NumberDataSet;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.data.TextDataSet;
import org.eclipse.birt.chart.model.data.impl.NumberDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.SeriesDefinitionImpl;
import org.eclipse.birt.chart.model.data.impl.TextDataSetImpl;
import org.eclipse.birt.chart.model.impl.ChartWithAxesImpl;
import org.eclipse.birt.chart.model.layout.Block;
import org.eclipse.birt.chart.model.layout.Plot;
import org.eclipse.birt.chart.model.type.BarSeries;
import org.eclipse.birt.chart.model.type.impl.BarSeriesImpl;

public class HistogramStrategy extends BasicChartStrategy {

    private SeriesDefinition xSeriesDefinition;
    private SeriesDefinition valueDefinition;

    List<List<Double>> numbersLists = new ArrayList<List<Double>>();
    List<List<String>> labelsLists = new ArrayList<List<String>>();

    public Chart createChart(IDataProvider dataProvider, Object dataSource) {
        this.dataProvider = dataProvider;
        this.dataSource = dataSource;

        ChartWithAxes chart = ChartWithAxesImpl.create();
        chart.setType("Bar Chart"); //$NON-NLS-1$
        chart.setSubType("Stacked"); //$NON-NLS-1$

        // Plot
        chart.getBlock().setBackground(ColorDefinitionImpl.WHITE());
        chart.getBlock().getOutline().setVisible(true);
        Plot p = chart.getPlot();
        p.getClientArea().setBackground(ColorDefinitionImpl.WHITE());
        p.setBackground(ColorDefinitionImpl.WHITE());
        for (Block block : p.getChildren()) {
            block.setBackground(ColorDefinitionImpl.WHITE());
        }

        // X-Axis
        Axis xAxisPrimary = chart.getPrimaryBaseAxes()[0];

        xAxisPrimary.setType(AxisType.TEXT_LITERAL);
        xAxisPrimary.getMajorGrid().setTickStyle(TickStyle.BELOW_LITERAL);
        xAxisPrimary.getOrigin().setType(IntersectionType.MIN_LITERAL);
        xAxisPrimary.setCategoryAxis(true);

        // Y-Axis
        Axis yAxisPrimary = chart.getPrimaryOrthogonalAxis(xAxisPrimary);
        yAxisPrimary.getMajorGrid().setTickStyle(TickStyle.LEFT_LITERAL);
        yAxisPrimary.setType(AxisType.LINEAR_LITERAL);
        yAxisPrimary.getLabel().getCaption().getFont().setRotation(90);


        xSeriesDefinition = SeriesDefinitionImpl.create();
        xAxisPrimary.getSeriesDefinitions().add(xSeriesDefinition);
        xSeriesDefinition.getSeriesPalette().shift(0);

        valueDefinition = SeriesDefinitionImpl.create();
        // valueDefinition.getSeriesPalette().shift(0);
        yAxisPrimary.getSeriesDefinitions().add(valueDefinition);
        return chart;
    }

    public void update() {
        int index = 0;
        for (Object valueSet : dataProvider.getValueSets(dataSource)) {
            List<Double> values = (List<Double>) dataProvider.getValues(valueSet);
            numbersLists.get(index).set(0, values.get(values.size() - 1));
            String text = dataProvider.getText(valueSet);
            labelsLists.get(index++).set(0, text);
        }
    }

    public void updateSelection() {
        valueDefinition.getSeries().clear();
        xSeriesDefinition.getSeries().clear();
        numbersLists = new ArrayList<List<Double>>();
        labelsLists = new ArrayList<List<String>>();
        for (Object valueSet : dataProvider.getValueSets(dataSource)) {
            Double number = 0.0;
            List<Double> valueList = new ArrayList<Double>();
            valueList.add(number);
            NumberDataSet numberSet = NumberDataSetImpl.create(valueList);
            numbersLists.add(valueList);
            BarSeries valueSeries = (BarSeries) BarSeriesImpl.create();
            valueSeries.setDataSet(numberSet);
            // valueSeries.setStacked(true);
            valueSeries.getLabel().setVisible(true);
            valueSeries.setLabelPosition(Position.INSIDE_LITERAL);
            valueDefinition.getSeries().add(valueSeries);
            String text = dataProvider.getText(valueSet);
            valueSeries.setSeriesIdentifier(text);
            List<String> labelList = new ArrayList<String>();
            // X-Series
            labelList.add("");
            TextDataSet labelSet = TextDataSetImpl.create(labelList);//$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$ //$NON-NLS-4$ //$NON-NLS-5$
            labelsLists.add(labelList);
            Series labelSeries = SeriesImpl.create();
            labelSeries.setDataSet(labelSet);
            xSeriesDefinition.getSeries().add(labelSeries);
        }
    }

    @Override
		public void createLegend() {
        super.createLegend();
        getLegend().setItemType(LegendItemType.CATEGORIES_LITERAL);
    }

    /**
     * @return
     * @see org.eclipse.amp.agf.chart.IChartDesignStrategy#isInitialized()
     */
    public boolean isInitialized() {
        return xSeriesDefinition.getSeries().size() > 0;
    }

    public SeriesDefinition getValueSetsDefinition() {
        return valueDefinition;
    }


}
