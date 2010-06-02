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
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.CreateChildCommand;

import org.metaabm.act.AAct;
import org.metaabm.act.ARule;
import org.metaabm.act.MetaABMActFactory;
import org.metaabm.act.MetaABMActPackage;

public class AgentComplexActsTest extends CommandTest {

    static class AddRuleCommand extends CommandTransformer {
        public Command getCommand() {
            CompoundCommand cmd = new CompoundCommand();
            ARule createdAct = MetaABMActFactory.eINSTANCE.createARule();
            AddCommand cc = new AddCommand(domain, agentRootAct(), MetaABMActPackage.Literals.AGROUP__MEMBERS,
                                           createdAct);
            cmd.append(cc);
            return cmd;
        }

        public void preCondition() {
            assertEquals(agentRootAct().getMembers().size(), 0);
        }

        public void postCondition() {
            assertEquals(agentRootAct().getMembers().size(), 1);
        }
    }

    static abstract class AddActCommand extends CommandTransformer {
        EClass clazz;
        EReference feature;
        int expectedMembers;

        public AddActCommand(EClass clazz, EReference feature, int expectedMembers) {
            super("Add " + feature.getName());
            this.feature = feature;
            this.clazz = clazz;
            this.expectedMembers = expectedMembers;
        }

        public Command getCommand() {
            CompoundCommand cmd = new CompoundCommand();
            EObject object = MetaABMActFactory.eINSTANCE.create(clazz);
            CreateChildCommand cc = new CreateChildCommand(domain, getParent(), feature, object, Collections
                                                           .singleton(object));
            cmd.append(cc);
            return cmd;
        }

        public void preCondition() {
            assertEquals(agentRootAct().getMembers().size(), expectedMembers);
        }

        public void postCondition() {
            assertEquals(agentRootAct().getMembers().size(), expectedMembers + 1);
        }

        public abstract AAct getParent();
    }

    public AgentComplexActsTest(String name) {
        super(name);
    }

    protected static String getAgentRuleID() {
        return "rootContextAgentRule";
    }

    public static void buildAddActs(List<CommandTransformer> cmds) {
        cmds.add(new AddRuleCommand());
        // cmds.add(new AddActCommand(MetaABMActPackage.eINSTANCE.getASelect(),
        // MetaABMActPackage.Literals.AACT__TARGETS,
        // 1) {
        // public AAct getParent() {
        // return agentRootAct().getMembers().get(0);
        // }
        // });
    }

    public void testAddActs() {
        List<CommandTransformer> cmds = new ArrayList<CommandTransformer>();
        ModelConstructionCommandTest.buildRoot(cmds);
        ModelConstructionCommandTest.buildAgents(cmds);
        buildAddActs(cmds);
        executeTests(cmds);
    }
}