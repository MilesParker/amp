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

package org.eclipse.amp.agf3d;

import java.util.List;

import org.eclipse.amp.agf.gef.GEFUtils;
import org.eclipse.amp.agf.gef.ScapeEditPart;
import org.eclipse.amp.axf.core.ICompositionProvider;
import org.eclipse.amp.axf.space.ILocation;
import org.eclipse.amp.axf.space.ILocation2D;
import org.eclipse.amp.axf.space.ILocationProvider;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw3d.Figure3D;
import org.eclipse.draw3d.FigureSurface;
import org.eclipse.draw3d.ISurface;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.viewers.IFilter;

/**
 * 
 * @author mparker
 * 
 */
public class ScapeEditRoot3DPart extends ScapeEdit3DPart {

    public static final int DEFAULT_ANIMATION_STEP_COUNT = 5;

    private int animationStep;

    private int animationStepCount = DEFAULT_ANIMATION_STEP_COUNT;

    public ScapeEditRoot3DPart(ICompositionProvider memberProvider, ILocationProvider locationProvider, IFilter filter) {
        super(memberProvider, locationProvider, filter);
    }

    /**
     * @return
     * @see org.eclipse.amp.agf3d.ScapeEdit3DPart#createFigure()
     */
    protected IFigure createFigure() {
        figure = new Figure3D() {
            private ISurface m_surface = new FigureSurface(this);

            @Override
            public ISurface getSurface() {
                return m_surface;
            }

        };
        // SurfaceLayout.setDelegate((IFigure3D) figure, new FreeformLayout());
        figure.setLayoutManager(new XYLayout());
        Rectangle bounds = new Rectangle(new Point(0, 0), calculateDimension());
        figure.setBounds(bounds);
        return figure;
    }

    // This is just a hack to prevent having to rearrange scape wrapper
    public Dimension calculateDimension() {
        ILocation extent = getLocationProvider().getExtent(getModelRoot());
        if (extent instanceof ILocation2D) {
            return GEFUtils.toScaledDimension((ILocation2D) extent);
        }
        return null;
    }

    /**
     * @return
     * @see org.eclipse.gef.editparts.AbstractEditPart#getModelChildren()
     */
    protected List getModelChildren() {
        return getMemberProvider().getList(getModel());
    }

    /**
     * @param child
     * @param index
     * @see org.eclipse.gef.editparts.AbstractEditPart#addChild(org.eclipse.gef.EditPart, int)
     */
    protected void addChild(EditPart child, int index) {
        super.addChild(child, index);
    }

    /**
     * @return
     * @see org.eclipse.amp.agf.gef.ScapeEditPart#getRootScapeEditPart()
     */
    public ScapeEditPart getRootScapeEditPart() {
        return this;
    }

    /**
     * @return the animationStep
     */
    public int getAnimationStep() {
        return animationStep;
    }

    /**
     * @return the animationStepCount
     */
    public int getAnimationStepCount() {
        return animationStepCount;
    }

    public int setAnimationStep(int animationStep) {
        this.animationStep = animationStep;
        return animationStep;
    }

    public void setAnimationStepCount(int animationStepCount) {
        this.animationStepCount = animationStepCount;
        this.animationStep = 0;
    }
}
