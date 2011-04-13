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
package org.metaabm.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptorDecorator;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.metaabm.IID;
import org.metaabm.MetaABMFactory;
import org.metaabm.MetaABMPackage;
import org.metaabm.SImplementation;
import org.metaabm.SImplemented;
import org.metaabm.commands.SetLabelCommand;
import org.metaabm.commands.SuggestLabelCommand;

/**
 * This is the item provider adapter for a {@link org.metaabm.SImplemented} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class SImplementedItemProvider extends IIDItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SImplementedItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addParentPropertyDescriptor(object);
			addImplementationAsProperties((SImplemented) object, this);
		}
		return itemPropertyDescriptors;
	}

	public static void addImplementationAsProperties(SImplemented implemented, ItemProviderAdapter adapter) {
		SImplementation implementation = implemented.getImplementation();
		SImplementationItemProvider implProv = (SImplementationItemProvider) adapter.getAdapterFactory().adapt(implementation, IItemLabelProvider.class);
		List<?> implDesc = implProv.getPropertyDescriptors(implementation);
		final String feature = adapter.getString("_UI_SImplemented_implementation_feature");
		for (Object name : implDesc) {
			ItemPropertyDescriptor desc = (ItemPropertyDescriptor) name;
			adapter.getPropertyDescriptors(implementation).add(new ItemPropertyDescriptorDecorator(implementation, desc) {
				@Override
				public String getCategory(Object thisObject) {
					return feature;
				}

				@Override
				public String getId(Object thisObject) {
					return feature + getDisplayName(thisObject);
				}
			});
		}
	}

	/**
	 * This adds a property descriptor for the Parent feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SImplemented_parent_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SImplemented_parent_feature", "_UI_SImplemented_type"), MetaABMPackage.Literals.SIMPLEMENTED__PARENT, false, false, false, null, getString("_UI_RelationsPropertyCategory"), new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	/**
	 * This returns SImplemented.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SImplemented"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SImplemented) object).getID();
		return label == null || label.length() == 0 ? getString("_UI_SImplemented_type") : getString("_UI_SImplemented_type") + " " + label;
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

		switch (notification.getFeatureID(SImplemented.class)) {
			case MetaABMPackage.SIMPLEMENTED__IMPLEMENTATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	@Override
	protected Command createSetCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value, int index) {
		if (feature == MetaABMPackage.Literals.SIMPLEMENTED__IMPLEMENTATION && value instanceof IID) {
			CompoundCommand cmd = new CompoundCommand("Add Implementation to " + ((IID) owner).getLabel());
			cmd.append(super.createSetCommand(domain, owner, feature, value, index));
			@SuppressWarnings(value = { "unused" })
			Object adapt = adapterFactory.adapt(value, IEditingDomainItemProvider.class);
			cmd.append(new SuggestLabelCommand(domain, (IID) value));
			return cmd;
		} else if (feature == MetaABMPackage.Literals.IID__LABEL) {
			return SetLabelCommand.create(domain, owner, feature, value, index);
		} else {
			return super.createSetCommand(domain, owner, feature, value, index);
		}
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

		newChildDescriptors.add(createChildParameter(MetaABMPackage.Literals.SIMPLEMENTED__IMPLEMENTATION, MetaABMFactory.eINSTANCE.createSImplementation()));
	}

	@Override
	public String suggestLabel(IID object) {
		SImplemented implemented = (SImplemented) object;
		String label = getString("_UI_" + implemented.eClass().getName() + "_type");
		return label;
	}

	@Override
	public String suggestID(IID object) {
		return "";
	}

}
