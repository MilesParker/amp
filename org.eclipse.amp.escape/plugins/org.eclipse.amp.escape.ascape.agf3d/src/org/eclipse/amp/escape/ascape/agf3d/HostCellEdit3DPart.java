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

import org.ascape.util.vis.ColorFeature;
import org.eclipse.amp.agf3d.Shapes3D;
import org.eclipse.draw2d.IFigure;
import org.eclipse.jface.viewers.IColorProvider;

/**
 * 
 * @author mparker
 *
 */
public class HostCellEdit3DPart extends AscapeAgentEdit3DPart {

    /**
     * @param colorProvider
     * 
     */
    public HostCellEdit3DPart(IColorProvider colorProvider) {
        super(Shapes3D.TILE_SHAPE_PROVIDER, colorProvider, false);
    }

    /**
     * @param colorProvider
     * 
     */
    public HostCellEdit3DPart(boolean update, IColorProvider colorProvider) {
        super(Shapes3D.TILE_SHAPE_PROVIDER, colorProvider, update);
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
            figure.setForegroundColor(ColorFeature.WHITE);
        }
        return figure;
    }
}
