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

import org.eclipse.amp.agf3d.I3DModelFactoryProvider;
import org.eclipse.amp.escape.ascape.wrap.ScapeWrapperModel;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.gef.EditPartFactory;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating ScapeAdapter objects.
 */
public class Ascape3DAdapterFactory implements IAdapterFactory {
    private static final Class[] TYPES = { I3DModelFactoryProvider.class };

    Ascape3DPartFactory factory = new Ascape3DPartFactory();
    I3DModelFactoryProvider factoryProvider = new I3DModelFactoryProvider() {

        public EditPartFactory getEditPart3DFactory() {
            return factory;
        }
    };

    /**
     * @param adaptableObject
     * @param adapterType
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object, java.lang.Class)
     */
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        if (adapterType == I3DModelFactoryProvider.class) {
            if (adaptableObject instanceof ScapeWrapperModel
                    && ((ScapeWrapperModel) adaptableObject).getScape() instanceof I3DModelFactoryProvider) {
                return ((ScapeWrapperModel) adaptableObject).getScape();
            }
            return factoryProvider;
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
