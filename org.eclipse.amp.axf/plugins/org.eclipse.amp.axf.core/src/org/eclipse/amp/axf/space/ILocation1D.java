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
 * Provides all castings. It is up to implementor to decide how to coerce values, but all values must be legal. It is
 * not required that the Integer values map directly to doubles, just that any mapping be consistent across the entire
 * scape. For example, a very precise double provider might choose instead to scale up integer values to an appropriate
 * level of granularity.
 * 
 * @author mparker
 * 
 */
public interface ILocation1D extends ILocation {
    public Object getX();

    public int getXInteger();

    public double getXDouble();
}
