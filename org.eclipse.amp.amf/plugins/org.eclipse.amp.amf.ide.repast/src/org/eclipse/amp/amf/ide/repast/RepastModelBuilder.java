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

import org.eclipse.amp.amf.gen.ide.MetaABMBuilder;
import org.eclipse.core.resources.IResource;

public class RepastModelBuilder extends MetaABMBuilder {

    public final static String REPAST_BUILDER_ID = "repastBuilder";

    private static RepastModelBuilder repastBuilder;

    private MetaABMScoreTransformer transformer;

    public RepastModelBuilder() {
        super("Generating Repast", "org.eclipse.amp.amf.gen.repast", "model/generate_repast.mwe", true);
        transformer = new MetaABMScoreTransformer(getGenProperties());
    }

    public void generateModel(IResource resource) {
        super.generateModel(resource);
        transformer.generateScoreModel();
    }

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static RepastModelBuilder getRepastBuilderDefault() {
        if (repastBuilder == null) {
            repastBuilder = new RepastModelBuilder();
        }
        return repastBuilder;
    }
}
