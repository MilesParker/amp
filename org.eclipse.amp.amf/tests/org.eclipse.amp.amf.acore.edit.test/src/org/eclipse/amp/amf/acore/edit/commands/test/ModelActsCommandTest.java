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
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;

import org.metaabm.IID;
import org.metaabm.MetaABMFactory;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAttribute;
import org.metaabm.act.AAct;
import org.metaabm.act.AAll;
import org.metaabm.act.AAny;
import org.metaabm.act.AEvaluate;
import org.metaabm.act.AInput;
import org.metaabm.act.ALiteral;
import org.metaabm.act.AMove;
import org.metaabm.act.ANone;
import org.metaabm.act.AQuery;
import org.metaabm.act.ASchedule;
import org.metaabm.act.ASelect;
import org.metaabm.act.ASet;
import org.metaabm.act.MetaABMActFactory;
import org.metaabm.act.MetaABMActPackage;
import org.metaabm.function.FFunction;
import org.metaabm.function.FLibrary;
import org.metaabm.function.FOperator;

public class ModelActsCommandTest extends CommandTest {

    public ModelActsCommandTest(String name) {
        super(name);
    }

    public void testAddActs() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildRoot(cmds);
        ModelConstructionCommandTest.buildAgents(cmds);
        buildActs(cmds);
        executeTests(cmds);
    }

    public void testSimpleSinkInputs() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildRoot(cmds);
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return AddCommand.create(getDomain(), rootAct(), MetaABMActPackage.Literals.AGROUP__MEMBERS,
                                         MetaABMActFactory.eINSTANCE.createARule());
            }

            public void preCondition() {
                assertEquals(rootAct().getMembers().size(), 0);
                assertEquals(rootAct().getRoots().size(), 0);
                assertNull(rootAct().findMember(getRuleID()));
            }

            public void postCondition() {
                assertEquals(rootAct().getRoots().get(0).getLabel(), "Root Context Rule");
                assertNotNull(rootAct().findMember(getRuleID()));
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return AddCommand.create(getDomain(), rootAct().findMember(getRuleID()),
                                         MetaABMActPackage.Literals.AACT__TARGETS, MetaABMActFactory.eINSTANCE
                                         .createAQuery());
            }

            public void preCondition() {
                assertEquals(rootAct().getMembers().size(), 1);
                assertEquals(rootAct().getRoots().size(), 1);
                assertNull(rootAct().findMember("_Unspecified_"));
            }

            public void postCondition() {
                AQuery query = (AQuery) rootAct().findMember("_Unspecified_Query");
                assertNotNull(query);
                assertEquals(query.getInputs().size(), 0);
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {

                return SetCommand.create(getDomain(), rootAct().findMember("_Unspecified_Query"),
                                         MetaABMActPackage.Literals.ASINK__FUNCTION, funcEq);
            }

            public void preCondition() {
                assertEquals(rootAct().getMembers().size(), 2);
                assertNotNull(rootAct().findMember("_Unspecified_Query"));
                assertNull(rootAct().findMember("_Unspecified_equal"));
            }

            public void postCondition() {
                assertEquals(rootAct().getMembers().get(1).getID(), "equalQuery");
                AQuery andQuery = (AQuery) rootAct().findMember("equalQuery");
                assertNotNull(andQuery);
                assertEquals(andQuery.getInputs().size(), 2);
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {

                return SetCommand.create(getDomain(), rootAct().findMember("equalQuery"),
                                         MetaABMActPackage.Literals.ASINK__FUNCTION, funcNot);
            }

            public void preCondition() {

                assertNotNull(rootAct().findMember("equalQuery"));
                assertNull(rootAct().findMember("notQuery"));
            }

            public void postCondition() {

                assertNotNull(rootAct().findMember("notQuery"));
                assertNull(rootAct().findMember("equalQuery"));
                AQuery notQuery = (AQuery) rootAct().findMember("notQuery");
                assertNotNull(notQuery);
                assertEquals(notQuery.getInputs().size(), 1);
            }
        });
        executeTests(cmds);
    }

    public void testSinkInputs() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildRoot(cmds);
        ModelConstructionCommandTest.buildAgents(cmds);
        buildActs(cmds);
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                assertNotNull(rootAct().getMembers().get(6));
                SAttribute attrA = MetaABMFactory.eINSTANCE.createSAttribute();
                attrA.setLabel("A");
                return AddCommand.create(getDomain(), model, MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES, attrA);
            }

            public void postCondition() {
                assertNotNull(model.findAttribute("a"));
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                AQuery query = (AQuery) rootAct().getMembers().get(6);
                SAttribute attrA = model.findAttribute("a");
                assertNotNull(attrA);
                AInput input = MetaABMActFactory.eINSTANCE.createAInput();
                input.setValue(attrA);
                Command createCMD = AddCommand.create(getDomain(), query, MetaABMActPackage.Literals.ASINK__INPUTS,
                                                      input);
                return createCMD;
            }

            public void preCondition() {
                AQuery query = (AQuery) rootAct().getMembers().get(6);
                assertEquals(query.getInputs().size(), 0);
                assertNotNull(model.findAttribute("a"));
            }

            public void postCondition() {
                AAct sch = rootAct().getMembers().get(5);
                AQuery query = (AQuery) rootAct().getMembers().get(6);
                SAttribute attrA = model.findAttribute("a");
                assertEquals(query.getSelected(), sch);
                assertNotNull(attrA);
                assertEquals(query.getInputs().size(), 1);
                AInput input = query.getInputs().get(0);
                assertTrue(input.getSelected() == sch);
                assertTrue(input.getSink() == query);
                assertTrue(input.getValue() == attrA);
                assertTrue(input.getValue() == attrA);
            }
        });
        // cmds.add(new CommandTransformer() {
        // public Command getCommand() {
        // AQuery query = (AQuery) rootAct().getMembers().get(6);
        // assertNotNull(query.getInputs().get(0));
        // SAttribute attrA = model.findAttribute("a");
        // return RemoveCommand.create(getDomain(), model,
        // MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES, attrA);
        // }
        //
        // public void preCondition() {
        // assertNotNull(model.findAttribute("a"));
        // }
        //
        // public void postCondition() {
        // assertNull(model.findAttribute("a"));
        // AQuery query = (AQuery) rootAct().getMembers().get(6);
        // assertEquals(query.getInputs().size(), 1);
        // // assertNull(query.getInputs().get(0).getValue());
        // }
        // });
        executeTests(cmds);
    }

    public void testAgentSinkInputsRemoveAgentAttr() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        addInputs(cmds);
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return RemoveCommand.create(getDomain(), memAgent(), MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES,
                                            agAttr(0));
            }

            public void preCondition() {
                assertEquals(memAgent().getAttributes().size(), 1);
                assertEquals(memAgent().getAttributes().get(0).getAccessors().size(), 1);
                assertEquals(memAgent().getAttributes().get(0), agQuery().getInputs().get(0).getValue());
                assertEquals(agQuery().getInputs().get(0).getValue(), agAttr(0));
                assertEquals(((SAttribute) agQuery().getInputs().get(0).getValue()).getOwner(), memAgent());
            }

            public void postCondition() {
                assertEquals(memAgent().getAttributes().size(), 0);
                assertNull(agQuery().getInputs().get(0).getValue());
            }
        });
        executeTests(cmds);
    }

    public void testAgentSinkInputsRemoveContextAttr() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        addInputs(cmds);
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                SAttribute findAttribute = model.findAttribute("rootC");
                return RemoveCommand.create(getDomain(), model, MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES,
                                            findAttribute);
            }

            public void preCondition() {
                SAttribute findAttribute = model.findAttribute("rootC");
                assertEquals(agQuery().getID(), "agentAEqualRootCQuery");
                AQuery query = (AQuery) agentRootAct().findMember("agentAEqualRootCQuery");
                assertNotNull(query);
                assertEquals(model.getAttributes().size(), 3);
                assertEquals(findAttribute.getAccessors().size(), 1);
                assertEquals(findAttribute.getID(), "rootC");
                assertEquals(agQuery().getInputs().get(0).getValue(), agAttr(0));
                assertEquals(agQuery().getInputs().get(1).getValue(), attr(2));
                assertEquals(((SAttribute) agQuery().getInputs().get(1).getValue()).getOwner(), model);
            }

            public void postCondition() {
                assertNull(model.findAttribute("rootC"));
                assertEquals(agQuery().getID(), "agentAEqualQuery");
                AQuery query = (AQuery) agentRootAct().findMember("agentAEqualQuery");
                assertNotNull(query);
                AInput delInput = query.getInputs().get(1);
                assertNull(delInput.getValue());
                assertEquals(query.getInputs().get(0).getValue(), memAgent().getAttributes().get(0));
                assertEquals(delInput.getValue(), null);
            }
        });
        executeTests(cmds);
    }

    public void testAgentSinkInputsRemoveAgentTargetRule() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        addInputs(cmds);
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return RemoveCommand.create(getDomain(), agentRootAct().getMembers().get(0),
                                            MetaABMActPackage.Literals.AACT__TARGETS, agentRootAct().getMembers()
                                            .get(1));
            }

            public void preCondition() {
                assertEquals(memAgent().getAttributes().size(), 1);
                assertEquals(memAgent().getAttributes().get(0).getAccessors().size(), 1);
                assertEquals(agQuery().getInputs().get(0).getValue(), agAttr(0));
                assertEquals(agQuery().getInputs().get(1).getValue(), attr(2));
                assertEquals(((SAttribute) agQuery().getInputs().get(0).getValue()).getOwner(), memAgent());
            }

            public void postCondition() {
                assertEquals(memAgent().getAttributes().size(), 1);
                assertEquals(agentRootAct().getMembers().size(), 1);
                assertEquals(memAgent().getAttributes().get(0).getAccessors().size(), 0);
            }
        });
        executeTests(cmds);
    }

    public void testAgentSinkDeleteAgentTargetRule() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        addInputs(cmds);
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                Command delCMD = DeleteCommand.create(getDomain(), agentRootAct().getMembers().get(1));
                assertTrue(delCMD.canExecute());
                return delCMD;
            }

            public void preCondition() {
                assertEquals(memAgent().getAttributes().size(), 1);
                assertEquals(memAgent().getAttributes().get(0).getAccessors().size(), 1);
                assertEquals(agQuery().getInputs().get(0).getValue(), agAttr(0));
                assertEquals(agQuery().getInputs().get(1).getValue(), attr(2));
                assertEquals(((SAttribute) agQuery().getInputs().get(0).getValue()).getOwner(), memAgent());
                assertEquals(agentRootAct().getMembers().size(), 2);
            }

            public void postCondition() {
                assertEquals(memAgent().getAttributes().size(), 1);
                assertEquals(memAgent().getAttributes().get(0).getAccessors().size(), 0);
                assertEquals(agentRootAct().getMembers().size(), 1);
            }
        });
        executeTests(cmds);
    }

    public void testAgentSinkInputsRemoveAgentMemberRule() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        addInputs(cmds);
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return RemoveCommand.create(getDomain(), agentRootAct(), MetaABMActPackage.Literals.AGROUP__MEMBERS,
                                            agentRootAct().getMembers().get(1));
            }

            public void preCondition() {
                assertEquals(memAgent().getAttributes().size(), 1);
                assertEquals(memAgent().getAttributes().get(0).getAccessors().size(), 1);
                assertEquals(agQuery().getInputs().get(0).getValue(), agAttr(0));
                assertEquals(agQuery().getInputs().get(1).getValue(), attr(2));
                assertEquals(((SAttribute) agQuery().getInputs().get(0).getValue()).getOwner(), memAgent());
            }

            public void postCondition() {
                assertEquals(memAgent().getAttributes().size(), 1);
                assertEquals(agentRootAct().getMembers().size(), 1);
                assertEquals(memAgent().getAttributes().get(0).getAccessors().size(), 0);
            }
        });
        executeTests(cmds);
    }

    public void testAgentSinkInputsRemoveAgent() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        addInputs(cmds);
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return RemoveCommand.create(getDomain(), model, MetaABMPackage.Literals.SCONTEXT__AGENTS, memAgent());
            }

            public void preCondition() {
                assertEquals(model.getAgents().size(), 2);
                assertEquals(model.getAttributes().size(), 3);
                assertEquals(model.getAttributes().get(2).getAccessors().size(), 1);
                assertEquals(agQuery().getInputs().get(0).getValue(), agAttr(0));
                assertEquals(agQuery().getInputs().get(1).getValue(), attr(2));
                assertEquals(((SAttribute) agQuery().getInputs().get(0).getValue()).getOwner(), memAgent());
                assertEquals(attr(2), model.findAttribute("rootC"));
            }

            public void postCondition() {
                assertEquals(model.getAgents().size(), 1);
                assertEquals(model.getAttributes().size(), 2);
                assertEquals(model.getAttributes().get(1), model.findAttribute("rootC"));
                assertEquals(model.getAttributes().get(1).getAccessors().size(), 0);
            }
        });
        executeTests(cmds);
    }

    public static void addInputs(List<CommandTransformer> cmds) {
        ModelConstructionCommandTest.buildRoot(cmds);
        ModelConstructionCommandTest.buildAgents(cmds);
        final FLibrary library = (FLibrary) lib.getLibrary().get(0);
        final FLibrary funcNum = library.findSub("operators").findSub("logicalOperators");
        final FFunction funcEq = funcNum.findFunction("equal");
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return AddCommand.create(getDomain(), agentRootAct(), MetaABMActPackage.Literals.AGROUP__MEMBERS,
                                         MetaABMActFactory.eINSTANCE.createARule());
            }

            public void preCondition() {
                assertEquals(agentRootAct().getMembers().size(), 0);
                assertEquals(agentRootAct().getRoots().size(), 0);
                assertNull(agentRootAct().findMember(getAgentRuleID()));
            }

            public void postCondition() {
                assertEquals(agentRootAct().getRoots().size(), 1);
                assertNotNull(agentRootAct().findMember(getAgentRuleID()));
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return AddCommand.create(getDomain(), agentRootAct().findMember(getAgentRuleID()),
                                         MetaABMActPackage.Literals.AACT__TARGETS, MetaABMActFactory.eINSTANCE
                                         .createAQuery());
            }

            public void preCondition() {
                assertEquals(agentRootAct().getMembers().size(), 1);
                assertEquals(agentRootAct().getRoots().size(), 1);
                assertNull(agentRootAct().findMember("_Unspecified_"));
            }

            public void postCondition() {
                assertEquals(agentRootAct().getMembers().size(), 2);
                assertEquals(agentRootAct().getRoots().size(), 1);
                assertNotNull(agentRootAct().findMember("_Unspecified_Query"));
                AAct rootContextRule = agentRootAct().findMember(getAgentRuleID());
                assertEquals(rootContextRule.getTargets().size(), 1);
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                SAttribute attrA = MetaABMFactory.eINSTANCE.createSAttribute();
                attrA.setLabel("Agent A");
                return AddCommand.create(getDomain(), memAgent(), MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES,
                                         attrA);
            }

            public void postCondition() {
                assertNotNull(memAgent().findAttribute("agentA"));
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                SAttribute rootC = MetaABMFactory.eINSTANCE.createSAttribute();
                rootC.setLabel("Root C");
                return AddCommand.create(getDomain(), model, MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES, rootC);
            }

            public void postCondition() {
                assertNotNull(model.findAttribute("rootC"));
                assertEquals(attr(2), model.findAttribute("rootC"));
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return SetCommand.create(getDomain(), agQuery(), MetaABMActPackage.Literals.ASINK__FUNCTION, funcEq);
            }

            public void preCondition() {
                assertEquals(agQuery().getInputs().size(), 0);
            }

            public void postCondition() {
                assertEquals(agQuery().getInputs().size(), 2);
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return SetCommand.create(getDomain(), agInput(0), MetaABMActPackage.Literals.AINPUT__VALUE, agAttr(0));
            }

            public void preCondition() {
                assertNull(agInput(0).getValue());
                assertEquals(agAttr(0).getAccessors().size(), 0);
            }

            public void postCondition() {
                assertEquals(agInput(0).getValue(), agAttr(0));
                assertEquals(agAttr(0).getAccessors().size(), 1);
                SAttribute attrA = memAgent().findAttribute("agentA");
                assertNotNull(attrA);
                assertTrue(agInput(0).getValue() == attrA);
                assertEquals(agAttr(0).getAccessors().get(0), agInput(0));
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return SetCommand.create(getDomain(), agInput(1), MetaABMActPackage.Literals.AINPUT__VALUE, model
                                         .findAttribute("rootC"));
            }

            public void preCondition() {
                assertNull(agInput(1).getValue());
                assertEquals(attr(0).getAccessors().size(), 1);
                assertEquals(attr(2).getAccessors().size(), 0);
            }

            public void postCondition() {
                assertNotNull(agInput(1).getValue());
                assertEquals(attr(2), model.findAttribute("rootC"));
                assertEquals(attr(2).getAccessors().size(), 1);
                assertEquals(agInput(1).getValue(), attr(2));
                assertEquals(agInput(0), agAttr(0).getAccessors().get(0));
                assertEquals(agQuery().getID(), "agentAEqualRootCQuery");
            }
        });
    }

    public void testSinkLabels() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildRoot(cmds);
        ModelConstructionCommandTest.buildAgents(cmds);
        buildActs(cmds);
        buildAttrQueries(cmds);
        buildLogicAct(cmds);
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                AAct allSource = rootAct().findMember("_NotAQueryAndAAddB_");
                assertNotNull(allSource);
                AAct allFinal = MetaABMActFactory.eINSTANCE.createAAll();
                return AddCommand.create(getDomain(), allSource, MetaABMActPackage.Literals.AACT__TARGETS, allFinal);
            }

            public void postCondition() {
                super.postCondition();
                AAll allFinal = (AAll) rootAct().getMembers().get(11);
                assertEquals(allFinal.getID(), "_And__NotAQueryAndAAddB_");
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                AAct allSource = rootAct().findMember("_NotAQueryOrAAddB_");
                assertNotNull(allSource);
                AAct allFinal = rootAct().findMember("_And__NotAQueryAndAAddB_");
                return AddCommand.create(getDomain(), allSource, MetaABMActPackage.Literals.AACT__TARGETS, allFinal);
            }

            public void postCondition() {
                super.postCondition();
                assertEquals(rootAct().getMembers().size(), 12);
                AAll allFinal = (AAll) rootAct().getMembers().get(11);
                assertEquals(allFinal.getID(),
                "__NotAQueryAndAAddB_And_NotAQueryOrAAddB__");
            }
        });
        cmds.add(new SetLabel("A", "C") {
            public IID getIID() {
                return model.getAttributes().get(2);
            }

            public void postCondition() {
                super.postCondition();
                AAll allFinal = (AAll) rootAct().getMembers().get(11);
                assertEquals(allFinal.getID(),
 "__NotCQueryAndCAddB_And_NotCQueryOrCAddB__");
            }
        });
        executeTests(cmds);
    }

    private static void buildAttrQueries(List<CommandTransformer> cmds) {
        cmds.add(new SetTransformer(MetaABMActPackage.Literals.ASINK__FUNCTION, funcNot) {
            public IID getIID() {
                return rootAct().getMembers().get(6);
            }

            public void preCondition() {
                assertTrue(rootAct().getMembers().get(6) instanceof AQuery);
                AQuery filter = (AQuery) rootAct().getMembers().get(6);
                assertTrue(funcNot instanceof FOperator);
                assertEquals(((FOperator) funcNot).getArity(), 1);
                assertNull(filter.getFunction());
                assertEquals(filter.getLabel(), "[Unspecified]() Query");
                assertEquals(filter.getID(), "_Unspecified_Query");
            }

            public void postCondition() {
                AQuery filter = (AQuery) rootAct().getMembers().get(6);
                assertNotNull(filter.getFunction());
                assertSame(filter.getFunction(), funcNot);
                assertEquals(filter.getID(), "notQuery");
                assertEquals(filter.getInputs().size(), 1);
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                SAttribute attrA = MetaABMFactory.eINSTANCE.createSAttribute();
                attrA.setLabel("A");
                CompoundCommand cmd = new CompoundCommand();
                cmd.append(AddCommand
                           .create(getDomain(), model, MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES, attrA));
                SAttribute attrB = MetaABMFactory.eINSTANCE.createSAttribute();
                attrB.setLabel("B");
                cmd.append(AddCommand
                           .create(getDomain(), model, MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES, attrB));
                return cmd;
            }

            public void postCondition() {
                assertNotNull(model.findAttribute("a"));
                assertNotNull(model.findAttribute("b"));
                assertSame(model.getAttributes().get(2), model.findAttribute("a"));
                assertSame(model.getAttributes().get(3), model.findAttribute("b"));
                AQuery query = (AQuery) rootAct().getMembers().get(6);
                assertEquals(query.getID(), "notQuery");
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                AQuery query = (AQuery) rootAct().getMembers().get(6);
                AInput input = query.getInputs().get(0);
                return SetCommand.create(getDomain(), input, MetaABMActPackage.Literals.AINPUT__VALUE, model
                                         .findAttribute("a"));
            }

            public IID getIID() {
                return rootAct().getMembers().get(6);
            }

            public void preCondition() {
                assertTrue(getIID() instanceof AQuery);
                AQuery query = (AQuery) rootAct().getMembers().get(6);
                AInput input0 = query.getInputs().get(0);
                assertNull(input0.getValue());
                assertNull(input0.getLiteral());
                // assertEquals(input0.getLabel(), "null 0 Input");
                // assertEquals(input0.getID(), "null0Input");
                assertEquals(input0.getValue(), null);
                assertEquals(input0.getLiteral(), null);
                assertEquals(query.getID(), "notQuery");
            }

            public void postCondition() {
                AQuery query = (AQuery) getIID();
                assertNotNull(query.getFunction());
                assertSame(query.getFunction(), funcNot);
                assertEquals(query.getID(), "notAQuery");
                AInput input0 = query.getInputs().get(0);
                SAttribute findAttribute = model.findAttribute("a");
                assertNotNull(findAttribute);
                assertSame(input0.getValue(), findAttribute);
                assertSame(input0.getLiteral(), null);
                assertTrue(findAttribute.getAccessors().contains(input0));
                assertSame(input0.getValue().getLabel(), "A");
                // assertEquals(input0.getLabel(), "A 0 Input");
                // assertEquals(input0.getID(), "a0Input");
            }
        });
        cmds.add(new SetTransformer(MetaABMActPackage.Literals.ASINK__FUNCTION, funcAdd) {
            public IID getIID() {
                return rootAct().getMembers().get(7);
            }

            public void preCondition() {
                AEvaluate eval = (AEvaluate) rootAct().getMembers().get(7);
                assertNull(eval.getFunction());
                assertEquals(eval.getID(), "_Unspecified_");
            }

            public void postCondition() {
                AEvaluate eval = (AEvaluate) rootAct().getMembers().get(7);
                assertNotNull(eval.getFunction());
                assertSame(eval.getFunction(), funcAdd);
                assertEquals(eval.getInputs().size(), 2);
                assertEquals(eval.getID(), "add");
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                CompoundCommand cmd = new CompoundCommand();
                Collection<SAttribute> attrs = new ArrayList<SAttribute>();
                attrs.add(model.findAttribute("a"));
                attrs.add(model.findAttribute("b"));
                List<AInput> inputs = ((AEvaluate) getIID()).getInputs();
                int i = 0;
                for (SAttribute attribute : attrs) {
                    cmd.append(SetCommand.create(getDomain(), inputs.get(i++),
                                                 MetaABMActPackage.Literals.AINPUT__VALUE, attribute));
                }
                return cmd;
            }

            public IID getIID() {
                return rootAct().getMembers().get(7);
            }

            public void preCondition() {
                assertTrue(getIID() instanceof AEvaluate);
                AEvaluate eval = (AEvaluate) rootAct().getMembers().get(7);
                assertEquals(eval.getID(), "add");
            }

            public void postCondition() {
                AEvaluate eval = (AEvaluate) rootAct().getMembers().get(7);
                assertEquals(eval.getInputs().size(), 2);
                assertNotNull(eval.getFunction());
                assertSame(eval.getFunction(), funcAdd);
                assertEquals(eval.getLabel(), "A Add B");
                assertEquals(eval.getID(), "aAddB");
                assertSame(eval.getInputs().get(1).getValue(), model.findAttribute("b"));
            }
        });
    }

    public void testSchedule() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildRoot(cmds);
        ModelConstructionCommandTest.buildAgents(cmds);
        buildActs(cmds);
        cmds.add(new CommandTransformer() {

            public Command getCommand() {
                return SetCommand.create(getDomain(), getIID(), MetaABMActPackage.Literals.ASCHEDULE__INTERVAL, 2);
            }

            public ASchedule getIID() {
                return (ASchedule) rootAct().getMembers().get(5);
            }

            public void preCondition() {
                assertTrue(getIID() instanceof ASchedule);
                assertEquals(getIID().getInterval(), 0);
                assertEquals(getIID().getLabel(), "At 0 Every 0");
                assertEquals(getIID().getID(), getScheduleID());
            }

            public void postCondition() {
                assertEquals(getIID().getInterval(), 2);
                assertEquals(getIID().getLabel(), "At 0 Every 2");
                assertEquals(getIID().getID(), "at0Every2");
            }
        });
        executeTests(cmds);
    }

    public void testAllAnyNone() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildRoot(cmds);
        ModelConstructionCommandTest.buildAgents(cmds);
        buildActs(cmds);
        buildAttrQueries(cmds);
        buildLogicAct(cmds);
        executeTests(cmds);
    }

    private static void buildLogicAct(List<CommandTransformer> cmds) {
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                AAct noneAct = rootAct().findMember("notAQuery");
                assertNotNull(noneAct);
                AAct all = MetaABMActFactory.eINSTANCE.createAAll();
                return AddCommand.create(getDomain(), noneAct, MetaABMActPackage.Literals.AACT__TARGETS, all);
            }

            public void postCondition() {
                super.postCondition();
                AAll all = (AAll) rootAct().getMembers().get(8);
                AAct noneAct = rootAct().findMember("notAQuery");
                assertEquals(all.getSources().get(0), noneAct);
                assertNotNull(all.getSelected());
                assertEquals(all.getSources().get(0).getSelected(), all.getSelected());
                assertEquals(all.getSelected().getLabel(), "At 0 Every 0");
                assertEquals(all.getLabel(), "(&) Not A Query");
                assertEquals(all.getID(), "_And_NotAQuery");
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                AAll allAct = (AAll) rootAct().getMembers().get(8);
                AAct addAct = rootAct().findMember("aAddB");
                assertNotNull(addAct);
                return AddCommand.create(getDomain(), addAct, MetaABMActPackage.Literals.AACT__TARGETS, allAct);
            }

            public void postCondition() {
                super.postCondition();
                AAll all = (AAll) rootAct().getMembers().get(8);
                assertEquals(all.getID(), "_NotAQueryAndAAddB_");
                assertEquals(all.getLabel(), "(Not A Query & A Add B)");
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                AAct noneAct = rootAct().findMember("notAQuery");
                assertNotNull(noneAct);
                AAct any = MetaABMActFactory.eINSTANCE.createAAny();
                return AddCommand.create(getDomain(), noneAct, MetaABMActPackage.Literals.AACT__TARGETS, any);
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                AAny anyAct = (AAny) rootAct().getMembers().get(9);
                AAct addAct = rootAct().findMember("aAddB");
                assertNotNull(addAct);
                return AddCommand.create(getDomain(), addAct, MetaABMActPackage.Literals.AACT__TARGETS, anyAct);
            }

            public void postCondition() {
                super.postCondition();
                AAny anyAct = (AAny) rootAct().getMembers().get(9);
                assertEquals(anyAct.getID(), "_NotAQueryOrAAddB_");
                assertEquals(anyAct.getLabel(), "(Not A Query | A Add B)");
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                AAct notAct = rootAct().findMember("notAQuery");
                assertNotNull(notAct);
                AAct noneAct = MetaABMActFactory.eINSTANCE.createANone();
                return AddCommand.create(getDomain(), notAct, MetaABMActPackage.Literals.AACT__TARGETS, noneAct);
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                ANone noneAct = (ANone) rootAct().getMembers().get(10);
                AAct addAct = rootAct().findMember("aAddB");
                assertNotNull(addAct);
                return AddCommand.create(getDomain(), addAct, MetaABMActPackage.Literals.AACT__TARGETS, noneAct);
            }

            public void postCondition() {
                super.postCondition();
                ANone noneAct = (ANone) rootAct().getMembers().get(10);
                assertEquals(noneAct.getID(), "not__NotAQueryOrAAddB__");
                assertEquals(noneAct.getLabel(), "!((Not A Query | A Add B))");
            }
        });
    }

    public void testRenameSetAttributes() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildBasic(cmds);
        buildActs(cmds);
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return AddCommand.create(getDomain(), model, MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES,
                                         MetaABMFactory.eINSTANCE.createSAttribute());
            }
        });
        cmds.add(new SetLabel("Attribute", "Test Attribute") {
            public IID getIID() {
                return model.getAttributes().get(2);
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                return SetCommand.create(getDomain(), getIID(), MetaABMActPackage.Literals.AACCESSOR__ATTRIBUTE, model
                                         .getAttributes().get(2));
            }

            public IID getIID() {
                return rootAct().getMembers().get(4);
            }

            public void preCondition() {
                assertEquals(getIID().getLabel(), "Set [?] To [?]");
            }

            public void postCondition() {
                assertEquals(getIID().getLabel(), "Set Test Attribute To [?]");
            }
        });
        cmds.add(new SetLabel("Test Attribute", "Another Attribute") {
            public IID getIID() {
                return model.getAttributes().get(2);
            }

            public AAct getAct() {
                return rootAct().getMembers().get(4);
            }

            public void preCondition() {
                assertEquals(getAct().getLabel(), "Set Test Attribute To [?]");
            }

            public void postCondition() {
                assertEquals(getAct().getLabel(), "Set Another Attribute To [?]");
            }
        });
        executeTests(cmds);
    }

    public void testSimpleActs() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildRoot(cmds);
        ModelConstructionCommandTest.buildAgents(cmds);
        cmds.add(new CommandTransformer() {
            public Command getCommand() {

                return AddCommand.create(getDomain(), rootAct(), MetaABMActPackage.Literals.AGROUP__MEMBERS,
                                         MetaABMActFactory.eINSTANCE.createARule());
            }

            public void preCondition() {

                CommandTest.assertEquals(rootAct().getMembers().size(), 3);
                assertEquals(rootAct().getRoots().size(), 1);
                assertNull(rootAct().findMember(getRuleID()));
                assertNotNull(rootAct().findMember("buildRootContext"));
                assertNotNull(rootAct().findMember("createRootContextAgents"));
                assertNotNull(rootAct().findMember("createRootContextContexts"));
            }

            public void postCondition() {

                assertEquals(rootAct().getMembers().size(), 4);
                assertEquals(rootAct().getRoots().size(), 2);
                assertNotNull(rootAct().findMember(getRuleID()));
                assertNotNull(rootAct().findMember("buildRootContext"));
                assertNotNull(rootAct().findMember("createRootContextAgents"));
                assertNotNull(rootAct().findMember("createRootContextContexts"));
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {

                return RemoveCommand.create(getDomain(), rootAct(), MetaABMActPackage.Literals.AGROUP__MEMBERS,
                                            rootAct().findMember(getRuleID()));
            }

            public void preCondition() {

                assertEquals(rootAct().getMembers().size(), 4);
                assertEquals(rootAct().getRoots().size(), 2);
                assertNotNull(rootAct().findMember(getRuleID()));
                assertNotNull(rootAct().findMember("buildRootContext"));
                assertNotNull(rootAct().findMember("createRootContextAgents"));
                assertNotNull(rootAct().findMember("createRootContextContexts"));
            }

            public void postCondition() {

                assertEquals(rootAct().getMembers().size(), 3);
                assertEquals(rootAct().getRoots().size(), 1);
                assertNull(rootAct().findMember(getRuleID()));
                assertNotNull(rootAct().findMember("buildRootContext"));
                assertNotNull(rootAct().findMember("createRootContextAgents"));
                assertNotNull(rootAct().findMember("createRootContextContexts"));
            }
        });
        executeTests(cmds);
    }

    public void testRemoveActs() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildRoot(cmds);
        ModelConstructionCommandTest.buildAgents(cmds);
        buildActs(cmds);
        cmds.add(new CommandTransformer() {
            public Command getCommand() {

                return RemoveCommand.create(getDomain(), rootAct(), MetaABMActPackage.Literals.AGROUP__MEMBERS,
                                            rootAct().findMember("_Unspecified_"));
            }

            public void preCondition() {

                assertEquals(rootAct().getMembers().size(), 8);
                assertEquals(rootAct().getRoots().size(), 3);
                assertNotNull(rootAct().findMember(getScheduleID()));
                assertNotNull(rootAct().findMember("_Unspecified_Query"));
                AAct setTo = rootAct().findMember("setTo");
                AAct schedule = rootAct().findMember(getScheduleID());
                AAct rule = rootAct().findMember(getRuleID());
                assertEquals(rule.getTargets().size(), 1);
                assertEquals(schedule.getTargets().size(), 2);
                assertEquals(setTo.getSources().size(), 2);
                assertEquals(setTo.getTargets().size(), 1);
            }

            public void postCondition() {

                assertEquals(rootAct().getMembers().size(), 7);
                assertEquals(rootAct().getRoots().size(), 3);
                assertNotNull(rootAct().findMember(getRuleID()));
                assertNotNull(rootAct().findMember(getScheduleID()));
                assertNull(rootAct().findMember("_Unspecified_"));
                AAct setTo = rootAct().findMember("setTo");
                AAct schedule = rootAct().findMember(getScheduleID());
                AAct rule = rootAct().findMember(getRuleID());
                assertEquals(rule.getTargets().size(), 1);
                assertEquals(schedule.getTargets().size(), 2);
                assertEquals(setTo.getSources().size(), 2);
                assertEquals(setTo.getTargets().size(), 0);
            }
        });
        // does deletion delete target reference, but preserve target's
        // remaining form other members?
        cmds.add(new CommandTransformer() {
            public Command getCommand() {

                return RemoveCommand.create(getDomain(), rootAct(), MetaABMActPackage.Literals.AGROUP__MEMBERS,
                                            rootAct().findMember(getRuleID()));
            }

            public void preCondition() {
                assertEquals(rootAct().getMembers().size(), 7);
                assertEquals(rootAct().getRoots().size(), 3);
                assertNotNull(rootAct().findMember(getRuleID()));
                assertNotNull(rootAct().findMember("setTo"));
            }

            public void postCondition() {

                assertEquals(rootAct().getMembers().size(), 6);
                assertEquals(rootAct().getRoots().size(), 2);
                assertNull(rootAct().findMember(getRuleID()));
                assertNotNull(rootAct().findMember("setTo"));
            }
        });
        // does deletion delete any targets with no remaining sources?
        cmds.add(new CommandTransformer() {
            public Command getCommand() {

                return RemoveCommand.create(getDomain(), rootAct(), MetaABMActPackage.Literals.AGROUP__MEMBERS,
                                            rootAct().findMember(getScheduleID()));
            }

            public void preCondition() {

                assertEquals(rootAct().getMembers().size(), 6);
                assertEquals(rootAct().getRoots().size(), 2);
                AAct set = rootAct().findMember("setTo");
                assertNotNull(set);
                AAct schedule = rootAct().findMember(getScheduleID());
                assertNotNull(schedule);
                assertEquals(set.getSources().size(), 1);
                assertEquals(schedule.getTargets().size(), 2);
            }

            public void postCondition() {
                assertNull(rootAct().findMember("setTo"));
                assertNull(rootAct().findMember(getScheduleID()));
                assertNull(rootAct().findMember("_Unspecified_()"));

                assertEquals(rootAct().getMembers().size(), 3);
                assertEquals(rootAct().getRoots().size(), 1);

            }
        });
        executeTests(cmds);
    }

    public void testLiterals() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildRoot(cmds);
        ModelConstructionCommandTest.buildAgents(cmds);
        final FLibrary library = (FLibrary) lib.getLibrary().get(0);
        final FLibrary funcNum = library.findSub("operators").findSub("numericOperators");
        final FFunction funcAdd = funcNum.findFunction("add");
        buildActs(cmds);
        cmds.add(new SetTransformer(MetaABMActPackage.Literals.ASINK__FUNCTION, funcAdd) {
            public IID getIID() {
                return rootAct().getMembers().get(7);
            }

            public void preCondition() {
                AEvaluate eval = (AEvaluate) getIID();
                assertNull(eval.getFunction());
                assertEquals(eval.getLabel(), "[Unspecified]()");
                assertEquals(eval.getID(), "_Unspecified_");
            }

            public void postCondition() {
                AEvaluate eval = (AEvaluate) getIID();
                assertNotNull(eval);
                assertNotNull(eval.getFunction());
                assertSame(eval.getFunction(), funcAdd);
                assertEquals(eval.getInputs().size(), 2);
                assertEquals(eval.getLabel(), "[?] Add [?]");
                assertEquals(eval.getID(), "add");
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                AEvaluate eval = (AEvaluate) rootAct().getMembers().get(7);
                assertNotNull(eval);
                ALiteral literal = MetaABMActFactory.eINSTANCE.createALiteral();
                assertNotNull(literal);
                AInput input1 = eval.getInputs().get(0);
                assertNotNull(input1);
                return SetCommand.create(getDomain(), input1, MetaABMActPackage.Literals.AINPUT__LITERAL, literal);
            }

            public void postCondition() {
                AEvaluate eval = (AEvaluate) rootAct().getMembers().get(7);
                assertNotNull(eval.getFunction());
                AInput input1 = eval.getInputs().get(0);
                // assertEquals(input1.getLabel(), "null Input");
                assertNotNull(input1);
                assertSame(eval.getFunction(), funcAdd);
                assertEquals(eval.getID(), "nullAdd");
                assertSame(input1.getValue(), input1.getLiteral());
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                AEvaluate eval = (AEvaluate) rootAct().getMembers().get(7);
                assertNotNull(eval);
                ALiteral literal = eval.getInputs().get(0).getLiteral();
                assertNotNull(literal);
                return SetCommand
                .create(getDomain(), literal, MetaABMActPackage.Literals.ALITERAL__VALUE_LITERAL, "13");
            }

            public void postCondition() {
                AEvaluate eval = (AEvaluate) rootAct().getMembers().get(7);
                AInput input1 = eval.getInputs().get(0);
                assertSame(input1.getLiteral().getValueLiteral(), "13");
                assertEquals(input1.getLiteral().getLabel(), "Literal 13");
                assertEquals(eval.getLabel(), "Literal 13 Add [?]");
                assertEquals(eval.getID(), "literal13Add");
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                AEvaluate eval = (AEvaluate) rootAct().getMembers().get(7);
                assertNotNull(eval);
                AInput input1 = eval.getInputs().get(0);
                ALiteral literal = input1.getLiteral();
                assertNotNull(literal);
                return SetCommand.create(getDomain(), input1, MetaABMActPackage.Literals.AINPUT__VALUE, null);
            }

            public void postCondition() {
                AEvaluate eval = (AEvaluate) rootAct().getMembers().get(7);
                AInput input1 = eval.getInputs().get(0);
                assertNull(input1.getLiteral());
                assertNull(input1.getValue());
            }
        });
        executeTests(cmds);
    }

    // public void testMoveActs() {
    // List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
    // ModelConstructionCommandTest.buildRoot(cmds);
    // ModelConstructionCommandTest.buildAgents(cmds);
    // buildActs(cmds);
    // cmds.add(new CommandTransformer() {
    // public Command getCommand() {
    //
    // AGroup memberAct = (AGroup) memAgent().getrootAct()ivity();
    // return MoveCommand.create(getDomain(), memberAct,
    // MetaABMActPackage.Literals.AGROUP__MEMBERS, rootAct()
    // .findMember("is"), 0);
    // }
    //
    // public void preCondition() {
    //
    // assertEquals(rootAct().getMembers().size(), 8);
    // assertEquals(rootAct().getRoots().size(), 3);
    // assertNotNull(rootAct().findMember(""));
    // assertNotNull(rootAct().findMember("is"));
    // AAct setTo = rootAct().findMember("setTo");
    // AAct schedule = rootAct().findMember("");
    // AAct rule = rootAct().findMember(getRuleName()+"");
    // assertEquals(rule.getTargets().size(), 1);
    // assertEquals(schedule.getTargets().size(), 2);
    // assertEquals(setTo.getSources().size(), 2);
    // }
    //
    // public void postCondition() {
    //
    // assertEquals(rootAct().getMembers().size(), 7);
    // assertEquals(rootAct().getRoots().size(), 3);
    // assertNotNull(rootAct().findMember(getRuleName()+""));
    // assertNotNull(rootAct().findMember(""));
    // assertNull(rootAct().findMember("is"));
    // AAct setTo = rootAct().findMember("setTo");
    // AAct schedule = rootAct().findMember("");
    // AAct rule = rootAct().findMember(getRuleName()+"");
    // assertEquals(rule.getTargets().size(), 1);
    // assertEquals(schedule.getTargets().size(), 1);
    // assertEquals(setTo.getSources().size(), 2);
    // }
    // });
    // // does deletion delete target reference, but preserve target's
    // // remaining form other members?
    // cmds.add(new CommandTransformer() {
    // public Command getCommand() {
    //
    // AGroup memberAct = (AGroup) memAgent().getrootAct()ivity();
    // return MoveCommand.create(getDomain(), memberAct,
    // MetaABMActPackage.Literals.AGROUP__MEMBERS, rootAct()
    // .findMember(getRuleName()+""), 0);
    // }
    //
    // public void preCondition() {
    //
    // assertEquals(rootAct().getMembers().size(), 7);
    // assertEquals(rootAct().getRoots().size(), 3);
    // assertNotNull(rootAct().findMember(getRuleName()+""));
    // assertNotNull(rootAct().findMember("setTo"));
    // }
    //
    // public void postCondition() {
    //
    // assertEquals(rootAct().getMembers().size(), 6);
    // assertEquals(rootAct().getRoots().size(), 2);
    // assertNull(rootAct().findMember(getRuleName()+""));
    // assertNotNull(rootAct().findMember("setTo"));
    // }
    // });
    // // does deletion delete any targets with no remiaing sources?
    // cmds.add(new CommandTransformer() {
    // public Command getCommand() {
    //
    // AGroup memberAct = (AGroup) memAgent().getrootAct()ivity();
    // return MoveCommand.create(getDomain(), memberAct,
    // MetaABMActPackage.Literals.AGROUP__MEMBERS, rootAct()
    // .findMember(""), 0);
    // }
    //
    // public void preCondition() {
    //
    // assertEquals(rootAct().getMembers().size(), 6);
    // assertEquals(rootAct().getRoots().size(), 2);
    // AAct set = rootAct().findMember("setTo");
    // assertNotNull(set);
    // AAct schedule = rootAct().findMember("");
    // assertNotNull(schedule);
    // assertEquals(set.getSources().size(), 1);
    // assertEquals(schedule.getTargets().size(), 1);
    // assertFalse(set instanceof IRoot);
    // assertTrue(schedule instanceof IRoot);
    // }
    //
    // public void postCondition() {
    //
    // assertNull(rootAct().findMember("setTo"));
    // assertNull(rootAct().findMember(""));
    // AAct eval = rootAct().findMember("value_Unspecified_()");
    // assertNull(eval);
    //
    // assertEquals(rootAct().getMembers().size(), 3);
    // assertEquals(rootAct().getRoots().size(), 1);
    //
    // }
    // });
    // executeTests(cmds);
    // }

    public static void buildActs(List<CommandTransformer> cmds) {
        cmds.add(new CommandTransformer() {
            public Command getCommand() {

                return AddCommand.create(getDomain(), rootAct(), MetaABMActPackage.Literals.AGROUP__MEMBERS,
                                         MetaABMActFactory.eINSTANCE.createARule());
            }

            public void preCondition() {

                assertEquals(rootAct().getMembers().size(), 3);
                assertEquals(rootAct().getRoots().size(), 1);
                assertNull(rootAct().findMember(getRuleID()));
            }

            public void postCondition() {

                assertEquals(rootAct().getRoots().size(), 2);
                assertEquals(rootAct().getRoots().get(1).getLabel(), "Root Context Rule");
                assertNotNull(rootAct().findMember(getRuleID()));
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {

                return AddCommand.create(getDomain(), rootAct().getMembers().get(3),
                                         MetaABMActPackage.Literals.AACT__TARGETS, MetaABMActFactory.eINSTANCE
                                         .createASet());
            }

            public void preCondition() {

                assertEquals(rootAct().getMembers().size(), 4);
                assertEquals(rootAct().getRoots().size(), 2);
                assertNull(rootAct().findMember("setTo"));
                assertNotNull(rootAct().findMember(getRuleID()));
            }

            public void postCondition() {

                assertEquals(rootAct().getMembers().size(), 5);
                assertEquals(rootAct().getRoots().size(), 2);
                AAct setTo = rootAct().findMember("setTo");
                AAct rootContextRule = rootAct().findMember(getRuleID());
                assertNotNull(rootContextRule);
                assertNotNull(setTo);
                assertTrue(rootContextRule.getTargets().contains(setTo));
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                assertTrue(rootAct() != null);
                ASchedule createASchedule = MetaABMActFactory.eINSTANCE.createASchedule();
                assertEquals(createASchedule.getLabel(), null);
                return AddCommand.create(getDomain(), rootAct(), MetaABMActPackage.Literals.AGROUP__MEMBERS,
                                         createASchedule);
            }

            public void preCondition() {
                assertEquals(rootAct().getMembers().size(), 5);
                assertEquals(rootAct().getRoots().size(), 2);
                assertNull(rootAct().findMember("in"));
                assertNotNull(rootAct().findMember("setTo"));
                assertNotNull(rootAct().findMember(getRuleID()));
            }

            public void postCondition() {

                assertEquals(rootAct().getMembers().size(), 6);
                assertEquals(rootAct().getRoots().size(), 3);
                ASchedule schedule = (ASchedule) rootAct().getRoots().get(2);
                assertNotNull(schedule.getSelected());
                assertNotNull(schedule.getSelected().getAgent());
                assertEquals(schedule.getSelected().getAgent().getLabel(), "Root Context");
                assertEquals(schedule.getLabel(), "At 0 Every 0");
                assertNotNull(rootAct().findMember(getScheduleID()));
                assertNotNull(rootAct().findMember("setTo"));
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {

                return AddCommand.create(getDomain(), rootAct().findMember(getScheduleID()),
                                         MetaABMActPackage.Literals.AACT__TARGETS, rootAct().findMember("setTo"));
            }

            public void preCondition() {
                assertEquals(rootAct().getMembers().size(), 6);
                assertEquals(rootAct().getRoots().size(), 3);
                assertNotNull(rootAct().findMember(getScheduleID()));
                assertNotNull(rootAct().findMember("setTo"));
            }

            public void postCondition() {
                preCondition();
                AAct setTo = rootAct().findMember("setTo");
                AAct schedule = rootAct().findMember(getScheduleID());
                AAct rootContextRule = rootAct().findMember(getRuleID());
                assertEquals(rootContextRule.getTargets().size(), 1);
                assertEquals(schedule.getTargets().size(), 1);
                assertEquals(setTo.getSources().size(), 2);
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {

                return AddCommand.create(getDomain(), rootAct().findMember(getScheduleID()),
                                         MetaABMActPackage.Literals.AACT__TARGETS, MetaABMActFactory.eINSTANCE
                                         .createAQuery());
            }

            public void preCondition() {
                assertEquals(rootAct().getMembers().size(), 6);
                assertEquals(rootAct().getRoots().size(), 3);
                assertNull(rootAct().findMember("is"));
                AAct schedule = rootAct().findMember(getScheduleID());
                assertEquals(schedule.getTargets().size(), 1);
            }

            public void postCondition() {
                assertEquals(rootAct().getMembers().size(), 7);
                assertEquals(rootAct().getMembers().get(6).getID(), "_Unspecified_Query");
                assertEquals(rootAct().getRoots().size(), 3);
                assertNotNull(rootAct().findMember("_Unspecified_Query"));
                AAct setTo = rootAct().findMember("setTo");
                AAct schedule = rootAct().findMember(getScheduleID());
                AAct rootContextRule = rootAct().findMember(getRuleID());
                assertEquals(rootContextRule.getTargets().size(), 1);
                assertEquals(schedule.getTargets().size(), 2);
                assertEquals(setTo.getSources().size(), 2);
            }
        });
        cmds.add(new CommandTransformer() {
            public Command getCommand() {

                Command create = AddCommand.create(getDomain(), rootAct().findMember("setTo"),
                                                   MetaABMActPackage.Literals.AACT__TARGETS, MetaABMActFactory.eINSTANCE
                                                   .createAEvaluate());
                assertTrue(create.canExecute());
                return create;
            }

            public void preCondition() {
                AAct set = rootAct().findMember("setTo");
                assertEquals(set.getTargets().size(), 0);
                assertEquals(rootAct().getMembers().size(), 7);
                assertEquals(rootAct().getRoots().size(), 3);
                assertNotNull(rootAct().findMember("_Unspecified_Query"));
            }

            public void postCondition() {

                assertEquals(rootAct().getMembers().size(), 8);
                assertEquals(rootAct().getRoots().size(), 3);
                AAct set = rootAct().findMember("setTo");
                assertEquals(set.getTargets().size(), 1);
                assertNotNull(rootAct().findMember("_Unspecified_Query"));
                // AAct eval = rootAct().findMember("value_Unspecified_()");
                // assertEquals(eval.getSources().size(), 1);
                // assertSame(eval.getSources().get(0), set);
            }
        });
    }

    public void testRemoveSetAttribute() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildRoot(cmds);
        ModelConstructionCommandTest.buildAgents(cmds);
        buildActs(cmds);
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                SAttribute attr = model.getAgents().get(0).getAttributes().get(0);
                assertNotNull(attr);
                return AddCommand.create(getDomain(), rootAct().findMember("setTo"),
                                         MetaABMActPackage.Literals.AACCESSOR__ATTRIBUTE, attr);
            }

            public void preCondition() {
                ASet set = (ASet) rootAct().findMember("setTo");
                SAttribute attr = model.getAgents().get(0).getAttributes().get(0);
                assertNull(set.getAttribute());
                assertEquals(model.getAgents().get(0).getAttributes().get(0).getAccessors().size(), 0);
                assertEquals(attr.getAccessors().size(), 0);
            }

            public void postCondition() {
                ASet set = (ASet) rootAct().findMember("setTo");
                SAttribute attr = model.getAgents().get(0).getAttributes().get(0);
                assertEquals(set.getAttribute(), attr);
                assertTrue(attr.getAccessors().contains(set));
                assertEquals(attr.getAccessors().size(), 1);
            }
        });
        cmds.add(new CommandTransformer() {
            SAttribute attr;

            public Command getCommand() {
                attr = model.getAgents().get(0).getAttributes().get(0);
                assertNotNull(attr);
                return RemoveCommand.create(getDomain(), model.getAgents().get(0),
                                            MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES, attr);
            }

            public void preCondition() {
                ASet set = (ASet) rootAct().findMember("setTo");
                assertEquals(set.getAttribute(), attr);
                assertEquals(model.getAgents().get(0).getAttributes().size(), 1);
                assertEquals(attr.getAccessors().size(), 1);
            }

            public void postCondition() {
                ASet set = (ASet) rootAct().findMember("setTo");
                assertEquals(set.getAttribute(), null);
                assertEquals(model.getAgents().get(0).getAttributes().size(), 0);
                assertEquals(attr.getAccessors().size(), 0);
            }
        });
    }

    public void testRemoveSetAct() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildRoot(cmds);
        ModelConstructionCommandTest.buildAgents(cmds);
        buildActs(cmds);
        addInputs(cmds);
        cmds.add(new CommandTransformer() {
            public Command getCommand() {
                SAttribute attr = model.getAgents().get(0).getAttributes().get(0);
                assertNotNull(attr);
                return AddCommand.create(getDomain(), rootAct().findMember("setTo"),
                                         MetaABMActPackage.Literals.AACCESSOR__ATTRIBUTE, attr);
            }

            public void preCondition() {
                ASet set = (ASet) rootAct().findMember("setTo");
                SAttribute attr = model.getAgents().get(0).getAttributes().get(0);
                assertNull(set.getAttribute());
                assertEquals(model.getAgents().get(0).getAttributes().get(0).getAccessors().size(), 0);
                assertEquals(attr.getAccessors().size(), 1);
            }

            public void postCondition() {
                ASet set = (ASet) rootAct().findMember("setTo");
                SAttribute attr = model.getAgents().get(0).getAttributes().get(0);
                assertEquals(set.getAttribute(), attr);
                assertTrue(attr.getAccessors().contains(set));
                assertEquals(attr.getAccessors().size(), 2);
            }
        });
        cmds.add(new CommandTransformer() {
            SAttribute attr;

            public Command getCommand() {
                ASet set = (ASet) rootAct().findMember("setTo");
                attr = model.getAgents().get(0).getAttributes().get(0);
                assertNotNull(attr);
                return RemoveCommand.create(getDomain(), set.getSources().get(0),
                                            MetaABMActPackage.Literals.AACT__TARGETS, Collections.singleton(set));
            }

            public void preCondition() {
                ASet set = (ASet) rootAct().findMember("setTo");
                assertEquals(set.getSources().size(), 1);
                assertEquals(attr.getAccessors().size(), 2);
            }

            public void postCondition() {
                assertNull(rootAct().findMember("setTo"));
                assertEquals(attr.getAccessors().size(), 0);
            }
        });
    }

    public void testSelectChain() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildRoot(cmds);
        cmds.add(createSelectChain());
        executeTests(cmds);
    }

    public void testSelectMove() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildRoot(cmds);
        cmds.add(createSelectChain());
        cmds.add(createSelectTarget());
        cmds.add(createSimpleMove());
        executeTests(cmds);
    }

    private CommandTransformer createSelectChain() {
        return new CommandTransformer() {
            public Command getCommand() {
                CompoundCommand cmd = new CompoundCommand();
                AAct rule = createMember(cmd, rootAct(), MetaABMActFactory.eINSTANCE.createARule(), "Rule");
                AAct eval1 = createTarget(cmd, rule, MetaABMActFactory.eINSTANCE.createAEvaluate(), "Eval1");
                AAct select1 = createTarget(cmd, eval1, MetaABMActFactory.eINSTANCE.createASelect(), "Select1");
                createTarget(cmd, select1, MetaABMActFactory.eINSTANCE.createAMove(), "Move");
                createTarget(cmd, select1, MetaABMActFactory.eINSTANCE.createAEvaluate(), "Eval2");
                return cmd;
            }

            public void preCondition() {
            }

            public void postCondition() {
                ASelect rootSelected = (ASelect) rootAct().getMembers().get(0);
                assertEquals(rootSelected.getLabel(), "Rule");
                assertEquals(rootSelected.getSelected(), rootSelected);
                AAct eval1 = rootSelected.getTargets().get(0);
                assertTrue(eval1 instanceof AEvaluate);
                assertEquals(eval1.getSelected(), rootSelected);
                AAct select1 = eval1.getTargets().get(0);
                assertEquals(select1.getID(), "select1");
                assertTrue(select1 instanceof ASelect);
                assertEquals(select1.getSelected(), rootSelected);
                assertNotNull(select1);
                AMove move = (AMove) select1.getTargets().get(0);
                assertEquals(move.getSelected(), rootSelected);
                assertEquals(move.getDestination(), select1);
            }
        };
    }

    private CommandTransformer createSelectTarget() {
        return new CommandTransformer() {
            public Command getCommand() {
                CompoundCommand cmd = new CompoundCommand();
                AAct rule = createMember(cmd, rootAct(), MetaABMActFactory.eINSTANCE.createARule(), "TargetRule");
                createTarget(cmd, rule, MetaABMActFactory.eINSTANCE.createAEvaluate(), "TargetEval1");
                return cmd;
            }

            public void preCondition() {
            }

            public void postCondition() {
                ASelect rootSelected = (ASelect) rootAct().getRoots().get(1);
                assertEquals(rootSelected.getLabel(), "TargetRule");
                assertEquals(rootSelected.getSelected(), rootSelected);
                AAct eval1 = rootSelected.getTargets().get(0);
                assertTrue(eval1 instanceof AEvaluate);
                assertEquals(eval1.getSelected(), rootSelected);
            }
        };
    }

    private CommandTransformer createSimpleMove() {
        return new CommandTransformer() {
            public Command getCommand() {
                CompoundCommand cmd = new CompoundCommand();
                ASelect rootSelected = (ASelect) rootAct().getRoots().get(0);
                AAct eval1 = rootSelected.getTargets().get(0);
                AAct selected1 = eval1.getTargets().get(0);
                ASelect targetSelected = (ASelect) rootAct().getRoots().get(1);
                assertNotSame(rootSelected, targetSelected);
                AAct eval2 = selected1.getTargets().get(1);
                assertEquals(eval2.getLabel(), "Eval2");
                AAct targetEval = targetSelected.getTargets().get(0);
                assertEquals(targetEval.getLabel(), "TargetEval1");
                assertEquals(targetEval.getTargets().size(), 0);
                assertTrue(selected1.getTargets().contains(eval2));
                cmd.append(AddCommand.create(getDomain(), targetEval, MetaABMActPackage.Literals.AACT__TARGETS, eval2));
                cmd.append(RemoveCommand
                           .create(getDomain(), selected1, MetaABMActPackage.Literals.AACT__TARGETS, eval2));
                return cmd;
            }

            public void preCondition() {
                ASelect rootSelected = (ASelect) rootAct().getRoots().get(0);
                ASelect targetSelected = (ASelect) rootAct().getRoots().get(1);
                AAct eval1 = rootSelected.getTargets().get(0);
                AAct selected1 = eval1.getTargets().get(0);
                assertNotSame(rootSelected, targetSelected);
                assertEquals(selected1.getTargets().size(), 2);
                AAct eval2 = rootAct().findMember("eval2");
                assertNotNull("eval2");
                AAct targetEval = rootAct().findMember("targetEval1");
                assertFalse(targetEval.getTargets().contains(eval2));
                AAct orginalSel = rootAct().findMember("select1");
                assertTrue(orginalSel.getTargets().contains(eval2));
            }

            public boolean modifies() {
                return true;
            }

            public void postCondition() {
                ASelect rootSelected = (ASelect) rootAct().getRoots().get(0);
                assertEquals(rootSelected.getLabel(), "Rule");
                assertEquals(rootSelected.getSelected(), rootSelected);
                AAct eval1 = rootSelected.getTargets().get(0);
                eval1.getTargets().get(0);
                assertTrue(eval1 instanceof AEvaluate);
                AAct eval2 = rootAct().findMember("eval2");
                assertNotNull(eval2);
                AAct targetEval = rootAct().findMember("targetEval1");
                assertTrue(targetEval.getTargets().contains(eval2));
                AAct orginalSel = rootAct().findMember("select1");
                assertFalse(orginalSel.getTargets().contains(eval2));
            }
        };
    }

    private AAct createMember(CompoundCommand cmd, AAct target, AAct created, String label) {
        cmd.appendAndExecute(AddCommand
                             .create(getDomain(), target, MetaABMActPackage.Literals.AGROUP__MEMBERS, created));
        cmd.appendAndExecute(SetCommand.create(getDomain(), created, MetaABMPackage.Literals.IID__LABEL, label));
        return created;
    }

    private AAct createTarget(CompoundCommand cmd, AAct target, AAct created, String label) {
        cmd.appendAndExecute(AddCommand.create(getDomain(), target, MetaABMActPackage.Literals.AACT__TARGETS, created));
        cmd.appendAndExecute(SetCommand.create(getDomain(), created, MetaABMPackage.Literals.IID__LABEL, label));
        return created;
    }

    protected static String getRuleID() {
        return "rootContextRule";
    }

    protected static String getScheduleID() {
        return "at0Every0";
    }

    protected static String getAgentRuleID() {
        return "rootContextAgentRule";
    }
}