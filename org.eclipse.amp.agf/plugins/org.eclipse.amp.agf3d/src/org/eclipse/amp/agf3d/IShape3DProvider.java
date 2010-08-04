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

import org.eclipse.draw3d.IFigure3D;
import org.eclipse.draw3d.geometry.IVector3f;
import org.eclipse.draw3d.shapes.Shape;

/**
 * 
 * @author mparker
 *
 */
public interface IShape3DProvider {
    public Shape getShape3D(Object object, IFigure3D figure);

    /**
     * @param object
     * @return
     */
    IVector3f getSize3D(Object object);

    /**
     * @param object
     * @return
     */
    IVector3f getRelativeLocation3D(Object object);
}
