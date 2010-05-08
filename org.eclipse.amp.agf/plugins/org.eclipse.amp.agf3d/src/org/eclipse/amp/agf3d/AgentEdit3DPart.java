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
import org.eclipse.amp.agf.gef.AgentEditPart;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw3d.Figure3D;
import org.eclipse.draw3d.FigureSurface;
import org.eclipse.draw3d.IFigure3D;
import org.eclipse.draw3d.ISurface;
import org.eclipse.draw3d.ShapeFigure3D;
import org.eclipse.draw3d.geometry.IVector3f;
import org.eclipse.draw3d.geometry.Vector3fImpl;
import org.eclipse.draw3d.shapes.Shape;
import org.eclipse.swt.graphics.Color;


public class AgentEdit3DPart extends AgentEditPart {

    private IGraphics3DAdapter graphics3DAdapter;

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

    public AgentEdit3DPart(IGraphics3DAdapter graphics3DAdapter, IGraphicsAdapter graphicsAdapter, boolean update) {
        super(graphicsAdapter);
        this.graphics3DAdapter = graphics3DAdapter;
        this.update = update;
    }

    /**
     * @param model
     * @see org.eclipse.amp.agf.gef.AgentEditPart#setModel(java.lang.Object)
     */
    public void setModel(Object model) {
        super.setModel(model);
        shapeProvider = (IShape3DProvider) getGraphicsAdapter().getAdapter(model, IShape3DProvider.class);
    }

    @Override
    protected IFigure buildFigure(IFigure figure) {
        // todo we are ignoring case where shape could change..
        if (figure == null) {
            figure = new FigureImplementation();
            IVector3f size3d = shapeProvider.getSize3D(getModel());
            size3d = new Vector3fImpl(size3d.getX(), size3d.getY(), -size3d.getZ());
            ((Figure3D) figure).getPosition3D().setSize3D(size3d);
        }
        if (getColorProvider() != null) {
            Color foreground = getColorProvider().getForeground(getModel());
            if (figure.getForegroundColor() != foreground) {
                figure.setForegroundColor(foreground);
            }
            Color background = getColorProvider().getBackground(getModel());
            if (figure.getBackgroundColor() != background) {
                figure.setBackgroundColor(background);
            }
        }
        return figure;
    }

    protected void refreshVisuals() {
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

    /**
     * @return the shapeProvider
     */
    public IShape3DProvider getShapeProvider() {
        return shapeProvider;
    }
}
