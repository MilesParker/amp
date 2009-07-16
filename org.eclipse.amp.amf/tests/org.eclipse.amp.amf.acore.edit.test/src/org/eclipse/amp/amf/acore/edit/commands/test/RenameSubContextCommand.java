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
import org.eclipse.emf.edit.command.SetCommand;
import org.metaabm.IID;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;

public class RenameSubContextCommand extends SetLabel {

    public RenameSubContextCommand() {
        super("Root Context Context", "Test SubContext");
    }

    public IID getIID() {
        return model.getAgents().get(1);
    }

    public Command getCommand() {
        SAgent newAgent = (SAgent) getIID();
        return SetCommand.create(getDomain(), newAgent, MetaABMPackage.Literals.IID__LABEL, "Test SubContext");
    }

    public void preCondition() {
        super.preCondition();
        SAgent newAgent = model.findAgent("testSubContext");
        CommandTest.assertNull(newAgent);
        SAgent oldAgent = model.findAgent("rootContextContext");
        CommandTest.assertNotNull(oldAgent);
        CommandTest.assertEquals(oldAgent.getLabel(), "Root Context Context");
    }

    public void postCondition() {
        super.postCondition();
        SAgent newAgent = model.findAgent("testSubContext");
        CommandTest.assertNotNull(newAgent);
        SAgent oldAgent = model.findAgent("rootContextContext");
        CommandTest.assertNull(oldAgent);
        CommandTest.assertEquals(newAgent.getLabel(), "Test SubContext");
        CommandTest.assertEquals(newAgent.getID(), "testSubContext");
        CommandTest.assertEquals(newAgent.getPluralLabel(), "Test SubContexts");
        CommandTest.assertEquals(newAgent.getImplementation().getClassName(), "TestSubContext");
    }
}