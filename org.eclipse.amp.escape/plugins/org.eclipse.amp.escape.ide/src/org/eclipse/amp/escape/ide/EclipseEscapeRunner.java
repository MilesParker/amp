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
package org.eclipse.amp.escape.ide;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;

import org.ascape.AscapeRuntimePlugin;
import org.ascape.model.Agent;
import org.ascape.model.Scape;
import org.ascape.model.event.ControlEvent;
import org.ascape.model.event.ScapeEvent;
import org.ascape.model.event.ScapeListener;
import org.ascape.model.rule.PropogateScapeOnly;
import org.ascape.runtime.NonGraphicRunner;
import org.ascape.runtime.Runner;
import org.eclipse.amp.axf.core.IEngine;
import org.eclipse.amp.axf.core.ILifeCycleListener;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.ide.AXFWorkbenchPlugin;
import org.eclipse.amp.axf.ide.view.DelayView;
import org.eclipse.amp.axf.ide.view.RunMonitorView;
import org.eclipse.amp.axf.time.ITimeGranularity;
import org.eclipse.amp.axf.time.TimeGranularity;
import org.eclipse.amp.escape.ascape.wrap.ModelWrapperScapeListener;
import org.eclipse.amp.escape.ascape.wrap.ScapeWrapperModel;
import org.eclipse.amp.escape.ascape.wrap.ScapeWrapperModelListener;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.statushandlers.StatusManager;

// TODO: Auto-generated Javadoc
/**
 * Create a new instance of a model (scape) and start it running in the eclipse
 * environment.
 */
public class EclipseEscapeRunner extends NonGraphicRunner implements IEngine {

	private static final long serialVersionUID = 1L;

	protected ProjectLoader delegateLoader;

	protected IProgressMonitor modelMonitor;

	IModel model;

	private IStatus finishStatus = Status.OK_STATUS;

	TimeGranularity updateGranularity = TimeGranularity.DEFAULT_GRANULARITY;

	public final static long KILL_AFTER_NO_RESPONSE_TIME = 5000;

	// would be nice to have this in Ascape proper but not worth IP submission
	private boolean closeOnStop = false;


	/**
	 * {@link #open(String, String, String[], boolean) Open} a workspace model
	 * with no args. Sets up the {@link ProjectLoader} class loader that loads
	 * workspace resources. Waits until execution has stopped before returning
	 * (ie: this method blocks).
	 * 
	 * @param modelResource
	 *            the model resource
	 * @param scapeClassName
	 *            the model class name
	 * @param scapeName
	 *            the model name
	 */
	public void open(final IResource modelResource,
			final String scapeClassName, String scapeName) {
		open(modelResource, scapeClassName, scapeName, new String[0]);
	}

	/**
	 * {@link #open(String, String, String[], boolean) Open} a workspace model
	 * with supplied args. Sets up the {@link ProjectLoader} class loader that
	 * loads workspace resources. Waits until execution has stopped before
	 * returning (ie: this method blocks).
	 * 
	 * @param projectResource
	 *            the project resource
	 * @param scapeClassName
	 *            the scape class name
	 * @param scapeName
	 *            the scape name
	 * @param args
	 *            parameter arguments for the scape
	 */
	public void open(final IResource projectResource,
			final String scapeClassName, String scapeName, String[] args) {
		open(projectResource, scapeClassName, scapeName, args, true);
	}

	/**
	 * {@link #open(String, String, String[], boolean) Open} a workspace model
	 * with supplied args. Sets up the {@link ProjectLoader} class loader that
	 * loads workspace resources.
	 * 
	 * @param projectResource
	 *            the project resource
	 * @param scapeClassName
	 *            the scape class name
	 * @param scapeName
	 *            the scape name
	 * @param args
	 *            parameter arguments for the scape
	 * @param block
	 *            true if this method should only return on execution
	 *            completion.
	 */
	public void open(final IResource projectResource,
			final String scapeClassName, String scapeName, String[] args,
			boolean block) {

		try {
			delegateLoader = new ProjectLoader(projectResource.getProject());
		} catch (LoaderCreationException e) {
			StatusManager
					.getManager()
					.handle(new Status(
							Status.WARNING,
							scapeName,
							"Couldn't create project classloader; falling back to default loader", e));
		} catch (MalformedURLException e) {
			StatusManager
					.getManager()
					.handle(new Status(
							Status.WARNING,
							scapeName,
							"Couldn't create project classloader; falling back to default loader",
							e));
		}
		open(scapeClassName, scapeName, args, block);
	}

