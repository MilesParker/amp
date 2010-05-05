package org.eclipse.amp.agf.zest;

import org.eclipse.draw2d.IFigure;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.zest.core.viewers.IConnectionStyleProvider;
import org.eclipse.zest.core.viewers.IEntityStyleProvider;
import org.eclipse.zest.core.widgets.ZestStyles;

public class ZestStyleProvider implements IEntityStyleProvider, ILabelProvider, IColorProvider,
IConnectionStyleProvider {

    public final static Color GREEN_COLOR = Display.getCurrent().getSystemColor(org.eclipse.swt.SWT.COLOR_GREEN);

    public final static Color BLUE_COLOR = Display.getCurrent().getSystemColor(org.eclipse.swt.SWT.COLOR_BLUE);
    ILabelProvider provider;


    public ZestStyleProvider(ILabelProvider provider) {
        super();
        this.provider = provider;
    }

    public boolean fisheyeNode(Object entity) {
        return false;
    }

    public Color getBackgroundColour(Object entity) {
        return getBackground(entity);
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
        return getForeground(entity);
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

    /**
     * @param element
     * @return
     * @see org.eclipse.jface.viewers.IColorProvider#getBackground(java.lang.Object)
     */
    public Color getBackground(Object element) {
        return GREEN_COLOR;// ((IColorProvider) provider).getBackground(element);
    }

    /**
     * @param element
     * @return
     * @see org.eclipse.jface.viewers.IColorProvider#getForeground(java.lang.Object)
     */
    public Color getForeground(Object element) {
        return BLUE_COLOR;// ((IColorProvider) provider).getForeground(element);
    }

    /**
     * @param rel
     * @return
     * @see org.eclipse.zest.core.viewers.IConnectionStyleProvider#getColor(java.lang.Object)
     */
    public Color getColor(Object rel) {
        return null;
    }

    /**
     * @param rel
     * @return
     * @see org.eclipse.zest.core.viewers.IConnectionStyleProvider#getConnectionStyle(java.lang.Object)
     */
    public int getConnectionStyle(Object rel) {
        return ZestStyles.CONNECTIONS_SOLID;
    }

    /**
     * @param rel
     * @return
     * @see org.eclipse.zest.core.viewers.IConnectionStyleProvider#getHighlightColor(java.lang.Object)
     */
    public Color getHighlightColor(Object rel) {
        return null;
    }

    /**
     * @param rel
     * @return
     * @see org.eclipse.zest.core.viewers.IConnectionStyleProvider#getLineWidth(java.lang.Object)
     */
    public int getLineWidth(Object rel) {
        return 3;
    }

}
