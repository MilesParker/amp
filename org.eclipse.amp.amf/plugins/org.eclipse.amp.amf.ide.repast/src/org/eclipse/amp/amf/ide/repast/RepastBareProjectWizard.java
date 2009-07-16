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

import java.util.List;

public class RepastBareProjectWizard extends RepastProjectWizard {

    public RepastBareProjectWizard() {
        super();
        PROJECT_SOURCE_DIR = "src";
    }

    @Override
    public void addBuilders(List<String> builderIDs) {
        // Do nothing as we don't want any metaabm builders included.
    }
}
