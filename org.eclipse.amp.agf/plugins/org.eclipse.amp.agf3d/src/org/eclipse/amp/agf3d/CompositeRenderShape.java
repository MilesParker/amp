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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw3d.IFigure3D;
import org.eclipse.draw3d.RenderContext;
import org.eclipse.draw3d.shapes.CuboidShape;
import org.eclipse.draw3d.shapes.CylinderShape;
import org.eclipse.draw3d.shapes.PositionableShape;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.swt.graphics.Color;

/**
 * Adapated from org.eclipse.draw3d.shapes.CubiodShape
 * 
 * @author mparker
 * @author Kristian Duske
 * 
 */
public class CompositeRenderShape extends RenderShape {

    private List<PositionableShape> shapes = new ArrayList<PositionableShape>();

    IColorProvider colorProvider;

    /**
     * @param figure
     * @param renderer
     * @param object
     */
    public CompositeRenderShape(IFigure3D figure, Object object, IColorProvider colorProvider) {
        super(figure, null, object);
        this.colorProvider = colorProvider;
    }

    public void addShape(PositionableShape shape) {
        shapes.add(shape);
    }

    /**
     * @param iRenderContext
     * @see org.eclipse.amp.agf3d.RenderShape#doRender(org.eclipse.draw3d.RenderContext)
     */
    protected void doRender(RenderContext context) {
        Color colorForAll = null;
        if (colorProvider != null) {
            colorForAll = colorProvider.getBackground(getModel());
        } else {
            colorForAll = figure.getBackgroundColor();
        }
        for (PositionableShape shape : shapes) {
            if (shape instanceof CylinderShape) {
                ((CylinderShape) shape).setFillColor(colorForAll);
            } else if (shape instanceof CuboidShape) {
                ((CuboidShape) shape).setFillColor(colorForAll);
            }
            shape.render(context);
        }
    }

    /**
     * @return the shapes
     */
    public List<PositionableShape> getShapes() {
        return shapes;
    }
}
