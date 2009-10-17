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

import org.eclipse.amp.agf3d.ShapeType3D;

/**
 * 
 * @author mparker
 *
 */
public class HostCellEdit3DPart extends AscapeAgentEdit3DPart {

    /**
     * 
     */
    public HostCellEdit3DPart() {
        super(ShapeType3D.TILE, false);
    }

    /**
     * 
     */
    public HostCellEdit3DPart(boolean update) {
        super(ShapeType3D.TILE, update);
    }

}
