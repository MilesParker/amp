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
 * </copyright> $Id: InterfaceModelBuilder.java,v 1.1 2009/07/16 21:01:08 mparker Exp $
 */
package org.eclipse.amp.amf.gen.ide;


/**
 * Generates interfaces for all project models.
 * 
 * @author milesparker
 * 
 */
public class InterfaceModelBuilder extends MetaABMBuilder {

    public final static String INTERFACE_BUILDER_ID = "interfaceBuilder";

    private static MetaABMBuilder interfaceBuilder;

    public InterfaceModelBuilder() {
        super("Generating Interfaces", "org.eclipse.amp.amf.gen", "model/generate_interface.mwe", false);
    }

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static MetaABMBuilder getInterfaceBuilderDefault() {
        if (interfaceBuilder == null) {
            interfaceBuilder = new InterfaceModelBuilder();
        }
        return interfaceBuilder;
    }
}
