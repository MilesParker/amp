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

package org.eclipse.amp.axf.space;

/**
 * A marker interface. The measures are not defined.
 * 
 * @author mparker
 * 
 */
public abstract class Location3DDoubleAdapter extends Location2DDoubleAdapter implements ILocation3D {

    /**
     * @return
     * @see org.eclipse.amp.axf.space.ILocation2D#getY()
     */
    public final Object getZ() {
        return getZDouble();
    }

    /**
     * @return
     * @see org.eclipse.amp.axf.space.ILocation2D#getYInteger()
     */
    public final int getZInteger() {
        return (int) getZDouble();
    }

    /**
     * @return
     * @see org.eclipse.amp.axf.space.ILocation2D#getYDouble()
     */
    public abstract double getZDouble();
}
