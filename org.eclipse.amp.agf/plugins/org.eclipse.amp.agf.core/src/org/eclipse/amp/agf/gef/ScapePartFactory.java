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

import org.eclipse.amp.agf.IGraphicsAdapter;
import org.eclipse.amp.axf.core.ICompositionProvider;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.space.IGraphProvider;
import org.eclipse.amp.axf.space.ILocationProvider;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

/**
 * 
 * @author mparker
 * 
 */
public class ScapePartFactory implements EditPartFactory {

    IModel model;

    ILocationProvider locationProvider;
    ICompositionProvider compositionProvider;
    IGraphProvider graphProvider;

    IGraphicsAdapter graphicsAdapter;

    public ScapePartFactory(IModel model, IGraphicsAdapter graphicsAdapter) {
        super();
        this.model = model;
        this.graphicsAdapter = graphicsAdapter;
        compositionProvider = (ICompositionProvider) Platform.getAdapterManager()
        .getAdapter(model, ICompositionProvider.class);
        locationProvider = (ILocationProvider) Platform.getAdapterManager().getAdapter(model, ILocationProvider.class);
        graphProvider = (IGraphProvider) Platform.getAdapterManager().getAdapter(model, IGraphProvider.class);
        Assert.isNotNull(graphicsAdapter);
        Assert.isNotNull(compositionProvider);
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
            // We use the default provider
            IFigureProvider figure = (IFigureProvider) graphicsAdapter.getAdapter(compositionProvider
                                                                                  .getChildrenPrototype(model), IFigureProvider.class);
            if (figure != null) {
                if (graphProvider.isGraph(model)) {
                    return new ScapeGraphEditPart(compositionProvider, locationProvider, graphProvider, null);
                }
                return new ScapeEditPart(compositionProvider, locationProvider, null);
            }
        } else if (model instanceof NetworkConnection) {
            return new AgentConnectionPart();
        }
        return new AgentEditPart(graphicsAdapter);
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

    public ILocationProvider getLocationProvider() {
        return locationProvider;
    }

    /**
     * @return the graphicsAdapter
     */
    public IGraphicsAdapter getGraphicsAdapter() {
        return graphicsAdapter;
    }
}
