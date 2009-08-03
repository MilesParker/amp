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

import org.eclipse.amp.amf.parameters.AParInterpreter;
import org.eclipse.amp.amf.testing.aTest.Constraint;
import org.eclipse.amp.amf.testing.aTest.IntValue;
import org.eclipse.amp.amf.testing.aTest.Model;
import org.eclipse.amp.amf.testing.aTest.RealValue;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.ui.statushandlers.StatusManager;

/**
 * 
 * @author mparker
 * 
 */
public class ATestInterpreter {

    Model atestModel;

    AParInterpreter aparInterpreter;

    private IResource modelResource;

    public ATestInterpreter(IResource modelResource) {
        this.modelResource = modelResource;
        ResourceSet resources = new ResourceSetImpl();
        IPath filePath = ((IFile) modelResource).getFullPath();
        URI atestLoc = URI.createPlatformResourceURI(filePath.toString(), true);
        Resource atest = resources.getResource(atestLoc, true);
        atestModel = (Model) atest.getContents().get(0);

        URI aparLoc = atestLoc.trimFileExtension().appendFileExtension("apar");
        Resource aparAnalog = resources.getResource(aparLoc, true);
        if (aparAnalog == null) {
            StatusManager.getManager().handle(
                                              new Status(Status.WARNING, "org.eclipse.amp.amf.parameters",
                                              "Couldn't locate apar resource."));
        } else {
            IWorkspace workspace = ResourcesPlugin.getWorkspace();
            aparInterpreter = new AParInterpreter(workspace.getRoot()
                                                  .getFile(new Path(aparLoc.toPlatformString(true))));
        }
    }

    public Model getModel() {
        return atestModel;
    }

    public AParInterpreter getAparInterpreter() {
        return aparInterpreter;
    }

    public IResource getResource() {
        return modelResource;
    }

    public String getConstraintString() {
        String constraintString = "";
        for (Constraint constraint : atestModel.getContraints()) {
            constraintString += constraint.getAttribute().getID() + "\t"
            + valueOf(constraint.getMinValue()) + "\t"
            + valueOf(constraint.getMinValue()) + "\r";
        }
        return constraintString;
    }

    public double valueOf(EObject constraintValue) {
        if (constraintValue instanceof IntValue) {
            return ((IntValue) constraintValue).getValue();
        } else if (constraintValue instanceof RealValue) {
            return Double.valueOf(((RealValue) constraintValue).getValue());
        } else if (constraintValue == null) {
            return Double.NaN;
        }
        throw new RuntimeException("Unexpected value for constraint.");
    }
}
