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
package org.eclipse.amp.escape.ascape.gef;

import org.eclipse.amp.agf.gef.AgentEditPart;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.swt.graphics.Color;

import org.ascape.model.LocatedAgent;

// TODO: Auto-generated Javadoc
/**
 * The Class HostCellEditPart.
 */
public class HostCellEditPart extends AgentEditPart {

    /**
     * @param figure
     * @return
     * @see org.eclipse.amp.agf.gef.GenericEditPart#buildFigure(org.eclipse.draw2d.IFigure)
     */
    @Override
    protected IFigure buildFigure(IFigure figure) {
        LocatedAgent agent = (LocatedAgent) getModel();
        if (figure == null) {
            figure = shapeRectangle();
            int size = AgentEditPart.SCALE * agent.getAgentSize();
            // figure.setSize(size, size);
        }
        Color platformColor = (Color) agent.getPlatformColor();
        ((Shape) figure).setForegroundColor(platformColor);
        ((Shape) figure).setBackgroundColor(platformColor);
        return figure;
    }
}
