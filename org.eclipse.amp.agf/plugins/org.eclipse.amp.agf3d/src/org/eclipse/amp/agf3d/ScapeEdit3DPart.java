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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.amp.agf.gef.GenericEditPart;
import org.eclipse.amp.agf.gef.ScapeEditPart;
import org.eclipse.amp.axf.core.ICompositionProvider;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.space.IGraphProvider;
import org.eclipse.amp.axf.space.ILocation;
import org.eclipse.amp.axf.space.ILocationProvider;
import org.eclipse.draw2d.FreeformLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw3d.Figure3D;
import org.eclipse.draw3d.FigureSurface;
import org.eclipse.draw3d.IFigure3D;
import org.eclipse.draw3d.ISurface;
import org.eclipse.draw3d.SurfaceLayout;
import org.eclipse.draw3d.geometry.IVector3f;
import org.eclipse.draw3d.geometry.Math3DVector3f;
import org.eclipse.draw3d.geometry.Vector3f;
import org.eclipse.draw3d.geometry.Vector3fImpl;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.jface.viewers.IFilter;

public class ScapeEdit3DPart extends ScapeEditPart {

    public static Vector3fImpl UP_VECTOR = new Vector3fImpl(0, -1, 0);

    public ScapeEdit3DPart(ICompositionProvider memberProvider, ILocationProvider locationProvider,
            IGraphProvider graphProvider, IFilter filter) {
        super(memberProvider, locationProvider, graphProvider, filter);
    }

    Map<Object, IVector3f> startPoints = new HashMap<Object, IVector3f>();
    Map<Object, Vector3f> addPoints = new HashMap<Object, Vector3f>();

    protected IFigure createFigure() {
        IFigure figure;
        figure = new Figure3D() {

            private ISurface m_surface = new FigureSurface(this);

            @Override
            public ISurface getSurface() {
                return m_surface;
            }

            /**
             * 
             * @see org.eclipse.draw3d.Figure3D#invalidateParaxialBoundsTree()
             */
            public void invalidateParaxialBoundsTree() {
                super.invalidateParaxialBounds();
            }
        };
        SurfaceLayout.setDelegate((IFigure3D) figure, new FreeformLayout());
        // figure.setBounds(getRootScapeEditPart().getFigure().getBounds());
        return figure;
    }

    @Override
    protected synchronized void calculateConstraints(GraphicalEditPart editPart) {
        Object agent = editPart.getModel();
        ILocation location = getLocationProvider().getLocation(agent);
        if (location != null) {
            IFigure3D agentFigure = (IFigure3D) editPart.getFigure();
            Vector3f endPoint = new Vector3fImpl((float) GenericEditPart.SCALE * location.getX(),
                                                 (float) GenericEditPart.SCALE * location.getY(), 0);
            if (editPart instanceof AgentEdit3DPart) {
                endPoint = Math3DVector3f.add(endPoint, ((AgentEdit3DPart) editPart).getRelativeLocation3D(), endPoint);
            }
            ScapeEditRoot3DPart root = (ScapeEditRoot3DPart) getRootScapeEditPart();
            if (root.getAnimationStepCount() > 1 && getRootScapeEditPart().getModel() != null
                    && ((IModel) getRootScapeEditPart().getModel()).getPeriod() > 0) {
                IVector3f startPoint;
                Vector3f addPoint;
                if (root.getAnimationStep() == 0) {
                    startPoint = agentFigure.getPosition3D().getLocation3D();
                    startPoints.put(agent, startPoint);
                    addPoint = new Vector3fImpl();
                    calculateDelta(startPoint, endPoint, addPoint, root.getAnimationStepCount());
                    addPoints.put(agent, addPoint);
                } else {
                    startPoint = startPoints.get(agent);
                    addPoint = addPoints.get(agent);
                }
                Vector3f intermediatePoint = new Vector3fImpl();
                IVector3f currentPoint = agentFigure.getPosition3D().getLocation3D();
                Math3DVector3f.add(currentPoint, addPoint, intermediatePoint);
                agentFigure.getPosition3D().setLocation3D(intermediatePoint);

            } else {
                agentFigure.getPosition3D().setLocation3D(endPoint);
            }
        }
    }

    void calculateDelta(IVector3f startPoint, IVector3f endPoint, Vector3f addPoint, int steps) {
        Math3DVector3f.sub(endPoint, startPoint, addPoint);
        Math3DVector3f.scale(1.0f / steps, addPoint, addPoint);
    }

}
