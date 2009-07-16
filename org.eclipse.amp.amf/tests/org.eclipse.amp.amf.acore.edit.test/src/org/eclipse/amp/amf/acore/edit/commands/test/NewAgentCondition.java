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

public class NewAgentCondition extends PrePostCondition {
    public void postCondition() {
        SAgent created = model.getAgents().get(0);
        CommandTest.assertTrue(model.getAgents().contains(created));

        CommandTest.assertEquals(created.getLabel(), "Root Context Agent");
        CommandTest.assertEquals(created.getID(), "rootContextAgent");
        CommandTest.assertEquals(created.getPluralLabel(), "Root Context Agents");
        CommandTest.assertTrue(created.getImplementation() != null);
        CommandTest.assertEquals(created.getImplementation().getClassName(), "RootContextAgent");
        // CommandTest.assertEquals(created.getImplementation().getLabel(),
        // "Root Context Agent Implementation");
        // CommandTest.assertEquals(created.getImplementation().getID(),
        // "rootContextAgentImplementation");
    }
}