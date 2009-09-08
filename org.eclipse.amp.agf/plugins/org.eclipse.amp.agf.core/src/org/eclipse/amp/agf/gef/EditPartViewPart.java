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
import org.eclipse.amp.axf.view.ModelViewPart;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.DefaultEditDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.ui.parts.ScrollingGraphicalViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IWorkbenchPart;

public abstract class EditPartViewPart extends ModelViewPart {

    private final class PropertySelectionListener implements ISelectionChangedListener {
        public void selectionChanged(SelectionChangedEvent event) {
            if (!event.getSelection().isEmpty() && event.getSelection() instanceof StructuredSelection) {
                StructuredSelection sel = (StructuredSelection) event.getSelection();
                propertySheetPage.selectionChanged(EditPartViewPart.this, new StructuredSelection(sel
                                                                                                  .getFirstElement()));
            }
        }
    }

    private DefaultEditDomain editDomain;
    protected EditPartViewer viewer;
    private EditPartListener rootListener;
    public static double[] ZOOM_LEVELS = { .125, .25, .5, .75, 1.0, 1.25, 1.5, 2.0, 2.5, 3, 4, 6, 8 };
    private ZoomManager zoomer;
    private PropertySelectionListener selectionListener;
    private RootEditPart rootEditPart;

    public EditPartViewPart() {
        super();
        setEditDomain(new DefaultEditDomain(null));
    }

    public void createPartControl(Composite parent) {
        super.createPartControl(parent);
        viewer = createViewer();
        viewer.createControl(parent);
        getEditDomain().addViewer(viewer);
        createSelectionListener(viewer);
    }

    protected void createSelectionListener(ISelectionProvider provider) {
        super.createSelectionListener(provider);
        selectionListener = new PropertySelectionListener();
        provider.addSelectionChangedListener(selectionListener);
    }

    protected EditPartViewer createViewer() {
        return new ScrollingGraphicalViewer();
    }

    public abstract RootEditPart createRoot();

    public void setInput(IEditorInput input) {
        super.setInput(input);
        final ModelEditPartInput mInput = (ModelEditPartInput) input;
        // setPartName(getName());
        if (input != null) {
            rootEditPart = createRoot();
            if (rootEditPart != null) {
                viewer.setRootEditPart(rootEditPart);
                createZoomer(rootEditPart);
            }
            if (mInput.getFactory() == null) {
                viewer.setEditPartFactory(createFactory());
            } else {
                viewer.setEditPartFactory(mInput.getFactory());
            }
            viewer.setContents(getModel());
        } else {
            // viewer.setContents(null);
        }
    }

    protected ModelFactoryProvider getModelFactoryProvider() {
        if (getModel() instanceof ModelFactoryProvider) {
            return (ModelFactoryProvider) getModel();
        } else {
            ModelFactoryProvider provider = (ModelFactoryProvider) Platform.getAdapterManager()
            .getAdapter(getModel(), ModelFactoryProvider.class);
            if (provider == null) {
                throw new RuntimeException("No I3DModelFactoryProvider adapter defined for: " + getModel());
            }
            return provider;
        }
    }

    protected EditPartFactory createFactory() {
        return getModelFactoryProvider().getEditPartFactory();
    }

    protected void createZoomer(RootEditPart rootEditPart) {
        if (rootEditPart instanceof ScalableFreeformRootEditPart) {
            zoomer = ((ScalableFreeformRootEditPart) rootEditPart).getZoomManager();
            zoomer.setZoomLevels(ZOOM_LEVELS);
            zoomer.setZoomLevelContributions(Collections.singletonList(ZoomManager.FIT_ALL));
        }
    }

    public void createModelListeners() {
        super.createModelListeners();
        rootListener = new EditPartListener(viewer.getControl(), getEditPart());
        rootListener.setWaitForUpdate(true);
        addModelListener(rootListener);
        if (viewer.getContents() instanceof IModelPart) {
            ((IModelPart) viewer.getContents()).createModelListeners();
        }
        viewer.getControl().addPaintListener(new PaintListener() {
            public void paintControl(PaintEvent e) {
                rootListener.endPainting();
            }
        });
    }

    public EditPart getEditPart() {
        List children = viewer.getRootEditPart().getChildren();
        if (children.size() > 0) {
            return (EditPart) children.get(0);
        }
        return null;
    }

    @Override
    public Object getAdapter(Class type) {
        if (type == ISelectionProvider.class) {
            return getViewer();
        }
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
     * @param ed
     *        the domain
     */
    protected void setEditDomain(DefaultEditDomain ed) {
        this.editDomain = ed;
    }

    public void selectionChanged(IWorkbenchPart part, ISelection selection) {
    }

    public void dispose() {
        super.dispose();
        removeSelectionListener(viewer);
        ((ISelectionProvider) viewer).removeSelectionChangedListener(selectionListener);
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
        return zoomer;
    }

    /**
     * @return the rootEditPart
     */
    public RootEditPart getRootEditPart() {
        return rootEditPart;
    }

}