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
package org.eclipse.amp.escape.ascape.chart;

import java.util.HashMap;
import java.util.Map;

import org.ascape.model.Scape;
import org.ascape.util.data.DataSelection;
import org.ascape.util.data.DataSeries;
import org.ascape.util.data.StatCollector;
import org.eclipse.amp.agf.chart.ChartEditPart;
import org.eclipse.amp.agf.chart.ChartViewPart;
import org.eclipse.amp.escape.ascape.wrap.ScapeWrapperModel;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.CheckboxCellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ColumnPixelData;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnWeightData;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableLayout;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;


public class ChartCustomizer extends ViewPart {
	
	public static final String VIEW_ID = "org.eclipse.amp.view.customizer.Chart";

	protected Scape scape;
	protected DataSelection dataSelection;
	protected ChartEditPart chartEditPart;
	private TableViewer selectTable;
	private Composite control;
	private DisposeListener chartDisposeListener;
	private ArrayContentProvider statTableProvider;
	private StatTableItemProvider statTableLabelProvider;

	/**
	 * The Class StatTableItemProvider.
	 */
	class StatTableItemProvider extends LabelProvider implements
			ITableLabelProvider {

		/**
		 * @param element
		 * @param columnIndex
		 * @return
		 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnText(java.lang.Object,
		 *      int)
		 */
		public String getColumnText(Object element, int columnIndex) {
			if (columnIndex > 0) {
				return StatCollector.getAllMeasureNamesShort()[columnIndex - 1];
			} else {
				return ((StatCollector) element).getName();
			}
		}

		/**
		 * @param element
		 * @param columnIndex
		 * @return
		 * @see org.eclipse.jface.viewers.ITableLabelProvider#getColumnImage(java.lang.Object,
		 *      int)
		 */
		public Image getColumnImage(Object element, int columnIndex) {
			return null;
		}
	}

	/**
	 * The Class MeasureEditSupport.
	 */
	class MeasureEditSupport extends EditingSupport {
		int measureNumber;
		Map<Object, CheckboxCellEditor> checkBoxFor = new HashMap<Object, CheckboxCellEditor>();

		/**
		 * Instantiates a new measure edit support.
		 * 
		 * @param viewer
		 *            the viewer
		 * @param measureNumber
		 *            the measure number
		 */
		public MeasureEditSupport(ColumnViewer viewer, int measureNumber) {
			super(viewer);
			this.measureNumber = measureNumber;
		}

		private DataSeries getDataSeries(Object id) {
			return ((StatCollector) id).getAllDataSeries()[measureNumber];
		}

		/**
		 * @param element
		 * @return
		 * @see org.eclipse.jface.viewers.EditingSupport#canEdit(java.lang.Object)
		 */
		@Override
		protected boolean canEdit(Object element) {
			return getDataSeries(element) != null;
		}

		/**
		 * @param element
		 * @return
		 * @see org.eclipse.jface.viewers.EditingSupport#getCellEditor(java.lang.Object)
		 */
		@Override
		protected CellEditor getCellEditor(final Object element) {
			CheckboxCellEditor checkboxCellEditor = checkBoxFor.get(element);
			if (checkboxCellEditor == null) {
				checkboxCellEditor = new CheckboxCellEditor(getSelectTable()
						.getTable());
			}
			return checkboxCellEditor;
		}

		/**
		 * @param element
		 * @return
		 * @see org.eclipse.jface.viewers.EditingSupport#getValue(java.lang.Object)
		 */
		@Override
		protected Object getValue(Object element) {
			if (dataSelection != null && getDataSeries(element) != null) {
				return dataSelection.isSelected(getDataSeries(element));
			} else {
				return false;
			}
		}

