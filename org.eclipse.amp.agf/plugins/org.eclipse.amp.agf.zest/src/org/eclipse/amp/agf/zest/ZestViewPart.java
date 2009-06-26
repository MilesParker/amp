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
package org.eclipse.amp.agf.zest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.amp.axf.core.ILifeCycleListener;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.view.ModelViewPart;
import org.eclipse.amp.axf.view.SWTAsyncModelListener;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.zest.core.viewers.GraphViewer;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutAlgorithm;
import org.eclipse.zest.layouts.algorithms.SpringLayoutAlgorithm;

// TODO: Auto-generated Javadoc
/**
 * The Class ZestViewPart.
 */
public class ZestViewPart extends ModelViewPart {

    private GraphViewer viewer;
    // private ZestSliderContribution gravitySlide;
    private SpringLayoutAlgorithm springs;
    IAction springCustomizer;

    double gravity = 0.5;
    double strain = 0.5;
    double springLength = 0.5;
    double springMove = 0.5;

    /**
     * @param parent
     * @see org.eclipse.amp.axf.view.ModelViewPart#createPartControl(org.eclipse.swt.widgets.Composite)
     */
    public void createPartControl(Composite parent) {
        viewer = new GraphViewer(parent, ZestStyles.NONE);

        viewer.getControl().setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
        setLayoutAlgorithm(createSpringLayout());
        viewer.setNodeStyle(ZestStyles.NODES_NO_LAYOUT_RESIZE | ZestStyles.NODES_HIDE_TEXT);
        getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(new ISelectionListener() {
            public void selectionChanged(IWorkbenchPart part, ISelection selection) {
                if (selection instanceof IStructuredSelection) {
                    List<Object> domainObjects = new ArrayList<Object>();
                    Iterator iter = ((IStructuredSelection) selection).iterator();
                    while (iter.hasNext()) {
                        Object item = iter.next();
                        if (item instanceof EditPart) {
                            domainObjects.add(((EditPart) item).getModel());
                        }
                    }
                    selection = new StructuredSelection(domainObjects);
                    viewer.setSelection(selection);
                }
            }
        });
        super.createPartControl(parent);
        // TODO we need to put this functionality back
        // createSelectionListener(viewer);

        // provider.addSelectionChangedListener(new ISelectionChangedListener() {
        // public void selectionChanged(SelectionChangedEvent event) {
        // if (!event.getSelection().isEmpty() && event.getSelection() instanceof StructuredSelection) {
        // StructuredSelection sel = (StructuredSelection) event.getSelection();
        // propertySheetPage.selectionChanged(ZestViewPart.this,
        // new StructuredSelection(sel
        // .getFirstElement()));
        // }
        // }
        // });
        // viewer.getControl().addControlListener(new ControlListener() {
        // public void controlMoved(ModelControl e) {
        // }
        //
        // public void controlResized(ModelControl e) {
        // viewer.applyLayout();
        // }
        // });
    }

    /**
     * Creates the spring layout.
     * 
     * @return the spring layout algorithm
     */
    public SpringLayoutAlgorithm createSpringLayout() {
        if (springs == null) {
            springs = new SpringLayoutAlgorithm();
        }
        springs.setSpringGravitation(gravity);
        springs.setSpringStrain(strain);
        springs.setSpringLength(springLength);
        springs.setSpringMove(springMove);
        return springs;
    }

    /**
     * @param input
     * @see org.eclipse.amp.axf.view.ModelViewPart#setInput(org.eclipse.ui.IEditorInput)
     */
    public void setInput(IEditorInput input) {
        super.setInput(input);
        if (input != null) {
            ZestInput zestInput = (ZestInput) input;
            viewer.setContentProvider(zestInput.getContent());
            viewer.setLabelProvider(zestInput.getLabel());
            viewer.setInput(zestInput.getModel());
            viewer.setFilters(zestInput.getFilters());
        } else {
            viewer.setInput(null);
            viewer.setFilters(new ViewerFilter[0]);
        }
    }

