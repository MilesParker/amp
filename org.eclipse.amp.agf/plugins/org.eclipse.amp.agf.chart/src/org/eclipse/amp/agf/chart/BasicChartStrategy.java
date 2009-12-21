package org.eclipse.amp.agf.chart;

import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.attribute.Anchor;
import org.eclipse.birt.chart.model.attribute.LineAttributes;
import org.eclipse.birt.chart.model.attribute.LineStyle;
import org.eclipse.birt.chart.model.layout.Legend;

public abstract class BasicChartStrategy implements IChartDesignStrategy {

    protected IDataProvider dataProvider;
    protected Object dataSource;

    private Chart chart;

    private Legend legend;

    public void createLegend() {
        legend = chart.getLegend();
        LineAttributes lia = legend.getOutline();
        legend.getText().getFont().setSize(10);
        lia.setStyle(LineStyle.SOLID_LITERAL);
        legend.getInsets().set(10, 5, 0, 0);
        legend.getOutline().setVisible(false);
        legend.setAnchor(Anchor.EAST_LITERAL);
    }

    public void setChart(Chart chart) {
        this.chart = chart;
        createLegend();
    }

    public Chart getChart() {
        return chart;
    }

    public Legend getLegend() {
        return legend;
    }
}
