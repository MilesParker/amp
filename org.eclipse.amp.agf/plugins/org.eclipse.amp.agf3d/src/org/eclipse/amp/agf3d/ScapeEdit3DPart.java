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
import java.util.Iterator;
import java.util.Map;

import org.eclipse.amp.agf.gef.GenericEditPart;
import org.eclipse.amp.agf.gef.ScapeEditPart;
import org.eclipse.amp.axf.core.ICompositionProvider;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.space.IGraphProvider;
import org.eclipse.amp.axf.space.ILocation;
import org.eclipse.amp.axf.space.ILocationProvider;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw3d.Figure3D;
import org.eclipse.draw3d.FigureSurface;
import org.eclipse.draw3d.IFigure3D;
import org.eclipse.draw3d.ISurface;
import org.eclipse.draw3d.geometry.IVector3f;
import org.eclipse.draw3d.geometry.Math3DVector3f;
import org.eclipse.draw3d.geometry.Vector3f;
import org.eclipse.draw3d.geometry.Vector3fImpl;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.jface.viewers.IFilter;

public class ScapeEdit3DPart extends ScapeEditPart {

    public ScapeEdit3DPart(ICompositionProvider memberProvider, ILocationProvider locationProvider,
            IGraphProvider graphProvider, IFilter filter) {
        super(memberProvider, locationProvider, graphProvider, filter);
    }

    Map<Object, IVector3f> startPoints = new HashMap<Object, IVector3f>();
    Map<Object, Vector3f> addPoints = new HashMap<Object, Vector3f>();
    Map<Object, Vector3f> lastPoints = new HashMap<Object, Vector3f>();

    class Scape3DLayoutManager extends XYLayout {

        /**
         * @param container
         * @param wHint
         * @param hHint
         * @return
         * @see org.eclipse.draw2d.AbstractLayout#calculatePreferredSize(org.eclipse.draw2d.IFigure, int, int)
         */
        protected Dimension calculatePreferredSize(IFigure container, int wHint, int hHint) {
            return null;
        }

        /**
         * @param container
         * @see org.eclipse.draw2d.LayoutManager#layout(org.eclipse.draw2d.IFigure)
         */
        public void layout(IFigure parent) {
            if (getMemberProvider().isMutable(getModel())) {
                Iterator children = parent.getChildren().iterator();
                IFigure3D f;
                while (children.hasNext()) {
                    f = (IFigure3D) children.next();
                    IVector3f location = (IVector3f) getConstraint(f);
                    f.getPosition3D().setLocation3D(location);
                }
            }
        }
    }

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
        figure.setLayoutManager(new Scape3DLayoutManager());
        // figure.setLayoutManager(new Scape3DLayoutManager());
        // SurfaceLayout.setDelegate((IFigure3D) figure, new FreeformLayout() {
        // public void layout(IFigure iContainer) {
        // FreeformLayout.this.get
        // ScapeEdit3DPart.this.layout(iContainer);
        // }
        // });
        figure.setBounds(getRootScapeEditPart().getFigure().getBounds());
        return figure;
    }

    /**
     * @param editPart
     * @see org.eclipse.amp.agf.gef.ScapeEditPart#calculateConstraints(org.eclipse.gef.GraphicalEditPart)
     */
    protected synchronized void calculateConstraints(GraphicalEditPart editPart) {
        Object agent = editPart.getModel();

        ILocation location = getLocationProvider().getLocation(agent);
        IFigure3D agentFigure = (IFigure3D) editPart.getFigure();
        Vector3f endPoint = null;
        if (location != null && editPart instanceof AgentEdit3DPart) {
            endPoint = new Vector3fImpl((float) GenericEditPart.SCALE * location.getX(), (float) GenericEditPart.SCALE
                                        * location.getY(), 0);
            endPoint = Math3DVector3f.add(endPoint, ((AgentEdit3DPart) editPart).getRelativeLocation3D(), endPoint);
            ScapeEditRoot3DPart root = (ScapeEditRoot3DPart) getRootScapeEditPart();
            if (root.getAnimationStepCount() > 1 && getRootScapeEditPart().getModel() != null
                    && ((IModel) getRootScapeEditPart().getModel()).getPeriod() > 0) {
                IVector3f startPoint;
                Vector3f addPoint;
                Vector3f lastPoint;
                if (root.getAnimationStep() == 0) {
                    startPoint = agentFigure.getPosition3D().getLocation3D();
                    startPoints.put(agent, startPoint);
                    addPoint = new Vector3fImpl();
                    calculateDelta(startPoint, endPoint, addPoint, root.getAnimationStepCount());
                    addPoints.put(agent, addPoint);
                    lastPoint = new Vector3fImpl(startPoint.getX(), startPoint.getY(), startPoint.getZ());
                    lastPoints.put(agent, lastPoint);
                } else {
                    startPoint = startPoints.get(agent);
                    addPoint = addPoints.get(agent);
                }
                Vector3f intermediatePoint = new Vector3fImpl();
                IVector3f currentPoint = lastPoints.get(agent);
                Math3DVector3f.add(currentPoint, addPoint, intermediatePoint);
                lastPoints.put(agent, new Vector3fImpl(intermediatePoint.getX(), intermediatePoint.getY(),
                    intermediatePoint.getZ()));
                setLayoutConstraint(editPart, editPart.getFigure(), intermediatePoint);
            } else {
                setLayoutConstraint(editPart, editPart.getFigure(), endPoint);
            }
        }
    }

    /**
     * 
     * @see org.eclipse.amp.agf.gef.ScapeEditPart#refresh()
     */
    public synchronized void refresh() {
        super.refresh();
    }

    void calculateDelta(IVector3f startPoint, IVector3f endPoint, Vector3f addPoint, int steps) {
        Math3DVector3f.sub(endPoint, startPoint, addPoint);
        Math3DVector3f.scale(1.0f / steps, addPoint, addPoint);
    }

}
