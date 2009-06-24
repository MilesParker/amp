/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation

 *******************************************************************************/
package org.eclipse.amp.axf.view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;

// TODO: Auto-generated Javadoc
/**
 * A utility for synchronizing the selection of multiple EditPartViewers. Copied from
 * org.eclipse.gef.ui.parts.SelectionSynchronizer and modified to allow conversion from SelectionProvider.
 * 
 * This class performs selection synchronization by taking the selection from one viewer, and mapping it to the
 * selection in another viewer. The mapping is performed by matching the models of the selected EditParts from one
 * viewer to the EditParts with the same models in another. The can be customized by overriding the
 * {@link #convert(EditPartViewer, EditPart)} method.
 * 
 * @author hudsonr
 */
public class SelectionSynchronizer implements ISelectionChangedListener {

    private List<ISelectionProvider> viewers = new ArrayList<ISelectionProvider>();
    private boolean isDispatching = false;
    private int disabled = 0;
    private ISelectionProvider pendingSelection;

    /**
     * Adds a viewer to the set of synchronized viewers.
     * 
     * @param viewer the viewer
     */
    public void addViewer(ISelectionProvider viewer) {
        viewer.addSelectionChangedListener(this);
        viewers.add(viewer);
    }

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
        return object;
    }

    /**
     * Removes the viewer from the set of synchronized viewers.
     * 
     * @param viewer the viewer to remove
     */
    public void removeViewer(ISelectionProvider viewer) {
        viewer.removeSelectionChangedListener(this);
        viewers.remove(viewer);
        if (pendingSelection == viewer) {
            pendingSelection = null;
        }
    }

    /**
     * Receives notification from one viewer, and maps selection to all other members.
     * 
     * @param event the selection event
     */
    public void selectionChanged(SelectionChangedEvent event) {
        if (isDispatching) {
            return;
        }
        ISelectionProvider source = event.getSelectionProvider();
        if (disabled > 0) {
            pendingSelection = source;
        } else {
            ISelection selection = event.getSelection();
            syncSelection(source, selection);
        }
    }

    private void syncSelection(ISelectionProvider source, ISelection selection) {
        isDispatching = true;
        for (int i = 0; i < viewers.size(); i++) {
            if (viewers.get(i) != source) {
                ISelectionProvider viewer = viewers.get(i);
                setViewerSelection(viewer, selection);
            }
        }
        isDispatching = false;
    }

    /**
     * Enables or disabled synchronization between viewers.
     * 
     * @param value <code>true</code> if synchronization should occur
     * 
     * @since 3.1
     */
    public void setEnabled(boolean value) {
        if (!value) {
            disabled++;
        } else if (--disabled == 0 && pendingSelection != null) {
            syncSelection(pendingSelection, pendingSelection.getSelection());
            pendingSelection = null;
        }
    }

    private void setViewerSelection(ISelectionProvider viewer, ISelection selection) {
        ArrayList<Object> result = new ArrayList<Object>();
        Iterator iter = ((IStructuredSelection) selection).iterator();
        while (iter.hasNext()) {
            Object part = convert(viewer, iter.next());
            if (part != null) {
                result.add(part);
            }
        }
        viewer.setSelection(new StructuredSelection(result));
        // if (result.size() > 0) {
        // viewer.reveal((EditPart)result.get(result.size() - 1));
        // }
    }

    /**
     * Replace.
     * 
     * @param old the old
     */
    public void replace(SelectionSynchronizer old) {
        for (ISelectionProvider provider : old.viewers) {
            addViewer(provider);
            provider.removeSelectionChangedListener(old);
        }
    }
}
