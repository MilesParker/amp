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

import org.metaabm.MetaABMPackage;
import org.metaabm.SAttribute;
import org.metaabm.SNDimensional;
import org.metaabm.SProjection;

public class SetGridDimensions3 extends CommandTransformer {
    public SetGridDimensions3() {
        super("Set Grid Dims");
    }

    public Command getCommand() {
        SProjection grid = model.getProjections().get(0);
        return SetCommand.create(getDomain(), grid, MetaABMPackage.Literals.SN_DIMENSIONAL__DIMENSIONALITY, 3);
    }

    public void preCondition() {
        SProjection grid = model.getProjections().get(0);
        CommandTest.assertEquals(grid.getLabel(), "Grid");
        CommandTest.assertEquals(grid.getAttributes().size(), 0);
    }

    public void postCondition() {
        SNDimensional grid = (SNDimensional) model.getProjections().get(0);
        CommandTest.assertEquals(grid.getDimensionality(), 3);
        CommandTest.assertEquals(grid.getLabel(), "Grid 3D");
        CommandTest.assertEquals(grid.getID(), "grid3D");
        EList<SAttribute> attrs = grid.getAttributes();

        CommandTest.assertEquals(attrs.size(), 3);
        // CommandTest.assertEquals(grid.findAttribute("dimensions"), grid.getAttributes().get(0));
        CommandTest.assertEquals(grid.findAttribute("xExtent"), attrs.get(0));
        CommandTest.assertEquals(grid.findAttribute("yExtent"), attrs.get(1));
        CommandTest.assertEquals(grid.findAttribute("zExtent"), attrs.get(2));
    }
}