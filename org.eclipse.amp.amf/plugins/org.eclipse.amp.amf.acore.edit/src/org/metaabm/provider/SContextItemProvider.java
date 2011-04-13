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
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.metaabm.IID;
import org.metaabm.MetaABMFactory;
import org.metaabm.MetaABMPackage;
import org.metaabm.SContext;
import org.metaabm.commands.AddAgentsCommand;
import org.metaabm.commands.AddSpacesCommand;
import org.metaabm.commands.RemoveAgentActsCommand;
import org.metaabm.function.MetaABMFunctionFactory;

/**
 * This is the item provider adapter for a {@link org.metaabm.SContext} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class SContextItemProvider extends SAgentItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SContextItemProvider(AdapterFactory adapterFactory) {
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

			addAllAgentsPropertyDescriptor(object);
			addAllContextsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the All Agents feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllAgentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SContext_allAgents_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SContext_allAgents_feature", "_UI_SContext_type"), MetaABMPackage.Literals.SCONTEXT__ALL_AGENTS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the All Contexts feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllContextsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SContext_allContexts_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SContext_allContexts_feature", "_UI_SContext_type"), MetaABMPackage.Literals.SCONTEXT__ALL_CONTEXTS, true, false, true, null, null, null));
	}

	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection<?> collection, int index) {
		if (feature == MetaABMPackage.Literals.SCONTEXT__PROJECTIONS) {
			return new AddSpacesCommand(domain, owner, collection, index);
		} else if (feature == MetaABMPackage.Literals.SCONTEXT__AGENTS) {
			return new AddAgentsCommand(domain, owner, collection, index);
		} else {
			return super.createAddCommand(domain, owner, feature, collection, index);
		}
	}

	@Override
	protected Command createRemoveCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection<?> collection) {
		if (feature == MetaABMPackage.eINSTANCE.getSContext_Projections()) {
			// todo we need to remove builder automatically.
			return super.createRemoveCommand(domain, owner, feature, collection);
		} else if (feature == MetaABMPackage.eINSTANCE.getSContext_Agents()) {
			return new RemoveAgentActsCommand(domain, owner, feature, collection);
		} else {
			return super.createRemoveCommand(domain, owner, feature, collection);
		}
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(MetaABMPackage.Literals.SCONTEXT__AGENTS);
			childrenFeatures.add(MetaABMPackage.Literals.SCONTEXT__PROJECTIONS);
			childrenFeatures.add(MetaABMPackage.Literals.SCONTEXT__VALUE_LAYERS);
			childrenFeatures.add(MetaABMPackage.Literals.SCONTEXT__LIBRARY);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SContext.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SContext"));
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

		switch (notification.getFeatureID(SContext.class)) {
			case MetaABMPackage.SCONTEXT__AGENTS:
			case MetaABMPackage.SCONTEXT__PROJECTIONS:
			case MetaABMPackage.SCONTEXT__VALUE_LAYERS:
			case MetaABMPackage.SCONTEXT__LIBRARY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
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

		newChildDescriptors.add(createChildParameter(MetaABMPackage.Literals.SCONTEXT__AGENTS, MetaABMFactory.eINSTANCE.createSAgent()));

		newChildDescriptors.add(createChildParameter(MetaABMPackage.Literals.SCONTEXT__AGENTS, MetaABMFactory.eINSTANCE.createSContext()));

		newChildDescriptors.add(createChildParameter(MetaABMPackage.Literals.SCONTEXT__PROJECTIONS, MetaABMFactory.eINSTANCE.createSContinuousSpace()));

		newChildDescriptors.add(createChildParameter(MetaABMPackage.Literals.SCONTEXT__PROJECTIONS, MetaABMFactory.eINSTANCE.createSGrid()));

		newChildDescriptors.add(createChildParameter(MetaABMPackage.Literals.SCONTEXT__PROJECTIONS, MetaABMFactory.eINSTANCE.createSNetwork()));

		newChildDescriptors.add(createChildParameter(MetaABMPackage.Literals.SCONTEXT__PROJECTIONS, MetaABMFactory.eINSTANCE.createSGeography()));

		newChildDescriptors.add(createChildParameter(MetaABMPackage.Literals.SCONTEXT__VALUE_LAYERS, MetaABMFactory.eINSTANCE.createSValueLayer()));

		newChildDescriptors.add(createChildParameter(MetaABMPackage.Literals.SCONTEXT__LIBRARY, MetaABMFunctionFactory.eINSTANCE.createFLibrary()));

		newChildDescriptors.add(createChildParameter(MetaABMPackage.Literals.SCONTEXT__LIBRARY, MetaABMFunctionFactory.eINSTANCE.createFImplementedLibrary()));
	}

	public String suggestLabel(IID id) {
		return ((SContext) id).getOwner() != null ? super.suggestLabel(id) : "Root Context";
	}
}
