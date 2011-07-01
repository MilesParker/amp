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

/**
 * Resume the simulation execution.
 * 
 * @author jonas.ruettimann
 */
public class ResumeHandler extends ModelRunHandler {

	public ResumeHandler() {
		super(EngineControl.RESUME);
	}

	@Override
	public boolean isEnabled() {
		assert getRunner().isPaused() : "Obviously, this command was declarately enabled not the way it's ment to be.";
		return super.isEnabled();
	}
}
