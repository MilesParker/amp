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

import org.eclipse.amp.amf.parameters.AParInterpreter;
import org.eclipse.amp.amf.parameters.aPar.AgentParameters;
import org.eclipse.amp.amf.parameters.aPar.Model;
import org.eclipse.amp.amf.parameters.aPar.Parameter;
import org.eclipse.amp.amf.parameters.aPar.impl.ModelImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;

import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;
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
        if (object instanceof Parameter && reference.getEType() == MetaABMPackage.eINSTANCE.getSAttribute()) {
            getResourceSet(object);
            // if (attrScope == null) {
            if (engineAttributes == null) {
                engineAttributes = new ArrayList<IEObjectDescription>();
                ResourceSet resourceSet = object.eResource().getResourceSet();
                Resource found = resourceSet.getResource(URI.createURI("http://metaabm.org/Engine.metaabm"), true);
                findAttributes((SContext) found.getContents().get(0), engineAttributes, "");
            }
            List<IEObjectDescription> allElems = new ArrayList<IEObjectDescription>();
            Parameter parameter = (Parameter) object;
            AgentParameters params = (AgentParameters) parameter.eContainer();
            SAgent agent = getAgent(params);
            if (agent != null) {
                findAttributes(agent, allElems, "");
            }
            // IScope defaultScope = super.getScope(object, reference);
            allElems.addAll(engineAttributes);
            IScope attrScope = new SimpleScope(allElems);
            return attrScope;
        } else if (object instanceof AgentParameters && reference.getEType() == MetaABMPackage.eINSTANCE.getSAgent()) {
            getResourceSet(object);
            AgentParameters params = (AgentParameters) object;
            SAgent context = getAgent(params);
            List<IEObjectDescription> allElems = new ArrayList<IEObjectDescription>();
            allElems.add(EObjectDescription.create(context.getLabel(), context));
            IScope attrScope = new SimpleScope(allElems);
            return attrScope;
        } else if (object instanceof ModelImpl) {
            getResourceSet(object);
        }

        return super.getScope(object, reference);
    }

    protected SAgent getAgent(AgentParameters params) {
        Model model = (Model) params.eContainer();
        String modelURI = AParInterpreter.convertURI(model.getModel());
        ResourceSet resourceSet = params.eResource().getResourceSet();
        Resource modelResource = resourceSet.getResource(URI.createURI(modelURI), true);
        SContext context = (SContext) modelResource.getContents().get(0);
        return context;
    }

    protected ResourceSet getResourceSet(EObject object) {
        ResourceSet resourceSet = object.eResource().getResourceSet();
        resourceSet.getResource(URI.createURI("http://metaabm.org/Engine.metaabm"), true);
        Model model = (Model) object.eResource().getContents().get(0);
        String convertURI = AParInterpreter.convertURI(model.getModel());
        URI aparURI = URI.createURI(convertURI, true);
        if (aparURI.isPlatform()) {
            if (URIConverter.INSTANCE.exists(aparURI, null)) {
                Resource resource = resourceSet.getResource(aparURI, true);
                resource.getContents().get(0);
            }
        }
        return resourceSet;
    }


    protected void findAttributes(SAttributed attributed, List<IEObjectDescription> allElems, String qualifier) {
        for (SAttribute attr : attributed.getAttributes()) {
            // don't want to allow parameter entries that can't be changed..which is also why we don't get
            // core attributes.
            if (!attr.isImmutable()) {
                addElem(attr, allElems, qualifier);
            }
        }
        if (attributed instanceof SContext) {
            for (SProjection proj : ((SContext) attributed).getProjections()) {
                findAttributes(proj, allElems, proj.getLabel() + " ");
            }
        }
    }

    private void addElem(SAttribute attr, List<IEObjectDescription> allElems, String qualifier) {
        allElems.add(EObjectDescription.create(qualifier + attr.getLabel(), attr));
    }
}
