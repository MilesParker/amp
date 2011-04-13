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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.metaabm.*;
import org.metaabm.MetaABMFactory;
import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;
import org.metaabm.SAttribute;
import org.metaabm.SAttributeArray;
import org.metaabm.SAttributeType;
import org.metaabm.SBorderRule;
import org.metaabm.SContext;
import org.metaabm.SContinuousSpace;
import org.metaabm.SGeography;
import org.metaabm.SGrid;
import org.metaabm.SImplementation;
import org.metaabm.SImplementationMode;
import org.metaabm.SNeighborhoodType;
import org.metaabm.SNetwork;
import org.metaabm.SShapeType;
import org.metaabm.SState;
import org.metaabm.SStateValue;
import org.metaabm.SStyle2D;
import org.metaabm.SStyle3D;
import org.metaabm.SStyleShape;
import org.metaabm.SValueLayer;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!-- end-user-doc -->
 * @generated
 */
public class MetaABMFactoryImpl extends EFactoryImpl implements MetaABMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static MetaABMFactory init() {
		try {
			MetaABMFactory theMetaABMFactory = (MetaABMFactory) EPackage.Registry.INSTANCE.getEFactory("http://metaabm.org/structure");
			if (theMetaABMFactory != null) {
				return theMetaABMFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetaABMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MetaABMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MetaABMPackage.SATTRIBUTE:
				return createSAttribute();
			case MetaABMPackage.SATTRIBUTE_ARRAY:
				return createSAttributeArray();
			case MetaABMPackage.SSTATE:
				return createSState();
			case MetaABMPackage.SSTATE_VALUE:
				return createSStateValue();
			case MetaABMPackage.SAGENT:
				return createSAgent();
			case MetaABMPackage.SCONTEXT:
				return createSContext();
			case MetaABMPackage.SCONTINUOUS_SPACE:
				return createSContinuousSpace();
			case MetaABMPackage.SGRID:
				return createSGrid();
			case MetaABMPackage.SNETWORK:
				return createSNetwork();
			case MetaABMPackage.SGEOGRAPHY:
				return createSGeography();
			case MetaABMPackage.SVALUE_LAYER:
				return createSValueLayer();
			case MetaABMPackage.SSTYLE2_D:
				return createSStyle2D();
			case MetaABMPackage.SSTYLE_SHAPE:
				return createSStyleShape();
			case MetaABMPackage.SSTYLE3_D:
				return createSStyle3D();
			case MetaABMPackage.SIMPLEMENTATION:
				return createSImplementation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MetaABMPackage.SATTRIBUTE_TYPE:
				return createSAttributeTypeFromString(eDataType, initialValue);
			case MetaABMPackage.SBORDER_RULE:
				return createSBorderRuleFromString(eDataType, initialValue);
			case MetaABMPackage.SNEIGHBORHOOD_TYPE:
				return createSNeighborhoodTypeFromString(eDataType, initialValue);
			case MetaABMPackage.SIMPLEMENTATION_MODE:
				return createSImplementationModeFromString(eDataType, initialValue);
			case MetaABMPackage.SSHAPE_TYPE:
				return createSShapeTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MetaABMPackage.SATTRIBUTE_TYPE:
				return convertSAttributeTypeToString(eDataType, instanceValue);
			case MetaABMPackage.SBORDER_RULE:
				return convertSBorderRuleToString(eDataType, instanceValue);
			case MetaABMPackage.SNEIGHBORHOOD_TYPE:
				return convertSNeighborhoodTypeToString(eDataType, instanceValue);
			case MetaABMPackage.SIMPLEMENTATION_MODE:
				return convertSImplementationModeToString(eDataType, instanceValue);
			case MetaABMPackage.SSHAPE_TYPE:
				return convertSShapeTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SAttribute createSAttribute() {
		SAttributeImpl sAttribute = new SAttributeImpl();
		return sAttribute;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SAttributeArray createSAttributeArray() {
		SAttributeArrayImpl sAttributeArray = new SAttributeArrayImpl();
		return sAttributeArray;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SAgent createSAgent() {
		SAgentImpl sAgent = new SAgentImpl();
		return sAgent;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SContext createSContext() {
		SContextImpl sContext = new SContextImpl();
		return sContext;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SContinuousSpace createSContinuousSpace() {
		SContinuousSpaceImpl sContinuousSpace = new SContinuousSpaceImpl();
		return sContinuousSpace;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SGrid createSGrid() {
		SGridImpl sGrid = new SGridImpl();
		return sGrid;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SNetwork createSNetwork() {
		SNetworkImpl sNetwork = new SNetworkImpl();
		return sNetwork;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SGeography createSGeography() {
		SGeographyImpl sGeography = new SGeographyImpl();
		return sGeography;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SValueLayer createSValueLayer() {
		SValueLayerImpl sValueLayer = new SValueLayerImpl();
		return sValueLayer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SStyle3D createSStyle3D() {
		SStyle3DImpl sStyle3D = new SStyle3DImpl();
		return sStyle3D;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SStyle2D createSStyle2D() {
		SStyle2DImpl sStyle2D = new SStyle2DImpl();
		return sStyle2D;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SStyleShape createSStyleShape() {
		SStyleShapeImpl sStyleShape = new SStyleShapeImpl();
		return sStyleShape;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SImplementation createSImplementation() {
		SImplementationImpl sImplementation = new SImplementationImpl();
		return sImplementation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public SState createSState() {
		SStateImpl sState = new SStateImpl();
		sState.setSType(SAttributeType.SYMBOL_LITERAL);
		return sState;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SStateValue createSStateValue() {
		SStateValueImpl sStateValue = new SStateValueImpl();
		return sStateValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SAttributeType createSAttributeTypeFromString(EDataType eDataType, String initialValue) {
		SAttributeType result = SAttributeType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSAttributeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SBorderRule createSBorderRuleFromString(EDataType eDataType, String initialValue) {
		SBorderRule result = SBorderRule.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSBorderRuleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SNeighborhoodType createSNeighborhoodTypeFromString(EDataType eDataType, String initialValue) {
		SNeighborhoodType result = SNeighborhoodType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSNeighborhoodTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SImplementationMode createSImplementationModeFromString(EDataType eDataType, String initialValue) {
		SImplementationMode result = SImplementationMode.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSImplementationModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public SShapeType createSShapeTypeFromString(EDataType eDataType, String initialValue) {
		SShapeType result = SShapeType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSShapeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MetaABMPackage getMetaABMPackage() {
		return (MetaABMPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetaABMPackage getPackage() {
		return MetaABMPackage.eINSTANCE;
	}

} // MetaABMFactoryImpl
