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
 * 
 * @author mparker
 *
 */
public abstract class Location1DIntegerAdapter implements ILocation1D {

    /**
     * 
     */
    public Location1DIntegerAdapter() {
        super();
    }

    /**
     * @return
     * @see org.eclipse.amp.axf.space.ILocation2D#getX()
     */
    public final Object getX() {
        return getXInteger();
    }

    /**
     * @return
     * @see org.eclipse.amp.axf.space.ILocation2D#getXInteger()
     */
    public abstract int getXInteger();

    /**
     * @return
     * @see org.eclipse.amp.axf.space.ILocation2D#getXDouble()
     */
    public final double getXDouble() {
        return getXInteger();
    }

}