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
import java.util.Collection;

import org.eclipse.amp.axf.core.AbstractLifecycleListener;
import org.eclipse.amp.axf.core.ILifeCycleListener;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.core.IObservationProvider;
import org.eclipse.amp.axf.ide.handlers.ModelRunHandler;
import org.eclipse.amp.axf.ide.view.RunMonitorView;
import org.eclipse.amp.axf.ide.view.StatusLineView;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.plugin.AbstractUIPlugin;

// TODO: Auto-generated Javadoc
/**
 * Provides a hierarchical view of all active models and views.
 */
public class ModelManagerViewPart extends ViewPart {

	static final Image RUN_IMAGE = AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.amp.axf.ide", "icons/etool16/run_exc.gif").createImage();

	static final Image PAUSE_IMAGE = AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.amp.axf.ide", "icons/etool16/run_pause.gif").createImage();

	static final Image STOP_IMAGE = AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.amp.axf.ide", "icons/etool16/run_stop.gif").createImage();

	static final Image CLOSE_IMAGE = AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.amp.axf.ide", "icons/etool16/run_close.gif").createImage();

	ILifeCycleListener genericListener = new GenericListener();

	/**
	 * 
	 * @author mparker
	 * 
	 */
	private final class GenericListener extends AbstractLifecycleListener {
		/**
		 * @param observed
		 * @see org.eclipse.amp.axf.core.AbstractLifecycleListener#observationEnd(org.eclipse.amp.axf.core.IObservationProvider)
		 */
		public void observationEnd(IObservationProvider observed) {
			refreshViewer();
		}

		/**
		 * @param observed
		 * @see org.eclipse.amp.axf.core.AbstractLifecycleListener#observationEnding(org.eclipse.amp.axf.core.IObservationProvider)
		 */
		public void observationEnding(IObservationProvider observed) {
			refreshViewer();
		}

		/**
		 * @param observed
		 * @see org.eclipse.amp.axf.core.AbstractLifecycleListener#observeCreate(org.eclipse.amp.axf.core.IObservationProvider)
		 */
		public void observeCreate(IObservationProvider observed) {
			refreshViewer();
		}

		/**
		 * @param observed
		 * @see org.eclipse.amp.axf.core.AbstractLifecycleListener#observeInitialize(org.eclipse.amp.axf.core.IObservationProvider)
		 */
		public void observeInitialize(IObservationProvider observed) {
			refreshViewer();
		}

		/**
		 * @param observed
		 * @see org.eclipse.amp.axf.core.AbstractLifecycleListener#observeStart(org.eclipse.amp.axf.core.IObservationProvider)
		 */
		public void observeStart(IObservationProvider observed) {
			refreshViewer();
		}

		/**
		 * @param observed
		 * @see org.eclipse.amp.axf.core.AbstractLifecycleListener#observeStop(org.eclipse.amp.axf.core.IObservationProvider)
		 */
		public void observeStop(IObservationProvider observed) {
			refreshViewer();
		}
	}

	/**
	 * 
	 * @author mparker
	 * 
	 */
	private final class ModelLabelProvider extends LabelProvider implements IColorProvider {
		private final ILabelProvider modelLabelProvider;

		/**
		 * @param modelLabelProvider
		 */
		private ModelLabelProvider(ILabelProvider modelLabelProvider) {
			this.modelLabelProvider = modelLabelProvider;
		}

		/**
		 * @param element
		 * @return
		 * @see org.eclipse.jface.viewers.LabelProvider#getText(java.lang.Object)
		 */
		public String getText(Object element) {
			if (element instanceof AbstractLifecycleListener) {
				String name = ((AbstractLifecycleListener) element).getName();
				if (name == null) {
					return element.getClass().getSimpleName();
				}
				return name;
			}
			if (modelLabelProvider != null) {
				String name = modelLabelProvider.getText(element);
				if (name != null) {
					return name;
				}
			}
			if (element instanceof IModel) {
				return getText(((IModel) element).getRoot());
			}
			return super.getText(element);
		}

		/**
		 * @param element
		 * @return
		 * @see org.eclipse.jface.viewers.IColorProvider#getBackground(java.lang.Object)
		 */
		public Color getBackground(Object element) {
			return null;
		}

