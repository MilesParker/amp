/**
 * 
 */
package org.eclipse.amp.agf;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IAdapterManager;
import org.eclipse.core.runtime.Platform;
import org.eclipse.gef.EditPart;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySourceProvider;

/**
 * The Class EditPartSourceProvider.
 */
public class EditPartSourceProvider implements IPropertySourceProvider {

    private Map<Object, IPropertySource> propertySources = new HashMap<Object, IPropertySource>();

    /**
     * Sets the property sources.
     * 
     * @param propertySources the property sources
     */
    public void setPropertySources(Map<Object, IPropertySource> propertySources) {
        this.propertySources = propertySources;
    }

    /**
     * Gets the property sources.
     * 
     * @return the property sources
     */
    public Map<Object, IPropertySource> getPropertySources() {
        return propertySources;
    }

    /**
     * @param object
     * @return
     * @see org.eclipse.amp.escape.ascape.adapt.BeanPropertySourceProvider#getPropertySource(java.lang.Object)
     */
    public IPropertySource getPropertySource(Object object) {
        IPropertySource source = getPropertySources().get(object);
        if (source == null) {
            if (object instanceof EditPart) {
                final EditPart editPart = (EditPart) object;
                Object model = getSource(editPart);
                source = createPropertySource(model);
                ((IPropertyChangeProvider) source).addPropertyChangeListener(new PropertyChangeListener() {
                    public void propertyChange(PropertyChangeEvent evt) {
                        editPart.refresh();
                    }
                });
            } else {
                source = createPropertySource(object);
            }
            getPropertySources().put(object, source);
        }
        return source;
    }

    private IPropertySource createPropertySource(Object model) {
        IAdapterManager adapterManager = Platform.getAdapterManager();
        return (IPropertySource) adapterManager.getAdapter(model, IPropertySource.class);
    }

    /**
     * Gets the source.
     * 
     * @param editPart the edit part
     * 
     * @return the source
     */
    protected Object getSource(final EditPart editPart) {
        return editPart.getModel();
    }
}