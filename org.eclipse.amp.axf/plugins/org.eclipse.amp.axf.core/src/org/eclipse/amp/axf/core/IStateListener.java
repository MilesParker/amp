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

// TODO: Auto-generated Javadoc
/**
 * The listener interface for receiving IState events. The class that is interested in processing a IState event
 * implements this interface, and the object created with that class is registered with a component using the
 * component's <code>addIStateListener<code> method. When
 * the IState event occurs, that object's appropriate
 * method is invoked.
 * 
 * @see IStateEvent
 */
public interface IStateListener {

    /**
     * Notifies that the model has had some kind of state or observation status change.
     * 
     * @param key the key
     * @param updated the updated
     */
    public void stateChange(Object key, Object updated);
}
