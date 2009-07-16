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

import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.metaabm.MetaABMFactory;
import org.metaabm.MetaABMPackage;
import org.metaabm.SImplementationMode;
import org.metaabm.act.AGroup;

public class CreateSubcontext extends CommandTransformer {
    public Command getCommand() {
        return AddCommand.create(getDomain(), model, MetaABMPackage.eINSTANCE.getSContext_Agents(),
                        MetaABMFactory.eINSTANCE.createSContext());
    }

    public void addPrePost(List<PrePostCondition> list) {
        list.add(new NewSubcontextCondition());
    }

    public void preCondition() {
        CommandTest.assertTrue(model.getAgents().size() == 1);
        AGroup rootActivity = (AGroup) model.getRootActivity();
        if (model.getImplementation().getMode() == SImplementationMode.GENERATE_LITERAL) {
            CommandTest.assertEquals(rootActivity.getMembers().size(), 2);
        } else {
            CommandTest.assertNotNull(model.getRootActivity());
        }
        super.preCondition();
    }

}