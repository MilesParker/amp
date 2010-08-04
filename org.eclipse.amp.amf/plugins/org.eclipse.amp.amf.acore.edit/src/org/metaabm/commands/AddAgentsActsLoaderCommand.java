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
 *   Metascape - Initial development and maintenance
 *
 * </copyright>
 */
package org.metaabm.commands;

import java.net.URL;
import java.util.Collection;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.metaabm.SAgent;
import org.metaabm.SContext;
import org.metaabm.SProjection;
import org.metaabm.act.ABuild;
import org.metaabm.act.ALoadAgents;
import org.metaabm.act.MetaABMActFactory;
import org.metaabm.act.MetaABMActPackage;

/**
 * Add agent acts from a specific loader.
 * 
 * @author milesparker
 * 
 */
public class AddAgentsActsLoaderCommand extends AddAgentsActsCommand {

    SProjection projection;

    URL url;

    ALoadAgents agentAct;

    public AddAgentsActsLoaderCommand(EditingDomain domain, SContext parent, SProjection projection, URL url,
            Collection<?> agents) {
        super(domain, parent, agents);
        this.projection = projection;
        this.url = url;
    }

    @Override
    protected void createAgentConstructor(SAgent agent, ABuild builder) {
        agentAct = createAct();
        command
        .appendAndExecute(AddCommand
                          .create(domain, builder, MetaABMActPackage.Literals.AACT__TARGETS, agentAct));
        command.appendAndExecute(SetCommand.create(domain, agentAct, MetaABMActPackage.Literals.ASELECT__AGENT, agent));
        command.appendAndExecute(SetCommand.create(domain, agentAct, MetaABMActPackage.Literals.ASELECT__SPACE,
                                                   projection));
        command.appendAndExecute(SetCommand.create(domain, agentAct,
                                                   MetaABMActPackage.Literals.ALOAD_AGENTS__SOURCE_URL, url.toString()));
    }

    protected ALoadAgents createAct() {
        ALoadAgents agentLoader = MetaABMActFactory.eINSTANCE.createALoadAgents();
        return agentLoader;
    }

    public ALoadAgents getAgentAct() {
        return agentAct;
    }
}
