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

import org.eclipse.amp.agf.IGraphicsAdapted;
import org.eclipse.amp.agf.IGraphicsAdapter;
import org.eclipse.amp.agf.IGraphicsAdapterFactory;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.core.runtime.Platform;

public class Graphics3DAdapterFactory implements IGraphicsAdapterFactory {

    /**
     * @param adaptableObject
     * @param adapterType
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object, java.lang.Class)
     */
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        if (adaptableObject instanceof IModel) {
            return Platform.getAdapterManager().getAdapter(((IModel) adaptableObject).getRoot(), adapterType);
        }
        if (adapterType == IGraphics3DAdapter.class) {
            return Graphics3DAdapter.getDefault3D();
        }
        if (adapterType == IModel3DFactoryProvider.class) {
            IGraphicsAdapter graphicsAdapter = null;
            if (adaptableObject instanceof IGraphicsAdapted) {
                graphicsAdapter = ((IGraphicsAdapted) adaptableObject).getGraphicsAdapter();
            }
            if (!(graphicsAdapter instanceof IGraphicsAdapter)) {
                graphicsAdapter = (IGraphicsAdapter) Platform.getAdapterManager().getAdapter(adaptableObject,
                                                                                             IGraphicsAdapter.class);
            }
            IGraphics3DAdapter graphicsAdapter3D = null;
            if (adaptableObject instanceof IGraphics3DAdapted) {
                graphicsAdapter3D = ((IGraphics3DAdapted) adaptableObject).getGraphics3DAdapter();
            }
            if (!(graphicsAdapter3D instanceof IGraphics3DAdapter)) {
                graphicsAdapter3D = (IGraphics3DAdapter) Platform.getAdapterManager()
                .getAdapter(adaptableObject,
                            IGraphics3DAdapter.class);
            }
            if (graphicsAdapter != null && graphicsAdapter3D != null) {
                return new DefaultModel3DFactoryProvider(graphicsAdapter3D, graphicsAdapter);
            }
        }
        return null;
    }

    /**
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapterList()
     */
    public Class[] getAdapterList() {
        return new Class[] { IModel3DFactoryProvider.class, IGraphics3DAdapter.class };
    }
}