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
package org.eclipse.amp.amf.ide.ascape;

import java.util.List;
import java.util.Set;

import org.eclipse.amp.amf.gen.ide.DocumentModelBuilder;
import org.eclipse.amp.amf.gen.ide.GenIDEPlugin;
import org.eclipse.amp.amf.gen.ide.MetaABMBuilder;
import org.eclipse.amp.amf.gen.ide.PluginTemplateProjectWizard;

public class AscapeProjectWizard extends PluginTemplateProjectWizard {

	@Override
	public String getProjectTypeName() {
		return "MetaABM for Ascape";
	}

	@Override
	public Set<String> getDependenciesForManifest() {
		Set<String> dependencies = super.getDependenciesForManifest();
		dependencies.add("org.ascape.ui.swing");
		return dependencies;
	}

	@Override
	public Set<String> getImportsForManifest() {
		Set<String> importsForManifest = super.getImportsForManifest();
		importsForManifest.add("org.apache.commons.lang");
		return importsForManifest;
	}

	@Override
	public List<String> getBuilders() {
		List<String> builderIDs = super.getBuilders();
		builderIDs.add(GenIDEPlugin.PLUGIN_ID + "." + DocumentModelBuilder.DOCUMENT_BUILDER_ID);
		builderIDs.add(AscapeIDEActivator.PLUGIN_ID + "." + AscapeModelBuilder.ASCAPE_BUILDER_ID);
		return builderIDs;
	}

	@Override
	public String getSourceDirName() {
		return "srcgen";
	}

	@Override
	public String getPluginID() {
		return AscapeIDEActivator.PLUGIN_ID;
	}

}
