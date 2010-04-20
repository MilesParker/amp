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
 * </copyright> $Id: AddAgentsCommand.java,v 1.2 2010/04/20 22:25:55 mparker Exp $
 */
package org.metaabm.commands;

import java.util.Collection;

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
public class AddAgentsCommand extends AddCommand {

    CompoundCommand command;

    public AddAgentsCommand(EditingDomain domain, EObject owner, Collection<?> collection, int index) {
        super(domain, owner, MetaABMPackage.Literals.SCONTEXT__AGENTS, collection, index);
    }

    public boolean doCanExecute() {
        return true;
    }

    public boolean doCanUndo() {
        return true;
    }

    @SuppressWarnings("unchecked")
    public void doExecute() {
        super.doExecute();
        command = new CompoundCommand();
        command.appendAndExecute(new AddImplementatedCommand(domain, collection));
        command.appendAndExecute(new AddAgentsActsCommand(domain, (SContext) owner, collection));
        command.appendAndExecute(AddCommand.create(domain, command, command, collection));
        command.appendAndExecute(new SuggestLabelCommand(domain, (Collection<IID>) collection));
        // for (Object object : collection) {
        // SAgent agent = (SAgent) object;
        // SStyle2D defaultStyle = MetaABMFactory.eINSTANCE.createSStyle2D();
        // command.appendAndExecute(AddCommand.create(domain, agent,
        // MetaABMPackage.Literals.SAGENT__STYLES, defaultStyle));
        // command.appendAndExecute(SetCommand.create(domain, defaultStyle,
        // MetaABMPackage.Literals.IID__LABEL, "Default " + agent.getLabel() +
        // " Style"));
        // }
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
