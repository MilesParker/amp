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

public class CreateSpace extends CommandTransformer {

    public Command getCommand() {
        return AddCommand.create(getDomain(), model, MetaABMPackage.Literals.SCONTEXT__PROJECTIONS,
                                 MetaABMFactory.eINSTANCE
                                 .createSGrid());
    }

    public void preCondition() {
        CommandTest.assertTrue(model.getProjections().size() == 0);
    }

    public void postCondition() {
        CommandTest.assertTrue(model.getProjections().size() == 1);
    }
}