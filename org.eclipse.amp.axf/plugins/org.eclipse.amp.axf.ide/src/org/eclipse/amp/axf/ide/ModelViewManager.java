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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.amp.axf.core.IEngine;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.core.IObservationProvider;
import org.eclipse.amp.axf.ide.handlers.CloseHandler;
import org.eclipse.amp.axf.ide.handlers.PauseHandler;
import org.eclipse.amp.axf.ide.handlers.RestartHandler;
import org.eclipse.amp.axf.ide.handlers.ResumeHandler;
import org.eclipse.amp.axf.ide.handlers.StartHandler;
import org.eclipse.amp.axf.ide.handlers.StepHandler;
import org.eclipse.amp.axf.ide.handlers.StopHandler;
import org.eclipse.amp.axf.ide.view.StatusLineView;
import org.eclipse.amp.axf.view.IModelPart;
import org.eclipse.amp.axf.view.ModelInput;
import org.eclipse.amp.axf.view.ModelViewPart;
import org.eclipse.amp.axf.view.SelectionSynchronizer;
import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.core.runtime.Status;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.contexts.IContextActivation;
import org.eclipse.ui.contexts.IContextService;
import org.eclipse.ui.internal.ErrorViewPart;
import org.eclipse.ui.statushandlers.StatusManager;

// TODO: Auto-generated Javadoc
/**
 * The Class ModelViewManager.
 */
@SuppressWarnings("restriction")
public class ModelViewManager implements IAdapterFactory {

    public static final String EXECUTION_PERSPECTIVE_ID = "org.eclipse.amp.axf.ExecutionPerspective";

    private IContextService contextService;

    private IContextActivation ideContext;

    private IContextActivation partContext;

    List<IModel> models = new ArrayList<IModel>();

    List<IViewPart> views = new ArrayList<IViewPart>();

    Map<IEngine, IModel> runnerForModel = new HashMap<IEngine, IModel>();

    Map<IModel, IEngine> modelForRunner = new HashMap<IModel, IEngine>();

    Map<Object, IModel> modelForArbitrary = new HashMap<Object, IModel>();

    Map<IModel, List<IViewPart>> viewsForModel = new HashMap<IModel, List<IViewPart>>();

    LifeCycleListeners workbenchListeners = new LifeCycleListeners();

    ModelManagerListeners managerListeners = new ModelManagerListeners();

    HandlerManager handlers = new HandlerManager();

    IModel activeModel;

    IPartListener modelActivationListener;

    private int updateCount;

    private IObservationProvider[] modelSlots = new IObservationProvider[16];

    private SelectionSynchronizer editSelection;

    private String priorPerspectiveID;

    /**
     * Instantiates a new model view manager.
     */
    public ModelViewManager() {
    }

    /**
     * Gets the active model.
     * 
     * @return the active model
     */
    public IObservationProvider getActiveModel() {
        return activeModel;
    }

    /**
     * Sets the active model.
     * 
     * @param newModel the new active model
     */
    public synchronized void setActiveModel(final IModel newModel) {
        if (newModel != null && !models.contains(newModel)) {
            // We have an unattached view..do nothing
            return;
        }
        final IModel oldModel = this.activeModel;
        this.activeModel = newModel;
        if (newModel != oldModel) {
            workbenchListeners.replaceModel(oldModel, newModel);
            if (newModel != null) {
                managerListeners.notifyModelActivated(newModel);
            }
        }

    }

    /**
     * Gets the models.
     * 
     * @return the models
     */
    public List<IModel> getModels() {
        return models;
    }

