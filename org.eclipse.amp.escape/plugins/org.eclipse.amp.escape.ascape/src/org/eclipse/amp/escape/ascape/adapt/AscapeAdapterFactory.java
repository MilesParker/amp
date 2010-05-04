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

import org.eclipse.amp.agf.gef.ModelFactoryProvider;
import org.eclipse.amp.axf.core.ICompositionProvider;
import org.eclipse.amp.axf.space.IGraphProvider;
import org.eclipse.amp.axf.space.ILocationProvider;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating ScapeAdapter objects.
 */
public class AscapeAdapterFactory implements IAdapterFactory {
    private static final Class[] TYPES = { ILabelProvider.class, IPropertySource.class, IPropertySourceProvider.class,
        ModelFactoryProvider.class };

    /**
     * @param adaptableObject
     * @param adapterType
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object, java.lang.Class)
     */
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        if (adapterType == ILabelProvider.class || adapterType == ILocationProvider.class
                || adapterType == IGraphProvider.class || adapterType == ICompositionProvider.class
                || adapterType == IColorProvider.class) {
            return AscapeProvider.getDefault();
        }
        if (adapterType == IPropertySource.class) {
            return new BeanPropertySource(adaptableObject);
        }
        if (adapterType == IPropertySourceProvider.class) {
            return new AscapePropertySourceProvider(adaptableObject);
        }
        if (adapterType == ModelFactoryProvider.class) {
            return new AscapeModelFactoryProvider();
        }
        return null;
    }

    /**
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapterList()
     */
    public Class[] getAdapterList() {
        // TODO Auto-generated method stub
        return TYPES;
    }

}
