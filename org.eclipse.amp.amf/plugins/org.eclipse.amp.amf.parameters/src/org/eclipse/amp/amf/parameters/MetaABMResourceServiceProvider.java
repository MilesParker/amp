/**
 * <copyright>
 *
 * Copyright (c) 2010 Metascape, LLC.
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

import org.eclipse.amp.amf.parameters.aPar.Model;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.SimpleNameProvider;
import org.eclipse.xtext.resource.IContainer.Manager;
import org.eclipse.xtext.resource.IResourceServiceProvider;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionManager;
import org.eclipse.xtext.validation.IResourceValidator;

import org.metaabm.IID;

/**
 * 
 * @author mparker
 *
 */
public class MetaABMResourceServiceProvider implements IResourceServiceProvider {

    public Manager getContainerManager() {
        return null;
    }

    private DefaultResourceDescriptionManager metaabmResourceDescriptionManager = new DefaultResourceDescriptionManager();

    public org.eclipse.xtext.resource.IResourceDescription.Manager getResourceDescriptionManager() {
        metaabmResourceDescriptionManager = new DefaultResourceDescriptionManager();
        metaabmResourceDescriptionManager.setNameProvider(new SimpleNameProvider() {
            public String getQualifiedName(EObject obj) {
                if (obj instanceof IID) {
                    return ((IID) obj).getID();
                }
                else if (obj instanceof Model) {
                    return ((Model) obj).getModel().get(0).getImportURI();
                }
                return super.getQualifiedName(obj);
            }
        });
        return metaabmResourceDescriptionManager;
    }

    public IResourceValidator getResourceValidator() {
        return IResourceValidator.NULL;
    }

    public boolean canHandle(URI uri) {
        return "metaabm".equals(uri.fileExtension());
    }

}
