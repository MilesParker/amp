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
package org.metaabm.act;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.metaabm.MetaABMPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * 
 * @author Miles Parker <!-- end-user-doc -->
 * @see org.metaabm.act.MetaABMActFactory
 * @model kind="package"
 * @generated
 */
public interface MetaABMActPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "act";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://metaabm.org/act";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "act";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	MetaABMActPackage eINSTANCE = org.metaabm.act.impl.MetaABMActPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.AActImpl <em>AAct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.AActImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAAct()
	 * @generated
	 */
	int AACT = 4;

	/**
	 * The meta object id for the '{@link org.metaabm.act.AControl <em>AControl</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.metaabm.act.AControl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAControl()
	 * @generated
	 */
	int ACONTROL = 5;

	/**
	 * The meta object id for the '{@link org.metaabm.act.ARoot <em>ARoot</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.metaabm.act.ARoot
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getARoot()
	 * @generated
	 */
	int AROOT = 6;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.AGroupImpl <em>AGroup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.AGroupImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAGroup()
	 * @generated
	 */
	int AGROUP = 7;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.AScheduleImpl <em>ASchedule</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.act.impl.AScheduleImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getASchedule()
	 * @generated
	 */
	int ASCHEDULE = 8;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ABuildImpl <em>ABuild</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.ABuildImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getABuild()
	 * @generated
	 */
	int ABUILD = 10;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.AInitializeImpl <em>AInitialize</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.act.impl.AInitializeImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAInitialize()
	 * @generated
	 */
	int AINITIALIZE = 11;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ARuleImpl <em>ARule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.ARuleImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getARule()
	 * @generated
	 */
	int ARULE = 9;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.AMethodImpl <em>AMethod</em>}' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.AMethodImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAMethod()
	 * @generated
	 */
	int AMETHOD = 12;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ASinkImpl <em>ASink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.ASinkImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getASink()
	 * @generated
	 */
	int ASINK = 13;

	/**
	 * The meta object id for the '{@link org.metaabm.act.ALogic <em>ALogic</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.metaabm.act.ALogic
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getALogic()
	 * @generated
	 */
	int ALOGIC = 14;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.AAnyImpl <em>AAny</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.AAnyImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAAny()
	 * @generated
	 */
	int AANY = 15;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.AAllImpl <em>AAll</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.AAllImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAAll()
	 * @generated
	 */
	int AALL = 16;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ANoneImpl <em>ANone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.ANoneImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getANone()
	 * @generated
	 */
	int ANONE = 17;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.AQueryImpl <em>AQuery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.AQueryImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAQuery()
	 * @generated
	 */
	int AQUERY = 18;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.AEvaluateImpl <em>AEvaluate</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.act.impl.AEvaluateImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAEvaluate()
	 * @generated
	 */
	int AEVALUATE = 19;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.AAccessorImpl <em>AAccessor</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.act.impl.AAccessorImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAAccessor()
	 * @generated
	 */
	int AACCESSOR = 20;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.AWatchImpl <em>AWatch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.AWatchImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAWatch()
	 * @generated
	 */
	int AWATCH = 21;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ASetImpl <em>ASet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.ASetImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getASet()
	 * @generated
	 */
	int ASET = 22;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ACreateAgentsImpl <em>ACreate Agents</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.act.impl.ACreateAgentsImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getACreateAgents()
	 * @generated
	 */
	int ACREATE_AGENTS = 23;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ABuildProjectionImpl <em>ABuild Projection</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.ABuildProjectionImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getABuildProjection()
	 * @generated
	 */
	int ABUILD_PROJECTION = 27;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ABuildNetworkImpl <em>ABuild Network</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.act.impl.ABuildNetworkImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getABuildNetwork()
	 * @generated
	 */
	int ABUILD_NETWORK = 28;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ABuildSpaceImpl <em>ABuild Space</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.act.impl.ABuildSpaceImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getABuildSpace()
	 * @generated
	 */
	int ABUILD_SPACE = 29;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ABuildGridImpl <em>ABuild Grid</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.act.impl.ABuildGridImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getABuildGrid()
	 * @generated
	 */
	int ABUILD_GRID = 31;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ASelectImpl <em>ASelect</em>}' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.ASelectImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getASelect()
	 * @generated
	 */
	int ASELECT = 32;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ATransformImpl <em>ATransform</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.act.impl.ATransformImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getATransform()
	 * @generated
	 */
	int ATRANSFORM = 34;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.AMoveImpl <em>AMove</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.AMoveImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAMove()
	 * @generated
	 */
	int AMOVE = 33;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.AInputImpl <em>AInput</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.AInputImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAInput()
	 * @generated
	 */
	int AINPUT = 0;

	/**
	 * The feature id for the '<em><b>Sink</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AINPUT__SINK = 0;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AINPUT__SELECTED = 1;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AINPUT__LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AINPUT__VALUE = 3;

	/**
	 * The number of structural features of the '<em>AInput</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AINPUT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ALiteralImpl <em>ALiteral</em>}' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.ALiteralImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getALiteral()
	 * @generated
	 */
	int ALITERAL = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALITERAL__LABEL = MetaABMPackage.IVALUE__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALITERAL__ID = MetaABMPackage.IVALUE__ID;

	/**
	 * The feature id for the '<em><b>Accessors</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALITERAL__ACCESSORS = MetaABMPackage.IVALUE__ACCESSORS;

	/**
	 * The feature id for the '<em><b>Available Types</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ALITERAL__AVAILABLE_TYPES = MetaABMPackage.IVALUE__AVAILABLE_TYPES;

	/**
	 * The feature id for the '<em><b>Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALITERAL__VALUE_LITERAL = MetaABMPackage.IVALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ALiteral</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALITERAL_FEATURE_COUNT = MetaABMPackage.IVALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.AMultiValueImpl <em>AMulti Value</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.act.impl.AMultiValueImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAMultiValue()
	 * @generated
	 */
	int AMULTI_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMULTI_VALUE__LABEL = ALITERAL__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMULTI_VALUE__ID = ALITERAL__ID;

	/**
	 * The feature id for the '<em><b>Accessors</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMULTI_VALUE__ACCESSORS = ALITERAL__ACCESSORS;

	/**
	 * The feature id for the '<em><b>Available Types</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AMULTI_VALUE__AVAILABLE_TYPES = ALITERAL__AVAILABLE_TYPES;

	/**
	 * The feature id for the '<em><b>Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMULTI_VALUE__VALUE_LITERAL = ALITERAL__VALUE_LITERAL;

	/**
	 * The feature id for the '<em><b>Values</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMULTI_VALUE__VALUES = ALITERAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AMulti Value</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AMULTI_VALUE_FEATURE_COUNT = ALITERAL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ACommandImpl <em>ACommand</em>}' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.ACommandImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getACommand()
	 * @generated
	 */
	int ACOMMAND = 41;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ABuildGeographyImpl <em>ABuild Geography</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.act.impl.ABuildGeographyImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getABuildGeography()
	 * @generated
	 */
	int ABUILD_GEOGRAPHY = 30;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ALeaveImpl <em>ALeave</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.ALeaveImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getALeave()
	 * @generated
	 */
	int ALEAVE = 35;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ADieImpl <em>ADie</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.ADieImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getADie()
	 * @generated
	 */
	int ADIE = 36;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ANetworkImpl <em>ANetwork</em>}' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.ANetworkImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getANetwork()
	 * @generated
	 */
	int ANETWORK = 38;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.AConnectImpl <em>AConnect</em>}' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.AConnectImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAConnect()
	 * @generated
	 */
	int ACONNECT = 37;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ADisconnectImpl <em>ADisconnect</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.act.impl.ADisconnectImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getADisconnect()
	 * @generated
	 */
	int ADISCONNECT = 39;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.AReplaceImpl <em>AReplace</em>}' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.AReplaceImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAReplace()
	 * @generated
	 */
	int AREPLACE = 40;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ALoadAgentsImpl <em>ALoad Agents</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.act.impl.ALoadAgentsImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getALoadAgents()
	 * @generated
	 */
	int ALOAD_AGENTS = 25;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.AShapedImpl <em>AShaped</em>}' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.AShapedImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAShaped()
	 * @generated
	 */
	int ASHAPED = 3;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASHAPED__SHAPE = 0;

	/**
	 * The number of structural features of the '<em>AShaped</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASHAPED_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AACT__LABEL = MetaABMPackage.IID__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AACT__ID = MetaABMPackage.IID__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AACT__SOURCES = MetaABMPackage.IID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AACT__TARGETS = MetaABMPackage.IID_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AACT__REFERENCE = MetaABMPackage.IID_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AACT__GROUP = MetaABMPackage.IID_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AACT__SELECTED = MetaABMPackage.IID_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AACT__ALL_SOURCES = MetaABMPackage.IID_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AACT__ALL_TARGETS = MetaABMPackage.IID_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AACT__ROOT_SELECTED = MetaABMPackage.IID_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>AAct</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AACT_FEATURE_COUNT = MetaABMPackage.IID_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTROL__LABEL = AACT__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTROL__ID = AACT__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTROL__SOURCES = AACT__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTROL__TARGETS = AACT__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTROL__REFERENCE = AACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTROL__GROUP = AACT__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTROL__SELECTED = AACT__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTROL__ALL_SOURCES = AACT__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTROL__ALL_TARGETS = AACT__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTROL__ROOT_SELECTED = AACT__ROOT_SELECTED;

	/**
	 * The number of structural features of the '<em>AControl</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTROL_FEATURE_COUNT = AACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASELECT__LABEL = AACT__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASELECT__ID = AACT__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASELECT__SOURCES = AACT__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASELECT__TARGETS = AACT__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASELECT__REFERENCE = AACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASELECT__GROUP = AACT__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASELECT__SELECTED = AACT__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASELECT__ALL_SOURCES = AACT__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASELECT__ALL_TARGETS = AACT__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASELECT__ROOT_SELECTED = AACT__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASELECT__AGENT = AACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Space</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASELECT__SPACE = AACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>For</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASELECT__FOR = AACT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ASelect</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASELECT_FEATURE_COUNT = AACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROOT__LABEL = ASELECT__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROOT__ID = ASELECT__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROOT__SOURCES = ASELECT__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROOT__TARGETS = ASELECT__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROOT__REFERENCE = ASELECT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROOT__GROUP = ASELECT__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROOT__SELECTED = ASELECT__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROOT__ALL_SOURCES = ASELECT__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROOT__ALL_TARGETS = ASELECT__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROOT__ROOT_SELECTED = ASELECT__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROOT__AGENT = ASELECT__AGENT;

	/**
	 * The feature id for the '<em><b>Space</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROOT__SPACE = ASELECT__SPACE;

	/**
	 * The feature id for the '<em><b>For</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROOT__FOR = ASELECT__FOR;

	/**
	 * The number of structural features of the '<em>ARoot</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AROOT_FEATURE_COUNT = ASELECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGROUP__LABEL = AACT__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGROUP__ID = AACT__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGROUP__SOURCES = AACT__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGROUP__TARGETS = AACT__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGROUP__REFERENCE = AACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGROUP__GROUP = AACT__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGROUP__SELECTED = AACT__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGROUP__ALL_SOURCES = AACT__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGROUP__ALL_TARGETS = AACT__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGROUP__ROOT_SELECTED = AACT__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGROUP__PLURAL_LABEL = AACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGROUP__DESCRIPTION = AACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Roots</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGROUP__ROOTS = AACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGROUP__MEMBERS = AACT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>AGroup</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGROUP_FEATURE_COUNT = AACT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCHEDULE__LABEL = AROOT__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCHEDULE__ID = AROOT__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCHEDULE__SOURCES = AROOT__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCHEDULE__TARGETS = AROOT__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCHEDULE__REFERENCE = AROOT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCHEDULE__GROUP = AROOT__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCHEDULE__SELECTED = AROOT__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCHEDULE__ALL_SOURCES = AROOT__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCHEDULE__ALL_TARGETS = AROOT__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCHEDULE__ROOT_SELECTED = AROOT__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCHEDULE__AGENT = AROOT__AGENT;

	/**
	 * The feature id for the '<em><b>Space</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCHEDULE__SPACE = AROOT__SPACE;

	/**
	 * The feature id for the '<em><b>For</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCHEDULE__FOR = AROOT__FOR;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCHEDULE__PLURAL_LABEL = AROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCHEDULE__DESCRIPTION = AROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCHEDULE__START = AROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Interval</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCHEDULE__INTERVAL = AROOT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCHEDULE__PRIORITY = AROOT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pick</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCHEDULE__PICK = AROOT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>ASchedule</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASCHEDULE_FEATURE_COUNT = AROOT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARULE__LABEL = AROOT__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARULE__ID = AROOT__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARULE__SOURCES = AROOT__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARULE__TARGETS = AROOT__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARULE__REFERENCE = AROOT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARULE__GROUP = AROOT__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARULE__SELECTED = AROOT__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARULE__ALL_SOURCES = AROOT__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARULE__ALL_TARGETS = AROOT__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARULE__ROOT_SELECTED = AROOT__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARULE__AGENT = AROOT__AGENT;

	/**
	 * The feature id for the '<em><b>Space</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARULE__SPACE = AROOT__SPACE;

	/**
	 * The feature id for the '<em><b>For</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARULE__FOR = AROOT__FOR;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARULE__PLURAL_LABEL = AROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARULE__DESCRIPTION = AROOT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ARule</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARULE_FEATURE_COUNT = AROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD__LABEL = AROOT__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD__ID = AROOT__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD__SOURCES = AROOT__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD__TARGETS = AROOT__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD__REFERENCE = AROOT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD__GROUP = AROOT__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD__SELECTED = AROOT__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD__ALL_SOURCES = AROOT__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD__ALL_TARGETS = AROOT__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD__ROOT_SELECTED = AROOT__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD__AGENT = AROOT__AGENT;

	/**
	 * The feature id for the '<em><b>Space</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD__SPACE = AROOT__SPACE;

	/**
	 * The feature id for the '<em><b>For</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD__FOR = AROOT__FOR;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD__PLURAL_LABEL = AROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD__DESCRIPTION = AROOT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>ABuild</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_FEATURE_COUNT = AROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AINITIALIZE__LABEL = AROOT__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AINITIALIZE__ID = AROOT__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AINITIALIZE__SOURCES = AROOT__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AINITIALIZE__TARGETS = AROOT__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AINITIALIZE__REFERENCE = AROOT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AINITIALIZE__GROUP = AROOT__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AINITIALIZE__SELECTED = AROOT__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AINITIALIZE__ALL_SOURCES = AROOT__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AINITIALIZE__ALL_TARGETS = AROOT__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AINITIALIZE__ROOT_SELECTED = AROOT__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AINITIALIZE__AGENT = AROOT__AGENT;

	/**
	 * The feature id for the '<em><b>Space</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AINITIALIZE__SPACE = AROOT__SPACE;

	/**
	 * The feature id for the '<em><b>For</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AINITIALIZE__FOR = AROOT__FOR;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AINITIALIZE__PLURAL_LABEL = AROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AINITIALIZE__DESCRIPTION = AROOT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>AInitialize</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AINITIALIZE_FEATURE_COUNT = AROOT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETHOD__LABEL = AACT__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETHOD__ID = AACT__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETHOD__SOURCES = AACT__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETHOD__TARGETS = AACT__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETHOD__REFERENCE = AACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETHOD__GROUP = AACT__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETHOD__SELECTED = AACT__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETHOD__ALL_SOURCES = AACT__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETHOD__ALL_TARGETS = AACT__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETHOD__ROOT_SELECTED = AACT__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETHOD__PLURAL_LABEL = AACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETHOD__DESCRIPTION = AACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETHOD__BODY = AACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Generate</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETHOD__GENERATE = AACT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>AMethod</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMETHOD_FEATURE_COUNT = AACT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASINK__LABEL = AACT__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASINK__ID = AACT__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASINK__SOURCES = AACT__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASINK__TARGETS = AACT__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASINK__REFERENCE = AACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASINK__GROUP = AACT__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASINK__SELECTED = AACT__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASINK__ALL_SOURCES = AACT__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASINK__ALL_TARGETS = AACT__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASINK__ROOT_SELECTED = AACT__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Accessors</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASINK__ACCESSORS = AACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Available Types</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ASINK__AVAILABLE_TYPES = AACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASINK__INPUTS = AACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASINK__FUNCTION = AACT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>ASink</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASINK_FEATURE_COUNT = AACT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOGIC__LABEL = ACONTROL__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOGIC__ID = ACONTROL__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOGIC__SOURCES = ACONTROL__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOGIC__TARGETS = ACONTROL__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOGIC__REFERENCE = ACONTROL__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOGIC__GROUP = ACONTROL__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOGIC__SELECTED = ACONTROL__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOGIC__ALL_SOURCES = ACONTROL__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOGIC__ALL_TARGETS = ACONTROL__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOGIC__ROOT_SELECTED = ACONTROL__ROOT_SELECTED;

	/**
	 * The number of structural features of the '<em>ALogic</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOGIC_FEATURE_COUNT = ACONTROL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AANY__LABEL = ALOGIC__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AANY__ID = ALOGIC__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AANY__SOURCES = ALOGIC__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AANY__TARGETS = ALOGIC__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AANY__REFERENCE = ALOGIC__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AANY__GROUP = ALOGIC__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AANY__SELECTED = ALOGIC__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AANY__ALL_SOURCES = ALOGIC__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AANY__ALL_TARGETS = ALOGIC__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AANY__ROOT_SELECTED = ALOGIC__ROOT_SELECTED;

	/**
	 * The number of structural features of the '<em>AAny</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AANY_FEATURE_COUNT = ALOGIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AALL__LABEL = ALOGIC__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AALL__ID = ALOGIC__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AALL__SOURCES = ALOGIC__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AALL__TARGETS = ALOGIC__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AALL__REFERENCE = ALOGIC__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AALL__GROUP = ALOGIC__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AALL__SELECTED = ALOGIC__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AALL__ALL_SOURCES = ALOGIC__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AALL__ALL_TARGETS = ALOGIC__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AALL__ROOT_SELECTED = ALOGIC__ROOT_SELECTED;

	/**
	 * The number of structural features of the '<em>AAll</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AALL_FEATURE_COUNT = ALOGIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONE__LABEL = ALOGIC__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONE__ID = ALOGIC__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONE__SOURCES = ALOGIC__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONE__TARGETS = ALOGIC__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONE__REFERENCE = ALOGIC__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONE__GROUP = ALOGIC__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONE__SELECTED = ALOGIC__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONE__ALL_SOURCES = ALOGIC__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONE__ALL_TARGETS = ALOGIC__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONE__ROOT_SELECTED = ALOGIC__ROOT_SELECTED;

	/**
	 * The number of structural features of the '<em>ANone</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANONE_FEATURE_COUNT = ALOGIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUERY__LABEL = ASINK__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUERY__ID = ASINK__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUERY__SOURCES = ASINK__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUERY__TARGETS = ASINK__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUERY__REFERENCE = ASINK__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUERY__GROUP = ASINK__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUERY__SELECTED = ASINK__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUERY__ALL_SOURCES = ASINK__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUERY__ALL_TARGETS = ASINK__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUERY__ROOT_SELECTED = ASINK__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Accessors</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUERY__ACCESSORS = ASINK__ACCESSORS;

	/**
	 * The feature id for the '<em><b>Available Types</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AQUERY__AVAILABLE_TYPES = ASINK__AVAILABLE_TYPES;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUERY__INPUTS = ASINK__INPUTS;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUERY__FUNCTION = ASINK__FUNCTION;

	/**
	 * The number of structural features of the '<em>AQuery</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AQUERY_FEATURE_COUNT = ASINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEVALUATE__LABEL = ASINK__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEVALUATE__ID = ASINK__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEVALUATE__SOURCES = ASINK__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEVALUATE__TARGETS = ASINK__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEVALUATE__REFERENCE = ASINK__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEVALUATE__GROUP = ASINK__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEVALUATE__SELECTED = ASINK__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEVALUATE__ALL_SOURCES = ASINK__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEVALUATE__ALL_TARGETS = ASINK__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEVALUATE__ROOT_SELECTED = ASINK__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Accessors</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEVALUATE__ACCESSORS = ASINK__ACCESSORS;

	/**
	 * The feature id for the '<em><b>Available Types</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int AEVALUATE__AVAILABLE_TYPES = ASINK__AVAILABLE_TYPES;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEVALUATE__INPUTS = ASINK__INPUTS;

	/**
	 * The feature id for the '<em><b>Function</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEVALUATE__FUNCTION = ASINK__FUNCTION;

	/**
	 * The number of structural features of the '<em>AEvaluate</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AEVALUATE_FEATURE_COUNT = ASINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AACCESSOR__LABEL = AACT__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AACCESSOR__ID = AACT__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AACCESSOR__SOURCES = AACT__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AACCESSOR__TARGETS = AACT__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AACCESSOR__REFERENCE = AACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AACCESSOR__GROUP = AACT__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AACCESSOR__SELECTED = AACT__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AACCESSOR__ALL_SOURCES = AACT__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AACCESSOR__ALL_TARGETS = AACT__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AACCESSOR__ROOT_SELECTED = AACT__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AACCESSOR__ATTRIBUTE = AACT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AAccessor</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AACCESSOR_FEATURE_COUNT = AACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWATCH__LABEL = AACCESSOR__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWATCH__ID = AACCESSOR__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWATCH__SOURCES = AACCESSOR__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWATCH__TARGETS = AACCESSOR__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWATCH__REFERENCE = AACCESSOR__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWATCH__GROUP = AACCESSOR__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWATCH__SELECTED = AACCESSOR__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWATCH__ALL_SOURCES = AACCESSOR__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWATCH__ALL_TARGETS = AACCESSOR__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWATCH__ROOT_SELECTED = AACCESSOR__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWATCH__ATTRIBUTE = AACCESSOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWATCH__AGENT = AACCESSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Space</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWATCH__SPACE = AACCESSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>For</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWATCH__FOR = AACCESSOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>AWatch</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AWATCH_FEATURE_COUNT = AACCESSOR_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASET__LABEL = AACCESSOR__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASET__ID = AACCESSOR__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASET__SOURCES = AACCESSOR__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASET__TARGETS = AACCESSOR__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASET__REFERENCE = AACCESSOR__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASET__GROUP = AACCESSOR__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASET__SELECTED = AACCESSOR__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASET__ALL_SOURCES = AACCESSOR__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASET__ALL_TARGETS = AACCESSOR__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASET__ROOT_SELECTED = AACCESSOR__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASET__ATTRIBUTE = AACCESSOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASET__PARAMETER = AACCESSOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ASet</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASET_FEATURE_COUNT = AACCESSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_AGENTS__LABEL = ASELECT__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_AGENTS__ID = ASELECT__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_AGENTS__SOURCES = ASELECT__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_AGENTS__TARGETS = ASELECT__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_AGENTS__REFERENCE = ASELECT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_AGENTS__GROUP = ASELECT__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_AGENTS__SELECTED = ASELECT__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_AGENTS__ALL_SOURCES = ASELECT__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_AGENTS__ALL_TARGETS = ASELECT__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_AGENTS__ROOT_SELECTED = ASELECT__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_AGENTS__AGENT = ASELECT__AGENT;

	/**
	 * The feature id for the '<em><b>Space</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_AGENTS__SPACE = ASELECT__SPACE;

	/**
	 * The feature id for the '<em><b>For</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_AGENTS__FOR = ASELECT__FOR;

	/**
	 * The feature id for the '<em><b>Agent Count</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_AGENTS__AGENT_COUNT = ASELECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ACreate Agents</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACREATE_AGENTS_FEATURE_COUNT = ASELECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ALoadShapedAgentsImpl <em>ALoad Shaped Agents</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.ALoadShapedAgentsImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getALoadShapedAgents()
	 * @generated
	 */
	int ALOAD_SHAPED_AGENTS = 26;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ACreateShapedAgentsImpl <em>ACreate Shaped Agents</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.ACreateShapedAgentsImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getACreateShapedAgents()
	 * @generated
	 */
	int ACREATE_SHAPED_AGENTS = 24;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_SHAPED_AGENTS__LABEL = ACREATE_AGENTS__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_SHAPED_AGENTS__ID = ACREATE_AGENTS__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_SHAPED_AGENTS__SOURCES = ACREATE_AGENTS__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_SHAPED_AGENTS__TARGETS = ACREATE_AGENTS__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_SHAPED_AGENTS__REFERENCE = ACREATE_AGENTS__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_SHAPED_AGENTS__GROUP = ACREATE_AGENTS__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_SHAPED_AGENTS__SELECTED = ACREATE_AGENTS__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_SHAPED_AGENTS__ALL_SOURCES = ACREATE_AGENTS__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_SHAPED_AGENTS__ALL_TARGETS = ACREATE_AGENTS__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_SHAPED_AGENTS__ROOT_SELECTED = ACREATE_AGENTS__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_SHAPED_AGENTS__AGENT = ACREATE_AGENTS__AGENT;

	/**
	 * The feature id for the '<em><b>Space</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_SHAPED_AGENTS__SPACE = ACREATE_AGENTS__SPACE;

	/**
	 * The feature id for the '<em><b>For</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_SHAPED_AGENTS__FOR = ACREATE_AGENTS__FOR;

	/**
	 * The feature id for the '<em><b>Agent Count</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_SHAPED_AGENTS__AGENT_COUNT = ACREATE_AGENTS__AGENT_COUNT;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_SHAPED_AGENTS__SHAPE = ACREATE_AGENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ACreate Shaped Agents</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACREATE_SHAPED_AGENTS_FEATURE_COUNT = ACREATE_AGENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_AGENTS__LABEL = ACREATE_AGENTS__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_AGENTS__ID = ACREATE_AGENTS__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_AGENTS__SOURCES = ACREATE_AGENTS__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_AGENTS__TARGETS = ACREATE_AGENTS__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_AGENTS__REFERENCE = ACREATE_AGENTS__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_AGENTS__GROUP = ACREATE_AGENTS__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_AGENTS__SELECTED = ACREATE_AGENTS__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_AGENTS__ALL_SOURCES = ACREATE_AGENTS__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_AGENTS__ALL_TARGETS = ACREATE_AGENTS__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_AGENTS__ROOT_SELECTED = ACREATE_AGENTS__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_AGENTS__AGENT = ACREATE_AGENTS__AGENT;

	/**
	 * The feature id for the '<em><b>Space</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_AGENTS__SPACE = ACREATE_AGENTS__SPACE;

	/**
	 * The feature id for the '<em><b>For</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_AGENTS__FOR = ACREATE_AGENTS__FOR;

	/**
	 * The feature id for the '<em><b>Agent Count</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_AGENTS__AGENT_COUNT = ACREATE_AGENTS__AGENT_COUNT;

	/**
	 * The feature id for the '<em><b>Source URL</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_AGENTS__SOURCE_URL = ACREATE_AGENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ALoad Agents</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ALOAD_AGENTS_FEATURE_COUNT = ACREATE_AGENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_SHAPED_AGENTS__LABEL = ALOAD_AGENTS__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_SHAPED_AGENTS__ID = ALOAD_AGENTS__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_SHAPED_AGENTS__SOURCES = ALOAD_AGENTS__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_SHAPED_AGENTS__TARGETS = ALOAD_AGENTS__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_SHAPED_AGENTS__REFERENCE = ALOAD_AGENTS__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_SHAPED_AGENTS__GROUP = ALOAD_AGENTS__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_SHAPED_AGENTS__SELECTED = ALOAD_AGENTS__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_SHAPED_AGENTS__ALL_SOURCES = ALOAD_AGENTS__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_SHAPED_AGENTS__ALL_TARGETS = ALOAD_AGENTS__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_SHAPED_AGENTS__ROOT_SELECTED = ALOAD_AGENTS__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_SHAPED_AGENTS__AGENT = ALOAD_AGENTS__AGENT;

	/**
	 * The feature id for the '<em><b>Space</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_SHAPED_AGENTS__SPACE = ALOAD_AGENTS__SPACE;

	/**
	 * The feature id for the '<em><b>For</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_SHAPED_AGENTS__FOR = ALOAD_AGENTS__FOR;

	/**
	 * The feature id for the '<em><b>Agent Count</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_SHAPED_AGENTS__AGENT_COUNT = ALOAD_AGENTS__AGENT_COUNT;

	/**
	 * The feature id for the '<em><b>Source URL</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_SHAPED_AGENTS__SOURCE_URL = ALOAD_AGENTS__SOURCE_URL;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_SHAPED_AGENTS__SHAPE = ALOAD_AGENTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ALoad Shaped Agents</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALOAD_SHAPED_AGENTS_FEATURE_COUNT = ALOAD_AGENTS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_PROJECTION__LABEL = AACT__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_PROJECTION__ID = AACT__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_PROJECTION__SOURCES = AACT__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_PROJECTION__TARGETS = AACT__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_PROJECTION__REFERENCE = AACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_PROJECTION__GROUP = AACT__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_PROJECTION__SELECTED = AACT__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_PROJECTION__ALL_SOURCES = AACT__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_PROJECTION__ALL_TARGETS = AACT__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_PROJECTION__ROOT_SELECTED = AACT__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_PROJECTION__PLURAL_LABEL = AACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_PROJECTION__DESCRIPTION = AACT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_PROJECTION__AGENTS = AACT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_PROJECTION__PROJECTION = AACT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_PROJECTION__ATTRIBUTES = AACT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>ABuild Projection</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_PROJECTION_FEATURE_COUNT = AACT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_NETWORK__LABEL = ABUILD_PROJECTION__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_NETWORK__ID = ABUILD_PROJECTION__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_NETWORK__SOURCES = ABUILD_PROJECTION__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_NETWORK__TARGETS = ABUILD_PROJECTION__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_NETWORK__REFERENCE = ABUILD_PROJECTION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_NETWORK__GROUP = ABUILD_PROJECTION__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_NETWORK__SELECTED = ABUILD_PROJECTION__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_NETWORK__ALL_SOURCES = ABUILD_PROJECTION__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_NETWORK__ALL_TARGETS = ABUILD_PROJECTION__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_NETWORK__ROOT_SELECTED = ABUILD_PROJECTION__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_NETWORK__PLURAL_LABEL = ABUILD_PROJECTION__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_NETWORK__DESCRIPTION = ABUILD_PROJECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_NETWORK__AGENTS = ABUILD_PROJECTION__AGENTS;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_NETWORK__PROJECTION = ABUILD_PROJECTION__PROJECTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_NETWORK__ATTRIBUTES = ABUILD_PROJECTION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Network Type</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_NETWORK__NETWORK_TYPE = ABUILD_PROJECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ABuild Network</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABUILD_NETWORK_FEATURE_COUNT = ABUILD_PROJECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_SPACE__LABEL = ABUILD_PROJECTION__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_SPACE__ID = ABUILD_PROJECTION__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_SPACE__SOURCES = ABUILD_PROJECTION__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_SPACE__TARGETS = ABUILD_PROJECTION__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_SPACE__REFERENCE = ABUILD_PROJECTION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_SPACE__GROUP = ABUILD_PROJECTION__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_SPACE__SELECTED = ABUILD_PROJECTION__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_SPACE__ALL_SOURCES = ABUILD_PROJECTION__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_SPACE__ALL_TARGETS = ABUILD_PROJECTION__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_SPACE__ROOT_SELECTED = ABUILD_PROJECTION__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_SPACE__PLURAL_LABEL = ABUILD_PROJECTION__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_SPACE__DESCRIPTION = ABUILD_PROJECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_SPACE__AGENTS = ABUILD_PROJECTION__AGENTS;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_SPACE__PROJECTION = ABUILD_PROJECTION__PROJECTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_SPACE__ATTRIBUTES = ABUILD_PROJECTION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Space Type</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_SPACE__SPACE_TYPE = ABUILD_PROJECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ABuild Space</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABUILD_SPACE_FEATURE_COUNT = ABUILD_PROJECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GEOGRAPHY__LABEL = ABUILD_PROJECTION__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GEOGRAPHY__ID = ABUILD_PROJECTION__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GEOGRAPHY__SOURCES = ABUILD_PROJECTION__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GEOGRAPHY__TARGETS = ABUILD_PROJECTION__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GEOGRAPHY__REFERENCE = ABUILD_PROJECTION__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GEOGRAPHY__GROUP = ABUILD_PROJECTION__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GEOGRAPHY__SELECTED = ABUILD_PROJECTION__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GEOGRAPHY__ALL_SOURCES = ABUILD_PROJECTION__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GEOGRAPHY__ALL_TARGETS = ABUILD_PROJECTION__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GEOGRAPHY__ROOT_SELECTED = ABUILD_PROJECTION__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GEOGRAPHY__PLURAL_LABEL = ABUILD_PROJECTION__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GEOGRAPHY__DESCRIPTION = ABUILD_PROJECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GEOGRAPHY__AGENTS = ABUILD_PROJECTION__AGENTS;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GEOGRAPHY__PROJECTION = ABUILD_PROJECTION__PROJECTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GEOGRAPHY__ATTRIBUTES = ABUILD_PROJECTION__ATTRIBUTES;

	/**
	 * The number of structural features of the '<em>ABuild Geography</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GEOGRAPHY_FEATURE_COUNT = ABUILD_PROJECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GRID__LABEL = ABUILD_SPACE__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GRID__ID = ABUILD_SPACE__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GRID__SOURCES = ABUILD_SPACE__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GRID__TARGETS = ABUILD_SPACE__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GRID__REFERENCE = ABUILD_SPACE__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GRID__GROUP = ABUILD_SPACE__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GRID__SELECTED = ABUILD_SPACE__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GRID__ALL_SOURCES = ABUILD_SPACE__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GRID__ALL_TARGETS = ABUILD_SPACE__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GRID__ROOT_SELECTED = ABUILD_SPACE__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GRID__PLURAL_LABEL = ABUILD_SPACE__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GRID__DESCRIPTION = ABUILD_SPACE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GRID__AGENTS = ABUILD_SPACE__AGENTS;

	/**
	 * The feature id for the '<em><b>Projection</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GRID__PROJECTION = ABUILD_SPACE__PROJECTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GRID__ATTRIBUTES = ABUILD_SPACE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Space Type</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GRID__SPACE_TYPE = ABUILD_SPACE__SPACE_TYPE;

	/**
	 * The feature id for the '<em><b>Fill Agent</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABUILD_GRID__FILL_AGENT = ABUILD_SPACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ABuild Grid</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ABUILD_GRID_FEATURE_COUNT = ABUILD_SPACE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMMAND__LABEL = AACT__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMMAND__ID = AACT__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMMAND__SOURCES = AACT__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMMAND__TARGETS = AACT__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMMAND__REFERENCE = AACT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMMAND__GROUP = AACT__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMMAND__SELECTED = AACT__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMMAND__ALL_SOURCES = AACT__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMMAND__ALL_TARGETS = AACT__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMMAND__ROOT_SELECTED = AACT__ROOT_SELECTED;

	/**
	 * The number of structural features of the '<em>ACommand</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACOMMAND_FEATURE_COUNT = AACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRANSFORM__LABEL = ACOMMAND__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRANSFORM__ID = ACOMMAND__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRANSFORM__SOURCES = ACOMMAND__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRANSFORM__TARGETS = ACOMMAND__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRANSFORM__REFERENCE = ACOMMAND__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRANSFORM__GROUP = ACOMMAND__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRANSFORM__SELECTED = ACOMMAND__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRANSFORM__ALL_SOURCES = ACOMMAND__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRANSFORM__ALL_TARGETS = ACOMMAND__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRANSFORM__ROOT_SELECTED = ACOMMAND__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRANSFORM__DESTINATION = ACOMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ATransform</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATRANSFORM_FEATURE_COUNT = ACOMMAND_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOVE__LABEL = ATRANSFORM__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOVE__ID = ATRANSFORM__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOVE__SOURCES = ATRANSFORM__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOVE__TARGETS = ATRANSFORM__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOVE__REFERENCE = ATRANSFORM__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOVE__GROUP = ATRANSFORM__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOVE__SELECTED = ATRANSFORM__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOVE__ALL_SOURCES = ATRANSFORM__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOVE__ALL_TARGETS = ATRANSFORM__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOVE__ROOT_SELECTED = ATRANSFORM__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOVE__DESTINATION = ATRANSFORM__DESTINATION;

	/**
	 * The number of structural features of the '<em>AMove</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AMOVE_FEATURE_COUNT = ATRANSFORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALEAVE__LABEL = ATRANSFORM__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALEAVE__ID = ATRANSFORM__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALEAVE__SOURCES = ATRANSFORM__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALEAVE__TARGETS = ATRANSFORM__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALEAVE__REFERENCE = ATRANSFORM__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALEAVE__GROUP = ATRANSFORM__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALEAVE__SELECTED = ATRANSFORM__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALEAVE__ALL_SOURCES = ATRANSFORM__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALEAVE__ALL_TARGETS = ATRANSFORM__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALEAVE__ROOT_SELECTED = ATRANSFORM__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALEAVE__DESTINATION = ATRANSFORM__DESTINATION;

	/**
	 * The number of structural features of the '<em>ALeave</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALEAVE_FEATURE_COUNT = ATRANSFORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIE__LABEL = ATRANSFORM__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIE__ID = ATRANSFORM__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIE__SOURCES = ATRANSFORM__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIE__TARGETS = ATRANSFORM__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIE__REFERENCE = ATRANSFORM__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIE__GROUP = ATRANSFORM__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIE__SELECTED = ATRANSFORM__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIE__ALL_SOURCES = ATRANSFORM__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIE__ALL_TARGETS = ATRANSFORM__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIE__ROOT_SELECTED = ATRANSFORM__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIE__DESTINATION = ATRANSFORM__DESTINATION;

	/**
	 * The number of structural features of the '<em>ADie</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIE_FEATURE_COUNT = ATRANSFORM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANETWORK__LABEL = ATRANSFORM__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANETWORK__ID = ATRANSFORM__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANETWORK__SOURCES = ATRANSFORM__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANETWORK__TARGETS = ATRANSFORM__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANETWORK__REFERENCE = ATRANSFORM__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANETWORK__GROUP = ATRANSFORM__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANETWORK__SELECTED = ATRANSFORM__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANETWORK__ALL_SOURCES = ATRANSFORM__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANETWORK__ALL_TARGETS = ATRANSFORM__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANETWORK__ROOT_SELECTED = ATRANSFORM__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANETWORK__DESTINATION = ATRANSFORM__DESTINATION;

	/**
	 * The feature id for the '<em><b>Within</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANETWORK__WITHIN = ATRANSFORM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ANetwork</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANETWORK_FEATURE_COUNT = ATRANSFORM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECT__LABEL = ANETWORK__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECT__ID = ANETWORK__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECT__SOURCES = ANETWORK__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECT__TARGETS = ANETWORK__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECT__REFERENCE = ANETWORK__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECT__GROUP = ANETWORK__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECT__SELECTED = ANETWORK__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECT__ALL_SOURCES = ANETWORK__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECT__ALL_TARGETS = ANETWORK__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECT__ROOT_SELECTED = ANETWORK__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECT__DESTINATION = ANETWORK__DESTINATION;

	/**
	 * The feature id for the '<em><b>Within</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECT__WITHIN = ANETWORK__WITHIN;

	/**
	 * The feature id for the '<em><b>Directed</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECT__DIRECTED = ANETWORK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>AConnect</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONNECT_FEATURE_COUNT = ANETWORK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCONNECT__LABEL = ANETWORK__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCONNECT__ID = ANETWORK__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCONNECT__SOURCES = ANETWORK__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCONNECT__TARGETS = ANETWORK__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCONNECT__REFERENCE = ANETWORK__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCONNECT__GROUP = ANETWORK__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCONNECT__SELECTED = ANETWORK__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCONNECT__ALL_SOURCES = ANETWORK__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCONNECT__ALL_TARGETS = ANETWORK__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCONNECT__ROOT_SELECTED = ANETWORK__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCONNECT__DESTINATION = ANETWORK__DESTINATION;

	/**
	 * The feature id for the '<em><b>Within</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADISCONNECT__WITHIN = ANETWORK__WITHIN;

	/**
	 * The number of structural features of the '<em>ADisconnect</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ADISCONNECT_FEATURE_COUNT = ANETWORK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPLACE__LABEL = ACONNECT__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPLACE__ID = ACONNECT__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPLACE__SOURCES = ACONNECT__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPLACE__TARGETS = ACONNECT__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPLACE__REFERENCE = ACONNECT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPLACE__GROUP = ACONNECT__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPLACE__SELECTED = ACONNECT__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPLACE__ALL_SOURCES = ACONNECT__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPLACE__ALL_TARGETS = ACONNECT__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPLACE__ROOT_SELECTED = ACONNECT__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPLACE__DESTINATION = ACONNECT__DESTINATION;

	/**
	 * The feature id for the '<em><b>Within</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPLACE__WITHIN = ACONNECT__WITHIN;

	/**
	 * The feature id for the '<em><b>Directed</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPLACE__DIRECTED = ACONNECT__DIRECTED;

	/**
	 * The number of structural features of the '<em>AReplace</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AREPLACE_FEATURE_COUNT = ACONNECT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ACauseImpl <em>ACause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.ACauseImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getACause()
	 * @generated
	 */
	int ACAUSE = 42;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAUSE__LABEL = ACOMMAND__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAUSE__ID = ACOMMAND__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAUSE__SOURCES = ACOMMAND__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAUSE__TARGETS = ACOMMAND__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAUSE__REFERENCE = ACOMMAND__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAUSE__GROUP = ACOMMAND__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAUSE__SELECTED = ACOMMAND__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAUSE__ALL_SOURCES = ACOMMAND__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAUSE__ALL_TARGETS = ACOMMAND__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAUSE__ROOT_SELECTED = ACOMMAND__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Result</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAUSE__RESULT = ACOMMAND_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ACause</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACAUSE_FEATURE_COUNT = ACOMMAND_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ADiffuseImpl <em>ADiffuse</em>}' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.ADiffuseImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getADiffuse()
	 * @generated
	 */
	int ADIFFUSE = 43;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIFFUSE__LABEL = AROOT__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIFFUSE__ID = AROOT__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIFFUSE__SOURCES = AROOT__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIFFUSE__TARGETS = AROOT__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIFFUSE__REFERENCE = AROOT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIFFUSE__GROUP = AROOT__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIFFUSE__SELECTED = AROOT__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIFFUSE__ALL_SOURCES = AROOT__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIFFUSE__ALL_TARGETS = AROOT__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIFFUSE__ROOT_SELECTED = AROOT__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIFFUSE__AGENT = AROOT__AGENT;

	/**
	 * The feature id for the '<em><b>Space</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIFFUSE__SPACE = AROOT__SPACE;

	/**
	 * The feature id for the '<em><b>For</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIFFUSE__FOR = AROOT__FOR;

	/**
	 * The feature id for the '<em><b>Diffused</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIFFUSE__DIFFUSED = AROOT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diffusion Rate</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIFFUSE__DIFFUSION_RATE = AROOT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Evaporation Rate</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIFFUSE__EVAPORATION_RATE = AROOT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ADiffuse</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADIFFUSE_FEATURE_COUNT = AROOT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.APerformImpl <em>APerform</em>}' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.APerformImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAPerform()
	 * @generated
	 */
	int APERFORM = 44;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APERFORM__LABEL = AROOT__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APERFORM__ID = AROOT__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APERFORM__SOURCES = AROOT__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APERFORM__TARGETS = AROOT__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APERFORM__REFERENCE = AROOT__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APERFORM__GROUP = AROOT__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APERFORM__SELECTED = AROOT__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APERFORM__ALL_SOURCES = AROOT__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APERFORM__ALL_TARGETS = AROOT__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APERFORM__ROOT_SELECTED = AROOT__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APERFORM__AGENT = AROOT__AGENT;

	/**
	 * The feature id for the '<em><b>Space</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APERFORM__SPACE = AROOT__SPACE;

	/**
	 * The feature id for the '<em><b>For</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APERFORM__FOR = AROOT__FOR;

	/**
	 * The number of structural features of the '<em>APerform</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APERFORM_FEATURE_COUNT = AROOT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.metaabm.act.impl.ADeriveImpl <em>ADerive</em>}' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.metaabm.act.impl.ADeriveImpl
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getADerive()
	 * @generated
	 */
	int ADERIVE = 45;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADERIVE__LABEL = AACCESSOR__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADERIVE__ID = AACCESSOR__ID;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADERIVE__SOURCES = AACCESSOR__SOURCES;

	/**
	 * The feature id for the '<em><b>Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADERIVE__TARGETS = AACCESSOR__TARGETS;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADERIVE__REFERENCE = AACCESSOR__REFERENCE;

	/**
	 * The feature id for the '<em><b>Group</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADERIVE__GROUP = AACCESSOR__GROUP;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADERIVE__SELECTED = AACCESSOR__SELECTED;

	/**
	 * The feature id for the '<em><b>All Sources</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADERIVE__ALL_SOURCES = AACCESSOR__ALL_SOURCES;

	/**
	 * The feature id for the '<em><b>All Targets</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADERIVE__ALL_TARGETS = AACCESSOR__ALL_TARGETS;

	/**
	 * The feature id for the '<em><b>Root Selected</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADERIVE__ROOT_SELECTED = AACCESSOR__ROOT_SELECTED;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADERIVE__ATTRIBUTE = AACCESSOR__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADERIVE__AGENT = AACCESSOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Space</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADERIVE__SPACE = AACCESSOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>For</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADERIVE__FOR = AACCESSOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>ADerive</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADERIVE_FEATURE_COUNT = AACCESSOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.metaabm.act.ABuildSpaceTypes <em>ABuild Space Types</em>}' enum. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.act.ABuildSpaceTypes
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getABuildSpaceTypes()
	 * @generated
	 */
	int ABUILD_SPACE_TYPES = 46;

	/**
	 * The meta object id for the '{@link org.metaabm.act.ABuildNetworkTypes <em>ABuild Network Types</em>}' enum. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.act.ABuildNetworkTypes
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getABuildNetworkTypes()
	 * @generated
	 */
	int ABUILD_NETWORK_TYPES = 47;

	/**
	 * The meta object id for the '{@link org.metaabm.act.ASelectTypes <em>ASelect Types</em>}' enum.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.metaabm.act.ASelectTypes
	 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getASelectTypes()
	 * @generated
	 */
	int ASELECT_TYPES = 48;

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.AAct <em>AAct</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>AAct</em>'.
	 * @see org.metaabm.act.AAct
	 * @generated
	 */
	EClass getAAct();

	/**
	 * Returns the meta object for the reference list ' {@link org.metaabm.act.AAct#getSources <em>Sources</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Sources</em>'.
	 * @see org.metaabm.act.AAct#getSources()
	 * @see #getAAct()
	 * @generated
	 */
	EReference getAAct_Sources();

	/**
	 * Returns the meta object for the reference list ' {@link org.metaabm.act.AAct#getTargets <em>Targets</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Targets</em>'.
	 * @see org.metaabm.act.AAct#getTargets()
	 * @see #getAAct()
	 * @generated
	 */
	EReference getAAct_Targets();

	/**
	 * Returns the meta object for the reference ' {@link org.metaabm.act.AAct#getReference <em>Reference</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see org.metaabm.act.AAct#getReference()
	 * @see #getAAct()
	 * @generated
	 */
	EReference getAAct_Reference();

	/**
	 * Returns the meta object for the container reference ' {@link org.metaabm.act.AAct#getGroup <em>Group</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Group</em>'.
	 * @see org.metaabm.act.AAct#getGroup()
	 * @see #getAAct()
	 * @generated
	 */
	EReference getAAct_Group();

	/**
	 * Returns the meta object for the reference ' {@link org.metaabm.act.AAct#getSelected <em>Selected</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Selected</em>'.
	 * @see org.metaabm.act.AAct#getSelected()
	 * @see #getAAct()
	 * @generated
	 */
	EReference getAAct_Selected();

	/**
	 * Returns the meta object for the reference list '{@link org.metaabm.act.AAct#getAllSources <em>All Sources</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Sources</em>'.
	 * @see org.metaabm.act.AAct#getAllSources()
	 * @see #getAAct()
	 * @generated
	 */
	EReference getAAct_AllSources();

	/**
	 * Returns the meta object for the reference list '{@link org.metaabm.act.AAct#getAllTargets <em>All Targets</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Targets</em>'.
	 * @see org.metaabm.act.AAct#getAllTargets()
	 * @see #getAAct()
	 * @generated
	 */
	EReference getAAct_AllTargets();

	/**
	 * Returns the meta object for the reference '{@link org.metaabm.act.AAct#getRootSelected <em>Root Selected</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Root Selected</em>'.
	 * @see org.metaabm.act.AAct#getRootSelected()
	 * @see #getAAct()
	 * @generated
	 */
	EReference getAAct_RootSelected();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.AControl <em>AControl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AControl</em>'.
	 * @see org.metaabm.act.AControl
	 * @generated
	 */
	EClass getAControl();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ARoot <em>ARoot</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>ARoot</em>'.
	 * @see org.metaabm.act.ARoot
	 * @generated
	 */
	EClass getARoot();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.AGroup <em>AGroup</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>AGroup</em>'.
	 * @see org.metaabm.act.AGroup
	 * @generated
	 */
	EClass getAGroup();

	/**
	 * Returns the meta object for the reference list ' {@link org.metaabm.act.AGroup#getRoots <em>Roots</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Roots</em>'.
	 * @see org.metaabm.act.AGroup#getRoots()
	 * @see #getAGroup()
	 * @generated
	 */
	EReference getAGroup_Roots();

	/**
	 * Returns the meta object for the containment reference list '{@link org.metaabm.act.AGroup#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.metaabm.act.AGroup#getMembers()
	 * @see #getAGroup()
	 * @generated
	 */
	EReference getAGroup_Members();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ASchedule <em>ASchedule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ASchedule</em>'.
	 * @see org.metaabm.act.ASchedule
	 * @generated
	 */
	EClass getASchedule();

	/**
	 * Returns the meta object for the attribute ' {@link org.metaabm.act.ASchedule#getStart <em>Start</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Start</em>'.
	 * @see org.metaabm.act.ASchedule#getStart()
	 * @see #getASchedule()
	 * @generated
	 */
	EAttribute getASchedule_Start();

	/**
	 * Returns the meta object for the attribute ' {@link org.metaabm.act.ASchedule#getInterval <em>Interval</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Interval</em>'.
	 * @see org.metaabm.act.ASchedule#getInterval()
	 * @see #getASchedule()
	 * @generated
	 */
	EAttribute getASchedule_Interval();

	/**
	 * Returns the meta object for the attribute ' {@link org.metaabm.act.ASchedule#getPriority <em>Priority</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see org.metaabm.act.ASchedule#getPriority()
	 * @see #getASchedule()
	 * @generated
	 */
	EAttribute getASchedule_Priority();

	/**
	 * Returns the meta object for the attribute ' {@link org.metaabm.act.ASchedule#getPick <em>Pick</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Pick</em>'.
	 * @see org.metaabm.act.ASchedule#getPick()
	 * @see #getASchedule()
	 * @generated
	 */
	EAttribute getASchedule_Pick();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ABuild <em>ABuild</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>ABuild</em>'.
	 * @see org.metaabm.act.ABuild
	 * @generated
	 */
	EClass getABuild();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.AInitialize <em>AInitialize</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>AInitialize</em>'.
	 * @see org.metaabm.act.AInitialize
	 * @generated
	 */
	EClass getAInitialize();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ARule <em>ARule</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>ARule</em>'.
	 * @see org.metaabm.act.ARule
	 * @generated
	 */
	EClass getARule();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.AMethod <em>AMethod</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>AMethod</em>'.
	 * @see org.metaabm.act.AMethod
	 * @generated
	 */
	EClass getAMethod();

	/**
	 * Returns the meta object for the attribute ' {@link org.metaabm.act.AMethod#getBody <em>Body</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.metaabm.act.AMethod#getBody()
	 * @see #getAMethod()
	 * @generated
	 */
	EAttribute getAMethod_Body();

	/**
	 * Returns the meta object for the attribute ' {@link org.metaabm.act.AMethod#isGenerate <em>Generate</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Generate</em>'.
	 * @see org.metaabm.act.AMethod#isGenerate()
	 * @see #getAMethod()
	 * @generated
	 */
	EAttribute getAMethod_Generate();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ASink <em>ASink</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>ASink</em>'.
	 * @see org.metaabm.act.ASink
	 * @generated
	 */
	EClass getASink();

	/**
	 * Returns the meta object for the containment reference list '{@link org.metaabm.act.ASink#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see org.metaabm.act.ASink#getInputs()
	 * @see #getASink()
	 * @generated
	 */
	EReference getASink_Inputs();

	/**
	 * Returns the meta object for the reference ' {@link org.metaabm.act.ASink#getFunction <em>Function</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Function</em>'.
	 * @see org.metaabm.act.ASink#getFunction()
	 * @see #getASink()
	 * @generated
	 */
	EReference getASink_Function();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ALogic <em>ALogic</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>ALogic</em>'.
	 * @see org.metaabm.act.ALogic
	 * @generated
	 */
	EClass getALogic();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.AAny <em>AAny</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>AAny</em>'.
	 * @see org.metaabm.act.AAny
	 * @generated
	 */
	EClass getAAny();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.AAll <em>AAll</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>AAll</em>'.
	 * @see org.metaabm.act.AAll
	 * @generated
	 */
	EClass getAAll();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ANone <em>ANone</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>ANone</em>'.
	 * @see org.metaabm.act.ANone
	 * @generated
	 */
	EClass getANone();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.AQuery <em>AQuery</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>AQuery</em>'.
	 * @see org.metaabm.act.AQuery
	 * @generated
	 */
	EClass getAQuery();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.AEvaluate <em>AEvaluate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AEvaluate</em>'.
	 * @see org.metaabm.act.AEvaluate
	 * @generated
	 */
	EClass getAEvaluate();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.AAccessor <em>AAccessor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AAccessor</em>'.
	 * @see org.metaabm.act.AAccessor
	 * @generated
	 */
	EClass getAAccessor();

	/**
	 * Returns the meta object for the reference '{@link org.metaabm.act.AAccessor#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Attribute</em>'.
	 * @see org.metaabm.act.AAccessor#getAttribute()
	 * @see #getAAccessor()
	 * @generated
	 */
	EReference getAAccessor_Attribute();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.AWatch <em>AWatch</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>AWatch</em>'.
	 * @see org.metaabm.act.AWatch
	 * @generated
	 */
	EClass getAWatch();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ASet <em>ASet</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>ASet</em>'.
	 * @see org.metaabm.act.ASet
	 * @generated
	 */
	EClass getASet();

	/**
	 * Returns the meta object for the reference ' {@link org.metaabm.act.ASet#getParameter <em>Parameter</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Parameter</em>'.
	 * @see org.metaabm.act.ASet#getParameter()
	 * @see #getASet()
	 * @generated
	 */
	EReference getASet_Parameter();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ACreateAgents <em>ACreate Agents</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>ACreate Agents</em>'.
	 * @see org.metaabm.act.ACreateAgents
	 * @generated
	 */
	EClass getACreateAgents();

	/**
	 * Returns the meta object for the reference '{@link org.metaabm.act.ACreateAgents#getAgentCount <em>Agent Count</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Agent Count</em>'.
	 * @see org.metaabm.act.ACreateAgents#getAgentCount()
	 * @see #getACreateAgents()
	 * @generated
	 */
	EReference getACreateAgents_AgentCount();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ABuildProjection <em>ABuild Projection</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>ABuild Projection</em>'.
	 * @see org.metaabm.act.ABuildProjection
	 * @generated
	 */
	EClass getABuildProjection();

	/**
	 * Returns the meta object for the reference list '{@link org.metaabm.act.ABuildProjection#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agents</em>'.
	 * @see org.metaabm.act.ABuildProjection#getAgents()
	 * @see #getABuildProjection()
	 * @generated
	 */
	EReference getABuildProjection_Agents();

	/**
	 * Returns the meta object for the reference '{@link org.metaabm.act.ABuildProjection#getProjection <em>Projection</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Projection</em>'.
	 * @see org.metaabm.act.ABuildProjection#getProjection()
	 * @see #getABuildProjection()
	 * @generated
	 */
	EReference getABuildProjection_Projection();

	/**
	 * Returns the meta object for the reference list '{@link org.metaabm.act.ABuildProjection#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see org.metaabm.act.ABuildProjection#getAttributes()
	 * @see #getABuildProjection()
	 * @generated
	 */
	EReference getABuildProjection_Attributes();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ABuildNetwork <em>ABuild Network</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>ABuild Network</em>'.
	 * @see org.metaabm.act.ABuildNetwork
	 * @generated
	 */
	EClass getABuildNetwork();

	/**
	 * Returns the meta object for the attribute '{@link org.metaabm.act.ABuildNetwork#getNetworkType <em>Network Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Network Type</em>'.
	 * @see org.metaabm.act.ABuildNetwork#getNetworkType()
	 * @see #getABuildNetwork()
	 * @generated
	 */
	EAttribute getABuildNetwork_NetworkType();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ABuildSpace <em>ABuild Space</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>ABuild Space</em>'.
	 * @see org.metaabm.act.ABuildSpace
	 * @generated
	 */
	EClass getABuildSpace();

	/**
	 * Returns the meta object for the attribute '{@link org.metaabm.act.ABuildSpace#getSpaceType <em>Space Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space Type</em>'.
	 * @see org.metaabm.act.ABuildSpace#getSpaceType()
	 * @see #getABuildSpace()
	 * @generated
	 */
	EAttribute getABuildSpace_SpaceType();

	/**
	 * Returns the meta object for class ' {@link org.metaabm.act.ABuildGeography <em>ABuild Geography</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>ABuild Geography</em>'.
	 * @see org.metaabm.act.ABuildGeography
	 * @generated
	 */
	EClass getABuildGeography();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ABuildGrid <em>ABuild Grid</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>ABuild Grid</em>'.
	 * @see org.metaabm.act.ABuildGrid
	 * @generated
	 */
	EClass getABuildGrid();

	/**
	 * Returns the meta object for the reference '{@link org.metaabm.act.ABuildGrid#getFillAgent <em>Fill Agent</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fill Agent</em>'.
	 * @see org.metaabm.act.ABuildGrid#getFillAgent()
	 * @see #getABuildGrid()
	 * @generated
	 */
	EReference getABuildGrid_FillAgent();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ASelect <em>ASelect</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>ASelect</em>'.
	 * @see org.metaabm.act.ASelect
	 * @generated
	 */
	EClass getASelect();

	/**
	 * Returns the meta object for the reference ' {@link org.metaabm.act.ASelect#getAgent <em>Agent</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Agent</em>'.
	 * @see org.metaabm.act.ASelect#getAgent()
	 * @see #getASelect()
	 * @generated
	 */
	EReference getASelect_Agent();

	/**
	 * Returns the meta object for the reference ' {@link org.metaabm.act.ASelect#getSpace <em>Space</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Space</em>'.
	 * @see org.metaabm.act.ASelect#getSpace()
	 * @see #getASelect()
	 * @generated
	 */
	EReference getASelect_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.metaabm.act.ASelect#getFor <em>For</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>For</em>'.
	 * @see org.metaabm.act.ASelect#getFor()
	 * @see #getASelect()
	 * @generated
	 */
	EAttribute getASelect_For();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.AMove <em>AMove</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>AMove</em>'.
	 * @see org.metaabm.act.AMove
	 * @generated
	 */
	EClass getAMove();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ATransform <em>ATransform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ATransform</em>'.
	 * @see org.metaabm.act.ATransform
	 * @generated
	 */
	EClass getATransform();

	/**
	 * Returns the meta object for the reference '{@link org.metaabm.act.ATransform#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see org.metaabm.act.ATransform#getDestination()
	 * @see #getATransform()
	 * @generated
	 */
	EReference getATransform_Destination();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ALeave <em>ALeave</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>ALeave</em>'.
	 * @see org.metaabm.act.ALeave
	 * @generated
	 */
	EClass getALeave();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ADie <em>ADie</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>ADie</em>'.
	 * @see org.metaabm.act.ADie
	 * @generated
	 */
	EClass getADie();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.AConnect <em>AConnect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AConnect</em>'.
	 * @see org.metaabm.act.AConnect
	 * @generated
	 */
	EClass getAConnect();

	/**
	 * Returns the meta object for the attribute ' {@link org.metaabm.act.AConnect#isDirected <em>Directed</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Directed</em>'.
	 * @see org.metaabm.act.AConnect#isDirected()
	 * @see #getAConnect()
	 * @generated
	 */
	EAttribute getAConnect_Directed();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ANetwork <em>ANetwork</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ANetwork</em>'.
	 * @see org.metaabm.act.ANetwork
	 * @generated
	 */
	EClass getANetwork();

	/**
	 * Returns the meta object for the reference ' {@link org.metaabm.act.ANetwork#getWithin <em>Within</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Within</em>'.
	 * @see org.metaabm.act.ANetwork#getWithin()
	 * @see #getANetwork()
	 * @generated
	 */
	EReference getANetwork_Within();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ADisconnect <em>ADisconnect</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>ADisconnect</em>'.
	 * @see org.metaabm.act.ADisconnect
	 * @generated
	 */
	EClass getADisconnect();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.AReplace <em>AReplace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AReplace</em>'.
	 * @see org.metaabm.act.AReplace
	 * @generated
	 */
	EClass getAReplace();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ACommand <em>ACommand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ACommand</em>'.
	 * @see org.metaabm.act.ACommand
	 * @generated
	 */
	EClass getACommand();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ACause <em>ACause</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>ACause</em>'.
	 * @see org.metaabm.act.ACause
	 * @generated
	 */
	EClass getACause();

	/**
	 * Returns the meta object for the reference '{@link org.metaabm.act.ACause#getResult <em>Result</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Result</em>'.
	 * @see org.metaabm.act.ACause#getResult()
	 * @see #getACause()
	 * @generated
	 */
	EReference getACause_Result();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ADiffuse <em>ADiffuse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ADiffuse</em>'.
	 * @see org.metaabm.act.ADiffuse
	 * @generated
	 */
	EClass getADiffuse();

	/**
	 * Returns the meta object for the reference ' {@link org.metaabm.act.ADiffuse#getDiffused <em>Diffused</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Diffused</em>'.
	 * @see org.metaabm.act.ADiffuse#getDiffused()
	 * @see #getADiffuse()
	 * @generated
	 */
	EReference getADiffuse_Diffused();

	/**
	 * Returns the meta object for the reference '{@link org.metaabm.act.ADiffuse#getDiffusionRate <em>Diffusion Rate</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diffusion Rate</em>'.
	 * @see org.metaabm.act.ADiffuse#getDiffusionRate()
	 * @see #getADiffuse()
	 * @generated
	 */
	EReference getADiffuse_DiffusionRate();

	/**
	 * Returns the meta object for the reference '{@link org.metaabm.act.ADiffuse#getEvaporationRate <em>Evaporation Rate</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evaporation Rate</em>'.
	 * @see org.metaabm.act.ADiffuse#getEvaporationRate()
	 * @see #getADiffuse()
	 * @generated
	 */
	EReference getADiffuse_EvaporationRate();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.APerform <em>APerform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>APerform</em>'.
	 * @see org.metaabm.act.APerform
	 * @generated
	 */
	EClass getAPerform();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ADerive <em>ADerive</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>ADerive</em>'.
	 * @see org.metaabm.act.ADerive
	 * @generated
	 */
	EClass getADerive();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.AShaped <em>AShaped</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>AShaped</em>'.
	 * @see org.metaabm.act.AShaped
	 * @generated
	 */
	EClass getAShaped();

	/**
	 * Returns the meta object for the attribute ' {@link org.metaabm.act.AShaped#getShape <em>Shape</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see org.metaabm.act.AShaped#getShape()
	 * @see #getAShaped()
	 * @generated
	 */
	EAttribute getAShaped_Shape();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ALoadShapedAgents <em>ALoad Shaped Agents</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>ALoad Shaped Agents</em>'.
	 * @see org.metaabm.act.ALoadShapedAgents
	 * @generated
	 */
	EClass getALoadShapedAgents();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ACreateShapedAgents <em>ACreate Shaped Agents</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>ACreate Shaped Agents</em>'.
	 * @see org.metaabm.act.ACreateShapedAgents
	 * @generated
	 */
	EClass getACreateShapedAgents();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ALoadAgents <em>ALoad Agents</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALoad Agents</em>'.
	 * @see org.metaabm.act.ALoadAgents
	 * @generated
	 */
	EClass getALoadAgents();

	/**
	 * Returns the meta object for the attribute '{@link org.metaabm.act.ALoadAgents#getSourceURL <em>Source URL</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source URL</em>'.
	 * @see org.metaabm.act.ALoadAgents#getSourceURL()
	 * @see #getALoadAgents()
	 * @generated
	 */
	EAttribute getALoadAgents_SourceURL();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.AInput <em>AInput</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>AInput</em>'.
	 * @see org.metaabm.act.AInput
	 * @generated
	 */
	EClass getAInput();

	/**
	 * Returns the meta object for the container reference ' {@link org.metaabm.act.AInput#getSink <em>Sink</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Sink</em>'.
	 * @see org.metaabm.act.AInput#getSink()
	 * @see #getAInput()
	 * @generated
	 */
	EReference getAInput_Sink();

	/**
	 * Returns the meta object for the reference ' {@link org.metaabm.act.AInput#getSelected <em>Selected</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Selected</em>'.
	 * @see org.metaabm.act.AInput#getSelected()
	 * @see #getAInput()
	 * @generated
	 */
	EReference getAInput_Selected();

	/**
	 * Returns the meta object for the containment reference '{@link org.metaabm.act.AInput#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Literal</em>'.
	 * @see org.metaabm.act.AInput#getLiteral()
	 * @see #getAInput()
	 * @generated
	 */
	EReference getAInput_Literal();

	/**
	 * Returns the meta object for the reference ' {@link org.metaabm.act.AInput#getValue <em>Value</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Value</em>'.
	 * @see org.metaabm.act.AInput#getValue()
	 * @see #getAInput()
	 * @generated
	 */
	EReference getAInput_Value();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.ALiteral <em>ALiteral</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ALiteral</em>'.
	 * @see org.metaabm.act.ALiteral
	 * @generated
	 */
	EClass getALiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.metaabm.act.ALiteral#getValueLiteral <em>Value Literal</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Literal</em>'.
	 * @see org.metaabm.act.ALiteral#getValueLiteral()
	 * @see #getALiteral()
	 * @generated
	 */
	EAttribute getALiteral_ValueLiteral();

	/**
	 * Returns the meta object for class '{@link org.metaabm.act.AMultiValue <em>AMulti Value</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>AMulti Value</em>'.
	 * @see org.metaabm.act.AMultiValue
	 * @generated
	 */
	EClass getAMultiValue();

	/**
	 * Returns the meta object for the reference list '{@link org.metaabm.act.AMultiValue#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Values</em>'.
	 * @see org.metaabm.act.AMultiValue#getValues()
	 * @see #getAMultiValue()
	 * @generated
	 */
	EReference getAMultiValue_Values();

	/**
	 * Returns the meta object for enum '{@link org.metaabm.act.ABuildSpaceTypes <em>ABuild Space Types</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>ABuild Space Types</em>'.
	 * @see org.metaabm.act.ABuildSpaceTypes
	 * @generated
	 */
	EEnum getABuildSpaceTypes();

	/**
	 * Returns the meta object for enum '{@link org.metaabm.act.ABuildNetworkTypes <em>ABuild Network Types</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>ABuild Network Types</em>'.
	 * @see org.metaabm.act.ABuildNetworkTypes
	 * @generated
	 */
	EEnum getABuildNetworkTypes();

	/**
	 * Returns the meta object for enum '{@link org.metaabm.act.ASelectTypes <em>ASelect Types</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>ASelect Types</em>'.
	 * @see org.metaabm.act.ASelectTypes
	 * @generated
	 */
	EEnum getASelectTypes();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetaABMActFactory getMetaABMActFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.AActImpl <em>AAct</em>}' class.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.metaabm.act.impl.AActImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAAct()
		 * @generated
		 */
		EClass AACT = eINSTANCE.getAAct();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AACT__SOURCES = eINSTANCE.getAAct_Sources();

		/**
		 * The meta object literal for the '<em><b>Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AACT__TARGETS = eINSTANCE.getAAct_Targets();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AACT__REFERENCE = eINSTANCE.getAAct_Reference();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' container reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AACT__GROUP = eINSTANCE.getAAct_Group();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AACT__SELECTED = eINSTANCE.getAAct_Selected();

		/**
		 * The meta object literal for the '<em><b>All Sources</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AACT__ALL_SOURCES = eINSTANCE.getAAct_AllSources();

		/**
		 * The meta object literal for the '<em><b>All Targets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AACT__ALL_TARGETS = eINSTANCE.getAAct_AllTargets();

		/**
		 * The meta object literal for the '<em><b>Root Selected</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AACT__ROOT_SELECTED = eINSTANCE.getAAct_RootSelected();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.AControl <em>AControl</em>}' class.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.metaabm.act.AControl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAControl()
		 * @generated
		 */
		EClass ACONTROL = eINSTANCE.getAControl();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.ARoot <em>ARoot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.metaabm.act.ARoot
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getARoot()
		 * @generated
		 */
		EClass AROOT = eINSTANCE.getARoot();

		/**
		 * The meta object literal for the ' {@link org.metaabm.act.impl.AGroupImpl <em>AGroup</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.AGroupImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAGroup()
		 * @generated
		 */
		EClass AGROUP = eINSTANCE.getAGroup();

		/**
		 * The meta object literal for the '<em><b>Roots</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AGROUP__ROOTS = eINSTANCE.getAGroup_Roots();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGROUP__MEMBERS = eINSTANCE.getAGroup_Members();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.AScheduleImpl <em>ASchedule</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.AScheduleImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getASchedule()
		 * @generated
		 */
		EClass ASCHEDULE = eINSTANCE.getASchedule();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute ASCHEDULE__START = eINSTANCE.getASchedule_Start();

		/**
		 * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute ASCHEDULE__INTERVAL = eINSTANCE.getASchedule_Interval();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute ASCHEDULE__PRIORITY = eINSTANCE.getASchedule_Priority();

		/**
		 * The meta object literal for the '<em><b>Pick</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute ASCHEDULE__PICK = eINSTANCE.getASchedule_Pick();

		/**
		 * The meta object literal for the ' {@link org.metaabm.act.impl.ABuildImpl <em>ABuild</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.ABuildImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getABuild()
		 * @generated
		 */
		EClass ABUILD = eINSTANCE.getABuild();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.AInitializeImpl <em>AInitialize</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.AInitializeImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAInitialize()
		 * @generated
		 */
		EClass AINITIALIZE = eINSTANCE.getAInitialize();

		/**
		 * The meta object literal for the ' {@link org.metaabm.act.impl.ARuleImpl <em>ARule</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.ARuleImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getARule()
		 * @generated
		 */
		EClass ARULE = eINSTANCE.getARule();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.AMethodImpl <em>AMethod</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.AMethodImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAMethod()
		 * @generated
		 */
		EClass AMETHOD = eINSTANCE.getAMethod();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute AMETHOD__BODY = eINSTANCE.getAMethod_Body();

		/**
		 * The meta object literal for the '<em><b>Generate</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute AMETHOD__GENERATE = eINSTANCE.getAMethod_Generate();

		/**
		 * The meta object literal for the ' {@link org.metaabm.act.impl.ASinkImpl <em>ASink</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.ASinkImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getASink()
		 * @generated
		 */
		EClass ASINK = eINSTANCE.getASink();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASINK__INPUTS = eINSTANCE.getASink_Inputs();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ASINK__FUNCTION = eINSTANCE.getASink_Function();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.ALogic <em>ALogic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.metaabm.act.ALogic
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getALogic()
		 * @generated
		 */
		EClass ALOGIC = eINSTANCE.getALogic();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.AAnyImpl <em>AAny</em>}' class.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.metaabm.act.impl.AAnyImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAAny()
		 * @generated
		 */
		EClass AANY = eINSTANCE.getAAny();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.AAllImpl <em>AAll</em>}' class.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.metaabm.act.impl.AAllImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAAll()
		 * @generated
		 */
		EClass AALL = eINSTANCE.getAAll();

		/**
		 * The meta object literal for the ' {@link org.metaabm.act.impl.ANoneImpl <em>ANone</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.ANoneImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getANone()
		 * @generated
		 */
		EClass ANONE = eINSTANCE.getANone();

		/**
		 * The meta object literal for the ' {@link org.metaabm.act.impl.AQueryImpl <em>AQuery</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.AQueryImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAQuery()
		 * @generated
		 */
		EClass AQUERY = eINSTANCE.getAQuery();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.AEvaluateImpl <em>AEvaluate</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.AEvaluateImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAEvaluate()
		 * @generated
		 */
		EClass AEVALUATE = eINSTANCE.getAEvaluate();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.AAccessorImpl <em>AAccessor</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.AAccessorImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAAccessor()
		 * @generated
		 */
		EClass AACCESSOR = eINSTANCE.getAAccessor();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AACCESSOR__ATTRIBUTE = eINSTANCE.getAAccessor_Attribute();

		/**
		 * The meta object literal for the ' {@link org.metaabm.act.impl.AWatchImpl <em>AWatch</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.AWatchImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAWatch()
		 * @generated
		 */
		EClass AWATCH = eINSTANCE.getAWatch();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.ASetImpl <em>ASet</em>}' class.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.metaabm.act.impl.ASetImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getASet()
		 * @generated
		 */
		EClass ASET = eINSTANCE.getASet();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ASET__PARAMETER = eINSTANCE.getASet_Parameter();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.ACreateAgentsImpl <em>ACreate Agents</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.metaabm.act.impl.ACreateAgentsImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getACreateAgents()
		 * @generated
		 */
		EClass ACREATE_AGENTS = eINSTANCE.getACreateAgents();

		/**
		 * The meta object literal for the '<em><b>Agent Count</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ACREATE_AGENTS__AGENT_COUNT = eINSTANCE.getACreateAgents_AgentCount();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.ABuildProjectionImpl <em>ABuild Projection</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.metaabm.act.impl.ABuildProjectionImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getABuildProjection()
		 * @generated
		 */
		EClass ABUILD_PROJECTION = eINSTANCE.getABuildProjection();

		/**
		 * The meta object literal for the '<em><b>Agents</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ABUILD_PROJECTION__AGENTS = eINSTANCE.getABuildProjection_Agents();

		/**
		 * The meta object literal for the '<em><b>Projection</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ABUILD_PROJECTION__PROJECTION = eINSTANCE.getABuildProjection_Projection();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ABUILD_PROJECTION__ATTRIBUTES = eINSTANCE.getABuildProjection_Attributes();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.ABuildNetworkImpl <em>ABuild Network</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.metaabm.act.impl.ABuildNetworkImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getABuildNetwork()
		 * @generated
		 */
		EClass ABUILD_NETWORK = eINSTANCE.getABuildNetwork();

		/**
		 * The meta object literal for the '<em><b>Network Type</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute ABUILD_NETWORK__NETWORK_TYPE = eINSTANCE.getABuildNetwork_NetworkType();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.ABuildSpaceImpl <em>ABuild Space</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.ABuildSpaceImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getABuildSpace()
		 * @generated
		 */
		EClass ABUILD_SPACE = eINSTANCE.getABuildSpace();

		/**
		 * The meta object literal for the '<em><b>Space Type</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute ABUILD_SPACE__SPACE_TYPE = eINSTANCE.getABuildSpace_SpaceType();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.ABuildGeographyImpl <em>ABuild Geography</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.metaabm.act.impl.ABuildGeographyImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getABuildGeography()
		 * @generated
		 */
		EClass ABUILD_GEOGRAPHY = eINSTANCE.getABuildGeography();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.ABuildGridImpl <em>ABuild Grid</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.ABuildGridImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getABuildGrid()
		 * @generated
		 */
		EClass ABUILD_GRID = eINSTANCE.getABuildGrid();

		/**
		 * The meta object literal for the '<em><b>Fill Agent</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ABUILD_GRID__FILL_AGENT = eINSTANCE.getABuildGrid_FillAgent();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.ASelectImpl <em>ASelect</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.ASelectImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getASelect()
		 * @generated
		 */
		EClass ASELECT = eINSTANCE.getASelect();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ASELECT__AGENT = eINSTANCE.getASelect_Agent();

		/**
		 * The meta object literal for the '<em><b>Space</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ASELECT__SPACE = eINSTANCE.getASelect_Space();

		/**
		 * The meta object literal for the '<em><b>For</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute ASELECT__FOR = eINSTANCE.getASelect_For();

		/**
		 * The meta object literal for the ' {@link org.metaabm.act.impl.AMoveImpl <em>AMove</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.AMoveImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAMove()
		 * @generated
		 */
		EClass AMOVE = eINSTANCE.getAMove();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.ATransformImpl <em>ATransform</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.ATransformImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getATransform()
		 * @generated
		 */
		EClass ATRANSFORM = eINSTANCE.getATransform();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ATRANSFORM__DESTINATION = eINSTANCE.getATransform_Destination();

		/**
		 * The meta object literal for the ' {@link org.metaabm.act.impl.ALeaveImpl <em>ALeave</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.ALeaveImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getALeave()
		 * @generated
		 */
		EClass ALEAVE = eINSTANCE.getALeave();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.ADieImpl <em>ADie</em>}' class.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.metaabm.act.impl.ADieImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getADie()
		 * @generated
		 */
		EClass ADIE = eINSTANCE.getADie();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.AConnectImpl <em>AConnect</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.AConnectImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAConnect()
		 * @generated
		 */
		EClass ACONNECT = eINSTANCE.getAConnect();

		/**
		 * The meta object literal for the '<em><b>Directed</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute ACONNECT__DIRECTED = eINSTANCE.getAConnect_Directed();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.ANetworkImpl <em>ANetwork</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.ANetworkImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getANetwork()
		 * @generated
		 */
		EClass ANETWORK = eINSTANCE.getANetwork();

		/**
		 * The meta object literal for the '<em><b>Within</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ANETWORK__WITHIN = eINSTANCE.getANetwork_Within();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.ADisconnectImpl <em>ADisconnect</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.ADisconnectImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getADisconnect()
		 * @generated
		 */
		EClass ADISCONNECT = eINSTANCE.getADisconnect();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.AReplaceImpl <em>AReplace</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.AReplaceImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAReplace()
		 * @generated
		 */
		EClass AREPLACE = eINSTANCE.getAReplace();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.ACommandImpl <em>ACommand</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.ACommandImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getACommand()
		 * @generated
		 */
		EClass ACOMMAND = eINSTANCE.getACommand();

		/**
		 * The meta object literal for the ' {@link org.metaabm.act.impl.ACauseImpl <em>ACause</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.ACauseImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getACause()
		 * @generated
		 */
		EClass ACAUSE = eINSTANCE.getACause();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ACAUSE__RESULT = eINSTANCE.getACause_Result();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.ADiffuseImpl <em>ADiffuse</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.ADiffuseImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getADiffuse()
		 * @generated
		 */
		EClass ADIFFUSE = eINSTANCE.getADiffuse();

		/**
		 * The meta object literal for the '<em><b>Diffused</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ADIFFUSE__DIFFUSED = eINSTANCE.getADiffuse_Diffused();

		/**
		 * The meta object literal for the '<em><b>Diffusion Rate</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference ADIFFUSE__DIFFUSION_RATE = eINSTANCE.getADiffuse_DiffusionRate();

		/**
		 * The meta object literal for the '<em><b>Evaporation Rate</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADIFFUSE__EVAPORATION_RATE = eINSTANCE.getADiffuse_EvaporationRate();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.APerformImpl <em>APerform</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.APerformImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAPerform()
		 * @generated
		 */
		EClass APERFORM = eINSTANCE.getAPerform();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.ADeriveImpl <em>ADerive</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.ADeriveImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getADerive()
		 * @generated
		 */
		EClass ADERIVE = eINSTANCE.getADerive();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.AShapedImpl <em>AShaped</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.AShapedImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAShaped()
		 * @generated
		 */
		EClass ASHAPED = eINSTANCE.getAShaped();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute ASHAPED__SHAPE = eINSTANCE.getAShaped_Shape();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.ALoadShapedAgentsImpl <em>ALoad Shaped Agents</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.metaabm.act.impl.ALoadShapedAgentsImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getALoadShapedAgents()
		 * @generated
		 */
		EClass ALOAD_SHAPED_AGENTS = eINSTANCE.getALoadShapedAgents();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.ACreateShapedAgentsImpl <em>ACreate Shaped Agents</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.metaabm.act.impl.ACreateShapedAgentsImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getACreateShapedAgents()
		 * @generated
		 */
		EClass ACREATE_SHAPED_AGENTS = eINSTANCE.getACreateShapedAgents();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.ALoadAgentsImpl <em>ALoad Agents</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.ALoadAgentsImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getALoadAgents()
		 * @generated
		 */
		EClass ALOAD_AGENTS = eINSTANCE.getALoadAgents();

		/**
		 * The meta object literal for the '<em><b>Source URL</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute ALOAD_AGENTS__SOURCE_URL = eINSTANCE.getALoadAgents_SourceURL();

		/**
		 * The meta object literal for the ' {@link org.metaabm.act.impl.AInputImpl <em>AInput</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.AInputImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAInput()
		 * @generated
		 */
		EClass AINPUT = eINSTANCE.getAInput();

		/**
		 * The meta object literal for the '<em><b>Sink</b></em>' container reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AINPUT__SINK = eINSTANCE.getAInput_Sink();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AINPUT__SELECTED = eINSTANCE.getAInput_Selected();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AINPUT__LITERAL = eINSTANCE.getAInput_Literal();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AINPUT__VALUE = eINSTANCE.getAInput_Value();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.ALiteralImpl <em>ALiteral</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.ALiteralImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getALiteral()
		 * @generated
		 */
		EClass ALITERAL = eINSTANCE.getALiteral();

		/**
		 * The meta object literal for the '<em><b>Value Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute ALITERAL__VALUE_LITERAL = eINSTANCE.getALiteral_ValueLiteral();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.impl.AMultiValueImpl <em>AMulti Value</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.impl.AMultiValueImpl
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getAMultiValue()
		 * @generated
		 */
		EClass AMULTI_VALUE = eINSTANCE.getAMultiValue();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference AMULTI_VALUE__VALUES = eINSTANCE.getAMultiValue_Values();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.ABuildSpaceTypes <em>ABuild Space Types</em>}' enum. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.ABuildSpaceTypes
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getABuildSpaceTypes()
		 * @generated
		 */
		EEnum ABUILD_SPACE_TYPES = eINSTANCE.getABuildSpaceTypes();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.ABuildNetworkTypes <em>ABuild Network Types</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.metaabm.act.ABuildNetworkTypes
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getABuildNetworkTypes()
		 * @generated
		 */
		EEnum ABUILD_NETWORK_TYPES = eINSTANCE.getABuildNetworkTypes();

		/**
		 * The meta object literal for the '{@link org.metaabm.act.ASelectTypes <em>ASelect Types</em>}' enum. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.act.ASelectTypes
		 * @see org.metaabm.act.impl.MetaABMActPackageImpl#getASelectTypes()
		 * @generated
		 */
		EEnum ASELECT_TYPES = eINSTANCE.getASelectTypes();

	}

} // MetaABMActPackage
