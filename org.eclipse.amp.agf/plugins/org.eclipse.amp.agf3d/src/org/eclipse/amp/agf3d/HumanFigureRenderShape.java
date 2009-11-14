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

import org.eclipse.draw3d.graphics3d.Graphics3D;
import org.eclipse.draw3d.graphics3d.Graphics3DDraw;
import org.eclipse.draw3d.graphics3d.Graphics3DUtil;
import org.eclipse.jface.viewers.IColorProvider;
import org.lwjgl.util.glu.Cylinder;
import org.lwjgl.util.glu.Disk;

/**
 * 
 * @author mparker
 *
 */
public class HumanFigureRenderShape implements IRenderer {

    static HumanFigureRenderShape singleton;

    IColorProvider colorProvider;

    public HumanFigureRenderShape(IColorProvider colorProvider) {
        super();
        this.colorProvider = colorProvider;
    }

    public HumanFigureRenderShape() {
        super();
    }

    public static IRenderer getDefault() {
        if (singleton == null) {
            singleton = new HumanFigureRenderShape();
        }
        return singleton;
    }

    public static IRenderer create(IColorProvider colors) {
        return new HumanFigureRenderShape(colors);
    }

    /**
     * @param g3d
     * @param object
     * @see org.eclipse.amp.agf3d.IRenderer#renderShape(org.eclipse.draw3d.graphics3d.Graphics3D, java.lang.Object)
     */
    public synchronized void renderShape(Graphics3D g3d, Object object) {
        if (colorProvider != null) {
            g3d.glColor(colorProvider.getBackground(object));
        }

        float scale = 1.0f;

        float bodyWidth = 0.4f * scale;
        float bodyDepth = 0.3f * scale;
        float bodyHeight = 0.4f * scale;
        float legWidth = 0.1f * scale;
        float legHeight = 0.6f * scale;
        float skirtHeight = 0.3f * scale;
        float headWidth = 0.3f * scale;
        float headHeight = 0.2f * scale;
        float totalHeight = legHeight + bodyHeight + headHeight;

        // base
        g3d.glTranslatef(-0.5f, -0.5f, 0);

        // legs
        // colorForEdu(g3d, adult);
        g3d.glTranslatef(bodyWidth * .25f, bodyDepth / 2.0f, 0);
        drawCylinder(g3d, legWidth, legHeight, false);
        g3d.glTranslatef(bodyWidth * .5f, 0, 0);
        drawCylinder(g3d, legWidth, legHeight, false);
        g3d.glTranslatef(-bodyWidth * .75f, -bodyDepth * .5f, 0);

        //        if (adult.getGender() == GenderEnum.male) {
        g3d.glTranslatef(0, 0, legHeight);
        //        } else {
        //            g3d.glTranslatef(bodyWidth * .5f, bodyDepth / 2.0f, legHeight - skirtHeight);
        //            drawCylinder(g3d, bodyWidth * 1.5f, bodyWidth * .8f, skirtHeight, false);
        //            g3d.glTranslatef(-bodyWidth * .5f, -bodyDepth / 2.0f, skirtHeight);
        //        }

        // body
        // colorForSES(g3d, adult);
        drawCube(g3d, bodyWidth, bodyDepth, bodyHeight);
        // if (adult.isPregnant()) {
        // g3d.glTranslatef(bodyWidth * 0.5f, bodyDepth * 0.5f, 0);
        // glSetColor(g3d, ColorFeature.RED, 200);
        // drawCylinder(g3d, bodyWidth * 1.5f, bodyHeight * .5f, true);
        // g3d.glTranslatef(-bodyWidth * .5f, -bodyDepth * .5f, 0);
        // }
        g3d.glTranslatef(bodyWidth / 2.0f, bodyDepth / 2.0f, bodyHeight);

        // head
        // colorForRace(g3d, adult);
        drawCylinder(g3d, headWidth, headHeight, true);

        g3d.glTranslatef(0.0f, 0.0f, -(legHeight + bodyHeight));

        //        drawForSexOccurred(g3d, adult, totalHeight);
        //        drawForRelationship(g3d, adult);

        g3d.glTranslatef(-.5f, -.5f, -(legHeight + bodyHeight));

        g3d.glEnd();

    }

    private void drawCylinder(Graphics3D g3d, float width, float height, boolean cap) {
        drawCylinder(g3d, width, width, height, cap);
    }

    private void drawCylinder(Graphics3D g3d, float width1, float width2, float height, boolean cap) {
        Cylinder head = new Cylinder();
        head.setNormals(Graphics3DUtil.GLU_FLAT);
        head.setDrawStyle(Graphics3DUtil.GLU_FILL);
        head.draw(width1 / 2, width2 / 2, height, 30, 10);
        g3d.glTranslatef(0, 0, height);
        if (cap) {
            Disk disk = new Disk();
            disk.setNormals(Graphics3DUtil.GLU_FLAT);
            disk.setDrawStyle(Graphics3DUtil.GLU_FILL);
            disk.setOrientation(Graphics3DUtil.GLU_INSIDE);
            disk.draw(width1 / 2, 0, 10, 1);
        }
        g3d.glTranslatef(0, 0, -height);
    }

    private void drawCube(Graphics3D g3d, float width, float depth, float height) {
        g3d.glBegin(Graphics3DDraw.GL_QUADS);

        // back
        g3d.glNormal3f(0, 0, height);
        g3d.glVertex3f(0, 0, height);
        g3d.glVertex3f(width, 0, height);
        g3d.glVertex3f(width, depth, height);
        g3d.glVertex3f(0, depth, height);

        // left
        g3d.glNormal3f(-width, 0, 0);
        g3d.glVertex3f(0, 0, 0);
        g3d.glVertex3f(0, 0, height);
        g3d.glVertex3f(0, depth, height);
        g3d.glVertex3f(0, depth, 0);

        // right
        g3d.glNormal3f(width, 0, 0);
        g3d.glVertex3f(width, 0, height);
        g3d.glVertex3f(width, 0, 0);
        g3d.glVertex3f(width, depth, 0);
        g3d.glVertex3f(width, depth, height);

        // top
        g3d.glNormal3f(0, depth, 0);
        g3d.glVertex3f(0, depth, height);
        g3d.glVertex3f(width, depth, height);
        g3d.glVertex3f(width, depth, 0);
        g3d.glVertex3f(0, depth, 0);

        // bottom
        g3d.glNormal3f(0, -depth, 0);
        g3d.glVertex3f(0, 0, 0);
        g3d.glVertex3f(width, 0, 0);
        g3d.glVertex3f(width, 0, height);
        g3d.glVertex3f(0, 0, height);
        g3d.glEnd();
    }

}
