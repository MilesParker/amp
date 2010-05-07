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
package org.eclipse.amp.escape.ascape.adapt;

import org.eclipse.amp.agf3d.Graphics3DAdapter;
import org.eclipse.amp.agf3d.IShape3DProvider;
import org.eclipse.amp.agf3d.Shapes3D;

import org.ascape.model.CellOccupant;
import org.ascape.model.HostCell;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating ScapeAdapter objects.
 */
public class AscapeDefaultGraphics3DAdapter extends Graphics3DAdapter{

    private static final IShape3DProvider[] DEFAULT_HOST_CELL_SHAPE_PROVIDERS = new IShape3DProvider[] { Shapes3D.TILE_SHAPE_PROVIDER };

    private static final IShape3DProvider[] DEFAULT_OCCUPANT_SHAPE_PROVIDERS = new IShape3DProvider[] { Shapes3D.DISC_SHAPE_PROVIDER };

    private static final IShape3DProvider[] DEFAULT_SHAPE_PROVIDERS = new IShape3DProvider[] { Shapes3D.CUBE_SHAPE_PROVIDER };

    /**
     * @param object
     * @return
     * @see org.eclipse.amp.agf3d.Graphics3DAdapter#getShapesForClass(java.lang.Class)
     */
    public IShape3DProvider[] getShapesForClass(Class type) {
        if (CellOccupant.class.isAssignableFrom(type)) {
            return DEFAULT_OCCUPANT_SHAPE_PROVIDERS;
        } else if (HostCell.class.isAssignableFrom(type)) {
            return DEFAULT_HOST_CELL_SHAPE_PROVIDERS;
        }
        return DEFAULT_SHAPE_PROVIDERS;
    }
}
