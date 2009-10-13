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
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw3d.Figure3D;
import org.eclipse.draw3d.IFigure3D;
import org.eclipse.draw3d.geometry.Vector3fImpl;
import org.eclipse.draw3d.shapes.CuboidFigureShape;

public class AgentEdit3DPart extends AgentEditPart {

    CuboidFigureShape cube;

    boolean update = true;

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
        return figure;
    }

    protected void assignSize(final IFigure3D figure) {
        figure.getPosition3D().setSize3D(new Vector3fImpl(SCALE * .75f, SCALE * .75f, SCALE * .75f));
        // marker.getPosition3D().setLocation3D(new Vector3fImpl(SCALE * .25f, SCALE * .25f, SCALE * .25f));
        // marker.getPosition3D().setSize3D(new Vector3fImpl(SCALE * .25f, SCALE * .25f, SCALE * .25f));
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
