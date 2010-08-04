/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Argonne National Laboratory - Initial development (pre-contribution)
 *   Metascape - Subsequent development and maintenance
 *
 * </copyright> $Id: TargetTranslator.java,v 1.3 2010/08/04 01:52:52 mparker Exp $
 */
package org.metaabm.commands;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import org.apache.commons.lang.StringUtils;
import org.metaabm.IID;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;
import org.metaabm.SContext;
import org.metaabm.SImplemented;
import org.metaabm.SProjection;
import org.metaabm.act.ABuildProjection;
import org.metaabm.act.ACreateAgents;
import org.metaabm.act.ALoadAgents;
import org.metaabm.act.ALoadShapedAgents;
import org.metaabm.provider.MetaABMEditPlugin;

/**
 * Standard translators for typical identifier transformations.
 * 
 * @author milesparker
 * 
 */
public abstract class TargetTranslator implements StringTranslator {

    EStructuralFeature sourceFeature;

    EStructuralFeature targetFeature;

    public final static TargetTranslator LABEL_TO_CLASSNAME_TRANSLATOR = new TargetTranslator(
                                                                                              MetaABMPackage.Literals.SIMPLEMENTATION__CLASS_NAME) {
        public String translateName(String otherName, IID source) {
            String className = removeSpecialChars(otherName);
            return className;
        }

        public EObject targetFor(EObject source) {
            return ((SImplemented) source).getImplementation();
        }
    };

    public final static TargetTranslator LABEL_TO_AGENT_COUNT_DESC_TRANSLATOR = new TargetTranslator(
                                                                                                     MetaABMPackage.Literals.SNAMED__PLURAL_LABEL, MetaABMPackage.Literals.SNAMED__DESCRIPTION) {
        public String translateName(String otherName, IID source) {
            // todo would like to have real support for plural
            // names
            // here
            return "The number of " + (otherName != null ? otherName.toLowerCase() : "?") + " to create.";
        }

        public EObject targetFor(EObject source) {
            ACreateAgents creator = AddAgentsActsCommand.findCreatorFor((SAgent) source);
            return creator != null ? creator.getAgentCount() : null;
        }
    };

    public final static TargetTranslator LABEL_TO_AGENT_COUNT_LABEL_TRANSLATOR = new TargetTranslator() {
        public String translateName(String otherName, IID source) {
            return otherName + " Count";
        }

        public EObject targetFor(EObject source) {
            ACreateAgents creator = AddAgentsActsCommand.findCreatorFor((SAgent) source);
            return creator != null ? creator.getAgentCount() : null;
        }
    };

    public final static TargetTranslator LABEL_TO_AGENT_CREATOR_LABEL_TRANSLATOR = new TargetTranslator(
                                                                                                        MetaABMPackage.Literals.SNAMED__PLURAL_LABEL, MetaABMPackage.Literals.IID__LABEL) {
        public String translateName(String otherName, IID source) {
            String label = !StringUtils.isEmpty(otherName) ? otherName : "Unspecified";
            if (source instanceof ALoadAgents || source instanceof ALoadShapedAgents) {
                label = "Load " + label;
            } else {
                label = "Create " + label;
            }
            return label;
        }

        public EObject targetFor(EObject source) {
            ACreateAgents creator = AddAgentsActsCommand.findCreatorFor((SAgent) source);
            return creator;
        }
    };

    public final static TargetTranslator LABEL_TO_SPACE_BUILDER_LABEL_TRANSLATOR = new TargetTranslator(
                                                                                                        MetaABMPackage.Literals.SNAMED__PLURAL_LABEL, MetaABMPackage.Literals.IID__LABEL) {
        public String translateName(String otherName, IID source) {
            String label = !StringUtils.isEmpty(otherName) ? otherName : "Undefined";
            if (source instanceof ABuildProjection) {
                label = "Build " + label;
            }
            return label;
        }

        public EObject targetFor(EObject source) {
            ABuildProjection creator = AddSpacesActsCommand.findBuilderOf((SContext) ((SProjection) source)
                                                                          .eContainer(), (SProjection) source);
            return creator;
        }
    };

    public final static TargetTranslator LABEL_TO_PLURAL_NAME_TRANSLATOR = new TargetTranslator(
                                                                                                MetaABMPackage.Literals.SNAMED__PLURAL_LABEL) {
        public String translateName(String otherName, IID source) {
            return !StringUtils.isEmpty(otherName) ? otherName.concat("s") : "";
        }
    };

    public final static TargetTranslator LABEL_TO_ID_TRANSLATOR = new TargetTranslator(MetaABMPackage.Literals.IID__ID) {
        public String translateName(String otherName, IID source) {
            String legalID = removeSpecialChars(otherName);
            legalID = StringUtils.uncapitalize(legalID);
            return legalID;
        }
    };

    // todo clean-up
    public final static List<TargetTranslator> ID_TRANSLATORS = Arrays.asList(LABEL_TO_ID_TRANSLATOR);

    public final static List<TargetTranslator> PLURAL_TRANSLATORS = Arrays
    .asList(LABEL_TO_AGENT_CREATOR_LABEL_TRANSLATOR, LABEL_TO_AGENT_COUNT_DESC_TRANSLATOR);

    public final static List<TargetTranslator> AGENT_TRANSLATORS = Arrays
    .asList(LABEL_TO_ID_TRANSLATOR, LABEL_TO_PLURAL_NAME_TRANSLATOR, LABEL_TO_CLASSNAME_TRANSLATOR,
            LABEL_TO_AGENT_COUNT_DESC_TRANSLATOR, LABEL_TO_AGENT_CREATOR_LABEL_TRANSLATOR,
            LABEL_TO_AGENT_COUNT_LABEL_TRANSLATOR);

