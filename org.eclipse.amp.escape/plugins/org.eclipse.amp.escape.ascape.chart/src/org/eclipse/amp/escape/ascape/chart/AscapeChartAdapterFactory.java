package org.eclipse.amp.escape.ascape.chart;

import org.eclipse.amp.agf.chart.IDataProvider;
import org.eclipse.core.runtime.IAdapterFactory;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating ScapeAdapter objects.
 */
public class AscapeChartAdapterFactory implements IAdapterFactory {
    private static final Class[] TYPES = {
        IDataProvider.class };

    /**
     * @param adaptableObject
     * @param adapterType
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapter(java.lang.Object, java.lang.Class)
     */
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        if (adapterType == IDataProvider.class) {
            return new AscapeDataProvider();
        }
        return null;
    }

    /**
     * @return
     * @see org.eclipse.core.runtime.IAdapterFactory#getAdapterList()
     */
    public Class[] getAdapterList() {
        // TODO Auto-generated method stub
        return TYPES;
    }

}
