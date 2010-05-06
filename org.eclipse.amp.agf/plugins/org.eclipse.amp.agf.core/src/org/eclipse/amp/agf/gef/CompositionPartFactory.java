/**
 * <copyright>
 *
 * Copyright (c) 2010 Metascape, LLC.
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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.amp.axf.core.ICompositionProvider;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.space.IGraphProvider;
import org.eclipse.amp.axf.space.ILocationProvider;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;

/**
 * 
 * @author mparker
 * 
 */
public class CompositionPartFactory implements EditPartFactory {

    IModel model;

    ILocationProvider locationProvider;

    ICompositionProvider compositionProvider;

    IGraphProvider graphProvider;

    Map<Object, IFigureProvider> figureProviders = new HashMap<Object, IFigureProvider>();

    Map<Object, ILabelProvider> labelProviders = new HashMap<Object, ILabelProvider>();

    Map<Object, IColorProvider> colorProviders = new HashMap<Object, IColorProvider>();

    IFigureProvider baseFigureProvider;
    ILabelProvider baseLabelProvider;
    IColorProvider baseColorProvider;

    public CompositionPartFactory(IModel model) {
        super();
        this.model = model;
        compositionProvider = (ICompositionProvider) Platform.getAdapterManager()
        .getAdapter(model, ICompositionProvider.class);
        locationProvider = (ILocationProvider) Platform.getAdapterManager().getAdapter(model, ILocationProvider.class);
        graphProvider = (IGraphProvider) Platform.getAdapterManager().getAdapter(model, IGraphProvider.class);
        baseFigureProvider = (IFigureProvider) Platform.getAdapterManager()
        .getAdapter(model, org.eclipse.amp.agf.gef.IFigureProvider.class);
        baseLabelProvider = (ILabelProvider) Platform.getAdapterManager().getAdapter(model, ILabelProvider.class);
        baseColorProvider = (IColorProvider) Platform.getAdapterManager().getAdapter(model, IColorProvider.class);
    }

    /**
     * @param context
     * @param model
     * @return
     * @see org.eclipse.gef.EditPartFactory#createEditPart(org.eclipse.gef.EditPart, java.lang.Object)
     */
    public EditPart createEditPart(EditPart context, Object model) {
        EditPart part = getPartForElement(model);
        part.setModel(model);
        return part;
    }

    /**
     * Maps an object to an EditPart.
     * 
     * @param model the model
     * 
     * @return the part for element
     * 
     * @throws RuntimeException if no match was found (programming error)
     */
    protected EditPart getPartForElement(Object model) {
        if (compositionProvider.isComposition(model)) {
            IFigureProvider figureProvider = (IFigureProvider) Platform.getAdapterManager()
            .getAdapter(model, IFigureProvider.class);
            if (figureProvider == null) {
                return null;
            }
            if (graphProvider.isGraph(model)) {
                return new ScapeGraphEditPart(compositionProvider, locationProvider, graphProvider, null);
            }
            return new ScapeEditPart(compositionProvider, locationProvider, null);
        } else if (model instanceof NetworkConnection) {
            return new AgentConnectionPart();
        }
        // TODO we need to generalize this so that all providers can be customized independently
        IFigureProvider figureProvider = baseFigureProvider;
        ILabelProvider labelProvider = baseLabelProvider;
        IColorProvider colorProvider = baseColorProvider;
        if (baseFigureProvider == null) {
            // For performance and design reasons, we use providers form the scape, not the agent itself
            Object parent = compositionProvider.getParent(model);
            figureProvider = figureProviders.get(parent);
            labelProvider = labelProviders.get(parent);
            colorProvider = colorProviders.get(parent);
            if (figureProvider == null) {
                // We're going to assume that we need all of them
                figureProvider = (IFigureProvider) Platform.getAdapterManager().getAdapter(parent,
                                                                                           IFigureProvider.class);
                figureProviders.put(parent, figureProvider);
                labelProvider = (ILabelProvider) Platform.getAdapterManager().getAdapter(parent, ILabelProvider.class);
                labelProviders.put(parent, labelProvider);
                colorProvider = (IColorProvider) Platform.getAdapterManager().getAdapter(parent, IColorProvider.class);
                colorProviders.put(parent, colorProvider);
                if (figureProvider == null || labelProvider == null || colorProvider == null) {
                    throw new RuntimeException("No providers found for: " + model);
                }
            }
        }
        if (figureProvider.getFigure(model) != null) {
            return new AgentEditPart(figureProvider, colorProvider, labelProvider);
        }
        return null;
    }

    /**
     * @return the compositionProvider
     */
    public ICompositionProvider getCompositionProvider() {
        return compositionProvider;
    }

    /**
     * @return the graphProvider
     */
    public IGraphProvider getGraphProvider() {
        return graphProvider;
    }

    /**
     * @param compositionProvider the compositionProvider to set
     */
    public void setCompositionProvider(ICompositionProvider compositionProvider) {
        this.compositionProvider = compositionProvider;
    }

    /**
     * @param graphProvider the graphProvider to set
     */
    public void setGraphProvider(IGraphProvider graphProvider) {
        this.graphProvider = graphProvider;
    }
}
