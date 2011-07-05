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

import org.eclipse.amp.agf.gef.EditPartViewPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.editparts.ScalableRootEditPart;

/**
 * The Class ChartViewPart.
 */
public class ChartViewPart extends EditPartViewPart {

	public static final String VIEW_ID = "org.eclipse.amp.view.ChartView";

	CachedColorProvider seriesColorProvider = new CachedColorProvider();

	@Override
	public RootEditPart createRoot() {
		return new ScalableRootEditPart() {
			@Override
			public void refresh() {
				((EditPart) getChildren().get(0)).refresh();
			}
		};
	}

	/**
	 * 
	 * @see org.eclipse.amp.agf.gef.EditPartViewPart#createModelListeners()
	 */
	@Override
	public void createModelListeners() {
		// super.createModelListeners();
		// getRootListener().setWaitForUpdate(false);
	}

	@Override
	public EditPartFactory createFactory(Object contents) {
		return new EditPartFactory() {
			public EditPart createEditPart(EditPart context, Object object) {
				ChartEditPart chartPart = new ChartEditPart();

				chartPart.setSeriesColorProvider(seriesColorProvider);

				chartPart.setModel(getModel());
				return chartPart;
			}
		};
	}

}
