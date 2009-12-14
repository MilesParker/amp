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
import org.eclipse.amp.axf.view.SWTAsyncModelListener;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.statushandlers.StatusManager;

// TODO: Auto-generated Javadoc
/**
 * The Class ModelManagerViewPart.
 */
public class ModelManagerViewPart extends ViewPart {

    private static final class ModelContents implements ITreeContentProvider {
        public Object[] getChildren(Object parentElement) {
            if (parentElement instanceof IModel) {
                return ((IModel) parentElement).getModelListeners().toArray();
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

    ILifeCycleListener genericModelListener;

    private class ManagerListener implements IModelWorkbenchListener {

        public void modelActivated(IModel model) {
            refreshViewer();
        }

        public void modelAdded(IModel model) {
            refreshViewer();
            model.addModelListener(genericModelListener);
        }

        public void modelRemoved(IModel model) {
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
        if (!viewer.getControl().isDisposed()) {
            viewer.getControl().getDisplay().asyncExec(new Runnable() {
                public void run() {
                    viewer.refresh(true);
                }
            });
        }
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
        genericModelListener = new SWTAsyncModelListener(parent, "Model VIew Manager Updater") {
            public void update(IModel model) {
                refreshViewer();
            }
        };
    }

    private void assignManager() {
        final ModelViewManager manager = AXFWorkbenchPlugin.getDefault().getManager();
        final ILabelProvider modelLabelProvider = (ILabelProvider) Platform.getAdapterManager()
        .getAdapter(manager, ILabelProvider.class);
        if (modelLabelProvider == null) {
            StatusManager.getManager().handle(
                                              new Status(IStatus.WARNING, "org.eclipse.amp.axf.ide",
                                                         "No label provider defined for: " + manager));
        }
        ILabelProvider labelProvider = new LabelProvider() {
            /**
             * @param element
             * @return
             * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
             */
            public String getText(Object element) {
                if (element instanceof AbstractLifecycleListener) {
                    return ((AbstractLifecycleListener) element).getName();
                }
                if (modelLabelProvider != null) {
                    String name = modelLabelProvider.getText(element);
                    if (name != null) {
                        return name;
                    }
                }
                return super.getText(element);
            }
        };
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
