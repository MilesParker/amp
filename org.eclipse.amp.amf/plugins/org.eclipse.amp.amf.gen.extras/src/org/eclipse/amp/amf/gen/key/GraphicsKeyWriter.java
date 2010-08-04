/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Metascape - Initial development and maintenance
 *
 * </copyright>
 */
package org.eclipse.amp.amf.gen.key;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public abstract class GraphicsKeyWriter {

    public static int AGENT_WIDTH = 150;

    public static int STYLE_WIDTH = 150;

    public static int CONDITION_WIDTH = 300;

    public static int AGENT_SIZE = 20;

    public static int BORDER = 10;

    public static int INSET = 5;

    int labelWidth = AGENT_WIDTH + STYLE_WIDTH + CONDITION_WIDTH;

    int maxWidth;

    int width = 1;

    int height;

    int singleWidth;

    String modelName;

    protected Graphics2D graphics;

    private BufferedImage fileImage;

    public GraphicsKeyWriter(String modelName) {
        super();
        this.modelName = modelName;
        singleWidth = AGENT_SIZE + (2 * INSET);
    }

    public void createGraphics() {
        int graphicsWidth = labelWidth + INSET + AGENT_SIZE + (BORDER * 2);
        int graphicsHeight = height * (AGENT_SIZE + INSET) + AGENT_SIZE + (BORDER * 2) + INSET;
        fileImage = new BufferedImage(graphicsWidth, graphicsHeight, BufferedImage.TYPE_INT_RGB);
        graphics = fileImage.createGraphics();
        graphics.addRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON));
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, graphicsWidth, graphicsHeight);
        graphics.translate(BORDER, BORDER);
        
        graphics.setColor(Color.BLACK);
        graphics.setFont(new Font("Lucida Sans", Font.BOLD | Font.ITALIC, 12));
        
        graphics.drawString("Agent Name", 0, AGENT_SIZE - INSET);
        graphics.translate(AGENT_WIDTH, 0);
        graphics.drawString("Style", 0, AGENT_SIZE - INSET);
        graphics.translate(STYLE_WIDTH, 0);
        graphics.drawString("Condition", 0, AGENT_SIZE - INSET);
        graphics.translate(CONDITION_WIDTH, 0);
        graphics.translate(-labelWidth, 0);
        graphics.translate(0, INSET);
        graphics.drawLine(0, AGENT_SIZE - INSET, graphicsWidth - 2 * AGENT_SIZE, AGENT_SIZE - INSET);
        graphics.translate(0, AGENT_SIZE + INSET);
        
        graphics.setFont(new Font("Lucida Sans", Font.BOLD, 12));
    }

    public abstract void drawAllStyles();

    public abstract void writeAllStyles();

    public void addStyle(String name) {
        if (maxWidth > width) {
            width = maxWidth;
        }
        height++;
        maxWidth = 0;
    }

    public void addState() {
        maxWidth++;
    }

    public void drawStyle(DrawFeature feature, Object object, String fileName, String agentName, String styleName,
            String condition) {
        graphics.setColor(Color.BLACK);
        graphics.drawString(agentName, 0, AGENT_SIZE - INSET);
        graphics.translate(AGENT_WIDTH, 0);
        graphics.drawString(styleName, 0, AGENT_SIZE - INSET);
        graphics.translate(STYLE_WIDTH, 0);
        graphics.drawString(condition, 0, AGENT_SIZE - INSET);
        graphics.translate(CONDITION_WIDTH, 0);
        feature.draw(graphics, object, AGENT_SIZE, AGENT_SIZE);
        graphics.translate(-labelWidth, 0);
        graphics.translate(0, AGENT_SIZE + INSET);

        BufferedImage singleImage = new BufferedImage(singleWidth, singleWidth, BufferedImage.TYPE_INT_RGB);
        Graphics2D singleGraphics = singleImage.createGraphics();
        singleGraphics.addRenderingHints(new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON));
        singleGraphics.setColor(new Color(255, 255, 255, 255));
        singleGraphics.fillRect(0, 0, singleWidth, singleWidth);
        singleGraphics.translate(INSET, INSET);
        feature.draw(singleGraphics, object, AGENT_SIZE, AGENT_SIZE);
        try {
            ImageIO.write(singleImage, "png", new File("doc/" + fileName + "Symbol.png"));
        } catch (IOException e) {
            System.err.println(e);
        }
        singleGraphics.dispose();
    }

    public void write() {
        drawAllStyles();
        try {
            ImageIO.write(fileImage, "png", new File("doc/" + modelName + "Key.png"));
        } catch (IOException e) {
            System.err.println(e);
        }
        graphics.dispose();
    }

    public void setGraphics(Graphics2D graphics) {
        this.graphics = graphics;
    }

    public Graphics2D getGraphics() {
        return graphics;
    }
}
