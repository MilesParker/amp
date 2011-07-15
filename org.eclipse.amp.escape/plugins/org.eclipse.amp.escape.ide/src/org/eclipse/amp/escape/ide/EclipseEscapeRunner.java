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
import org.eclipse.amp.axf.core.EngineStateAdapter;
import org.eclipse.amp.axf.core.IEngine;
import org.eclipse.amp.axf.core.IEngineObserver;
import org.eclipse.amp.axf.core.ILifeCycleListener;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.ide.ModelViewManager;
import org.eclipse.amp.axf.ide.view.DelayView;
import org.eclipse.amp.axf.ide.view.RunMonitorView;
import org.eclipse.amp.axf.time.ITimeGranularity;
import org.eclipse.amp.axf.time.TimeGranularity;
import org.eclipse.amp.escape.ascape.wrap.ModelWrapperScapeListener;
import org.eclipse.amp.escape.ascape.wrap.ScapeWrapperModel;
import org.eclipse.amp.escape.ascape.wrap.ScapeWrapperModelListener;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.statushandlers.StatusManager;

/**
 * The Class EclipseEscapeRunner.
 */
public class EclipseEscapeRunner extends NonGraphicRunner implements IEngine {

	private static final long serialVersionUID = 1L;

	protected ProjectLoader delegateLoader;

	protected IProgressMonitor modelMonitor;

	private IModel model;

	private IProject project;

	private IStatus finishStatus = Status.OK_STATUS;

	private ITimeGranularity updateGranularity = TimeGranularity.DEFAULT_GRANULARITY;

	public final static long KILL_AFTER_NO_RESPONSE_TIME = 5000;

	// would be nice to have this in Ascape proper but not worth IP submission
	private boolean closeOnStop = false;

	boolean modelShutdown = false;

	private Job escapeRun;

	private ArrayList<IEngineObserver> observers = new ArrayList<IEngineObserver>();

	private EngineStateAdapter engineStateAdapter = new EngineStateAdapter(isRunning(), isStep(), isPaused(),
			getPeriod() == getStopPeriod());

	/**
	 * Open.
	 * 
	 * @param modelResource
	 *          the model resource
	 * @param modelClassName
	 *          the model class name
	 * @param modelName
	 *          the model name
	 */
	public void open(final IResource modelResource, final String modelClassName, String modelName) {
		open(modelResource, modelClassName, modelName, new String[0]);
	}

	/**
	 * Open. Wait until execution has stopped to return.
	 * 
	 * @param projectResource
	 *          the project resource
	 * @param modelClassName
	 *          the model class name
	 * @param modelName
	 *          the model name
	 * @param args
	 *          the args
	 */
	public void open(final IResource projectResource, final String modelClassName, String modelName, String[] args) {
		open(projectResource, modelClassName, modelName, args, true);
	}

	/**
	 * Open.
	 * 
	 * @param projectResource
	 *          the project resource
	 * @param modelClassName
	 *          the model class name
	 * @param modelName
	 *          the model name
	 * @param args
	 *          the args
	 * @param block
	 *          true if this method should only return on execution completion.
	 */
	public void open(final IResource projectResource, final String modelClassName, String modelName, String[] args,
			boolean block) {
		openNotStart(projectResource, modelClassName, modelName, args);
		start();
		if (block) {
			while (!modelShutdown) {
				try {
					Thread.sleep(30L);
				} catch (InterruptedException e) {
					//
				}
			}
		}
	}

