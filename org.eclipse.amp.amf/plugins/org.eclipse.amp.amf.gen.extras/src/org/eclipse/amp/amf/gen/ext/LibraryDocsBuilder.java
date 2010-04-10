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


public class LibraryDocsBuilder extends MetaABMBuilder {

    public final static String FUNCTION_BUILDER_ID = "wikiFunctionBuilder";

    private static MetaABMBuilder functionBuilder;

    public LibraryDocsBuilder() {
        super("Generating Text Documentation", "org.eclipse.amp.amf.gen.ext", "model/generate_wiki_function_docs.mwe",
              true);
    }

    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static MetaABMBuilder getLibaryDocsDefault() {
        if (functionBuilder == null) {
            functionBuilder = new LibraryDocsBuilder();
        }
        return functionBuilder;
    }
}
