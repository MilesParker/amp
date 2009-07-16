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

import java.util.Collections;

import org.eclipse.emf.common.command.Command;
import org.metaabm.commands.AddImplementatedCommand;

public class AddImplement extends CommandTransformer {
    public AddImplement() {
        super("Implement");
    }

    public Command getCommand() {
        return new AddImplementatedCommand(getDomain(), Collections.singleton(model));
    }

    public void preCondition() {
        CommandTest.assertTrue(model.getImplementation() == null);
    }

    public void postCondition() {
        CommandTest.assertTrue(model.getImplementation() != null);
    }
}