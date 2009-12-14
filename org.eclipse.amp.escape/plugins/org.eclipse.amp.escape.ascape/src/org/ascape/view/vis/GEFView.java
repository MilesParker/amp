/*******************************************************************************
 * Copyright (c) 2009, Metascape LLC, Miles Parker.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Miles Parker - initial API and implementation
 ******************************************************************************/
package org.ascape.view.vis;

import org.eclipse.amp.escape.ascape.view.EditPartFactoryScapeView;

public class GEFView extends EditPartFactoryScapeView {

    private static final long serialVersionUID = 1L;

    public GEFView(String primaryID, String secondaryID, String name) {
        super(primaryID, secondaryID, name);
    }

    public GEFView() {
        super("org.eclipse.amp.view.GEFView", null, "Graphic View");
    }

    public GEFView(String name) {
        super("org.eclipse.amp.view.GEFView", null, name);
    }
}
