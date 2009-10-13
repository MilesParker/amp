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

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw3d.Figure3D;
import org.eclipse.draw3d.IFigure3D;
import org.eclipse.draw3d.RenderContext;
import org.eclipse.draw3d.geometry.IVector3f;
import org.eclipse.draw3d.geometry.Position3D;
import org.eclipse.draw3d.geometry.Position3DImpl;
import org.eclipse.draw3d.geometry.Vector3fImpl;
import org.eclipse.draw3d.shapes.CuboidFigureShape;

public class CubeEdit3DPart extends AgentEdit3DPart {

    CuboidFigureShape[] markers = new CuboidFigureShape[4];

    protected IFigure createFigure() {
        // if (getMemberProvider().getParent(getModel()) == null) {
        // ScalableFreeformLayeredPane scalableFreeformLayeredPane = new ScalableFreeformLayeredPane();
        // f = scalableFreeformLayeredPane;
        // f.setBounds(new Rectangle(new Point(0, 0), calculateDimension()));
        // } else {
        // f = new FreeformLayer();
        // f.setBounds(getRootScapeEditPart().getFigure().getBounds());
        // }
        // f.setLayoutManager(new XYLayout());
        // f.setOpaque(false);
        final IFigure3D figure = new Figure3D();
        cube = new CuboidFigureShape(figure);
//
//        int i = 0;
//        for (CuboidFigureShape marker : markers) {
//            Position3DImpl pos = new Position3DImpl();
//            pos.setSize3D(new Vector3fImpl(SCALE * .25f, SCALE * .25f, SCALE * .25f));
//            pos.setLocation3D(new Vector3fImpl(fl.getX() + SCALE * (i / 2) * 0.5f, fl.getY() + SCALE * (i % 2)
//                                               * 0.5f, fl.getZ() + SCALE * 0.75f));
//            
//            if (marker != null) {
//                marker.setPosition(pos);
//                marker.render(renderContext);
//            }
//            i++;
//        }
        updateGraphics();
        assignSize(figure);
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
