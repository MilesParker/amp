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
 * </copyright> $Id: RemoveActTargetsCommand.java,v 1.2 2010/08/04 01:52:52 mparker Exp $
 */
package org.metaabm.commands;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.metaabm.act.AAct;
import org.metaabm.act.ARoot;
import org.metaabm.act.MetaABMActPackage;

/**
 * Cleans up Acts by removing any targets with no other sources.
 * 
 * @author milesparker
 * 
 */
public class RemoveActTargetsCommand extends RemoveCommand {

    CompoundCommand command;

    public RemoveActTargetsCommand(EditingDomain domain, EObject owner, EStructuralFeature feature,
            Collection<?> collection) {
        super(domain, owner, feature, collection);
    }

    public boolean doCanExecute() {
        return true;
    }

    public void doExecute() {
        command = new CompoundCommand();
        Collection<Object> targets = new HashSet<Object>();
        targets.addAll(collection);
        super.doExecute();
        for (Object object : targets) {
            AAct target = (AAct) object;
            if (target.getSources().isEmpty() && !(target instanceof ARoot)
                    && target.getGroup().getMembers().contains(target)) {
                command.appendAndExecute(RemoveCommand.create(getDomain(), target.getGroup(),
                                                              MetaABMActPackage.Literals.AGROUP__MEMBERS, target));
            }
        }
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
