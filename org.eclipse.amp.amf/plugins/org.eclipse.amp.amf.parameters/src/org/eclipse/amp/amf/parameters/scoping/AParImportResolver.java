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

import org.eclipse.amp.amf.parameters.AParInterpreter;
import org.eclipse.amp.amf.parameters.aPar.Import;
import org.eclipse.amp.amf.parameters.aPar.Incorporates;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.impl.ImportUriResolver;

import com.google.inject.Singleton;

/**
 * 
 * @author mparker
 * 
 */
@Singleton
public class AParImportResolver extends ImportUriResolver {
    /**
     * @param object
     * @return
     * @see org.eclipse.xtext.scoping.impl.ImportUriResolver#resolve(org.eclipse.emf.ecore.EObject)
     */
    public String resolve(EObject object) {
        if (object instanceof Import) {
            Import model = (Import) object;
            model.setImportURI(AParInterpreter.convertURI(model));
        }
        if (object instanceof Incorporates) {
            Incorporates model = (Incorporates) object;
            model.setImportURI(AParInterpreter.convertURI(model));
        }
        return super.resolve(object);
    }
}
