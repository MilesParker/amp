/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.amp.amf.parameters.aPar.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.amp.amf.abase.aBase.ABaseFactory;

import org.eclipse.amp.amf.parameters.aPar.AParPackage;
import org.eclipse.amp.amf.parameters.aPar.SweepParameter;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.amp.amf.parameters.aPar.SweepParameter} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SweepParameterItemProvider
	extends ParameterItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SweepParameterItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAttributePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Attribute feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAttributePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SweepParameter_attribute_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SweepParameter_attribute_feature", "_UI_SweepParameter_type"),
				 AParPackage.Literals.SWEEP_PARAMETER__ATTRIBUTE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AParPackage.Literals.SWEEP_PARAMETER__START_VALUE);
			childrenFeatures.add(AParPackage.Literals.SWEEP_PARAMETER__END_VALUE);
			childrenFeatures.add(AParPackage.Literals.SWEEP_PARAMETER__INCREMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SweepParameter.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SweepParameter"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_SweepParameter_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SweepParameter.class)) {
			case AParPackage.SWEEP_PARAMETER__START_VALUE:
			case AParPackage.SWEEP_PARAMETER__END_VALUE:
			case AParPackage.SWEEP_PARAMETER__INCREMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(AParPackage.Literals.SWEEP_PARAMETER__START_VALUE,
				 ABaseFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(AParPackage.Literals.SWEEP_PARAMETER__START_VALUE,
				 ABaseFactory.eINSTANCE.createIntValue()));

		newChildDescriptors.add
			(createChildParameter
				(AParPackage.Literals.SWEEP_PARAMETER__START_VALUE,
				 ABaseFactory.eINSTANCE.createRealValue()));

		newChildDescriptors.add
			(createChildParameter
				(AParPackage.Literals.SWEEP_PARAMETER__START_VALUE,
				 ABaseFactory.eINSTANCE.createStringValue()));

		newChildDescriptors.add
			(createChildParameter
				(AParPackage.Literals.SWEEP_PARAMETER__START_VALUE,
				 ABaseFactory.eINSTANCE.createBooleanValue()));

		newChildDescriptors.add
			(createChildParameter
				(AParPackage.Literals.SWEEP_PARAMETER__END_VALUE,
				 ABaseFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(AParPackage.Literals.SWEEP_PARAMETER__END_VALUE,
				 ABaseFactory.eINSTANCE.createIntValue()));

		newChildDescriptors.add
			(createChildParameter
				(AParPackage.Literals.SWEEP_PARAMETER__END_VALUE,
				 ABaseFactory.eINSTANCE.createRealValue()));

		newChildDescriptors.add
			(createChildParameter
				(AParPackage.Literals.SWEEP_PARAMETER__END_VALUE,
				 ABaseFactory.eINSTANCE.createStringValue()));

		newChildDescriptors.add
			(createChildParameter
				(AParPackage.Literals.SWEEP_PARAMETER__END_VALUE,
				 ABaseFactory.eINSTANCE.createBooleanValue()));

		newChildDescriptors.add
			(createChildParameter
				(AParPackage.Literals.SWEEP_PARAMETER__INCREMENT,
				 ABaseFactory.eINSTANCE.createValue()));

		newChildDescriptors.add
			(createChildParameter
				(AParPackage.Literals.SWEEP_PARAMETER__INCREMENT,
				 ABaseFactory.eINSTANCE.createIntValue()));

		newChildDescriptors.add
			(createChildParameter
				(AParPackage.Literals.SWEEP_PARAMETER__INCREMENT,
				 ABaseFactory.eINSTANCE.createRealValue()));

		newChildDescriptors.add
			(createChildParameter
				(AParPackage.Literals.SWEEP_PARAMETER__INCREMENT,
				 ABaseFactory.eINSTANCE.createStringValue()));

		newChildDescriptors.add
			(createChildParameter
				(AParPackage.Literals.SWEEP_PARAMETER__INCREMENT,
				 ABaseFactory.eINSTANCE.createBooleanValue()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == AParPackage.Literals.SWEEP_PARAMETER__START_VALUE ||
			childFeature == AParPackage.Literals.SWEEP_PARAMETER__END_VALUE ||
			childFeature == AParPackage.Literals.SWEEP_PARAMETER__INCREMENT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
