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

import org.eclipse.amp.amf.ide.Configurator;
import org.eclipse.amp.amf.ide.AMFLaunchAction;

public class KeyGraphicsLaunchAction extends AMFLaunchAction {

    public final static Configurator KEY_CONFIGURATOR = new ClassMainConfigurator();
    
    public Configurator getConfigurator() {
        return KEY_CONFIGURATOR;
    }
	@Override
	public String getTargetName() {
		// TODO Auto-generated method stub
		return "Metascape Graphics Key Builder";
	}
}
