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
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.metaabm.MetaABMFactory;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;
import org.metaabm.SState;

public class StateTest extends CommandTest {

    public StateTest() {
        super("Test Agent State Behaviors");
    }

    public void testAddStates() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildRoot(cmds);
        ModelConstructionCommandTest.buildAgents(cmds);
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return AddCommand.create(getDomain(), agent0(), MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES,
                                MetaABMFactory.eINSTANCE.createSState());
            }

            private SAgent agent0() {
                return getModel().getAgents().get(0);
            }

            public void preCondition() {
                assertEquals(agent0().getAttributes().size(), 0);
            }

            public void postCondition() {
                assertEquals(agent0().getAttributes().size(), 1);
                assertTrue(agent0().getAttributes().get(0) instanceof SState);
                assertEquals(((SState) agent0().getAttributes().get(0)).getOptions().size(), 0);
                assertEquals(((SState) agent0().getAttributes().get(0)).getOptions().size(), 0);
            }
        });
        buildStateOptions(cmds);
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return RemoveCommand.create(getDomain(), ((SState) agent0().getAttributes().get(0)),
                                MetaABMPackage.Literals.SSTATE__OPTIONS, ((SState) agent0().getAttributes().get(0))
                                                .getOptions().get(1));
            }

            private SAgent agent0() {
                return getModel().getAgents().get(0);
            }

            public void postCondition() {
                assertEquals(((SState) agent0().getAttributes().get(0)).getOptions().size(), 1);
                assertEquals(((SState) agent0().getAttributes().get(0)).getDefaultOption(), null);
                assertEquals(((SState) agent0().getAttributes().get(0)).getDefaultValue(), null);
            }
        });
        executeTests(cmds);
    }

    public static void buildStateOptions(List<CommandTransformer> cmds) {
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return AddCommand.create(getDomain(), ((SState) agent0().getAttributes().get(0)),
                                MetaABMPackage.Literals.SSTATE__OPTIONS, MetaABMFactory.eINSTANCE.createSStateValue());
            }

            private SAgent agent0() {
                return getModel().getAgents().get(0);
            }

            public void preCondition() {
                assertEquals(((SState) agent0().getAttributes().get(0)).getOptions().size(), 0);
            }

            public void postCondition() {
                assertEquals(((SState) agent0().getAttributes().get(0)).getOptions().size(), 1);
                assertEquals(((SState) agent0().getAttributes().get(0)).getDefaultOption(), null);
                assertEquals(((SState) agent0().getAttributes().get(0)).getDefaultValue(), null);
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return AddCommand.create(getDomain(), ((SState) agent0().getAttributes().get(0)),
                                MetaABMPackage.Literals.SSTATE__OPTIONS, MetaABMFactory.eINSTANCE.createSStateValue());
            }

            private SAgent agent0() {
                return getModel().getAgents().get(0);
            }

            public void postCondition() {
                assertEquals(((SState) agent0().getAttributes().get(0)).getOptions().size(), 2);
                assertEquals(((SState) agent0().getAttributes().get(0)).getDefaultOption(), null);
                assertEquals(((SState) agent0().getAttributes().get(0)).getDefaultValue(), null);
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return SetCommand.create(getDomain(), ((SState) agent0().getAttributes().get(0)).getOptions().get(0),
                                MetaABMPackage.Literals.IID__LABEL, "State 0");
            }

            private SAgent agent0() {
                return getModel().getAgents().get(0);
            }

            public void postCondition() {
                assertEquals(((SState) agent0().getAttributes().get(0)).getOptions().get(0).getLabel(), "State 0");
                assertEquals(((SState) agent0().getAttributes().get(0)).getOptions().get(0).getID(), "state0");
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return SetCommand.create(getDomain(), ((SState) agent0().getAttributes().get(0)).getOptions().get(1),
                                MetaABMPackage.Literals.IID__LABEL, "State 1");
            }

            private SAgent agent0() {
                return getModel().getAgents().get(0);
            }

            public void postCondition() {
                assertEquals(((SState) agent0().getAttributes().get(0)).getOptions().get(1).getLabel(), "State 1");
                assertEquals(((SState) agent0().getAttributes().get(0)).getOptions().get(1).getID(), "state1");
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return SetCommand.create(getDomain(), ((SState) agent0().getAttributes().get(0)),
                                MetaABMPackage.Literals.SSTATE__DEFAULT_OPTION, ((SState) agent0().getAttributes().get(
                                                0)).getOptions().get(1));
            }

            private SAgent agent0() {
                return getModel().getAgents().get(0);
            }

            public void postCondition() {
                assertEquals(((SState) agent0().getAttributes().get(0)).getDefaultOption().getLabel(), "State 1");
                assertEquals(((SState) agent0().getAttributes().get(0)).getDefaultValue(), "State 1");
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return SetCommand.create(getDomain(), ((SState) agent0().getAttributes().get(0)).getOptions().get(1),
                                MetaABMPackage.Literals.IID__LABEL, "Another State");
            }

            private SAgent agent0() {
                return getModel().getAgents().get(0);
            }

            public void postCondition() {
                assertEquals(((SState) agent0().getAttributes().get(0)).getDefaultOption().getLabel(), "Another State");
                assertEquals(((SState) agent0().getAttributes().get(0)).getDefaultValue(), "Another State");
            }
        });
    }

}
