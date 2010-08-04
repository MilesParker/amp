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
 * </copyright> $Id: AgentAction.java,v 1.2 2010/08/04 01:53:54 mparker Exp $
 */
package org.metaabm.ide;

import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.metaabm.SAgent;

/**
 * A UI action affecting a specific agent.
 * 
 * @author milesparker
 * 
 */
public abstract class AgentAction extends Action implements ISelectionChangedListener {

    private MetaABMEditor actionBar;

    boolean hasRun;

    public AgentAction(MetaABMEditor selectionProvider, String text, ImageDescriptor image) {
        super(text, image);
        this.actionBar = selectionProvider;
    }

    protected Object getSelected() {
        ISelectionProvider selectionProvider = actionBar;
        if (selectionProvider != null) {
            ISelection selection = selectionProvider.getSelection();
            if (selection instanceof IStructuredSelection) {
                List<?> l = ((IStructuredSelection) selection).toList();
                if (l.size() == 1) {
                    return l.get(0);
                }
            }
        }
        return null;
    }

    public boolean isEnabled() {
        return getSelected() instanceof SAgent;
    }

    public void run() {
        run((SAgent) getSelected());
        hasRun = true;
    }

    public abstract void run(SAgent agent);

    public boolean isRun() {
        return hasRun;
    }

    public boolean flush() {
        return hasRun = false;
    }

    public void selectionChanged(SelectionChangedEvent event) {
    }
}