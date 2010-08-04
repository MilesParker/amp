/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Argonne National Laboratory - Initial development (pre-contribution)
 *   Metascape - Subsequent development and maintenance
 *
 * </copyright> $Id: AddImplementatedCommand.java,v 1.2 2010/08/04 01:52:52 mparker Exp $
 */
package org.metaabm.commands;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.metaabm.MetaABMFactory;
import org.metaabm.MetaABMPackage;
import org.metaabm.SImplementation;
import org.metaabm.SImplemented;

/**
 * Add implementation for affected implemented.
 * 
 * @author milesparker
 */
public class AddImplementatedCommand extends AbstractOverrideableCommand {

    CompoundCommand command;

    Collection<?> added;

    public AddImplementatedCommand(EditingDomain domain, Collection<?> added) {
        super(domain, "Add Implementation to Implemented");
        this.added = added;
    }

    public Collection<?> doGetAffectedObjects() {
        return added;
    }

    public boolean doCanExecute() {
        return true;
    }

    public boolean doCanUndo() {
        return true;
    }

    public void doExecute() {
        command = new CompoundCommand();
        for (Object object : getAffectedObjects()) {
            SImplemented implemented = (SImplemented) object;
            SImplementation implimpl = MetaABMFactory.eINSTANCE.createSImplementation();
            Command setImpl =
                SetCommand.create(domain, implemented, MetaABMPackage.Literals.SIMPLEMENTED__IMPLEMENTATION,
                                  implimpl, CommandParameter.NO_INDEX);
            command.appendAndExecute(setImpl);
        }
    }

    public void doRedo() {
        command.redo();
    }

    public void doUndo() {
        command.undo();
    }
}
