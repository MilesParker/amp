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
package org.eclipse.amp.agf3d;

import org.eclipse.amp.agf.IGraphicsAdapter;
import org.eclipse.amp.agf.gef.ScapePartFactory;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.gef.EditPart;

public class Scape3DPartFactory extends ScapePartFactory {

    private final IGraphics3DAdapter graphics3DAdapter;

    public Scape3DPartFactory(IModel model, IGraphics3DAdapter graphics3DAdapter, IGraphicsAdapter graphicsAdapter) {
        super(model, graphicsAdapter);
        this.graphics3DAdapter = graphics3DAdapter;
    }

    protected EditPart getPartForElement(Object model) {

        if (getCompositionProvider().isComposition(model)) {
            // if (!getGraphProvider().isGraph(model)) {
            IShape3DProvider shape = (IShape3DProvider) getGraphics3DAdapter()
            .getAdapter(getCompositionProvider().getChildrenPrototype(model), IShape3DProvider.class);
            if (shape != null) {
                if (getCompositionProvider().getParent(model) == null) {
                    return new ScapeEditRoot3DPart(getCompositionProvider(), getLocationProvider(), null);
                } else {
                    return new ScapeEdit3DPart(getCompositionProvider(), getLocationProvider(), null);
                }
            }
            // }
        }
        return new AgentEdit3DPart(graphics3DAdapter, getGraphicsAdapter(), true);
    }

    /**
     * @return the graphics3dAdapter
     */
    public IGraphics3DAdapter getGraphics3DAdapter() {
        return graphics3DAdapter;
    }
}
