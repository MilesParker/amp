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

import org.eclipse.draw3d.IFigure3D;
import org.eclipse.draw3d.RenderContext;
import org.eclipse.draw3d.graphics3d.Graphics3D;
import org.eclipse.draw3d.shapes.CuboidShape;
import org.eclipse.draw3d.util.ColorConverter;
import org.eclipse.swt.graphics.Color;

/**
 * Adapated from org.eclipse.draw3d.shapes.CubiodShape
 * 
 * @author mparker
 * @author Kristian Duske
 * 
 */
public class RenderShape extends CuboidShape {

    public static final int SCALE = 20;
    private static final float[] DEFAULT_COLOR = new float[] { 0, 0, 0, 1 };
    private final float[] m_color = new float[] { DEFAULT_COLOR[0], DEFAULT_COLOR[1], DEFAULT_COLOR[2],
        DEFAULT_COLOR[3] };

    boolean update = true;

    IFigure3D figure;
    private final IRenderer renderer;
    private final Object object;

    // private CuboidShape shape;

    public RenderShape(IFigure3D figure, final IRenderer renderer, final Object object) {
        super(figure.getPosition3D(), false);
        this.figure = figure;
        // shape = new CuboidShape(figure.getPosition3D(), false) {
        // /**
        // * @param iRenderContext
        // * @see org.eclipse.draw3d.shapes.CuboidShape#doRender(org.eclipse.draw3d.RenderContext)
        // */
        // protected void doRender(RenderContext iRenderContext) {
        // renderer.renderShape(iRenderContext.getGraphics3D(), object);
        // }
        // };
        this.renderer = renderer;
        this.object = object;
    }

    /**
     * @param iRenderContext
     * @see org.eclipse.draw3d.shapes.CuboidShape#doRender(org.eclipse.draw3d.RenderContext)
     */
    protected void doRender(RenderContext iRenderContext) {
        renderer.renderShape(figure, iRenderContext, object);
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "CuboidFigureShape [m_figure=" + figure + "]";
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
     * @return the object
     */
    public Object getModel() {
        return object;
    }
}
