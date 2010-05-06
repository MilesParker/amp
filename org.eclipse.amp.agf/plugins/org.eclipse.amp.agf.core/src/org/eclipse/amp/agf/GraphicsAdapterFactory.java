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

package org.eclipse.amp.agf;

import org.eclipse.amp.agf.gef.DefaultModelFactoryProvider;
import org.eclipse.amp.agf.gef.IFigureProvider;
import org.eclipse.amp.agf.gef.IModelFactoryProvider;
import org.eclipse.amp.agf.gef.Shapes;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;

/**
 * 
 * @author mparker
 * 
 */
public class GraphicsAdapterFactory implements IAdapterFactory {

    /**
     * @param adaptableObject
     * @param adapterType
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object, java.lang.Class)
     */
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        // Potential issue if someone implements the platform adapter..
        if (adapterType.isAssignableFrom(adaptableObject.getClass())) {
            return adaptableObject;
        }
        if (adaptableObject instanceof IAdaptable) {
            IAdapterFactory chainedFactory = (IAdapterFactory) ((IAdaptable) adaptableObject)
            .getAdapter(IAdapterFactory.class);
            if (chainedFactory != null) {
                Object object = chainedFactory.getAdapter(adaptableObject, adapterType);
                if (object != null) {
                    return object;
                }
            }
        }
        if (adaptableObject instanceof IModel) {
            if (adapterType == IModelFactoryProvider.class) {
                return DefaultModelFactoryProvider.getDefault();
            }
            return Platform.getAdapterManager().getAdapter(((IModel) adaptableObject).getRoot(), adapterType);
        }
        if (adapterType == IFigureProvider.class) {
            return Shapes.RECTANGLE_SHAPE_PROVIDER;
        } else if (adapterType == IColorProvider.class) {
            return Shapes.DEFAULT_COLOR_PROVIDER;
        }
        return null;
    }

    /**
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapterList()
     */
    public Class[] getAdapterList() {
        return new Class[] { ILabelProvider.class, IColorProvider.class, IModelFactoryProvider.class };
    }
}
