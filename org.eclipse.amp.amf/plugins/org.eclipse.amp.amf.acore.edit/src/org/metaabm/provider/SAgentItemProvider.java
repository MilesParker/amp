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

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandWrapper;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.edit.command.CreateChildCommand;
import org.eclipse.emf.edit.command.SetCommand;
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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.metaabm.MetaABMFactory;
import org.metaabm.IID;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;
import org.metaabm.SContext;
import org.metaabm.SImplemented;
import org.metaabm.SNamed;
import org.metaabm.SStyle;
import org.metaabm.act.AAct;
import org.metaabm.act.ACreateAgents;
import org.metaabm.act.AGroup;
import org.metaabm.act.MetaABMActFactory;
import org.metaabm.commands.AddImplementatedCommand;
import org.metaabm.commands.SuggestLabelCommand;

/**
 * This is the item provider adapter for a {@link org.metaabm.SAgent} object. <!-- begin-user-doc --> <!-- end-user-doc
 * -->
 * 
 * @generated
 */
public class SAgentItemProvider extends SActableItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	private AttributesItemProvider attributesItemProvider;

	private StylesItemProvider stylesItemProvider;

	Map<EReference, ItemProviderAdapter> providerForFeature;

	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SAgentItemProvider(AdapterFactory adapterFactory) {
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
			SImplementedItemProvider.addImplementationAsProperties((SImplemented) object, this);
		}
		return itemPropertyDescriptors;
	}

	public Object getAttributes() {
		return attributesItemProvider;
	}

	public Object getStyles() {
		return stylesItemProvider;
	}

	@Override
	public void dispose() {
		super.dispose();
		if (childrenFeatures != null) {
			if (attributesItemProvider != null) {
				attributesItemProvider.dispose();
			}
			if (stylesItemProvider != null) {
				stylesItemProvider.dispose();
			}
		}
	}

	@Override
	protected Command createCreateChildCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value, int index, Collection<?> collection) {
		return createWrappedCommand(super.createCreateChildCommand(domain, owner, feature, value, index, collection), owner, feature);
	}

	@Override
	protected Command createRemoveCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection<?> collection) {
		return createWrappedCommand(super.createRemoveCommand(domain, owner, feature, collection), owner, feature);
	}

	@Override
	protected Command createSetCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Object value, int index) {
		if (feature == MetaABMPackage.Literals.IID__LABEL || feature == MetaABMPackage.Literals.SNAMED__PLURAL_LABEL) {
			CompoundCommand cmd = new CompoundCommand();
			cmd.append(super.createSetCommand(domain, owner, feature, value, index));
			SAgent agent = (SAgent) owner;
			EList<SStyle> styles = agent.getStyles();
			if (styles.size() > 0) {
				cmd.append(new SuggestLabelCommand(domain, styles));
			}
			SContext context = agent.getOwner();
			if (context != null) {
				if ((AGroup) context.getRootActivity() != null) {
					for (AAct act : ((AGroup) context.getRootActivity()).getMembers()) {
						if (act instanceof ACreateAgents && ((ACreateAgents) act).getAgent() == this) {
							cmd.appendAndExecute(new SuggestLabelCommand(domain, act));
						}
					}
				}
			}
			return cmd;
		} else {
			return super.createSetCommand(domain, owner, feature, value, index);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	protected Command createAddCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection<?> collection, int index) {
		if (feature == MetaABMPackage.eINSTANCE.getSAgent_Styles()) {
			CompoundCommand cmd = new CompoundCommand();
			cmd.append(createWrappedCommand(super.createAddCommand(domain, owner, feature, collection, index), owner, feature));
			cmd.append(new AddImplementatedCommand(domain, collection));
			for (Object object : collection) {
				SStyle style = (SStyle) object;
				cmd.append(SetCommand.create(domain, style, MetaABMPackage.Literals.SACTABLE__ROOT_ACTIVITY, MetaABMActFactory.eINSTANCE.createAGroup()));
			}
			cmd.append(new SuggestLabelCommand(domain, (Collection<IID>) collection));
			return cmd;
		} else {
			return createWrappedCommand(super.createAddCommand(domain, owner, feature, collection, index), owner, feature);
		}
	}

	protected Command createWrappedCommand(Command command, final EObject owner, final EStructuralFeature feature) {
		final ItemProviderAdapter adapter = providerForFeature != null ? providerForFeature.get(feature) : null;
		if (adapter != null) {
			return new CommandWrapper(command) {
				@Override
				public Collection<?> getAffectedObjects() {
					Collection<?> affected = super.getAffectedObjects();
					if (affected.contains(owner)) {
						affected = Collections.singleton(adapter);
					}
					return affected;
				}
			};
		} else {
			return command;
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
	 * This adds a property descriptor for the Styles feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStylesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SAgent_styles_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SAgent_styles_feature", "_UI_SAgent_type"), MetaABMPackage.Literals.SAGENT__STYLES, true, false, false, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Owner feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SAgent_owner_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SAgent_owner_feature", "_UI_SAgent_type"), MetaABMPackage.Literals.SAGENT__OWNER, false, false, false, null, getString("_UI_RelationsPropertyCategory"), new String[] { "org.eclipse.ui.views.properties.expert" }));
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
			childrenFeatures = new ArrayList<EStructuralFeature>();
			childrenFeatures.add(MetaABMPackage.Literals.SACTABLE__ROOT_ACTIVITY);
			childrenFeatures.add(MetaABMPackage.Literals.SAGENT__CHILDREN);
		}
		return childrenFeatures;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Collection<?> getChildren(Object object) {
		Collection<Object> children = (Collection<Object>) super.getChildren(object);
		if (providerForFeature == null) {
			SAgent parent = (SAgent) object;
			providerForFeature = new HashMap<EReference, ItemProviderAdapter>();

			attributesItemProvider = new AttributesItemProvider(adapterFactory, parent);
			providerForFeature.put(MetaABMPackage.Literals.SATTRIBUTED__ATTRIBUTES, attributesItemProvider);

			stylesItemProvider = new StylesItemProvider(adapterFactory, parent);
			providerForFeature.put(MetaABMPackage.Literals.SAGENT__STYLES, stylesItemProvider);
		}

		if (!children.contains(attributesItemProvider)) {
			children.add(attributesItemProvider);
			children.add(stylesItemProvider);
		}
		return children;
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
	 * This returns SAgent.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SAgent"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		String label = ((SAgent) object).getLabel();
		return label == null || label.length() == 0 ? getString("_UI_SAgent_type") : label;
	}

	@Override
	public String suggestLabel(IID id) {
		return (id.eContainer() != null ? ((IID) id.eContainer()).getLabel() + " " : "") + super.suggestLabel(id);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that can be created under
	 * this object. <!-- begin-user-doc -->Don't let agent styles being added!<!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		// don't call super methods because we don't want attributes added..
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public boolean hasChildren(Object object) {
		return hasChildren(object, false);
	}

	/**
	 * This returns the description for {@link CreateChildCommand}.
	 */
	@Override
	public String getCreateChildDescription(Object owner, Object feature, Object child, Collection<?> selection) {
		if (feature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature) feature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry) child;
			feature = entry.getEStructuralFeature();
			child = entry.getValue();
		}

		String childType = feature instanceof EAttribute ? getTypeText((EAttribute) feature) : getTypeText(child);
		Object selectionObject = selection == null || selection.isEmpty() ? null : selection.iterator().next();

		if (selectionObject == owner) {
			return getResourceLocator().getString("_UI_CreateChild_description", new Object[] { childType, getFeatureText(feature), getTypeText(owner) });
		}

		Object sibling = selectionObject;
		Object siblingFeature = getChildFeature(owner, sibling);

		if (siblingFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature) siblingFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry) sibling;
			siblingFeature = entry.getEStructuralFeature();
			sibling = entry.getValue();
		}

		String siblingType = siblingFeature instanceof EAttribute ? getTypeText((EAttribute) siblingFeature) : getTypeText(sibling);
		return getResourceLocator().getString("_UI_CreateSibling_description", new Object[] { childType, getFeatureText(feature), siblingType });
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating a
	 * viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SNamed.class)) {
			case MetaABMPackage.IID__ID:
			case MetaABMPackage.IID__LABEL:
			case MetaABMPackage.SNAMED__PLURAL_LABEL:
			case MetaABMPackage.SNAMED__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		switch (notification.getFeatureID(SAgent.class)) {
			case MetaABMPackage.SAGENT__ROOT_ACTIVITY:
			case MetaABMPackage.SAGENT__IMPLEMENTATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MetaABMPackage.SAGENT__STYLES:
			case MetaABMPackage.SAGENT__CHILDREN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

}
