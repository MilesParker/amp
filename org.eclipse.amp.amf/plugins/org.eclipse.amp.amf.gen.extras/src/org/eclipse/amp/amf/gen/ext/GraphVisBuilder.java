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


public class GraphVisBuilder extends MetaABMBuilder {
    
    public final static String GRAPHVIS_BUILDER_ID = "graphvisGenerator";

    private static MetaABMBuilder graphvisBuilder;
    
    public GraphVisBuilder() {
        super("Generating Graph Vis Documentation", "org.eclipse.amp.amf.gen.ext", "model/generate_graphvis.mwe", true);
    }

    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static MetaABMBuilder getGraphVisBuilderDefault() {
        if (graphvisBuilder == null) {
        	graphvisBuilder = new GraphVisBuilder();
        }
        return graphvisBuilder;
    }
}
