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
package org.eclipse.amp.axf.view;

import java.util.Collection;

import org.eclipse.amp.axf.core.ILifeCycleListener;
import org.eclipse.core.runtime.IAdaptable;

// TODO: Auto-generated Javadoc
/**
 * The Interface IModelPart.
 */
public interface IModelPart extends IAdaptable {
    
    /**
     * Creates the model listeners.
     */
    void createModelListeners();
    
    /**
     * Gets the model listeners.
     * 
     * @return the model listeners
     */
    Collection<ILifeCycleListener> getModelListeners();

    /**
     * Adds the model listener.
     * 
     * @param view the view
     */
    void addModelListener(ILifeCycleListener view);
    
    /**
     * Removes the model listener.
     * 
     * @param view the view
     */
    void removeModelListener(ILifeCycleListener view);
}