		/**
		 * @param element
		 * @return
		 * @see org.eclipse.jface.viewers.IColorProvider#getForeground(java.lang.Object)
		 */
		public Color getForeground(Object element) {
			if (element instanceof IModel) {
				final ModelViewManager manager = ModelViewManager.getInstance();
				IModel model = (IModel) element;
				if (manager.getActiveModel() == model) {
					return getViewSite().getShell().getDisplay().getSystemColor(SWT.COLOR_DARK_GREEN);
				} else if (model.getEngine().isPaused() || !model.getEngine().isRunning()) {
					return getViewSite().getShell().getDisplay().getSystemColor(SWT.COLOR_WIDGET_NORMAL_SHADOW);
				}
			}
			return null;
		}

		@Override
		public Image getImage(Object element) {
			if (element instanceof IModel) {
				IModel model = (IModel) element;
				if (model.getEngine().isPaused()) {
					return PAUSE_IMAGE;
				} else if (model.getEngine().isRunning() || model.isActive()) {
					return RUN_IMAGE;
				} else if (model.getEngine().isCloseRequested()) {
					return CLOSE_IMAGE;
				} else if (model.isStopped() && model.isInitialized()) {
					return STOP_IMAGE;
				}
			}
			return null;
		}
	}

	private class ModelContents implements ITreeContentProvider {
		public Object[] getChildren(Object parentElement) {
			if (parentElement instanceof IModel) {
				Collection<ILifeCycleListener> modelListeners = ((IModel) parentElement).getModelListeners();
				Collection<ILifeCycleListener> userModelListeners = new ArrayList<ILifeCycleListener>();
				for (ILifeCycleListener listener : modelListeners) {
					if (!(listener instanceof ModelRunHandler) && !(listener instanceof StatusLineView) && !(listener instanceof RunMonitorView) && listener != genericListener) {
						userModelListeners.add(listener);
					}
				}
				return userModelListeners.toArray();
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

	private class ManagerListener implements IModelWorkbenchListener {

		public void modelActivated(IModel model) {
			refreshViewer();
		}

		public void modelAdded(IModel model) {
			model.addModelListener(genericListener);
			refreshViewer();
		}

		public void modelRemoved(IModel model) {
			model.removeModelListener(genericListener);
			refreshViewer();
		}

		public void viewActivated(IWorkbenchPart part) {
			refreshViewer();
		}

		public void viewAdded(IWorkbenchPart part) {
			refreshViewer();
		}

		public void viewRemoved(IWorkbenchPart part) {
			refreshViewer();
		}
	}

	private TreeViewer viewer;

	public synchronized void refreshViewer() {
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
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				refreshViewer();
			}
		});
	}

	private void assignManager() {
		new Thread() {
			@Override
			public void run() {
				final ModelViewManager manager = ModelViewManager.getInstance();
				ILabelProvider testLabelProvider = (ILabelProvider) Platform.getAdapterManager().getAdapter(manager, ILabelProvider.class);
				while (testLabelProvider == null) {
					testLabelProvider = (ILabelProvider) Platform.getAdapterManager().getAdapter(manager, ILabelProvider.class);
					try {
						Thread.sleep(30);
					} catch (InterruptedException e) {
					}
				}
				// somewhat funky, for implementors that haven't provided a label
				// provider we'll hang out forever..
				// if (modelLabelProvider == null) {
				// StatusManager.getManager().handle(
				// new Status(IStatus.WARNING, "org.eclipse.amp.axf.ide",
				// "No label provider defined for: " + manager));
				// }

				final ILabelProvider modelLabelProvider = (ILabelProvider) Platform.getAdapterManager().getAdapter(manager, ILabelProvider.class);
				viewer.getControl().getDisplay().syncExec(new Runnable() {
					/**
					 * 
					 * @see java.lang.Runnable#run()
					 */
					public void run() {
						ILabelProvider labelProvider = new ModelLabelProvider(modelLabelProvider);
						viewer.setLabelProvider(labelProvider);
						viewer.setInput(manager);
					}
				});
				manager.getManagerListeners().addModelManagerListener(new ManagerListener());
				viewer.addSelectionChangedListener(new ISelectionChangedListener() {
					public void selectionChanged(SelectionChangedEvent event) {
						IStructuredSelection sel = (IStructuredSelection) event.getSelection();
						if (sel.getFirstElement() instanceof IModel) {
							manager.setActiveModel((IModel) sel.getFirstElement());
						}
					}
				});
				getSite().setSelectionProvider(viewer);
				manager.setManagerViewPart(ModelManagerViewPart.this);

			}
		}.start();
	}

	/**
	 * 
	 * @see org.eclipse.ui.part.WorkbenchPart#setFocus()
	 */
	@Override
	public void setFocus() {
	}

}
