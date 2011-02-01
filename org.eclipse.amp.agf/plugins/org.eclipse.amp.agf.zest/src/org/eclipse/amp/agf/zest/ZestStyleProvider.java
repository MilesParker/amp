package org.eclipse.amp.agf.zest;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.amp.agf.IGraphicsAdapter;
import org.eclipse.amp.agf.gef.GenericEditPart;
import org.eclipse.amp.agf.gef.IFigureProvider;
import org.eclipse.amp.axf.core.ICompositionProvider;
import org.eclipse.core.runtime.Assert;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.eclipse.zest.core.viewers.EntityConnectionData;
import org.eclipse.zest.core.viewers.GraphViewer;
import org.eclipse.zest.core.viewers.IConnectionStyleProvider;
import org.eclipse.zest.core.viewers.IEntityStyleProvider;
import org.eclipse.zest.core.widgets.ZestStyles;

public class ZestStyleProvider implements IEntityStyleProvider, ILabelProvider, IColorProvider,
IConnectionStyleProvider, org.eclipse.zest.core.viewers.IFigureProvider {

    public final static Color HIGHLIGHT_COLOR = Display.getCurrent().getSystemColor(org.eclipse.swt.SWT.COLOR_YELLOW);

    public final static Color LINE_COLOR = Display.getCurrent().getSystemColor(org.eclipse.swt.SWT.COLOR_BLACK);

    IGraphicsAdapter graphicsAdapter;

    private Map<Object, IColorProvider> colorProviderFor = new HashMap<Object, IColorProvider>();
    private HashMap<Object, ILabelProvider> labelProviderFor = new HashMap<Object, ILabelProvider>();
    private HashMap<Object, IFigureProvider> figureProviderFor = new HashMap<Object, IFigureProvider>();

    private HashMap<Object, IFigure> figureFor = new HashMap<Object, IFigure>();

    private ICompositionProvider compositionProvider;

    private GraphViewer viewer;

    public ZestStyleProvider(GraphViewer viewer, Object object, ICompositionProvider compositionProvider,
            IGraphicsAdapter graphicsAdapter) {
        super();
        this.viewer = viewer;
        this.compositionProvider = compositionProvider;
        this.graphicsAdapter = graphicsAdapter;
        // viewer.addSelectionChangedListener(new SelectionChangedEvent(viewer, null));
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
        return HIGHLIGHT_COLOR;
    }

    public int getBorderWidth(Object entity) {
        return 2;
    }

    public Color getForegroundColour(Object entity) {
        return getForeground(entity);
    }

    /**
     * 
     * @param entity
     * @return
     * @see org.eclipse.zest.core.viewers.IEntityStyleProvider#getNodeHighlightColor(java.lang.Object)
     */
    public Color getNodeHighlightColor(Object entity) {
        return HIGHLIGHT_COLOR;
    }

    public IFigure getTooltip(Object entity) {
        return null;
    }

    public void dispose() {
    }

    public Image getImage(Object element) {
        if (!(element instanceof EntityConnectionData) && getFigureProvider(element) != null) {
            return getLabelProvider(element).getImage(element);
        }
        return null;
    }

    public String getText(Object element) {
        if (!(element instanceof EntityConnectionData)) {
            return getLabelProvider(element).getText(element);
        }
        return null;
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
        return LINE_COLOR;
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
        return HIGHLIGHT_COLOR;
    }

    /**
     * @param rel
     * @return
     * @see org.eclipse.zest.core.viewers.IConnectionStyleProvider#getLineWidth(java.lang.Object)
     */
    public int getLineWidth(Object rel) {
        return 1;
    }

    public IFigure getFigure(Object element) {
        IFigure figure = figureFor.get(element);
        if (figure == null) {
            figure = getFigureProvider(element).getFigure(element);
            figureFor.put(element, figure);
        }
        if (isSelected(element)) {
            highlightFigure(figure);
        } else {
            figure.setBorder(null);
        }
        return figure;
    }

    private boolean isSelected(Object element) {
        if (viewer.getSelection() instanceof StructuredSelection) {
            StructuredSelection ss = (StructuredSelection) viewer.getSelection();
            for (Object sel : ss.toArray()) {
                if (sel == element) {
                    return true;
                }
            }
        }
        return false;
    }

    private void highlightFigure(IFigure figure) {
        if (figure instanceof Ellipse) {
            figure.setBorder(GenericEditPart.HIGHLIGHT_ELLIPSE);
        } else if (figure instanceof RoundedRectangle) {
            figure.setBorder(GenericEditPart.HIGHLIGHT_RECTANGLE);
        } else {
            figure.setBorder(GenericEditPart.HIGHLIGHT_RECTANGLE);
        }
    }

    protected IFigureProvider getFigureProvider(Object object) {
        // Object parent = compositionProvider.getParent(object);
        IFigureProvider figureProvider = figureProviderFor.get(object);
        if (figureProvider == null) {
            figureProvider = (IFigureProvider) graphicsAdapter.getAdapter(object, IFigureProvider.class);
            figureProviderFor.put(object, figureProvider);
            Assert.isNotNull(figureProvider);
        }
        return figureProvider;
    }

    protected IColorProvider getColorProvider(Object object) {
        // Object parent = compositionProvider.getParent(object);
        IColorProvider colorProvider = colorProviderFor.get(object);
        if (colorProvider == null) {
            colorProvider = (IColorProvider) graphicsAdapter.getAdapter(object, IColorProvider.class);
            colorProviderFor.put(object, colorProvider);
            Assert.isNotNull(colorProvider);
        }
        return colorProvider;
    }

    protected ILabelProvider getLabelProvider(Object object) {
        // Object parent = compositionProvider.getParent(object);
        ILabelProvider labelProvider = labelProviderFor.get(object);
        if (labelProvider == null) {
            labelProvider = (ILabelProvider) graphicsAdapter.getAdapter(object, ILabelProvider.class);
            labelProviderFor.put(object, labelProvider);
        }
        return labelProvider;
    }

}
