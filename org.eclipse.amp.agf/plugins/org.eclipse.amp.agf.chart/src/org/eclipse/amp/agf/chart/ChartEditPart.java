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
package org.eclipse.amp.agf.chart;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.core.IObservationProvider;
import org.eclipse.amp.axf.view.SWTAsyncModelListener;
import org.eclipse.birt.chart.api.ChartEngine;
import org.eclipse.birt.chart.device.ICallBackNotifier;
import org.eclipse.birt.chart.device.IDeviceRenderer;
import org.eclipse.birt.chart.exception.ChartException;
import org.eclipse.birt.chart.factory.GeneratedChartState;
import org.eclipse.birt.chart.factory.Generator;
import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.ChartWithAxes;
import org.eclipse.birt.chart.model.attribute.Anchor;
import org.eclipse.birt.chart.model.attribute.AxisType;
import org.eclipse.birt.chart.model.attribute.Bounds;
import org.eclipse.birt.chart.model.attribute.CallBackValue;
import org.eclipse.birt.chart.model.attribute.ColorDefinition;
import org.eclipse.birt.chart.model.attribute.Fill;
import org.eclipse.birt.chart.model.attribute.IntersectionType;
import org.eclipse.birt.chart.model.attribute.LegendItemType;
import org.eclipse.birt.chart.model.attribute.LineAttributes;
import org.eclipse.birt.chart.model.attribute.LineStyle;
import org.eclipse.birt.chart.model.attribute.TickStyle;
import org.eclipse.birt.chart.model.attribute.impl.BoundsImpl;
import org.eclipse.birt.chart.model.component.Axis;
import org.eclipse.birt.chart.model.component.Series;
import org.eclipse.birt.chart.model.component.impl.SeriesImpl;
import org.eclipse.birt.chart.model.data.DataSet;
import org.eclipse.birt.chart.model.data.SeriesDefinition;
import org.eclipse.birt.chart.model.data.impl.NumberDataSetImpl;
import org.eclipse.birt.chart.model.data.impl.SeriesDefinitionImpl;
import org.eclipse.birt.chart.model.data.impl.TextDataSetImpl;
import org.eclipse.birt.chart.model.impl.ChartWithAxesImpl;
import org.eclipse.birt.chart.model.layout.Legend;
import org.eclipse.birt.chart.model.type.LineSeries;
import org.eclipse.birt.chart.model.type.impl.LineSeriesImpl;
import org.eclipse.birt.core.framework.PlatformConfig;
import org.eclipse.core.runtime.IAdapterManager;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.draw2d.AbstractLayout;
import org.eclipse.draw2d.Figure;
import org.eclipse.draw2d.FigureListener;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.statushandlers.StatusManager;

// TODO: Auto-generated Javadoc
/**
 * The Class ChartEditPart.
 */
public class ChartEditPart extends AbstractGraphicalEditPart implements ICallBackNotifier {

    private static final long serialVersionUID = 1L;

    private ChartWithAxes chart;

    private IDeviceRenderer renderer;

    private GeneratedChartState chartState;

    private IDataProvider dataProvider;

    private IColorProvider seriesColorProvider;

    private ILabelProvider seriesLabelProvider;

    /**
     * Gets the series label provider.
     * 
     * @return the series label provider
     */
    public ILabelProvider getSeriesLabelProvider() {
        return seriesLabelProvider;
    }

    /**
     * Sets the series label provider.
     * 
     * @param seriesLabelProvider the new series label provider
     */
    public void setSeriesLabelProvider(ILabelProvider seriesLabelProvider) {
        this.seriesLabelProvider = seriesLabelProvider;
    }

    /**
     * Gets the series color provider.
     * 
     * @return the series color provider
     */
    public IColorProvider getSeriesColorProvider() {
        return seriesColorProvider;
    }

    /**
     * Sets the series color provider.
     * 
     * @param seriesColorProvider the new series color provider
     */
    public void setSeriesColorProvider(IColorProvider seriesColorProvider) {
        this.seriesColorProvider = seriesColorProvider;
    }

    private Object dataSource;

    private Series xSeriesCategory;

