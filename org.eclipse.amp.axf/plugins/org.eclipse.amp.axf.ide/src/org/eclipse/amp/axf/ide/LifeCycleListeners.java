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

package org.eclipse.amp.axf.ide;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.amp.axf.core.ILifeCycleListener;
import org.eclipse.amp.axf.core.IModel;

/**
 * 
 * @author mparker
 *
 */
public class LifeCycleListeners {

    List<ILifeCycleListener> workbenchListeners = new ArrayList<ILifeCycleListener>();

    public void replaceModel(IModel oldModel, IModel newModel) {
        if (oldModel != null) {
            for (final ILifeCycleListener listener : workbenchListeners) {
                oldModel.removeModelListener(listener);
            }
        }
        if (newModel != null) {
            for (final ILifeCycleListener listener : workbenchListeners) {
                newModel.addModelListener(listener);
                // listener.modelAdded(newModel);
            }
        }
    }

    /**
     * Adds the workbench listener.
     * 
     * @param listener the listener
     */
    public synchronized void addListener(ILifeCycleListener listener) {
        workbenchListeners.add(listener);
    }

    /**
     * Removes the workbench listener.
     * 
     * @param listener the listener
     */
    public synchronized void removeListener(ILifeCycleListener listener) {
        workbenchListeners.remove(listener);
    }
}
