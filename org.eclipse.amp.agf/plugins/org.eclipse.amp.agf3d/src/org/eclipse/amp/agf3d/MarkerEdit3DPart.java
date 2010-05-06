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

import org.eclipse.amp.agf.gef.IFigureProvider;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw3d.IFigure3D;
import org.eclipse.draw3d.shapes.CuboidFigureShape;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;

public class MarkerEdit3DPart extends AgentEdit3DPart {

    CuboidFigureShape[] markers = new CuboidFigureShape[4];

    public MarkerEdit3DPart(IShape3DProvider shapeProvider, IFigureProvider figureProvider,
            IColorProvider colorProvider, ILabelProvider labelProvider, boolean update) {
        super(Shapes3D.CUBE_SHAPE_PROVIDER, colorProvider, update);
    }

    protected IFigure createFigure() {
        final IFigure3D figure = (IFigure3D) super.createFigure();
        //
        // int i = 0;
        // for (CuboidFigureShape marker : markers) {
        // Position3DImpl pos = new Position3DImpl();
        // pos.setSize3D(new Vector3fImpl(SCALE * .25f, SCALE * .25f, SCALE * .25f));
        // pos.setLocation3D(new Vector3fImpl(fl.getX() + SCALE * (i / 2) * 0.5f, fl.getY() + SCALE * (i % 2)
        // * 0.5f, fl.getZ() + SCALE * 0.75f));
        //
        // if (marker != null) {
        // marker.setPosition(pos);
        // marker.render(renderContext);
        // }
        // i++;
        // }
        return figure;
    }

    public CuboidFigureShape getMarker(int index) {
        return markers[index - 1];
    }

    public void setShowMarker(int markerID, boolean show) {
        if (show) {
            markers[markerID - 1] = new CuboidFigureShape((IFigure3D) getFigure());
        } else {
            markers[markerID - 1] = null;
        }
    }
}
