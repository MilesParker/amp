/**
 * <copyright>
 * </copyright>
 *
 * $Id: ConstraintTestItemProvider.java,v 1.3 2010/08/04 01:54:39 mparker Exp $
 */
package org.eclipse.amp.amf.testing.ares.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.amp.amf.testing.aTest.Constraint;
import org.eclipse.amp.amf.testing.ares.AresPackage;
import org.eclipse.amp.amf.testing.ares.ConstraintTest;
import org.eclipse.amp.amf.testing.ares.Issue;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
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
 * This is the item provider adapter for a {@link org.eclipse.amp.amf.testing.ares.ConstraintTest} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ConstraintTestItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public ConstraintTestItemProvider(AdapterFactory adapterFactory) {
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

			addConstraintPropertyDescriptor(object);
			addIssuePropertyDescriptor(object);
			addActualValuePropertyDescriptor(object);
			addFailurePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

    /**
	 * This adds a property descriptor for the Constraint feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected void addConstraintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConstraintTest_constraint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConstraintTest_constraint_feature", "_UI_ConstraintTest_type"),
				 AresPackage.Literals.CONSTRAINT_TEST__CONSTRAINT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Issue feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected void addIssuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConstraintTest_issue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConstraintTest_issue_feature", "_UI_ConstraintTest_type"),
				 AresPackage.Literals.CONSTRAINT_TEST__ISSUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Actual Value feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected void addActualValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConstraintTest_actualValue_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConstraintTest_actualValue_feature", "_UI_ConstraintTest_type"),
				 AresPackage.Literals.CONSTRAINT_TEST__ACTUAL_VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.REAL_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Failure feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected void addFailurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConstraintTest_failure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConstraintTest_failure_feature", "_UI_ConstraintTest_type"),
				 AresPackage.Literals.CONSTRAINT_TEST__FAILURE,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
     * This returns Failure.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public Object getImage(Object object) {
        ConstraintTest item = (ConstraintTest) object;
        if (item.getIssue() == Issue.ABOVE_RANGE) {
            return overlayImage(object, getResourceLocator().getImage("full/obj16/MaxExclusive"));
        } else if (item.getIssue() == Issue.BELOW_RANGE) {
            return overlayImage(object, getResourceLocator().getImage("full/obj16/MinExclusive"));
        } else {
            return overlayImage(object, getResourceLocator().getImage("full/obj16/Success"));
        }
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public String getText(Object object) {
        ConstraintTest item = (ConstraintTest) object;
        Constraint constraint = item.getConstraint();
        String label = constraint.getMeasure() != null ? constraint.getMeasure() + " " : "";
        label += constraint.getAttribute() != null ? constraint.getAttribute().getLabel() + " " : "";
        label += constraint.getQualifier() != null ? constraint.getQualifier().getLabel() + " " : "";
        label += item.getActualValue() + " ";
        if (item.getIssue() == Issue.NONE) {
            label += "IN [";
        } else if (item.getIssue() == Issue.ABOVE_RANGE) {
            label += "> [";
        } else if (item.getIssue() == Issue.BELOW_RANGE) {
            label += "< [";
        } else {
            label += "ERROR";
        }
        label += constraint.getMinValue() != null ? constraint.getMinValue() + ", " : "";
        label += constraint.getMaxValue() != null ? constraint.getMaxValue() + "]" : "";
        return label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating
     * a viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc
     * -->
     * 
     * @generated
     */
    @Override
    public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ConstraintTest.class)) {
			case AresPackage.CONSTRAINT_TEST__ISSUE:
			case AresPackage.CONSTRAINT_TEST__ACTUAL_VALUE:
			case AresPackage.CONSTRAINT_TEST__FAILURE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

    /**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public ResourceLocator getResourceLocator() {
		return AresEditPlugin.INSTANCE;
	}

}
