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

import org.eclipse.amp.agf.gef.AgentEditPart;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw3d.Figure3D;
import org.eclipse.draw3d.FigureSurface;
import org.eclipse.draw3d.IFigure3D;
import org.eclipse.draw3d.ISurface;
import org.eclipse.draw3d.ShapeFigure3D;
import org.eclipse.draw3d.geometry.IVector3f;
import org.eclipse.draw3d.shapes.CuboidFigureShape;
import org.eclipse.draw3d.shapes.Shape;
import org.eclipse.jface.viewers.IColorProvider;


public class AgentEdit3DPart extends AgentEditPart {

    /**
     * 
     * @author mparker
     *
     */
    private final class FigureImplementation extends ShapeFigure3D {

        private ISurface m_surface = new FigureSurface(this);

        public FigureImplementation() {
            setBackgroundColor(ColorConstants.white);
            setAlpha(255);
        }
        @Override
        public ISurface getSurface() {
            return m_surface;
        }
        /**
         * @see IFigure#revalidate()
         */
        public void revalidate() {
            // if our state or position can change, we will always want to redraw, otherwise, we never do.
            if (update) {
                // invalidate();
                // helper.revalidate();
            }
        }
        /**
         * @return
         * @see org.eclipse.draw3d.ShapeFigure3D#createShape()
         */
        protected Shape createShape() {
            Shape createShape = shapeProvider.getShape3D(getModel(), (IFigure3D) figure);
            return createShape;
        }
    }

    boolean update = true;

    IShape3DProvider shapeProvider;

    IColorProvider colorProvider;

    public AgentEdit3DPart(IShape3DProvider shapeProvider, IColorProvider colorProvider, boolean update) {
        super();
        this.colorProvider = colorProvider;
        this.shapeProvider = shapeProvider;
        this.update = update;
    }

    public AgentEdit3DPart(IShape3DProvider shapeProvider, IColorProvider colorProvider) {
        this(shapeProvider, colorProvider, true);
    }
    /**
     * 
     */
    public AgentEdit3DPart() {
    }

    @Override
    protected IFigure buildFigure(IFigure figure) {
        if (figure == null) {
            figure = new FigureImplementation();
            ((Figure3D) figure).getPosition3D().setSize3D(shapeProvider.getSize3D(getModel()));
            if (colorProvider != null) {
                figure.setForegroundColor(colorProvider.getForeground(getModel()));
                figure.setBackgroundColor(colorProvider.getBackground(getModel()));
            }
        }
        return figure;
    }

    protected IFigure createFigure() {
        IFigure3D buildFigure = (IFigure3D) buildFigure(null);
        return buildFigure;
    }

    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    /**
     * @return
     */
    public IVector3f getRelativeLocation3D() {
        return shapeProvider.getRelativeLocation3D(getModel());
    }
}
