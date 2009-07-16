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

import org.metaabm.SAgent;
import org.metaabm.SAttribute;
import org.metaabm.act.ABuild;
import org.metaabm.act.ACreateAgents;
import org.metaabm.act.AGroup;

public class NewContextMemberGenCondition extends PrePostCondition {
    AGroup root;
    ABuild build;
    ACreateAgents create;
    SAttribute countAttr;

    public void preCondition() {
        AGroup root = (AGroup) model.getRootActivity();
        CommandTest.assertEquals(model.getAttributes().size(), 0);
        CommandTest.assertEquals(root.getMembers().size(), 0);
    }

    public void postCondition() {
        postCondition(1);
        CommandTest.assertNotNull(model.getRootActivity());
        CommandTest.assertEquals(build.getLabel(), "Build Root Context");
        CommandTest.assertEquals(create.getLabel(), "Create Root Context Contexts");
        CommandTest.assertEquals(countAttr.getLabel(), "Root Context Context Count");
        CommandTest.assertEquals(countAttr.getDescription(), "The number of root context contexts to create.");
        CommandTest.assertNotNull(model.findAttribute("rootContextContextCount"));
    }

    public void postCondition(int index) {
        SAgent agent = model.getAgents().get(index);
        CommandTest.assertNotNull(agent);
        CommandTest.assertNotNull(agent.getRootActivity());
        root = (AGroup) model.getRootActivity();
        CommandTest.assertTrue(root.getMembers().get(0) instanceof ABuild);
        build = (ABuild) root.getMembers().get(0);
        CommandTest.assertTrue(build.getTargets().get(index) instanceof ACreateAgents);
        create = (ACreateAgents) build.getTargets().get(index);
        countAttr = (SAttribute) ((ACreateAgents) create).getAgentCount();

        CommandTest.assertNotNull(countAttr);
        CommandTest.assertEquals(root.getMembers().size(), model.getAgents().size() + 1);
        CommandTest.assertSame(build.getGroup(), root);
        CommandTest.assertSame(create.getGroup(), root);
        CommandTest.assertSame(countAttr, create.getAgentCount());
        CommandTest.assertTrue(root.getMembers().contains(create));
        CommandTest.assertSame(build.getTargets().get(index), create);
        CommandTest.assertTrue(model.getAttributes().contains(countAttr));
    }
}