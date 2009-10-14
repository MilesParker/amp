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

import java.util.Map;

import org.eclipse.draw3d.DisplayListManager;
import org.eclipse.draw3d.RenderContext;
import org.eclipse.draw3d.geometry.IVector3f;
import org.eclipse.draw3d.geometry.ParaxialBoundingBox;
import org.eclipse.draw3d.graphics3d.Graphics3D;
import org.eclipse.draw3d.graphics3d.Graphics3DDraw;
import org.eclipse.draw3d.graphics3d.Graphics3DUtil;
import org.eclipse.draw3d.shapes.Shape;
import org.eclipse.draw3d.util.ColorConverter;
import org.eclipse.swt.graphics.Color;
import org.lwjgl.util.glu.Cylinder;
import org.lwjgl.util.glu.Disk;

public class SolidShape implements Shape {

    private static final float[] DEFAULT_COLOR = new float[] { 0, 0, 0, 1 };

    private static final String DL_FRONT = "solid_cube_front";

    private static final String DL_REST = "solid_cube_rest";

    private static final String DL_TEXTURE = "solid_cube_texture";


    private final float[] m_color = new float[] { DEFAULT_COLOR[0], DEFAULT_COLOR[1], DEFAULT_COLOR[2],
        DEFAULT_COLOR[3] };

    private Integer m_textureId;

    private void glSetColor(Graphics3D g3d) {

        float r = m_color[0];
        float g = m_color[1];
        float b = m_color[2];
        float a = m_color[3];

        g3d.glColor4f(r, g, b, a);
    }

    private void initDisplayLists(DisplayListManager i_displayListManager, final Graphics3D g3d) {

        if (i_displayListManager.isDisplayList(DL_REST, DL_FRONT, DL_TEXTURE)) {
            return;
        }

        Runnable front = new Runnable() {
            public void run() {
                //              Cylinder cylinder = new Cylinder();
                //              cylinder.setNormals(Graphics3DUtil.GLU_FLAT);
                //              cylinder.setDrawStyle(Graphics3DUtil.GLU_FILL);
                //
                //              Disk disk = new Disk();
                //              disk.setNormals(Graphics3DUtil.GLU_FLAT);
                //              disk.setDrawStyle(Graphics3DUtil.GLU_FILL);
                //              disk.setOrientation(Graphics3DUtil.GLU_INSIDE);
                //
                //              cylinder.draw(RADIUS, 0, HEIGHT, SLICES, SUBDIVS);
                renderFront(g3d);
            }

        };

        Runnable rest = new Runnable() {
            public void run() {
                renderRest();
                // g3d.glBegin(Graphics3DDraw.GL_QUADS);
                // // back
                // g3d.glNormal3f(0, 0, 1);
                // g3d.glVertex3f(0, 0, 1);
                // g3d.glVertex3f(1, 0, 1);
                // g3d.glVertex3f(1, 1, 1);
                // g3d.glVertex3f(0, 1, 1);
                //
                // // left
                // g3d.glNormal3f(-1, 0, 0);
                // g3d.glVertex3f(0, 0, 0);
                // g3d.glVertex3f(0, 0, 1);
                // g3d.glVertex3f(0, 1, 1);
                // g3d.glVertex3f(0, 1, 0);
                //
                // // right
                // g3d.glNormal3f(1, 0, 0);
                // g3d.glVertex3f(1, 0, 1);
                // g3d.glVertex3f(1, 0, 0);
                // g3d.glVertex3f(1, 1, 0);
                // g3d.glVertex3f(1, 1, 1);
                //
                // // top
                // g3d.glNormal3f(0, 1, 0);
                // g3d.glVertex3f(0, 1, 1);
                // g3d.glVertex3f(1, 1, 1);
                // g3d.glVertex3f(1, 1, 0);
                // g3d.glVertex3f(0, 1, 0);
                //
                // // bottom
                // g3d.glNormal3f(0, -1, 0);
                // g3d.glVertex3f(0, 0, 0);
                // g3d.glVertex3f(1, 0, 0);
                // g3d.glVertex3f(1, 0, 1);
                // g3d.glVertex3f(0, 0, 1);
                //
                // g3d.glEnd();
            }

        };

        i_displayListManager.createDisplayList(DL_FRONT, front);
        // i_displayListManager.createDisplayList(DL_TEXTURE, texture);
        i_displayListManager.createDisplayList(DL_REST, rest);
    }

