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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.metaabm.act.*;
import org.metaabm.act.AAll;
import org.metaabm.act.AAny;
import org.metaabm.act.ABuild;
import org.metaabm.act.ABuildGeography;
import org.metaabm.act.ABuildGrid;
import org.metaabm.act.ABuildNetwork;
import org.metaabm.act.ABuildNetworkTypes;
import org.metaabm.act.ABuildSpace;
import org.metaabm.act.ABuildSpaceTypes;
import org.metaabm.act.AConnect;
import org.metaabm.act.ACreateAgents;
import org.metaabm.act.ACreateShapedAgents;
import org.metaabm.act.ADie;
import org.metaabm.act.ADisconnect;
import org.metaabm.act.AEvaluate;
import org.metaabm.act.AGroup;
import org.metaabm.act.AInitialize;
import org.metaabm.act.AInput;
import org.metaabm.act.ALeave;
import org.metaabm.act.ALiteral;
import org.metaabm.act.ALoadAgents;
import org.metaabm.act.ALoadShapedAgents;
import org.metaabm.act.AMethod;
import org.metaabm.act.AMove;
import org.metaabm.act.AMultiValue;
import org.metaabm.act.ANone;
import org.metaabm.act.AQuery;
import org.metaabm.act.AReplace;
import org.metaabm.act.ARule;
import org.metaabm.act.ASchedule;
import org.metaabm.act.ASelect;
import org.metaabm.act.ASelectTypes;
import org.metaabm.act.ASet;
import org.metaabm.act.AWatch;
import org.metaabm.act.MetaABMActFactory;
import org.metaabm.act.MetaABMActPackage;

/*
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * @generated
 */
