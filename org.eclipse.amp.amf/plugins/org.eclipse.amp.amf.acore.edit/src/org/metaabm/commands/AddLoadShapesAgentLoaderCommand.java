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
 * </copyright> $Id: AddLoadShapesAgentLoaderCommand.java,v 1.3 2010/08/04 01:52:52 mparker Exp $
 */
package org.metaabm.commands;

import java.net.URL;
import java.util.Collection;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.metaabm.SAgent;
import org.metaabm.SContext;
import org.metaabm.SProjection;
import org.metaabm.act.ABuild;
import org.metaabm.act.ALoadAgents;
import org.metaabm.act.MetaABMActFactory;

/**
 * Creates agent style based on loaded shape values.
 * 
 * @author milesparker
 * 
 */
public class AddLoadShapesAgentLoaderCommand extends AddAgentsActsLoaderCommand {

    public AddLoadShapesAgentLoaderCommand(EditingDomain domain, SContext parent, SProjection projection, URL url,
            Collection<?> agents) {
        super(domain, parent, projection, url, agents);
    }

    protected void createAgentConstructor(SAgent agent, ABuild builder) {
        super.createAgentConstructor(agent, builder);

    }

    protected ALoadAgents createAct() {
        return MetaABMActFactory.eINSTANCE.createALoadShapedAgents();
    }
}
