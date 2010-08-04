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
 * </copyright> $Id: DisplayAction.java,v 1.2 2010/08/04 01:53:54 mparker Exp $
 */
package org.metaabm.ide;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;

/**
 * Support for AMF editor specific customization actions.
 * 
 * @author milesparker
 * 
 */
public abstract class DisplayAction implements IEditorActionDelegate {

    protected MetaABMEditor editor;

    public void setActiveEditor(IAction action, IEditorPart targetEditor) {
        editor = (MetaABMEditor) targetEditor;
    }

    public void selectionChanged(IAction action, ISelection selection) {
    }
}