public class MetaABMActFactoryImpl extends EFactoryImpl implements MetaABMActFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static MetaABMActFactory init() {
		try {
			MetaABMActFactory theMetaABMActFactory = (MetaABMActFactory) EPackage.Registry.INSTANCE.getEFactory("http://metaabm.org/act");
			if (theMetaABMActFactory != null) {
				return theMetaABMActFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetaABMActFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public MetaABMActFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MetaABMActPackage.AINPUT:
				return createAInput();
			case MetaABMActPackage.ALITERAL:
				return createALiteral();
			case MetaABMActPackage.AMULTI_VALUE:
				return createAMultiValue();
			case MetaABMActPackage.AGROUP:
				return createAGroup();
			case MetaABMActPackage.ASCHEDULE:
				return createASchedule();
			case MetaABMActPackage.ARULE:
				return createARule();
			case MetaABMActPackage.ABUILD:
				return createABuild();
			case MetaABMActPackage.AINITIALIZE:
				return createAInitialize();
			case MetaABMActPackage.AMETHOD:
				return createAMethod();
			case MetaABMActPackage.AANY:
				return createAAny();
			case MetaABMActPackage.AALL:
				return createAAll();
			case MetaABMActPackage.ANONE:
				return createANone();
			case MetaABMActPackage.AQUERY:
				return createAQuery();
			case MetaABMActPackage.AEVALUATE:
				return createAEvaluate();
			case MetaABMActPackage.AWATCH:
				return createAWatch();
			case MetaABMActPackage.ASET:
				return createASet();
			case MetaABMActPackage.ACREATE_AGENTS:
				return createACreateAgents();
			case MetaABMActPackage.ACREATE_SHAPED_AGENTS:
				return createACreateShapedAgents();
			case MetaABMActPackage.ALOAD_AGENTS:
				return createALoadAgents();
			case MetaABMActPackage.ALOAD_SHAPED_AGENTS:
				return createALoadShapedAgents();
			case MetaABMActPackage.ABUILD_NETWORK:
				return createABuildNetwork();
			case MetaABMActPackage.ABUILD_SPACE:
				return createABuildSpace();
			case MetaABMActPackage.ABUILD_GEOGRAPHY:
				return createABuildGeography();
			case MetaABMActPackage.ABUILD_GRID:
				return createABuildGrid();
			case MetaABMActPackage.ASELECT:
				return createASelect();
			case MetaABMActPackage.AMOVE:
				return createAMove();
			case MetaABMActPackage.ALEAVE:
				return createALeave();
			case MetaABMActPackage.ADIE:
				return createADie();
			case MetaABMActPackage.ACONNECT:
				return createAConnect();
			case MetaABMActPackage.ADISCONNECT:
				return createADisconnect();
			case MetaABMActPackage.AREPLACE:
				return createAReplace();
			case MetaABMActPackage.ACAUSE:
				return createACause();
			case MetaABMActPackage.ADIFFUSE:
				return createADiffuse();
			case MetaABMActPackage.APERFORM:
				return createAPerform();
			case MetaABMActPackage.ADERIVE:
				return createADerive();
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
			case MetaABMActPackage.ABUILD_SPACE_TYPES:
				return createABuildSpaceTypesFromString(eDataType, initialValue);
			case MetaABMActPackage.ABUILD_NETWORK_TYPES:
				return createABuildNetworkTypesFromString(eDataType, initialValue);
			case MetaABMActPackage.ASELECT_TYPES:
				return createASelectTypesFromString(eDataType, initialValue);
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
			case MetaABMActPackage.ABUILD_SPACE_TYPES:
				return convertABuildSpaceTypesToString(eDataType, instanceValue);
			case MetaABMActPackage.ABUILD_NETWORK_TYPES:
				return convertABuildNetworkTypesToString(eDataType, instanceValue);
			case MetaABMActPackage.ASELECT_TYPES:
				return convertASelectTypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AInput createAInput() {
		AInputImpl aInput = new AInputImpl();
		return aInput;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ALiteral createALiteral() {
		ALiteralImpl aLiteral = new ALiteralImpl();
		return aLiteral;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AMultiValue createAMultiValue() {
		AMultiValueImpl aMultiValue = new AMultiValueImpl();
		return aMultiValue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AGroup createAGroup() {
		AGroupImpl aGroup = new AGroupImpl();
		return aGroup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ASchedule createASchedule() {
		AScheduleImpl aSchedule = new AScheduleImpl();
		return aSchedule;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ARule createARule() {
		ARuleImpl aRule = new ARuleImpl();
		return aRule;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ABuild createABuild() {
		ABuildImpl aBuild = new ABuildImpl();
		return aBuild;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AInitialize createAInitialize() {
		AInitializeImpl aInitialize = new AInitializeImpl();
		return aInitialize;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AMethod createAMethod() {
		AMethodImpl aMethod = new AMethodImpl();
		return aMethod;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AAny createAAny() {
		AAnyImpl aAny = new AAnyImpl();
		return aAny;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AAll createAAll() {
		AAllImpl aAll = new AAllImpl();
		return aAll;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ANone createANone() {
		ANoneImpl aNone = new ANoneImpl();
		return aNone;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AQuery createAQuery() {
		AQueryImpl aQuery = new AQueryImpl();
		return aQuery;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AEvaluate createAEvaluate() {
		AEvaluateImpl aEvaluate = new AEvaluateImpl();
		return aEvaluate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AWatch createAWatch() {
		AWatchImpl aWatch = new AWatchImpl();
		return aWatch;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ASet createASet() {
		ASetImpl aSet = new ASetImpl();
		return aSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ACreateAgents createACreateAgents() {
		ACreateAgentsImpl aCreateAgents = new ACreateAgentsImpl();
		return aCreateAgents;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ABuildNetwork createABuildNetwork() {
		ABuildNetworkImpl aBuildNetwork = new ABuildNetworkImpl();
		return aBuildNetwork;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ABuildSpace createABuildSpace() {
		ABuildSpaceImpl aBuildSpace = new ABuildSpaceImpl();
		return aBuildSpace;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ABuildGeography createABuildGeography() {
		ABuildGeographyImpl aBuildGeography = new ABuildGeographyImpl();
		return aBuildGeography;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ABuildGrid createABuildGrid() {
		ABuildGridImpl aBuildGrid = new ABuildGridImpl();
		return aBuildGrid;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ASelect createASelect() {
		ASelectImpl aSelect = new ASelectImpl();
		return aSelect;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AMove createAMove() {
		AMoveImpl aMove = new AMoveImpl();
		return aMove;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ALeave createALeave() {
		ALeaveImpl aLeave = new ALeaveImpl();
		return aLeave;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ADie createADie() {
		ADieImpl aDie = new ADieImpl();
		return aDie;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AConnect createAConnect() {
		AConnectImpl aConnect = new AConnectImpl();
		return aConnect;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ADisconnect createADisconnect() {
		ADisconnectImpl aDisconnect = new ADisconnectImpl();
		return aDisconnect;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AReplace createAReplace() {
		AReplaceImpl aReplace = new AReplaceImpl();
		return aReplace;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ACause createACause() {
		ACauseImpl aCause = new ACauseImpl();
		return aCause;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ADiffuse createADiffuse() {
		ADiffuseImpl aDiffuse = new ADiffuseImpl();
		return aDiffuse;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public APerform createAPerform() {
		APerformImpl aPerform = new APerformImpl();
		return aPerform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ADerive createADerive() {
		ADeriveImpl aDerive = new ADeriveImpl();
		return aDerive;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ALoadShapedAgents createALoadShapedAgents() {
		ALoadShapedAgentsImpl aLoadShapedAgents = new ALoadShapedAgentsImpl();
		return aLoadShapedAgents;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ACreateShapedAgents createACreateShapedAgents() {
		ACreateShapedAgentsImpl aCreateShapedAgents = new ACreateShapedAgentsImpl();
		return aCreateShapedAgents;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ALoadAgents createALoadAgents() {
		ALoadAgentsImpl aLoadAgents = new ALoadAgentsImpl();
		return aLoadAgents;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ABuildSpaceTypes createABuildSpaceTypesFromString(EDataType eDataType, String initialValue) {
		ABuildSpaceTypes result = ABuildSpaceTypes.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertABuildSpaceTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ABuildNetworkTypes createABuildNetworkTypesFromString(EDataType eDataType, String initialValue) {
		ABuildNetworkTypes result = ABuildNetworkTypes.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertABuildNetworkTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ASelectTypes createASelectTypesFromString(EDataType eDataType, String initialValue) {
		ASelectTypes result = ASelectTypes.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String convertASelectTypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MetaABMActPackage getMetaABMActPackage() {
		return (MetaABMActPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetaABMActPackage getPackage() {
		return MetaABMActPackage.eINSTANCE;
	}

} // MetaABMActFactoryImpl
