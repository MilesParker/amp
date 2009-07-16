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
 * </copyright> $Id: SuggestLabelCommand.java,v 1.1 2009/07/16 19:58:58 mparker Exp $
 */
package org.metaabm.commands;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.metaabm.IID;
import org.metaabm.MetaABMPackage;
import org.metaabm.act.AAct;
import org.metaabm.provider.MetaABMItemProvider;
import org.metaabm.provider.MetaABMItemProviderAdapterFactory;

/**
 * If label hasn't been set, creates one based on item provider suggested labels.
 * 
 * @author milesparker
 * 
 */
public class SuggestLabelCommand extends AbstractOverrideableCommand {

    Collection<? extends IID> ids;

    MetaABMItemProvider defaultProvider;

    List<Boolean> oldSame = new ArrayList<Boolean>();

    CompoundCommand command;

    public SuggestLabelCommand(MetaABMItemProvider provider, EditingDomain domain, IID id) {
        this(domain, Collections.singleton(id));
        this.defaultProvider = provider;
    }

    public SuggestLabelCommand(EditingDomain domain, IID id) {
        this(domain, Collections.singleton(id));
    }

    public SuggestLabelCommand(EditingDomain domain, Collection<? extends IID> ids) {
        super(domain, "Suggest Label", "Suggest Label");
        this.ids = ids;
        for (IID id : this.ids) {
            String idealLabel = StringUtils.remove(id.getLabel(), " Copy");
            oldSame.add(suggestLabel(id).equals(idealLabel));
        }
    }

    public String suggestID(IID id) {
        return getProviderFor(id).suggestID(id);
    }

    public String suggestLabel(IID id) {
        return getProviderFor(id).suggestLabel(id);
    }

    private MetaABMItemProvider getProviderFor(IID id) {
        if (defaultProvider != null) {
            return defaultProvider;
        }
        try {
            return (MetaABMItemProvider) MetaABMItemProviderAdapterFactory.getGenericAdapterFactory().adapt(id,
                                                                                                            IEditingDomainItemProvider.class);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean doCanExecute() {
        return true;
    }

    public boolean doCanUndo() {
        return true;
    }

    public void doExecute() {
        command = new CompoundCommand();
        int i = 0;
        for (IID id : ids) {
            if (StringUtils.isEmpty(id.getLabel()) || oldSame.get(i)) {
                command.appendAndExecute(SetCommand.create(getDomain(), id, MetaABMPackage.Literals.IID__LABEL,
                                                           suggestLabel(id)));
            } else if (id.getID() == null || !(id instanceof AAct)) {
                command.appendAndExecute(SetCommand.create(getDomain(), id, MetaABMPackage.Literals.IID__LABEL, id
                                                           .getLabel()));
            }

            i++;
        }
    }

    public void doRedo() {
        command.redo();
    }

    public void doUndo() {
        command.undo();
    }
}