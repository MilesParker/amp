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

import org.eclipse.amp.amf.ide.Configurator;
import org.eclipse.amp.amf.ide.AMFLaunchAction;

public class AscapeLaunchAction extends AMFLaunchAction {

    public final static Configurator ASCAPE_CONFIGURATOR = new AscapeRuntimeConfigurator();

    public Configurator getConfigurator() {
        return ASCAPE_CONFIGURATOR;
    }

    @Override
    public String getTargetName() {
        // TODO Auto-generated method stub
        return "metaABM for Ascape";
    }
}
