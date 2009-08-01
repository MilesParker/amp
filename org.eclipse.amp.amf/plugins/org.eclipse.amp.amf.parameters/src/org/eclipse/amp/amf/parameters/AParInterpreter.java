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

package org.eclipse.amp.amf.parameters;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.amp.amf.parameters.aPar.BooleanValue;
import org.eclipse.amp.amf.parameters.aPar.Import;
import org.eclipse.amp.amf.parameters.aPar.Incorporates;
import org.eclipse.amp.amf.parameters.aPar.IntValue;
import org.eclipse.amp.amf.parameters.aPar.Model;
import org.eclipse.amp.amf.parameters.aPar.Parameter;
import org.eclipse.amp.amf.parameters.aPar.RealValue;
import org.eclipse.amp.amf.parameters.aPar.StringValue;
import org.eclipse.amp.amf.parameters.scoping.AParImportResolver;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.metaabm.SContext;

/**
 * 
 * @author mparker
 * 
 */
public class AParInterpreter {

    private String modelClass;
    private String runName;
    private String[] args;
    private List<Parameter> parameters;
    private SContext model;
    private IPath rootPath;
    private IPath filePath;

    public AParInterpreter(IResource modelResource) {
        IProject project = modelResource.getProject();
        ResourceSet resources = new ResourceSetImpl();
        filePath = ((IFile) modelResource).getFullPath();
        URI aparLoc = URI.createPlatformResourceURI(filePath.toString(), true);
        Resource apar = resources.getResource(aparLoc, true);
        Model aparModel = (Model) apar.getContents().get(0);
        Import importModel = aparModel.getModel().get(0);
        URI platformURI = URI.createURI(AParImportResolver.convertURI(importModel));
        Resource amfModel = resources.getResource(platformURI, true);
        model = (SContext) amfModel.getContents().get(0);

        modelClass = model.getImplementation().getQualifiedName();
        runName = model.getLabel() + "_" + modelResource.getName();
        parameters = collect(aparModel, new HashSet<String>());

        args = new String[parameters.size()];
        int i = 0;
        rootPath = project.getLocation();

        for (Parameter parameter : parameters) {
            String value = value(parameter);
            value = StringUtils.replace(value, "|", rootPath.addTrailingSeparator().toOSString());
            if (parameter.getAttribute().getLabel() != null) {
                args[i] = parameter.getAttribute().getLabel().replaceAll(" ", "") + "=" + value;
            } else {
                // todo we need to report this condition..
                args[i] = "";
            }
            i++;
        }
    }

    public static String value(Parameter param) {
        if (param.getValue() instanceof StringValue) {
            return ((StringValue) param.getValue()).getValue();
        } else if (param.getValue() instanceof IntValue) {
            return Integer.toString(((IntValue) param.getValue()).getValue());
        } else if (param.getValue() instanceof RealValue) {
            return ((RealValue) param.getValue()).getValue();
        } else if (param.getValue() instanceof BooleanValue) {
            return ((BooleanValue) param.getValue()).getValue().getLiteral();
        }
        throw new RuntimeException("Bad value assigned for: " + param.getAttribute() + ": " + param.getValue());
    }

    List<Parameter> collect(Model apar, Set<String> overridden) {
        List<Parameter> includeIncorporated = new ArrayList<Parameter>();
        for (Parameter parameter : apar.getParameters()) {
            if (!overridden.contains(parameter.getAttribute().getLabel())) {
                includeIncorporated.add(parameter);
                overridden.add(parameter.getAttribute().getLabel());
            }
        }
        Incorporates[] reverseIncorporates = (Incorporates[]) apar.getIncorporates().toArray();
        CollectionUtils.reverseArray(reverseIncorporates);
        for (Incorporates incorporates : reverseIncorporates) {
            ResourceSet resources = new ResourceSetImpl();
            Resource incFile = resources.getResource(URI.createURI(AParImportResolver.convertURI(incorporates)), true);
            Model incModel = (Model) incFile.getContents().get(0);
            includeIncorporated.addAll(collect(incModel, overridden));
        }
        return includeIncorporated;
    }

    /**
     * @return
     */
    public SContext getTargetModel() {
        return model;
    }

    public IPath getFilePath() {
        return filePath;
    }

    /**
     * @return
     */
    public String getRunName() {
        return runName;
    }

    public String getModelClass() {
        return modelClass;
    }

    public String[] getArgs() {
        return args;
    }

    public String getArgsString() {
        String argString = "";
        for (Parameter param : parameters) {
            argString += param.getAttribute().getID() + "\t" + valueOf(param.getValue()) + "\r";
        }
        return argString.substring(0, argString.length() - 1);
    }

    public List<Parameter> getParameters() {
        return parameters;
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
