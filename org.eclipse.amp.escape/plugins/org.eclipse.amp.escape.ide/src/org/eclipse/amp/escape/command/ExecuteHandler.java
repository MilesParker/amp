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
package org.eclipse.amp.escape.command;

import org.ascape.runtime.Runner;
import org.eclipse.amp.escape.ide.EclipseEscapeRunner;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.expressions.IEvaluationContext;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.viewers.IStructuredSelection;

// TODO: Auto-generated Javadoc
/**
 * The Class ExecuteHandler.
 */
public abstract class ExecuteHandler extends ResourceHandler {

    private boolean headless;

    /**
     * Instantiates a new execute handler.
     * 
     * @param headless the headless
     */
    public ExecuteHandler(boolean headless) {
        super();
        this.setHeadless(headless);
    }

    /**
     * Starts a new job with a {@link EclipseEscapeRunner} that executes 
     * the scape.
     * 
     * @param executed scape resource/class name to execute
     * @param name scape name
     * @throws ExecutionException if problem executing
     */
    @Override
    public final void execute(final Object executed, String name) throws ExecutionException {
        Job escapeRun = new Job("Run " + name) {
        	private EclipseEscapeRunner eclipseRunner;
            @Override
						protected IStatus run(IProgressMonitor monitor) {
                setMonitor(monitor);
                try {
                    eclipseRunner = executeOpen(executed, monitor);
                } catch (RuntimeException e) {
                    setMonitor(null);
                    throw e;
                }
                setMonitor(null);
                if(eclipseRunner != null){
                	return eclipseRunner.getFinishStatus();
                }else{
                	return Status.CANCEL_STATUS;
                }
            }

            @Override
						protected void canceling() {
            	if(eclipseRunner != null){
                eclipseRunner.setFinishStatus(Status.CANCEL_STATUS);
                eclipseRunner.closeFinally();
            	}
            }
        };
        escapeRun.setPriority(Job.LONG);
        escapeRun.schedule();
    }

    /**
     * Execute open.
     * 
     * @param executed the executed scape resource/name
     * @param monitor the monitor
     */
    protected abstract EclipseEscapeRunner executeOpen(final Object executed,
            IProgressMonitor monitor);

    /**
     * Creates the runner.
     * 
     * @return the eclipse escape runner
     */
    protected EclipseEscapeRunner createRunner() {
        // TODO this is still static on Ascape side..trouble if we attempt to run headless and non-headless jobs
        Runner.setDisplayGraphics(!isHeadless());
        return new EclipseEscapeRunner();
    }


    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.core.commands.AbstractHandler#setEnabled(java.lang.Object)
     */
    @Override
    public void setEnabled(Object evaluationContext) {
        IEvaluationContext ctx = (IEvaluationContext) evaluationContext;
        Object selection = ctx.getVariable("selection");
        if (selection instanceof IStructuredSelection) {
            boolean enabled = false;
            IStructuredSelection ss = (IStructuredSelection) selection;
            if (ss != null && ss.getFirstElement() != null) {
                Object fs = ss.getFirstElement();
                enabled = handleSelect(fs);
            }
            // } else if (selection instanceof ITextSelection) {
            // enabled = handleSelect(selection);
            setBaseEnabled(enabled);
        }
    }

    /**
     * Handle select.
     * 
     * @param sel the sel
     * 
     * @return true, if successful
     */
    protected abstract boolean handleSelect(Object sel);

    public void setHeadless(boolean headless) {
        this.headless = headless;
    }

    public boolean isHeadless() {
        return headless;
    }
}
