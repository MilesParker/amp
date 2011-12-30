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

import java.util.List;

import org.eclipse.amp.agf.chart.ide.AGFChartPlugin;
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
import org.eclipse.birt.chart.model.Chart;
import org.eclipse.birt.chart.model.attribute.Bounds;
import org.eclipse.birt.chart.model.attribute.CallBackValue;
import org.eclipse.birt.chart.model.attribute.ColorDefinition;
import org.eclipse.birt.chart.model.attribute.Fill;
import org.eclipse.birt.chart.model.attribute.Palette;
import org.eclipse.birt.chart.model.attribute.impl.BoundsImpl;
import org.eclipse.birt.chart.model.attribute.impl.ColorDefinitionImpl;
import org.eclipse.birt.chart.model.attribute.impl.PaletteImpl;
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
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.statushandlers.StatusManager;

public class ChartEditPart extends AbstractGraphicalEditPart implements ICallBackNotifier {

	private Chart chart;

	private final ResourceManager resourceManager;

	private IDeviceRenderer renderer;

	private GeneratedChartState chartState;

	private IDataProvider dataProvider;

	private IColorProvider seriesColorProvider;

	private Palette genericPalette;

	private Object dataSource;

	private ChartModelListener chartListener;

	private IDataSelectionListener dataListener;

	private int nextOpenPaletteIndex;

	private IChartDesignStrategy chartStrategy;

