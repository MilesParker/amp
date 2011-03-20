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

import org.apache.commons.lang.StringUtils;
import org.eclipse.amp.amf.abase.ICached;
import org.eclipse.amp.amf.abase.IInterpreterProvider;
import org.eclipse.amp.amf.abase.aBase.BOOLEAN;
import org.eclipse.amp.amf.abase.aBase.BooleanValue;
import org.eclipse.amp.amf.abase.aBase.IntValue;
import org.eclipse.amp.amf.abase.aBase.RealValue;
import org.eclipse.amp.amf.abase.aBase.StringValue;
import org.eclipse.amp.amf.parameters.aPar.Import;
import org.eclipse.amp.amf.parameters.aPar.Incorporates;
import org.eclipse.amp.amf.parameters.aPar.Model;
import org.eclipse.amp.amf.parameters.aPar.Parameter;
import org.eclipse.amp.amf.parameters.aPar.SingleParameter;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.metaabm.SAttribute;
import org.metaabm.SAttributeType;
import org.metaabm.SContext;

/**
 * 
 * @author mparker
 * 
 */
public class AParInterpreter implements ICached {

	Resource emfResource;
	private String modelClass;
	private String runName;
	private String[] args;
	private SContext rootContext;
	private Model aparModel;
	private List<Parameter> parameters;
	private String localPath;

	private IInterpreterProvider cache;

	public void load(Resource emfResource) {
		this.emfResource = emfResource;
		((ResourceImpl) emfResource)
				.setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());

		aparModel = (Model) emfResource.getContents().get(0);
		assert aparModel != null;
		String convertURI = AParInterpreter.convertURI(aparModel.getModel());
		URI modelURI = URI.createURI(convertURI);
		Resource amfResource = emfResource.getResourceSet().getResource(
				modelURI, true);
		((ResourceImpl) amfResource)
				.setIntrinsicIDToEObjectMap(new HashMap<String, EObject>());
		rootContext = (SContext) amfResource.getContents().get(0);

		modelClass = rootContext.getImplementation().getQualifiedName();
		runName = rootContext.getLabel() + "_"
				+ emfResource.getURI().trimFileExtension().lastSegment();
		parameters = collect(new HashSet<String>());

		String rootPath = amfResource.getURI().toPlatformString(true);
		localPath = ResourcesPlugin.getWorkspace().getRoot()
				.getFile(new Path(rootPath)).getProject().getLocation()
				.toOSString();

