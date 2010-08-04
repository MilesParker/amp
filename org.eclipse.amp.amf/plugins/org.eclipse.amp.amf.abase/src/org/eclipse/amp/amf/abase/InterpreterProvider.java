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

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLParserPool;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;

/**
 * 
 * @author mparker
 *
 */
public class InterpreterProvider implements IInterpreterProvider {

    private IInterpreterFactory factory;

    private ResourceSet resourceSet;

    private XMLParserPool parserPool = new XMLParserPoolImpl();

    private Map nameToFeatureMap = new HashMap();

    public InterpreterProvider(IInterpreterFactory factory, ResourceSet resourceSet) {
        this.factory = factory;
        this.resourceSet = resourceSet;
    }

    public InterpreterProvider(IInterpreterFactory factory) {
        this.factory = factory;
    }

    /**
     * @param uri
     * @return
     * @see org.eclipse.amp.amf.abase.xtext.IInterpreterProvider#getInterpreter(org.eclipse.emf.common.util.URI)
     */
    public synchronized Object getInterpreter(URI uri) {
        if (resourceSet == null) {
            resourceSet = new ResourceSetImpl();

            resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
            resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
            resourceSet.getLoadOptions().put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.TRUE);
            resourceSet.getLoadOptions().put(XMLResource.OPTION_USE_PARSER_POOL, parserPool);
            resourceSet.getLoadOptions().put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, nameToFeatureMap);
            // ((ResourceImpl) aparResource).setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
        }
        Resource aparResource = resourceSet.getResource(uri, true);
        return getInterpreter(aparResource);
    }

    public synchronized Object getInterpreter(IResource aparFileResource) {
        IPath modelPath = ((IFile) aparFileResource).getFullPath();
        URI aparLoc = URI.createPlatformResourceURI(modelPath.toString(), true);
        return getInterpreter(aparLoc);
    }

    public synchronized Object getInterpreter(Resource resource) {
        ICached interpreter = (ICached) factory.createInterpreter(resource);
        interpreter.load(resource);
        return interpreter;
    }

    public IInterpreterFactory getFactory() {
        return factory;
    }
}
