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
import org.eclipse.amp.agf3d.IShape3DProvider;
import org.eclipse.amp.agf3d.Shapes3D;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.gef.EditPartFactory;

import org.ascape.model.Agent;
import org.ascape.model.CellOccupant;
import org.ascape.model.HostCell;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating ScapeAdapter objects.
 */
public class Ascape3DAdapterFactory implements IAdapterFactory {
    private static final Class[] TYPES = { I3DModelFactoryProvider.class, IShape3DProvider.class };

    Ascape3DPartFactory factory = new Ascape3DPartFactory();

    I3DModelFactoryProvider factoryProvider = new I3DModelFactoryProvider() {

        public EditPartFactory getEditPart3DFactory(Object model) {
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
            return factoryProvider;
        } else if (adapterType == IShape3DProvider.class) {
            if (adaptableObject instanceof HostCell) {
                return Shapes3D.TILE_SHAPE_PROVIDER;
            } else if (adaptableObject instanceof CellOccupant) {
                return Shapes3D.DISC_SHAPE_PROVIDER;
            } else if (adaptableObject instanceof Agent) {
                return Shapes3D.CUBE_SHAPE_PROVIDER;
            }
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
