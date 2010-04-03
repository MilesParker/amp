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
public abstract class Location2DIntegerAdapter extends Location1DIntegerAdapter implements ILocation2D {

    /**
     * @return
     * @see org.eclipse.amp.axf.space.ILocation2D#getY()
     */
    public final Object getY() {
        return getYInteger();
    }

    /**
     * @return
     * @see org.eclipse.amp.axf.space.ILocation2D#getYInteger()
     */
    public abstract int getYInteger();

    /**
     * @return
     * @see org.eclipse.amp.axf.space.ILocation2D#getYDouble()
     */
    public final double getYDouble() {
        return getYInteger();
    }
}