	/**
	 * {@link #open(String, String, String[], boolean) Open} a model with no
	 * args. Waits until execution has stopped before returning (ie: this method
	 * blocks).
	 * 
	 * @param scapeClassName
	 *            the scape class name
	 * @param scapeName
	 *            the scape name
	 */
	public void open(final String scapeClassName, String scapeName) {
		open(scapeClassName, scapeName, new String[0]);
	}

	/**
	 * {@link #open(String, String, String[], boolean) Open} a model with
	 * supplied args. Waits until execution has stopped before returning (ie:
	 * this method blocks).
	 * 
	 * @param scapeClassName
	 *            the scape class name
	 * @param scapeName
	 *            the scape name
	 * @param args
	 *            parameter arguments for the scape
	 */
	public void open(final String scapeClassName, String scapeName,
			String[] args) {
		open(scapeClassName, scapeName, args, true);
	}

	/**
	 * Open a model. A instance of the scape specified is created using the
	 * using the current thread's context class loader. This will be
	 * {@link ProjectLoader} if
	 * {@link #open(IResource, String, String, String[], boolean) open} is used
	 * or otherwise {@link org.eclipse.core.runtime.internal.adaptor.ContextFinder}.
	 * <p>
	 * If the {@link org.eclipse.core.runtime.internal.adaptor.ContextFinder} class 
	 * loader is in use then this <a href=
	 * "http://wiki.eclipse.org/index.php/Context_Class_Loader_Enhance2ments#Search_Order"
	 * > search logic</a> is used to locate the scape class. For this to work
	 * the bundle containing the scape class ought to have the following in its
	 * MANIFEST.MF:
	 * 
	 * <pre>
	 * Eclipse-RegisterBuddy: org.ascape.core
	 * Import-Package: org.ascape.runtime
	 * </pre>
	 * 
	 * @param scapeClassName
	 *            the class name of the scape
	 * @param scapeName
	 *            the name of the scape
	 * @param args
	 *            parameter arguments for the scape
	 * @param block
	 *            true if this method should only return on execution
	 *            completion.
	 */
    public void open(final String scapeClassName, String scapeName, 
    		String[] args, boolean block) {
		setStartOnOpen(false);
		setAutoRestart(false);
        final MessageConsole eclipseConsole = new MessageConsole("Run " + scapeName, null);
        getEnvironment().getConsole().setIMessageStream(new MessageAdapter(eclipseConsole));
		IConsole[] consules = { eclipseConsole };
		ConsolePlugin.getDefault().getConsoleManager().addConsoles(consules);
		eclipseConsole.activate();
		AscapeRuntimePlugin.getDefault();
        
        Scape newScape;
        try {
        	// create instance using the current thread's context class loader
        	// this will be ProjectLoader or ContextFinder 
            newScape = (Scape) instanceFromName(scapeClassName);
        } catch (RuntimeException e) {
            StatusManager.getManager().handle(
                                              new Status(Status.ERROR, scapeName, "Could not read class: "
                                                         + scapeClassName
                                                         + ". Please ensure that the class exists in class path.", e),
                                                         StatusManager.SHOW | StatusManager.LOG);
			dispose();
			throw e;
		}
        newScape.setName(scapeName);
        setRootScape(newScape);
		model = new ScapeWrapperModel(getRootScape());
        
        // register this model with the ModelViewManager
        AXFWorkbenchPlugin.getDefault().getManager().register(model, this, getRootScape());
        
		// getModel().addModelListener(new ModelMonitorView(modelMonitor));
		// getModel().addModelListener(new ControlViewProxy());
		try {
			open(args, true);
		} catch (RuntimeException e) {
			closeFinally();
			throw e;
		}
		final List<ScapeListener> newListeners = new ArrayList<ScapeListener>();
		getRootScape().executeOnRoot(new PropogateScapeOnly() {
			private static final long serialVersionUID = -6277857634508661314L;

			@SuppressWarnings("unchecked")
			@Override
			public void execute(Agent agent) {
				newListeners.addAll(((Scape) agent).getScapeListeners());
				super.execute(agent);
			}
		});
		for (ScapeListener scapeListener : newListeners) {
			if (!(scapeListener instanceof ModelWrapperScapeListener)) {
				ScapeWrapperModelListener listenerWrapper = new ScapeWrapperModelListener(
						getRootScape(), scapeListener);
				model.addModelListener(listenerWrapper);
			}
		}
		start();
		if (block) {
			while (!modelShutdown) {
				try {
					Thread.sleep(30L);
				} catch (InterruptedException e) {
				}
			}
		}
	}

