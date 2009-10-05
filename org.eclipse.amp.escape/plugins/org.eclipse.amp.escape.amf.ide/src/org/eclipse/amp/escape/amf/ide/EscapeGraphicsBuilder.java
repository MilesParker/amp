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
import org.metaabm.gen.AMFGenPlugin;
import org.metaabm.gen.ascape.AscapeGenActivator;


public class EscapeGraphicsBuilder extends MetaABMBuilder {

    public final static String ESCAPE_BUILDER_3_ID = "escapeBuilder3";

    private static MetaABMBuilder escapeBuilder;

    public EscapeGraphicsBuilder() {
        super("Generating Escape Proxy", "org.eclipse.amp.escape.gen", "model/generate_escape_graphics.mwe", true);
    }

    public void loadPlugins() {
        AMFGenPlugin.getDefault();
        AscapeGenActivator.getDefault();
        EscapeGenActivator.getDefault();
        super.loadPlugins();
    }

    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static MetaABMBuilder getEscapeBuilderDefault() {
        if (escapeBuilder == null) {
            escapeBuilder = new EscapeGraphicsBuilder();
        }
        return escapeBuilder;
    }
}
