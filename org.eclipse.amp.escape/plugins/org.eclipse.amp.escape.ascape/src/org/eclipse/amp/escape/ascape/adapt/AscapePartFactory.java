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

import org.eclipse.amp.agf.gef.AgentConnectionPart;
import org.eclipse.amp.agf.gef.NetworkConnection;
import org.eclipse.amp.agf.gef.ScapeEditPart;
import org.eclipse.amp.agf.gef.ScapeGraphEditPart;
import org.eclipse.amp.escape.ascape.gef.AscapeAgentEditPart;
import org.eclipse.amp.escape.ascape.gef.HostCellEditPart;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.jface.viewers.IFilter;

import org.ascape.model.Agent;
import org.ascape.model.CellOccupant;
import org.ascape.model.HostCell;
import org.ascape.model.Scape;
import org.ascape.model.space.Graph;


// TODO: Auto-generated Javadoc
/**
 * A factory for creating AscapePart objects.
 */
public class AscapePartFactory implements EditPartFactory {

    AscapeModelProvider modelProvider = new AscapeModelProvider();

    AscapeGraphicsProvider graphicsProvider = new AscapeGraphicsProvider();

    IFilter filter = null;

    /**
     * @param context
     * @param model
     * @return
     * @see org.eclipse.gef.EditPartFactory#createEditPart(org.eclipse.gef.EditPart, java.lang.Object)
     */
    public EditPart createEditPart(EditPart context, Object model) {
        EditPart part = getPartForElement(model);
        part.setModel(model);
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
        if (model instanceof Scape) {
            Scape scape = (Scape) model;
            if (scape.getSpace() instanceof Graph) {
                return new ScapeGraphEditPart(modelProvider, modelProvider, modelProvider,
                                              getFilter(scape));
            }
            return new ScapeEditPart(modelProvider, modelProvider, modelProvider, getFilter(scape));
        } else if (model instanceof HostCell) {
            return new HostCellEditPart();
        } else if (model instanceof CellOccupant) {
            return new AscapeAgentEditPart();
        } else if (model instanceof Agent) {
            return new AscapeAgentEditPart();
        } else if (model instanceof NetworkConnection) {
            return new AgentConnectionPart();
        } else {
            return null;
            // throw new RuntimeException("No part for the model: " + model
            // + (model != null ? "[" + model.getClass() + "]" : ""));
        }
    }

    public IFilter getFilter(Scape scape) {
        return filter;
    }

    public void setFilter(IFilter filter) {
        this.filter = filter;
    }

}
