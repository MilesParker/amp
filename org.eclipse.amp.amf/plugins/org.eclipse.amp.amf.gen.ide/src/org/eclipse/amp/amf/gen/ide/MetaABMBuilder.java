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
 * </copyright> $Id: MetaABMBuilder.java,v 1.3 2010/08/04 01:54:01 mparker Exp $
 */
package org.eclipse.amp.amf.gen.ide;

import org.eclipse.amp.amf.gen.ide.prefs.GenConstants;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.preference.IPreferenceStore;
import org.metaabm.gen.AMFGenPlugin;

/**
 * general support for generating project artifacts (code, documentation, etc..)
 * from AMF meta-models.
 * 
 * @author milesparker
 */
public class MetaABMBuilder extends AbstractMWEBuilder {

	public static final String BUILDER_ID = "baseBuilder";

	public MetaABMBuilder(String taskDescription, String pluginName, String workflowPath, boolean createMarkers) {
		super(taskDescription, pluginName, workflowPath, "metaabm");
		this.createMarkers = createMarkers;
	}

	public MetaABMBuilder(String taskDescription, String pluginName, String[] workflowPaths, boolean createMarkers) {
		super(taskDescription, pluginName, workflowPaths, "metaabm");
		this.createMarkers = createMarkers;
	}

	public MetaABMBuilder() {
		this("Generating Base Code", AMFGenPlugin.PLUGIN_ID, "model/generate_base.mwe", true);
	}

	public void loadPropertiesFromPrefs() {
		IPreferenceStore store = GenIDEPlugin.getPlugin().getPreferenceStore();
		String formatString = new Boolean(store.getBoolean(GenConstants.FORMAT_CODE)).toString();
		getGenProperties().put("format", formatString);
		getGenProperties().put("genComments", new Boolean(store.getBoolean(GenConstants.GENERATE_COMMENTS)).toString());
		String srcDir = store.getString(GenConstants.SOURCE_GEN_DIR);
		getGenProperties().put("srcDir", srcDir);
		getGenProperties().put("genStats", store.getString(GenConstants.GENERATE_STATS));
	}

	public void loadPlugins() {
		// AMFGenPlugin.getDefault().getBundle();
		// MetaModelerPlugin.getPlugin().getBundle();
	}

	public void loadPropertiesFromResource(IResource resource) {
		String testing = resource.getProject().getName().endsWith("test") ? "true" : "false";
		getGenProperties().put("testing", testing != null ? testing : "false");
		super.loadPropertiesFromResource(resource);
	}

	// public void loadPropertiesFromFileString(String file) {
	// getGenProperties().put("testing", "false");
	// getGenProperties().put("modelFile", file);
	// getGenProperties().put("buildProject", "none");
	// }

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static MetaABMBuilder getBaseBuilderDefault() {
		if (builder == null) {
			builder = new MetaABMBuilder();
		}
		return builder;
	}

	public boolean isCreateMarkers() {
		return createMarkers;
	}

	public void setCreateMarkers(boolean createMarkers) {
		this.createMarkers = createMarkers;
	}
}
