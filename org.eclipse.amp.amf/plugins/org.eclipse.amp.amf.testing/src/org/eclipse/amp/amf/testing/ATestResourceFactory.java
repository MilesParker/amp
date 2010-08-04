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

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceFactory;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * 
 * @author mparker
 *
 */
public class ATestResourceFactory extends XtextResourceFactory {

    /**
     * @param resourceProvider
     */
    @Inject
    public ATestResourceFactory(Provider<XtextResource> resourceProvider) {
        super(resourceProvider);
        XtextResource xtextResource = resourceProvider.get();
        URI testFileURI = xtextResource.getURI();
        testFileURI.trimFileExtension().appendFileExtension("apar");
        resourceProvider.get().getResourceSet().getResource(testFileURI, true);
    }

    /**
     * @param uri
     * @return
     * @see org.eclipse.xtext.resource.XtextResourceFactory#createResource(org.eclipse.emf.common.util.URI)
     */
    public Resource createResource(URI uri) {
        return super.createResource(uri);
    }
}
