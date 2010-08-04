/**
 * <copyright>
 *
 * Copyright (c) 2009 Metascape, LLC.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Metascape - Initial API and Implementation
 *
 * </copyright>
 *
 */

package org.eclipse.amp.axf.ide;

import org.eclipse.amp.axf.core.IModel;
import org.eclipse.ui.IWorkbenchPart;

/**
 * 
 * @author mparker
 *
 */
public class AbstractModelWorkbenchListener implements IModelWorkbenchListener {

    /**
     * @param model
     * @see org.eclipse.amp.axf.ide.IModelWorkbenchListener#modelActivated(IModel)
     */
    public void modelActivated(IModel model) {
    }

    /**
     * @param model
     * @see org.eclipse.amp.axf.ide.IModelWorkbenchListener#modelAdded(IModel)
     */
    public void modelAdded(IModel model) {
    }

    /**
     * @param model
     * @see org.eclipse.amp.axf.ide.IModelWorkbenchListener#modelRemoved(IModel)
     */
    public void modelRemoved(IModel model) {
    }

    /**
     * @param part
     * @see org.eclipse.amp.axf.ide.IModelWorkbenchListener#viewActivated(org.eclipse.ui.IWorkbenchPart)
     */
    public void viewActivated(IWorkbenchPart part) {
    }

    /**
     * @param part
     * @see org.eclipse.amp.axf.ide.IModelWorkbenchListener#viewAdded(org.eclipse.ui.IWorkbenchPart)
     */
    public void viewAdded(IWorkbenchPart part) {
    }

    /**
     * @param part
     * @see org.eclipse.amp.axf.ide.IModelWorkbenchListener#viewRemoved(org.eclipse.ui.IWorkbenchPart)
     */
    public void viewRemoved(IWorkbenchPart part) {
    }

}
