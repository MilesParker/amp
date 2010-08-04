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
     * Gets the composition members for this level of the composition in iterable form. Note that as iterables allow
     * just-in-time usage of the underlying objects and do not require size or index positions to be known, composition
     * consumers should generally use this form for best performance whenever practical. (In the worst case, where only
     * an iterable is known, a call to getList() may require providers to first build a list.) On the other hand,
     * providers should simply provide the most efficient usage which in many cases will simply mean returning getList
     * for this method.
     * 
     * @param hasIterable the parent object for this level of composition
     * @see #getList()
     * 
     * @return the iteratable
     */
    public Iterable getIteratable(Object hasIterable);

    /**
     * Gets the composition members for this level of the composition as a list. Consumers should generally use
     * getIterable(), see above.
     * 
     * @param hasIterable the parent object for this level of composition
     * @see #getIterable()
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
     * Indicates whether this object is a composition, i.e. contains other members. If not, it will be assumed to be a
     * model leaf.
     * 
     * @param parent the object to test for composition.
     * 
     * @return true if <i>any</i> children of the parent object's level are themselves compositions.
     */
    public boolean isComposition(Object member);

    /**
     * Indicates whether children of the provided object are themselves capable of providing composition members. If
     * not, we can assume that they represent the leaves of the composition structure.
     * 
     * @param parent the object for which we are testing children members.
     * 
     * @return true if <i>any</i> children of the parent object's level are themselves compositions.
     */
    public boolean isChildrenComposition(Object member);

    /**
     * Provides the most specific class that the composition is guaranteed to contain. For cases where no common base
     * class exists, should simply return Object.class.
     * 
     * @param member
     * @return
     */
    public Class getChildrenClass(Object member);

    /**
     * Returns an exemplar object that characterizes the members of the composition. This is useful for constraining the
     * composition beyond type to state. For example, a prototype may help consumers specialize on the case for
     * Foo.class where foo.bar > 10. Consumers should handle the case where prototype object is null, falling back to
     * specializing on child class.
     * 
     * @param member
     * @return the prototype object. May be null.
     */
    public Object getChildrenPrototype(Object member);

    /**
     * Gets the list.
     * 
     * @param hasIterable the has iterable
     * 
     * @return the list
     */
    public Object getParent(Object member);

}
