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

package org.eclipse.amp.agf3d;

import org.eclipse.amp.agf.IGraphicsAdapter;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.gef.EditPartFactory;

/**
 * 
 * @author mparker
 *
 */
public class DefaultModel3DFactoryProvider implements IModel3DFactoryProvider {

    private final IGraphics3DAdapter graphicsAdapter3D;
    private final IGraphicsAdapter graphicsAdapter;

    public DefaultModel3DFactoryProvider(IGraphics3DAdapter graphicsAdapter3D, IGraphicsAdapter graphicsAdapter) {
        this.graphicsAdapter3D = graphicsAdapter3D;
        this.graphicsAdapter = graphicsAdapter;
    }

    /**
     * @param model
     * @return
     * @see org.eclipse.amp.agf3d.IModel3DFactoryProvider#getEditPart3DFactory(java.lang.Object)
     */
    public EditPartFactory getEditPart3DFactory(Object model) {
        return new Scape3DPartFactory((IModel) model, graphicsAdapter3D, graphicsAdapter);
    }
}
