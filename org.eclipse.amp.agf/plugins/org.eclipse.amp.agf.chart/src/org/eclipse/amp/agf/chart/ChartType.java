/**
 * 
 */
package org.eclipse.amp.agf.chart;


public enum ChartType {
    TIME_SERIES, STACKED_AREA, HISTOGRAM, PIE;

    public IChartDesignStrategy createStrategy() {
        switch (this) {
            case TIME_SERIES :
                return new TimeSeriesStrategy();
            case STACKED_AREA:
                return new StackAreaStrategy();
            case PIE:
                return new PieStrategy();
            case HISTOGRAM:
                return new HistogramStrategy();
        }
        return null;
    }
}