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

package org.eclipse.amp.escape.ascape.adapt;

import org.eclipse.amp.agf.IGraphicsAdapted;
import org.eclipse.amp.agf.IGraphicsAdapter;
import org.eclipse.amp.agf.IGraphicsAdapterFactory;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.Platform;

/**
 * 
 * @author mparker
 * 
 */
public class AscapeGraphicsAdapterFactory implements IGraphicsAdapterFactory {

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
        if (adapterType == IGraphicsAdapter.class) {
            IGraphicsAdapter graphicsAdapter = null;
            if (adaptableObject instanceof IGraphicsAdapted) {
                graphicsAdapter = ((IGraphicsAdapted) adaptableObject).getGraphicsAdapter();
            } else if (adaptableObject instanceof IAdaptable) {
                graphicsAdapter = (IGraphicsAdapter) ((IAdaptable) adaptableObject).getAdapter(IGraphicsAdapter.class);
            }
            if (graphicsAdapter == null) {
                return AscapeGraphicsAdapter.getDefault();
            }
            return graphicsAdapter;
        }
        return null;
    }

    /**
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapterList()
     */
    public Class[] getAdapterList() {
        return new Class[] { IGraphicsAdapter.class };
    }
}
