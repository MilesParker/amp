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

package org.eclipse.amp.amf.acore.edit.commands.test;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;
import org.metaabm.SStyle;

public class SetStyleAgent extends CommandTransformer {
    public SetStyleAgent() {
        super("Set Style");
    }

    public Command getCommand() {
        return AddCommand.create(getDomain(), model.getAgents().get(0), MetaABMPackage.Literals.SAGENT__STYLES, model
                        .getStyles().get(0));
    }

    public void preCondition() {
    }

    public void postCondition() {
        CommandTest.assertEquals(model.getStyles().size(), 0);
        SAgent agent = model.getAgents().get(0);
        SStyle agentStyle = agent.getStyles().get(0);
        CommandTest.assertSame(agentStyle.getAgent(), agent);
        CommandTest.assertTrue(agent.getStyles().size() == 1);
        CommandTest.assertEquals(agentStyle.getLabel(), "Root Context Agent Style 2D");
        CommandTest.assertEquals(agentStyle.getID(), "rootContextAgentStyle2D");
    }
}