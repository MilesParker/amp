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

import org.eclipse.amp.axf.core.IModel;
import org.eclipse.ui.IWorkbenchPart;

// TODO: Auto-generated Javadoc
/**
 * The listener interface for receiving IModelManager events. The class that is interested in processing a IModelManager
 * event implements this interface, and the object created with that class is registered with a component using the
 * component's <code>addIModelManagerListener<code> method. When
 * the IModelManager event occurs, that object's appropriate
 * method is invoked.
 * 
 * @see IModelManagerEvent
 */
public interface IModelWorkbenchListener {

    /**
     * Model added.
     * 
     * @param model the model
     */
    void modelAdded(IModel model);

    /**
     * Model removed.
     * 
     * @param model the model
     */
    void modelRemoved(IModel model);

    /**
     * Notifies the listener that the given model has been activated, that is in foreground and controllable. The model
     * is not necessarily focused, nor even visible. Models can be executing but not activated. Note that this assumes
     * that any already activated model is now deactivated, and it the listener's responsibility to keep a reference to
     * that prior model as appropriate.
     * 
     * Only one model may be active at any one time.
     * 
     * @param model The model that is currently activated, or null if no models are now active. This usually indicates
     *        that no models exist.
     */
    void modelActivated(IModel model);

    /**
     * View added.
     * 
     * @param part the part
     */
    void viewAdded(IWorkbenchPart part);

    /**
     * View removed.
     * 
     * @param part the part
     */
    void viewRemoved(IWorkbenchPart part);

    /**
     * View activated.
     * 
     * @param part the part
     */
    void viewActivated(IWorkbenchPart part);
}
