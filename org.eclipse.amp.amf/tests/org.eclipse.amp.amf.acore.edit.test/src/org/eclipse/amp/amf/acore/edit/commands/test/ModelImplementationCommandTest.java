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
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.metaabm.MetaABMPackage;
import org.metaabm.SImplementationMode;
import org.metaabm.act.AGroup;

public class ModelImplementationCommandTest extends CommandTest {

    public ModelImplementationCommandTest(String name) {
        super(name);
    }

    public void testMode() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildRoot(cmds);
        buildLoadAgents(cmds);
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return SetCommand.create(getDomain(), model.getImplementation(),
                                MetaABMPackage.Literals.SIMPLEMENTATION__MODE, SImplementationMode.GENERATE_LITERAL,
                                CommandParameter.NO_INDEX);
            }

            public void addPrePost(List<PrePostCondition> list) {
                super.addPrePost(list);
                // SetLabelPropogationCondition setLabelPropogationCondition =
                // new SetLabelPropogationCondition(
                // "Root Context Implementation");
                // setLabelPropogationCondition.id = model.getImplementation();
                // list.add(setLabelPropogationCondition);

                list.add(new NewAgentCondition());
                list.add(new NewAgentGenCondition() {

                    public void preCondition() {
                        AGroup root = (AGroup) model.getRootActivity();
                        CommandTest.assertEquals(model.getAttributes().size(), 0);
                        CommandTest.assertNotNull(root);
                    }

                });
                list.add(new NewSubcontextCondition());
                list.add(new NewSubcontextGenCondition() {
                    public void preCondition() {
                        AGroup root = (AGroup) model.getRootActivity();
                        CommandTest.assertEquals(model.getAttributes().size(), 0);
                        CommandTest.assertNotNull(root);
                    }
                });
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return SetCommand.create(getDomain(), model.getImplementation(),
                                MetaABMPackage.Literals.SIMPLEMENTATION__MODE, SImplementationMode.LOAD_LITERAL,
                                CommandParameter.NO_INDEX);
            }

            public void addPrePost(List<PrePostCondition> list) {
                list.add(new NewAgentCondition());
                list.add(new NewSubcontextCondition());
            }

            public void preCondition() {
                super.preCondition();
                CommandTest.assertEquals(model.getAttributes().size(), 2);
            }

            public void postCondition() {
                super.postCondition();
                CommandTest.assertNotNull(model.getRootActivity());
                CommandTest.assertEquals(model.getAttributes().size(), 2);
            }
        });
        executeTests(cmds);
    }

    public void testModeRename() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildRoot(cmds);
        buildLoadAgents(cmds);
        cmds.add(new RenameAgentCommand());
        cmds.add(new RenameSubContextCommand());
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return SetCommand.create(getDomain(), model.getImplementation(),
                                MetaABMPackage.Literals.SIMPLEMENTATION__MODE, SImplementationMode.GENERATE_LITERAL,
                                CommandParameter.NO_INDEX);
            }

            public void preCondition() {
                // super.preCondition();
                assertEquals(model.getAgents().get(0).getLabel(), "Test Agent");
                assertEquals(model.getAgents().get(1).getLabel(), "Test SubContext");
                AGroup root = ((AGroup) model.getRootActivity());
                assertNotNull(root);
            }

            public void postCondition() {
                // super.postCondition();
                assertEquals(model.getAgents().get(0).getLabel(), "Test Agent");
                assertEquals(model.getAgents().get(1).getLabel(), "Test SubContext");
                AGroup root = ((AGroup) model.getRootActivity());
                assertEquals(root.getMembers().get(1).getLabel(), "Create Test Agents");
                assertEquals(root.getMembers().get(2).getLabel(), "Create Test SubContexts");
                assertEquals(model.getAttributes().get(0).getLabel(), "Test Agent Count");
                assertEquals(model.getAttributes().get(0).getDescription(), "The number of test agents to create.");
                assertEquals(model.getAttributes().get(1).getLabel(), "Test SubContext Count");
            }
        });
        // cmds.add(new
        // SetTransformer(MetaABMPackage.Literals.SIMPLEMENTATION__MODE,
        // SImplementationMode.LOAD_LITERAL) {
        // public IID getIID() {
        // return model.getImplementation();
        // }
        // public void addPrePost(List<PrePostCondition> list) {
        // super.addPrePost(list);
        // list.add(new NewAgentGenCondition() {
        // public void preCondition() {}
        // });
        // list.add(new NewSubcontextGenCondition() {
        // public void preCondition() {}
        // });
        // }
        //
        // public void preCondition() {
        // super.preCondition();
        // assertEquals(model.getAgents().get(0).getLabel(), "Test Agent");
        // assertEquals(model.getAgents().get(1).getLabel(), "Test SubContext");
        // CommandTest.assertEquals(model.getAttributes().size(), 2);
        // }
        //
        // public void postCondition() {
        // super.postCondition();
        // assertEquals(model.getAgents().get(0).getLabel(), "Test Agent");
        // assertEquals(model.getAgents().get(1).getLabel(), "Test SubContext");
        // CommandTest.assertNull(model.getRootActivity());
        // CommandTest.assertEquals(model.getAttributes().size(), 0);
        // }
        // });
        executeTests(cmds);
    }

    public static void buildLoadAgents(List<CommandTransformer> cmds) {
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return SetCommand.create(getDomain(), model.getImplementation(),
                                MetaABMPackage.Literals.SIMPLEMENTATION__MODE, SImplementationMode.LOAD_LITERAL,
                                CommandParameter.NO_INDEX);
            }

            public void preCondition() {
                CommandTest.assertNotNull(model.getRootActivity());
            }

            public void postCondition() {
                CommandTest.assertNotNull(model.getRootActivity());
            }
        });
        cmds.add(new CreateAgents() {
            public void postCondition() {
                CommandTest.assertEquals(model.getAgents().get(0).getLabel(), "Root Context Agent");
                CommandTest.assertEquals(model.getAttributes().size(), 0);
                CommandTest.assertNotNull(model.getRootActivity());
            }
        });
        cmds.add(new CreateSubcontext() {
            public void postCondition() {
                CommandTest.assertEquals(model.getAgents().get(1).getLabel(), "Root Context Context");
                CommandTest.assertEquals(model.getAttributes().size(), 0);
                CommandTest.assertNotNull(model.getRootActivity());
            }
        });
    }

}
