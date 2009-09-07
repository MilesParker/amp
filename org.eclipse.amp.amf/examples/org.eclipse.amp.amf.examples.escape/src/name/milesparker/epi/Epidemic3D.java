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

package name.milesparker.epi;

import org.eclipse.amp.agf3d.I3DModelFactoryProvider;
import org.eclipse.amp.escape.ascape.adapt.Ascape3DPartFactory;
import org.eclipse.amp.escape.ascape.agf3d.GEF3DView;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;

/**
 * 
 * @author mparker
 * 
 */
public class Epidemic3D extends Epidemic implements I3DModelFactoryProvider {
    public void createGraphicViews() {
        GEF3DView gef3DView = new GEF3DView();
        addView(gef3DView);
    }

    @Override
    public EditPartFactory getEditPart3DFactory() {
        return new Ascape3DPartFactory() {
            public EditPart getPartForElement(Object model) {
                if (model instanceof Individual) {
                    return new Individual3DEditPart();
                }
                if (model instanceof Location) {
                    return new Tile3DEditPart();
                }
                return super.getPartForElement(model);
            }
        };
    }
}
