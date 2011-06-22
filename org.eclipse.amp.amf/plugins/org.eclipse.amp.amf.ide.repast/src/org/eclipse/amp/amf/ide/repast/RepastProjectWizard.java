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
package org.eclipse.amp.amf.ide.repast;

import java.util.List;

import org.eclipse.amp.amf.gen.ide.DocumentModelBuilder;
import org.eclipse.amp.amf.gen.ide.GenIDEPlugin;
import org.eclipse.amp.amf.gen.ide.PluginProjectWizard;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.ui.INewWizard;

public class RepastProjectWizard extends PluginProjectWizard implements INewWizard {

	public static String REPAST_HOME = "REPAST_HOME";

	public RepastProjectWizard() {
		super();
	}

	@Override
	public List<IClasspathEntry> getClasspathsEntries() throws CoreException {
		List<IClasspathEntry> classpathsEntries = super.getClasspathsEntries();
		classpathsEntries.add(JavaCore.newContainerEntry(new Path(RepastRuntimeConfigurator.REPAST_SUPPORT_PATH), true));
		return classpathsEntries;
	}

	@Override
	public List<String> getBuilders() {
		List<String> builderIDs = super.getBuilders();
		builderIDs.add(RepastIDEActivator.PLUGIN_ID + "." + RepastModelBuilder.REPAST_BUILDER_ID);
		builderIDs.add(GenIDEPlugin.PLUGIN_ID + "." + DocumentModelBuilder.DOCUMENT_BUILDER_ID);
		return builderIDs;
	}

	@Override
	public String getSourceDirName() {
		return "srcgen";
	}

	@Override
	public String getProjectTypeName() {
		return "MetaABM for Repast";
	}

}