    private SeriesDefinition ySeriesDefinition;

    private SeriesDefinition xSeriesDefinition;

    Set<Object> currentSeries = new HashSet<Object>();
    Map<String, Color> colorForSeries = new HashMap<String, Color>();
    Map<Series, Object> dataForSeries = new HashMap<Series, Object>();

    private GC imageGC;

    private Image image;

    private ChartModelListener chartListener;

    // private RunTimeContext rtc;

    IFigure imageFigure;

    Collection<NameColorPair> seriesCache = new HashSet<NameColorPair>();

    private IDataSelectionListener dataListener;

    private int nextPaletteIndex;

    /**
     * Instantiates a new chart edit part.
     */
    public ChartEditPart() {
        PlatformConfig config = new PlatformConfig();
        try {
            config.setProperty(IDeviceRenderer.UPDATE_NOTIFIER, this);
            renderer = ChartEngine.instance(config).getRenderer("dv.SWT");
        } catch (ChartException e) {
            throw new RuntimeException(e);
        }
        // rtc = new RunTimeContext();
        // rtc.setULocale(ULocale.getDefault());
        colorForSeries = new HashMap<String, Color>();

    }

    /**
     * The Class DataLineSeries.
     */
    class DataLineSeries extends LineSeriesImpl {

        /**
         * 
         * @see org.eclipse.birt.chart.model.type.impl.LineSeriesImpl#initialize()
         */
        protected void initialize() {
            super.initialize();
        }
    }

    /**
     * The listener interface for receiving chartModel events. The class that is interested in processing a chartModel
     * event implements this interface, and the object created with that class is registered with a component using the
     * component's <code>addChartModelListener<code> method. When
     * the chartModel event occurs, that object's appropriate
     * method is invoked.
     * 
     * @see ChartModelEvent
     */
    class ChartModelListener extends SWTAsyncModelListener {
        private static final long serialVersionUID = -6061682325662130469L;

        /**
         * Instantiates a new chart model listener.
         */
        public ChartModelListener() {
            super(null, "Chart Updated View", 5);
        }

        /**
         * @param observed
         * @see org.eclipse.amp.axf.core.AbstractLifecycleListener#observing(org.eclipse.amp.axf.core.IObservationProvider)
         */
        public void observing(IObservationProvider observed) {
            // wait for data source to be available from model set..
            while (dataProvider == null) {
                try {
                    Thread.sleep(25);
                } catch (InterruptedException e) {
                }
            }
            createChart();
        }

        /**
         * @param observed
         * @see org.eclipse.amp.axf.core.AbstractLifecycleListener#observeStart(org.eclipse.amp.axf.core.IObservationProvider)
         */
        public void observeStart(IObservationProvider observed) {
            updateChartSeries();
            endPainting();
        }

        /**
         * 
         * @see org.eclipse.amp.axf.core.AbstractLifecycleListener#observeInitialize(org.eclipse.amp.axf.core.IObservationProvider)
         */
        @Override
        public void observeInitialize(IObservationProvider model) {
            image = null;
        }

        /**
         * 
         * @see org.eclipse.amp.axf.view.SWTThreadModelListener#update(org.eclipse.amp.axf.core.IModel)
         */
        @Override
        public void update(final IModel model) {
            beginPainting();
            refresh();
        }

        /**
         * 
         * @see org.eclipse.amp.axf.core.AbstractLifecycleListener#observationEnd(org.eclipse.amp.axf.core.IObservationProvider)
         */
        public void observationEnd(IObservationProvider model) {
            dataProvider.removeListener(dataSource, dataListener);
            model = null;
        }
    };

    private void updateSeries(Series lineSeries) {
        if (lineSeries instanceof DataLineSeries) {
            ((DataLineSeries) lineSeries).initialize();
            ((LineSeries) lineSeries).getMarkers().clear();
            ((LineSeries) lineSeries).setPaletteLineColor(true);
        }
        lineSeries.getLabel().setVisible(false);
        Object valueSet = dataForSeries.get(lineSeries);
        lineSeries.setSeriesIdentifier(seriesLabelProvider.getText(valueSet));
        DataSet data = NumberDataSetImpl.create(dataProvider.getValues(valueSet));
        lineSeries.setDataSet(data);
        updateSeriesColor(lineSeries);
    }

