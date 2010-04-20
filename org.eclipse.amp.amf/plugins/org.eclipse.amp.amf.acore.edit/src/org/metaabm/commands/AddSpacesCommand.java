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
 * </copyright> $Id: AddSpacesCommand.java,v 1.1 2010/04/20 22:25:54 mparker Exp $
 */
package org.metaabm.commands;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import org.metaabm.IID;
import org.metaabm.MetaABMPackage;
import org.metaabm.SContext;

/**
 * Add agent implementation and base acts.
 * 
 * @author milesparker
 * 
 */
public class AddSpacesCommand extends AddCommand {

    CompoundCommand command;


    public AddSpacesCommand(EditingDomain domain, EObject owner, Collection<?> collection, int index) {
        super(domain, owner, MetaABMPackage.Literals.SCONTEXT__PROJECTIONS, collection, index);
    }

    public boolean doCanExecute() {
        return true;
    }

    public boolean doCanUndo() {
        return true;
    }

    @SuppressWarnings("unchecked")
    public void doExecute() {
        List<SuggestLabelCommand> sugCmds = new ArrayList<SuggestLabelCommand>();
        for (Object object : collection) {
            sugCmds.add(new SuggestLabelCommand(domain, (IID) object));
        }
        super.doExecute();
        command = new CompoundCommand();
        command.appendAndExecute(AddCommand.create(domain, command, command, collection));
        command.appendAndExecute(new AddSpacesActsCommand(domain, (SContext) owner, collection));
        for (SuggestLabelCommand suggestLabelCommand : sugCmds) {
            command.appendAndExecute(suggestLabelCommand);
        }
        // command.appendAndExecute(suggestLabel);
    }

    public void doRedo() {
        super.doRedo();
        command.redo();
    }

    public void doUndo() {
        command.undo();
        super.doUndo();
    }

}
