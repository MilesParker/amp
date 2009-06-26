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

import org.ascape.model.Cell;
import org.eclipse.amp.agf.gef.AgentEditPart;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.swt.graphics.Color;

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
        if (figure == null) {
            figure = shapeRectangle();
        }
        Color platformColor = (Color) ((Cell) getModel()).getPlatformColor();
        ((Shape) figure).setForegroundColor(platformColor);
        ((Shape) figure).setBackgroundColor(platformColor);
        return figure;
    }
}
