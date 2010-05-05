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

import org.eclipse.amp.axf.core.ICompositionProvider;
import org.eclipse.amp.axf.space.IGraphProvider;
import org.eclipse.amp.axf.space.ILocationProvider;
import org.eclipse.core.runtime.IAdapterFactory;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating ScapeAdapter objects.
 */
public class AscapeModelAdapterFactory implements IAdapterFactory {

    public static final Class[] AGENT_PROVIDERS = { IGraphProvider.class,
        ICompositionProvider.class,
        ILocationProvider.class };

    /**
     * @param adaptableObject
     * @param adapterType
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object, java.lang.Class)
     */
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        if (Arrays.asList(AGENT_PROVIDERS).contains(adapterType)) {
            return AscapeModelProvider.getDefault();
        }
        return null;
    }

    /**
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapterList()
     */
    public Class[] getAdapterList() {
        // TODO Auto-generated method stub
        return AGENT_PROVIDERS;
    }

}
