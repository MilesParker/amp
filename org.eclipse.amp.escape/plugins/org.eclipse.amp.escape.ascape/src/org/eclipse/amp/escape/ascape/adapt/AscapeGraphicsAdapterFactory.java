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
package org.eclipse.amp.escape.ascape.adapt;

import java.util.Arrays;

import org.eclipse.amp.agf.GraphicsAdapterFactory;
import org.eclipse.amp.agf.gef.IModelFactoryProvider;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating ScapeAdapter objects.
 */
public class AscapeGraphicsAdapterFactory extends GraphicsAdapterFactory {

    public static final Class[] AGF_PROVIDERS = { ILabelProvider.class, IColorProvider.class,
        IModelFactoryProvider.class };

    /**
     * @param adaptableObject
     * @param adapterType
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object, java.lang.Class)
     */
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        Object adapter = super.getAdapter(adaptableObject, adapterType);
        if (adapter != null) {
            return adapter;
        }
        if (adapterType == IModelFactoryProvider.class) {
            return new AscapeModelFactoryProvider();
        }
        if (Arrays.asList(AGF_PROVIDERS).contains(adapterType)) {
            return AscapeGraphicsProvider.getDefault();
        }
        return null;
    }

    /**
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapterList()
     */
    public Class[] getAdapterList() {
        // TODO Auto-generated method stub
        return AGF_PROVIDERS;
    }

}
