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

import org.eclipse.amp.agf.IGraphicsAdapter;
import org.eclipse.amp.agf.gef.AGFViewPart;
import org.eclipse.amp.axf.core.ICompositionProvider;
import org.eclipse.amp.axf.core.ILifeCycleListener;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.space.IGraphProvider;
import org.eclipse.amp.axf.view.ModelInput;
import org.eclipse.amp.axf.view.SWTAsyncModelListener;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.Platform;
import org.eclipse.draw2d.FigureCanvas;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;
import org.eclipse.zest.core.viewers.GraphViewer;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutAlgorithm;

// TODO: Auto-generated Javadoc
/**
 * The Class GraphViewPart.
 */
public class GraphViewPart extends AGFViewPart {

	static int INTIIAL_ITERATIONS = 10000;

	static int RUNNING_ITERATIONS = 1000;

	private GraphViewer viewer;
	// private ZestSliderContribution gravitySlide;
	private SpringPartitionLayoutAlgorithm springs;
	IAction springCustomizer;

	double gravity = 0.18;
	double strain = 0.03;
	double springLength = 0.8;
	double springMove = 0.5;

	/**
	 * @param parent
	 * @see org.eclipse.amp.axf.view.ModelViewPart#createPartControl(org.eclipse.swt.widgets.Composite)
	 */
	public void createPartControl(Composite parent) {
		viewer = new GraphViewer(parent, ZestStyles.NONE);

		viewer.getControl().setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_WHITE));
		setLayoutAlgorithm(new SpringPartitionLayoutAlgorithm());
		//viewer.setNodeStyle(ZestStyles.NODES_NO_LAYOUT_RESIZE);
		super.createPartControl(parent);
	}

	/**
	 * Creates the spring layout.
	 * 
	 * @return the spring layout algorithm
	 */
	public SpringPartitionLayoutAlgorithm createSpringLayout() {
		if (springs == null) {
			springs = new SpringPartitionLayoutAlgorithm();
		}
		springs.setSpringGravitation(gravity);
		springs.setSpringStrain(strain);
		springs.setSpringLength(springLength);
		springs.setSpringMove(springMove);
		springs.setSpringTimeout(1000);
		return springs;
	}

	public void setInput(IEditorInput input) {
		super.setInput(input);
		final ModelInput modelInput = (ModelInput) input;
		setModel(modelInput.getModel());
		if (getModel() != null) {
			IGraphProvider graphProvider = (IGraphProvider) Platform.getAdapterManager()
					.getAdapter(getModel(), IGraphProvider.class);
			ICompositionProvider compProvider = (ICompositionProvider) Platform.getAdapterManager()
					.getAdapter(getModel(), ICompositionProvider.class);
			ZestContentProvider contentProvider = new ZestContentProvider(graphProvider, compProvider);
			Assert.isNotNull(graphProvider);
			Assert.isNotNull(compProvider);
			Assert.isNotNull(contentProvider);
			viewer.setContentProvider(contentProvider);
			IGraphicsAdapter graphicsAdapter = (IGraphicsAdapter) Platform.getAdapterManager()
					.getAdapter(getModel().getRoot(), IGraphicsAdapter.class);
			viewer.setLabelProvider(new ZestStyleProvider(getViewer(), getModel().getRoot(), compProvider,
				graphicsAdapter));
			Object contents = null;
			if (modelInput.getSelection() instanceof IStructuredSelection) {
				contents = ((StructuredSelection) modelInput.getSelection()).getFirstElement();
			} else {
				contents = getModel();
			}
			viewer.getGraphControl().setScrollBarVisibility(FigureCanvas.NEVER);
			viewer.setInput(contents);
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
			springCustomizer.setEnabled(layout instanceof SpringPartitionLayoutAlgorithm);
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
	public SpringPartitionLayoutAlgorithm getSpringLayout() {
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
		springCustomizer
				.setEnabled(viewer.getGraphControl().getLayoutAlgorithm() instanceof SpringPartitionLayoutAlgorithm);
	}

	/**
	 * @return
	 * @see org.eclipse.amp.agf.gef.AGFViewPart#getSelectionProvider()
	 */
	protected ISelectionProvider getSelectionProvider() {
		return viewer;
	}
}
