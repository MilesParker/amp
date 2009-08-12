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

import org.eclipse.amp.amf.parameters.aPar.Import;
import org.eclipse.amp.amf.parameters.aPar.Incorporates;
import org.eclipse.emf.common.util.URI;
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
            model.setImportURI(convertURI(model));
        }
        if (object instanceof Incorporates) {
            Incorporates model = (Incorporates) object;
            model.setImportURI(convertURI(model));
        }
        return super.resolve(object);
    }

    // poor man's interfaces!
    public static String convertURI(Import importModel) {
        return convertURI(importModel, importModel.getImportURI());
    }

    public static String convertURI(Incorporates incorporateModel) {
        return convertURI(incorporateModel, incorporateModel.getImportURI());
    }

    public static String convertURI(EObject projectObject, String uri) {
        URI fileURI = projectObject.eResource().getURI();
        if (uri.startsWith("|")) {
            // Project relative
            String platformString = "platform:/" + fileURI.segment(0) + "/" + fileURI.segment(1);
            return platformString + "/" + uri.substring(1);
        } else if (!uri.startsWith("/") && !uri.startsWith("platform")) {
            // this is really ugly..
            fileURI = fileURI.trimSegments(1).resolve(fileURI);
            String platformString = fileURI + "/" + uri;
            return platformString;
        }
        //        } else if (!uri.startsWith("platform")) {
        //            // file relative
        //            String projectURI = fileURI.trimSegments(fileURI.segmentCount() - 2).toPlatformString(true);
        //            fileURI.
        //            System.err.println("file " + fileURI);
        //            System.err.println("folder " + folderURI);
        //            System.err.println("uri " + uri);
        //            System.err.println("res " + folderURI + "/" + uri);
        //            return folderURI + "/" + uri;
        //        }
        return uri;
    }
}
