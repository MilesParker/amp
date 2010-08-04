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

import org.eclipse.amp.agf.gef.GenericEditPart;
import org.eclipse.draw3d.IFigure3D;
import org.eclipse.draw3d.geometry.IVector3f;
import org.eclipse.draw3d.geometry.Vector3fImpl;
import org.eclipse.draw3d.shapes.Shape;

/**
 * 
 * @author mparker
 *
 */
public class RenderingShapeProvider implements IShape3DProvider {

    IRenderer renderer;

    public RenderingShapeProvider(IRenderer renderer) {
        super();
        this.renderer = renderer;
    }

    /**
     * @param object
     * @param figure
     * @return
     * @see org.eclipse.amp.agf3d.IShape3DProvider#getShape3D(java.lang.Object, IFigure3D)
     */
    public Shape getShape3D(Object object, IFigure3D figure) {
        return new RenderShape(figure, renderer, object);
    }

    public IVector3f getSize3D(Object object) {
        return new Vector3fImpl(GenericEditPart.SCALE, GenericEditPart.SCALE, GenericEditPart.SCALE);
    }

    public IVector3f getRelativeLocation3D(Object object) {
        return new Vector3fImpl(GenericEditPart.SCALE, GenericEditPart.SCALE, 0);
    }

    public static IShape3DProvider createProvider(IRenderer renderer) {
        return new RenderingShapeProvider(renderer);
    }
}
