/**
 * <copyright>
 *
 * Copyright (c) 2009 Metascape, LLC.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Metascape - Initial API and Implementation
 *
 * </copyright>
 *
 */
package org.eclipse.amp.agf.tree;

import org.eclipse.gef.editparts.AbstractTreeEditPart;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

// TODO: Auto-generated Javadoc
/**
 * The Class AgentTreePart.
 */
public class AgentTreePart extends AbstractTreeEditPart {

    static final Image DEFAULT_AGENT = AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.amp.axf.ide",
    "icons/etool16/generic_agent.gif")
    .createImage();

    /**
     * @return
     * @see org.eclipse.gef.editparts.AbstractTreeEditPart#getText()
     */
    @Override
    protected String getText() {
        return getModel().toString();
    }

    /**
     * @return
     * @see org.eclipse.gef.editparts.AbstractTreeEditPart#getImage()
     */
    @Override
    protected Image getImage() {
        return DEFAULT_AGENT;
    }
}
