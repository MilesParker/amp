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
 * </copyright> $Id: SetGenerateCommand.java,v 1.3 2010/08/04 01:52:52 mparker Exp $
 */
package org.metaabm.commands;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.metaabm.MetaABMPackage;
import org.metaabm.SActable;
import org.metaabm.SContext;
import org.metaabm.SImplementation;
import org.metaabm.SImplementationMode;
import org.metaabm.act.AGroup;
import org.metaabm.act.MetaABMActFactory;

/**
 * On generation, creates agent activities if they do not already exist
 * 
 * @author milesparker
 * 
 */
public class SetGenerateCommand extends SetCommand {

    CompoundCommand command;

    SActable actable;

    public SetGenerateCommand(EditingDomain domain, EObject owner, Object value) {
        super(domain, owner, MetaABMPackage.Literals.SIMPLEMENTATION__MODE, value);
        actable = (SActable) ((SImplementation) owner).getTarget();
    }

    @Override
    public void doExecute() {
        super.doExecute();
        command = new CompoundCommand();
        if ((SImplementationMode) getValue() == SImplementationMode.GENERATE_LITERAL) {
            onGenerate();
        }
        // There is no "onLoad()" method because we want to leave Acts in place by default in case user wants to recover
        // this behavior.
    }

    @Override
    public void doRedo() {
        super.doRedo();
        command.execute();
    }

    @Override
    public void doUndo() {
        command.undo();
        super.doUndo();
    }

    private void onGenerate() {
        if (actable.getRootActivity() == null) {
            AGroup rootAct = MetaABMActFactory.eINSTANCE.createAGroup();
            command.appendAndExecute(SetCommand.create(getDomain(), actable,
                                                       MetaABMPackage.Literals.SACTABLE__ROOT_ACTIVITY, rootAct));
        }
        if (actable instanceof SContext) {
            SContext context = (SContext) actable;
            SuggestLabelCommand suggestCommand =
                new SuggestLabelCommand(getDomain(), ((AGroup) context.getRootActivity()).getMembers());
            command.appendAndExecute(new AddAgentsActsCommand(getDomain(), context, context.getAgents()));
            command.appendAndExecute(new SuggestLabelCommand(getDomain(), context.getAgents()));
            command.appendAndExecute(suggestCommand);
        }
    }
}
