/**
 * <copyright>
 *
 * Copyright (c) 2010 Metascape, LLC.
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

package org.eclipse.amp.agf.gef;

import org.eclipse.amp.axf.space.ILocation2D;
import org.eclipse.amp.axf.space.ILocationProvider;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;

/**
 * 
 * @author mparker
 * 
 */
public final class GEFUtils {
    public static final Point toScaledPoint(ILocation2D location) {
        // we use double as there is possibility of non-integer values -- we expect them to scale reasonably,
        // however.
        // TODO perhaps we need a more generic scaling definition
        return new Point((int) location.getXDouble() * GenericEditPart.SCALE, (int) location.getYDouble()
                         * GenericEditPart.SCALE);
    }

    public static final Dimension toScaledDimension(ILocation2D location) {
        return new Dimension((int) location.getXDouble() * GenericEditPart.SCALE, (int) location.getYDouble()
                             * GenericEditPart.SCALE);
    }

    public static final Dimension getScaledExtent(ILocationProvider locationProvider, Object object) {
        ILocation2D extent = (ILocation2D) locationProvider.getExtent(object);
        if (extent != null) {
            return GEFUtils.toScaledDimension(extent);
        }
        return null;
    }
}
