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
package org.metaabm.impl;

import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.metaabm.MetaABMFactory;
import org.metaabm.MetaABMPackage;
import org.metaabm.act.MetaABMActPackage;
import org.metaabm.act.impl.MetaABMActPackageImpl;
import org.metaabm.function.MetaABMFunctionPackage;
import org.metaabm.function.impl.MetaABMFunctionPackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!-- end-user-doc -->
 * @generated
 */
public class MetaABMPackageImpl extends EPackageImpl implements MetaABMPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "metaabm.ecore";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iidEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iTypedEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iTypedArrayEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iArtifactEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iActEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sNamedEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sAttributedEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sAttributeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sAttributeArrayEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sAgentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sContextEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sProjectionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass snDimensionalEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sContinuousSpaceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGridEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sNetworkEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sGeographyEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sValueLayerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sStyleEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sStyle3DEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sStyle2DEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sStyleShapeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sImplementedEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sImplementationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iAgentChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iAttributeChildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iModelExtensionEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sStateEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sStateValueEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sActableEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sAttributeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sBorderRuleEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sNeighborhoodTypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sImplementationModeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sShapeTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with {@link org.eclipse.emf.ecore.EPackage.Registry
	 * EPackage.Registry} by the package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory method {@link #init init()}, which also
	 * performs initialization of the package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.metaabm.MetaABMPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MetaABMPackageImpl() {
		super(eNS_URI, MetaABMFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MetaABMPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static MetaABMPackage init() {
		if (isInited)
			return (MetaABMPackage) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI);

		// Obtain or create and register package
		MetaABMPackageImpl theMetaABMPackage = (MetaABMPackageImpl) (EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MetaABMPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MetaABMPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MetaABMFunctionPackageImpl theMetaABMFunctionPackage = (MetaABMFunctionPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(MetaABMFunctionPackage.eNS_URI) instanceof MetaABMFunctionPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetaABMFunctionPackage.eNS_URI) : MetaABMFunctionPackage.eINSTANCE);
		MetaABMActPackageImpl theMetaABMActPackage = (MetaABMActPackageImpl) (EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI) instanceof MetaABMActPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MetaABMActPackage.eNS_URI) : MetaABMActPackage.eINSTANCE);

		// Load packages
		theMetaABMPackage.loadPackage();

		// Fix loaded packages
		theMetaABMPackage.fixPackageContents();
		theMetaABMFunctionPackage.fixPackageContents();
		theMetaABMActPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theMetaABMPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MetaABMPackage.eNS_URI, theMetaABMPackage);
		return theMetaABMPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIID() {
		if (iidEClass == null) {
			iidEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(0);
		}
		return iidEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIID_Label() {
		return (EAttribute) getIID().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIID_ID() {
		return (EAttribute) getIID().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getITyped() {
		if (iTypedEClass == null) {
			iTypedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(1);
		}
		return iTypedEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getITyped_SType() {
		return (EAttribute) getITyped().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getITypedArray() {
		if (iTypedArrayEClass == null) {
			iTypedArrayEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(2);
		}
		return iTypedArrayEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getITypedArray_Size() {
		return (EAttribute) getITypedArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIValue() {
		if (iValueEClass == null) {
			iValueEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(3);
		}
		return iValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIValue_Accessors() {
		return (EReference) getIValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIValue_AvailableTypes() {
		return (EAttribute) getIValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIArtifact() {
		if (iArtifactEClass == null) {
			iArtifactEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(4);
		}
		return iArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIAct() {
		if (iActEClass == null) {
			iActEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(5);
		}
		return iActEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSNamed() {
		if (sNamedEClass == null) {
			sNamedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(6);
		}
		return sNamedEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSNamed_PluralLabel() {
		return (EAttribute) getSNamed().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSNamed_Description() {
		return (EAttribute) getSNamed().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSAttributed() {
		if (sAttributedEClass == null) {
			sAttributedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(7);
		}
		return sAttributedEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSAttributed_Attributes() {
		return (EReference) getSAttributed().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSAttribute() {
		if (sAttributeEClass == null) {
			sAttributeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(9);
		}
		return sAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSAttribute_Owner() {
		return (EReference) getSAttribute().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSAttribute_GatherData() {
		return (EAttribute) getSAttribute().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSAttribute_DefaultValue() {
		return (EAttribute) getSAttribute().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSAttribute_Units() {
		return (EAttribute) getSAttribute().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSAttribute_Immutable() {
		return (EAttribute) getSAttribute().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSAttribute_Derived() {
		return (EAttribute) getSAttribute().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSAttribute_Children() {
		return (EReference) getSAttribute().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSAttributeArray() {
		if (sAttributeArrayEClass == null) {
			sAttributeArrayEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(10);
		}
		return sAttributeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSAgent() {
		if (sAgentEClass == null) {
			sAgentEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(14);
		}
		return sAgentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSAgent_Styles() {
		return (EReference) getSAgent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSAgent_Owner() {
		return (EReference) getSAgent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSAgent_Children() {
		return (EReference) getSAgent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSContext() {
		if (sContextEClass == null) {
			sContextEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(15);
		}
		return sContextEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSContext_Agents() {
		return (EReference) getSContext().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSContext_Projections() {
		return (EReference) getSContext().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSContext_ValueLayers() {
		return (EReference) getSContext().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSContext_Library() {
		return (EReference) getSContext().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSContext_AllAgents() {
		return (EReference) getSContext().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSContext_AllContexts() {
		return (EReference) getSContext().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSProjection() {
		if (sProjectionEClass == null) {
			sProjectionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(16);
		}
		return sProjectionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSProjection_Owner() {
		return (EReference) getSProjection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSNDimensional() {
		if (snDimensionalEClass == null) {
			snDimensionalEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(17);
		}
		return snDimensionalEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSNDimensional_Dimensionality() {
		return (EAttribute) getSNDimensional().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSNDimensional_BorderRule() {
		return (EAttribute) getSNDimensional().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSContinuousSpace() {
		if (sContinuousSpaceEClass == null) {
			sContinuousSpaceEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(19);
		}
		return sContinuousSpaceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGrid() {
		if (sGridEClass == null) {
			sGridEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(20);
		}
		return sGridEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrid_MultiOccupant() {
		return (EAttribute) getSGrid().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSGrid_Neighborhood() {
		return (EAttribute) getSGrid().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSNetwork() {
		if (sNetworkEClass == null) {
			sNetworkEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(22);
		}
		return sNetworkEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSNetwork_Directed() {
		return (EAttribute) getSNetwork().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSGeography() {
		if (sGeographyEClass == null) {
			sGeographyEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(23);
		}
		return sGeographyEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSValueLayer() {
		if (sValueLayerEClass == null) {
			sValueLayerEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(24);
		}
		return sValueLayerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSStyle() {
		if (sStyleEClass == null) {
			sStyleEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(25);
		}
		return sStyleEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSStyle_Agent() {
		return (EReference) getSStyle().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSStyle3D() {
		if (sStyle3DEClass == null) {
			sStyle3DEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(28);
		}
		return sStyle3DEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSStyle2D() {
		if (sStyle2DEClass == null) {
			sStyle2DEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(26);
		}
		return sStyle2DEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSStyleShape() {
		if (sStyleShapeEClass == null) {
			sStyleShapeEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(27);
		}
		return sStyleShapeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSStyleShape_Shape() {
		return (EAttribute) getSStyleShape().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSImplemented() {
		if (sImplementedEClass == null) {
			sImplementedEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(29);
		}
		return sImplementedEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSImplemented_Implementation() {
		return (EReference) getSImplemented().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSImplemented_Parent() {
		return (EReference) getSImplemented().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSImplementation() {
		if (sImplementationEClass == null) {
			sImplementationEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(31);
		}
		return sImplementationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSImplementation_Package() {
		return (EAttribute) getSImplementation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSImplementation_ClassName() {
		return (EAttribute) getSImplementation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSImplementation_BasePath() {
		return (EAttribute) getSImplementation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSImplementation_Mode() {
		return (EAttribute) getSImplementation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSImplementation_Target() {
		return (EReference) getSImplementation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSImplementation_QualifiedName() {
		return (EAttribute) getSImplementation().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSImplementation_DerivedPath() {
		return (EAttribute) getSImplementation().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSImplementation_DerivedPackage() {
		return (EAttribute) getSImplementation().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSImplementation_JavaFileLoc() {
		return (EAttribute) getSImplementation().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSImplementation_SrcDir() {
		return (EAttribute) getSImplementation().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSImplementation_BinDir() {
		return (EAttribute) getSImplementation().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSImplementation_ClassFileLoc() {
		return (EAttribute) getSImplementation().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSImplementation_DerivedBinDir() {
		return (EAttribute) getSImplementation().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSImplementation_DerivedSrcDir() {
		return (EAttribute) getSImplementation().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIAgentChild() {
		if (iAgentChildEClass == null) {
			iAgentChildEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(33);
		}
		return iAgentChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIAgentChild_Parent() {
		return (EReference) getIAgentChild().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIAttributeChild() {
		if (iAttributeChildEClass == null) {
			iAttributeChildEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(34);
		}
		return iAttributeChildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIAttributeChild_Parent() {
		return (EReference) getIAttributeChild().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIModelExtension() {
		if (iModelExtensionEClass == null) {
			iModelExtensionEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(35);
		}
		return iModelExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSState() {
		if (sStateEClass == null) {
			sStateEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(12);
		}
		return sStateEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSState_Options() {
		return (EReference) getSState().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSState_DefaultOption() {
		return (EReference) getSState().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSStateValue() {
		if (sStateValueEClass == null) {
			sStateValueEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(13);
		}
		return sStateValueEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSStateValue_Set() {
		return (EReference) getSStateValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSActable() {
		if (sActableEClass == null) {
			sActableEClass = (EClass) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(8);
		}
		return sActableEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSActable_RootActivity() {
		return (EReference) getSActable().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSAttributeType() {
		if (sAttributeTypeEEnum == null) {
			sAttributeTypeEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(11);
		}
		return sAttributeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSBorderRule() {
		if (sBorderRuleEEnum == null) {
			sBorderRuleEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(18);
		}
		return sBorderRuleEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSNeighborhoodType() {
		if (sNeighborhoodTypeEEnum == null) {
			sNeighborhoodTypeEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(21);
		}
		return sNeighborhoodTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSImplementationMode() {
		if (sImplementationModeEEnum == null) {
			sImplementationModeEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(30);
		}
		return sImplementationModeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSShapeType() {
		if (sShapeTypeEEnum == null) {
			sShapeTypeEEnum = (EEnum) EPackage.Registry.INSTANCE.getEPackage(MetaABMPackage.eNS_URI).getEClassifiers().get(32);
		}
		return sShapeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MetaABMFactory getMetaABMFactory() {
		return (MetaABMFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded)
			return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		} catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage) resource.getContents().get(0));
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.metaabm." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} // MetaABMPackageImpl
