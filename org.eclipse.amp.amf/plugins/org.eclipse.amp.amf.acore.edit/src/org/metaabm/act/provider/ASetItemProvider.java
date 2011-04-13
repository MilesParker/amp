/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Argonne National Laboratory - Initial development (pre-contribution)
 *   Metascape - Subsequent development and maintenance
 *
 * </copyright>
 */
package org.metaabm.act.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemColorProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITableItemColorProvider;
import org.eclipse.emf.edit.provider.ITableItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import org.metaabm.IID;
import org.metaabm.IValue;
import org.metaabm.SState;
import org.metaabm.act.ASet;
import org.metaabm.act.MetaABMActPackage;

/**
 * This is the item provider adapter for a {@link org.metaabm.act.ASet} object.
 * <!-- begin-user-doc -->
 * 
 * @author Miles Parker <!-- end-user-doc -->
 * @generated
 */
public class ASetItemProvider extends AAccessorItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ASetItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addParameterPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parameter feature. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addParameterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_ASet_parameter_feature"), getString("_UI_PropertyDescriptor_description", "_UI_ASet_parameter_feature", "_UI_ASet_type"), MetaABMActPackage.Literals.ASET__PARAMETER, true, false, true, null, getString("_UI_ActPropertyCategory"), null) {
			@SuppressWarnings("unchecked")
			public Collection<?> getChoiceOfValues(Object object) {
				ASet set = (ASet) object;
				Collection<IValue> original = (Collection<IValue>) super.getChoiceOfValues(object);
				Collection<IValue> potential = new ArrayList<IValue>();
				if (set.getAttribute() != null) {
					if (set.getAttribute() instanceof SState) {
						potential.addAll(((SState) set.getAttribute()).getOptions());
					}

					for (IValue candidate : original) {
						if (set.isReachable(candidate) && set.getAttribute().accepts(candidate)) {
							potential.add(candidate);
						}
					}
				}
				return potential;
			}
		});
	}

	/**
	 * This returns ASet.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ASet"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return super.getText(object);
		// ASet set = (ASet) object;
		// MetaABMItemProvider valueProvider = providerFor(set.getAttribute());
		// MetaABMItemProvider parameterProvider = providerFor(set.getParameter());
		// String selected = set.getSelected() != null && set.getSelected() != set.getGroup() ? set.getSelected()
		// .getLabel()
		// + " " : "";
		// return "Set " + selected + (valueProvider != null ? valueProvider.getText(set.getAttribute()) : "[?]") +
		// " to "
		// + (parameterProvider != null ? parameterProvider.getText(set.getParameter()) : "[?]");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	public String suggestLabel(IID object) {
		ASet acc = (ASet) object;
		return "Set " + (acc.getAttribute() != null ? acc.getAttribute().getLabel() : "[?]") + " To " + (acc.getParameter() != null ? acc.getParameter().getLabel() : "[?]");
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}
}
