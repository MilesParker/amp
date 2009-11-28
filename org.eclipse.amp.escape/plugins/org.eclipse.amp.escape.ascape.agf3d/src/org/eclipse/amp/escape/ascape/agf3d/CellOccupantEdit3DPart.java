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

import org.ascape.util.vis.ColorFeatureConcrete;
import org.eclipse.amp.agf3d.Shapes3D;
import org.eclipse.draw2d.IFigure;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.swt.graphics.Color;

/**
 * 
 * @author mparker
 *
 */
public class CellOccupantEdit3DPart extends AscapeAgentEdit3DPart {

    /**
     * @param colorProvider
     * 
     */
    public CellOccupantEdit3DPart(IColorProvider colorProvider) {
        super(Shapes3D.DISC_SHAPE_PROVIDER, colorProvider, true);
    }

    /**
     * @param figure
     * @return
     * @see org.eclipse.amp.agf3d.AgentEdit3DPart#buildFigure(org.eclipse.draw2d.IFigure)
     */
    protected IFigure buildFigure(IFigure figure) {
        figure = super.buildFigure(figure);
        if ((figure.getForegroundColor() == null || figure.getForegroundColor() == figure.getBackgroundColor())
                && figure.getBackgroundColor() != null) {
            Color adjustBrightness = ColorFeatureConcrete.adjustBrightness(figure.getBackgroundColor(), .7f);
            figure.setForegroundColor(adjustBrightness);
        }
        return figure;
    }
}
