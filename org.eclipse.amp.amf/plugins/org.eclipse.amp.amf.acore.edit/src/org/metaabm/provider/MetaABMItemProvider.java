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
package org.metaabm.provider;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.EMFEditPlugin;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedImage;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.metaabm.IID;
import org.metaabm.SNamed;
import org.metaabm.act.AInput;

public abstract class MetaABMItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource,
ITableItemLabelProvider {

    protected static boolean displayAttributeReferences;

    /**
     * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
     */
    public MetaABMItemProvider(AdapterFactory adapterFactory) {
        super(adapterFactory);
    }

    public String suggestLabel(IID object) {
        return getString("_UI_" + object.eClass().getName() + "_type");
    }

    public String suggestID(IID object) {
        return StringUtils.uncapitalize(StringUtils.deleteWhitespace(StringUtils.capitalize(getString("_UI_"
                                                                                                      + object.eClass().getName() + "_type"))));
    }

    public boolean isDisplayAttributeReferences() {
        return displayAttributeReferences;
    }

    public void setDisplayAttributeReferences(boolean _displayAttributeReferences) {
        MetaABMItemProvider.displayAttributeReferences = _displayAttributeReferences;
    }

    public static Collection<?> labels(final Collection<?> ids) {
        Collection<?> inputLabels = CollectionUtils.collect(ids, new org.apache.commons.collections.Transformer() {
            public Object transform(Object o) {
                return ((IID) o).getLabel();
            }
        });
        return inputLabels;
    }

    public static Collection<?> texts(final Collection<?> ids) {
        Collection<?> inputLabels = CollectionUtils.collect(ids, new org.apache.commons.collections.Transformer() {
            public Object transform(Object o) {
                MetaABMItemProvider provider = providerFor(o);
                if (provider != null) {
                    return provider.getText(o);
                } else {
                    return "--";
                }
            }
        });
        return inputLabels;
    }

    public static MetaABMItemProvider providerFor(Object o) {
        MetaABMItemProvider provider = (MetaABMItemProvider) MetaABMItemProviderAdapterFactory
        .getGenericAdapterFactory().adapt(o, IEditingDomainItemProvider.class);
        return provider;
    }

    public static Collection<?> inputVals(final Collection<AInput> inputs) {
        Collection<?> inputLabels = CollectionUtils.collect(inputs, new org.apache.commons.collections.Transformer() {
            public Object transform(Object o) {
                return ((AInput) o).getValue();
            }
        });
        return inputLabels;
    }

    public static Collection<?> ids(final Collection<?> ids) {
        return CollectionUtils.collect(ids, new org.apache.commons.collections.Transformer() {
            public Object transform(Object o) {
                return ((IID) o).getID();
            }
        });
    }

    /**
     * This returns the icon image for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     */
    public Object getCreateChildImage(Object owner, Object feature, Object child, Collection<?> selection) {
        List<Object> images = new ArrayList<Object>();
        IItemLabelProvider itemLabelProvider = (IItemLabelProvider) ((ComposeableAdapterFactory) adapterFactory)
                .getRootAdapterFactory().adapt(child, IItemLabelProvider.class);
        images.add(itemLabelProvider.getImage(child));
        images.add(EMFEditPlugin.INSTANCE.getImage("full/ovr16/CreateChild"));
        return new ComposedImage(images) {
            @Override
            public List<Point> getDrawPoints(Size size) {
                List<Point> result = super.getDrawPoints(size);
                result.get(1).x = size.width - 7;
                return result;
            }
        };
    }

    @Override
    public String getColumnText(Object object, int columnIndex) {
        if (columnIndex == 0) {
            if (object instanceof IID) {
                return ((IID) object).getLabel();
            } else {
                return getText(object);
            }
        } else if (columnIndex == 1) {
            if (object instanceof SNamed) {
                return ((IID) object).getLabel();
            } else {
                return "";
            }
        }
        return super.getColumnText(object, columnIndex);
    }

    /**
     * This does the same thing as ITableLabelProvider.getColumnImage.
     */
    public Object getColumnImage(Object object, int columnIndex) {
        if (columnIndex == 0) {
            return getImage(object);
        }
        return null;
    }

    public static final Collection<?> idsCaps(final Collection<?> ids) {

        return CollectionUtils.collect(ids, new org.apache.commons.collections.Transformer() {
            public Object transform(Object o) {
                if (o instanceof IID) {
                    return StringUtils.capitalize(((IID) o).getID());
                } else if (o instanceof AInput && ((AInput) o).getValue() != null) {
                    return StringUtils.capitalize(((AInput) o).getValue().getID());
                } else {
                    return "null";
                }
            }
        });
    }
}
