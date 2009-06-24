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

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Interface IMemberProvider.
 */
public interface ICompositionProvider {

    /**
     * Gets the iteratable.
     * 
     * @param hasIterable the has iterable
     * 
     * @return the iteratable
     */
    public Iterable getIteratable(Object hasIterable);

    /**
     * Gets the list.
     * 
     * @param hasIterable the has iterable
     * 
     * @return the list
     */
    public List getList(Object hasIterable);

    /**
     * Checks if is mutable.
     * 
     * @param hasIterable the has iterable
     * 
     * @return true, if is mutable
     */
    public boolean isMutable(Object hasIterable);

    /**
     * Gets the list.
     * 
     * @param hasIterable the has iterable
     * 
     * @return the list
     */
    public boolean isChildrenComposition(Object member);

    /**
     * Gets the list.
     * 
     * @param hasIterable the has iterable
     * 
     * @return the list
     */
    public Object getParent(Object member);

}
