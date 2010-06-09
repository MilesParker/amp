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

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.core.IObservationProvider;
import org.eclipse.amp.axf.view.SWTAsyncModelListener;
import org.eclipse.birt.chart.api.ChartEngine;
import org.eclipse.birt.chart.device.ICallBackNotifier;
import org.eclipse.birt.chart.device.IDeviceRenderer;
import org.eclipse.birt.chart.exception.ChartException;
import org.eclipse.birt.chart.factory.GeneratedChartState;
import org.eclipse.birt.chart.factory.Generator;
import org.eclipse.birt.chart.factory.RunTimeContext;
import org.eclipse.birt.chart.log.ILogger;
import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.attribute.Bounds;
import org.eclipse.birt.chart.model.attribute.CallBackValue;
import org.eclipse.birt.chart.model.attribute.ColorDefinition;
import org.eclipse.birt.chart.model.attribute.Fill;
import org.eclipse.birt.chart.model.attribute.Palette;
import org.eclipse.birt.chart.model.attribute.impl.BoundsImpl;
import org.eclipse.birt.chart.model.attribute.impl.ColorDefinitionImpl;
import org.eclipse.birt.chart.model.attribute.impl.PaletteImpl;
import org.eclipse.birt.chart.script.IChartScriptContext;
import org.eclipse.birt.chart.script.IExternalContext;
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
import org.eclipse.emf.common.util.EList;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.statushandlers.StatusManager;

import com.ibm.icu.util.ULocale;

// TODO: Auto-generated Javadoc
/**
 * The Class ChartEditPart.
 */
public class ChartEditPart extends AbstractGraphicalEditPart implements ICallBackNotifier {

    private static final long serialVersionUID = 1L;

    private Chart chart;

    private IDeviceRenderer renderer;

    private GeneratedChartState chartState;

    private IDataProvider dataProvider;

    private IColorProvider seriesColorProvider;

    private Palette genericPalette;

    /**
     * Sets the series color provider.
     * 
     * @param seriesColorProvider the new series color provider
     */
    public void setSeriesColorProvider(IColorProvider seriesColorProvider) {
        this.seriesColorProvider = seriesColorProvider;
    }

    private Object dataSource;

    private GC imageGC;

    private Image image;

    private ChartModelListener chartListener;

    // private RunTimeContext rtc;

    IFigure imageFigure;

    Collection<NameColorPair> seriesCache = new HashSet<NameColorPair>();

    private IDataSelectionListener dataListener;