    /**
     * Gets the slot.
     * 
     * @param model the model
     * 
     * @return the slot
     */
    public int getSlot(IObservationProvider model) {
        int i = 0;
        for (IObservationProvider slot : modelSlots) {
            if (slot == model) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /**
     * Assign slot.
     * 
     * @param model the model
     * 
     * @return the int
     */
    public int assignSlot(IObservationProvider model) {
        int i = 0;
        for (IObservationProvider slot : modelSlots) {
            if (slot == null) {
                modelSlots[i] = model;
                return i;
            }
            i++;
        }
        StatusManager.getManager().handle(
                                          new Status(Status.WARNING, "org.eclipse.amp.axf.ui",
                                                     "Currently, the execution engine only supports " + modelSlots.length
                                                     + " slots. The UI may not perform properly."));
        return -1;
    }

    /**
     * Release slot.
     * 
     * @param model the model
     * 
     * @return the int
     */
    public int releaseSlot(IObservationProvider model) {
        int i = 0;
        for (IObservationProvider slot : modelSlots) {
            if (slot == model) {
                modelSlots[i] = null;
                return i;
            }
            i++;
        }
        throw new RuntimeException(model + " has not been assigned to a slot.");
    }

    /**
     * Register.
     * 
     * @param model the model
     * @param executor the executor
     * @param modelObject the model object
     */
    public synchronized void register(final IModel model, IEngine executor, Object modelObject) {
        if (model == null) {
            throw new RuntimeException("Tried to register a null model.");
        }
        if (executor == null) {
            throw new RuntimeException("Tried to register a null executor.");
        }
        if (modelActivationListener == null) {
            activate();
        }
        models.add(model);
        modelForRunner.put(model, executor);
        runnerForModel.put(executor, model);
        assignSlot(model);
        if (modelObject != null) {
            modelForArbitrary.put(modelObject, model);
        }
        managerListeners.notifyModelAdded(model);
        viewsForModel.put(model, new ArrayList<IViewPart>());
        setActiveModel(model);
    }

    /**
     * Register.
     * 
     * @param model the model
     * @param executor the executor
     */
    public void register(final IModel model, IEngine executor) {
        register(model, executor, null);
    }

    /**
     * Register.
     * 
     * @param part the part
     */
    public synchronized void register(IViewPart part) {
        views.add(part);
    }

    /**
     * Removes the.
     * 
     * @param part the part
     */
    public synchronized void removed(IViewPart part) {
        views.remove(part);
        List<IViewPart> modelViews = getViews(activeModel);
        if (modelViews != null) {
            modelViews.remove(part);
        }
        managerListeners.notifyViewRemoved(part);
    }

    public List<IViewPart> getViews(IModel model) {
        return viewsForModel.get(model);
    }

    private boolean updated;

    /**
     * Creates the view part.
     * 
     * @param id the id
     * @param editorInput the editor input
     * @param name the name
     */
    public void createViewPart(final String id, final ModelInput editorInput, final String name) {
        updated = false;
        PlatformUI.getWorkbench().getDisplay().asyncExec(new Runnable() {

            public void run() {
                try {
                    IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
                    IWorkbenchPage page = workbenchWindow.getActivePage();
                    int slot = getSlot(editorInput.getModel());
                    String secondaryID = slot + "";
                    int viewCount = 0;
                    for (IViewPart part : viewsForModel.get(editorInput.getModel())) {
                        if (part.getViewSite().getId().equals(id)) {
                            viewCount++;
                        }
                    }
                    secondaryID += "-" + viewCount;
                    final IViewPart showViewPart = page.showView(id, secondaryID, IWorkbenchPage.VIEW_VISIBLE);
                    if (showViewPart instanceof ModelViewPart) {
                        register(showViewPart);
                        ((ModelViewPart) showViewPart).setInput(editorInput);
                        ((ModelViewPart) showViewPart).setPartName(editorInput.getName() + " " + name);
                        ((ModelViewPart) showViewPart).createModelListeners();
                        getViews(editorInput.getModel()).add(showViewPart);
                        new Thread() {
                            public void run() {
                                managerListeners.notifyViewAdded(showViewPart);
                            }
                        }.start();
                    } else if (showViewPart instanceof ErrorViewPart) {
                    } else {
                        throw new RuntimeException("Couldn't create model view part.");
                    }
                } catch (org.eclipse.ui.PartInitException e) {
                    throw new RuntimeException("Couldn't instantiate model view " + this, e);
                } finally {
                    updated = true;
                }
            }
        });
        while (!updated) {
            try {
                Thread.sleep(50);

            } catch (InterruptedException e) {
            }
        }
    }

    /**
     * Close view.
     * 
     * @param part the part
     */
    public void closeView(final IViewPart part) {
        if (PlatformUI.getWorkbench() != null) {
            Display display = PlatformUI.getWorkbench().getDisplay();
            if (!display.isDisposed()) {
                display.syncExec(new Runnable() {
                    public void run() {
                        IWorkbench workbench = PlatformUI.getWorkbench();
                        IWorkbenchWindow workbenchWindow = workbench.getActiveWorkbenchWindow();
                        if (workbenchWindow != null && workbenchWindow.getActivePage() != null) {
                            workbenchWindow.getActivePage().hideView(part);
                        }
                    }
                });
            }
        } else {
            new Thread() {
                public void run() {
                    removed(part);
                };
            }.start();
        }
    }

    /**
     * Removes the.
     * 
     * @param model the model
     */
    public synchronized void remove(final IModel model) {
        if (models.remove(model)) {
            modelForRunner.remove(model);
            runnerForModel.remove(model.getEngine());
            managerListeners.notifyModelRemoved(model);
            for (IViewPart part : viewsForModel.get(model)) {
                closeView(part);
            }
            viewsForModel.remove(model);
            List<Object> arbitraries = new ArrayList<Object>();
            for (Entry<Object, IModel> entry : modelForArbitrary.entrySet()) {
                if (entry.getValue() == model) {
                    arbitraries.add(entry.getKey());
                }
            }
            for (Object object : arbitraries) {
                modelForArbitrary.remove(object);
            }
            releaseSlot(model);
            if (!model.getEngine().isCloseRequested()) {
                model.getEngine().close();
            }
            if (models.size() > 0) {
                setActiveModel(models.get(models.size() - 1));
            } else {
                setActiveModel(null);
                deactivate();
            }
        } else {
            StatusManager.getManager().handle(
                                              new Status(Status.WARNING, "org.eclipse.amp.axf.ui",
                                                         "Removing a model that no longer exists:" + model));
        }
    }

    private IWorkbenchPage getPage() {
        // TODO this is a quick hack and assumed we only have one workbench window and one page
        final IWorkbench wb = AXFWorkbenchPlugin.getDefault().getWorkbench();
        return wb.getWorkbenchWindows()[0].getPages()[0];
    }

    private void activate() {
        final IWorkbench wb = AXFWorkbenchPlugin.getDefault().getWorkbench();

        if (wb != null) {
            wb.addWorkbenchListener(new IWorkbenchListener() {
                public void postShutdown(IWorkbench workbench) {
                }

                public boolean preShutdown(IWorkbench workbench, boolean forced) {
                    if (!forced) {
                        synchronized (ModelViewManager.this) {
                            for (IModel model : new ArrayList<IModel>(getModels())) {
                                remove(model);
                            }
                        }
                    }
                    return true;
                }
            });

            modelActivationListener = new IPartListener() {
                public void partActivated(final IWorkbenchPart part) {
                    assignPart(part);
                    // if (updated != null) {
                    // }
                }

                private void assignPart(final IWorkbenchPart part) {
                    if (part instanceof IModelPart && ((IModelPart) part).getAdapter(IModel.class) != null) {
                        new Thread() {
                            public void run() {
                                IModel model = (IModel) ((IModelPart) part).getAdapter(IModel.class);
                                setActiveModel(model);
                            }
                        }.start();
                    }
                }

                public void partBroughtToTop(IWorkbenchPart part) {
                    assignPart(part);
                }

                public void partClosed(final IWorkbenchPart part) {
                    new Thread() {
                        public void run() {
                            removed((IViewPart) part);
                        }
                    }.start();
                }

                public void partDeactivated(IWorkbenchPart part) {
                }

                public void partOpened(IWorkbenchPart part) {
                    assignPart(part);
                }

                // private SpeedSliderWindowControl getSpeedControl(final IWorkbenchPart part) {
                // IViewSite site = (IViewSite) part.getSite();
                // IActionBars actionBars = site.getActionBars();
                // return (SpeedSliderWindowControl) actionBars.getMenuManager()
                // .find("org.eclipse.amp.axf.view.ui.slider");
                // };
            };
            getPage().addPartListener(modelActivationListener);
            activatePerspective(wb, EXECUTION_PERSPECTIVE_ID, false);
            wb.getDisplay().syncExec(new Runnable() {
                private StatusLineView statusView;

                public void run() {
                    try {
                        contextService = (IContextService) wb.getService(IContextService.class);
                        ideContext = contextService.activateContext("org.eclipse.amp.axf.executionContext");
                        partContext = contextService.activateContext("org.eclipse.amp.axf.activeEditorContext");

                        handlers.activate();
                        handlers.addHandler("org.eclipse.amp.axf.ui.start", new StartHandler());
                        handlers.addHandler("org.eclipse.amp.axf.ui.stop", new StopHandler());
                        handlers.addHandler("org.eclipse.amp.axf.ui.pause", new PauseHandler());
                        handlers.addHandler("org.eclipse.amp.axf.ui.resume", new ResumeHandler());
                        handlers.addHandler("org.eclipse.amp.axf.ui.restart", new RestartHandler());
                        handlers.addHandler("org.eclipse.amp.axf.ui.close", new CloseHandler());
                        handlers.addHandler("org.eclipse.amp.axf.ui.step", new StepHandler());
                        // if (statusView == null) {
                        // statusView = new StatusLineView();
                        // new Thread() {
                        // public void run() {
                        // workbenchListeners.addListener(statusView);
                        // addModelManagerListener(statusView);
                        // };
                        // }.start();
                        // }
                    } catch (Exception e) {
                        throw new RuntimeException("Couldn't activate services.", e);
                    }
                }
            });
        } else {
            throw new RuntimeException("Attempted to activate a service with no workbench available.");
        }
    }

    private void activatePerspective(final IWorkbench wb, final String perspectiveID, final boolean editors) {
        wb.getDisplay().syncExec(new Runnable() {
            public void run() {
                IPerspectiveDescriptor perspective = wb.getPerspectiveRegistry().findPerspectiveWithId(perspectiveID);
                if (perspective != null) {
                    IWorkbenchPage activePage = wb.getActiveWorkbenchWindow() != null ? wb.getActiveWorkbenchWindow()
                        .getActivePage() : null;
                        if (activePage != null && priorPerspectiveID == null
                                || !activePage.getPerspective().getId().equals(EXECUTION_PERSPECTIVE_ID)) {
                            priorPerspectiveID = activePage.getPerspective().getId();
                        }
                        activePage.setPerspective(perspective);
                        activePage.setEditorAreaVisible(editors);
                }
                updateCount++;
            }
        });
    }

    private void deactivate() {
        final IWorkbench wb = AXFWorkbenchPlugin.getDefault().getWorkbench();
        if (wb != null) {
            workbenchListeners = new LifeCycleListeners();
            wb.getDisplay().syncExec(new Runnable() {
                public void run() {
                    if (contextService != null) {
                        contextService.deactivateContext(ideContext);
                        contextService.deactivateContext(partContext);
                    }
                    handlers.deactivate();
                }
            });
            getPage().removePartListener(modelActivationListener);
            // while (views.size() > 0) {
            // try {
            // Thread.sleep(50);
            // } catch (InterruptedException e) {
            // }
            // }
            if (priorPerspectiveID != null) {
                activatePerspective(wb, priorPerspectiveID, true);
            }
            modelActivationListener = null;
        }
    }

    private void waitForUpdate(int count) {
        while (updateCount < count) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
        }
        updateCount = 0;
    }

    /**
     * @param adaptableObject
     * @param adapterType
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object, java.lang.Class)
     */
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        if (adapterType == IEngine.class) {
            return runnerForModel.get(adaptableObject);
        } else if (adapterType == IModel.class) {
            if (adaptableObject instanceof IEngine) {
                return modelForRunner.get(adaptableObject);
            } else {
                return modelForArbitrary.get(adaptableObject);
            }
        }
        return null;
    }

    /**
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapterList()
     */
    public Class[] getAdapterList() {
        return new Class[] { IEngine.class, IModel.class };
    }

    /**
     * Gets the selection synchronizer.
     * 
     * @return the selection synchronizer
     */
    public SelectionSynchronizer getSelectionSynchronizer() {
        return editSelection;
    }

    /**
     * Sets the selection synchronizer.
     * 
     * @param editSelection the new selection synchronizer
     */
    public void setSelectionSynchronizer(SelectionSynchronizer editSelection) {
        if (this.editSelection != null) {
            editSelection.replace(this.editSelection);
        }
        this.editSelection = editSelection;
    }


    public ModelManagerListeners getManagerListeners() {
        return managerListeners;
    }

    public LifeCycleListeners getWorkbenchListeners() {
        return workbenchListeners;
    }

    public HandlerManager getHandlers() {
        return handlers;
    }

}
