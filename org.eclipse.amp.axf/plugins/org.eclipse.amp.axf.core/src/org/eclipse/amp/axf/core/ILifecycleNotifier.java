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

package org.eclipse.amp.axf.core;

import java.util.Collection;

/**
 * 
 * @author mparker
 *
 */
public interface ILifecycleNotifier {

    /**
     * Adds the model listener.
     * 
     * @param listener the listener
     */
    public abstract void addModelListener(ILifeCycleListener listener);

    /**
     * Gets the model listeners.
     * 
     * @return the model listeners
     */
    public abstract Collection<ILifeCycleListener> getModelListeners();

    /**
     * Removes the model listener.
     * 
     * @param view the view
     */
    public abstract void removeModelListener(ILifeCycleListener view);

}
