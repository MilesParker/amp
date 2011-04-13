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
package org.eclipse.amp.escape.amf.ide;

import org.eclipse.amp.amf.gen.ide.ResourceJobHandler;
import org.eclipse.core.resources.IResource;

public class GenerateEscapeHandler extends ResourceJobHandler {

	@Override
	public void execute(IResource resource) {
		EscapeModelBuilder.getEscapeBuilderDefault().setCurrentMonitor(getMonitor());
		EscapeModelBuilder.getEscapeBuilderDefault().handleModifiedResource(resource);
	}
}
