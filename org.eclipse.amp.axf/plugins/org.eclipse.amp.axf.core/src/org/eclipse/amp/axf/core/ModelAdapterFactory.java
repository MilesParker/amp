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

package org.eclipse.amp.axf.core;

import org.eclipse.amp.axf.space.IGraphProvider;
import org.eclipse.amp.axf.space.ILocationProvider;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;

/**
 * 
 * @author mparker
 * 
 */
public class ModelAdapterFactory implements IAdapterFactory {

    /**
     * @param adaptableObject
     * @param adapterType
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object, java.lang.Class)
     */
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        // Prevent circular recursion
        if (adaptableObject instanceof IModelAdapter && adapterType.isAssignableFrom(adaptableObject.getClass())) {
            return adaptableObject;
        } else if (adaptableObject instanceof IModel) {
            return Platform.getAdapterManager().getAdapter(((IModel) adaptableObject).getRoot(), adapterType);
        } else if (adaptableObject instanceof IAdaptable) {
            return ((IAdaptable) adaptableObject).getAdapter(IModelAdapter.class);
        }
        return null;
    }

    /**
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapterList()
     */
    public Class[] getAdapterList() {
        // TODO Auto-generated method stub
        return new Class[] { IGraphProvider.class, ICompositionProvider.class, ILocationProvider.class };
    }
}
