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

import org.eclipse.amp.axf.core.IModel;
import org.eclipse.ui.IViewPart;

public class ModelManagerListeners {

    List<IModelWorkbenchListener> manangerListeners = new ArrayList<IModelWorkbenchListener>();
    /**
     * @param modelViewManager
     */
    ModelManagerListeners() {
    }

    /**
     * Adds the model manager listener.
     * 
     * @param listener the listener
     */
    public synchronized void addModelManagerListener(IModelWorkbenchListener listener) {
        manangerListeners.add(listener);
    }

    /**
     * Removes the model manager listener.
     * 
     * @param listener the listener
     */
    public synchronized void removeModelManagerListener(IModelWorkbenchListener listener) {
        manangerListeners.remove(listener);
    }

    /**
     * Notify view added.
     * 
     * @param showViewPart the show view part
     */
    protected synchronized void notifyViewAdded(final IViewPart showViewPart) {
        for (IModelWorkbenchListener viewListener : manangerListeners) {
            viewListener.viewAdded(showViewPart);
        }
    };

    /**
     * Notify view removed.
     * 
     * @param showViewPart the show view part
     */
    protected synchronized void notifyViewRemoved(final IViewPart showViewPart) {
        for (IModelWorkbenchListener viewListener : manangerListeners) {
            viewListener.viewRemoved(showViewPart);
        }
    };

    /**
     * Notify view removed.
     * 
     * @param showViewPart the show view part
     */
    protected synchronized void notifyModelActivated(final IModel model) {
        for (IModelWorkbenchListener viewListener : manangerListeners) {
            viewListener.modelActivated(model);
        }
    };

    /**
     * Notify view removed.
     * 
     * @param showViewPart the show view part
     */
    protected synchronized void notifyModelAdded(final IModel model) {
        for (IModelWorkbenchListener viewListener : manangerListeners) {
            viewListener.modelAdded(model);
        }
    };

    /**
     * Notify view removed.
     * 
     * @param showViewPart the show view part
     */
    protected synchronized void notifyModelRemoved(final IModel model) {
        for (IModelWorkbenchListener viewListener : manangerListeners) {
            viewListener.modelRemoved(model);
        }
    };
}