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
 * </copyright> $Id: AgentCleanup.java,v 1.3 2010/08/04 01:52:52 mparker Exp $
 */
package org.metaabm.commands;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.metaabm.SAgent;
import org.metaabm.act.AAct;
import org.metaabm.act.AGroup;
import org.metaabm.act.AInput;
import org.metaabm.act.ARoot;
import org.metaabm.act.ASink;
import org.metaabm.act.MetaABMActPackage;

/**
 * Removes any dangling references.
 * 
 * @author milesparker
 * 
 */
public class AgentCleanup extends Job {

    EditingDomain domain;

    SAgent agent;

    CompoundCommand command;

    public AgentCleanup(EditingDomain domain, SAgent agent) {
        super("Import agent");
        this.domain = domain;
        this.agent = agent;
        command = new CompoundCommand("Remove Orphans from " + agent.getLabel());
    }

    protected IStatus run(IProgressMonitor monitor) {
        AGroup rootActivity = (AGroup) agent.getRootActivity();
        Collection<AAct> acts = rootActivity.getMembers();
        Collection<AAct> orphans = new HashSet<AAct>();
        for (AAct act : acts) {
            if (!(act instanceof AGroup) && !(act instanceof ARoot) && act.getSources().size() == 0) {
                orphans.add(act);
                if (act instanceof ASink) {
                    // command.appendIfCanExecute(RemoveCommand.create(domain,
                    // act, MetaABMActPackage.Literals.ASINK__FUNCTION, null));
                    // command.appendIfCanExecute(RemoveCommand.create(domain,
                    // act, MetaABMActPackage.Literals.ASINK__INPUTS, ((ASink)
                    // act).getInputs()));
                    for (AInput input : ((ASink) act).getInputs()) {
                        command.appendIfCanExecute(SetCommand.create(domain, input,
                                                                     MetaABMActPackage.Literals.AINPUT__VALUE, null));
                        command.appendIfCanExecute(SetCommand.create(domain, input,
                                                                     MetaABMActPackage.Literals.AINPUT__LITERAL, null));
                        command.appendIfCanExecute(SetCommand.create(domain, input,
                                                                     MetaABMActPackage.Literals.AINPUT__SELECTED, null));
                        // command.appendIfCanExecute(SetCommand.create(domain,
                        // input, MetaABMActPackage.Literals.AINPUT__SINK,
                        // null));
                    }
                }
                // command.appendIfCanExecute(RemoveCommand.create(domain, act,
                // MetaABMActPackage.Literals.AACT__TARGETS, act.getTargets()));
                // command.appendIfCanExecute(SetCommand.create(domain, act,
                // MetaABMActPackage.Literals.AACT__REFERENCE, null));
                command.appendIfCanExecute(SetCommand.create(domain, act, MetaABMActPackage.Literals.AACT__SELECTED,
                                                             null));
            }
        }
        command.appendIfCanExecute(RemoveCommand.create(domain, rootActivity,
                                                        MetaABMActPackage.Literals.AGROUP__MEMBERS, orphans));
        if (command.canExecute()) {
            domain.getCommandStack().execute(command);
//            StatusManager.getManager().handle(
//                                              new Status(IStatus.INFO, "org.eclipse.amp.amf.ide", "Cleanup succesful for: " + agent.getLabel()));
        } else {
//            StatusManager.getManager().handle(
//                                              new Status(IStatus.ERROR, "org.eclipse.amp.amf.ide", "Sorry, couldn't cleanup: " + agent.getLabel()));
        }
        return Status.OK_STATUS;
    }

}
