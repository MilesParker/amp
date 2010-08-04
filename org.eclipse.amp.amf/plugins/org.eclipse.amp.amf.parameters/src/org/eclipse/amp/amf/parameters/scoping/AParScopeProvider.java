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

package org.eclipse.amp.amf.parameters.scoping;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.amp.amf.parameters.AParInterpreter;
import org.eclipse.amp.amf.parameters.aPar.Import;
import org.eclipse.amp.amf.parameters.aPar.Model;
import org.eclipse.amp.amf.parameters.aPar.Parameter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAttribute;
import org.metaabm.SAttributed;
import org.metaabm.SContext;
import org.metaabm.SProjection;

import com.google.inject.Singleton;

/**
 * 
 * @author mparker
 * 
 */
@Singleton
public class AParScopeProvider extends AbstractDeclarativeScopeProvider {

    List<IEObjectDescription> engineAttributes;

    ResourceSet resourceSet;

    SContext context;

    private List<IEObjectDescription> stringElems = new ArrayList<IEObjectDescription>();

    private List<IEObjectDescription> idElems = new ArrayList<IEObjectDescription>();

    /**
     * @param context
     * @param reference
     * @return
     * @see org.eclipse.xtext.scoping.impl.DefaultScopeProvider#getScope(org.eclipse.emf.ecore.EObject,
     *      org.eclipse.emf.ecore.EReference)
     */
    public IScope getScope(EObject object, EReference reference) {
        // todo optimization -- for obscure reasons we need to get the references loaded this way but it doesn't have to
        // happen every time.
        // if (object instanceof Model) {
        // // resourceSet = getResourceSet(object);
        // getResourceSet(object);
        // super.getScope(object, reference);
        // }
        if (object instanceof Import) {
            getAttributes((Import) object);
        } else if (object instanceof Parameter) {
            getAttributes(((Model) ((Parameter) object).eContainer()).getModel());
        }
        if (reference.getEType() == MetaABMPackage.eINSTANCE.getSAttribute()) {
            return new SimpleScope(idElems);
        }

        return super.getScope(object, reference);
    }

    protected void getAttributes(Import importModel) {
        String modelURIName = AParInterpreter.convertURI(importModel);
        URI modelURI = URI.createURI(modelURIName, true);
        if (modelURI.isPlatform()) {
            resourceSet = importModel.eContainer().eResource().getResourceSet();
            Resource resource = null;
            try {
                resource = resourceSet.getResource(modelURI, true);
            } catch (Exception e) {
                resource = resourceSet.getResource(modelURI, false);
            }
            if (resource != null && !resource.getContents().isEmpty()) {
                SContext newContext = (SContext) resource.getContents().get(0);
                if (newContext != context) {
                    // stringElems = new ArrayList<IEObjectDescription>();
                    idElems = new ArrayList<IEObjectDescription>();
                    Resource engineResource = resourceSet.getResource(URI
                                                                      .createURI("http://metaabm.org/Engine.metaabm"), true);
                    SContext engine = (SContext) engineResource.getContents().get(0);
                    findAttributes(engine);
                    context = newContext;
                    findAttributes(context);
                }
            }
        }
    }

    protected void findAttributes(SAttributed attributed) {
        for (SAttribute attr : attributed.getAttributes()) {
            // don't want to allow parameter entries that can't be changed..which is also why we don't get
            // core attributes.
            if (!attr.isImmutable()) {
                addElem(attributed, attr);
            }
        }
        if (attributed instanceof SContext) {
            for (SProjection proj : ((SContext) attributed).getProjections()) {
                findAttributes(proj);
            }
        }
    }

    private void addElem(SAttributed parent, SAttribute attr) {
        // String label = attr.getLabel();
        String id = StringUtils.capitalize(attr.getID());
        if (parent instanceof SProjection) {
            // label = parent.getLabel() + " " + label;
            id = StringUtils.capitalize(parent.getID()) + id;
        }
        // stringElems.add(EObjectDescription.create(label, attr));
        idElems.add(EObjectDescription.create(id, attr));
    }
}
