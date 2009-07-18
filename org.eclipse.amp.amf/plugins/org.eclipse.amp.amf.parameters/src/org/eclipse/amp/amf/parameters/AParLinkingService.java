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

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.linking.impl.DefaultLinkingService;
import org.eclipse.xtext.linking.impl.IllegalNodeException;
import org.eclipse.xtext.parsetree.AbstractNode;

/**
 * 
 * @author mparker
 *
 */
public class AParLinkingService extends DefaultLinkingService {

    /**
     * @param context
     * @param refer
     * @param node
     * @return
     * @throws IllegalNodeException
     * @see org.eclipse.xtext.linking.impl.DefaultLinkingService#getLinkedObjects(org.eclipse.emf.ecore.EObject,
     *      org.eclipse.emf.ecore.EReference, org.eclipse.xtext.parsetree.AbstractNode)
     */
    public List<EObject> getLinkedObjects(EObject context, EReference reference, AbstractNode node)
    throws IllegalNodeException {

        // ResourceSet resourceSet = context.eResource().getResourceSet();
        //        Resource core = resourceSet.getResource(URI.createURI("http://metaabm.org/core_library.metaabm"), true);
        // EList<Resource> resources = resourceSet.getResources();
        // List<EObject> allElems = new ArrayList<EObject>();
        // if (reference.getEType() == MetaABMPackage.eINSTANCE.getSAttribute()) {
        // for (Resource resource : resources) {
        // EObject content = resource.getContents().get(0);
        // if (content instanceof SAttributed) {
        // for (SAttribute attr : ((SAttributed) content).getAttributes()) {
        // allElems.add(attr);
        // }
        // }
        // }
        // System.err.println(allElems);
        // return allElems;
        // }
        return super.getLinkedObjects(context, reference, node);
    }

    /**
     * @param object
     * @param reference
     * @param context
     * @return
     * @see org.eclipse.xtext.linking.impl.DefaultLinkingService#getLinkText(org.eclipse.emf.ecore.EObject,
     *      org.eclipse.emf.ecore.EReference, org.eclipse.emf.ecore.EObject)
     */
    public String getLinkText(EObject object, EReference reference, EObject context) {
        return super.getLinkText(object, reference, context);
    }
}
