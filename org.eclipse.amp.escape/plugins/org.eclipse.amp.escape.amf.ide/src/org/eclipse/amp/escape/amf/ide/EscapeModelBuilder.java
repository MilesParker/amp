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

import org.eclipse.amp.amf.gen.ide.MetaABMBuilder;
import org.eclipse.amp.escape.gen.EscapeGenActivator;
import org.metaabm.gen.ascape.AscapeGenActivator;

public class EscapeModelBuilder extends MetaABMBuilder {

	public final static String ESCAPE_BUILDER_ID = "escapeBuilder";

	private static MetaABMBuilder escapeBuilder;

	public EscapeModelBuilder() {
		super("Generating Escape", EscapeAMFPlugin.PLUGIN_ID, new String[] { "model/generate_escape.mwe",
				"model/generate_escape_color.mwe", "model/generate_escape_figure.mwe", "model/generate_escape_2Dgraphics.mwe",
				"model/generate_escape_adapter.mwe" }, true);
	}

	public EscapeModelBuilder(String workflow) {
		super("Generating Escape", EscapeAMFPlugin.PLUGIN_ID, workflow, true);
	}

	@Override
	public void loadPlugins() {
		EscapeGenActivator.getDefault();
		AscapeGenActivator.getDefault();
		super.loadPlugins();
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static MetaABMBuilder getEscapeBuilderDefault() {
		if (escapeBuilder == null) {
			escapeBuilder = new EscapeModelBuilder();
		}
		return escapeBuilder;
	}
}
