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
package org.eclipse.amp.escape.amf.ide3d;

import org.eclipse.amp.escape.amf.ide.ExecuteAMFHandler;
import org.metaabm.SImplementation;

public class ExecuteAMF3DHandler extends ExecuteAMFHandler {

	@Override
	protected String getModelClass(SImplementation impl) {
		final String modelClassName = impl.getQualifiedName() + "3D";
		return modelClassName;
	}
}
