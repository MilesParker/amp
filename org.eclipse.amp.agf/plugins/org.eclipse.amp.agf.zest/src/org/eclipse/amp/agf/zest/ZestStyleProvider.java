package org.eclipse.amp.agf.zest;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.amp.agf.GenericGraphicsProvider;
import org.eclipse.amp.agf.IGraphicsAdapter;
import org.eclipse.amp.agf.gef.IFigureProvider;
import org.eclipse.amp.axf.core.ICompositionProvider;
import org.eclipse.core.runtime.Assert;
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
IConnectionStyleProvider, org.eclipse.zest.core.viewers.IFigureProvider {

    public final static Color GREEN_COLOR = Display.getCurrent().getSystemColor(org.eclipse.swt.SWT.COLOR_GREEN);

    public final static Color BLUE_COLOR = Display.getCurrent().getSystemColor(org.eclipse.swt.SWT.COLOR_BLUE);

    IGraphicsAdapter graphicsAdapter;

    private Map<Object, IColorProvider> colorFor = new HashMap<Object, IColorProvider>();
    private HashMap<Object, ILabelProvider> labelFor = new HashMap<Object, ILabelProvider>();
    private HashMap<Object, IFigureProvider> figureFor = new HashMap<Object, IFigureProvider>();

    private final ICompositionProvider compositionProvider;

    public ZestStyleProvider(Object input, ICompositionProvider compositionProvider, IGraphicsAdapter graphicsAdapter) {
        super();
        this.compositionProvider = compositionProvider;
        this.graphicsAdapter = graphicsAdapter;
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
        return getLabelProvider(element).getImage(element);
    }

    public String getText(Object element) {
        return getLabelProvider(element).getText(element);
    }

    public void addListener(ILabelProviderListener listener) {
    }

    public boolean isLabelProperty(Object element, String property) {
        return getLabelProvider(element).isLabelProperty(element, property);
    }

    public void removeListener(ILabelProviderListener listener) {
    }

    /**
     * @param element
     * @return
     * @see org.eclipse.jface.viewers.IColorProvider#getBackground(java.lang.Object)
     */
    public Color getBackground(Object element) {
        return getColorProvider(element).getBackground(element);
    }

    /**
     * @param element
     * @return
     * @see org.eclipse.jface.viewers.IColorProvider#getForeground(java.lang.Object)
     */
    public Color getForeground(Object element) {
        return getColorProvider(element).getForeground(element);
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

    public IFigure getFigure(Object element) {
        return getFigureProvider(element).getFigure(element);
    }

    private IFigureProvider getFigureProvider(Object object) {
        // Object parent = compositionProvider.getParent(object);
        IFigureProvider figureProvider = figureFor.get(object);
        if (figureProvider == null) {
            figureProvider = (IFigureProvider) graphicsAdapter.getAdapter(object, IFigureProvider.class);
            figureFor.put(object, figureProvider);
            Assert.isNotNull(figureProvider);
        }
        return figureProvider;
    }

    private IColorProvider getColorProvider(Object object) {
        // Object parent = compositionProvider.getParent(object);
        IColorProvider colorProvider = colorFor.get(object);
        if (colorProvider == null) {
            colorProvider = (IColorProvider) graphicsAdapter.getAdapter(object, IColorProvider.class);
            colorFor.put(object, colorProvider);
            Assert.isNotNull(colorProvider);
        }
        return colorProvider;
    }

    private ILabelProvider getLabelProvider(Object object) {
        // Object parent = compositionProvider.getParent(object);
        ILabelProvider labelProvider = labelFor.get(object);
        if (labelProvider == null) {
            labelProvider = (ILabelProvider) graphicsAdapter.getAdapter(object, ILabelProvider.class);
            if (labelProvider == null) {
                labelProvider = GenericGraphicsProvider.getDefault();
            }
            labelFor.put(object, labelProvider);
        }
        return labelProvider;
    }

}
