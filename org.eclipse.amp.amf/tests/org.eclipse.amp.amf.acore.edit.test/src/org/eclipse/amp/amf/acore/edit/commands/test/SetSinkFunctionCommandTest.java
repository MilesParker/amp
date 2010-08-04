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
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.metaabm.IValue;
import org.metaabm.MetaABMFactory;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAttribute;
import org.metaabm.SState;
import org.metaabm.SStateValue;
import org.metaabm.act.AInput;
import org.metaabm.act.AMultiValue;
import org.metaabm.act.MetaABMActPackage;
import org.metaabm.function.FFunction;
import org.metaabm.function.FLibrary;

public class SetSinkFunctionCommandTest extends CommandTest {

    public SetSinkFunctionCommandTest(String name) {
        super(name);
    }

    public void testRemoveBasic() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelActsCommandTest.addInputs(cmds);
        buildBasicSpecialFunctions(cmds);
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                CompoundCommand cmd = new CompoundCommand();
                cmd.append(RemoveCommand.create(getDomain(), agentRootAct(),
                                                MetaABMActPackage.Literals.AGROUP__MEMBERS, agQuery()));
                return cmd;
            }

            public void preCondition() {
                assertNotNull(model.findAttribute("ageMinimum"));
                assertNotNull(model.findAttribute("ageMaximum"));
            }

            public void postCondition() {
                assertNull(model.findAttribute("ageMinimum"));
                assertNull(model.findAttribute("ageMaximum"));
            }
        });
        executeTests(cmds);
    }

    public void testCreateNewMulti() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelActsCommandTest.addInputs(cmds);
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                CompoundCommand cmd = new CompoundCommand();
                cmd.append(SetCommand.create(getDomain(), agQuery(), MetaABMPackage.Literals.IID__LABEL, "Wealth"));
                return cmd;
            }

            public void preCondition() {
                assertEquals(agQuery().getInputs().size(), 2);
                assertTrue(agQuery().getInputs().get(0).getValue() instanceof SAttribute);
                assertTrue(agQuery().getInputs().get(1).getValue() instanceof SAttribute);
            }

            public void postCondition() {
                assertEquals(agQuery().getID(), "wealth");
                assertEquals(agQuery().getInputs().size(), 2);
                assertTrue(agQuery().getInputs().get(0).getValue() instanceof SAttribute);
                assertTrue(agQuery().getInputs().get(1).getValue() instanceof SAttribute);
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return SetCommand
                .create(getDomain(), agQuery(), MetaABMActPackage.Literals.ASINK__FUNCTION, uniformD());
            }

            public void preCondition() {
                assertEquals(agQuery().getInputs().size(), 2);
                assertTrue(agQuery().getInputs().get(0).getValue() instanceof SAttribute);
                assertTrue(agQuery().getInputs().get(1).getValue() instanceof SAttribute);
            }

            public void postCondition() {
                assertEquals(agQuery().getID(), "wealth");
                assertEquals(agQuery().getInputs().size(), 3);
                IValue value1 = agQuery().getInputs().get(1).getValue();
                assertNotNull(value1);
                IValue value0 = agQuery().getInputs().get(0).getValue();
                assertTrue(value0 instanceof AMultiValue);
                assertTrue(value1 instanceof AMultiValue);
                IValue value2 = agQuery().getInputs().get(2).getValue();
                assertTrue(value2 instanceof AMultiValue);
                assertEquals(value0.getID(), "wealthStates");
                assertEquals(value1.getID(), "wealthMinimum");
                assertEquals(value2.getID(), "wealthMaximum");
                assertEquals(((AMultiValue) value0).getValues().size(), 0);
                assertEquals(((AMultiValue) value1).getValues().size(), 1);
                assertEquals(((AMultiValue) value2).getValues().size(), 1);
                assertEquals(((AMultiValue) value1).getValues().get(0).getID(), "wealthMinimum");
                assertNotNull(model.findAttribute("wealthMinimum"));
                assertNotNull(model.findAttribute("wealthMaximum"));
                assertNotNull(value1);
            }
        });
        executeTests(cmds);
    }

    public void testChangeFunctionType() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelActsCommandTest.addInputs(cmds);
        buildBasicSpecialFunctions(cmds);
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                CompoundCommand cmd = new CompoundCommand();
                SState sState = MetaABMFactory.eINSTANCE.createSState();
                cmd.appendAndExecute(AddCommand.create(getDomain(), memAgent(),
                                                       MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES, sState));
                cmd.appendAndExecute(SetCommand
                                     .create(getDomain(), sState, MetaABMPackage.Literals.IID__LABEL, "State"));
                SStateValue createSStateValue = MetaABMFactory.eINSTANCE.createSStateValue();
                cmd.appendAndExecute(AddCommand.create(getDomain(), sState, MetaABMPackage.Literals.SSTATE__OPTIONS,
                                                       createSStateValue));
                cmd.appendAndExecute(SetCommand.create(getDomain(), createSStateValue,
                                                       MetaABMPackage.Literals.IID__LABEL, "Option 0"));
                SStateValue createSStateValue1 = MetaABMFactory.eINSTANCE.createSStateValue();
                cmd.appendAndExecute(AddCommand.create(getDomain(), sState, MetaABMPackage.Literals.SSTATE__OPTIONS,
                                                       createSStateValue1));
                cmd.appendAndExecute(SetCommand.create(getDomain(), createSStateValue1,
                                                       MetaABMPackage.Literals.IID__LABEL, "Option 1"));
                cmd.appendAndExecute(SetCommand.create(getDomain(), sState,
                                                       MetaABMPackage.Literals.SSTATE__DEFAULT_OPTION, createSStateValue1));
                return cmd;
            }

            public void postCondition() {
                SAttribute sState = memAgent().findAttribute("state");
                assertEquals(((SState) sState).getOptions().size(), 2);
                assertEquals(((SState) sState).getDefaultOption().getID(), "option1");
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                AInput input0 = agQuery().getInputs().get(0);
                assertNotNull(input0);
                SAttribute state = memAgent().findAttribute("state");
                assertNotNull(state);
                return AddCommand.create(getDomain(), input0.getValue(),
                                         MetaABMActPackage.Literals.AMULTI_VALUE__VALUES, state);
            }

            public void preCondition() {
                SAttribute sState = memAgent().findAttribute("state");
                assertEquals(((SState) sState).getOptions().size(), 2);
                assertEquals(((SState) sState).getDefaultOption().getID(), "option1");
                assertNull(model.findAttribute("state"));
                assertNotNull(model.findAttribute("ageMaximum"));
            }

            public void postCondition() {
                assertEquals(agQuery().getInputs().size(), 3);
                AMultiValue multi0 = (AMultiValue) agQuery().getInputs().get(0).getValue();
                assertEquals(multi0.getValues().get(0).getID(), "state");
                AMultiValue multi1 = (AMultiValue) agQuery().getInputs().get(1).getValue();
                assertEquals(multi1.getID(), "ageMinimum");
                AMultiValue multi2 = (AMultiValue) agQuery().getInputs().get(2).getValue();
                assertEquals(multi1.getValues().size(), 3);
                assertEquals(multi1.getValues().get(0).getID(), "ageMinimumBase");
                assertEquals(multi1.getValues().get(1).getID(), "ageOption0Minimum");
                assertEquals(multi1.getValues().get(2).getID(), "ageOption1Minimum");
                assertEquals(model.getAttributes().get(3).getID(), "ageMinimumBase");
                assertEquals(model.getAttributes().get(5).getID(), "ageOption0Minimum");
                assertEquals(model.getAttributes().get(7).getID(), "ageOption1Minimum");
                assertNotNull(model.findAttribute("ageOption0Minimum"));
                assertNotNull(model.findAttribute("ageOption1Minimum"));
                // assertEquals(model.findAttribute("ageOption1Minimum").
                // getAccessors().size(), 1);
                assertEquals(multi1.getLabel(), "Age Minimum");
                assertEquals(multi2.getLabel(), "Age Maximum");
                assertEquals(multi2.getValues().size(), 3);
                assertEquals(multi1.getValues().size(), 3);
                assertEquals(multi1.getValues().get(0).getID(), "ageMinimumBase");
                assertEquals(multi2.getValues().get(0).getID(), "ageMaximumBase");
                assertEquals(multi2.getValues().get(1).getID(), "ageOption0Maximum");
                assertNull(model.findAttribute("ageMinimum"));
                assertNull(model.findAttribute("ageMaximum"));
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                CompoundCommand cmd = new CompoundCommand();
                SState sState = MetaABMFactory.eINSTANCE.createSState();
                cmd.appendAndExecute(AddCommand.create(getDomain(), memAgent(),
                                                       MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES, sState));
                cmd.appendAndExecute(SetCommand.create(getDomain(), sState, MetaABMPackage.Literals.IID__LABEL,
                "State 2"));
                SStateValue createSStateValue = MetaABMFactory.eINSTANCE.createSStateValue();
                cmd.appendAndExecute(AddCommand.create(getDomain(), sState, MetaABMPackage.Literals.SSTATE__OPTIONS,
                                                       createSStateValue));
                cmd.appendAndExecute(SetCommand.create(getDomain(), createSStateValue,
                                                       MetaABMPackage.Literals.IID__LABEL, "State 2 Option 0"));
                SStateValue createSStateValue1 = MetaABMFactory.eINSTANCE.createSStateValue();
                cmd.appendAndExecute(AddCommand.create(getDomain(), sState, MetaABMPackage.Literals.SSTATE__OPTIONS,
                                                       createSStateValue1));
                cmd.appendAndExecute(SetCommand.create(getDomain(), createSStateValue1,
                                                       MetaABMPackage.Literals.IID__LABEL, "State 2 Option 1"));
                cmd.appendAndExecute(SetCommand.create(getDomain(), sState,
                                                       MetaABMPackage.Literals.SSTATE__DEFAULT_OPTION, createSStateValue1));
                return cmd;
            }

            public void postCondition() {
                SAttribute sState = memAgent().findAttribute("state2");
                assertEquals(((SState) sState).getOptions().size(), 2);
                assertEquals(((SState) sState).getDefaultOption().getID(), "state2Option1");
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                AInput input0 = agQuery().getInputs().get(0);
                assertNotNull(input0);
                SAttribute state = memAgent().findAttribute("state2");
                assertNotNull(state);
                return AddCommand.create(getDomain(), input0.getValue(),
                                         MetaABMActPackage.Literals.AMULTI_VALUE__VALUES, state);
            }

            public void preCondition() {
                assertEquals(model.getAttributes().size(), 9);
                AMultiValue multi1 = (AMultiValue) agQuery().getInputs().get(1).getValue();
                assertEquals(multi1.getValues().size(), 3);
                assertEquals(multi1.getValues().get(0).getID(), "ageMinimumBase");
                assertEquals(model.getAttributes().get(5).getID(), "ageOption0Minimum");
                AMultiValue multi2 = (AMultiValue) agQuery().getInputs().get(2).getValue();
                assertEquals(multi2.getValues().get(0).getID(), "ageMaximumBase");
                assertEquals(multi2.getValues().get(1).getID(), "ageOption0Maximum");
            }

            public void postCondition() {
                assertEquals(model.getAttributes().size(), 13);
                assertEquals(agQuery().getInputs().size(), 3);
                AMultiValue multi0 = (AMultiValue) agQuery().getInputs().get(0).getValue();
                assertEquals(multi0.getValues().size(), 2);
                assertEquals(multi0.getValues().get(0).getID(), "state");
                assertEquals(multi0.getValues().get(1).getID(), "state2");
                AMultiValue multi2 = (AMultiValue) agQuery().getInputs().get(2).getValue();
                assertEquals(multi2.getValues().size(), 5);
                assertEquals(multi2.getValues().get(0).getID(), "ageMaximumBase");
                assertEquals(multi2.getValues().get(1).getID(), "ageOption0Maximum");
                assertEquals(multi2.getValues().get(2).getID(), "ageOption1Maximum");
                assertEquals(multi2.getValues().get(3).getID(), "ageState2Option0Maximum");
                assertEquals(multi2.getValues().get(4).getID(), "ageState2Option1Maximum");
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                CompoundCommand cmd = new CompoundCommand();
                cmd.append(SetCommand.create(getDomain(), agQuery(), MetaABMPackage.Literals.IID__LABEL, "Happiness"));
                return cmd;
            }

            public void preCondition() {
                AMultiValue multi2 = (AMultiValue) agQuery().getInputs().get(2).getValue();
                assertEquals(multi2.getValues().size(), 5);
                assertEquals(multi2.getValues().get(0).getID(), "ageMaximumBase");
                assertEquals(multi2.getValues().get(1).getID(), "ageOption0Maximum");
                assertEquals(multi2.getValues().get(2).getID(), "ageOption1Maximum");
                assertEquals(multi2.getValues().get(3).getID(), "ageState2Option0Maximum");
                assertEquals(multi2.getValues().get(4).getID(), "ageState2Option1Maximum");
            }

            public void postCondition() {
                AMultiValue multi2 = (AMultiValue) agQuery().getInputs().get(2).getValue();
                assertEquals(multi2.getValues().size(), 5);
                assertEquals(multi2.getValues().get(0).getID(), "happinessMaximumBase");
                assertEquals(multi2.getValues().get(1).getID(), "happinessOption0Maximum");
                assertEquals(multi2.getValues().get(2).getID(), "happinessOption1Maximum");
                assertEquals(multi2.getValues().get(3).getID(), "happinessState2Option0Maximum");
                assertEquals(multi2.getValues().get(4).getID(), "happinessState2Option1Maximum");
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                AInput input0 = agQuery().getInputs().get(0);
                assertNotNull(input0);
                SAttribute state = memAgent().findAttribute("state");
                assertNotNull(state);
                return RemoveCommand.create(getDomain(), input0.getValue(),
                                            MetaABMActPackage.Literals.AMULTI_VALUE__VALUES, state);
            }

            public void preCondition() {
                assertEquals(model.getAttributes().size(), 13);
                AMultiValue multi2 = (AMultiValue) agQuery().getInputs().get(2).getValue();
                assertEquals(multi2.getValues().size(), 5);
                assertEquals(multi2.getValues().get(0).getID(), "happinessMaximumBase");
                assertEquals(multi2.getValues().get(1).getID(), "happinessOption0Maximum");
                assertEquals(multi2.getValues().get(2).getID(), "happinessOption1Maximum");
                assertEquals(multi2.getValues().get(3).getID(), "happinessState2Option0Maximum");
                assertEquals(multi2.getValues().get(4).getID(), "happinessState2Option1Maximum");
            }

            public void postCondition() {
                assertEquals(model.getAttributes().size(), 9);
                AMultiValue multi0 = (AMultiValue) agQuery().getInputs().get(0).getValue();
                assertEquals(multi0.getValues().size(), 1);
                assertEquals(multi0.getValues().get(0).getID(), "state2");
                AMultiValue multi2 = (AMultiValue) agQuery().getInputs().get(2).getValue();
                assertEquals(multi2.getValues().size(), 3);
                assertEquals(multi2.getValues().get(1).getID(), "happinessState2Option0Maximum");
                assertEquals(multi2.getValues().get(2).getID(), "happinessState2Option1Maximum");

                // SAttribute stateAttribute = model.findAttribute("happinessState2Option0Maximum");
                // // TODO should this work?
                // assertEquals(stateAttribute.getAccessors().size(), 1);
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                CompoundCommand cmd = new CompoundCommand();
                cmd.append(RemoveCommand.create(getDomain(), agentRootAct(),
                                                MetaABMActPackage.Literals.AGROUP__MEMBERS, agQuery()));
                return cmd;
            }

            public void preCondition() {
                assertNotNull(agentRootAct().findMember("happiness"));
                assertEquals(model.getAttributes().size(), 9);
                SAttribute stateAttribute = model.findAttribute("happinessState2Option0Maximum");
                assertNotNull(stateAttribute);
                // TODO this should work, but isn't critical
                // assertEquals(stateAttribute.getAccessors().size(), 1);
                assertNotNull(model.findAttribute("happinessState2Option1Maximum"));
            }

            public void postCondition() {
                assertNull(agentRootAct().findMember("happiness"));
                assertNull(model.findAttribute("maximumHappinessState2Option0"));
                assertNull(model.findAttribute("maximumHappinessState2Option1"));
                assertEquals(model.getAttributes().size(), 3);
            }
        });
        executeTests(cmds);
    }

    private void buildBasicSpecialFunctions(List<CommandTransformer> cmds) {
        // cmds.add(new CommandTransformer() {
        // public Command getCommand() {
        // final FLibrary library = (FLibrary) lib.getLibrary().get(0);
        // final FLibrary funcNum = library.findSub("math");
        // final FFunction funcItem = funcNum.findFunction("IEEEremainder");
        // assertNotNull(funcItem);
        // Command setFunctionCmd = SetCommand.create(getDomain(), agQuery(),
        // MetaABMActPackage.Literals.ASINK__FUNCTION, funcItem);
        // return setFunctionCmd;
        // }
        //
        // public void preCondition() {
        // assertEquals(agQuery().getInputs().size(), 2);
        // assertNotNull(agQuery().getInputs().get(0).getValue());
        // assertNotNull(agQuery().getInputs().get(1).getValue());
        // assertEquals(agQuery().getID(),
        // "rootContextAgentRuleAgentAEqualRootCQuery");
        // assertNotNull(model.getAgents().get(0).findAttribute("agentA"));
        // assertNotNull(model.findAttribute("rootC"));
        // assertEquals(agQuery().getInputs().get(0).getValue().getID(),
        // "agentA");
        // assertNotNull(agQuery().getInputs().get(1).getValue());
        // assertEquals(agQuery().getInputs().get(1).getValue().getID(),
        // "rootC");
        // }
        //
        // public void postCondition() {
        // assertEquals(agQuery().getInputs().size(), 2);
        // assertNull(agQuery().getInputs().get(0).getValue());
        // assertNull(agQuery().getInputs().get(1).getValue());
        // assertNotNull(model.getAgents().get(0).findAttribute("agentA"));
        // assertNotNull(model.findAttribute("rootC"));
        // assertEquals(agQuery().getID(),
        // "rootContextAgentRuleRemainderQuery");
        // }
        // });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                CompoundCommand cmd = new CompoundCommand();
                cmd.append(SetCommand.create(getDomain(), agQuery(), MetaABMPackage.Literals.IID__LABEL, "Wealth"));
                return cmd;
            }

            public void preCondition() {
            }

            public void postCondition() {
                assertEquals(agQuery().getID(), "wealth");
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return SetCommand
                .create(getDomain(), agQuery(), MetaABMActPackage.Literals.ASINK__FUNCTION, uniformD());
            }

            public void preCondition() {
                assertNotNull(model.findAttribute("rootC"));
                assertEquals(model.getAttributes().size(), 3);
            }

            public void postCondition() {
                assertEquals(agQuery().getInputs().size(), 3);
                assertNotNull(agQuery().getInputs().get(0) instanceof AMultiValue);
                assertNotNull(agQuery().getInputs().get(1) instanceof AMultiValue);
                assertNotNull(agQuery().getInputs().get(2) instanceof AMultiValue);
                assertEquals(model.getAttributes().size(), 5);
                assertNotNull(model.findAttribute("rootC"));
                assertEquals(model.getAttributes().get(4).getID(), "wealthMaximum");
                assertEquals(model.getAttributes().get(3).getID(), "wealthMinimum");
                assertNotNull(model.findAttribute("wealthMaximum"));
                assertNotNull(model.findAttribute("wealthMinimum"));
                assertEquals(((AMultiValue) agQuery().getInputs().get(1).getValue()).getValues().get(0).getID(),
                "wealthMinimum");
                assertEquals(((AMultiValue) agQuery().getInputs().get(2).getValue()).getValues().get(0).getID(),
                "wealthMaximum");
                // assertEquals(agQuery().getInputs().get(2).getValue().getID(),
                // "wealthMaximum");
                assertEquals(agQuery().getID(), "wealth");
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                CompoundCommand cmd = new CompoundCommand();
                cmd.append(SetCommand.create(getDomain(), agQuery(), MetaABMPackage.Literals.IID__LABEL, "Age"));
                return cmd;
            }

            public void preCondition() {
                AMultiValue multiValue1 = (AMultiValue) agQuery().getInputs().get(1).getValue();
                assertEquals(multiValue1.getValues().get(0).getLabel(), "Wealth Minimum");
                AMultiValue multiValue2 = (AMultiValue) agQuery().getInputs().get(2).getValue();
                assertEquals(multiValue2.getValues().get(0).getLabel(), "Wealth Maximum");
                assertEquals(multiValue1.getLabel(), "Wealth Minimum");
                assertEquals(multiValue1.getID(), "wealthMinimum");
                assertEquals(agQuery().getInputs().get(2).getValue().getLabel(), "Wealth Maximum");
                assertEquals(agQuery().getInputs().get(2).getValue().getID(), "wealthMaximum");
            }

            public void postCondition() {
                AMultiValue multiValue1 = (AMultiValue) agQuery().getInputs().get(1).getValue();
                assertEquals(multiValue1.getValues().get(0).getLabel(), "Age Minimum");
                AMultiValue multiValue2 = (AMultiValue) agQuery().getInputs().get(2).getValue();
                assertEquals(multiValue2.getValues().get(0).getLabel(), "Age Maximum");
                assertEquals(multiValue1.getLabel(), "Age Minimum");
                assertEquals(multiValue1.getID(), "ageMinimum");
                assertEquals(agQuery().getInputs().get(1).getValue().getLabel(), "Age Minimum");
                assertEquals(agQuery().getInputs().get(1).getValue().getID(), "ageMinimum");
                assertEquals(agQuery().getInputs().get(2).getValue().getLabel(), "Age Maximum");
                assertEquals(agQuery().getInputs().get(2).getValue().getID(), "ageMaximum");
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                final FLibrary library = (FLibrary) lib.getLibrary().get(0);
                final FLibrary funcNum = library.findSub("operators").findSub("logicalOperators");
                final FFunction funcEq = funcNum.findFunction("equal");
                CompoundCommand cmd = new CompoundCommand();
                cmd.append(SetCommand
                           .create(getDomain(), agQuery(), MetaABMActPackage.Literals.ASINK__FUNCTION, funcEq));
                return cmd;
            }

            public void preCondition() {
                assertNotNull(model.findAttribute("ageMinimum"));
            }

            public void postCondition() {
                assertEquals(agQuery().getInputs().size(), 2);
                assertEquals(agQuery().getInputs().get(0).getValue(), null);
                assertEquals(agQuery().getInputs().get(1).getValue(), null);
                assertNull(model.findAttribute("ageMinimum"));
                assertNull(model.findAttribute("ageMaximum"));
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                CompoundCommand cmd = new CompoundCommand();
                cmd.append(SetCommand.create(getDomain(), agQuery(), MetaABMActPackage.Literals.ASINK__FUNCTION,
                                             uniformD()));
                return cmd;
            }

            public void preCondition() {
                assertNull(model.findAttribute("ageMinimum"));
                assertNull(model.findAttribute("ageMaximum"));
            }

            public void postCondition() {
                assertEquals(agQuery().getInputs().get(0).getValue().getID(), "ageStates");
                assertNotNull(model.findAttribute("ageMinimum"));
                assertNotNull(model.findAttribute("ageMaximum"));
            }
        });
    }

    public FFunction uniformD() {
        final FLibrary library = (FLibrary) lib.getLibrary().get(0);
        final FLibrary funcNum = library.findSub("distribution");
        final FFunction funcItem = funcNum.findFunction("uniformCrossDistribution");
        return funcItem;
    }
}
