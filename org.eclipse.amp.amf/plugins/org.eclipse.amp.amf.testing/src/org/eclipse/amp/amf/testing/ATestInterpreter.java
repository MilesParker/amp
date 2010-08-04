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
import org.eclipse.amp.amf.parameters.AParInterpreter;
import org.eclipse.amp.amf.testing.aTest.Model;
import org.eclipse.amp.amf.testing.aTest.TestMember;
import org.eclipse.amp.amf.testing.aTest.Tests;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

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
        //    aParCache = AParFactory.createPooled(resource.getResourceSet());

        this.resource = resource;

        atestModel = (Model) resource.getContents().get(0);

    }

    public Model getModel() {
        return atestModel;
    }

    public AParInterpreter getAparInterpreter() {
        return aparInterpreter;
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

    public static String convertURI(TestMember importModel) {
        return AParInterpreter.convertURI(importModel, importModel.getImportURI());
    }

    public static String convertURI(Tests tests) {
        return AParInterpreter.convertURI(tests, tests.getImportURI());
    }

    public static URI getParameterURI(Resource resource) {
        URI aparURI = null;
        Model model = (Model) resource.getContents().get(0);
        if (model.getTests() != null) {
            String convertURI = ATestInterpreter.convertURI(model.getTests());
            aparURI = URI.createURI(convertURI);
        } else {
            aparURI = resource.getURI().trimFileExtension().appendFileExtension("apar");
        }
        return aparURI;
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
