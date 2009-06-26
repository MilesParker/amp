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

import java.util.List;

import org.eclipse.amp.axf.core.ICompositionProvider;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.editparts.AbstractTreeEditPart;
import org.eclipse.jface.viewers.ILabelProvider;

// TODO: Auto-generated Javadoc
/**
 * The Class ScapeTreePart.
 */
public class ScapeTreePart extends AbstractTreeEditPart {

    boolean updating;

    boolean firstRefresh = true;

    ICompositionProvider memberProvider;

    ILabelProvider labelProvider;

    /**
     * Instantiates a new scape tree part.
     * 
     * @param memberProvider the member provider
     * @param labelProvider the label provider
     */
    public ScapeTreePart(ICompositionProvider memberProvider, ILabelProvider labelProvider) {
        super();
        this.memberProvider = memberProvider;
        this.labelProvider = labelProvider;
    }

    /**
     * @return
     * @see org.eclipse.gef.editparts.AbstractTreeEditPart#getText()
     */
    @Override
    protected String getText() {
        return labelProvider.getText(getModel());
    }

    /**
     * Must not be called while scape is updating.
     */
    // protected void refreshChildren() {
    // super.refreshChildren();
    // if (firstRefresh) {
    // int i = 0;
    // for (Object agent : getScape().getSpace()) {
    // EditPart editPart = createChild(agent);
    // addChild(editPart, -1);
    // }
    // } else if (getScape().isMutable() || firstRefresh) {
    // Map<Agent, EditPart> modelToEditPart = new HashMap<Agent, EditPart>();
    //
    // for (Object object : getChildren()) {
    // EditPart editPart = (EditPart) object;
    // modelToEditPart.put((Agent) editPart.getModel(), editPart);
    // }
    // for (Object agent : getScape().getSpace()) {
    // EditPart editPart = modelToEditPart.remove(agent);
    // if (editPart == null) {
    // editPart = createChild(agent);
    // addChild(editPart, -1);
    // }
    // }
    // for (EditPart part : modelToEditPart.values()) {
    // removeChild(part);
    // }
    // }
    // }
    // @Override
    public void refresh() {
        super.refresh();
        // performance improvement..we only need to do this once for Array2D
        if (memberProvider.isMutable(getModel()) || firstRefresh) {
            for (Object child : getChildren()) {
                ((EditPart) child).refresh();
            }
            firstRefresh = false;
        }
    }

    /**
     * @return
     * @see org.eclipse.gef.editparts.AbstractEditPart#getModelChildren()
     */
    @Override
    protected List getModelChildren() {
        List use = memberProvider.getList(getModel());
        return use;
    }
}
