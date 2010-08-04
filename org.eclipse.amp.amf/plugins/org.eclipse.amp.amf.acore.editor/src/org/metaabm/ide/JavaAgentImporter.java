/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Metascape - Development and maintenance
 *
 * </copyright> $Id: JavaAgentImporter.java,v 1.3 2010/08/04 01:53:54 mparker Exp $
 */
package org.metaabm.ide;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.java.JClass;
import org.eclipse.emf.java.JCompilationUnit;
import org.eclipse.emf.java.JMember;
import org.eclipse.emf.java.JMethod;
import org.eclipse.emf.java.JVisibility;
import org.eclipse.emf.java.util.JavaPackageResourceFactoryImpl;
import org.eclipse.emf.java.util.JavaResourceFactoryImpl;
import org.metaabm.MetaABMFactory;
import org.metaabm.SAgent;
import org.metaabm.SAttribute;
import org.metaabm.SAttributeType;
import org.metaabm.SNamed;
import org.metaabm.act.AGroup;
import org.metaabm.act.ARule;
import org.metaabm.act.MetaABMActFactory;

/**
 * Imports a java model into a meta-model agent.
 * 
 * @author milesparker
 * 
 */
public class JavaAgentImporter extends AgentImporter {

    public final static Map<String, SAttributeType> supportedTypes = new HashMap<String, SAttributeType>();

    {
        supportedTypes.put("double", SAttributeType.REAL_LITERAL);
        supportedTypes.put("float", SAttributeType.REAL_LITERAL);
        supportedTypes.put("int", SAttributeType.INTEGER_LITERAL);
        supportedTypes.put("long", SAttributeType.INTEGER_LITERAL);
        supportedTypes.put("short", SAttributeType.INTEGER_LITERAL);
        supportedTypes.put("boolean", SAttributeType.BOOLEAN_LITERAL);
        supportedTypes.put("String", SAttributeType.SYMBOL_LITERAL);
        supportedTypes.put("Double", SAttributeType.REAL_LITERAL);
        supportedTypes.put("Float", SAttributeType.REAL_LITERAL);
        supportedTypes.put("Integer", SAttributeType.INTEGER_LITERAL);
        supportedTypes.put("Long", SAttributeType.INTEGER_LITERAL);
        supportedTypes.put("Short", SAttributeType.INTEGER_LITERAL);
        supportedTypes.put("Boolean", SAttributeType.BOOLEAN_LITERAL);
    }

    public JavaAgentImporter(SAgent agent, String path) {
        super(agent, path, "Import agent from Java class");
    }

    protected IStatus run(IProgressMonitor monitor) {
        if (path != null) {
            URI uri = URI.createFileURI(path);
            JavaResourceFactoryImpl resourceFactory = new JavaResourceFactoryImpl();
            Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("java", resourceFactory);
            Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("packages",
                                                                              new JavaPackageResourceFactoryImpl());
            ResourceSet resourceSet = new ResourceSetImpl();

            Resource resource = resourceSet.getResource(uri, true);
            JCompilationUnit javaSource = (JCompilationUnit) resource.getEObject("/");
            JClass publicClass = javaSource.getTypes().get(0);
            monitor.beginTask("Importing from: " + new Path(path).lastSegment(), publicClass.getAllMethods().size());
            importAsSName(agent, publicClass);
            for (JMethod method : publicClass.getAllMethods()) {
                if (method.getReturnType() != null && method.getVisibility() == JVisibility.PUBLIC_LITERAL) {
                    String propertyName = method.getName();
                    if (propertyName.startsWith("get") || propertyName.startsWith("is")) {
                        if (method.getParameters().size() == 0
                                && supportedTypes.get(method.getReturnType().getName()) != null) {
                            SAttribute attr = MetaABMFactory.eINSTANCE.createSAttribute();
                            if (propertyName.startsWith("get")) {
                                propertyName = StringUtils.removeStart(propertyName, "get");
                            } else {
                                propertyName = StringUtils.removeStart(propertyName, "is");
                            }
                            propertyName = StringUtils.uncapitalize(propertyName);
                            method.setName(propertyName);
                            agent.getAttributes().add(attr);
                            importAsSName(attr, method);
                            attr.setSType(supportedTypes.get(method.getReturnType().getName()));
                        }
                    } else if (!propertyName.startsWith("set") && method.getReturnType().getName().equals("void")) {
                        ARule rule = MetaABMActFactory.eINSTANCE.createARule();
                        ((AGroup) agent.getRootActivity()).getMembers().add(rule);
                        importAsSName(rule, method);
                        rule.setSelected(rule);
                        rule.setAgent(agent);
                        if (agent.getOwner() != null && agent.getOwner().getProjections().size() > 0) {
                            rule.setSpace(agent.getOwner().getProjections().get(0));
                        }
                    }
                }
                monitor.worked(1);
            }
            return Status.OK_STATUS;
        } else {
            return Status.CANCEL_STATUS;
        }
    }

    protected void importAsSName(SNamed named, JMember jobject) {
        String description = clean(jobject.getComment());
        description = description.replaceAll("\\@*", "");
        description = description.replaceAll("Returns the", "The");
        importAsSName(named, jobject.getName(), description);
    }

    private String clean(String comment) {
        if (comment != null) {
            comment = comment.replace("/**", "");
            comment = comment.replace("     */", "");
            comment = comment.replace("     *", "");
            comment = comment.replace("*/", "");
            comment = comment.replace("*", "");
            comment = comment.replace("<ul>", "");
            comment = comment.replace("</ul>", "");
            comment = comment.replace("<p>", "");
            comment = comment.replace("<code>", "");
            comment = comment.replace("&lt;", "<");
            comment = comment.replace("&gt;", ">");
            comment = comment.replace("</code>", "");
            comment = comment.replace("\n ", "");
            comment = comment.replace("\n", "");
            comment = comment.replace("<li> ", "\n  ");
            comment = comment.replace("<li>", "\n  ");
            comment = comment.replace("</li>", "\n");
            comment = comment.replace("<i>", "");
            comment = comment.replace("</i>", "");
            comment = comment.replace("<sup>", "^");
            comment = comment.replace("</sup>", "^");
            comment = comment.replace(".  ", ". ");
            comment = comment.replaceAll("&nbsp;", " ");
            return comment;
        }
        return "";
    }
}
