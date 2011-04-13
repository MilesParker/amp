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
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.metaabm.IID;
import org.metaabm.MetaABMFactory;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;
import org.metaabm.SImplemented;
import org.metaabm.SStyle;

/**
 * This is the item provider adapter for a {@link org.metaabm.SStyle} object. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
public class SStyleItemProvider extends SActableItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SStyleItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	public Object getParent(Object object) {
		Object agent = super.getParent(object);
		SAgentItemProvider itemProvider = (SAgentItemProvider) adapterFactory.adapt(agent, IEditingDomainItemProvider.class);
		// System.out.println((new StringBuffer(" : " + itemProvider).insert(0,
		// "[SStyleItemProvider.getParent] itemProvider")));

		return itemProvider != null ? itemProvider.getStyles() : null;
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
			SImplementedItemProvider.addImplementationAsProperties((SImplemented) object, this);
		}
		return itemPropertyDescriptors;
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
	 * This returns SStyle.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SStyle"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return super.getText(object);
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

		switch (notification.getFeatureID(SStyle.class)) {
			case MetaABMPackage.SSTYLE__IMPLEMENTATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	public String suggestLabel(IID object) {
		SAgent agent = ((SStyle) object).getAgent();
		return (agent != null ? agent.getLabel() + " " : "") + super.suggestLabel(object);
	}

	public String suggestID(IID object) {
		return "";
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

}
