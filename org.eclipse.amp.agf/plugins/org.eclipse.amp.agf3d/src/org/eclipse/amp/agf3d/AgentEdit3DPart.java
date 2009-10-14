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
import org.eclipse.draw3d.ISurface;
import org.eclipse.draw3d.ShapeFigure3D;
import org.eclipse.draw3d.geometry.Vector3fImpl;
import org.eclipse.draw3d.shapes.CuboidFigureShape;
import org.eclipse.draw3d.shapes.Shape;


public class AgentEdit3DPart extends AgentEditPart {

    /**
     * 
     * @author mparker
     *
     */
    private final class CubeFigure extends ShapeFigure3D {

        private ISurface m_surface = new FigureSurface(this);

        public CubeFigure() {
            super();
            // SurfaceLayout.setDelegate(this, new FreeformLayout());
            getPosition3D().setSize3D(new Vector3fImpl(SCALE * .75f, SCALE * .75f, SCALE * .75f));
            setBackgroundColor(ColorConstants.white);
            setAlpha((byte) 0x44);
        }

        @Override
        public ISurface getSurface() {
            return m_surface;
        }

        /**
         * @see IFigure#revalidate()
         */
        public void revalidate() {
            invalidate();
        }

        /**
         * @return
         * @see org.eclipse.draw3d.ShapeFigure3D#createShape()
         */
        protected Shape createShape() {
            return new CuboidFigureShape(this);
        }
    }

    CuboidFigureShape cube;

    boolean update = true;

    protected IFigure createFigure() {
        final Figure3D figure = new CubeFigure();

        return figure;
    }

    protected void updateGraphics() {
    }

    protected void refreshVisuals() {
        super.refreshVisuals();
        if (update) {
            updateGraphics();
        }
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
