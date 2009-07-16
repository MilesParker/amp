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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.command.SetCommand;
import org.metaabm.IID;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;
import org.metaabm.SAttribute;
import org.metaabm.SImplementation;
import org.metaabm.SImplementationMode;
import org.metaabm.act.AAct;
import org.metaabm.act.ABuild;
import org.metaabm.act.ACreateAgents;
import org.metaabm.act.AGroup;

public class RenameAgentCommand extends SetLabel {

    public RenameAgentCommand() {
        super("Root Context Agent", "Test Agent");
    }

    public IID getIID() {
        return model.getAgents().get(0);
    }

    public Command getCommand() {
        SAgent newAgent = (SAgent) getIID();
        return SetCommand.create(getDomain(), newAgent, MetaABMPackage.Literals.IID__LABEL, "Test Agent");
    }

    public void preCondition() {
        super.preCondition();
        SAgent newAgent = model.findAgent("testAgent");
        CommandTest.assertNull(newAgent);
        SAgent oldAgent = model.findAgent("rootContextAgent");
        CommandTest.assertNotNull(oldAgent);
        CommandTest.assertEquals(oldAgent.getLabel(), "Root Context Agent");
    }

    public void postCondition() {
        super.postCondition();
        SAgent newAgent = model.findAgent("testAgent");
        CommandTest.assertNotNull(newAgent);
        SAgent oldAgent = model.findAgent("rootContextAgent");
        CommandTest.assertNull(oldAgent);
        CommandTest.assertEquals(newAgent.getLabel(), "Test Agent");
        CommandTest.assertEquals(newAgent.getID(), "testAgent");
        CommandTest.assertEquals(newAgent.getPluralLabel(), "Test Agents");
        SImplementation impl = newAgent.getImplementation();
        CommandTest.assertEquals(impl.getClassName(), "TestAgent");
        if (impl.getMode() == SImplementationMode.LOAD_LITERAL) {
            AGroup root = (AGroup) model.getRootActivity();
            AAct builder = ((AGroup) model.getRootActivity()).getMembers().get(0);
            CommandTest.assertEquals(builder.getLabel(), "Build Root Context");
            EList<AAct> targets = builder.getTargets();
            CommandTest.assertEquals(targets.get(0).getLabel(), "Create Test Agent");

            AAct build = root.getMembers().get(0);
            CommandTest.assertTrue(build instanceof ABuild);
            CommandTest.assertSame(build.getGroup(), root);
            AAct create = ((AAct) build).getTargets().get(0);
            CommandTest.assertTrue(create instanceof ACreateAgents);
            CommandTest.assertSame(create.getGroup(), root);
            CommandTest.assertTrue(root.getMembers().contains(create));
            CommandTest.assertSame(build.getTargets().get(0), create);
            SAttribute countAttr = (SAttribute) ((ACreateAgents) create).getAgentCount();
            CommandTest.assertTrue(model.getAttributes().contains(countAttr));

            CommandTest.assertEquals(countAttr.getLabel(), "Test Agent Count");
            CommandTest.assertEquals(countAttr.getDescription(), "The number of test agent instances to create.");
        }
    }
}