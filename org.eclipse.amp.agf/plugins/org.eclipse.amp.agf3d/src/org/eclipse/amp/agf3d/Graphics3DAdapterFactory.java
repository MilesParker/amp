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

import org.eclipse.amp.agf.IGraphicsAdapterFactory;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;

public class Graphics3DAdapterFactory implements IGraphicsAdapterFactory {

    /**
     * @param adaptableObject
     * @param adapterType
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object, java.lang.Class)
     */
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        if (adapterType == IGraphics3DAdapter.class) {
            IGraphics3DAdapter graphicsAdapter3D = null;
            if (adaptableObject instanceof IGraphics3DAdapted) {
                graphicsAdapter3D = ((IGraphics3DAdapted) adaptableObject).getGraphics3DAdapter();
            } else if (adaptableObject instanceof IAdaptable) {
                graphicsAdapter3D = (IGraphics3DAdapter) ((IAdaptable) adaptableObject).getAdapter(IGraphics3DAdapter.class);
            }
            if (graphicsAdapter3D == null) {
                graphicsAdapter3D = Graphics3DAdapter.getDefault3D();
            }
            return graphicsAdapter3D;
        }
        return null;
    }

    /**
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapterList()
     */
    public Class[] getAdapterList() {
        return new Class[] { IGraphics3DAdapter.class };
    }
}