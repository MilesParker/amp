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

package org.eclipse.amp.amf.testing.scoping;

import static org.eclipse.amp.amf.parameters.scoping.AParImportResolver.convertURI;

import org.eclipse.amp.amf.parameters.scoping.AParImportResolver;
import org.eclipse.amp.amf.testing.aTest.Tests;
import org.eclipse.emf.ecore.EObject;

/**
 * 
 * @author mparker
 * 
 */
public class ATestImportResolver extends AParImportResolver {
    /**
     * @param object
     * @return
     * @see org.eclipse.xtext.scoping.impl.ImportUriResolver#resolve(org.eclipse.emf.ecore.EObject)
     */
    public String resolve(EObject object) {
        if (object instanceof Tests) {
            Tests model = (Tests) object;
            model.setImportURI(convertURI(model));
        }
        return super.resolve(object);
    }

    public static String convertURI(Tests tests) {
        return convertURI(tests, tests.getImportURI());
    }

}
