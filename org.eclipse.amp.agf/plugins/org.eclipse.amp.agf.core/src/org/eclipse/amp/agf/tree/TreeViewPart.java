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
package org.eclipse.amp.agf.tree;

import org.eclipse.amp.agf.gef.EditPartViewPart;
import org.eclipse.amp.agf.gef.ModelFactoryProvider;
import org.eclipse.amp.axf.core.AbstractLifecycleListener;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.core.IObservationProvider;
import org.eclipse.amp.axf.ide.AXFWorkbenchPlugin;
import org.eclipse.amp.axf.ide.AbstractModelWorkbenchListener;
import org.eclipse.amp.axf.ide.ModelViewManager;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.editparts.RootTreeEditPart;
import org.eclipse.gef.ui.parts.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

// TODO: Auto-generated Javadoc
/**
 * The Class TreeViewPart.
 */
public class TreeViewPart extends EditPartViewPart {

    /**
     * @param parent
     * @see org.eclipse.amp.agf.gef.EditPartViewPart#createPartControl(org.eclipse.swt.widgets.Composite)
     */
    public void createPartControl(Composite parent) {
        super.createPartControl(parent);
        new Thread() {
            /**
             * 
             * @see java.lang.Thread#run()
             */
            public void run() {
                AXFWorkbenchPlugin axf = AXFWorkbenchPlugin.getDefault();
                while (axf == null) {
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                    }
                    axf = AXFWorkbenchPlugin.getDefault();
                }
                ModelViewManager manager = axf.getManager();
                if (manager.getActiveModel() != null) {
                    modelChanged((IModel) manager.getActiveModel());
                }
                manager.getManagerListeners().addModelManagerListener(new AbstractModelWorkbenchListener() {

                    public void modelActivated(IModel model) {
                        modelChanged(model);
                    }

                    /**
                     * @param model
                     * @see org.eclipse.amp.axf.ide.AbstractModelWorkbenchListener#modelRemoved(org.eclipse.amp.axf.core.IModel)
                     */
                    public void modelRemoved(IModel model) {
                        if (model == getModel()) {
                            modelChanged(null);
                        }
                    }
                });
            }
        }.start();
    }

    /**
     * @return
     * @see org.eclipse.amp.agf.gef.EditPartViewPart#createViewer()
     */
    protected EditPartViewer createViewer() {
        TreeViewer treeViewer = new TreeViewer();
        // treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
        //
        // public void selectionChanged(SelectionChangedEvent event) {
        // }
        // });
        // getSite().setSelectionProvider(treeViewer);
        return treeViewer;
    }

    /**
     * @param activeModel
     * @see org.eclipse.amp.axf.ide.view.ActiveModelViewPart#modelChanged(org.eclipse.amp.axf.core.IModel)
     */
    protected void modelChanged(final IModel activeModel) {
        setModel(activeModel);
        if (getViewer().getControl() != null) {
            if (activeModel != null) {
                ModelFactoryProvider provider = getModelFactoryProvider(activeModel);
                EditPartFactory editPartTreeFactory = provider.getEditPartTreeFactory();
                getViewer().setEditPartFactory(editPartTreeFactory);
                getViewer().getControl().getDisplay().asyncExec(new Runnable() {
                    public void run() {
                        getViewer().getControl().setBackground(
                                                               getViewer().getControl().getDisplay()
                                                               .getSystemColor(SWT.COLOR_WHITE));
                        getViewer().setContents(activeModel);
                    }
                });
                activeModel.addModelListener(new AbstractLifecycleListener() {
                    /**
                     * @param observed
                     * @see org.eclipse.amp.axf.core.AbstractLifecycleListener#observeUpdate(org.eclipse.amp.axf.core.IObservationProvider)
                     */
                    public void observeUpdate(IObservationProvider observed) {
                        getViewer().getControl().getDisplay().asyncExec(new Runnable() {
                            public void run() {
                                for (Object object : getViewer().getRootEditPart().getContents().getChildren()) {
                                    EditPart part = (EditPart) object;
                                    part.refresh();
                                }
                            }
                        });
                        super.observeUpdate(observed);
                    }
                });
            } else {
                getViewer().getControl().getDisplay().asyncExec(new Runnable() {
                    public void run() {
                        getViewer().getControl().setBackground(
                                                               getViewer().getControl().getDisplay()
                                                               .getSystemColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
                        getViewer().setContents(null);
                        // for (Object object : getViewer().getRootEditPart().getContents().getChildren()) {
                        // EditPart part = (EditPart) object;
                        // part.getChildren().clear();
                        // part.refresh();
                        // }
                        getViewer().getControl().redraw();
                    }
                });
            }
        }
    }

    /**
     * @return
     * @see org.eclipse.amp.agf.gef.EditPartViewPart#createRoot()
     */
    public RootEditPart createRoot() {
        RootTreeEditPart rootTreeEditPart = new RootTreeEditPart();
        return rootTreeEditPart;
    }
}
