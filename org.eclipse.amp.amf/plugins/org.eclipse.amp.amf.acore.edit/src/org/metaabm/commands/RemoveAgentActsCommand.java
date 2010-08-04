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
 * </copyright> $Id: RemoveAgentActsCommand.java,v 1.3 2010/08/04 01:52:52 mparker Exp $
 */
package org.metaabm.commands;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.metaabm.IAct;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;
import org.metaabm.SContext;
import org.metaabm.act.AAct;
import org.metaabm.act.ACreateAgents;
import org.metaabm.act.AGroup;
import org.metaabm.act.ASink;
import org.metaabm.act.MetaABMActPackage;

/**
 * Remove any agent related acts from owner and other references.
 * 
 * @author milesparker
 * 
 */
public class RemoveAgentActsCommand extends RemoveCommand {

    CompoundCommand command;

    public RemoveAgentActsCommand(EditingDomain domain, EObject owner, EStructuralFeature feature,
            Collection<?> collection) {
        super(domain, owner, feature, collection);
    }

    public void doExecute() {
        command = new CompoundCommand("Remove Agent Activities and Attributes");
        for (Object object : getCollection()) {
            SAgent agent = (SAgent) object;
            IAct rootActivity = agent.getRootActivity();
            SContext context = agent.getOwner();
            if (context != null && context.getRootActivity() != null) {
                AGroup rootAct = (AGroup) context.getRootActivity();
                if (rootAct != null) {
                    ACreateAgents create = AddAgentsActsCommand.findCreatorFor(agent);
                    if (create != null) {
                        if (context.getAttributes().contains(create.getAgentCount())) {
                            command.appendAndExecute(RemoveCommand.create(domain, context,
                                                                          MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES, create.getAgentCount()));
                        }
                        command.appendAndExecute(RemoveCommand.create(domain, rootAct,
                                                                      MetaABMActPackage.Literals.AGROUP__MEMBERS, create));
                    }
                }
                // ABuild builder = AddAgentActsCommand.findBuilderFor(agent);
                // if ((builder != null) && (builder.getTargets().isEmpty())) {
                // command.appendAndExecute(RemoveCommand.create(domain,
                // rootAct,
                // MetaABMActPackage.Literals.AGROUP__MEMBERS, builder));
                // }
            }
            // todo this is really a slow implementation and may be causing scaling issues
            CompoundCommand subCmd = new CompoundCommand();
            Map<?, ?> usages = EcoreUtil.UsageCrossReferencer.findAll(collection, domain.getResourceSet());
            for (Iterator<?> i = usages.entrySet().iterator(); i.hasNext();) {
                Map.Entry<?, ?> entry = (Map.Entry<?, ?>) i.next();
                EObject eObject = (EObject) entry.getKey();
                Collection<?> settings = (Collection<?>) entry.getValue();
                for (Iterator<?> j = settings.iterator(); j.hasNext();) {
                    EStructuralFeature.Setting setting = (EStructuralFeature.Setting) j.next();
                    EObject referencingEObject = setting.getEObject();
                    EStructuralFeature eStructuralFeature = setting.getEStructuralFeature();
                    if (!eStructuralFeature.isDerived()) {
                        if (eStructuralFeature.isMany()) {
                            command.appendAndExecute(RemoveCommand.create(domain, referencingEObject,
                                                                          eStructuralFeature, eObject));
                        } else {
                            command.appendAndExecute(SetCommand.create(domain, referencingEObject, eStructuralFeature,
                                                                       null));
                        }
                    }
                }
            }
            if (rootActivity != null) {
                for (AAct act : ((AGroup) rootActivity).getMembers()) {
                    if (act instanceof ASink) {
                        subCmd.append(RemoveCommand.create(domain, rootActivity,
                                                           MetaABMActPackage.Literals.AGROUP__MEMBERS, act));
                    }
                }
            }
            // if (agent.eResource() != null) {
            // Iterator all = agent.eResource().getAllContents();
            // while (all.hasNext()) {
            // Object a = all.next();
            // if (a instanceof IValue) {
            // if (())
            // subCmd.append(RemoveCommand.create(domain,
            // agent.getRootActivity(),
            // MetaABMActPackage.Literals.AGROUP__MEMBERS, act));
            // }
            // }
            // }
            command.appendAndExecute(subCmd);

        }
        super.doExecute();
    }

    public void doRedo() {
        super.doRedo();
        command.redo();
    }

    public void doUndo() {
        super.doUndo();
        command.undo();
    }
}
