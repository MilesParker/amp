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
package org.eclipse.amp.agf;

import org.eclipse.amp.axf.view.SelectionSynchronizer;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.jface.viewers.ISelectionProvider;

/**
 * An implementation of selection synchronizer supporting edit parts, viewers and generic objects.
 */
public class EditPartSelectionSynchronizer extends SelectionSynchronizer {

    /**
     * Maps the given editpart from one viewer to an editpart in another viewer. It returns <code>null</code> if there
     * is no corresponding part. This method can be overridden to provide custom mapping.
     * 
     * @param viewer the viewer being mapped to
     * @param object the object
     * 
     * @return <code>null</code> or a corresponding editpart
     */
    protected Object convert(ISelectionProvider viewer, Object object) {
        if (object instanceof EditPart) {
            object = ((EditPart) object).getModel();
        }
        if (viewer instanceof EditPartViewer) {
            Object temp = ((EditPartViewer) viewer).getEditPartRegistry().get(object);
            EditPart newPart = null;
            if (temp != null) {
                newPart = (EditPart) temp;
            }
            return newPart;
        }
        return object;
    }

}
