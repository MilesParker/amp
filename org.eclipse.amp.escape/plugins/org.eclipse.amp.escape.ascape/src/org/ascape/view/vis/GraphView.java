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

import org.eclipse.amp.escape.ascape.view.ModelScapeView;

public class GraphView extends ModelScapeView {

    private static final long serialVersionUID = 1L;

    public GraphView() {
        super("org.eclipse.amp.view.GraphView", null, null);
    }

    public GraphView(String name) {
        super("org.eclipse.amp.view.GraphView", null, name);
    }
}
