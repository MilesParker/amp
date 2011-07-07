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

/**
 * The Class ModelViewManager.
 */
@SuppressWarnings("restriction")
public class ModelViewManager implements IAdapterFactory {

	public static final String EXECUTION_PERSPECTIVE_ID = "org.eclipse.amp.axf.ExecutionPerspective";

	private static ModelViewManager instance;

	String priorPerspectiveID;

	Map<IModel, List<IViewPart>> viewsForModel;

	ModelManagerListeners managerListeners = new ModelManagerListeners();

	/** The perspective ID to execute the simulation */
	String executionPerspective = EXECUTION_PERSPECTIVE_ID;

	IContextService contextService;

	IContextActivation ideContext;

	IContextActivation partContext;

	private List<IModel> models = new ArrayList<IModel>();

	private List<IViewPart> views = new ArrayList<IViewPart>();

	private Map<IModel, IEngine> runnerForModel;

	private Map<IEngine, IModel> modelForRunner = new HashMap<IEngine, IModel>();

	private Map<Object, IModel> modelForArbitrary = new HashMap<Object, IModel>();

	private LifeCycleListeners activeModelListeners = new LifeCycleListeners();

	private IModel activeModel;

	private IPartListener modelActivationListener;

	private IObservationProvider[] modelSlots = new IObservationProvider[16];

	private SelectionSynchronizer editSelection;

	private StatusLineView statusLineView;

	private ModelManagerViewPart managerViewPart;

	private ModelViewManager() {
	}

	public static ModelViewManager getInstance() {
		if (instance == null) {
			instance = new ModelViewManager();
		}
		return instance;
	}

	/**
	 * Only used for Unittests.
	 * 
	 * @return
	 */
	static ModelViewManager createNewInstance() {
		instance = null;
		return getInstance();
	}

	private final class PartCreator implements Runnable {
		private final String name;

		private final ModelInput editorInput;

		private final String id;

		IViewPart part;

		PartCreator(String name, ModelInput editorInput, String id) {
			this.name = name;
			this.editorInput = editorInput;
			this.id = id;
		}

		public void run() {
			try {
				IWorkbenchWindow workbenchWindow = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
				IWorkbenchPage page = workbenchWindow.getActivePage();
				int slot = getSlot(editorInput.getModel());
				String secondaryID = slot + "";
				int viewCount = 0;
				for (IViewPart view : viewsForModel.get(editorInput.getModel())) {
					if (view.getViewSite().getId().equals(id)) {
						viewCount++;
					}
				}
				secondaryID += "-" + viewCount;
				part = page.showView(id, secondaryID, IWorkbenchPage.VIEW_VISIBLE);
				if (part instanceof ModelViewPart) {
					register(part);
					((ModelViewPart) part).setInput(editorInput);
					((ModelViewPart) part).setPartName(editorInput.getName() + " " + name);
					((ModelViewPart) part).createModelListeners();
					getViews(editorInput.getModel()).add(part);
					new Thread() {
						@Override
						public void run() {
							managerListeners.notifyViewAdded(part);
						}
					}.start();
				} else if (part instanceof ErrorViewPart) {
					//
				} else {
					throw new RuntimeException("Couldn't create model view part.");
				}
			} catch (org.eclipse.ui.PartInitException e) {
				throw new RuntimeException("Couldn't instantiate model view " + id, e);
			}
		}

		public IViewPart getPart() {
			return part;
		}
	}

