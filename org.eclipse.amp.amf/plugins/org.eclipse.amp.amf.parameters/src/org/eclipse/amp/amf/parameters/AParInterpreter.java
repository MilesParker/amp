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

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.amp.amf.parameters.aPar.BOOLEAN;
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
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLParserPool;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl;
import org.metaabm.SAttribute;
import org.metaabm.SAttributeType;
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
    private SContext rootContext;
    private Model aparModel;
    private List<Parameter> parameters;

    private XMLParserPool parserPool = new XMLParserPoolImpl();

    private Map nameToFeatureMap = new HashMap();
    private ResourceSet resourceSet;
    private String localPath;

    public AParInterpreter(Resource apar) {
        this.aparResource = apar;
    }

    public AParInterpreter() {
        super();
    }

    public void load(IResource aparFileResource) {
        if (aparResource == null) {
            IPath modelPath = ((IFile) aparFileResource).getFullPath();
            URI aparLoc = URI.createPlatformResourceURI(modelPath.toString(), true);
            load(aparLoc);
        } else {
            initialize();
        }
    }

    public void load(URI uri) {
        if (resourceSet == null) {
            resourceSet = new ResourceSetImpl();

            resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_ATTACHMENT, Boolean.TRUE);
            resourceSet.getLoadOptions().put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
            resourceSet.getLoadOptions().put(XMLResource.OPTION_USE_DEPRECATED_METHODS, Boolean.TRUE);
            resourceSet.getLoadOptions().put(XMLResource.OPTION_USE_PARSER_POOL, parserPool);
            resourceSet.getLoadOptions().put(XMLResource.OPTION_USE_XML_NAME_TO_FEATURE_MAP, nameToFeatureMap);
        }

        // Registry resourceFactoryRegistry = resources.getResourceFactoryRegistry();

        aparResource = resourceSet.getResource(uri, true);
        ((ResourceImpl) aparResource).setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
        initialize();
    }

    /**
     * @param apar
     */
    private void initialize() {
        aparModel = (Model) aparResource.getContents().get(0);
        assert aparModel != null;
        String convertURI = AParImportResolver.convertURI(aparModel.getModel().get(0));
        URI modelURI = URI.createURI(convertURI);
        Resource amfResource = aparResource.getResourceSet().getResource(modelURI, true);
        ((ResourceImpl) amfResource).setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
        rootContext = (SContext) amfResource.getContents().get(0);

        modelClass = rootContext.getImplementation().getQualifiedName();
        runName = rootContext.getLabel() + "_" + aparResource.getURI().trimFileExtension().lastSegment();
        parameters = collect(new HashSet<String>());

        String rootPath = amfResource.getURI().toPlatformString(true);
        localPath = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(rootPath)).getProject().getLocation()
        .toOSString();

        args = new String[parameters.size()];
        int i = 0;
        for (Parameter parameter : parameters) {
            String value = value(parameter.getValue());
            if (parameter.getValue() instanceof StringValue) {
                value = StringUtils.replace(value, "|", localPath + "/");
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
            String label = parameter.getAttribute().getLabel();
            if (parameter.getAttribute().getOwner() != rootContext) {
                label = parameter.getAttribute().getOwner().getLabel() + " " + label;
            }
            if (!overridden.contains(label)) {
                includeIncorporated.add(parameter);
                overridden.add(label);
            }
        }
        Incorporates[] reverseIncorporates = (Incorporates[]) aparModel.getIncorporates().toArray();
        CollectionUtils.reverseArray(reverseIncorporates);
        for (Incorporates incorporates : reverseIncorporates) {
            AParInterpreter incInterpreter = new AParInterpreter();
            incInterpreter.setResourceSet(resourceSet);
            String convertURI = AParImportResolver.convertURI(incorporates);
            URI incURI = URI.createURI(convertURI);
            incInterpreter.load(incURI);
            includeIncorporated.addAll(incInterpreter.collect(overridden));
        }
        return includeIncorporated;
    }

    /**
     * @return
     */
    public SContext getTargetModel() {
        return rootContext;
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

    private void assign(PropertyDescriptor desc, Object assignee, Object assignment) throws IllegalAccessException,
    InvocationTargetException {
        Object[] assignArg = new Object[1];
        assignArg[0] = assignment;
        desc.getWriteMethod().invoke(assignee, assignArg);
    }

    public void assignValues(Object assignee, MultiStatus status) {
        assignValues(new Object[] { assignee }, status);
    }

    public void assignValues(Object[] assignees, MultiStatus status) {
        Map<PropertyDescriptor, Object> assigneeForProperty = new HashMap<PropertyDescriptor, Object>();
        Map<String, PropertyDescriptor> propertyForID = new HashMap<String, PropertyDescriptor>();
        for (Object assignee : assignees) {
            PropertyDescriptor[] infoProperties;
            try {
                infoProperties = Introspector.getBeanInfo(assignee.getClass()).getPropertyDescriptors();
                for (PropertyDescriptor propertyDescriptor : infoProperties) {
                    propertyForID.put(StringUtils.capitalize(propertyDescriptor.getName()), propertyDescriptor);
                    assigneeForProperty.put(propertyDescriptor, assignee);
                }
            } catch (IntrospectionException e) {
                warn(status, "Could not introspect on \"" + assignee + ". Continuing.", e);
            }
        }
        for (Parameter param : getParameters()) {
            SAttribute attribute = param.getAttribute();
            try {
                try {
                    String attrName = StringUtils.capitalize(attribute.getID());
                    PropertyDescriptor desc = propertyForID.get(attrName);
                    if (desc == null && attribute.getOwner() != getTargetModel()) {
                        // We need to qualify name
                        attrName = StringUtils.capitalize(attribute.getOwner().getID()) + attrName;
                        desc = propertyForID.get(attrName);
                    }
                    if (desc == null) {
                        warn(status, "Could not find attribute \"" + attrName + "\" in " + assignees, null);
                    } else {
                        Object assignee = assigneeForProperty.get(desc);
                        if (attribute.getSType() == SAttributeType.REAL_LITERAL) {
                            assign(desc, assignee, Double.valueOf(AParInterpreter.value(param.getValue())));
                        } else if (attribute.getSType() == SAttributeType.INTEGER_LITERAL) {
                            assign(desc, assignee, Integer.valueOf(AParInterpreter.value(param.getValue())));
                        } else if (attribute.getSType() == SAttributeType.BOOLEAN_LITERAL) {
                            assign(desc, assignee, (((BooleanValue) param.getValue()).getValue() == BOOLEAN.TRUE));
                        } else if (attribute.getSType() == SAttributeType.SYMBOL_LITERAL) {
                            String string = AParInterpreter.value(param.getValue());
                            string = StringUtils.replace(string, "|", getLocalPath() + "/");
                            assign(desc, assignee, string);
                        } else {
                            status.add(new Status(Status.WARNING, "org.eclipse.amp.amf.testing.ide",
                                                  "Unrecognized type: " + attribute.getSType()));
                        }
                    }
                } catch (Exception e) {
                    status.add(new Status(Status.WARNING, "org.eclipse.amp.amf.testing.ide",
                                          "Problem assigning parameter: " + attribute, e));
                    continue;
                }
            } catch (Exception e) {
                status.add(new Status(Status.WARNING, "org.eclipse.amp.amf.testing.ide",
                                      "Couldn't obtain property descriptors for \"" + getModelClass() + "\"", e));
            }
        }
    }

    private void warn(MultiStatus status, String msg, Exception e) {
        if (status != null) {
            status.add(new Status(Status.WARNING, "org.eclipse.amp.amf.testing.ide", msg, e));
        } else {
            System.err.println(msg);
        }
    }

    public Model getModel() {
        return aparModel;
    }

    public Resource getResource() {
        return aparResource;
    }

    /**
     * @param parserPool the parserPool to set
     */
    public void setParserPool(XMLParserPool parserPool) {
        this.parserPool = parserPool;
    }

    /**
     * @param nameToFeatureMap the nameToFeatureMap to set
     */
    public void setNameToFeatureMap(Map nameToFeatureMap) {
        this.nameToFeatureMap = nameToFeatureMap;
    }

    public ResourceSet getResourceSet() {
        return resourceSet;
    }

    public void setResourceSet(ResourceSet resourceSet) {
        this.resourceSet = resourceSet;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public String getLocalPath() {
        return localPath;
    }
}
