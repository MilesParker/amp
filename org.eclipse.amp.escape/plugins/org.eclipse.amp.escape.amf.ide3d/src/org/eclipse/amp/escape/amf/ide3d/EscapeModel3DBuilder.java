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

import org.eclipse.amp.amf.gen.ide.MetaABMBuilder;
import org.eclipse.amp.escape.gen.EscapeGenActivator;
import org.metaabm.gen.ascape.AscapeGenActivator;

public class EscapeModel3DBuilder extends MetaABMBuilder {

	private static MetaABMBuilder escapeBuilder;

	public EscapeModel3DBuilder() {
		super("Generating Escape 3D Styles", EscapeAMF3DPlugin.PLUGIN_ID, "model/generate_escape_3D.mwe", true);
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
			escapeBuilder = new EscapeModel3DBuilder();
		}
		return escapeBuilder;
	}
}
