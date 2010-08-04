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

package org.eclipse.amp.amf.abase;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * 
 * @author mparker
 *
 */
public class InterpreterPool extends InterpreterProvider {

    Map<Resource, Object> interpreterCache;

    public InterpreterPool(IInterpreterFactory factory, ResourceSet resourceSet) {
        super(factory, resourceSet);
        interpreterCache = new HashMap<Resource, Object>();
    }

    @Override
    public synchronized Object getInterpreter(Resource resource) {
        ICached interpreter = (ICached) interpreterCache.get(resource);
        if (interpreter == null) {
            interpreter = (ICached) getFactory().createInterpreter(resource);
            interpreter.setCache(this);
            interpreter.load(resource);
            interpreterCache.put(resource, interpreter);
        }
        return interpreter;
    }

    /**
     * @return the interpreterCache
     */
    public Map<Resource, Object> getInterpreterCache() {
        return interpreterCache;
    }
}
