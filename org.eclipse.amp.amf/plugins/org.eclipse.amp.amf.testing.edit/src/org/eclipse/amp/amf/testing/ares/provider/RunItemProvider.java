/**
 * <copyright>
 * </copyright>
 *
 * $Id: RunItemProvider.java,v 1.7 2010/08/04 01:54:39 mparker Exp $
 */
package org.eclipse.amp.amf.testing.ares.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.amp.amf.testing.ares.AresPackage;
import org.eclipse.amp.amf.testing.ares.ConstraintTest;
import org.eclipse.amp.amf.testing.ares.Issue;
import org.eclipse.amp.amf.testing.ares.ResultType;
import org.eclipse.amp.amf.testing.ares.Run;
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
 * This is the item provider adapter for a {@link org.eclipse.amp.amf.testing.ares.Run} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RunItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
    /**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    public RunItemProvider(AdapterFactory adapterFactory) {
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

			addModelPropertyDescriptor(object);
			addTestPropertyDescriptor(object);
			addParameterizationPropertyDescriptor(object);
			addResultPropertyDescriptor(object);
			addParametersPropertyDescriptor(object);
			addConstraintsPropertyDescriptor(object);
			addStartedPropertyDescriptor(object);
			addFinishedPropertyDescriptor(object);
			addResultsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

    /**
	 * This adds a property descriptor for the Model feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected void addModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Run_model_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Run_model_feature", "_UI_Run_type"),
				 AresPackage.Literals.RUN__MODEL,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Test feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected void addTestPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Run_test_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Run_test_feature", "_UI_Run_type"),
				 AresPackage.Literals.RUN__TEST,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Parameterization feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected void addParameterizationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Run_parameterization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Run_parameterization_feature", "_UI_Run_type"),
				 AresPackage.Literals.RUN__PARAMETERIZATION,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Result feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected void addResultPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Run_result_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Run_result_feature", "_UI_Run_type"),
				 AresPackage.Literals.RUN__RESULT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Parameters feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected void addParametersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Run_parameters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Run_parameters_feature", "_UI_Run_type"),
				 AresPackage.Literals.RUN__PARAMETERS,
				 false,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Constraints feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected void addConstraintsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Run_constraints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Run_constraints_feature", "_UI_Run_type"),
				 AresPackage.Literals.RUN__CONSTRAINTS,
				 false,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Started feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected void addStartedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Run_started_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Run_started_feature", "_UI_Run_type"),
				 AresPackage.Literals.RUN__STARTED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Finished feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected void addFinishedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Run_finished_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Run_finished_feature", "_UI_Run_type"),
				 AresPackage.Literals.RUN__FINISHED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

    /**
	 * This adds a property descriptor for the Results feature.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
    protected void addResultsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Run_results_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Run_results_feature", "_UI_Run_type"),
				 AresPackage.Literals.RUN__RESULTS,
				 false,
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
	 * <!-- begin-user-doc --> <!--
     * end-user-doc -->
	 * @generated
	 */
    @Override
    public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(AresPackage.Literals.RUN__TEST);
			childrenFeatures.add(AresPackage.Literals.RUN__PARAMETERIZATION);
			childrenFeatures.add(AresPackage.Literals.RUN__RESULTS);
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
     * This returns Run.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public Object getImage(Object object) {
        Run run = (Run) object;
        if (run.getResult() == ResultType.SUCCESS) {
            return overlayImage(object, getResourceLocator().getImage("full/obj16/Success"));
        } else if (run.getResult() == ResultType.FAILURE) {
            return overlayImage(object, getResourceLocator().getImage("full/obj16/Failure"));
        } else if (run.getResult() == ResultType.ERROR) {
            return overlayImage(object, getResourceLocator().getImage("full/obj16/Error"));
        } else {
            return overlayImage(object, getResourceLocator().getImage("full/obj16/Incomplete"));
        }
    }

    /**
     * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @Override
    public String getText(Object object) {
        Run run = (Run) object;
        int pass = 0;
        for (ConstraintTest test : run.getResults()) {
            if (test.getIssue() == Issue.NONE) {
                pass++;
            }
        }
        String label = run.getTest().getName() + " / " + pass + " of "
        + run.getResults().size();
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

		switch (notification.getFeatureID(Run.class)) {
			case AresPackage.RUN__RESULT:
			case AresPackage.RUN__STARTED:
			case AresPackage.RUN__FINISHED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AresPackage.RUN__RESULTS:
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
