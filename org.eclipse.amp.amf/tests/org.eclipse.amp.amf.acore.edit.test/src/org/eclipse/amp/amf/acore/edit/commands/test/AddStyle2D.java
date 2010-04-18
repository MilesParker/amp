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
import org.metaabm.SStyle;

public class AddStyle2D extends CommandTransformer {
    public AddStyle2D() {
        super("Add Style 2D");
    }

    public Command getCommand() {
        return AddCommand.create(getDomain(), model, MetaABMPackage.Literals.SAGENT__STYLES, MetaABMFactory.eINSTANCE
                        .createSStyle2D());
    }

    public void preCondition() {
        CommandTest.assertTrue(model.getStyles().size() == 0);
    }

    public void postCondition() {
        CommandTest.assertTrue(model.getStyles().size() == 1);
        SStyle style = model.getStyles().get(0);
        CommandTest.assertEquals(style.getLabel(), "Root Context Style 2D");
        CommandTest.assertEquals(style.getID(), "rootContextStyle2D");
        CommandTest.assertTrue(style.getAgent() == model);
        CommandTest.assertNotNull(style.getRootActivity());
        CommandTest.assertEquals(style.getRootActivity().getLabel(), "Actions");
    }
}
