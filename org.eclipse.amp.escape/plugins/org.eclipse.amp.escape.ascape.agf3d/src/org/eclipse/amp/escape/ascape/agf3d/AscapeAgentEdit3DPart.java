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

package org.eclipse.amp.escape.ascape.agf3d;

import org.ascape.model.Cell;
import org.ascape.util.vis.ColorFeatureConcrete;
import org.eclipse.amp.agf3d.AgentEdit3DPart;
import org.eclipse.amp.agf3d.ShapeType3D;
import org.eclipse.draw2d.IFigure;
import org.eclipse.swt.graphics.Color;

/**
 * 
 * @author mparker
 * 
 */
public class AscapeAgentEdit3DPart extends AgentEdit3DPart {

    public AscapeAgentEdit3DPart(ShapeType3D shapeType, boolean update) {
        super(shapeType, update);
    }

    public AscapeAgentEdit3DPart() {
    }

    /**
     * @param figure
     * @return
     * @see org.eclipse.amp.agf3d.AgentEdit3DPart#buildFigure(org.eclipse.draw2d.IFigure)
     */
    protected IFigure buildFigure(IFigure figure) {
        figure = super.buildFigure(figure);
        Color platformColor = (Color) ((Cell) getModel()).getPlatformColor();
        if (platformColor != null) {
            Color adjustBrightness = ColorFeatureConcrete.adjustBrightness(platformColor, .7f);
            figure.setForegroundColor(adjustBrightness);
        }
        figure.setBackgroundColor(platformColor);
        return figure;
    }
}
