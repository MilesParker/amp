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
package org.eclipse.amp.agf.tree;

import org.eclipse.amp.agf.gef.EditPartViewPart;
import org.eclipse.amp.agf.gef.IModelFactoryProvider;
import org.eclipse.amp.axf.core.AbstractLifecycleListener;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.core.IObservationProvider;
import org.eclipse.amp.axf.ide.AbstractModelWorkbenchListener;
import org.eclipse.amp.axf.ide.ModelViewManager;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.editparts.RootTreeEditPart;
import org.eclipse.gef.ui.parts.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

/**
 * The Class TreeViewPart.
 */
public class TreeViewPart extends EditPartViewPart {

	private final class TreeUpdateListener extends AbstractLifecycleListener {

		@Override
		public void observeUpdate(IObservationProvider observed) {
			if (getViewer().getControl() != null) {
				Display display = getViewer().getControl().getDisplay();
				display.asyncExec(new Runnable() {
					public void run() {
						EditPart contents = getViewer().getRootEditPart().getContents();
						if (contents != null) {
							for (Object object : contents.getChildren()) {
								EditPart part = (EditPart) object;
								part.refresh();
							}
						}
					}
				});
			}
			super.observeUpdate(observed);
		}
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		new Thread() {
			@Override
			public void run() {
				ModelViewManager manager = ModelViewManager.getInstance();
				if (manager.getActiveModel() != null) {
					modelChanged((IModel) manager.getActiveModel());
				}
				manager.getManagerListeners().addModelManagerListener(new AbstractModelWorkbenchListener() {

					@Override
					public void modelActivated(IModel model) {
						modelChanged(model);
					}

					@Override
					public void modelRemoved(IModel model) {
						if (model == getModel()) {
							modelChanged(null);
						}
					}
				});
			}
		}.start();
	}

	@Override
	protected EditPartViewer createViewer() {
		TreeViewer treeViewer = new TreeViewer();
		return treeViewer;
	}

	/**
	 * @param activeModel
	 * @see org.eclipse.amp.axf.ide.view.ActiveModelViewPart#modelChanged(org.eclipse.amp.axf.core.IModel)
	 */
	protected void modelChanged(final IModel activeModel) {
		setModel(activeModel);
		if (getViewer().getControl() != null && !getViewer().getControl().isDisposed()) {
			if (activeModel != null) {
				IModelFactoryProvider provider = (IModelFactoryProvider) Platform.getAdapterManager().getAdapter(activeModel.getRoot(), IModelFactoryProvider.class);
				EditPartFactory editPartTreeFactory = provider.getEditPartTreeFactory(activeModel);
				getViewer().setEditPartFactory(editPartTreeFactory);
				getViewer().getControl().getDisplay().asyncExec(new Runnable() {
					public void run() {
						getViewer().getControl().setBackground(getViewer().getControl().getDisplay().getSystemColor(SWT.COLOR_WHITE));
						getViewer().setContents(activeModel.getRoot());
					}
				});
				activeModel.addModelListener(new TreeUpdateListener());
			} else {
				getViewer().getControl().getDisplay().asyncExec(new Runnable() {
					public void run() {
						getViewer().getControl().setBackground(getViewer().getControl().getDisplay().getSystemColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
						getViewer().setContents(null);
						getViewer().getControl().redraw();
					}
				});
			}
		}
	}

	@Override
	public RootEditPart createRoot() {
		RootTreeEditPart rootTreeEditPart = new RootTreeEditPart();
		return rootTreeEditPart;
	}
}