    /**
     * Create an object instance using loadclass on the current thread's context class loader.
     * If that fails, use Class.forName.
     * 
     * NB:
     * This is a duplicate of {@link Runner#instanceFromName(String)} from org.ascape.core.
     * It is duplicated here so that the Eclipse-BuddyPolicy of org.eclipse.amp.escape.ide
     * is used instead of the Eclipse-BuddyPolicy of org.ascape.core.
     * 
     * @param className class name of object to create
     * @return new instance of className
     */
    @Override
    public Object instanceFromName(String className) {
        Object newObject;
        try {
            newObject = Thread.currentThread().getContextClassLoader().loadClass(className).newInstance();
        } catch (NullPointerException e) {
            throw new RuntimeException("An error ocurred while attempting to read " + className + ": " + e.getMessage(), e);
        } catch (InstantiationException e) {
            throw new RuntimeException("An error ocurred while attempting to read " + className + ": " + e.getMessage(), e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("An error ocurred while attempting to read " + className + ": " + e.getMessage(), e);
        } catch (ClassNotFoundException e) {
            try {
                Class c = Class.forName(className);
                newObject = c.newInstance();
            } catch (Exception e2) {
                throw new RuntimeException("Couldn't find class: " + className);
            }
        }
        return newObject;
    }
    
    
	private void removeModel() {
		if (AXFWorkbenchPlugin.getDefault().getManager() != null) {
			new Thread() {
				/**
				 * 
				 * @see java.lang.Thread#run()
				 */
				public void run() {
					if (AXFWorkbenchPlugin.getDefault().getManager()
							.getModels().contains(model)) {
						AXFWorkbenchPlugin.getDefault().getManager()
								.remove(model);
					}
				}
			}.start();
		}
		modelShutdown = true;
	}

	private void dispose() {
		// if (AXFWorkbenchPlugin.getDefault().getManager() != null) {
		// new Thread() {
		// /**
		// *
		// * @see java.lang.Thread#run()
		// */
		// public void run() {
		// AXFWorkbenchPlugin.getDefault().getManager().remove(model);
		// }
		// }.start();
		// }
		if (delegateLoader != null) {
			delegateLoader.restore();
		}
		delegateLoader = null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ascape.runtime.Runner#start()
	 */
	/**
	 * 
	 * @see org.ascape.runtime.Runner#start()
	 */
	public void start() {
		escapeRun = new Job("Run " + getModel().getName()) {
			protected IStatus run(IProgressMonitor runMonitor) {
				try {
					setMonitor(runMonitor);
					RunMonitorView runMonitorView = new RunMonitorView(
							runMonitor);
					getModel().addModelListener(runMonitorView);
					DelayView delayView = new DelayView();
					getModel().addModelListener(delayView);
					// do {
					try {
						EclipseEscapeRunner.this.run();
						if (closeOnStop) {
							close();
						}
					} catch (RuntimeException e) {
						closeFinally();
						throw e;
					}
					// } while (isRestartRequested());
					getModel().removeModelListener(runMonitorView);
				} catch (RuntimeException e) {
					String message = "An exception occurred: ";
					if (model != null) {
                        message = "An exception occurred when running: " + getModel().getName();
                    }
                    StatusManager.getManager().handle(new Status(Status.ERROR, getModel().getName(), message, e),
							StatusManager.SHOW | StatusManager.LOG);
					if (closeOnStop) {
						close();
					} else {
						stop();
					}
				}
				return Status.OK_STATUS;
			}

			protected void canceling() {
				close();
			}
		};
		escapeRun.setPriority(Job.SHORT);
		escapeRun.schedule();
	}

	boolean modelShutdown = false;

	private Job escapeRun;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ascape.runtime.Runner#close()
	 */
	/**
	 * 
	 * @see org.ascape.runtime.Runner#close()
	 */
	@SuppressWarnings("deprecation")
	@Override
	public void close() {
		if (!isCloseRequested()) {
			setCloseRequested(true);
			Thread closeThread = new Thread(this, "Close Escape Model") {
				public void run() {
					setPaused(false);
					EclipseEscapeRunner.super.close();
				}
			};
			closeThread.start();
		}
		if (modelMonitor != null) {
			modelMonitor.setTaskName("Waiting for Close...");
		}
		try {
			long elapsed = 0;
			while (isCloseRequested() && getModelThread() != null
					&& getModelThread().isAlive()
					&& elapsed <= KILL_AFTER_NO_RESPONSE_TIME) {
				if (elapsed >= KILL_AFTER_NO_RESPONSE_TIME) {
					if (modelMonitor != null) {
						modelMonitor.setTaskName("Forcing Close");
					}
					EscapeIDEPlugin.warn(
							"Couldn't close model normally, forcing stop.",
							null);
					if (escapeRun != null) {
						escapeRun.getThread().stop();
					}
					closeFinally();
				}
				Thread.sleep(30);
				elapsed += 30;
			}
		} catch (InterruptedException e) {
		}
		if (modelMonitor != null) {
			modelMonitor.setTaskName("Closed");
		}
		modelShutdown = true;
	}

	/**
	 * 
	 * @see org.ascape.runtime.Runner#closeFinally()
	 */
	public void closeFinally() {
		super.closeFinally();
		modelShutdown = true;
		((ScapeWrapperModel) getModel()).setClosed(true);
		removeModel();
		dispose();
	}

	/**
	 * Gets the finish status.
	 * 
	 * @return the finish status
	 */
	public IStatus getFinishStatus() {
		return finishStatus;
	}

	/**
	 * Sets the finish status.
	 * 
	 * @param finishStatus
	 *            the new finish status
	 */
	public void setFinishStatus(IStatus finishStatus) {
		this.finishStatus = finishStatus;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.amp.axf.core.IEngine#getModel()
	 */
	/**
	 * 
	 * @see org.eclipse.amp.axf.core.IEngine#getModel()
	 */
	public IModel getModel() {
		return model;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.amp.axf.core.IEngine#getIterationsPerRedraw()
	 */
	/**
	 * 
	 * @see org.eclipse.amp.axf.core.IEngine#getIterationsPerRedraw()
	 */
	public int getIterationsPerRedraw() {
		return getScape().getIterationsPerRedraw();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.ascape.runtime.Runner#respondControl(org.ascape.model.event.ControlEvent
	 * )
	 */
	/**
	 * 
	 * @see org.ascape.runtime.Runner#respondControl(org.ascape.model.event.ControlEvent)
	 */
	public void respondControl(final org.ascape.model.event.ControlEvent control) {
		new Thread(new Runnable() {
			public void run() {
				EclipseEscapeRunner.super.respondControl(control);
			}
		}).start();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.amp.axf.core.IEngine#control(org.eclipse.amp.axf.core.
	 * EngineControl)
	 */
	/**
	 * 
	 * @see org.eclipse.amp.axf.core.IEngine#control(org.eclipse.amp.axf.core.EngineControl)
	 */
	public void control(org.eclipse.amp.axf.core.EngineControl control) {
		super.respondControl(adaptEngineControl(control));
	}

	private ControlEvent adaptEngineControl(
			org.eclipse.amp.axf.core.EngineControl control) {
		int id = 0;
		switch (control) {
		case OPEN:
			id = ControlEvent.REQUEST_OPEN;
			break;
		case START:
			id = ControlEvent.REQUEST_START;
			break;
		case RESTART:
			id = ControlEvent.REQUEST_RESTART;
			break;
		case STEP:
			id = ControlEvent.REQUEST_STEP;
			break;
		case PAUSE:
			id = ControlEvent.REQUEST_PAUSE;
			break;
		case RESUME:
			id = ControlEvent.REQUEST_RESUME;
			break;
		case STOP:
			id = ControlEvent.REQUEST_STOP;
			break;
		case CLOSE:
			id = ControlEvent.REQUEST_CLOSE;
			break;
		case SAVE:
			id = ControlEvent.REQUEST_SAVE;
			break;
		default:
			throw new RuntimeException("Couldn't convert control: " + control);
		}
		return new org.ascape.model.event.ControlEvent(getScape(), id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.ascape.runtime.Runner#notify(org.ascape.model.event.ScapeEvent,
	 * org.ascape.model.event.ScapeListener)
	 */
	/**
	 * 
	 * @see org.ascape.runtime.Runner#notify(org.ascape.model.event.ScapeEvent,
	 *      org.ascape.model.event.ScapeListener)
	 */
	public void notify(final ScapeEvent event, final ScapeListener listener) {
		// new Thread() {
		// public void run() {
		listener.scapeNotification(event);
		// }
		// }.start();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.amp.axf.core.IEngine#setIterationsPerRedraw(int)
	 */
	/**
	 * 
	 * @see org.eclipse.amp.axf.core.IEngine#setIterationsPerRedraw(int)
	 */
	public void setIterationsPerRedraw(int iterations) {
		getScape().setIterationsPerRedraw(iterations);
	}

	/**
	 * Gets the scape.
	 * 
	 * @return the scape
	 */
	public Scape getScape() {
		return getRootScape();
	}

	/**
	 * Gets the monitor.
	 * 
	 * @return the monitor
	 */
	public IProgressMonitor getMonitor() {
		return modelMonitor;
	}

	/**
	 * Sets the monitor.
	 * 
	 * @param modelMonitor
	 *            the new monitor
	 */
	public void setMonitor(IProgressMonitor modelMonitor) {
		this.modelMonitor = modelMonitor;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.amp.axf.core.IEngine#observationComplete(org.eclipse.amp.
	 * axf.core.ILifeCycleListener)
	 */
	/**
	 * 
	 * @see org.eclipse.amp.axf.core.IEngine#observationComplete(org.eclipse.amp.axf.core.ILifeCycleListener)
	 */
	public void observationComplete(ILifeCycleListener observer) {
		// respondControl(new org.ascape.model.event.ControlEvent(getScape(),
		// ControlEvent.REPORT_LISTENER_UPDATED));
	}

	/**
     * @return granularity
     * @see org.eclipse.amp.axf.core.IEngine#getUpdateGranularity()
     */
	public ITimeGranularity getUpdateGranularity() {
		return updateGranularity;
	}

	/**
	 * @param granularity
	 * @see org.eclipse.amp.axf.core.IEngine#setUpdateGranularity(org.eclipse.amp.axf.time.ITimeGranularity)
	 */
	public void setUpdateGranularity(ITimeGranularity granularity) {
		this.updateGranularity = (TimeGranularity) granularity;
	}

	/**
	 * Should the model exit upon a stop command?
	 * 
	 * @see #setCloseOnStop
	 * @return whether to complete run on model stop; default is false
	 */
	public boolean isCloseOnStop() {
		return closeOnStop;
	}

	/**
	 * Specifies whether the runner should exit upon a model stop. The default
	 * behavior is false, which leaves the model open (and typically able to
	 * restart) until explicitly closed. For batch runs we don't want the model
	 * to stay open as that requires a view notification and response to close
	 * it. It's probably cleaner to allow the runner to exit immediately rather
	 * than wait for a listener to trigger one.
	 * 
	 * Note that the model will not stop in the case where a restart has been
	 * requested, and listener's will be notified of a model stop before
	 * actually closing. This gives output control listeners -- for a parameter
	 * sweep control, for example -- an opportunity to set restart to request a
	 * restart. It also implies that it makes no sense to have autoRestart true
	 * if this value is also true. Since auto-restart is by default true, be
	 * sure to set it to false.
	 * 
	 * This setting can be safely changed during a model run.
	 * 
	 * @param closeOnStop
	 *            whether to complete run on model stop; default is false
	 */
	public void setCloseOnStop(boolean closeOnStop) {
		this.closeOnStop = closeOnStop;
	}

	// public Object getAdapter(Object adaptableObject, Class adapterType) {
	// if (adapterType == IExecutor.class) {
	// return runnerForModel.get(adaptableObject);
	// } else if (adapterType == IModel.class) {
	// return modelForRunner.get(adaptableObject);
	// }
	// return null;
	// }
	//
	// public Class[] getAdapterList() {
	// return new Class[]{Scape.class, IModel.class};
	// }

	// public static boolean listenerRegister(Model target, Object listener) {
	// return registeredListeners.put(target, listener.getClass()) == null;
	// }
	//
	// public static void addSingletonViewers(Model target, EditPart registor) {
	// if (!listenerRegister(target, ControlViewProxy.class)) {
	// model.addView(new ControlViewProxy(registor));
	// }
	// IStatusLineManager status =
	// getEditorSite().getActionBars().getStatusLineManager();
	// model.addView(new StatusLineView(status));
	// }
}