		/**
		 * @param element
		 * @param value
		 * @see org.eclipse.jface.viewers.EditingSupport#setValue(java.lang.Object,
		 *      java.lang.Object)
		 */
		@Override
		protected void setValue(Object element, Object value) {
			if (dataSelection != null) {
				DataSeries dataSeries = getDataSeries(element);
				if (dataSeries != null) {
					dataSelection.setSelected(dataSeries, (Boolean) value);
				}
				// chartEditor.getSite().getPage().activate(chartEditor);
				getSite().getShell().getDisplay().syncExec(new Runnable() {
					public void run() {
						chartEditPart.refresh();
					}
				});
				getSite().getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						getSelectTable().getTable().deselectAll();
						getSelectTable().refresh(true);
					}
				});
			}
		}
	}

	/**
	 * The Class MeasureLabelProvider.
	 */
	class MeasureLabelProvider extends ColumnLabelProvider {
		int measureNumber;

		/**
		 * Instantiates a new measure label provider.
		 * 
		 * @param measureNumber
		 *            the measure number
		 */
		public MeasureLabelProvider(int measureNumber) {
			this.measureNumber = measureNumber;
		}

		private DataSeries getDataSeries(Object id) {
			return ((StatCollector) id).getAllDataSeries()[measureNumber];
		}

		/**
		 * @param element
		 * @return
		 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getText(java.lang.Object)
		 */
		@Override
		public String getText(Object element) {
			return null;
		}

		/**
		 * @param element
		 * @return
		 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getImage(java.lang.Object)
		 */
		@Override
		public Image getImage(Object element) {
			// if (dataSelection != null) {
			// DataSeries dataSeries = getDataSeries(element);
			// if (dataSeries != null && dataSelection.isSelected(dataSeries)) {
			// Image i = new Image(Display.getCurrent(), 30, 10);
			// GC gc = new GC(i);
			// SWTGraphics gfx = new SWTGraphics(gc);
			// String name = dataSeries.getName();
			// Color seriesColor =
			// chartEditPart.getSeriesColorProvider().getForeground(name);
			// if (seriesColor != null) {
			// gfx.setForegroundColor(seriesColor);
			// gfx.setBackgroundColor(seriesColor);
			// } else {
			// StatusManager.getManager().handle(
			// new Status(Status.WARNING, "org.eclipse.amp.agf.chart",
			// "No cached color for " + name));
			// }
			// gfx.setLineWidth(3);
			// gfx.drawLine(0, 5, 30, 5);
			// return i;
			// }
			// }
			return null;
		}

		/**
		 * @param element
		 * @return
		 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getBackground(java.lang.Object)
		 */
		@Override
		public Color getBackground(Object element) {
			DataSeries dataSeries = getDataSeries(element);
			if (dataSeries == null) {
				return org.eclipse.draw2d.ColorConstants.lightGray;
			} else {
				if (dataSelection.isSelected(dataSeries)) {
					return chartEditPart.getSeriesColorProvider()
							.getForeground(dataSeries.getName());
				} else {
					return org.eclipse.draw2d.ColorConstants.white;
				}
			}
		}
	}

	/**
	 * Check enabled state.
	 */
	void checkEnabledState() {
		if (control != null) {
			control.setEnabled(chartEditPart != null);
		}
	}

	/**
	 * @param parent
	 * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPartControl(Composite parent) {
		// Overall
		control = new Composite(parent, SWT.HORIZONTAL);
		GridLayout allLayout = new GridLayout();
		allLayout.numColumns = 2;
		control.setLayout(allLayout);
		checkEnabledState();

		// Chart settings
		Composite general = new Composite(control, SWT.NO_SCROLL);
		GridLayout generalLayout = new GridLayout();
		generalLayout.numColumns = 1;
		general.setLayout(generalLayout);
		general
				.setLayoutData(new GridData(SWT.BEGINNING, SWT.FILL, false,
						true));
		chartDisposeListener = new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				setInput(null);
			}
		};

		/*
		 * // Group chartTypeGroup = new Group(general, SWT.NO_SCROLL); final
		 * Label label = new Label(general, SWT.NONE);
		 * label.setText("Chart Type"); ToolBar chartTypeBar = new
		 * ToolBar(general, SWT.FLAT | SWT.WRAP | SWT.RIGHT); final ToolItem
		 * lineButton = new ToolItem(chartTypeBar, SWT.RADIO);
		 * lineButton.setToolTipText("Line Chart");
		 * lineButton.setImage(Activator
		 * .imageDescriptorFromPlugin("org.eclipse.amp.escape.charts",
		 * "icons/obj16/linecharticon.gif").createImage()); final ToolItem
		 * areaButton = new ToolItem(chartTypeBar, SWT.RADIO);
		 * areaButton.setToolTipText("Area Chart");
		 * areaButton.setImage(Activator
		 * .imageDescriptorFromPlugin("org.eclipse.amp.escape.charts",
		 * "icons/obj16/areacharticon.gif").createImage()); final ToolItem
		 * pieButton = new ToolItem(chartTypeBar, SWT.RADIO);
		 * pieButton.setToolTipText("Pie Chart");
		 * pieButton.setImage(Activator.imageDescriptorFromPlugin
		 * ("org.eclipse.amp.escape.charts",
		 * "icons/obj16/piecharticon.gif").createImage()); SelectionListener
		 * chartTypeListener = new SelectionListener() { public void
		 * widgetDefaultSelected(SelectionEvent e) { }
		 * 
		 * public void widgetSelected(SelectionEvent e) { if
		 * (lineButton.getSelection()) { label.setText("Line"); } if
		 * (areaButton.getSelection()) { label.setText("Area"); } if
		 * (pieButton.getSelection()) { label.setText("Pie"); } } };
		 * lineButton.addSelectionListener(chartTypeListener);
		 * areaButton.addSelectionListener(chartTypeListener);
		 * pieButton.addSelectionListener(chartTypeListener);
		 * 
		 * final Button displayLegendButton = new Button(general, SWT.CHECK);
		 * displayLegendButton.setToolTipText("Show Legend");
		 * displayLegendButton.setImage(Activator.imageDescriptorFromPlugin(
		 * "org.eclipse.amp.escape.charts",
		 * "icons/obj16/rectangle_multitype.gif") .createImage());
		 * displayLegendButton.addSelectionListener(new SelectionListener() {
		 * public void widgetDefaultSelected(SelectionEvent e) { // TODO
		 * Auto-generated method stub
		 * 
		 * }
		 * 
		 * public void widgetSelected(SelectionEvent e) { Legend legend =
		 * chartView.getChart().getLegend();
		 * legend.setVisible(displayLegendButton.getSelection()); } });
		 */

		// Chart series selection
		buildTable();
		getViewSite().getPage().addPartListener(new IPartListener() {
			public void partActivated(IWorkbenchPart part) {
				if (part instanceof ChartViewPart) {
					setInput(((ChartViewPart) part).getEditPart());
				}
			}

			public void partBroughtToTop(IWorkbenchPart part) {
				//
			}

			public void partClosed(IWorkbenchPart part) {
				//
			}

			public void partDeactivated(IWorkbenchPart part) {
				//
			}

			public void partOpened(IWorkbenchPart part) {
				//
			}

		});
	}

	private void buildTable() {
		selectTable = new TableViewer(control, SWT.H_SCROLL);

		statTableProvider = new ArrayContentProvider();
		selectTable.setContentProvider(statTableProvider);
		statTableLabelProvider = new StatTableItemProvider();
		selectTable.setLabelProvider(statTableLabelProvider);
		Table statTable = selectTable.getTable();
		statTable.setHeaderVisible(true);
		TableLayout layout = new TableLayout();
		statTable.setLayout(layout);
		layout.addColumnData(new ColumnWeightData(200));
		selectTable.getControl().setLayoutData(
				new GridData(SWT.FILL, SWT.FILL, true, true));

		TableViewerColumn statNameColumn = new TableViewerColumn(selectTable,
				SWT.LEFT);
		statNameColumn.getColumn().setText("Name");
		statNameColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return ((StatCollector) element).getName();
			}
		});
		int i = 0;
		for (String name : StatCollector.getAllMeasureNamesShort()) {
			layout.addColumnData(new ColumnPixelData(40));
			TableViewerColumn viewerColumn = new TableViewerColumn(selectTable,
					SWT.CENTER);
			viewerColumn.getColumn().setText(name);
			viewerColumn.setLabelProvider(new MeasureLabelProvider(i));
			viewerColumn.setEditingSupport(new MeasureEditSupport(selectTable,
					i));
			i++;
		}
		selectTable.refresh();
	}

	/**
	 * Sets the input.
	 * 
	 * @param object
	 *            the new input
	 */
	public void setInput(Object object) {
		if (object instanceof ChartEditPart) {
			if (chartEditPart != null
					&& chartEditPart.getViewer().getControl() != null) {
				chartEditPart.getViewer().getControl().removeDisposeListener(
						chartDisposeListener);
			}
			chartEditPart = (ChartEditPart) object;
			scape = ((ScapeWrapperModel) chartEditPart.getModel()).getScape();
			if (scape.getData() != null) {
				dataSelection = (DataSelection) chartEditPart.getDataProvider()
						.getDataSource(chartEditPart.getModel());
				selectTable.setContentProvider(statTableProvider);
				selectTable.setInput(scape.getData().getStatCollectors());
			}
			chartEditPart.getViewer().getControl().addDisposeListener(
					chartDisposeListener);
		} else if (object == null && chartEditPart != null) {
			if (chartEditPart.getViewer().getControl() != null) {
				chartEditPart.getViewer().getControl().removeDisposeListener(
						chartDisposeListener);
			}
			chartEditPart = null;
			dataSelection = null;
			if (control != null) {
				control.setEnabled(false);
			}
			selectTable.setInput(null);
		}
		checkEnabledState();
		selectTable.refresh(true);
	}

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
		//
	}

	public ChartEditPart getChartEditPart() {
		return chartEditPart;
	}

	public void refresh() {
		selectTable.refresh();
	}
	
	TableViewer getSelectTable() {
		return selectTable;
	}
}