    /**
     * 
     * @see org.eclipse.amp.axf.view.ModelViewPart#createModelListeners()
     */
    public void createModelListeners() {
        super.createModelListeners();
        ILifeCycleListener refreshListener = new SWTAsyncModelListener(viewer.getControl(), "Refresh Graph") {
            public void update(IModel model) {
                viewer.refresh();
                viewer.applyLayout();
            }
        };
        addModelListener(refreshListener);
    }

    /**
     * Sets the focus.
     * 
     * @see org.eclipse.ui.IWorkbenchPart#setFocus()
     */
    public void setFocus() {
        getViewer().getControl().setFocus();
    }

    /**
     * Sets the layout algorithm.
     * 
     * @param layout the new layout algorithm
     */
    public void setLayoutAlgorithm(LayoutAlgorithm layout) {
        viewer.setLayoutAlgorithm(layout, true);
        // IToolBarManager toolbar = getViewSite().getActionBars().getToolBarManager();
        // if (layout instanceof SpringLayoutAlgorithm) {
        // if (gravitySlide == null) {
        // gravitySlide = new ZestSliderContribution(viewer.getGraphControl());
        // toolbar.add(gravitySlide);
        // }
        // } else {
        // if (gravitySlide != null) {
        // gravitySlide.setVisible(false);
        // toolbar.remove(gravitySlide);
        // }
        // }
        if (springCustomizer != null) {
            springCustomizer.setEnabled(layout instanceof SpringLayoutAlgorithm);
        }
    }

    /**
     * @param type
     * @return
     * @see org.eclipse.amp.axf.view.ModelViewPart#getAdapter(java.lang.Class)
     */
    @Override
    public Object getAdapter(Class type) {
        if (type == ISelectionProvider.class) {
            return viewer;
        }
        return super.getAdapter(type);
    }

    /**
     * Gets the viewer.
     * 
     * @return the viewer
     */
    public GraphViewer getViewer() {
        return viewer;
    }

    /**
     * Gets the strain.
     * 
     * @return the strain
     */
    public double getStrain() {
        return strain;
    }

    /**
     * Sets the strain.
     * 
     * @param strain the new strain
     */
    public void setStrain(double strain) {
        this.strain = strain;
        setLayoutAlgorithm(createSpringLayout());
    }

    /**
     * Gets the spring length.
     * 
     * @return the spring length
     */
    public double getSpringLength() {
        return springLength;
    }

    /**
     * Sets the spring length.
     * 
     * @param length the new spring length
     */
    public void setSpringLength(double length) {
        this.springLength = length;
        setLayoutAlgorithm(createSpringLayout());
    }

    /**
     * Gets the gravity.
     * 
     * @return the gravity
     */
    public double getGravity() {
        return gravity;
    }

    /**
     * Sets the gravity.
     * 
     * @param gravity the new gravity
     */
    public void setGravity(double gravity) {
        this.gravity = gravity;
        setLayoutAlgorithm(createSpringLayout());
    }

    /**
     * Gets the spring move.
     * 
     * @return the spring move
     */
    public double getSpringMove() {
        return springMove;
    }

    /**
     * Sets the spring move.
     * 
     * @param springMove the new spring move
     */
    public void setSpringMove(double springMove) {
        this.springMove = springMove;
        setLayoutAlgorithm(createSpringLayout());
    }

    /**
     * Gets the spring layout.
     * 
     * @return the spring layout
     */
    public SpringLayoutAlgorithm getSpringLayout() {
        return springs;
    }

    /**
     * Gets the spring customizer.
     * 
     * @return the spring customizer
     */
    public IAction getSpringCustomizer() {
        return springCustomizer;
    }

    /**
     * Sets the spring customizer.
     * 
     * @param springCustomizer the new spring customizer
     */
    public void setSpringCustomizer(IAction springCustomizer) {
        this.springCustomizer = springCustomizer;
        springCustomizer.setEnabled(viewer.getGraphControl().getLayoutAlgorithm() instanceof SpringLayoutAlgorithm);
    }

    /**
     * 
     * @see org.eclipse.amp.axf.view.ModelViewPart#dispose()
     */
    public void dispose() {
        super.dispose();
        // TODO Replace this funcitonality
        // removeSelectionListener(viewer);
    }
}
