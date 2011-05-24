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

import org.eclipse.amp.escape.ide.EclipseEscapeRunner;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * Execute a Java scape by class name. The scape class name is specified by the
 * command parameter "scapeClassName".
 * 
 * Does not implement any {@link ResourceHandler} functionality (ie:
 * enable/disable based on currently selected resource).
 */
public class ExecuteJavaByClassNameHandler extends ExecuteHandler {

	private transient String scapeName;

	/**
	 * Constructor called when executed via eclipse commmand.
	 */
	public ExecuteJavaByClassNameHandler() {
		this(false);
	}

	/**
	 * Construct {@link ExecuteJavaByClassNameHandler}.
	 * 
	 * @param headless
	 *            headless execution?
	 */
	public ExecuteJavaByClassNameHandler(boolean headless) {
		super(headless);
	}

	/**
	 * Execute the specified scape.
	 * 
	 * @param scapeClassName
	 *            scape class name
	 * @throws ExecutionException
	 *             if problem executing
	 */
	public void execute(String scapeClassName) throws ExecutionException {
		scapeName = scapeClassName
				.substring(scapeClassName.lastIndexOf('.') + 1);
		super.execute(scapeClassName, scapeName);
	}

	/**
	 * Execute the specified scape.Entry point when this handler is called by a
	 * command. Calls {@link #execute(String)} with the value of the
	 * {@code scapeClassName} parameter of the executing command.
	 * 
	 * @param event
	 *            An event containing all the information about the current
	 *            state of the application; must not be <code>null</code>.
	 * @return the result of the execution. Reserved for future use, must be
	 *         <code>null</code>.
	 * @throws ExecutionException
	 *             if an exception occurred during execution.
	 */
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		String scapeClassName = event.getParameter("scapeClassName");
		if (scapeClassName != null) {
			execute(scapeClassName);
		}
		return null;
	}

	/**
	 * Open the scape via the supplied eclipse runner. Called by a new job
	 * created by {@link ExecuteHandler#execute(Object, String)}.
	 * 
	 * @param eclipseRunner
	 *            eclipse runner
	 * @param executed
	 *            scape class name
	 * @param monitor
	 *            progress monitor
	 */
	@Override
	protected void executeOpen(final EclipseEscapeRunner eclipseRunner,
			final Object executed, IProgressMonitor monitor) {
		String scapeClassName = (String) executed;
		eclipseRunner.open(scapeClassName, scapeName);
	}

	@Override
	public void setEnabled(Object evaluationContext) {
		// we don't work with resources so do nothing (much like
		// AbstractHandler)
	}

	@Override
	protected boolean handleSelect(Object sel) {
		// we don't work with resources so just return true
		return true;
	}

}
