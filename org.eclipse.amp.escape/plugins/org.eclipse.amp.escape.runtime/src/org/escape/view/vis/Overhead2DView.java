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

package org.escape.view.vis;

import org.ascape.model.CellOccupant;
import org.ascape.model.LocatedAgent;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;

/**
 * 
 * @author mparker
 *
 */
public class Overhead2DView extends org.ascape.view.vis.Overhead2DView {
    private static final long serialVersionUID = 1L;

    protected synchronized void drawSelectedAgentAt(Graphics graphics, LocatedAgent a) {
        if (a instanceof CellOccupant) {
            graphics.setLineWidth(Math.max(2, agentSize / 10));
            graphics.setForegroundColor(ColorConstants.yellow);
            graphics.setBackgroundColor(ColorConstants.black);
            graphics.setLineStyle(Graphics.LINE_DASH);
            graphics.drawOval(0, 0, agentSize - 1, agentSize - 1);
        } else {
            graphics.setLineWidth(Math.max(2, agentSize / 10));
            graphics.setForegroundColor(ColorConstants.yellow);
            graphics.setBackgroundColor(ColorConstants.black);
            graphics.setLineStyle(Graphics.LINE_DASH);
            graphics.drawRectangle(0, 0, agentSize - 1, agentSize - 1);
        }
    }
}
