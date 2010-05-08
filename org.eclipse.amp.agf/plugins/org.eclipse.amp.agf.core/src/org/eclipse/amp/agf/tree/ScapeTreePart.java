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

import java.util.List;

import org.eclipse.amp.agf.GenericGraphicsProvider;
import org.eclipse.amp.agf.IGraphicsAdapter;
import org.eclipse.amp.axf.core.ICompositionProvider;
import org.eclipse.amp.axf.space.IGraphProvider;
import org.eclipse.amp.axf.space.ILocation2D;
import org.eclipse.amp.axf.space.ILocationProvider;
import org.eclipse.gef.EditPart;
import org.eclipse.swt.graphics.Image;

// TODO: Auto-generated Javadoc
/**
 * The Class ScapeTreePart.
 */
public class ScapeTreePart extends AgentTreePart {

    boolean updating;

    boolean firstRefresh = true;

    ILocationProvider locationProvider;
    ICompositionProvider compositionProvider;
    IGraphProvider graphProvider;

    public ScapeTreePart(ICompositionProvider compositionProvider, ILocationProvider locationProvider,
        IGraphProvider graphProvider, IGraphicsAdapter graphicsAdapter) {
        super(graphicsAdapter);
        this.locationProvider = locationProvider;
        this.compositionProvider = compositionProvider;
        this.graphProvider = graphProvider;
    }

    public void refresh() {
        super.refresh();
        // performance improvement..we only need to do this once for Array2D
        if (compositionProvider.isMutable(getModel())) {
            for (Object child : getChildren()) {
                ((EditPart) child).refresh();
            }
            firstRefresh = false;
        }
    }

    protected Image getImage() {
        if (compositionProvider.isChildrenComposition(getModel())) {
            return GenericGraphicsProvider.SCAPE_IMAGE;
        }
        if (graphProvider.isGraph(getModel())) {
            return GenericGraphicsProvider.GRAPH_IMAGE;
        }
        if (locationProvider.getExtent(getModel()) instanceof ILocation2D) {
            return GenericGraphicsProvider.GRID_IMAGE;
        }
        return GenericGraphicsProvider.LIST_IMAGE;
    }

    /**
     * @return
     * @see org.eclipse.gef.editparts.AbstractEditPart#getModelChildren()
     */
    @Override
    protected List getModelChildren() {
        List use = compositionProvider.getList(getModel());
        return use;
    }
}
