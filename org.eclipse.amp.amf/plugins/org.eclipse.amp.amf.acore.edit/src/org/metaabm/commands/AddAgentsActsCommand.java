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
 * </copyright> $Id: AddAgentsActsCommand.java,v 1.1 2010/04/20 22:25:54 mparker Exp $
 */
package org.metaabm.commands;

import java.util.Collection;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.metaabm.MetaABMFactory;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;
import org.metaabm.SAttribute;
import org.metaabm.SAttributeType;
import org.metaabm.SContext;
import org.metaabm.SImplementationMode;
import org.metaabm.act.AAct;
import org.metaabm.act.ABuild;
import org.metaabm.act.ACreateAgents;
import org.metaabm.act.AGroup;
import org.metaabm.act.MetaABMActFactory;
import org.metaabm.act.MetaABMActPackage;

/**
 * Creates acts on agent creation.
 * 
 * @author milesparker
 * 
 */
public class AddAgentsActsCommand extends AbstractOverrideableCommand {

    protected CompoundCommand command;

    SContext parent;

    Collection<?> agents;

    public AddAgentsActsCommand(EditingDomain domain, SContext parent, Collection<?> agents) {
        super(domain, "Add Agent Acts");
        this.agents = agents;
        this.parent = parent;
    }

    public Collection<?> doGetAffectedObjects() {
        return agents;
    }

    public boolean doCanExecute() {
        return parent != null && parent.getImplementation().getMode() == SImplementationMode.GENERATE_LITERAL;
    }

    public static ABuild findBuilderFor(SAgent agent) {
        return findBuilderOf(agent.getOwner());
    }

    public static ABuild findBuilderOf(SContext agent) {
        AGroup root = (AGroup) agent.getRootActivity();
        if (root != null) {
            return (ABuild) EcoreUtil.getObjectByType(root.getMembers(), MetaABMActPackage.Literals.ABUILD);
        }
        return null;
    }

    public static ACreateAgents findCreatorFor(SAgent agent) {
        return findCreatorOf(agent.getOwner(), agent);
    }

    public static ACreateAgents findCreatorOf(SContext context, SAgent agent) {
        AGroup root = (AGroup) context.getRootActivity();
        if (root != null) {
            for (AAct act : root.getMembers()) {
                if (act instanceof ACreateAgents && ((ACreateAgents) act).getAgent() == agent) {
                    return (ACreateAgents) act;
                }
            }
        }
        return null;
    }

    public void doExecute() {
        command = new CompoundCommand("Add Agent Activities and Attributes");
        for (Object object : agents) {
            SAgent agent = (SAgent) object;
            // todo is this creating a cycle?
            command.appendAndExecute(new SetGenerateCommand(domain, agent.getImplementation(), agent
                                                            .getImplementation().getMode()));
            if (parent != null) {
                ABuild builder = findBuilderFor(agent);

                if (builder == null) {
                    builder = MetaABMActFactory.eINSTANCE.createABuild();
                    command.appendAndExecute(AddCommand.create(domain, agent.getOwner().getRootActivity(),
                                                               MetaABMActPackage.Literals.AGROUP__MEMBERS, builder));
                }
                ACreateAgents agentCreator = findCreatorFor(agent);

                if (agentCreator == null) {
                    createAgentConstructor(agent, builder);
                }
            }
        }
    }

    protected void createAgentConstructor(SAgent agent, ABuild builder) {
        ACreateAgents agentCreator;
        agentCreator = MetaABMActFactory.eINSTANCE.createACreateAgents();
        command.appendAndExecute(AddCommand.create(domain, builder, MetaABMActPackage.Literals.AACT__TARGETS,
                                                   agentCreator));
        command.appendAndExecute(SetCommand.create(getDomain(), agentCreator,
                                                   MetaABMActPackage.Literals.ASELECT__AGENT, agent));
        SAttribute countAttr = MetaABMFactory.eINSTANCE.createSAttribute();
        command.appendAndExecute(SetCommand.create(getDomain(), countAttr, MetaABMPackage.Literals.ITYPED__STYPE,
                                                   SAttributeType.INTEGER_LITERAL));
        command.appendAndExecute(AddCommand.create(getDomain(), agent.getOwner(),
                                                   MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES, countAttr));
        command.appendAndExecute(SetCommand.create(getDomain(), agentCreator,
                                                   MetaABMActPackage.Literals.ACREATE_AGENTS__AGENT_COUNT, countAttr));
    }

    public void doRedo() {
        command.redo();
    }

    public void doUndo() {
        command.undo();
    }
}
