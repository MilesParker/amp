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
package org.metaabm.function.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.metaabm.MetaABMPackage;
import org.metaabm.act.MetaABMActPackage;
import org.metaabm.act.impl.MetaABMActPackageImpl;
import org.metaabm.function.MetaABMFunctionFactory;
import org.metaabm.function.MetaABMFunctionPackage;
import org.metaabm.impl.MetaABMPackageImpl;

/*
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class MetaABMFunctionPackageImpl extends EPackageImpl implements MetaABMFunctionPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fArgumentPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fArgumentArrayPrototypeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fFunctionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fLogicalEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fLogicalOperatorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fGenericEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fGenericFunctionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fGenericLogicalEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fLibraryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fImplementedLibraryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fMultiArgumentPrototypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.metaabm.function.MetaABMFunctionPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetaABMFunctionPackageImpl() {
		super(eNS_URI, MetaABMFunctionFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MetaABMFunctionPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static MetaABMFunctionPackage init() {
		if (isInited)
			return (MetaABMFunctionPackage) EPackage.Registry.INSTANCE.getEPackage(MetaABMFunctionPackage.eNS_URI);

		// Obtain or create and register package
		MetaABMFunctionPackageImpl theMetaABMFunctionPackage = (MetaABMFunctionPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MetaABMFunctionPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MetaABMFunctionPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MetaABMPackageImpl theMetaABMPackage = (MetaABMPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI) instanceof MetaABMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI) : MetaABMPackage.eINSTANCE);
		MetaABMActPackageImpl theMetaABMActPackage = (MetaABMActPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI) instanceof MetaABMActPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI) : MetaABMActPackage.eINSTANCE);

		// Load packages
		theMetaABMPackage.loadPackage();

		// Fix loaded packages
		theMetaABMFunctionPackage.fixPackageContents();
		theMetaABMPackage.fixPackageContents();
		theMetaABMActPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetaABMFunctionPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetaABMFunctionPackage.eNS_URI, theMetaABMFunctionPackage);
		return theMetaABMFunctionPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFArgumentPrototype() {
		if (fArgumentPrototypeEClass == null) {
			fArgumentPrototypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMFunctionPackage.eNS_URI).getEClassifiers().get(0);
		}
		return fArgumentPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFArgumentPrototype_InputFunction() {
		return (EReference) getFArgumentPrototype().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFArgumentPrototype_OutputFunction() {
		return (EReference) getFArgumentPrototype().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFArgumentPrototype_Optional() {
		return (EAttribute) getFArgumentPrototype().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFArgumentArrayPrototype() {
		if (fArgumentArrayPrototypeEClass == null) {
			fArgumentArrayPrototypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMFunctionPackage.eNS_URI).getEClassifiers().get(1);
		}
		return fArgumentArrayPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFFunction() {
		if (fFunctionEClass == null) {
			fFunctionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMFunctionPackage.eNS_URI).getEClassifiers().get(2);
		}
		return fFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFFunction_AvailableTypes() {
		return (EAttribute) getFFunction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFFunction_InputPrototypes() {
		return (EReference) getFFunction().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFFunction_MultiValue() {
		return (EAttribute) getFFunction().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFLogical() {
		if (fLogicalEClass == null) {
			fLogicalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMFunctionPackage.eNS_URI).getEClassifiers().get(3);
		}
		return fLogicalEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFOperator() {
		if (fOperatorEClass == null) {
			fOperatorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMFunctionPackage.eNS_URI).getEClassifiers().get(4);
		}
		return fOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFOperator_Symbol() {
		return (EAttribute) getFOperator().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFOperator_Arity() {
		return (EAttribute) getFOperator().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFLogicalOperator() {
		if (fLogicalOperatorEClass == null) {
			fLogicalOperatorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMFunctionPackage.eNS_URI).getEClassifiers().get(5);
		}
		return fLogicalOperatorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFGeneric() {
		if (fGenericEClass == null) {
			fGenericEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMFunctionPackage.eNS_URI).getEClassifiers().get(6);
		}
		return fGenericEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFGenericFunction() {
		if (fGenericFunctionEClass == null) {
			fGenericFunctionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMFunctionPackage.eNS_URI).getEClassifiers().get(7);
		}
		return fGenericFunctionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFGenericFunction_OutputPrototypes() {
		return (EReference) getFGenericFunction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFGenericLogical() {
		if (fGenericLogicalEClass == null) {
			fGenericLogicalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMFunctionPackage.eNS_URI).getEClassifiers().get(8);
		}
		return fGenericLogicalEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFLibrary() {
		if (fLibraryEClass == null) {
			fLibraryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMFunctionPackage.eNS_URI).getEClassifiers().get(9);
		}
		return fLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFLibrary_Functions() {
		return (EReference) getFLibrary().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFLibrary_Subs() {
		return (EReference) getFLibrary().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFImplementedLibrary() {
		if (fImplementedLibraryEClass == null) {
			fImplementedLibraryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMFunctionPackage.eNS_URI).getEClassifiers().get(10);
		}
		return fImplementedLibraryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFMultiArgumentPrototype() {
		if (fMultiArgumentPrototypeEClass == null) {
			fMultiArgumentPrototypeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMFunctionPackage.eNS_URI).getEClassifiers().get(11);
		}
		return fMultiArgumentPrototypeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MetaABMFunctionFactory getMetaABMFunctionFactory() {
		return (MetaABMFunctionFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed)
			return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.metaabm.function." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} // MetaABMFunctionPackageImpl
