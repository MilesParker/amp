/**
 * <copyright>
 * </copyright>
 *
 * $Id: FailureItemProvider.java,v 1.2 2009/08/03 17:15:48 mparker Exp $
 */
package org.eclipse.amp.amf.testing.ares.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.amp.amf.testing.aTest.Constraint;
import org.eclipse.amp.amf.testing.ares.AresPackage;
import org.eclipse.amp.amf.testing.ares.Failure;
import org.eclipse.amp.amf.testing.ares.Issue;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.eclipse.amp.amf.testing.ares.Failure} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FailureItemProvider
extends ItemProviderAdapter
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
    public FailureItemProvider(AdapterFactory adapterFactory) {
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

            addConstraintPropertyDescriptor(object);
            addIssuePropertyDescriptor(object);
            addActualValuePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Constraint feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConstraintPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Failure_constraint_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Failure_constraint_feature", "_UI_Failure_type"),
                 AresPackage.Literals.FAILURE__CONSTRAINT,
                 false,
                 false,
                 true,
                 null,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Issue feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIssuePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Failure_issue_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Failure_issue_feature", "_UI_Failure_type"),
                 AresPackage.Literals.FAILURE__ISSUE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Actual Value feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addActualValuePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_Failure_actualValue_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_Failure_actualValue_feature", "_UI_Failure_type"),
                 AresPackage.Literals.FAILURE__ACTUAL_VALUE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
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
            childrenFeatures.add(AresPackage.Literals.FAILURE__CONSTRAINT);
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
     * This returns Failure.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public Object getImage(Object object) {
        Failure failure = (Failure) object;
        if (failure.getIssue() == Issue.ABOVE_RANGE) {
            return overlayImage(object, getResourceLocator().getImage("full/obj16/MaxExclusive"));
        } else if (failure.getIssue() == Issue.BELOW_RANGE) {
            return overlayImage(object, getResourceLocator().getImage("full/obj16/MinExclusive"));
        } else {
            return overlayImage(object, getResourceLocator().getImage("full/obj16/Failure"));
        }
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public String getText(Object object) {
        Failure failure = (Failure) object;
        Constraint constraint = failure.getConstraint();
        String label = constraint.getMeasure() != null ? constraint.getMeasure() + " ":"";
        label += constraint.getAttribute() != null ? constraint.getAttribute().getLabel() + " " : "";
        label += constraint.getQualifier() != null ? constraint.getQualifier().getLabel() + " " : "";
        label += failure.getActualValue() + " ";
        if (failure.getIssue() == Issue.ABOVE_RANGE) {
            label += "> [";
        } else if (failure.getIssue() == Issue.BELOW_RANGE) {
            label += "< [";
        } else {
            label += "ERROR";
        }
        label += constraint.getMinValue() != null ? constraint.getMinValue() + ", " : "";
        label += constraint.getMaxValue() != null ? constraint.getMaxValue() + "]" : "";
        return label;
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

        switch (notification.getFeatureID(Failure.class)) {
            case AresPackage.FAILURE__ISSUE:
            case AresPackage.FAILURE__ACTUAL_VALUE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return AresEditPlugin.INSTANCE;
    }

}
