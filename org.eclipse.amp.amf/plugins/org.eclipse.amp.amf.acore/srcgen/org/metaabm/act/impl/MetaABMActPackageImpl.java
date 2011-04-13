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
package org.metaabm.act.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.metaabm.MetaABMPackage;
import org.metaabm.act.MetaABMActFactory;
import org.metaabm.act.MetaABMActPackage;
import org.metaabm.function.MetaABMFunctionPackage;
import org.metaabm.function.impl.MetaABMFunctionPackageImpl;
import org.metaabm.impl.MetaABMPackageImpl;

/*
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class MetaABMActPackageImpl extends EPackageImpl implements MetaABMActPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aInputEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aLiteralEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aMultiValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aActEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aControlEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aRootEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aGroupEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aScheduleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aRuleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aBuildEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aInitializeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aMethodEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aSinkEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aLogicEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aAnyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aAllEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aNoneEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aQueryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aEvaluateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aAccessorEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aWatchEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aSetEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aCreateAgentsEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aBuildProjectionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aBuildNetworkEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aBuildSpaceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aBuildGeographyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aBuildGridEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aSelectEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aMoveEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aTransformEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aLeaveEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aDieEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aConnectEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aNetworkEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aDisconnectEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aReplaceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aCommandEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aCauseEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aDiffuseEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aPerformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aDeriveEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aShapedEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aLoadShapedAgentsEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aCreateShapedAgentsEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aLoadAgentsEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aBuildSpaceTypesEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aBuildNetworkTypesEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aSelectTypesEEnum = null;

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
	 * @see org.metaabm.act.MetaABMActPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetaABMActPackageImpl() {
		super(eNS_URI, MetaABMActFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link MetaABMActPackage#eINSTANCE}
	 * when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @generated
	 */
	public static MetaABMActPackage init() {
		if (isInited)
			return (MetaABMActPackage) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI);

		// Obtain or create and register package
		MetaABMActPackageImpl theMetaABMActPackage = (MetaABMActPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MetaABMActPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MetaABMActPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MetaABMPackageImpl theMetaABMPackage = (MetaABMPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI) instanceof MetaABMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI) : MetaABMPackage.eINSTANCE);
		MetaABMFunctionPackageImpl theMetaABMFunctionPackage = (MetaABMFunctionPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(MetaABMFunctionPackage.eNS_URI) instanceof MetaABMFunctionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetaABMFunctionPackage.eNS_URI) : MetaABMFunctionPackage.eINSTANCE);

		// Load packages
		theMetaABMPackage.loadPackage();

		// Fix loaded packages
		theMetaABMActPackage.fixPackageContents();
		theMetaABMPackage.fixPackageContents();
		theMetaABMFunctionPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetaABMActPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetaABMActPackage.eNS_URI, theMetaABMActPackage);
		return theMetaABMActPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAInput() {
		if (aInputEClass == null) {
			aInputEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(0);
		}
		return aInputEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAInput_Sink() {
		return (EReference) getAInput().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAInput_Selected() {
		return (EReference) getAInput().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAInput_Literal() {
		return (EReference) getAInput().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAInput_Value() {
		return (EReference) getAInput().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALiteral() {
		if (aLiteralEClass == null) {
			aLiteralEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(1);
		}
		return aLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getALiteral_ValueLiteral() {
		return (EAttribute) getALiteral().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAMultiValue() {
		if (aMultiValueEClass == null) {
			aMultiValueEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(2);
		}
		return aMultiValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAMultiValue_Values() {
		return (EReference) getAMultiValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAAct() {
		if (aActEClass == null) {
			aActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(4);
		}
		return aActEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAAct_Sources() {
		return (EReference) getAAct().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAAct_Targets() {
		return (EReference) getAAct().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAAct_Reference() {
		return (EReference) getAAct().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAAct_Group() {
		return (EReference) getAAct().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAAct_Selected() {
		return (EReference) getAAct().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAAct_AllSources() {
		return (EReference) getAAct().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAAct_AllTargets() {
		return (EReference) getAAct().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAAct_RootSelected() {
		return (EReference) getAAct().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAControl() {
		if (aControlEClass == null) {
			aControlEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(5);
		}
		return aControlEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getARoot() {
		if (aRootEClass == null) {
			aRootEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(6);
		}
		return aRootEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAGroup() {
		if (aGroupEClass == null) {
			aGroupEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(7);
		}
		return aGroupEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAGroup_Roots() {
		return (EReference) getAGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAGroup_Members() {
		return (EReference) getAGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getASchedule() {
		if (aScheduleEClass == null) {
			aScheduleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(8);
		}
		return aScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getASchedule_Start() {
		return (EAttribute) getASchedule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getASchedule_Interval() {
		return (EAttribute) getASchedule().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getASchedule_Priority() {
		return (EAttribute) getASchedule().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getASchedule_Pick() {
		return (EAttribute) getASchedule().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getARule() {
		if (aRuleEClass == null) {
			aRuleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(9);
		}
		return aRuleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getABuild() {
		if (aBuildEClass == null) {
			aBuildEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(10);
		}
		return aBuildEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAInitialize() {
		if (aInitializeEClass == null) {
			aInitializeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(11);
		}
		return aInitializeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAMethod() {
		if (aMethodEClass == null) {
			aMethodEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(12);
		}
		return aMethodEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAMethod_Body() {
		return (EAttribute) getAMethod().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAMethod_Generate() {
		return (EAttribute) getAMethod().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getASink() {
		if (aSinkEClass == null) {
			aSinkEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(13);
		}
		return aSinkEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASink_Inputs() {
		return (EReference) getASink().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASink_Function() {
		return (EReference) getASink().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALogic() {
		if (aLogicEClass == null) {
			aLogicEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(14);
		}
		return aLogicEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAAny() {
		if (aAnyEClass == null) {
			aAnyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(15);
		}
		return aAnyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAAll() {
		if (aAllEClass == null) {
			aAllEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(16);
		}
		return aAllEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANone() {
		if (aNoneEClass == null) {
			aNoneEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(17);
		}
		return aNoneEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAQuery() {
		if (aQueryEClass == null) {
			aQueryEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(18);
		}
		return aQueryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAEvaluate() {
		if (aEvaluateEClass == null) {
			aEvaluateEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(19);
		}
		return aEvaluateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAAccessor() {
		if (aAccessorEClass == null) {
			aAccessorEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(20);
		}
		return aAccessorEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAAccessor_Attribute() {
		return (EReference) getAAccessor().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAWatch() {
		if (aWatchEClass == null) {
			aWatchEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(21);
		}
		return aWatchEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getASet() {
		if (aSetEClass == null) {
			aSetEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(22);
		}
		return aSetEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASet_Parameter() {
		return (EReference) getASet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getACreateAgents() {
		if (aCreateAgentsEClass == null) {
			aCreateAgentsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(23);
		}
		return aCreateAgentsEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACreateAgents_AgentCount() {
		return (EReference) getACreateAgents().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getABuildProjection() {
		if (aBuildProjectionEClass == null) {
			aBuildProjectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(27);
		}
		return aBuildProjectionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getABuildProjection_Agents() {
		return (EReference) getABuildProjection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getABuildProjection_Projection() {
		return (EReference) getABuildProjection().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getABuildProjection_Attributes() {
		return (EReference) getABuildProjection().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getABuildNetwork() {
		if (aBuildNetworkEClass == null) {
			aBuildNetworkEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(28);
		}
		return aBuildNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getABuildNetwork_NetworkType() {
		return (EAttribute) getABuildNetwork().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getABuildSpace() {
		if (aBuildSpaceEClass == null) {
			aBuildSpaceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(29);
		}
		return aBuildSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getABuildSpace_SpaceType() {
		return (EAttribute) getABuildSpace().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getABuildGeography() {
		if (aBuildGeographyEClass == null) {
			aBuildGeographyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(30);
		}
		return aBuildGeographyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getABuildGrid() {
		if (aBuildGridEClass == null) {
			aBuildGridEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(31);
		}
		return aBuildGridEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getABuildGrid_FillAgent() {
		return (EReference) getABuildGrid().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getASelect() {
		if (aSelectEClass == null) {
			aSelectEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(34);
		}
		return aSelectEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASelect_Agent() {
		return (EReference) getASelect().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getASelect_Space() {
		return (EReference) getASelect().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getASelect_For() {
		return (EAttribute) getASelect().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAMove() {
		if (aMoveEClass == null) {
			aMoveEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(35);
		}
		return aMoveEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getATransform() {
		if (aTransformEClass == null) {
			aTransformEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(37);
		}
		return aTransformEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getATransform_Destination() {
		return (EReference) getATransform().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALeave() {
		if (aLeaveEClass == null) {
			aLeaveEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(38);
		}
		return aLeaveEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getADie() {
		if (aDieEClass == null) {
			aDieEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(39);
		}
		return aDieEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAConnect() {
		if (aConnectEClass == null) {
			aConnectEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(40);
		}
		return aConnectEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAConnect_Directed() {
		return (EAttribute) getAConnect().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getANetwork() {
		if (aNetworkEClass == null) {
			aNetworkEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(41);
		}
		return aNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getANetwork_Within() {
		return (EReference) getANetwork().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getADisconnect() {
		if (aDisconnectEClass == null) {
			aDisconnectEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(42);
		}
		return aDisconnectEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAReplace() {
		if (aReplaceEClass == null) {
			aReplaceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(43);
		}
		return aReplaceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getACommand() {
		if (aCommandEClass == null) {
			aCommandEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(44);
		}
		return aCommandEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getACause() {
		if (aCauseEClass == null) {
			aCauseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(45);
		}
		return aCauseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getACause_Result() {
		return (EReference) getACause().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getADiffuse() {
		if (aDiffuseEClass == null) {
			aDiffuseEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(46);
		}
		return aDiffuseEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADiffuse_Diffused() {
		return (EReference) getADiffuse().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADiffuse_DiffusionRate() {
		return (EReference) getADiffuse().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getADiffuse_EvaporationRate() {
		return (EReference) getADiffuse().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAPerform() {
		if (aPerformEClass == null) {
			aPerformEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(47);
		}
		return aPerformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getADerive() {
		if (aDeriveEClass == null) {
			aDeriveEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(48);
		}
		return aDeriveEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAShaped() {
		if (aShapedEClass == null) {
			aShapedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(3);
		}
		return aShapedEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAShaped_Shape() {
		return (EAttribute) getAShaped().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALoadShapedAgents() {
		if (aLoadShapedAgentsEClass == null) {
			aLoadShapedAgentsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(26);
		}
		return aLoadShapedAgentsEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getACreateShapedAgents() {
		if (aCreateShapedAgentsEClass == null) {
			aCreateShapedAgentsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(24);
		}
		return aCreateShapedAgentsEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getALoadAgents() {
		if (aLoadAgentsEClass == null) {
			aLoadAgentsEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(25);
		}
		return aLoadAgentsEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getALoadAgents_SourceURL() {
		return (EAttribute) getALoadAgents().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getABuildSpaceTypes() {
		if (aBuildSpaceTypesEEnum == null) {
			aBuildSpaceTypesEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(32);
		}
		return aBuildSpaceTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getABuildNetworkTypes() {
		if (aBuildNetworkTypesEEnum == null) {
			aBuildNetworkTypesEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(33);
		}
		return aBuildNetworkTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getASelectTypes() {
		if (aSelectTypesEEnum == null) {
			aSelectTypesEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI).getEClassifiers().get(36);
		}
		return aSelectTypesEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MetaABMActFactory getMetaABMActFactory() {
		return (MetaABMActFactory) getEFactoryInstance();
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
			eClassifier.setInstanceClassName("org.metaabm.act." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} // MetaABMActPackageImpl
