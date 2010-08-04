package org.eclipse.amp.agf;

import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class GenericGraphicsProvider implements ILabelProvider, IColorProvider {

    private static GenericGraphicsProvider singleton;

    public static final Image AGENT_IMAGE = AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.amp.agf.core",
    "icons/obj16/SAgent.gif")
    .createImage();

    public static final Image SCAPE_IMAGE = AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.amp.agf.core",
    "icons/obj16/SContext.gif")
    .createImage();

    public static final Image LIST_IMAGE = AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.amp.agf.core",
                                                                                      "icons/obj16/List.gif")
            .createImage();

    public static final Image SPACE_IMAGE = AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.amp.agf.core",
    "icons/obj16/SContinuousSpace.gif")
    .createImage();

    public static final Image GRAPH_IMAGE = AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.amp.agf.core",
    "icons/obj16/SNetwork.gif")
    .createImage();

    public static final Image GRID_IMAGE = AbstractUIPlugin.imageDescriptorFromPlugin("org.eclipse.amp.agf.core",
    "icons/obj16/SGrid.gif")
    .createImage();


    /**
     * @param element
     * @return
     * @see org.eclipse.jface.viewers.ILabelProvider#getText(java.lang.Object)
     */
    public String getText(Object element) {
        return element.getClass().getSimpleName();
    }

    /**
     * @param element
     * @return
     * @see org.eclipse.jface.viewers.ILabelProvider#getImage(java.lang.Object)
     */
    public Image getImage(Object element) {
        return AGENT_IMAGE;
    }

    /**
     * @param listener
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
     */
    public void addListener(ILabelProviderListener listener) {
    }

    /**
     * 
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
     */
    public void dispose() {
    }

    /**
     * @param element
     * @return
     * @see org.eclipse.jface.viewers.IColorProvider#getForeground(java.lang.Object)
     */
    public Color getForeground(Object element) {
        if (element instanceof IColorProvider) {
            return ((IColorProvider) element).getForeground(element);
        }
        return null;
    }

    /**
     * @param element
     * @return
     * @see org.eclipse.jface.viewers.IColorProvider#getBackground(java.lang.Object)
     */
    public Color getBackground(Object element) {
        if (element instanceof IColorProvider) {
            return ((IColorProvider) element).getBackground(element);
        }
        return null;
    }

    /**
     * @param element
     * @param property
     * @return
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang.Object, java.lang.String)
     */
    public boolean isLabelProperty(Object element, String property) {
        return false;
    }

    /**
     * @param listener
     * @see org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse.jface.viewers.ILabelProviderListener)
     */
    public void removeListener(ILabelProviderListener listener) {
    }

    public static GenericGraphicsProvider getDefault() {
        if (singleton == null) {
            singleton = new GenericGraphicsProvider();
        }
        return singleton;
    }
}
