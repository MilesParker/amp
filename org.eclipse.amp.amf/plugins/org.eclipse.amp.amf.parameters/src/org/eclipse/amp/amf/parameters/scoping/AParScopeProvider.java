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
import org.eclipse.amp.amf.parameters.aPar.Model;
import org.eclipse.amp.amf.parameters.aPar.Parameter;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.statushandlers.StatusManager;
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
        if (object instanceof Parameter) {
            if (reference.getEType() == MetaABMPackage.eINSTANCE.getSAttribute()) {
                // if (attrScope == null) {
                List<IEObjectDescription> allElems = new ArrayList<IEObjectDescription>();
                AParInterpreter.convertURI(object, NAMED_DELEGATE);
                ResourceSet resourceSet = getResourceSet(object);
                Parameter param = (Parameter) object;
                String convertURI = AParInterpreter.convertURI(((Model) param.eContainer()).getModel().get(0));
                URI modelURI = URI.createURI(convertURI);
                Resource found = resourceSet.getResource(modelURI, true);
                EList<Resource> resources = resourceSet.getResources();
                for (Resource resource : resources) {
                    if (resource.getURI().fileExtension().equals("metaabm")) {
                        EObject content = resource.getContents().get(0);
                        if (content instanceof SAttributed) {
                            findAttributes((SAttributed) content, allElems, "");
                        }
                    }
                }
                // IScope defaultScope = super.getScope(object, reference);
                IScope attrScope = new SimpleScope(allElems);
                return attrScope;
            }
        }
        return super.getScope(object, reference);
    }

    private ResourceSet getResourceSet(EObject context) {
        ResourceSet resourceSet = context.eResource().getResourceSet();
        Resource found = resourceSet.getResource(URI.createURI("http://metaabm.org/Engine.metaabm"), true);
        // if (context instanceof Model) {
        // Import importVal = ((Model) context).getModel().get(0);
        // resourceSet.getResource(URI.createURI(importVal.getImportURI()), true);
        // }
        // resourceSet.getResource(URI
        // .createURI("platform:/resource/org.eclipse.amp.amf.examples.escape/Epidemic.metaabm"), true);
        if (found == null) {
            StatusManager.getManager().handle(
                                              new Status(Status.WARNING, "org.eclipse.amp.amf.parameters",
                                              "Couldn't locate engine context."));
        }
        return resourceSet;
    }

    // private void addDumyAttr(String label) {
    // SAttribute dummyAttr = MetaABMFactory.eINSTANCE.createSAttribute();
    // dummyAttr.setLabel(label);
    // String id = StringUtils.replace(label, " ", "");
    // id = StringUtils.uncapitalize(id);
    // dummyAttr.setID(id);
    // addElem(dummyAttr, "");
    // }

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
