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

package org.eclipse.amp.amf.parameters;

import org.eclipse.amp.amf.abase.IInterpreterFactory;
import org.eclipse.amp.amf.abase.IInterpreterProvider;
import org.eclipse.amp.amf.abase.InterpreterPool;
import org.eclipse.amp.amf.abase.InterpreterProvider;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

/**
 * 
 * @author mparker
 * 
 */
public class AParFactory implements IInterpreterFactory {

    /**
     * 
     * @param resource
     * @return
     * @see org.eclipse.amp.amf.abase.xtext.IInterpreterProvider#getInterpreter(org.eclipse.emf.ecore.resource.Resource)
     */
    public Object createInterpreter(Resource resource) {
        AParInterpreter interpreter = new AParInterpreter();
        return interpreter;
    }

    public static IInterpreterProvider createPooled(ResourceSet resources) {
        return new InterpreterPool(new AParFactory(), resources);
    }

    public static IInterpreterProvider create(ResourceSet resources) {
        return new InterpreterProvider(new AParFactory(), resources);
    }
}
