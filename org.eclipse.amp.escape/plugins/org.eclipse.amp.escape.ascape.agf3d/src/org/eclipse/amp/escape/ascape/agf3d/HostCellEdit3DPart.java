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
import org.eclipse.amp.agf3d.TileEdit3DPart;
import org.eclipse.draw2d.IFigure;
import org.eclipse.swt.graphics.Color;

/**
 * 
 * @author mparker
 *
 */
public class HostCellEdit3DPart extends TileEdit3DPart {

    /**
     * @return
     * @see org.eclipse.amp.agf3d.AgentEdit3DPart#createFigure()
     */
    protected IFigure createFigure() {
        IFigure figure = super.createFigure();
        figure.setBackgroundColor((Color) ((Cell) getModel()).getPlatformColor());
        return figure;
    }
}
