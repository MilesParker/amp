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

import org.eclipse.amp.agf.IGraphicsAdapter;
import org.eclipse.amp.agf.gef.IModelFactoryProvider;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;

/**
 * 
 * @author mparker
 * 
 */
public class Model3DAdapterFactory implements IAdapterFactory {

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
        if (adapterType == IModel3DFactoryProvider.class) {
            IGraphics3DAdapter graphics3D = (IGraphics3DAdapter) Platform.getAdapterManager()
            .getAdapter(adaptableObject, IGraphics3DAdapter.class);
            IGraphicsAdapter graphics = (IGraphicsAdapter) Platform.getAdapterManager()
            .getAdapter(adaptableObject, IGraphicsAdapter.class);
            if (graphics3D != null) {
                return new DefaultModel3DFactoryProvider(graphics3D, graphics);
            }
        }
        return null;
    }

    /**
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapterList()
     */
    public Class[] getAdapterList() {
        return new Class[] { IModelFactoryProvider.class };
    }
}
