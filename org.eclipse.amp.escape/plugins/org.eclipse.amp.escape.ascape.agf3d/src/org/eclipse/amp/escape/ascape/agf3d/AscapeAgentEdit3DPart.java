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

package org.eclipse.amp.escape.ascape.agf3d;

import org.eclipse.amp.agf3d.AgentEdit3DPart;
import org.eclipse.amp.agf3d.IShape3DProvider;
import org.eclipse.amp.agf3d.Shapes3D;
import org.eclipse.jface.viewers.IColorProvider;

/**
 * 
 * @author mparker
 * 
 */
public class AscapeAgentEdit3DPart extends AgentEdit3DPart {

    public AscapeAgentEdit3DPart(IShape3DProvider shapeProvider, IColorProvider colorProvider, boolean update) {
        super(shapeProvider, colorProvider, update);
    }

    public AscapeAgentEdit3DPart(IColorProvider colorProvider) {
        this(Shapes3D.CUBE_SHAPE_PROVIDER, colorProvider, true);
    }
}
