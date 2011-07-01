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
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

/**
 * Pause the simulation.
 * 
 * @author jonas.ruettimann
 */
public class PauseHandler extends ModelRunHandler {

	public PauseHandler() {
		super(EngineControl.PAUSE);
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		return super.execute(event);
	}

	@Override
	public boolean isEnabled() {
		assert !getRunner().isPaused() : "Obviously, this command was declarately enabled not the way it's ment to be.";
		return super.isEnabled();
	}
}
