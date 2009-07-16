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
package org.eclipse.amp.amf.gen.ext;

import org.eclipse.amp.amf.gen.ide.MetaABMBuilder;


public class KeyModelBuilder extends MetaABMBuilder {
    
    public final static String KEY_BUILDER_ID = "keyBuilder";

    private static MetaABMBuilder keyBuilder;
    
    public KeyModelBuilder() {
        super("Generating Graphics Key", "org.eclipse.amp.amf.gen.ext", "model/generate_ext.mwe", true);
    }

    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static MetaABMBuilder getKeyBuilderDefault() {
        if (keyBuilder == null) {
            keyBuilder = new KeyModelBuilder();
        }
        return keyBuilder;
    }
}
