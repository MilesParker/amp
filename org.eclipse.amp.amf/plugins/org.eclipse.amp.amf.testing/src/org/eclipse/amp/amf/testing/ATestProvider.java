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

package org.eclipse.amp.amf.testing;

import java.util.HashMap;

import org.eclipse.amp.amf.abase.IInterpreterFactory;
import org.eclipse.amp.amf.abase.IInterpreterProvider;
import org.eclipse.amp.amf.abase.InterpreterPool;
import org.eclipse.amp.amf.abase.InterpreterProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

/**
 * 
 * @author mparker
 *
 */
public class ATestProvider implements IInterpreterFactory {

    /**
     * @param uri
     * @return
     * @see org.eclipse.amp.amf.abase.xtext.IInterpreterProvider#getInterpreter(org.eclipse.emf.common.util.URI)
     */
    public Object createInterpreter(Resource resource) {
        ((ResourceImpl) resource).setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
        ATestInterpreter interpreter = new ATestInterpreter();
        interpreter.load(resource);
        return interpreter;
    }

    public static IInterpreterProvider createPooled(ResourceSet resources) {
        return new InterpreterPool(new ATestProvider(), resources);
    }

    public static IInterpreterProvider create(ResourceSet resources) {
        return new InterpreterProvider(new ATestProvider(), resources);
    }
}
