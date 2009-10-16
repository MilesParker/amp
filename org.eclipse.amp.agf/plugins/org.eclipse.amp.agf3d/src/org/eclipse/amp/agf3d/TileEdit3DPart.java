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
import org.eclipse.draw3d.IFigure3D;
import org.eclipse.draw3d.geometry.Vector3fImpl;

public class TileEdit3DPart extends AgentEdit3DPart {

    public TileEdit3DPart() {
        super();
        setUpdate(false);
    }

    /**
     * @return
     * @see org.eclipse.amp.agf3d.AgentEdit3DPart#createFigure()
     */
    protected IFigure createFigure() {
        IFigure figure = super.createFigure();
        ((IFigure3D) figure).getPosition3D().setSize3D(new Vector3fImpl(SCALE, SCALE, 0.1f));
        return figure;
    }
}
