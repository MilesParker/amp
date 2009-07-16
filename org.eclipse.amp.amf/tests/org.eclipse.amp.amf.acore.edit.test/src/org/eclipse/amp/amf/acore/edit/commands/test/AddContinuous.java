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
import org.metaabm.MetaABMFactory;
import org.metaabm.MetaABMPackage;

public class AddContinuous extends CommandTransformer {
    public AddContinuous() {
        super("Add Continuous");
    }

    public Command getCommand() {
        return AddCommand.create(getDomain(), model, MetaABMPackage.Literals.SCONTEXT__PROJECTIONS,
                        MetaABMFactory.eINSTANCE.createSContinuousSpace());
    }

    public void preCondition() {
        CommandTest.assertEquals(model.getProjections().size(), 1);
    }

    public void postCondition() {
        CommandTest.assertTrue(model.getProjections().size() == 2);
        CommandTest.assertEquals(model.getProjections().get(1).getLabel(), "Space");
    }
}