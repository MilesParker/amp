/**
 * 
 */
package org.eclipse.amp.escape.ascape.adapt;

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.amp.agf.IPropertyChangeProvider;
import org.eclipse.amp.escape.ascape.wrap.ScapeWrapperModel;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.ComboBoxPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.ui.views.properties.IPropertySource;
import org.eclipse.ui.views.properties.IPropertySource2;
import org.eclipse.ui.views.properties.PropertyDescriptor;
import org.eclipse.ui.views.properties.TextPropertyDescriptor;

import org.ascape.model.CellOccupant;
import org.ascape.model.HostCell;
import org.ascape.model.Scape;
import org.ascape.util.PropertyAccessor;

// TODO: Auto-generated Javadoc
/**
 * The Class BeanPropertySource.
 */
public class BeanPropertySource implements IPropertySource, IPropertySource2, IPropertyChangeProvider {

    Object source;

    IPropertyDescriptor[] eclipseDescriptors;

    Map<Method, java.beans.PropertyDescriptor> descriptorsSet;

    transient protected PropertyChangeSupport listeners = new PropertyChangeSupport(this);

    /**
     * Instantiates a new bean property source.
     * 
     * @param source the source
     */
    public BeanPropertySource(Object source) {
        super();
        this.source = source;
        if (this.source instanceof ScapeWrapperModel) {
            this.source = ((ScapeWrapperModel) source).getScape();
        }
        descriptorsSet = new HashMap<Method, java.beans.PropertyDescriptor>();
        createDescriptors();
    }

    /**
     * @return
     * @see org.eclipse.ui.views.properties.IPropertySource#getEditableValue()
     */
    public Object getEditableValue() {
        return source;
    }

    /**
     * @return
     * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyDescriptors()
     */
    public IPropertyDescriptor[] getPropertyDescriptors() {
        if (eclipseDescriptors == null) {
            createDescriptors();
            // Arrays.sort(eclipseDescriptors, new Comparator() {
            // public int compare(Object o1, Object o2) {
            // java.beans.PropertyDescriptor p1 = ((PropertyDescriptor) o1);
            // PropertyDescriptor p2 = ((PropertyDescriptor) o2);
            // if (PropertyAccessor.isWriteable(p1) &&
            // !PropertyAccessor.isWriteable(p2)) {
            // return -1;
            // } else if (PropertyAccessor.isWriteable(p2) &&
            // !PropertyAccessor.isWriteable(p1)) {
            // return 1;
            // }
            // return p1.getName().compareTo(p2.getName());
            // }
            // });

        }
        return eclipseDescriptors;
    }

    static Map<Method, PropertyDescriptor> descriptorLibrary = new HashMap<Method, PropertyDescriptor>();

    static final PropertyDescriptor dummy = new PropertyDescriptor("dummy", "dummy");

    /**
     * Creates the descriptor.
     * 
     * @param id the id
     * @param beanDescr the bean descr
     * 
     * @return the i property descriptor
     */
    IPropertyDescriptor createDescriptor(Method id, java.beans.PropertyDescriptor beanDescr, String category) {
        PropertyDescriptor desc = getDescriptor(id);
        if (desc == null) {
            Class<?> propertyType = beanDescr.getPropertyType();
            final Object[] enumValues = propertyType.getEnumConstants();
            if (propertyType.isArray()) {
                desc = dummy;
            } else if (enumValues != null) {
                String[] valueNames = new String[enumValues.length];
                for (int i = 0; i < enumValues.length; i++) {
                    final Enum<?> en = (Enum<?>) enumValues[i];
                    valueNames[i] = en.toString();
                }
                desc = new ComboBoxPropertyDescriptor(id, PropertyAccessor.getLongName(beanDescr), valueNames);
                if (category == null) {
                    category = "Attributes";
                }
            } else if (propertyType.isPrimitive() || propertyType == String.class) {
                if (beanDescr.getWriteMethod() != null) {
                    if (propertyType == Boolean.TYPE) {
                        desc = new ComboBoxPropertyDescriptor(id, PropertyAccessor.getLongName(beanDescr),
                                                              new String[] {
                            "true", "false" });
                    } else {
                        desc = new TextPropertyDescriptor(id, PropertyAccessor.getLongName(beanDescr));
                    }
                    if (category == null) {
                        category = "Attributes";
                    }
                    desc.setDescription("The value for " + id.getName());
                } else {
                    if (propertyType == Boolean.TYPE) {
                        desc = new ComboBoxPropertyDescriptor(id, PropertyAccessor.getLongName(beanDescr),
                                                              new String[] {
                            "true", "false" }) {

                            @Override
                            public CellEditor createPropertyEditor(Composite parent) {
                                return null;
                            }
                        };
                    } else {
                        desc = new PropertyDescriptor(id, PropertyAccessor.getLongName(beanDescr));
                    }
                    if (category == null) {
                        category = "Attributes (Fixed)";
                    }
                }
            } else {
                desc = new PropertyDescriptor(id, PropertyAccessor.getLongName(beanDescr));
                if (category == null) {
                    category = "Objects";
                }
            }
            desc.setCategory(category);
            descriptorLibrary.put(id, desc);
        }
        return desc != dummy ? desc : null;
    }

    private PropertyDescriptor getDescriptor(Method id) {
        return descriptorLibrary.get(id);
    }

    protected void createDescriptors() {
        if (source instanceof Scape) {
            if (source.getClass() != Scape.class) {
                createDescriptors(source.getClass(), Scape.class, null);
            }
            createDescriptors(Scape.class, null, "Model");
        } else if (source instanceof HostCell && source.getClass() != HostCell.class) {
            createDescriptors(source.getClass(), HostCell.class, null);
            createDescriptors(HostCell.class, null, "Model");
        } else if (source instanceof CellOccupant && source.getClass() != CellOccupant.class) {
            createDescriptors(source.getClass(), CellOccupant.class, null);
            createDescriptors(CellOccupant.class, null, "Model");
        } else {
            createDescriptors(source.getClass(), null, null);
        }
    }

