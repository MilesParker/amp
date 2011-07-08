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

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.amp.amf.gen.ide.DocumentModelBuilder;
import org.eclipse.amp.amf.gen.ide.GenIDEPlugin;
import org.eclipse.amp.amf.gen.ide.MetaABMBuilder;
import org.eclipse.amp.amf.gen.ide.PluginTemplateProjectWizard;
import org.eclipse.amp.escape.runtime.EscapeRuntimePlugin;

public class EscapeAMFProjectWizard extends PluginTemplateProjectWizard {

	@Override
	public String getProjectTypeName() {
		return "Escape AMF";
	}

	@Override
	public Set<String> getDependenciesForManifest() {
		Set<String> dependencies = super.getDependenciesForManifest();
		dependencies.add(EscapeRuntimePlugin.PLUGIN_ID);
		return dependencies;
	}

	@Override
	public List<String> getBuilders() {
		List<String> builderIDs = new ArrayList<String>();
		builderIDs.add(GenIDEPlugin.PLUGIN_ID + "." + DocumentModelBuilder.DOCUMENT_BUILDER_ID);
		builderIDs.add(EscapeAMFPlugin.PLUGIN_ID + "." + EscapeModelBuilder.ESCAPE_BUILDER_ID);
		builderIDs.addAll(super.getBuilders());
		return builderIDs;
	}

	@Override
	public String getSourceDirName() {
		return "srcgen";
	}

	@Override
	public String getPluginID() {
		return EscapeAMFPlugin.PLUGIN_ID;
	}

}