    private void updateSeriesColor(Series object) {
        DataLineSeries lineSeries = (DataLineSeries) object;
        Object valueSet = dataForSeries.get(lineSeries);
        String seriesLabel = seriesLabelProvider.getText(valueSet);
        Color swtColor = seriesColorProvider.getForeground(seriesLabel);
        ColorDefinition cd = null;
        if (swtColor == null) {
            List<Fill> palette = ySeriesDefinition.getSeriesPalette().getEntries();
            if (nextPaletteIndex >= palette.size()) {
                nextPaletteIndex = 0;
            }
            cd = (ColorDefinition) palette.get(nextPaletteIndex);
            Color lineColor = new Color(org.eclipse.swt.widgets.Display.getCurrent(), cd.getRed(), cd.getGreen(), cd
                                        .getBlue());
            if (seriesColorProvider instanceof CachedColorProvider) {
                ((CachedColorProvider) seriesColorProvider).putForegroundColor(seriesLabel, lineColor);
            }
            nextPaletteIndex++;
        } else {
            cd = lineSeries.getLineAttributes().getColor();
            cd.setRed(swtColor.getRed());
            cd.setGreen(swtColor.getGreen());
            cd.setBlue(swtColor.getBlue());
        }
        lineSeries.getLineAttributes().setColor(cd);
        lineSeries.setPaletteLineColor(false);
    }
    /**
     * 
     * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
     */
    protected IFigure createFigure() {
        chartListener.setWidget(getViewer().getControl());

        imageFigure = new Figure() {
            public void paintFigure(Graphics graphics) {
                if (image != null) {
                    graphics.drawImage(image, 0, 0);
                    if (chartListener != null) {
                        chartListener.endPainting();
                    }
                }
            }
        };

        imageFigure.setLayoutManager(new AbstractLayout() {
            public Dimension getMinimumSize(IFigure container, int hintWidth, int hintHeight) {

                return new Dimension(hintWidth < 1 ? 1 : hintWidth, hintHeight < 1 ? 1 : hintHeight);
            }

            protected Dimension calculatePreferredSize(IFigure container, int hintWidth, int hintHeight) {

                return new Dimension(hintWidth < 1 ? 100 : hintWidth, hintHeight < 1 ? 100 : hintHeight);
            }

            public void layout(IFigure container) {
                imageFigure.setLocation(new Point(0, 0));
            }
        });
        imageFigure.addFigureListener(new FigureListener() {
            public void figureMoved(IFigure source) {
                regenerateChart();
            }
        });
        return imageFigure;
    }

    /**
     * 
     * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
     */
    protected void createEditPolicies() {
    }

    /**
     * 
     * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#refresh()
     */
    public void refresh() {
        new Thread() {
            public void run() {
                regenerateChart(false);
            };
        }.run();
    }

    /**
     * 
     * @see org.eclipse.gef.editparts.AbstractEditPart#setModel(java.lang.Object)
     */
    public void setModel(Object model) {
        super.setModel(model);
        chartListener = new ChartModelListener();
        ((IModel) model).addModelListener(chartListener);
        IAdapterManager adapterManager = Platform.getAdapterManager();
        // We seem to need to force loading of the data provider, at least in the exemplar case
        Object provider = adapterManager.loadAdapter(this.getModel(), "org.eclipse.amp.agf.chart.IDataProvider");

        if (!(provider instanceof IDataProvider)) {
            throw new RuntimeException(
                                       "Couldn't find data provider for chart model. Please ensure that a data provider adapter has been defined for the class: "
                                       + this.getModel().getClass());
        }

        setDataProvider((IDataProvider) provider);

        // createChart();
    }

    /**
     * 
     * @see org.eclipse.birt.chart.device.IUpdateNotifier#regenerateChart()
     */
    public void regenerateChart() {
        regenerateChart(true);
    }

