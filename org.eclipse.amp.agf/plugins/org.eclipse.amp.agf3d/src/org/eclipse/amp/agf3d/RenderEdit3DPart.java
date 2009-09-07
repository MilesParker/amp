/**
 * <copyright>
 *
 * Copyright (c) 2009 Metascape, LLC.
 * Copyright (c) 2008 Jens von Pilgrim and others.
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

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw3d.Figure3D;
import org.eclipse.draw3d.IFigure3D;
import org.eclipse.draw3d.RenderContext;
import org.eclipse.draw3d.geometry.Position3D;
import org.eclipse.draw3d.geometry.Vector3fImpl;
import org.eclipse.draw3d.graphics3d.Graphics3D;
import org.eclipse.draw3d.graphics3d.Graphics3DDraw;
import org.eclipse.draw3d.shapes.AbstractModelShape;
import org.eclipse.draw3d.util.ColorConverter;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;
import org.eclipse.swt.graphics.Color;

/**
 * An edit part that allows drawing of arbitrary figures into the current rendering context.
 * 
 * @author Miles Parker
 * @author Kristian Duske
 */
public class RenderEdit3DPart extends AbstractGraphicalEditPart {

    public static final int SCALE = 20;
    private static final float[] DEFAULT_COLOR = new float[] { 0, 0, 0, 1 };
    private final float[] m_color = new float[] { DEFAULT_COLOR[0], DEFAULT_COLOR[1], DEFAULT_COLOR[2],
        DEFAULT_COLOR[3] };

    AbstractModelShape shape;

    boolean update = true;
    private IFigure3D figure;

    /**
     * @return
     * @see org.eclipse.gef.editparts.AbstractGraphicalEditPart#createFigure()
     */
    protected IFigure createFigure() {
        figure = new Figure3D() {
            public void render(RenderContext renderContext) {
                Position3D fp = getPosition3D();
                shape.setPosition(fp);
                shape.render(renderContext);
            }
        };
        shape = new AbstractModelShape() {
            protected void performRender(RenderContext renderContext) {
                Graphics3D g3d = renderContext.getGraphics3D();
                renderShape(g3d);
            }

            @Override
            protected void setup(RenderContext renderContext) {
                Graphics3D g3d = renderContext.getGraphics3D();
                g3d.glPolygonMode(Graphics3DDraw.GL_FRONT_AND_BACK, Graphics3DDraw.GL_FILL);
            }
        };
        figure.getPosition3D().setSize3D(new Vector3fImpl(SCALE, SCALE, SCALE));
        return figure;
    }

    /**
     * Render shape.
     * 
     * @param g3d the g3d
     */
    protected void renderShape(Graphics3D g3d) {
    }

    /**
     * Sets the color of this cube.
     * 
     * @param i_color the color
     * @param i_alpha the alpha value
     * 
     * @throws NullPointerException if the given color is <code>null</code>
     */
    public void setColor(Color i_color, int i_alpha) {

        if (i_color == null) {
            throw new NullPointerException("i_color must not be null");
        }

        ColorConverter.toFloatArray(i_color, i_alpha, m_color);
    }

    /**
     * Sets the color of the given face.
     * 
     * @param i_color the color as an int value (fomat 0x00BBGGRR)
     * @param i_alpha the alpha value
     */
    public void setColor(int i_color, int i_alpha) {

        ColorConverter.toFloatArray(i_color, i_alpha, m_color);
    }

    /**
     * Gl set color.
     * 
     * @param g3d the g3d
     */
    private void glSetColor(Graphics3D g3d) {

        float r = m_color[0];
        float g = m_color[1];
        float b = m_color[2];
        float a = m_color[3];

        g3d.glColor4f(r, g, b, a);
    }

    /**
     * Gl set color.
     * 
     * @param g3d the g3d
     */
    public void glSetColor(Graphics3D g3d, Color i_color) {
        setColor(i_color, 255);
        glSetColor(g3d);
    }

    /**
     * Gl set color.
     * 
     * @param g3d the g3d
     */
    public void glSetColor(Graphics3D g3d, Color i_color, int alpha) {
        setColor(i_color, alpha);
        glSetColor(g3d);
    }

    /**
     * 
     * @see org.eclipse.gef.editparts.AbstractEditPart#createEditPolicies()
     */
    protected void createEditPolicies() {
    }
}
