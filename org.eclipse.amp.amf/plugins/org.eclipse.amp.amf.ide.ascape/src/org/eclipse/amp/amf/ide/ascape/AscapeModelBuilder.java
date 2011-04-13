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

import org.eclipse.amp.amf.gen.ide.MetaABMBuilder;
import org.metaabm.gen.AMFGenPlugin;
import org.metaabm.gen.ascape.AscapeGenActivator;

public class AscapeModelBuilder extends MetaABMBuilder {

	public final static String ASCAPE_BUILDER_ID = "ascapeBuilder";

	private static MetaABMBuilder ascapeBuilder;

	public AscapeModelBuilder() {
		super("Generating Ascape", AMFGenPlugin.PLUGIN_ID + ".ascape", "model/generate_ascape.mwe", true);
	}

	public void loadPlugins() {
		AscapeGenActivator.getDefault().getBundle();
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static MetaABMBuilder getAscapeBuilderDefault() {
		if (ascapeBuilder == null) {
			ascapeBuilder = new AscapeModelBuilder();
		}
		return ascapeBuilder;
	}

}