    @Override
    public void render(RenderContext renderContext) {

        DisplayListManager displayListManager = renderContext.getDisplayListManager();
        Graphics3D g3d = renderContext.getGraphics3D();
        initDisplayLists(displayListManager, g3d);

        if (m_textureId != null) {
            g3d.glColor4f(0, 0, 0, 0);

            g3d.glBindTexture(Graphics3DDraw.GL_TEXTURE_2D, m_textureId);
            g3d.glTexEnvi(Graphics3DDraw.GL_TEXTURE_ENV, Graphics3DDraw.GL_TEXTURE_ENV_MODE, Graphics3DDraw.GL_REPLACE);

            // displayListManager.executeDisplayList(DL_TEXTURE);
            // g3d.glBindTexture(Graphics3DDraw.GL_TEXTURE_2D, 0);

            glSetColor(g3d);
        } else {
            glSetColor(g3d);
            displayListManager.executeDisplayList(DL_FRONT);
        }

        displayListManager.executeDisplayList(DL_REST);
    }

    protected void renderFront(final Graphics3D g3d) {
        g3d.glBegin(Graphics3DDraw.GL_QUADS);
        g3d.glNormal3f(0, 0, -1);
        g3d.glVertex3f(0, 0, 0);
        g3d.glVertex3f(0, 1, 0);
        g3d.glVertex3f(1, 1, 0);
        g3d.glVertex3f(1, 0, 0);
        g3d.glEnd();
    }

    protected void renderRest() {
        Cylinder cylinder = new Cylinder();
        cylinder.setNormals(Graphics3DUtil.GLU_FLAT);
        cylinder.setDrawStyle(Graphics3DUtil.GLU_FILL);

        Disk disk = new Disk();
        disk.setNormals(Graphics3DUtil.GLU_FLAT);
        disk.setDrawStyle(Graphics3DUtil.GLU_FILL);
        disk.setOrientation(Graphics3DUtil.GLU_INSIDE);

        cylinder.draw(1.0f, 0, 2.0f, 20, 30);
    }

    /**
     * Sets the color of this cube.
     * 
     * @param i_color the color
     * @param i_alpha the alpha value
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
     * Sets the texture of the font face.
     * 
     * @param i_textureId the texture id
     */
    public void setTexture(Integer i_textureId) {

        m_textureId = i_textureId;
    }

    /**
     * @param iRayOrigin
     * @param iRayDirection
     * @param iContext
     * @return
     * @see org.eclipse.draw3d.picking.Pickable#getDistance(org.eclipse.draw3d.geometry.IVector3f,
     *      org.eclipse.draw3d.geometry.IVector3f, java.util.Map)
     */
    public float getDistance(IVector3f iRayOrigin, IVector3f iRayDirection, Map<Object, Object> iContext) {
        return 0;
    }

    /**
     * @param oResult
     * @return
     * @see org.eclipse.draw3d.picking.Pickable#getParaxialBoundingBox(org.eclipse.draw3d.geometry.ParaxialBoundingBox)
     */
    public ParaxialBoundingBox getParaxialBoundingBox(ParaxialBoundingBox oResult) {
        return null;
    }

    /**
     * @param iRenderContext
     * @return
     * @see org.eclipse.draw3d.RenderFragment#getDistanceMeasure(org.eclipse.draw3d.RenderContext)
     */
    public float getDistanceMeasure(RenderContext iRenderContext) {
        return 0;
    }

    /**
     * @return
     * @see org.eclipse.draw3d.RenderFragment#getRenderType()
     */
    public RenderType getRenderType() {
        return null;
    }

    //    @Override
    //    protected void setup(RenderContext renderContext) {
    //        Graphics3D g3d = renderContext.getGraphics3D();
    //        g3d.glPolygonMode(Graphics3DDraw.GL_FRONT_AND_BACK, Graphics3DDraw.GL_FILL);
    //    }
}
