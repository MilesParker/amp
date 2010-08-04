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
 * </copyright> $Id: DisplayAttributeReferencesAction.java,v 1.2 2010/08/04 01:53:54 mparker Exp $
 */
package org.metaabm.ide;

/**
 * Supports control of whether attributes accessors are displayed as children of attribute nodes. (This behavior may be
 * currently disabled.)
 * 
 * @author milesparker
 * 
 */
public class DisplayAttributeReferencesAction extends DisplayButtonAction {

    public boolean isStateAs() {
        return editor.isDisplayAttributeReferences();
    }

    public void setStateAs(boolean state) {
        editor.setDisplayAttributeReferences(state);
    }
}