	/**
	 * 
	 * @author mparker
	 */
	final class ActivationListener implements IPartListener {
		private void assignPart(final IWorkbenchPart part) {
			if (part instanceof IModelPart && ((IModelPart) part).getAdapter(IModel.class) != null) {
				new Thread() {
					@Override
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

		public void partActivated(final IWorkbenchPart part) {
			assignPart(part);
		}

		public void partClosed(final IWorkbenchPart part) {
			if (part instanceof IModelPart && ((IModelPart) part).getAdapter(IModel.class) != null) {
				new Thread() {
					@Override
					public void run() {
						removed((IViewPart) part);
					}
				}.start();
			}
		}

		public void partDeactivated(IWorkbenchPart part) {
			//
		}

		public void partOpened(IWorkbenchPart part) {
			assignPart(part);
		}
	}

	/**
	 * Gets the active model.
	 * 
	 * @return the active model
	 */
	public IModel getActiveModel() {
		return activeModel;
	}

	/**
	 * Sets the active model.
	 * 
	 * @param newModel
	 *          the new active model
	 */
	public synchronized void setActiveModel(final IModel newModel) {
		if (newModel != null && !models.contains(newModel)) {
			// We have an unattached view..do nothing
			return;
		}
		final IModel oldModel = this.activeModel;
		this.activeModel = newModel;

		if (newModel != oldModel) {
			getActiveModelListeners().replaceModel(oldModel, newModel);
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
	 * @param model
	 *          the model
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
	 * @param model
	 *          the model
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
		StatusManager.getManager().handle(new Status(Status.WARNING, "org.eclipse.amp.axf.ui", "Currently, the execution engine only supports " + modelSlots.length + " slots. The UI may not perform properly."));
		return -1;
	}

	/**
	 * Release slot.
	 * 
	 * @param model
	 *          the model
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
	 * @param model
	 *          the model
	 * @param executor
	 *          the executor
	 * @param modelObject
	 *          the model object
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
		modelForRunner.put(executor, model);
		runnerForModel.put(model, executor);
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
	 * @param model
	 *          the model
	 * @param executor
	 *          the executor
	 */
	public void register(final IModel model, IEngine executor) {
		register(model, executor, null);
	}

	/**
	 * Register.
	 * 
	 * @param part
	 *          the part
	 */
	public synchronized void register(IViewPart part) {
		views.add(part);
	}

	/**
	 * Removes the.
	 * 
	 * @param part
	 *          the part
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

	/**
	 * Creates the view part.
	 * 
	 * @param id
	 *          the id
	 * @param editorInput
	 *          the editor input
	 * @param name
	 *          the name
	 */
	public IViewPart createViewPart(final String id, final ModelInput editorInput, final String name) {
		PartCreator creator = new PartCreator(name, editorInput, id);
		PlatformUI.getWorkbench().getDisplay().syncExec(creator);
		return creator.getPart();
	}

	/**
	 * Close view.
	 * 
	 * @param part
	 *          the part
	 */
	public void closeView(final IViewPart part) {
		if (PlatformUI.getWorkbench() != null) {
			Display display = PlatformUI.getWorkbench().getDisplay();
			if (!display.isDisposed()) {
				display.asyncExec(new Runnable() {
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
				@Override
				public void run() {
					removed(part);
				}
			}.start();
		}
	}

	/**
	 * Removes the.
	 * 
	 * @param model
	 *          the model
	 */
	public synchronized void remove(final IModel model) {
		if (models.remove(model)) {
			modelForRunner.remove(model.getEngine());
			runnerForModel.remove(model);
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
			StatusManager.getManager().handle(new Status(Status.WARNING, "org.eclipse.amp.axf.ui", "Removing a model that no longer exists:" + model, new Exception()));
		}
	}

	private IWorkbenchPage getPage() {
		// TODO this is a quick hack and assumed we only have one workbench window
		// and one page
		final IWorkbench wb = AXFWorkbenchPlugin.getDefault().getWorkbench();
		return wb.getWorkbenchWindows()[0].getPages()[0];
	}

	private synchronized void activate() {
		final IWorkbench wb = AXFWorkbenchPlugin.getDefault().getWorkbench();

		wb.addWorkbenchListener(new IWorkbenchListener() {
			public void postShutdown(IWorkbench workbench) {
				//
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

		viewsForModel = new HashMap<IModel, List<IViewPart>>();
		runnerForModel = new HashMap<IModel, IEngine>();
		modelActivationListener = new ActivationListener();
		activeModelListeners = new LifeCycleListeners();

		getPage().addPartListener(modelActivationListener);
		statusLineView = StatusLineView.getDefault();
		getPage().addPartListener(statusLineView);
		getActiveModelListeners().addListener(statusLineView);
		activatePerspective(wb, executionPerspective, false);

		wb.getDisplay().syncExec(new Runnable() {
			public void run() {
				try {
					contextService = (IContextService) wb.getService(IContextService.class);
					ideContext = contextService.activateContext("org.eclipse.amp.axf.executionContext");
					partContext = contextService.activateContext("org.eclipse.amp.axf.activeEditorContext");

				} catch (Exception e) {
					throw new RuntimeException("Couldn't activate services.", e);
				}
			}
		});
	}

	private void activatePerspective(final IWorkbench wb, final String perspectiveID, final boolean editors) {
		wb.getDisplay().syncExec(new Runnable() {
			public void run() {
				IPerspectiveDescriptor perspective = wb.getPerspectiveRegistry().findPerspectiveWithId(perspectiveID);
				if (perspective != null) {
					IWorkbenchPage activePage = wb.getActiveWorkbenchWindow() != null ? wb.getActiveWorkbenchWindow().getActivePage() : null;
					if (activePage != null) {
						if (priorPerspectiveID == null || !activePage.getPerspective().getId().equals(executionPerspective)) {
							priorPerspectiveID = activePage.getPerspective().getId();
						}
						activePage.setPerspective(perspective);
						activePage.setEditorAreaVisible(editors);
					}
				}
			}
		});
	}

	private synchronized void deactivate() {
		final IWorkbench wb = AXFWorkbenchPlugin.getDefault().getWorkbench();
		if (wb != null) {
			wb.getDisplay().asyncExec(new Runnable() {
				public void run() {
					if (contextService != null) {
						contextService.deactivateContext(ideContext);
						contextService.deactivateContext(partContext);
					}
				}
			});
			getPage().removePartListener(modelActivationListener);
			getPage().removePartListener(statusLineView);
			if (priorPerspectiveID != null) {
				activatePerspective(wb, priorPerspectiveID, true);
			}
			// We don't want references to these resources hanging around if not
			// needed
			modelActivationListener = null;
			statusLineView = null;
			activeModelListeners = null;
		}
	}

	/**
	 * @param adaptableObject
	 * @param adapterType
	 * @return
	 * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object,
	 *      java.lang.Class)
	 */
	public Object getAdapter(Object adaptableObject, Class adapterType) {
		if (adapterType == IEngine.class && adaptableObject instanceof IModel) {
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
	@SuppressWarnings("rawtypes")
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
	 * @param editSelection
	 *          the new selection synchronizer
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

	public LifeCycleListeners getActiveModelListeners() {
		return activeModelListeners;
	}

	/**
	 * @return the managerViewPart
	 */
	public ModelManagerViewPart getManagerViewPart() {
		return managerViewPart;
	}

	/**
	 * @param managerViewPart
	 *          the managerViewPart to set
	 */
	public void setManagerViewPart(ModelManagerViewPart managerViewPart) {
		this.managerViewPart = managerViewPart;
	}

	/**
	 * @return {@link #executionPerspective}
	 */
	public String getExecutionPerspective() {
		return executionPerspective;
	}

	/**
	 * @param executionPerspective
	 *          {@link #executionPerspective}
	 */
	public void setExecutionPerspective(String executionPerspective) {
		this.executionPerspective = executionPerspective;
	}

}