	/**
	 * Instantiates a new chart edit part.
	 */
	public ChartEditPart() {
		resourceManager = new ResourceManager();
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
	 * The listener interface for receiving chartModel events. The class that is
	 * interested in processing a chartModel event implements this interface, and
	 * the object created with that class is registered with a component using the
	 * component's <code>addChartModelListener<code> method. When
	 * the chartModel event occurs, that object's appropriate
	 * method is invoked.
	 * 
	 * @see ChartModelEvent
	 */
	class ChartModelListener extends SWTAsyncModelListener {
		/**
		 * Instantiates a new chart model listener.
		 */
		public ChartModelListener() {
			super(null, "Chart Updated View", 10000);
		}

		@Override
		public void observing(IObservationProvider observed) {
			// wait for data source to be available from model set..
			while (getDataProvider() == null) {
				try {
					Thread.sleep(25);
				} catch (InterruptedException e) {
					//
				}
			}
			setChartStrategy(ChartType.TIME_SERIES.createStrategy());
		}

		@Override
		public void observeStart(IObservationProvider observed) {
			updateChartSelection();
			endPainting();
		}

		@Override
		public void observeInitialize(IObservationProvider model) {
			getResourceManager().setImage(null);
		}

		@Override
		public void update(final IModel model) {
			beginPainting();
			getChartStrategy().update();
			refresh();
		}

		@Override
		public void observationEnd(IObservationProvider model) {
			getDataProvider().removeListener(getDataSource(), getDataListener());
			model = null;
		}

	}

	private void updateValueSetColor(Object valueSet) {
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
			// Color lineColor = new
			// Color(org.eclipse.swt.widgets.Display.getCurrent(), cd.getRed(),
			// cd.getGreen(), cd
			// .getBlue());
			if (seriesColorProvider instanceof CachedColorProvider) {
				cd = (ColorDefinition) genericPalette.getEntries().get(nextOpenPaletteIndex++);
				if (nextOpenPaletteIndex > genericPalette.getEntries().size() - 1) {
					nextOpenPaletteIndex = 0;
				}
				swtColor = new Color(org.eclipse.swt.widgets.Display.getCurrent(), cd.getRed(), cd.getGreen(), cd.getBlue());
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

	@Override
	protected IFigure createFigure() {
		chartListener.setWidget(getViewer().getControl());

		final Figure newFigure = new Figure() {
			@Override
			public void paintFigure(Graphics graphics) {
				if (getResourceManager().getImage() != null) {
					graphics.drawImage(getResourceManager().getImage(), 0, 0);
					if (getChartListener() != null) {
						getChartListener().endPainting();
					}
				}
			}
		};
		newFigure.setLayoutManager(new AbstractLayout() {
			@Override
			public Dimension getMinimumSize(IFigure container, int hintWidth, int hintHeight) {
				return new Dimension(hintWidth < 1 ? 1 : hintWidth, hintHeight < 1 ? 1 : hintHeight);
			}

			@Override
			protected Dimension calculatePreferredSize(IFigure container, int hintWidth, int hintHeight) {
				return new Dimension(hintWidth < 1 ? 100 : hintWidth, hintHeight < 1 ? 100 : hintHeight);
			}

			public void layout(IFigure container) {
				newFigure.setLocation(new Point(0, 0));
			}
		});
		newFigure.addFigureListener(new FigureListener() {
			public void figureMoved(IFigure source) {
				regenerateChart();
			}
		});

		return newFigure;
	}

	@Override
	protected void createEditPolicies() {
		//
	}

	@Override
	public void refresh() {
		new Thread() {
			@Override
			public void run() {
				regenerateChart(true);
			}
		}.run();
	}

	@Override
	public void setModel(Object model) {
		super.setModel(model);
		chartListener = new ChartModelListener();
		((IModel) model).addModelListener(chartListener);
		IAdapterManager adapterManager = Platform.getAdapterManager();
		// We seem to need to force loading of the data provider, at least in the
		// exemplar case
		Object provider = adapterManager.loadAdapter(this.getModel(), IDataProvider.ID);

		if (!(provider instanceof IDataProvider)) {
			throw new RuntimeException("Couldn't find data provider for chart model. Please ensure that a data provider adapter has been defined for the class: " + this.getModel().getClass());
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
	 * @param forceNewImage
	 *          the force new image
	 */
	public synchronized void regenerateChart(boolean forceNewImage) {
		if (forceNewImage) {
			getResourceManager().setImage(null);
		}
		try {
			if (chart != null && chartStrategy.isInitialized() && getFigure() != null && !getFigure().getSize().isEmpty()) {
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
				getFigure().repaint();
			} else {
				chartListener.endPainting();
			}
		} catch (ChartException ce) {
			StatusManager.getManager().handle(new Status(Status.WARNING, AGFChartPlugin.PLUGIN_ID, "Couldn't generate chart.", ce));
			chartListener.endPainting();
		}
	}

	/**
	 * Creates the image.
	 */
	public void createImage() {
		Dimension area = getFigure().getSize();
		Rectangle swtBounds = new Rectangle(0, 0, Math.max(area.width, 10), Math.max(area.height, 10));
		if (resourceManager.getImage() == null || !resourceManager.getImage().getBounds().equals(swtBounds)) {
			resourceManager.setImage(new Image(getViewer().getControl().getDisplay(), swtBounds));
			resourceManager.setGc(new GC(resourceManager.getImage()));
			renderer.setProperty(IDeviceRenderer.GRAPHICS_CONTEXT, resourceManager.getGc());
		}
	}

	/**
	 * Creates the chart.
	 */
	public synchronized void createChart() {
		chart = chartStrategy.createChart(dataProvider, dataSource);
		chart.getTitle().getLabel().setVisible(false);
	}

	/**
	 * Update chart series.
	 */
	public synchronized void updateChartSelection() {
		chartStrategy.updateSelection();
		@SuppressWarnings("rawtypes")
		List valueSets = dataProvider.getValueSets(dataSource);
		chartStrategy.getValueSetsDefinition().getSeriesPalette().getEntries().clear();
		for (Object valueSet : valueSets) {
			updateValueSetColor(valueSet);
		}
	}

	/**
	 * 
	 * @see org.eclipse.birt.chart.device.IUpdateNotifier#getDesignTimeModel()
	 */
	public Chart getDesignTimeModel() {
		return chart;
	}

	/**
	 * 
	 * @see org.eclipse.birt.chart.device.IUpdateNotifier#getRunTimeModel()
	 */
	public Chart getRunTimeModel() {
		return chartState.getChartModel();
	}

	ChartModelListener getChartListener() {
		return chartListener;
	}

	IChartDesignStrategy getChartStrategy() {
		return chartStrategy;
	}

	Object getDataSource() {
		return dataSource;
	}

	IDataSelectionListener getDataListener() {
		return dataListener;
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
	 * @see org.eclipse.birt.chart.device.ICallBackNotifier#callback(java.lang.Object,
	 *      java.lang.Object,
	 *      org.eclipse.birt.chart.model.attribute.CallBackValue)
	 */
	public void callback(Object arg0, Object arg1, CallBackValue arg2) {
		//
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
	 * Sets the series color provider.
	 * 
	 * @param seriesColorProvider
	 *          the new series color provider
	 */
	public void setSeriesColorProvider(IColorProvider seriesColorProvider) {
		this.seriesColorProvider = seriesColorProvider;
	}

	/**
	 * 
	 * @see org.eclipse.birt.chart.device.IUpdateNotifier#repaintChart()
	 */
	public void repaintChart() {
		refresh();
	}

	@Override
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
	 * @param dataProvider
	 *          the new data provider
	 */
	public synchronized void setDataProvider(IDataProvider dataProvider) {
		this.dataProvider = dataProvider;
		dataSource = dataProvider.getDataSource(getModel());
		dataListener = new IDataSelectionListener() {
			public void selectionChanged(Object dataSet) {
				if (getParent() != null && getRoot() != null && getViewer() != null && getChart() != null) {
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

	public ResourceManager getResourceManager() {
		return resourceManager;
	}

	/**
	 * Encapsulate disposing of {@link GC} and {@link Image} resources.
	 * 
	 * @author fei
	 */
	public class ResourceManager implements DisposeListener {
		private GC gc;

		private Image image;

		private Control disposeEventProvider;

		public ResourceManager() {
			//
		}

		public void setGc(GC gc) {
			if (this.gc != null && !this.gc.isDisposed()) {
				this.gc.dispose();
			}
			this.gc = gc;
			addDisposeListener();
		}

		GC getGc() {
			return gc;
		}

		private void removeDisposeListener() {
			if (disposeEventProvider != null) {
				if (!disposeEventProvider.isDisposed()) {
					if (getViewer() != null && disposeEventProvider.equals(getViewer().getControl())) {
						return;
					}

					disposeEventProvider.removeDisposeListener(this);
				}
				disposeEventProvider = null;
			}
		}

		private void addDisposeListener() {
			removeDisposeListener();
			if (disposeEventProvider == null && getViewer() != null && getViewer().getControl() != null && !getViewer().getControl().isDisposed()) {
				disposeEventProvider = getViewer().getControl();
				disposeEventProvider.addDisposeListener(this);
			}
		}

		Image getImage() {
			return image;
		}

		public void setImage(Image image) {
			if (this.image != null && !this.image.isDisposed()) {
				this.image.dispose();
			}
			this.image = image;
			addDisposeListener();
		}

		public void widgetDisposed(DisposeEvent arg0) {
			setImage(null);
			setGc(null);
			removeDisposeListener();
		}
	}
}
