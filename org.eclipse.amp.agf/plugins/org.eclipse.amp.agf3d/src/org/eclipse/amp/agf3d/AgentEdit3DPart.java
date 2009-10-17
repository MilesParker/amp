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
import org.eclipse.draw3d.geometry.Vector3f;
import org.eclipse.draw3d.geometry.Vector3fImpl;
import org.eclipse.draw3d.shapes.CuboidFigureShape;
import org.eclipse.draw3d.shapes.CylindricFigureShape;
import org.eclipse.draw3d.shapes.Shape;
import org.eclipse.draw3d.shapes.SphereFigureShape;


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
            setAlpha((byte) 0x255);
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
                invalidate();
                helper.revalidate();
            }
        }
        /**
         * @return
         * @see org.eclipse.draw3d.ShapeFigure3D#createShape()
         */
        protected Shape createShape() {
            Shape createShape = AgentEdit3DPart.this.createShape();
            return createShape;
        }
    }

    CuboidFigureShape cube;

    boolean update = true;

    ShapeType3D shapeType = ShapeType3D.CUBE;

    public AgentEdit3DPart(ShapeType3D shapeType, boolean update) {
        super();
        this.shapeType = shapeType;
        this.update = update;
    }

    /**
     * 
     */
    public AgentEdit3DPart() {
    }

    protected Shape createShape() {
        switch (shapeType) {
            case CUBE:
                return new CuboidFigureShape((IFigure3D) getFigure());
            case CYLINDER:
                return new CylindricFigureShape((IFigure3D) getFigure(), 30, 1.0f, false);
            case SPHERE:
                return new SphereFigureShape((IFigure3D) getFigure(), 3);
            case TILE:
                return new CuboidFigureShape((IFigure3D) getFigure());
        }
        return null;
    }

    protected Vector3f getSize3D() {
        switch (shapeType) {
            case CUBE:
                return new Vector3fImpl(SCALE * .75f, SCALE * .75f, SCALE * .75f);
            case CYLINDER:
                // "checker"
                return new Vector3fImpl(SCALE, SCALE, SCALE * .20f);
            case SPHERE:
                return new Vector3fImpl(SCALE, SCALE, SCALE);
            case TILE:
                return new Vector3fImpl(SCALE, SCALE, 0.0f);
        }
        return new Vector3fImpl(SCALE, SCALE, SCALE);
    }

    @Override
    protected IFigure buildFigure(IFigure figure) {
        if (figure == null) {
            figure = new FigureImplementation();
            ((Figure3D) figure).getPosition3D().setSize3D(getSize3D());
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

    public CuboidFigureShape getCube() {
        return cube;
    }
}
