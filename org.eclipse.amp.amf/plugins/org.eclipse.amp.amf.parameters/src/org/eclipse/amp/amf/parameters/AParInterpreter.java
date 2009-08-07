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
import org.eclipse.amp.amf.parameters.aPar.Incorporates;
import org.eclipse.amp.amf.parameters.aPar.IntValue;
import org.eclipse.amp.amf.parameters.aPar.Model;
import org.eclipse.amp.amf.parameters.aPar.Parameter;
import org.eclipse.amp.amf.parameters.aPar.RealValue;
import org.eclipse.amp.amf.parameters.aPar.StringValue;
import org.eclipse.amp.amf.parameters.scoping.AParImportResolver;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
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

    Resource aparResource;
    private String modelClass;
    private String runName;
    private String[] args;
    private SContext model;
    private IPath filePath;
    private Model aparModel;
    private List<Parameter> parameters;

    public AParInterpreter(IResource modelResource) {
        ResourceSet resources = new ResourceSetImpl();
        filePath = ((IFile) modelResource).getFullPath();
        URI aparLoc = URI.createPlatformResourceURI(filePath.toString(), true);
        Resource apar = resources.getResource(aparLoc, true);
        initialize(apar);
    }

    public AParInterpreter(Resource apar) {
        initialize(apar);
    }

    /**
     * @param apar
     */
    private void initialize(Resource apar) {
        aparModel = (Model) apar.getContents().get(0);
        String convertURI = AParImportResolver.convertURI(aparModel.getModel().get(0));
        URI modelURI = URI.createURI(convertURI);
        Resource amfResource = apar.getResourceSet().getResource(modelURI, true);
        model = (SContext) amfResource.getContents().get(0);

        modelClass = model.getImplementation().getQualifiedName();
        runName = model.getLabel() + "_" + apar.getURI().trimFileExtension().lastSegment();
        parameters = collect(new HashSet<String>());

        String rootPath = amfResource.getURI().toPlatformString(true);
        String projectPath = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(rootPath)).getProject()
        .getLocation().toOSString();

        args = new String[parameters.size()];
        int i = 0;
        for (Parameter parameter : parameters) {
            String value = value(parameter.getValue());
            if (parameter.getValue() instanceof StringValue) {
                value = StringUtils.replace(value, "|", projectPath + "/");
            }
            if (parameter.getAttribute().getLabel() != null) {
                args[i] = parameter.getAttribute().getLabel().replaceAll(" ", "") + "=" + value;
            } else {
                // todo we need to report this condition..
                args[i] = "";
            }
            i++;
        }
    }

    List<Parameter> collect(Set<String> overridden) {
        List<Parameter> includeIncorporated = new ArrayList<Parameter>();
        for (Parameter parameter : aparModel.getParameters()) {
            if (!overridden.contains(parameter.getAttribute().getLabel())) {
                includeIncorporated.add(parameter);
                overridden.add(parameter.getAttribute().getLabel());
            }
        }
        Incorporates[] reverseIncorporates = (Incorporates[]) aparModel.getIncorporates().toArray();
        CollectionUtils.reverseArray(reverseIncorporates);
        for (Incorporates incorporates : reverseIncorporates) {
            ResourceSet resources = new ResourceSetImpl();
            Resource incFile = resources.getResource(URI.createURI(AParImportResolver.convertURI(incorporates)), true);
            includeIncorporated.addAll(new AParInterpreter(incFile).collect(overridden));
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
            argString += param.getAttribute().getID() + "\t" + value(param.getValue()) + "\r";
        }
        return argString.substring(0, argString.length() - 1);
    }

    public static String value(EObject value) {
        if (value instanceof StringValue) {
            return ((StringValue) value).getValue();
        } else if (value instanceof IntValue) {
            return ((IntValue) value).getValue();
        } else if (value instanceof RealValue) {
            return ((RealValue) value).getValue();
        } else if (value instanceof BooleanValue) {
            return ((BooleanValue) value).getValue().getLiteral();
        }
        throw new RuntimeException("Unexpected object type: " + value.getClass());
    }

    public Model getModel() {
        return aparModel;
    }

    public Resource getResource() {
        return aparResource;
    }
}
