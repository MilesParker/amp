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

package org.eclipse.amp.agf3d;

import org.eclipse.core.runtime.Platform;

/**
 * 
 * @author mparker
 *
 */
public class Graphics3DAdapter implements IGraphics3DAdapter {

    private static IGraphics3DAdapter singleton;

    public static Class[] GRAPHICS_ADAPTERS = new Class[] { IShape3DProvider.class };

    private static final IShape3DProvider[] EMPTY_SHAPE_PROVIDERS = new IShape3DProvider[] {};

    /**
     * @param object
     * @return
     * @see org.eclipse.amp.agf3d.IGraphics3DAdapter#getShapes(java.lang.Object)
     */
    public IShape3DProvider[] getShapes(Object object) {
        return getShapesForClass(object.getClass());
    }

    /**
     * @param object
     * @return
     * @see org.eclipse.amp.agf3d.IGraphics3DAdapter#getShapesForClass(java.lang.Class)
     */
    public IShape3DProvider[] getShapesForClass(Class object) {
        return EMPTY_SHAPE_PROVIDERS;
    }

    /**
     * @param adaptableObject
     * @param adapterType
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object, java.lang.Class)
     */
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        if (adapterType == IShape3DProvider.class) {
            IShape3DProvider[] shapeProviders = getShapes(adaptableObject);
            if (shapeProviders != null && shapeProviders.length > 0) {
                return shapeProviders[0];
            }
        }
        return Platform.getAdapterManager().getAdapter(adaptableObject, adapterType);
    }

    public static IGraphics3DAdapter getDefault3D() {
        if (singleton == null) {
            singleton = new Graphics3DAdapter();
        }
        return singleton;
    }

    /**
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapterList()
     */
    public Class[] getAdapterList() {
        return GRAPHICS_ADAPTERS;
    }
}
