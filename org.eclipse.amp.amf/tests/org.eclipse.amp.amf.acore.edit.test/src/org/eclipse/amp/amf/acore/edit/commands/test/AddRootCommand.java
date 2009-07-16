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

import java.util.Collections;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.metaabm.MetaABMPackage;
import org.metaabm.act.AGroup;
import org.metaabm.act.MetaABMActFactory;
import org.metaabm.commands.AddImplementatedCommand;

public class AddRootCommand extends SetLabel {
    public AddRootCommand() {
        super("", "Root Context");
    }

    public Command getCommand() {
        CompoundCommand command = new CompoundCommand();
        command.append(new AddImplementatedCommand(domain, Collections.singleton(model)));
        AGroup rootAct = MetaABMActFactory.eINSTANCE.createAGroup();
        command.append(SetCommand.create(domain, model, MetaABMPackage.Literals.SACTABLE__ROOT_ACTIVITY, rootAct));
        command.append(super.getCommand());
        return command;
    }

    public void preCondition() {
        CommandTest.assertTrue(StringUtils.isEmpty(model.getLabel()));
        CommandTest.assertTrue(model.getID(), StringUtils.isEmpty(model.getID()));
        CommandTest.assertEquals(model.getPluralLabel(), null);
        CommandTest.assertNull(model.getImplementation());
    }

    public void postCondition() {
        super.postCondition();
        CommandTest.assertNotNull(model.getRootActivity());
        CommandTest.assertEquals(((AGroup) model.getRootActivity()).getMembers().size(), 0);
        CommandTest.assertEquals(model.getLabel(), "Root Context");
        CommandTest.assertEquals(model.getID(), "rootContext");
        CommandTest.assertEquals(model.getPluralLabel(), "Root Contexts");
        CommandTest.assertEquals(model.getImplementation().getClassName(), "RootContext");
    }
}