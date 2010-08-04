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
 * </copyright> $Id: RemoveAttributedAttributesCommand.java,v 1.2 2010/08/04 01:52:52 mparker Exp $
 */
package org.metaabm.commands;

import java.util.Collection;

import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.metaabm.SAttribute;
import org.metaabm.act.AAccessor;
import org.metaabm.act.AInput;
import org.metaabm.act.ASet;
import org.metaabm.act.MetaABMActPackage;

/**
 * When any attributes are removed, ensures that all references to those attributes are removed from other objects.
 * 
 * @author milesparker
 * 
 */
public class RemoveAttributedAttributesCommand extends RemoveCommand {

    CompoundCommand command;

    Collection<EObject> accessors;

    public RemoveAttributedAttributesCommand(EditingDomain domain, EObject owner, EStructuralFeature feature,
            Collection<?> collection) {
        super(domain, owner, feature, collection);
    }

    public void doExecute() {
        command = new CompoundCommand();
        for (Object attr : collection) {
            for (EObject access : ((SAttribute) attr).getAccessors()) {
                if (access instanceof AInput) {
                    command.appendAndExecute(SetCommand.create(domain, access,
                                                               MetaABMActPackage.Literals.AINPUT__VALUE, null));
                }
                if (access instanceof AAccessor) {
                    AAccessor set = (AAccessor) access;
                    if (collection.contains(set.getAttribute())) {
                        command.appendAndExecute(SetCommand.create(domain, set.getAttribute(),
                                                                   MetaABMActPackage.Literals.AACCESSOR__ATTRIBUTE, null));
                    }
                }
                if (access instanceof ASet) {
                    ASet set = (ASet) access;
                    if (collection.contains(set.getParameter())) {
                        command.appendAndExecute(SetCommand.create(domain, set.getParameter(),
                                                                   MetaABMActPackage.Literals.ASET__PARAMETER, null));
                    }
                }
            }
        }
        super.doExecute();
    }

    public void doRedo() {
        super.doRedo();
        command.redo();
    }

    public void doUndo() {
        super.doUndo();
        command.undo();
    }
}
