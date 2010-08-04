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
 *   Metascape - Development and maintenance
 *
 * </copyright> $Id: RemoveMultiValueCommand.java,v 1.2 2010/08/04 01:52:52 mparker Exp $
 */
package org.metaabm.commands;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.metaabm.act.ASink;


public class RemoveMultiValueCommand extends MultiValueCommand implements Command {

    public RemoveMultiValueCommand(EditingDomain domain, ASink sink) {
        super(domain, sink, sink.getFunction());
        if (sink.isMultiValue()) {
            clearMultiFunction(sink.getInputs());
        }
    }
}
