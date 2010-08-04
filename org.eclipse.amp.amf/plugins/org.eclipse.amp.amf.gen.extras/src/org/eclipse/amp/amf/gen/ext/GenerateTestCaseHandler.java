/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Metascape - Initial development and maintenance
 *
 * </copyright>
 */
package org.eclipse.amp.amf.gen.ext;

import org.eclipse.amp.amf.gen.ide.ResourceJobHandler;
import org.eclipse.amp.amf.gen.ide.TestCaseModelBuilder;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;

public class GenerateTestCaseHandler extends ResourceJobHandler {

	@Override
	public void execute(IResource resource) throws ExecutionException {
			TestCaseModelBuilder.getTestBuilderDefault().handleModifiedResource(resource);
	}
}
