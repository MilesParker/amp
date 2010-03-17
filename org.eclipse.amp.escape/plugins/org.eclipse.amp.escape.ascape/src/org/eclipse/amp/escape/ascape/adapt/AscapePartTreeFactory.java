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

import org.eclipse.amp.agf.tree.AgentTreePart;
import org.eclipse.amp.agf.tree.ScapeTreePart;
import org.eclipse.amp.escape.ascape.wrap.ScapeWrapperModel;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

import org.ascape.model.Agent;
import org.ascape.model.Scape;


// TODO: Auto-generated Javadoc
/**
 * A factory for creating ScapePartTree objects.
 */
public class AscapePartTreeFactory implements EditPartFactory {

    public AscapeProvider provider = new AscapeProvider();

    /**
     * @param context
     * @param model
     * @return
     * @see org.eclipse.gef.EditPartFactory#createEditPart(org.eclipse.gef.EditPart, java.lang.Object)
     */
    public EditPart createEditPart(EditPart context, Object model) {
        EditPart part = getPartForElement(model);
        if (part != null) {
            part.setModel(model);
        }
        return part;
    }

    /**
     * Maps an object to an EditPart.
     * 
     * @param model the model
     * 
     * @return the part for element
     * 
     * @throws RuntimeException if no match was found (programming error)
     */
    protected EditPart getPartForElement(Object model) {
        if (model instanceof ScapeWrapperModel) {
            return getPartForElement(((ScapeWrapperModel) model).getScape());
        }
        if (model instanceof Scape) {
            return new ScapeTreePart(provider, provider);
        } else if (model instanceof Agent) {
            return new AgentTreePart(provider);
        } else {
            return null;
            // throw new RuntimeException("No part for the model: " + model
            // + (model != null ? "[" + model.getClass() + "]" : ""));
        }
    }
}
