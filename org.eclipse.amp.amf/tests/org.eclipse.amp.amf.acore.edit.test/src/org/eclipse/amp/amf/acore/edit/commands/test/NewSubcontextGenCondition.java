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

public class NewSubcontextGenCondition extends NewContextMemberGenCondition {
    public void preCondition() {
        AGroup root = (AGroup) model.getRootActivity();
        CommandTest.assertEquals(model.getAttributes().size(), 1);
        CommandTest.assertEquals(root.getMembers().size(), 2);
    }

    public void postCondition() {
        postCondition(1);
        CommandTest.assertEquals(build.getLabel(), "Build Root Context");
        CommandTest.assertEquals(create.getLabel(), "Create Root Context Contexts");
        CommandTest.assertEquals(countAttr.getLabel(), "Root Context Context Count");
        CommandTest.assertEquals(countAttr.getDescription(), "The number of root context contexts to create.");
    }

}