    protected void createDescriptors(Class sourceClass, Class stopClass, String category) {
        if (source != null) {
            try {
                java.beans.PropertyDescriptor[] beansDescriptors;
                beansDescriptors = Introspector.getBeanInfo(sourceClass, stopClass).getPropertyDescriptors();
                Collection<IPropertyDescriptor> descrs = new ArrayList<IPropertyDescriptor>();
                if (eclipseDescriptors != null) {
                    descrs.addAll(Arrays.asList(eclipseDescriptors));
                }
                for (int i = 0; i < beansDescriptors.length; i++) {
                    java.beans.PropertyDescriptor beanDescr = beansDescriptors[i];
                    Method id = beanDescr.getReadMethod();
                    if (id != null) {
                        IPropertyDescriptor descr = createDescriptor(id, beanDescr, category);
                        if (descr != null) {
                            descrs.add(descr);
                            descriptorsSet.put(id, beanDescr);
                        }
                    }
                }

                eclipseDescriptors = descrs.toArray(new IPropertyDescriptor[descrs.size()]);
            } catch (IntrospectionException e) {
                throw new RuntimeException(e);
            }
        } else {
            eclipseDescriptors = new IPropertyDescriptor[0];
        }
    }

    /**
     * Gets the value.
     * 
     * @param descriptor the descriptor
     * 
     * @return the value
     */
    public Object getValue(java.beans.PropertyDescriptor descriptor) {
        return PropertyAccessor.getValue(source, descriptor);
    }

    /**
     * @param id
     * @return
     * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyValue(java.lang.Object)
     */
    public Object getPropertyValue(Object id) {
        java.beans.PropertyDescriptor descriptor = descriptorsSet.get(id);
        final Object[] enumValues = descriptor.getPropertyType().getEnumConstants();
        if (enumValues != null) {
            for (int i = 0; i < enumValues.length; i++) {
                final Enum<?> en = (Enum<?>) enumValues[i];
                if (en.toString() == getValue(descriptor).toString()) {
                    return i;
                }
            }
            return -1;
        } else if (descriptor.getPropertyType() == Boolean.TYPE) {
            if ((Boolean) getValue(descriptor)) {
                return 0;
            } else {
                return 1;
            }
        } else {
            return PropertyAccessor.getAsText(source, descriptor);
        }
    }

    /**
     * @param id
     * @return
     * @see org.eclipse.ui.views.properties.IPropertySource#isPropertySet(java.lang.Object)
     */
    public boolean isPropertySet(Object id) {
        return false;
    }

    /**
     * Sets the as object.
     * 
     * @param descriptor the descriptor
     * @param value the value
     * 
     * @throws InvocationTargetException the invocation target exception
     * @throws IllegalArgumentException the illegal argument exception
     */
    public void setAsObject(java.beans.PropertyDescriptor descriptor, Object value) throws InvocationTargetException,
    IllegalArgumentException {
        Object[] args = new Object[] { value };
        try {
            descriptor.getWriteMethod().invoke(source, args);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Set as text won't work for property " + descriptor.getName()
                                       + ", access too restricted: " + e);
        }
    }

    /**
     * @param id
     * @param value
     * @see org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java.lang.Object, java.lang.Object)
     */
    public void setPropertyValue(Object id, Object value) {
        try {
            java.beans.PropertyDescriptor descriptor = descriptorsSet.get(id);
            Object oldValue;
            final Object[] enumValues = descriptor.getPropertyType().getEnumConstants();
            if (enumValues != null) {
                oldValue = getValue(descriptor);
                setAsObject(descriptor, enumValues[(Integer) value]);
            } else if (descriptor.getPropertyType() == Boolean.TYPE) {
                oldValue = getValue(descriptor);
                if (getValue(descriptor) == Integer.valueOf(0)) {
                    setAsObject(descriptor, true);
                } else {
                    setAsObject(descriptor, false);
                }
            } else {
                oldValue = PropertyAccessor.getAsText(source, descriptor);
                PropertyAccessor.setAsText(source, (String) value, descriptor);
            }
            firePropertyChange(((Method) id).toString(), oldValue, value);
        } catch (IllegalArgumentException e) {
            // throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * @param id
     * @return
     * @see org.eclipse.ui.views.properties.IPropertySource2#isPropertyResettable(java.lang.Object)
     */
    public boolean isPropertyResettable(Object id) {
        return false;
    }

    /**
     * @param l
     * @see org.eclipse.amp.agf.IPropertyChangeProvider#addPropertyChangeListener(java.beans.PropertyChangeListener)
     */
    public void addPropertyChangeListener(PropertyChangeListener l) {
        listeners.addPropertyChangeListener(l);
    }

    /**
     * Fire property change.
     * 
     * @param id the id
     * @param old the old
     * @param newValue the new value
     */
    protected void firePropertyChange(String id, Object old, Object newValue) {
        listeners.firePropertyChange(id, old, newValue);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        listeners = new PropertyChangeSupport(this);
    }

    /**
     * @param l
     * @see org.eclipse.amp.agf.IPropertyChangeProvider#removePropertyChangeListener(java.beans.PropertyChangeListener)
     */
    public void removePropertyChangeListener(PropertyChangeListener l) {
        listeners.removePropertyChangeListener(l);
    }

    /**
     * @param id
     * @see org.eclipse.ui.views.properties.IPropertySource#resetPropertyValue(java.lang.Object)
     */
    public void resetPropertyValue(Object id) {
    }
}