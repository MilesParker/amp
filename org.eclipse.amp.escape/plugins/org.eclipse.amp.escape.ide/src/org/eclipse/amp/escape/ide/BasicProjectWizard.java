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
 *   Metascape - Development and maintenance
 *
 * </copyright> $Id: BasicProjectWizard.java,v 1.4 2010/08/04 01:54:01 mparker Exp $
 */
package org.eclipse.amp.escape.ide;

/**
 * A simple AMF builder project. Creates basic documentations artifacts.
 * 
 * @author milesparker
 * @author jonas.ruettimann
 */
public class BasicProjectWizard extends ProjectWizard {

	@Override
	protected String getProjectTypeName() {
		return "Basic";
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
