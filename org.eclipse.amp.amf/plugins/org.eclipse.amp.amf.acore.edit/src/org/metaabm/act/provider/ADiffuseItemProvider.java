/**
 * Copyright (c) 2007-2009 Metascape, LLC, Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.metaabm.act.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
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
import org.metaabm.SAttribute;
import org.metaabm.SAttributeType;
import org.metaabm.SContext;
import org.metaabm.act.ADiffuse;
import org.metaabm.act.ASelect;
import org.metaabm.act.MetaABMActPackage;

/**
 * This is the item provider adapter for a {@link org.metaabm.act.ADiffuse} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * @generated
 */
public class ADiffuseItemProvider extends ASelectItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ADiffuseItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addDiffusedPropertyDescriptor(object);
			addDiffusionRatePropertyDescriptor(object);
			addEvaporationRatePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	protected void filterAttributes(EList<SAttribute> potential, Collection<SAttribute> applicable) {
		for (SAttribute attr : potential) {
			if (!attr.isImmutable() && SAttributeType.NUMERIC_ACCEPTS.contains(attr.getSType())) {
				applicable.add(attr);
			}
		}
	}

	protected Collection<?> getAssignableValues(Object object) {
		ASelect diffuse = (ASelect) object;
		Collection<SAttribute> potentialRates = new ArrayList<SAttribute>();
		SContext parent = diffuse.getAgent().getOwner();
		while (parent != null) {
			filterAttributes(parent.getAttributes(), potentialRates);
			parent = parent.getOwner();
		}
		return potentialRates;
	}

	/**
	 * This adds a property descriptor for the Diffused feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addDiffusedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_ADiffuse_diffused_feature"), getString("_UI_PropertyDescriptor_description", "_UI_ADiffuse_diffused_feature", "_UI_ADiffuse_type"), MetaABMActPackage.Literals.ADIFFUSE__DIFFUSED, true, false, true, null, getString("_UI_ActPropertyCategory"), null) {
			public Collection<?> getChoiceOfValues(Object object) {
				ADiffuse diffuse = (ADiffuse) object;
				Collection<SAttribute> diffusable = new ArrayList<SAttribute>();
				filterAttributes(diffuse.getAgent().getAttributes(), diffusable);
				return diffusable;
			}

		});
	}

	/**
	 * This adds a property descriptor for the Diffusion Rate feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addDiffusionRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_ADiffuse_diffusionRate_feature"), getString("_UI_PropertyDescriptor_description", "_UI_ADiffuse_diffusionRate_feature", "_UI_ADiffuse_type"), MetaABMActPackage.Literals.ADIFFUSE__DIFFUSION_RATE, true, false, true, null, getString("_UI_ActPropertyCategory"), null) {
			public Collection<?> getChoiceOfValues(Object object) {
				return getAssignableValues(object);
			}
		});
	}

	/**
	 * This adds a property descriptor for the Evaporation Rate feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	protected void addEvaporationRatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(new ItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_ADiffuse_evaporationRate_feature"), getString("_UI_PropertyDescriptor_description", "_UI_ADiffuse_evaporationRate_feature", "_UI_ADiffuse_type"), MetaABMActPackage.Literals.ADIFFUSE__EVAPORATION_RATE, true, false, true, null, getString("_UI_ActPropertyCategory"), null) {
			public Collection<?> getChoiceOfValues(Object object) {
				return getAssignableValues(object);
			}
		});
	}

	/**
	 * This returns ADiffuse.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ADiffuse"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

	public String suggestLabel(IID object) {
		return "Diffuse";
	}
}
