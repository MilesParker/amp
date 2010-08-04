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
 * </copyright> $Id: DisplayButtonAction.java,v 1.2 2010/08/04 01:53:54 mparker Exp $
 */
package org.metaabm.ide;

import org.eclipse.jface.action.IAction;
import org.eclipse.ui.IEditorPart;

/**
 * Support for buttons that control some editor view state.
 * 
 * @author milesparker
 * 
 */
public abstract class DisplayButtonAction extends DisplayAction {

    boolean currentState;

    public void setActiveEditor(IAction action, IEditorPart targetEditor) {
        super.setActiveEditor(action, targetEditor);
        if (editor != null) {
            currentState = isStateAs();
        }
        action.setChecked(currentState);
    }

    public void run(IAction action) {
        currentState = !currentState;
        setStateAs(currentState);
    }

    public abstract void setStateAs(boolean state);

    public abstract boolean isStateAs();
}
