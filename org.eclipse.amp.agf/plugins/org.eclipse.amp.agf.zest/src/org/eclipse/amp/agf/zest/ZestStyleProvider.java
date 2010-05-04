package org.eclipse.amp.agf.zest;

import org.eclipse.draw2d.IFigure;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.zest.core.viewers.IEntityStyleProvider;

public class ZestStyleProvider implements IEntityStyleProvider, ILabelProvider {

    ILabelProvider provider;

    public ZestStyleProvider(ILabelProvider provider) {
        super();
        this.provider = provider;
    }

    public boolean fisheyeNode(Object entity) {
        return false;
    }

    public Color getBackgroundColour(Object entity) {
        return ((IColorProvider) provider).getBackground(entity);
    }

    public Color getBorderColor(Object entity) {
        return null;
    }

    public Color getBorderHighlightColor(Object entity) {
        return null;
    }

    public int getBorderWidth(Object entity) {
        return 2;
    }

    public Color getForegroundColour(Object entity) {
        return ((IColorProvider) provider).getForeground(entity);
    }

    public Color getNodeHighlightColor(Object entity) {
        return null;
    }

    public IFigure getTooltip(Object entity) {
        return null;
    }

    public void dispose() {
    }

    public Image getImage(Object element) {
        return provider.getImage(element);
    }

    public String getText(Object element) {
        return provider.getText(element);
    }

    public void addListener(ILabelProviderListener listener) {
    }

    public boolean isLabelProperty(Object element, String property) {
        return provider.isLabelProperty(element, property);
    }

    public void removeListener(ILabelProviderListener listener) {
    }

}