	/**
	 * Open all Files and initialize the Simulation, but don't run it.
	 * 
	 * @param projectResource
	 * @param modelClassName
	 * @param modelName
	 * @param args
	 */
	public void openNotStart(final IResource projectResource, final String modelClassName, String modelName, String[] args) {
		this.project = projectResource.getProject();
		setStartOnOpen(false);
		setAutoRestart(false);
		addConsole(modelName);
		AscapeRuntimePlugin.getDefault();
		try {
			delegateLoader = new ProjectLoader(projectResource.getProject());
		} catch (LoaderCreationException e) {
			StatusManager.getManager().handle(
					new Status(Status.WARNING, project.getName(),
							"Couldn't create project classloader; falling back to default loader", e));
		}
		Scape newAgent;
		try {
			newAgent = (Scape) instanceFromName(modelClassName);
		} catch (RuntimeException e) {
			StatusManager.getManager().handle(
					new Status(Status.ERROR, project.getName(), "Could not read class: " + modelClassName
							+ ". Please ensure that the class exists in class path.", e), StatusManager.SHOW | StatusManager.LOG);
			dispose();
			throw e;
		}
		newAgent.setName(modelName);
		setRootScape(newAgent);
		model = new ScapeWrapperModel(getRootScape());
		ModelViewManager.getInstance().register(model, this, getRootScape());
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
				ScapeWrapperModelListener listenerWrapper = new ScapeWrapperModelListener(getRootScape(), scapeListener);
				model.addModelListener(listenerWrapper);
			}
		}
	}

	protected void addConsole(String modelName) {
		final MessageConsole eclipseConsole = new MessageConsole("Run " + modelName, null);
		getEnvironment().getConsole().setIMessageStream(new MessageAdapter(eclipseConsole));
		IConsole[] consules = { eclipseConsole };
		ConsolePlugin.getDefault().getConsoleManager().addConsoles(consules);
		eclipseConsole.activate();
	}

	private void removeModel() {
		if (ModelViewManager.getInstance().getModels().contains(model)) {
			ModelViewManager.getInstance().remove(model);
		}
		modelShutdown = true;
	}

	private void dispose() {
		if (delegateLoader != null) {
			delegateLoader.restore();
		}
		delegateLoader = null;
	}

	@Override
	public void start() {
		escapeRun = new Job("Run " + getModel().getName()) {

			@Override
			protected IStatus run(IProgressMonitor runMonitor) {
				try {
					setMonitor(runMonitor);
					RunMonitorView runMonitorView = new RunMonitorView(runMonitor);
					getModel().addModelListener(runMonitorView);
					DelayView delayView = new DelayView();
					getModel().addModelListener(delayView);
					// do {
					try {
						EclipseEscapeRunner.this.run();
						if (isCloseOnStop()) {
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
					StatusManager.getManager().handle(new Status(Status.ERROR, project.getName(), message, e),
							StatusManager.SHOW | StatusManager.LOG);
					if (isCloseOnStop()) {
						close();
					} else {
						stop();
					}
				}
				return Status.OK_STATUS;
			}

			@Override
			protected void canceling() {
				close();
			}
		};
		escapeRun.setPriority(Job.SHORT);
		escapeRun.schedule();
	}

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

				@Override
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
			while (isCloseRequested() && isThreadAlive() && elapsed <= KILL_AFTER_NO_RESPONSE_TIME) {
				if (elapsed >= KILL_AFTER_NO_RESPONSE_TIME) {
					if (modelMonitor != null) {
						modelMonitor.setTaskName("Forcing Close");
					}
					EscapeIDEPlugin.warn("Couldn't close model normally, forcing stop.", null);
					if (escapeRun != null) {
						escapeRun.getThread().stop();
					}
					closeFinally();
				}
				Thread.sleep(30);
				elapsed += 30;
			}
		} catch (InterruptedException e) {
			//
		}
		if (modelMonitor != null) {
			modelMonitor.setTaskName("Closed");
		}
		modelShutdown = true;
	}

	@Override
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
	 *          the new finish status
	 */
	public void setFinishStatus(IStatus finishStatus) {
		this.finishStatus = finishStatus;
	}

	public IModel getModel() {
		return model;
	}

	public int getIterationsPerRedraw() {
		return getScape().getIterationsPerRedraw();
	}

	@Override
	public void respondControl(final org.ascape.model.event.ControlEvent control) {
		new Thread(new Runnable() {

			public void run() {
				EclipseEscapeRunner.super.respondControl(control);
			}
		}).start();
	}

	public void control(org.eclipse.amp.axf.core.EngineControl control) {
		super.respondControl(adaptEngineControl(control));
	}

	@Override
	public void waitForViewsUpdate() {
		super.waitForViewsUpdate();

		/*
		 * Running, paused and step are not all update using setter methods. So this
		 * is a workaround to not miss any state changes.
		 */
		updateStateAdapter();
	}

	@Override
	public void setPaused(boolean paused) {
		super.setPaused(paused);
		updateStateAdapter();
	}

	@Override
	public void setStep(boolean step) {
		super.setStep(step);
		updateStateAdapter();
	}

	@Override
	public void setRunning(boolean running) {
		super.setRunning(running);
		updateStateAdapter();
	}

	private void updateStateAdapter() {
		if (engineStateAdapter.update(isRunning(), isStep(), isPaused(), getPeriod() == getStopPeriod())) {
			for (IEngineObserver observer : observers) {
				observer.engineStateChanged(this, engineStateAdapter.getState());
			}
		}
	}

	public void addEngineObserver(IEngineObserver observer) {
		if (!observers.contains(observer)) {
			observers.add(observer);
		}
	}

	public void removeEngineObserver(IEngineObserver observer) {
		if (observers.contains(observer)) {
			observers.remove(observer);
		}
	}

	private ControlEvent adaptEngineControl(org.eclipse.amp.axf.core.EngineControl control) {
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

	@Override
	public void notify(final ScapeEvent event, final ScapeListener listener) {
		listener.scapeNotification(event);
	}

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
	 *          the new monitor
	 */
	public void setMonitor(IProgressMonitor modelMonitor) {
		this.modelMonitor = modelMonitor;
	}

	/**
	 * 
	 * @see org.eclipse.amp.axf.core.IEngine#observationComplete(org.eclipse.amp.axf.core.ILifeCycleListener)
	 */
	public void observationComplete(ILifeCycleListener observer) {
		// respondControl(new org.ascape.model.event.ControlEvent(getScape(),
		// ControlEvent.REPORT_LISTENER_UPDATED));
	}

	/**
	 * @return
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
		this.updateGranularity = granularity;
	}

	public IProject getExecutingProject() {
		return project;
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
	 * restart) until explicitly closed. For batch runs we don't want the model to
	 * stay open as that requires a view notification and response to close it.
	 * It's probably cleaner to allow the runner to exit immediately rather than
	 * wait for a listener to trigger one.
	 * 
	 * Note that the model will not stop in the case where a restart has been
	 * requested, and listener's will be notified of a model stop before actually
	 * closing. This gives output control listeners -- for a parameter sweep
	 * control, for example -- an opportunity to set restart to request a restart.
	 * It also implies that it makes no sense to have autoRestart true if this
	 * value is also true. Since auto-restart is by default true, be sure to set
	 * it to false.
	 * 
	 * This setting can be safely changed during a model run.
	 * 
	 * @param closeOnStop
	 *          whether to complete run on model stop; default is false
	 */
	public void setCloseOnStop(boolean closeOnStop) {
		this.closeOnStop = closeOnStop;
	}

	public boolean isThreadAlive() {
		return getModelThread() != null && getModelThread().isAlive();
	}

	public Job getEscapeRun() {
		return escapeRun;
	}
}
