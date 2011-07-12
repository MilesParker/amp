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
package org.eclipse.amp.axf.ide.handlers;

import org.eclipse.amp.axf.core.EngineControl;
import org.eclipse.amp.axf.core.IEngine;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.ide.ModelViewManager;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

/**
 * Super class for all {@link AbstractHandler}s to control the {@link IEngine} execution.
 * 
 * @author jonas.ruettimann
 */
public abstract class ModelRunHandler extends AbstractHandler {

	private EngineControl control;

	public ModelRunHandler(EngineControl control) {
		this.control = control;
	}

	public Object execute(ExecutionEvent event) throws ExecutionException {
		assert getRunner() != null : "There is no active runner!";

		getRunner().control(control);
		return null;
	}

	protected IEngine getRunner() {
		IModel model = ModelViewManager.getInstance().getActiveModel();
		if (model == null) {
			return null;
		}
		return model.getEngine();
	}

}
