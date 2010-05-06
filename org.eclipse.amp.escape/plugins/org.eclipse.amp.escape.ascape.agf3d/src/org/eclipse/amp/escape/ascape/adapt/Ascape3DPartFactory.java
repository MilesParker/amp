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

import java.util.ArrayList;
import java.util.List;

import org.ascape.model.Scape;
import org.ascape.model.space.Graph;
import org.eclipse.amp.agf.gef.CompositionPartFactory;
import org.eclipse.amp.agf3d.AgentEdit3DPart;
import org.eclipse.amp.agf3d.IShape3DProvider;
import org.eclipse.amp.agf3d.ScapeEdit3DPart;
import org.eclipse.amp.agf3d.ScapeEditRoot3DPart;
import org.eclipse.amp.axf.core.ICompositionProvider;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.escape.ascape.wrap.ScapeWrapperModel;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.viewers.IColorProvider;

public class Ascape3DPartFactory extends CompositionPartFactory {

    /**
     * 
     * @author mparker
     * 
     */
    static class Root3DProvider extends AscapeModelProvider {
        @SuppressWarnings("unchecked")
        public java.util.List getList(Object hasIterable) {
            List list = new ArrayList(super.getList(hasIterable));
            List newList = new ArrayList(super.getList(hasIterable));
            for (Object object : list) {
                if (!(((Scape) object).getSpace() instanceof Graph)) {
                    newList.add(object);
                }
            }
            return newList;
        }
    }

    AscapeModelProvider baseProvider = new AscapeModelProvider();

    AscapeModelProvider rootProvider = new Root3DProvider();

    private ICompositionProvider shapeProvider;

    public Ascape3DPartFactory(IModel model) {
        super(model, null);
        shapeProvider = (ICompositionProvider) Platform.getAdapterManager().getAdapter(model,
                                                                                       ICompositionProvider.class);
    }

    protected EditPart getPartForElement(Object model) {
        if (model instanceof ScapeWrapperModel) {
            return getPartForElement(((ScapeWrapperModel) model).getScape());
        }
        if (model instanceof Scape) {
            Scape scape = (Scape) model;
            AscapeModelProvider memberProvider = (AscapeModelProvider) getMemberProvider(scape);
            if (scape.isRoot()) {
                return new ScapeEditRoot3DPart(getCompositionProvider(), getLocationProvider(), null);
            } else {
                return new ScapeEdit3DPart(getCompositionProvider(), getLocationProvider(), null);
            }
        } else {
            IColorProvider colorProvider = getColorProvider(model);
            IShape3DProvider shapeProvider = getShapeProvider(model);
            if (shapeProvider != null) {
                return new AgentEdit3DPart(shapeProvider, colorProvider, true);
            }
        }
        return null;
    }

    public IColorProvider getColorProvider(Object object) {
        return AscapeGraphicsProvider.getDefault();
    }

    public IShape3DProvider getShapeProvider(Object object) {
        return null;
    }

    protected ICompositionProvider getMemberProvider(Scape scape) {
        if (scape.isRoot()) {
            return rootProvider;
        } else {
            return baseProvider;
        }
    }
}
