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
package org.eclipse.amp.escape.ascape.adapt;

import org.eclipse.amp.agf.EditPartSourceProvider;
import org.eclipse.amp.escape.ascape.wrap.ScapeWrapperModel;
import org.eclipse.gef.EditPart;

import org.ascape.model.Agent;
import org.ascape.model.LocatedAgent;
import org.ascape.model.Scape;


// TODO: Auto-generated Javadoc
/**
 * The Class AscapePropertySourceProvider.
 */
public class AscapePropertiesSourceProvider extends EditPartSourceProvider {

    Class stopClass;

    public AscapePropertiesSourceProvider(Object source) {
        super();
        stopClass = getStopClass(source);
    }

    /**
     * @param editPart
     * @return
     * @see org.eclipse.amp.agf.EditPartSourceProvider#getSource(org.eclipse.gef.EditPart)
     */
    public Object getSource(final EditPart editPart) {
        if (editPart.getModel() instanceof ScapeWrapperModel) {
            return ((ScapeWrapperModel) editPart.getModel()).getScape();
        } else if (editPart.getModel() instanceof Scape) {
            return editPart.getModel();
        }
        return super.getSource(editPart);
    }

    /**
     * @param model
     * @return
     * @see org.ascape.BeanPropertySourceProvider#getStopClass(java.lang.Object)
     */
    protected Class getStopClass(Object model) {
        if (model instanceof LocatedAgent) {
            return LocatedAgent.class;
        } else if (model instanceof Agent) {
            return Agent.class;
        } else if (model instanceof Scape || model instanceof ScapeWrapperModel) {
            return Scape.class;
        }
        return Object.class;
    }
}
