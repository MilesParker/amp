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

public class EscapeJavaPluginProjectWizard extends PluginTemplateProjectWizard {

	@Override
	protected String getProjectTypeName() {
		return "Escape Java";
	}

	@Override
	protected String getSourceDirName() {
		return "src";
	}

	@Override
	protected String getCurrentPluginID() {
		return EscapeIDEPlugin.PLUGIN_ID;
	}
}