    /**
     * Regenerate chart.
     * 
     * @param forceNewImage the force new image
     */
    public synchronized void regenerateChart(boolean forceNewImage) {
        if (forceNewImage) {
            image = null;
        }
        try {
            if (chart != null && getFigure() != null && !getFigure().getSize().isEmpty() && ySeriesDefinition != null) {
                createImage();
                Dimension area = getFigure().getSize();
                Bounds chartBounds = BoundsImpl.create(0, 0, area.width, area.height);
                chartBounds.scale(72d / renderer.getDisplayServer().getDpiResolution());
                Generator gr = Generator.instance();
                chartState = gr.build(renderer.getDisplayServer(), chart, chartBounds, null, null, null);
                gr.render(renderer, chartState);
                imageFigure.repaint();
            }
        } catch (ChartException ce) {
            StatusManager.getManager().handle(
                                              new Status(Status.WARNING, "org.eclipse.amp.agf.chart",
                                                         "Couldn't generate chart.", ce));
            chartListener.endPainting();
        }
    }

    /**
     * Creates the image.
     */
    public void createImage() {
        Dimension area = getFigure().getSize();
        org.eclipse.swt.graphics.Rectangle swtBounds = new org.eclipse.swt.graphics.Rectangle(0, 0, Math
                                                                                              .max(area.width, 10), Math.max(area.height, 10));
        if (image == null || !image.getBounds().equals(swtBounds)) {
            if (image != null) {
                image.dispose();
                imageGC.dispose();
            }
            image = new Image(getViewer().getControl().getDisplay(), swtBounds);
            imageGC = new GC(image);
            renderer.setProperty(IDeviceRenderer.GRAPHICS_CONTEXT, imageGC);
        }
    }

    /**
     * Creates the chart.
     */
    public synchronized void createChart() {
        chart = ChartWithAxesImpl.create();
        // Color gray = getFigure().getBackgroundColor();
        // chart.getBlock().setBackground(ColorDefinitionImpl.create(gray.getRed(), gray.getGreen(), gray.getBlue()));
        chart.getTitle().getLabel().setVisible(false); //$NON-NLS-1$
        chart.setUnitSpacing(20);
        createTSChart();
    }

    private void createTSChart() {
        Legend lg = chart.getLegend();
        LineAttributes lia = lg.getOutline();
        lg.getText().getFont().setSize(16);
        lia.setStyle(LineStyle.SOLID_LITERAL);
        lg.getInsets().set(10, 5, 0, 0);
        lg.getOutline().setVisible(false);
        lg.setAnchor(Anchor.EAST_LITERAL);
        lg.setItemType(LegendItemType.SERIES_LITERAL);

        // X-Axis
        Axis xAxisPrimary = chart.getPrimaryBaseAxes()[0];

        xAxisPrimary.setType(AxisType.TEXT_LITERAL);
        xAxisPrimary.getMajorGrid().setTickStyle(TickStyle.BELOW_LITERAL);
        xAxisPrimary.getOrigin().setType(IntersectionType.VALUE_LITERAL);
        xAxisPrimary.getTitle().getCaption().setValue("Period");
        xAxisPrimary.getTitle().setVisible(true);

        Axis yAxisPrimary = chart.getPrimaryOrthogonalAxis(xAxisPrimary);
        yAxisPrimary.getMajorGrid().setTickStyle(TickStyle.LEFT_LITERAL);
        yAxisPrimary.setType(AxisType.LINEAR_LITERAL);
        yAxisPrimary.getLabel().getCaption().getFont().setRotation(90);

        xSeriesDefinition = SeriesDefinitionImpl.create();
        xAxisPrimary.getSeriesDefinitions().add(xSeriesDefinition);
        xSeriesDefinition.getSeriesPalette().shift(0);
        xSeriesCategory = SeriesImpl.create();
        xSeriesDefinition.getSeries().add(xSeriesCategory);

        ySeriesDefinition = SeriesDefinitionImpl.create();
        yAxisPrimary.getSeriesDefinitions().add(ySeriesDefinition);
        ySeriesDefinition.getSeriesPalette().shift(-1);
        DataSet periods = TextDataSetImpl.create(dataProvider.getCategoryLabels(dataSource));
        xSeriesCategory.setDataSet(periods);
    }

