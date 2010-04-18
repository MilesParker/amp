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

import org.metaabm.act.AGroup;

public class NewAgentGenCondition extends NewContextMemberGenCondition {
    public void preCondition() {
        AGroup root = (AGroup) model.getRootActivity();
        CommandTest.assertNull(model.findAttribute("rootContextAgentCount"));
        CommandTest.assertEquals(root.getMembers().size(), 0);
    }

    public void postCondition() {
        postCondition(0);
        CommandTest.assertNotNull(model.getRootActivity());
        CommandTest.assertEquals(model.getRootActivity().getLabel(), "Actions");
        CommandTest.assertEquals(model.getRootActivity().getID(), "actions");

        CommandTest.assertEquals(build.getLabel(), "Build Root Context");
        CommandTest.assertEquals(create.getLabel(), "Create Root Context Agents");
        CommandTest.assertEquals(countAttr.getLabel(), "Root Context Agent Count");
        CommandTest.assertEquals(countAttr.getDescription(), "The number of root context agents to create.");
        CommandTest.assertNotNull(model.findAttribute("rootContextAgentCount"));
    }
}