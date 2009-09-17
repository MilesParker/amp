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

import org.eclipse.amp.amf.abase.ICached;
import org.eclipse.amp.amf.abase.IInterpreterProvider;
import org.eclipse.amp.amf.abase.aBase.IntValue;
import org.eclipse.amp.amf.abase.aBase.RealValue;
import org.eclipse.amp.amf.parameters.AParFactory;
import org.eclipse.amp.amf.parameters.AParInterpreter;
import org.eclipse.amp.amf.testing.aTest.Constraint;
import org.eclipse.amp.amf.testing.aTest.Model;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.statushandlers.StatusManager;

/**
 * 
 * @author mparker
 * 
 */
public class ATestInterpreter implements ICached {

    Model atestModel;

    AParInterpreter aparInterpreter;

    // private XMLParserPool parserPool = new XMLParserPoolImpl();
    //
    // private Map nameToFeatureMap = new HashMap();

    private IInterpreterProvider aParCache;

    private Resource resource;

    public void load(Resource resource) {
        aParCache = AParFactory.createPooled(resource.getResourceSet());

        this.resource = resource;

        atestModel = (Model) resource.getContents().get(0);

        URI aparLoc = resource.getURI().trimFileExtension().appendFileExtension("apar");
        Resource aparAnalog = resource.getResourceSet().getResource(aparLoc, true);
        if (aparAnalog == null) {
            StatusManager.getManager().handle(
                                              new Status(Status.WARNING, "org.eclipse.amp.amf.parameters",
                                              "Couldn't locate apar resource."));
        } else {
            aparInterpreter = (AParInterpreter) aParCache.getInterpreter(aparLoc);
        }
    }

    public Model getModel() {
        return atestModel;
    }

    public AParInterpreter getAparInterpreter() {
        return aparInterpreter;
    }

    public String getConstraintString() {
        String constraintString = "";
        for (Constraint constraint : atestModel.getContraints()) {
            constraintString += constraint.getAttribute().getID() + "\t" + doubleValue(constraint.getMinValue()) + "\t"
            + doubleValue(constraint.getMinValue()) + "\r";
        }
        return constraintString;
    }

    public static double doubleValue(EObject constraintValue) {
        if (constraintValue instanceof IntValue) {
            return Integer.valueOf(((IntValue) constraintValue).getValue());
        } else if (constraintValue instanceof RealValue) {
            return Double.valueOf(((RealValue) constraintValue).getValue());
        } else if (constraintValue == null) {
            return Double.NaN;
        }
        throw new RuntimeException("Unexpected value for constraint.");
    }

    public static String stringValue(EObject constraintValue) {
        if (constraintValue instanceof IntValue) {
            return ((IntValue) constraintValue).getValue();
        } else if (constraintValue instanceof RealValue) {
            return ((RealValue) constraintValue).getValue();
        } else if (constraintValue == null) {
            return "N/A";
        }
        throw new RuntimeException("Unexpected value for constraint.");
    }

    /**
     * @return the resource
     */
    public Resource getResource() {
        return resource;
    }

    /**
     * @param cache
     * @see org.eclipse.amp.amf.abase.xtext.ICached#setCache(org.eclipse.amp.amf.abase.xtext.IInterpreterProvider)
     */
    public void setCache(IInterpreterProvider cache) {
        this.aParCache = cache;
    }

    // /**
    // * @param nameToFeatureMap the nameToFeatureMap to set
    // */
    // public void setNameToFeatureMap(Map nameToFeatureMap) {
    // this.nameToFeatureMap = nameToFeatureMap;
    // }
    //
    // /**
    // * @param parserPool the parserPool to set
    // */
    // public void setParserPool(XMLParserPool parserPool) {
    // this.parserPool = parserPool;
    // }

    /*
     * public static String stringValue(EObject constraintValue) { if (constraintValue instanceof IntValue) { return
     * Integer.toString(((IntValue) constraintValue).getValue()); } else if (constraintValue instanceof RealValue) {
     * return ((RealValue) constraintValue).getValue(); } else if (constraintValue == null) { return "UNDEFINED"; }
     * throw new RuntimeException("Unexpected value for constraint."); }
     */
}
