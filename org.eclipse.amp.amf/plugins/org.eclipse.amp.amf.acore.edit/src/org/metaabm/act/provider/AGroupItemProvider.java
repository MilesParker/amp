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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.RemoveCommand;
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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;
import org.metaabm.SContext;
import org.metaabm.act.AAct;
import org.metaabm.act.AGroup;
import org.metaabm.act.ARoot;
import org.metaabm.act.ASelect;
import org.metaabm.act.ASink;
import org.metaabm.act.MetaABMActFactory;
import org.metaabm.act.MetaABMActPackage;
import org.metaabm.commands.RemoveMultiValueCommand;

/**
 * This is the item provider adapter for a {@link org.metaabm.act.AGroup} object.
 * <!-- begin-user-doc --> <!--
 * end-user-doc -->
 * @generated
 */
public class AGroupItemProvider extends AActItemProvider implements IEditingDomainItemProvider, IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource, ITableItemLabelProvider, ITableItemColorProvider, IItemColorProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AGroupItemProvider(AdapterFactory adapterFactory) {
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

			addPluralLabelPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addRootsPropertyDescriptor(object);
			addMembersPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Plural Label feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPluralLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SNamed_pluralLabel_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SNamed_pluralLabel_feature", "_UI_SNamed_type"), MetaABMPackage.Literals.SNAMED__PLURAL_LABEL, true, false, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_IDsPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_SNamed_description_feature"), getString("_UI_PropertyDescriptor_description", "_UI_SNamed_description_feature", "_UI_SNamed_type"), MetaABMPackage.Literals.SNAMED__DESCRIPTION, true, true, false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, getString("_UI_IDsPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Roots feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRootsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_AGroup_roots_feature"), getString("_UI_PropertyDescriptor_description", "_UI_AGroup_roots_feature", "_UI_AGroup_type"), MetaABMActPackage.Literals.AGROUP__ROOTS, false, false, false, null, getString("_UI_RelationsPropertyCategory"), null));
	}

	/**
	 * This adds a property descriptor for the Members feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMembersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(), getString("_UI_AGroup_members_feature"), getString("_UI_PropertyDescriptor_description", "_UI_AGroup_members_feature", "_UI_AGroup_type"), MetaABMActPackage.Literals.AGROUP__MEMBERS, true, true, false, null, getString("_UI_RelationsPropertyCategory"), new String[] { "org.eclipse.ui.views.properties.expert" }));
	}

	// public Collection getChildren(Object object) {
	// if (children == null) {
	// Collection children = super.getChildren(object);
	// children.add(registerIntermediary(object,
	// MetaABMActPackage.Literals.AGROUP__MEMBERS));
	// }
	// return children;
	// }

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
			childrenFeatures.add(MetaABMActPackage.Literals.AGROUP__ROOTS);
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
	 * This returns AGroup.gif.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AGroup"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getText(Object object) {
		if (getParent(object) instanceof SAgent) {
			return "Actions";
		} else {
			return super.getText(object);
		}
	}

	// @Override
	// protected boolean isWrappingNeeded(Object object) {
	// return false;
	// }

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating a
	 * viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(AGroup.class)) {
			case MetaABMActPackage.AGROUP__PLURAL_LABEL:
			case MetaABMActPackage.AGROUP__DESCRIPTION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case MetaABMActPackage.AGROUP__ROOTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				fireNotifyChanged(new ViewerNotification(notification, getParent(notification.getNotifier()), true, false));
			case MetaABMActPackage.AGROUP__MEMBERS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	@SuppressWarnings("unchecked")
	protected Command createRemoveCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection<?> collection) {
		if (feature == MetaABMActPackage.Literals.AGROUP__ROOTS) {
			return createRemoveCommand(domain, owner, (EStructuralFeature) MetaABMActPackage.Literals.AGROUP__MEMBERS, collection);
		} else if (feature == MetaABMActPackage.Literals.AGROUP__MEMBERS) {
			CompoundCommand cmd = new CompoundCommand();
			// Map usages = EcoreUtil.UsageCrossReferencer.findAll(collection,
			// domain.getResourceSet());
			for (AAct act : (Collection<AAct>) collection) {
				cmd.appendIfCanExecute(RemoveCommand.create(domain, act, MetaABMActPackage.Literals.AACT__TARGETS, act.getTargets()));
				if (act.getSelected() == act) {
					cmd.append(SetCommand.create(domain, act, MetaABMActPackage.Literals.AACT__SELECTED, null));
				}
				if (act instanceof ASink) {
					ASink sink = (ASink) act;
					if (sink.isMultiValue()) {
						cmd.append(new RemoveMultiValueCommand(domain, sink));
					}
					// cmd.appendIfCanExecute(SetCommand.create(domain, act,
					// (EStructuralFeature)
					// MetaABMActPackage.Literals.ASINK__FUNCTION, null));
				}
			}
			for (AAct act : (Collection<AAct>) collection) {
				cmd.appendIfCanExecute(RemoveCommand.create(domain, act, MetaABMActPackage.Literals.AACT__SOURCES, act.getSources()));
			}
			cmd.append(super.createRemoveCommand(domain, owner, (EStructuralFeature) MetaABMActPackage.Literals.AGROUP__MEMBERS, collection));
			return cmd;
		}
		return super.createRemoveCommand(domain, owner, feature, collection);
	}

	@SuppressWarnings("unchecked")
	protected Command createAddCommand(EditingDomain domain, EObject owner, EStructuralFeature feature, Collection<?> collection, int index) {
		if (feature == MetaABMActPackage.Literals.AGROUP__ROOTS) {
			CompoundCommand cmd = new CompoundCommand();
			cmd.append(createAddCommand(domain, owner, (EStructuralFeature) MetaABMActPackage.Literals.AGROUP__MEMBERS, collection, index));
			return cmd;
		} else if (feature == MetaABMActPackage.Literals.AGROUP__MEMBERS) {
			CompoundCommand cmd = new CompoundCommand();
			// SuggestLabelCommand suggestLabelCommand = new
			// SuggestLabelCommand(domain,
			// collection);
			Set<Object> affected = new HashSet<Object>(collection);

			// Reassign all 'downstream' targets
			for (AAct act : (Collection<AAct>) collection) {
				if (act.getGroup() != null && act.getGroup() != owner) {
					affected.addAll(act.getAllTargets());
				}
			}
			cmd.append(super.createAddCommand(domain, owner, feature, affected, index));
			for (AAct act : (Collection<AAct>) collection) {
				if (act.getSelected() == null) {
					if (act instanceof ARoot) {
						cmd.appendIfCanExecute(SetCommand.create(domain, act, MetaABMActPackage.Literals.AACT__SELECTED, act));
					}
				}
				if (act instanceof ASelect) {
					AGroup group = (AGroup) owner;
					SContext context = group.getReference().getOwner();
					Command create = SetCommand.create(domain, act, MetaABMActPackage.Literals.ASELECT__AGENT, group.getReference());
					cmd.appendIfCanExecute(create);
					if (context != null) {
						if (context.getProjections().size() == 1) {
							cmd.appendIfCanExecute(SetCommand.create(domain, act, MetaABMActPackage.Literals.ASELECT__SPACE, context.getProjections().get(0)));
						}
					}
				}
				return cmd;
			}
		}
		return super.createAddCommand(domain, owner, feature, collection, index);
	}

	@Override
	protected boolean isWrappingNeeded(Object object) {
		return false;
	}

	static Collection<CommandParameter> ROOT_ACTS;

	/**
	 * This adds to the collection of {@link org.eclipse.emf.edit.command.CommandParameter}s describing all of the
	 * children that can be created under this object. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		// Don't allow creation of targets
		for (EClassifier cl : MetaABMActPackage.eINSTANCE.getEClassifiers()) {
			if (cl instanceof EClass) {
				EClass actClass = (EClass) cl;
				if (MetaABMActPackage.Literals.AROOT.isSuperTypeOf(actClass) && !actClass.isAbstract()) {
					newChildDescriptors.add(createChildParameter(MetaABMActPackage.Literals.AGROUP__MEMBERS, MetaABMActFactory.eINSTANCE.create(actClass)));
				}
			}

		}
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
