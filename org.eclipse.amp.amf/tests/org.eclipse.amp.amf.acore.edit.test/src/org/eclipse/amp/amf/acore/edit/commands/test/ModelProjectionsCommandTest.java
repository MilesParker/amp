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

import java.util.ArrayList;
import java.util.List;

import org.metaabm.SProjection;

public class ModelProjectionsCommandTest extends CommandTest {

    public ModelProjectionsCommandTest(String name) {
        super(name);
    }

    private void buildProjections(List<CommandTransformer> cmds) {
        ModelConstructionCommandTest.buildRoot(cmds);
        ModelConstructionCommandTest.buildAgents(cmds);
        cmds.add(new AddGrid());
        cmds.add(new AddContinuous());
        cmds.add(new AddNetwork());
    }

    public void testGridAdd() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        buildProjections(cmds);
        executeTests(cmds);
    }

    public void testGridSetDims() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        buildProjections(cmds);
        cmds.add(new SetGridDimensions2());
        cmds.add(new SetGridDimensions3() {
            public void preCondition() {
                SProjection grid = model.getProjections().get(0);
                CommandTest.assertEquals(grid.getLabel(), "Grid 2D");
                CommandTest.assertEquals(grid.getAttributes().size(), 2);
            }
        });
        cmds.add(new SetGridDimensions1() {
            public void preCondition() {
                SProjection grid = model.getProjections().get(0);
                CommandTest.assertEquals(grid.getLabel(), "Grid 3D");
                CommandTest.assertEquals(grid.getAttributes().size(), 3);
            }
        });
        cmds.add(new SetGridDimensions3() {
            public void preCondition() {
                SProjection grid = model.getProjections().get(0);
                CommandTest.assertEquals(grid.getLabel(), "Grid 1D");
                CommandTest.assertEquals(grid.getAttributes().size(), 1);
            }
        });
        cmds.add(new SetGridDimensions0() {
            public void preCondition() {
                SProjection grid = model.getProjections().get(0);
                CommandTest.assertEquals(grid.getLabel(), "Grid 3D");
                CommandTest.assertEquals(grid.getAttributes().size(), 3);
            }
        });
        cmds.add(new SetGridDimensions3() {
            public void preCondition() {
                SProjection grid = model.getProjections().get(0);
                CommandTest.assertEquals(grid.getLabel(), "Grid");
                CommandTest.assertEquals(grid.getAttributes().size(), 0);
            }
        });
        executeTests(cmds);
    }
}