    public final static List<TargetTranslator> SAPCE_TRANSLATORS = Arrays.asList(LABEL_TO_ID_TRANSLATOR,
                                                                                 LABEL_TO_PLURAL_NAME_TRANSLATOR,
                                                                                 LABEL_TO_SPACE_BUILDER_LABEL_TRANSLATOR);

    public final static List<TargetTranslator> NAMED_IMPLEMENTED_TRANSLATORS = Arrays
    .asList(LABEL_TO_ID_TRANSLATOR, LABEL_TO_PLURAL_NAME_TRANSLATOR, LABEL_TO_CLASSNAME_TRANSLATOR);

    public final static List<TargetTranslator> NAMED_TRANSLATORS = Arrays.asList(LABEL_TO_ID_TRANSLATOR,
                                                                                 LABEL_TO_PLURAL_NAME_TRANSLATOR);

    public final static List<TargetTranslator> IMPLEMENTED_TRANSLATORS = Arrays.asList(LABEL_TO_ID_TRANSLATOR,
                                                                                       LABEL_TO_CLASSNAME_TRANSLATOR);

    public TargetTranslator() {
        this(MetaABMPackage.Literals.IID__LABEL);
    }

    public TargetTranslator(EStructuralFeature targetFeature) {
        this(MetaABMPackage.Literals.IID__LABEL, targetFeature);
    }

    public TargetTranslator(EStructuralFeature sourceFeature, EStructuralFeature targetFeature) {
        this.sourceFeature = sourceFeature;
        this.targetFeature = targetFeature;
    }

    public EObject targetFor(EObject source) {
        return source;
    }

    public boolean includeFor(EditingDomain domain, EObject source) {
        String sourceName = (String) source.eGet(sourceFeature);
        String oldTranslatedName = translateName(sourceName, (IID) source);
        EObject target = targetFor(source);

        if (target != null) {
            String oldName = (String) target.eGet(targetFeature);
            oldName = StringUtils.remove(oldName, " Copy");
            oldName = StringUtils.remove(oldName, "Copy");
            oldTranslatedName = StringUtils.remove(oldTranslatedName, " Copy");
            oldTranslatedName = StringUtils.remove(oldTranslatedName, "Copy");
            String defaultString = MetaABMEditPlugin.INSTANCE.getString("_UI_" + source.eClass().getName() + "_type");
            // System.out.println();
            // System.out.println((new StringBuffer(" : "+oldName).insert(0,
            // "[TargetTranslator.includeFor] oldName")));
            // System.out.println((new StringBuffer(" :
            // "+oldTranslatedName).insert(0, "[TargetTranslator.includeFor]
            // oldTranslatedName")));
            //
            // System.out.println((new StringBuffer(" :
            // "+defaultString).insert(0, "[TargetTranslator.includeFor]
            // defaultString")));

            if (!StringUtils.isEmpty(StringUtils.deleteWhitespace(oldName)) && !oldName.equals(oldTranslatedName)) {
                if (target instanceof IID) {
                    SuggestLabelCommand testCmd = new SuggestLabelCommand(domain, (IID) target);
                    if (targetFeature == MetaABMPackage.Literals.IID__LABEL
                            && (testCmd.suggestLabel((IID) target).equals(oldName) || defaultString.equals(oldName))
                            || targetFeature == MetaABMPackage.Literals.IID__ID
                            && testCmd.suggestID((IID) target).equals(oldName)) {
                        // || ((targetFeature ==
                        // MetaABMPackage.Literals.SNAMED__PLURAL_LABEL) &&
                        // SetLabelCommand.LABEL_TO_PLURAL_NAME_TRANSLATOR.
                        // translateName(
                        // testCmd.suggestLabel((IID) target)).equals(oldName)))
                        // {
                        return true;
                    }
                }
                return false;
            }
        }
        return true;
    }

    public Command createCommand(EditingDomain domain, IID source) {
        if (source != null) {
            String sourceName = (String) source.eGet(sourceFeature);

            if (!StringUtils.isEmpty(sourceName)) {
                EObject targetFor = targetFor(source);
                String targetValue = translateName(sourceName, targetFor instanceof IID ? (IID) targetFor : source);

                return SetCommand.create(domain, targetFor, targetFeature, targetValue);
            }
        }
        return null;
    }

    public static Command create(EditingDomain domain, List<TargetTranslator> translators, IID source) {
        CompoundCommand cmd = new CompoundCommand();
        for (TargetTranslator targetTranslator : translators) {
            cmd.append(targetTranslator.createCommand(domain, source));
        }
        return cmd;
    }

    protected String removeSpecialChars(String otherName) {
        String legalID = StringUtils.deleteWhitespace(StringUtils.capitalize(otherName));
        // todo..make this more generic
        legalID = StringUtils.replace(legalID, "()", "");
        legalID = StringUtils.replace(legalID, "(", "_");
        legalID = StringUtils.replace(legalID, ")", "_");
        legalID = StringUtils.replace(legalID, "[?]", "");
        legalID = StringUtils.replace(legalID, "[", "_");
        legalID = StringUtils.replace(legalID, "]", "_");
        legalID = StringUtils.replace(legalID, "?", "");
        legalID = StringUtils.replace(legalID, "&&", "AND");
        legalID = StringUtils.replace(legalID, "&", "And");
        legalID = StringUtils.replace(legalID, "!", "Not");
        legalID = StringUtils.replace(legalID, "||", "OR");
        legalID = StringUtils.replace(legalID, "|", "Or");
        legalID = StringUtils.replace(legalID, ",", "");
        legalID = StringUtils.replace(legalID, ".", "pt");
        legalID = StringUtils.replace(legalID, ":", "");
        return legalID;
    }
}