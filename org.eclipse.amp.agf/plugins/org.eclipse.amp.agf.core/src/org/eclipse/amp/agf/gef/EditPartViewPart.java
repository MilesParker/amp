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
package org.eclipse.amp.agf.gef;

import java.util.Collections;
import java.util.List;

import org.eclipse.amp.axf.view.IModelPart;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.editparts.ScalableRootEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IPartListener2;

public abstract class EditPartViewPart extends AGFViewPart {

	private DefaultEditDomain editDomain;

	protected EditPartViewer viewer;

	private EditPartListener rootListener;

	public static double[] ZOOM_LEVELS = { .125, .25, .5, .75, 1.0, 1.25, 1.5, 2.0, 2.5, 3, 4, 6, 8 };

	private ZoomManager zoomer;

	private RootEditPart rootEditPart;

	public EditPartViewPart() {
		super();
		setEditDomain(new DefaultEditDomain(null));
	}

	protected void refresh() {
		if (viewer.getContents() != null) {
			viewer.getContents().refresh();
		}
	}

	@Override
	public void createPartControl(Composite parent) {
		viewer = createViewer();
		viewer.createControl(parent);
		getEditDomain().addViewer(viewer);
		if (viewer == null) {
			throw new RuntimeException("Viewer is null for: " + this);
		}
		super.createPartControl(parent);
		getSite().getPage().addPartListener(new EditPartPartListener(this));
	}

	protected EditPartViewer createViewer() {
		return new ScrollingGraphicalViewer();
	}

	public abstract RootEditPart createRoot();

	@Override
	public void setInput(IEditorInput input) {
		super.setInput(input);
		final ModelEditPartInput modelInput = (ModelEditPartInput) input;
		// setPartName(getName());
		if (input != null) {
			rootEditPart = createRoot();
			if (rootEditPart != null) {
				viewer.setRootEditPart(rootEditPart);
				createZoomer();
			}
			Object contents = null;
			if (modelInput.getSelection() instanceof IStructuredSelection) {
				contents = ((StructuredSelection) modelInput.getSelection()).getFirstElement();
			} else {
				contents = getModel();
			}
			EditPartFactory factory = modelInput.getFactory();
			if (factory == null) {
				factory = createFactory(getModel());
			}
			Assert.isNotNull(factory, "Could not find factory for: " + this);
			viewer.setEditPartFactory(factory);
			if (factory instanceof ISelectionProvider) {
				ISelectionProvider provider = (ISelectionProvider) factory;
				getViewSite().setSelectionProvider(provider);
			}
			viewer.setContents(contents);
		} else {
			// viewer.setContents(null);
		}
	}

	protected EditPartFactory createFactory(Object contents) {
		IModelFactoryProvider provider = (IModelFactoryProvider) Platform.getAdapterManager().getAdapter(contents,
				IModelFactoryProvider.class);
		if (provider == null) {
			throw new RuntimeException("No model factory provider defined for: " + contents);
		}
		return provider.getEditPartFactory(contents);
	}

	protected void createZoomer() {
		if (rootEditPart instanceof ScalableFreeformRootEditPart) {
			zoomer = ((ScalableFreeformRootEditPart) rootEditPart).getZoomManager();
			zoomer.setZoomLevels(ZOOM_LEVELS);
			zoomer.setZoomLevelContributions(Collections.singletonList(ZoomManager.FIT_ALL));
		}
	}

	@Override
	public void createModelListeners() {
		super.createModelListeners();
		rootListener = new EditPartListener(this);
		rootListener.setWaitForUpdate(true);
		addModelListener(rootListener);
		if (viewer.getContents() instanceof IModelPart) {
			((IModelPart) viewer.getContents()).createModelListeners();
		}
		viewer.getControl().addPaintListener(new PaintListener() {

			public void paintControl(PaintEvent e) {
				getRootListener().endPainting();
			}
		});
	}

	public EditPart getEditPart() {
		@SuppressWarnings("rawtypes")
		List children = viewer.getRootEditPart().getChildren();
		if (children.size() > 0) {
			return (EditPart) children.get(0);
		}
		return null;
	}

	@Override
	public Object getAdapter(@SuppressWarnings("rawtypes") Class type) {
		if (type == EditPartViewer.class) {
			return getViewer();
		}
		// TODO -- this should really be the child..
		if (type == EditPart.class && getViewer() != null) {
			return getViewer().getRootEditPart();
		}
		if (type == IFigure.class && getViewer() != null) {
			return ((GraphicalEditPart) getViewer().getRootEditPart()).getFigure();
		}
		if (type == ZoomManager.class) {
			return getZoomer();
		}
		return super.getAdapter(type);
	}

	public EditPartViewer getViewer() {
		return viewer;
	}

	public EditPartListener getRootListener() {
		return rootListener;
	}

	/**
	 * Sets the EditDomain for this EditorPart.
	 * 
	 * @param ed the domain
	 */
	protected void setEditDomain(DefaultEditDomain ed) {
		this.editDomain = ed;
	}

	/**
	 * Returns the edit domain.
	 * 
	 * @return the edit domain
	 */
	protected DefaultEditDomain getEditDomain() {
		return editDomain;
	}

	public ZoomManager getZoomer() {
		if (rootEditPart instanceof ScalableFreeformRootEditPart) {
			return ((ScalableFreeformRootEditPart) rootEditPart).getZoomManager();
		} else if (rootEditPart instanceof ScalableRootEditPart) {
			return ((ScalableRootEditPart) rootEditPart).getZoomManager();
		}
		return null;
	}

	/**
	 * @return the rootEditPart
	 */
	public RootEditPart getRootEditPart() {
		return rootEditPart;
	}

	/**
	 * @return
	 * @see org.eclipse.amp.agf.gef.AGFViewPart#getSelectionProvider()
	 */
	@Override
	protected ISelectionProvider getSelectionProvider() {
		return viewer;
	}

	protected String getId() {
		return getSite().getId();
	}

	protected void removePartListener(IPartListener2 lis) {
		getSite().getPage().removePartListener(lis);
	}
}