    private int nextOpenPaletteIndex;

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
        genericPalette = PaletteImpl.create(0, true);
        genericPalette.shift(0);
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
            super(null, "Chart Updated View", 10000);
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
            setChartStrategy(ChartType.TIME_SERIES.createStrategy());
            chartUpated = true;
        }

        /**
         * @param observed
         * @see org.eclipse.amp.axf.core.AbstractLifecycleListener#observeStart(org.eclipse.amp.axf.core.IObservationProvider)
         */
        public void observeStart(IObservationProvider observed) {
            updateChartSelection();
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
            chartStrategy.update();
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

        // /**
        // * @return
        // * @see org.eclipse.amp.axf.view.SWTThreadModelListener#getWidget()
        // */
        // public Control getWidget() {
        // if (getViewer() != null) {
        // return getViewer().getControl();
        // }
        // return null;
        // }
    };

    IChartScriptContext csc = new IChartScriptContext() {

        public void setProperty(Object key, Object value) {
        }

        public ULocale getULocale() {
            return null;
        }

        public Object getProperty(Object key) {
            return null;
        }

        public ILogger getLogger() {
            return null;
        }

        public Locale getLocale() {
            return null;
        }

        public IExternalContext getExternalContext() {
            return null;
        }

        public Chart getChartInstance() {
            return chart;
        }
    };

    private IChartDesignStrategy chartStrategy;

    private void updateValueSetColor(Object valueSet, int index) {
        String seriesLabel = dataProvider.getText(valueSet);
        Color swtColor = seriesColorProvider.getForeground(seriesLabel);
        EList<Fill> entries = chartStrategy.getValueSetsDefinition().getSeriesPalette().getEntries();
        ColorDefinition cd = null;
        if (swtColor == null) {
            // List<Fill> palette = ySeriesDefinition.getSeriesPalette().getEntries();
            // if (nextOpenPaletteIndex >= palette.size()) {
            // nextOpenPaletteIndex = 0;
            // }
            // cd = (ColorDefinition) palette.get(nextOpenPaletteIndex);
            // Color lineColor = new Color(org.eclipse.swt.widgets.Display.getCurrent(), cd.getRed(), cd.getGreen(), cd
            // .getBlue());
            if (seriesColorProvider instanceof CachedColorProvider) {
                cd = (ColorDefinition) genericPalette.getEntries().get(nextOpenPaletteIndex++);
                if (nextOpenPaletteIndex > genericPalette.getEntries().size() - 1) {
                    nextOpenPaletteIndex = 0;
                }
                swtColor = new Color(org.eclipse.swt.widgets.Display.getCurrent(), cd.getRed(), cd.getGreen(), cd
                                     .getBlue());
                ((CachedColorProvider) seriesColorProvider).putForegroundColor(seriesLabel, swtColor);
            }
        } else {
            cd = ColorDefinitionImpl.create(swtColor.getRed(), swtColor.getGreen(), swtColor.getBlue());
            // if (chartType == ChartType.TIME_SERIES) {
            // cd = ((LineSeries) lineSeries).getLineAttributes().getColor();
            // } else if (chartType == ChartType.STACKED_AREA) {
            // cd = ((AreaSeries) lineSeries).getLineAttributes().getColor();
            // }
            // cd.setRed(swtColor.getRed());
            // cd.setGreen(swtColor.getGreen());
            // cd.setBlue(swtColor.getBlue());
        }
        entries.add(cd);
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
                regenerateChart(true);
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
            if (chart != null && chartStrategy.isInitialized() && getFigure() != null
                    && !getFigure().getSize().isEmpty()) {
                createImage();
                Dimension area = getFigure().getSize();
                Bounds chartBounds = BoundsImpl.create(0, 0, area.width, area.height);
                chartBounds.scale(72d / renderer.getDisplayServer().getDpiResolution());
                Generator gr = Generator.instance();
                RunTimeContext rtc = new RunTimeContext();
                rtc.setScriptingEnabled(false);

                // rtc.setScriptContext(csc);
                // csc.setChartInstance(chart);
                chartState = gr.build(renderer.getDisplayServer(), chart, chartBounds, rtc);
                gr.render(renderer, chartState);
                imageFigure.repaint();
            } else {
                chartListener.endPainting();
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
        chart = chartStrategy.createChart(dataProvider, dataSource);

        chart.getTitle().getLabel().setVisible(false);
    }

    boolean chartUpated = false;

    /**
     * Update chart series.
     */
    public synchronized void updateChartSelection() {
        chartStrategy.updateSelection();
        List valueSets = dataProvider.getValueSets(dataSource);
        chartStrategy.getValueSetsDefinition().getSeriesPalette().getEntries().clear();
        int index = 0;
        for (Object valueSet : valueSets) {
            updateValueSetColor(valueSet, index);
            index++;
        }
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
    public Chart getChart() {
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
        dataSource = dataProvider.getDataSource(getModel());
        dataListener = new IDataSelectionListener() {
            public void selectionChanged(Object dataSet) {
                if (getParent() != null && getRoot() != null && getViewer() != null && chart != null) {
                    updateChartSelection();
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
     * @param chartType the chartType to set
     */
    public void setChartStrategy(IChartDesignStrategy chartStrategy) {
        this.chartStrategy = chartStrategy;
        createChart();
        updateChartSelection();
        if (getViewer().getControl().getDisplay() != null) {
            getViewer().getControl().getDisplay().asyncExec(new Runnable() {
                public void run() {
                    repaintChart();
                }
            });
        }
    }

    /**
     * Gets the series color provider.
     * 
     * @return the series color provider
     */
    public IColorProvider getSeriesColorProvider() {
        return seriesColorProvider;
    }
}
