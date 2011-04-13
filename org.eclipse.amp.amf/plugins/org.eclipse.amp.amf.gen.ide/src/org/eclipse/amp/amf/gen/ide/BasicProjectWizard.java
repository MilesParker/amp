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
package org.eclipse.amp.amf.gen.ide;

import java.util.List;

import org.eclipse.amp.amf.ide.AmfIDEPlugin;
import org.eclipse.jdt.core.JavaCore;

/**
 * A simple AMF builder project. Creates basic documentations artifacts.
 * 
 * @author milesparker
 * 
 */
public class BasicProjectWizard extends PluginProjectWizard {

	@Override
	public List<String> getBuilders() {
		List<String> builderIDs = super.getBuilders();
		builderIDs.add(AmfIDEPlugin.PLUGIN_ID + "." + MetaABMBuilder.BUILDER_ID);
		builderIDs.add(GenIDEPlugin.PLUGIN_ID + "." + DocumentModelBuilder.DOCUMENT_BUILDER_ID);
		builderIDs.add(JavaCore.BUILDER_ID);
		return builderIDs;
	}

	public String getProjectTypeName() {
		return "Basic";
	}
}