    /**
     * Update chart series.
     */
    @SuppressWarnings("unchecked")
    protected synchronized void updateChartSeries() {
        List valueSets = dataProvider.getValueSets(dataSource);
        for (Object valueSet : valueSets) {
            if (!currentSeries.contains(valueSet)) {
                addSeriesFor(valueSet);
            }
        }
        currentSeries = new HashSet<Object>(valueSets);
        for (DataLineSeries lineSeries : new ArrayList<DataLineSeries>(
                (Collection<? extends DataLineSeries>) ySeriesDefinition.getSeries())) {
            Object valueSet = dataForSeries.get(lineSeries);
            if (!currentSeries.contains(valueSet)) {
                ySeriesDefinition.getSeries().remove(lineSeries);
            }
        }
    }

    private void addSeriesFor(Object valueSet) {
        Series lineSeries = new DataLineSeries();
        dataForSeries.put(lineSeries, valueSet);
        updateSeries(lineSeries);
        ySeriesDefinition.getSeries().add(lineSeries);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.swt.events.SelectionListener#widgetDefaultSelected(org.eclipse .swt.events.SelectionEvent)
     */
    /**
     * Widget default selected.
     * 
     * @param e the e
     */
    public void widgetDefaultSelected(SelectionEvent e) {
        // TODO Auto-generated method stub
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.birt.chart.device.swing.IUpdateNotifier#getDesignTimeModel()
     */
    /**
     * 
     * @see org.eclipse.birt.chart.device.IUpdateNotifier#getDesignTimeModel()
     */
    public Chart getDesignTimeModel() {
        return chart;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.birt.chart.device.swing.IUpdateNotifier#getRunTimeModel()
     */
    /**
     * 
     * @see org.eclipse.birt.chart.device.IUpdateNotifier#getRunTimeModel()
     */
    public Chart getRunTimeModel() {
        return chartState.getChartModel();
    }

    /**
     * 
     * @see org.eclipse.birt.chart.device.IUpdateNotifier#peerInstance()
     */
    public Object peerInstance() {
        return this;
    }

    /**
     * 
     * @see org.eclipse.birt.chart.device.ICallBackNotifier#callback(java.lang.Object, java.lang.Object,
     *      org.eclipse.birt.chart.model.attribute.CallBackValue)
     */
    public void callback(Object arg0, Object arg1, CallBackValue arg2) {
    }

    /**
     * Gets the chart.
     * 
     * @return the chart
     */
    public ChartWithAxes getChart() {
        return chart;
    }

    /**
     * 
     * @see org.eclipse.birt.chart.device.IUpdateNotifier#repaintChart()
     */
    public void repaintChart() {
        refresh();
    }

    /**
     * 
     * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#deactivate()
     */
    public void deactivate() {
        super.deactivate();
        dataProvider.removeListener(dataSource, dataListener);
    }

    /**
     * Gets the data provider.
     * 
     * @return the data provider
     */
    public IDataProvider getDataProvider() {
        return dataProvider;
    }

    /**
     * Sets the data provider.
     * 
     * @param dataProvider the new data provider
     */
    public synchronized void setDataProvider(IDataProvider dataProvider) {
        this.dataProvider = dataProvider;
        setSeriesLabelProvider(dataProvider);
        dataSource = dataProvider.getDataSource(getModel());
        dataListener = new IDataSelectionListener() {
            public void selectionChanged(Object dataSet) {
                if (getParent() != null && getRoot() != null && getViewer() != null && chart != null) {
                    updateChartSeries();
                    getViewer().getControl().getDisplay().asyncExec(new Runnable() {
                        public void run() {
                            regenerateChart(true);
                        }
                    });
                }
            }
        };
        dataProvider.addListener(dataSource, dataListener);
    }

    /**
     * Gets the data set.
     * 
     * @return the data set
     */
    public Object getDataSet() {
        return dataSource;
    }

    /**
     * Sets the data set.
     * 
     * @param dataSet the new data set
     */
    public void setDataSet(Object dataSet) {
        this.dataSource = dataSet;
    }

}
