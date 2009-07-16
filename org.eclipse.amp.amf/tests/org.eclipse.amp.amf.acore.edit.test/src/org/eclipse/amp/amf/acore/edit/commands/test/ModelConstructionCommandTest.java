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

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAttribute;
import org.metaabm.act.AGroup;

public class ModelConstructionCommandTest extends CommandTest {

    public ModelConstructionCommandTest(String name) {
        super(name);
    }

    public static void buildRoot(List<CommandTransformer> cmds) {
        cmds.add(new AddRootCommand());
    }

    public static void buildSpace(List<CommandTransformer> cmds) {
        cmds.add(new CreateSpace());
    }

    public static void buildAgents(List<CommandTransformer> cmds) {
        cmds.add(new CreateAgents() {
            public void addPrePost(List<PrePostCondition> list) {
                super.addPrePost(list);
                list.add(new NewAgentGenCondition());
            }
        });
        cmds.add(new CreateSubcontext() {
            public void addPrePost(List<PrePostCondition> list) {
                super.addPrePost(list);
                list.add(new NewSubcontextGenCondition());
            }
        });
    }

    public static void buildBasic(List<CommandTransformer> cmds) {
        buildRoot(cmds);
        buildAgents(cmds);
    }

    public void testRoot() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        buildRoot(cmds);
        executeTests(cmds);
    }

    public void testAddAgents() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        buildRoot(cmds);
        buildAgents(cmds);
        executeTests(cmds);
    }

    public void testCreateSpace() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        buildRoot(cmds);
        buildSpace(cmds);
        executeTests(cmds);
    }

    public void testCreateSpaceAgentsFirst() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        buildRoot(cmds);
        buildAgents(cmds);
        buildSpace(cmds);
        executeTests(cmds);
    }

    public void testRemoveAgents() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        buildRoot(cmds);
        buildAgents(cmds);
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return RemoveCommand.create(getDomain(), model, MetaABMPackage.Literals.SCONTEXT__AGENTS, model
                                            .getAgents().get(0));
            }
            public void doPreCondition() {
                super.doPreCondition();
                assertEquals(model.getAgents().size(), 2);
                assertNotNull(model.findAgent("rootContextAgent"));
                assertNotNull(model.findAgent("rootContextContext"));
                assertEquals(((AGroup) model.getRootActivity()).getMembers().size(), 3);
                assertEquals(model.getAttributes().size(), 2);
                SAttribute agentCreatorAttr = model.getAttributes().get(0);
                assertEquals(agentCreatorAttr.getAccessors().size(), 1);
            }

            public void doPostCondition() {
                super.doPostCondition();
                assertEquals(model.getAgents().size(), 1);
                assertNull(model.findAgent("rootContextAgent"));
                assertNotNull(model.findAgent("rootContextContext"));
                assertEquals(((AGroup) model.getRootActivity()).getMembers().size(), 2);
                assertEquals(model.getAttributes().size(), 1);
            }
        });
        executeTests(cmds);
    }

}