		args = new String[parameters.size()];
		int i = 0;
		for (Parameter param : parameters) {
			if (param instanceof SingleParameter) {
				SingleParameter sp = (SingleParameter) param;
				String value = value(sp.getValue());
				if (sp.getValue() instanceof StringValue) {
					value = StringUtils.replace(value, "|", localPath + "/");
				}
				if (sp.getAttribute().getLabel() != null) {
					args[i] = sp.getAttribute().getLabel().replaceAll(" ", "")
							+ "=" + value;
				} else {
					// todo we need to report this condition..
					args[i] = "";
				}
				i++;
			}
		}
	}

	List<Parameter> collect(Set<String> overridden) {
		List<Parameter> includeIncorporated = new ArrayList<Parameter>();
		for (Parameter param : aparModel.getParameters()) {
			if (param instanceof SingleParameter) {
				SingleParameter sp = (SingleParameter) param;
				String label = sp.getAttribute().getLabel();
				if (sp.getAttribute().getOwner() != rootContext) {
					label = sp.getAttribute().getOwner().getLabel()
							+ " " + label;
				}
				if (!overridden.contains(label)) {
					includeIncorporated.add(sp);
					overridden.add(label);
				}
			}
		}
		Incorporates[] reverseIncorporates = new Incorporates[aparModel
				.getIncorporates().size()];
		for (int i = 0; i < reverseIncorporates.length; i++) {
			reverseIncorporates[reverseIncorporates.length - (i + 1)] = aparModel
					.getIncorporates().get(i);
		}
		for (Incorporates incorporates : reverseIncorporates) {
			String convertURI = AParInterpreter.convertURI(incorporates);
			URI incURI = URI.createURI(convertURI);
			if (cache == null) {
				cache = AParFactory.createPooled(emfResource.getResourceSet());
			}
			AParInterpreter incInterpreter = (AParInterpreter) cache
					.getInterpreter(incURI);
			includeIncorporated.addAll(incInterpreter.collect(overridden));
		}
		return includeIncorporated;
	}

	/**
	 * @return
	 */
	public SContext getRootContext() {
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

	// public String getArgsString() {
	// String argString = "";
	// for (Parameter param : parameters) {
	// if (param instanceof SingleParameter) {
	// SingleParameter sp = (SingleParameter) param;
	// argString += sp.getAttribute().getID() + "\t"
	// + value(sp.getValue()) + "\r";
	// } else if (param instanceof SweepParameter) {
	// SweepParameter sp = (SweepParameter) param;
	// argString += sp.getAttribute().getID() + "\t"
	// + "[" + value(sp.getStartValue()) + value(sp.getStartValue()) + "]\r";
	// } else if (param instanceof SweepLink) {
	// SweepLink sp = (SweepLink) param;
	// argString += sp.getAttribute().getID() + "\t"
	// + "[" + value(sp.getStartValue()) + value(sp.getStartValue()) + "]\r";
	// }
	// }
	// return argString.substring(0, argString.length() - 1);
	// }

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
		throw new RuntimeException("Unexpected object type: "
				+ value.getClass());
	}

	private void assign(PropertyDescriptor desc, Object assignee,
			Object assignment) throws IllegalAccessException,
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
				infoProperties = Introspector.getBeanInfo(assignee.getClass())
						.getPropertyDescriptors();
				for (PropertyDescriptor propertyDescriptor : infoProperties) {
					propertyForID.put(StringUtils.capitalize(propertyDescriptor
							.getName()), propertyDescriptor);
					assigneeForProperty.put(propertyDescriptor, assignee);
				}
			} catch (IntrospectionException e) {
				warn(status, "Could not introspect on \"" + assignee
						+ ". Continuing.", e);
			}
		}
		for (Parameter param : getParameters()) {
			if (param instanceof SingleParameter) {
				SingleParameter sp = (SingleParameter) param;
				SAttribute attribute = sp.getAttribute();
				try {
					try {
						String attrName = StringUtils.capitalize(attribute
								.getID());
						PropertyDescriptor desc = propertyForID.get(attrName);
						if (desc == null
								&& attribute.getOwner() != getRootContext()) {
							// We need to qualify name
							attrName = StringUtils.capitalize(attribute
									.getOwner().getID()) + attrName;
							desc = propertyForID.get(attrName);
						}
						if (desc == null) {
							warn(status, "Could not find attribute \""
									+ attrName + "\" in " + assignees, null);
						} else {
							Object assignee = assigneeForProperty.get(desc);
							if (attribute.getSType() == SAttributeType.REAL_LITERAL) {
								assign(desc, assignee,
										Double.valueOf(AParInterpreter.value(sp
												.getValue())));
							} else if (attribute.getSType() == SAttributeType.INTEGER_LITERAL) {
								assign(desc, assignee,
										Integer.valueOf(AParInterpreter
												.value(sp.getValue())));
							} else if (attribute.getSType() == SAttributeType.BOOLEAN_LITERAL) {
								assign(desc, assignee,
										(((BooleanValue) sp.getValue())
												.getValue() == BOOLEAN.TRUE));
							} else if (attribute.getSType() == SAttributeType.SYMBOL_LITERAL) {
								String string = AParInterpreter.value(sp
										.getValue());
								string = StringUtils.replace(string, "|",
										getLocalPath() + "/");
								assign(desc, assignee, string);
							} else {
								status.add(new Status(Status.WARNING,
										"org.eclipse.amp.amf.testing.ide",
										"Unrecognized type: "
												+ attribute.getSType()));
							}
						}
					} catch (Exception e) {
						status.add(new Status(Status.WARNING,
								"org.eclipse.amp.amf.testing.ide",
								"Problem assigning parameter: " + attribute, e));
						continue;
					}
				} catch (Exception e) {
					status.add(new Status(Status.WARNING,
							"org.eclipse.amp.amf.testing.ide",
							"Couldn't obtain property descriptors for \""
									+ getModelClass() + "\"", e));
				}
			}
		}
	}

	private void warn(MultiStatus status, String msg, Exception e) {
		if (status != null) {
			status.add(new Status(Status.WARNING,
					"org.eclipse.amp.amf.testing.ide", msg, e));
		} else {
			System.err.println(msg);
		}
	}

	public Model getModel() {
		return aparModel;
	}

	public Resource getResource() {
		return emfResource;
	}

	public void setCache(IInterpreterProvider cache) {
		this.cache = cache;
	}

	public List<Parameter> getParameters() {
		return parameters;
	}

	public String getLocalPath() {
		return localPath;
	}

	public static String convertURI(Incorporates incorporateModel) {
		return convertURI(incorporateModel, incorporateModel.getImportURI());
	}

	// poor man's interfaces!
	public static String convertURI(Import importModel) {
		return convertURI(importModel, importModel.getImportURI());
	}

	public static String convertURI(EObject projectObject, String uri) {
		URI fileURI = projectObject.eResource().getURI();
		if (uri.startsWith("|")) {
			// Project relative
			String platformString = "platform:/" + fileURI.segment(0) + "/"
					+ fileURI.segment(1);
			return platformString + "/" + uri.substring(1);
		} else if (!uri.startsWith("/") && !uri.startsWith("platform")) {
			// this is really ugly..
			fileURI = fileURI.trimSegments(1).resolve(fileURI);
			String platformString = fileURI + "/" + uri;
			return platformString;
		}
		// } else if (!uri.startsWith("platform")) {
		// // file relative
		// String projectURI = fileURI.trimSegments(fileURI.segmentCount() -
		// 2).toPlatformString(true);
		// fileURI.
		// System.err.println("file " + fileURI);
		// System.err.println("folder " + folderURI);
		// System.err.println("uri " + uri);
		// System.err.println("res " + folderURI + "/" + uri);
		// return folderURI + "/" + uri;
		// }
		return uri;
	}
}
