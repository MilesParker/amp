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

import org.eclipse.amp.axf.core.AbstractLifecycleListener;
import org.eclipse.amp.axf.core.ILifeCycleListener;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.core.IObservationProvider;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;

// TODO: Auto-generated Javadoc
/**
 * The Class ModelManagerViewPart.
 */
public class ModelManagerViewPart extends ViewPart {

    private static final class ModelContents implements ITreeContentProvider {
        public Object[] getChildren(Object parentElement) {
            if (parentElement instanceof IModel) {
                return ((IObservationProvider) parentElement).getModelListeners().toArray();
            }
            return new Object[0];
        }

        public Object getParent(Object element) {
            // if (element instanceof IModelObserver) {
            // ((IModelObserver) element).getModel();
            // }
            return null;
        }

        public boolean hasChildren(Object element) {
            return element instanceof IModel && getChildren(element).length > 0;
        }

        public Object[] getElements(Object inputElement) {
            return ((ModelViewManager) inputElement).getModels().toArray();
        }

        public void dispose() {
        }

        public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
        }
    }

    ILifeCycleListener genericModelListener = new AbstractLifecycleListener() {
        @Override
        public void observeStart(IObservationProvider model) {
            refreshViewer();
        }

        @Override
        public void observeStop(IObservationProvider model) {
            refreshViewer();
        }

        boolean wasPaused;

        @Override
        public void stateChange(Object key, Object updated) {
            super.stateChange(key, updated);
            boolean pauseState = ((IModel) updated).getEngine().isPaused();
            if (wasPaused != pauseState) {
                refreshViewer();
                wasPaused = pauseState;
            }
        }

        public void observeUpdate(IObservationProvider model) {
            if (((IModel) model).getPeriod() % 10 == 0) {
                refreshViewer();
            }
        };
    };

    private class ManagerListener implements IModelWorkbenchListener {

        public void modelActivated(IObservationProvider model) {
            refreshViewer();
        }

        public void modelAdded(IObservationProvider model) {
            refreshViewer();
            model.addModelListener(genericModelListener);
        }

        public void modelRemoved(IObservationProvider model) {
            refreshViewer();
            model.removeModelListener(genericModelListener);
        }

        public void viewActivated(IWorkbenchPart part) {
        }

        public void viewAdded(IWorkbenchPart part) {
        }

        public void viewRemoved(IWorkbenchPart part) {
        }
    }

    private TreeViewer viewer;

    private void refreshViewer() {
        viewer.getControl().getDisplay().asyncExec(new Runnable() {
            public void run() {
                viewer.refresh(true);
            }
        });
    }

    /**
     * @param parent
     * @see org.eclipse.ui.part.WorkbenchPart#createPartControl(org.eclipse.swt.widgets.Composite)
     */
    @Override
    public void createPartControl(Composite parent) {
        viewer = new TreeViewer(parent);
        viewer.setContentProvider(new ModelContents());
        assignManager();
    }

    private void assignManager() {
        final ModelViewManager manager = AXFWorkbenchPlugin.getDefault().getManager();
        ILabelProvider labelProvider = (ILabelProvider) Platform.getAdapterManager().getAdapter(manager,
                                                                                                ILabelProvider.class);
        if (labelProvider == null) {
            throw new RuntimeException("Label Provider not found for Model Manager.");
        }
        viewer.setLabelProvider(labelProvider);
        viewer.setInput(manager);
        manager.getManagerListeners().addModelManagerListener(new ManagerListener());
        viewer.addSelectionChangedListener(new ISelectionChangedListener() {
            public void selectionChanged(SelectionChangedEvent event) {
                IStructuredSelection sel = (IStructuredSelection) event.getSelection();
                if (sel.getFirstElement() instanceof IModel) {
                    manager.setActiveModel((IModel) sel.getFirstElement());
                }
            }
        });
    }

    /**
     * 
     * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
     */
    @Override
    public void setFocus() {
    }

}
