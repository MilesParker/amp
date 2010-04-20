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
 * </copyright> $Id: AddSpacesActsCommand.java,v 1.1 2010/04/20 22:25:54 mparker Exp $
 */
package org.metaabm.commands;

import java.util.Collection;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import org.metaabm.SContext;
import org.metaabm.SContinuousSpace;
import org.metaabm.SGeography;
import org.metaabm.SGrid;
import org.metaabm.SNetwork;
import org.metaabm.SProjection;
import org.metaabm.act.AAct;
import org.metaabm.act.ABuild;
import org.metaabm.act.ABuildProjection;
import org.metaabm.act.AGroup;
import org.metaabm.act.MetaABMActFactory;
import org.metaabm.act.MetaABMActPackage;

/**
 * Creates acts on agent creation.
 * 
 * @author milesparker
 * 
 */
public class AddSpacesActsCommand extends AbstractOverrideableCommand {

    protected CompoundCommand command;

    SContext parent;

    Collection<?> spaces;

    public AddSpacesActsCommand(EditingDomain domain, SContext parent, Collection<?> spaces) {
        super(domain, "Add Agent Acts");
        this.spaces = spaces;
        this.parent = parent;
    }

    public Collection<?> doGetAffectedObjects() {
        return spaces;
    }

    public boolean doCanExecute() {
        return parent != null;
    }

    public static ABuildProjection findBuilderOf(SContext context, SProjection proj) {
        AGroup root = (AGroup) context.getRootActivity();
        if (root != null) {
            for (AAct act : root.getMembers()) {
                if (act instanceof ABuildProjection && ((ABuildProjection) act).getProjection() == proj) {
                    return (ABuildProjection) act;
                }
            }
        }
        return null;
    }

    public void doExecute() {
        command = new CompoundCommand("Add Agent Activities and Attributes");
        for (Object object : spaces) {
            SProjection space = (SProjection) object;
            if (parent != null) {
                ABuild builder = AddAgentsActsCommand.findBuilderOf(parent);

                if (builder == null) {
                    builder = MetaABMActFactory.eINSTANCE.createABuild();
                    command.appendAndExecute(AddCommand.create(domain, parent.getRootActivity(),
                                                               MetaABMActPackage.Literals.AGROUP__MEMBERS, builder));
                }
                ABuildProjection spaceBuilder = findBuilderOf(parent, space);

                if (spaceBuilder == null) {
                    createSpaceBuilder(space, builder);
                }
            }
        }
    }

    protected void createSpaceBuilder(SProjection proj, ABuild builder) {

        ABuildProjection projBuilder = null;
        String name = "Build ";
        if (proj instanceof SContinuousSpace) {
            projBuilder = MetaABMActFactory.eINSTANCE.createABuildSpace();
            name += "Space";
        } else if (proj instanceof SGrid) {
            projBuilder = MetaABMActFactory.eINSTANCE.createABuildGrid();
            name += "Grid";
        } else if (proj instanceof SGeography) {
            projBuilder = MetaABMActFactory.eINSTANCE.createABuildGeography();
            name += "Geography";
        } else if (proj instanceof SNetwork) {
            projBuilder = MetaABMActFactory.eINSTANCE.createABuildNetwork();
            name += "Network";
        }
        command.appendAndExecute(AddCommand.create(domain, builder, MetaABMActPackage.Literals.AACT__TARGETS,
                                                   projBuilder));
        if (parent.getAgents().size() == 1) {
            // assume that the agent is an occupant
            command.appendAndExecute(AddCommand.create(domain, projBuilder,
                                                       MetaABMActPackage.Literals.ABUILD_PROJECTION__AGENTS, parent
                                                       .getAgents().get(0)));
        }
        command.appendAndExecute(SetCommand.create(domain, projBuilder,
                                                   MetaABMActPackage.Literals.ABUILD_PROJECTION__PROJECTION, proj));

    }

    public void doRedo() {
        command.redo();
    }

    public void doUndo() {
        command.undo();
    }
}
