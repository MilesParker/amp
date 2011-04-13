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
package org.metaabm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.metaabm.MetaABMFactory
 * @model kind="package"
 * @generated
 */
public interface MetaABMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metaabm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://metaabm.org/structure";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metaabm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	MetaABMPackage eINSTANCE = org.metaabm.impl.MetaABMPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.metaabm.impl.IIDImpl <em>IID</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.metaabm.impl.IIDImpl
	 * @see org.metaabm.impl.MetaABMPackageImpl#getIID()
	 * @generated
	 */
	int IID = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IID__LABEL = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IID__ID = 1;

	/**
	 * The number of structural features of the '<em>IID</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IID_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.metaabm.ITyped <em>ITyped</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.metaabm.ITyped
	 * @see org.metaabm.impl.MetaABMPackageImpl#getITyped()
	 * @generated
	 */
	int ITYPED = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPED__LABEL = IID__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPED__ID = IID__ID;

	/**
	 * The feature id for the '<em><b>SType</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPED__STYPE = IID_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ITyped</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPED_FEATURE_COUNT = IID_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.metaabm.ITypedArray <em>ITyped Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.ITypedArray
	 * @see org.metaabm.impl.MetaABMPackageImpl#getITypedArray()
	 * @generated
	 */
	int ITYPED_ARRAY = 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPED_ARRAY__LABEL = ITYPED__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPED_ARRAY__ID = ITYPED__ID;

	/**
	 * The feature id for the '<em><b>SType</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPED_ARRAY__STYPE = ITYPED__STYPE;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPED_ARRAY__SIZE = ITYPED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>ITyped Array</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ITYPED_ARRAY_FEATURE_COUNT = ITYPED_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.metaabm.IValue <em>IValue</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.metaabm.IValue
	 * @see org.metaabm.impl.MetaABMPackageImpl#getIValue()
	 * @generated
	 */
	int IVALUE = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVALUE__LABEL = IID__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVALUE__ID = IID__ID;

	/**
	 * The feature id for the '<em><b>Accessors</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVALUE__ACCESSORS = IID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Available Types</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IVALUE__AVAILABLE_TYPES = IID_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>IValue</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IVALUE_FEATURE_COUNT = IID_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.metaabm.IArtifact <em>IArtifact</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.metaabm.IArtifact
	 * @see org.metaabm.impl.MetaABMPackageImpl#getIArtifact()
	 * @generated
	 */
	int IARTIFACT = 4;

	/**
	 * The meta object id for the '{@link org.metaabm.IAct <em>IAct</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.metaabm.IAct
	 * @see org.metaabm.impl.MetaABMPackageImpl#getIAct()
	 * @generated
	 */
	int IACT = 5;

	/**
	 * The meta object id for the '{@link org.metaabm.impl.SNamedImpl <em>SNamed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.impl.SNamedImpl
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSNamed()
	 * @generated
	 */
	int SNAMED = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IARTIFACT__LABEL = IID__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IARTIFACT__ID = IID__ID;

	/**
	 * The number of structural features of the '<em>IArtifact</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IARTIFACT_FEATURE_COUNT = IID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IACT__LABEL = IID__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IACT__ID = IID__ID;

	/**
	 * The number of structural features of the '<em>IAct</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IACT_FEATURE_COUNT = IID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAMED__LABEL = IID__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAMED__ID = IID__ID;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAMED__PLURAL_LABEL = IID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAMED__DESCRIPTION = IID_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SNamed</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNAMED_FEATURE_COUNT = IID_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.metaabm.impl.SAttributedImpl <em>SAttributed</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.impl.SAttributedImpl
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSAttributed()
	 * @generated
	 */
	int SATTRIBUTED = 7;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTED__LABEL = SNAMED__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTED__ID = SNAMED__ID;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTED__PLURAL_LABEL = SNAMED__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTED__DESCRIPTION = SNAMED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTED__ATTRIBUTES = SNAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SAttributed</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTED_FEATURE_COUNT = SNAMED_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.metaabm.impl.SAttributeImpl <em>SAttribute</em>}' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.metaabm.impl.SAttributeImpl
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSAttribute()
	 * @generated
	 */
	int SATTRIBUTE = 9;

	/**
	 * The meta object id for the '{@link org.metaabm.impl.SAttributeArrayImpl <em>SAttribute Array</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.impl.SAttributeArrayImpl
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSAttributeArray()
	 * @generated
	 */
	int SATTRIBUTE_ARRAY = 10;

	/**
	 * The meta object id for the '{@link org.metaabm.impl.SActableImpl <em>SActable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.impl.SActableImpl
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSActable()
	 * @generated
	 */
	int SACTABLE = 8;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SACTABLE__LABEL = SATTRIBUTED__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SACTABLE__ID = SATTRIBUTED__ID;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SACTABLE__PLURAL_LABEL = SATTRIBUTED__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SACTABLE__DESCRIPTION = SATTRIBUTED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SACTABLE__ATTRIBUTES = SATTRIBUTED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Root Activity</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SACTABLE__ROOT_ACTIVITY = SATTRIBUTED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SActable</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SACTABLE_FEATURE_COUNT = SATTRIBUTED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE__LABEL = SNAMED__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE__ID = SNAMED__ID;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE__PLURAL_LABEL = SNAMED__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE__DESCRIPTION = SNAMED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Accessors</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE__ACCESSORS = SNAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Available Types</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE__AVAILABLE_TYPES = SNAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>SType</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE__STYPE = SNAMED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE__OWNER = SNAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Gather Data</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE__GATHER_DATA = SNAMED_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE__DEFAULT_VALUE = SNAMED_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE__UNITS = SNAMED_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE__IMMUTABLE = SNAMED_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE__DERIVED = SNAMED_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE__CHILDREN = SNAMED_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>SAttribute</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_FEATURE_COUNT = SNAMED_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_ARRAY__LABEL = SATTRIBUTE__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_ARRAY__ID = SATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_ARRAY__PLURAL_LABEL = SATTRIBUTE__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_ARRAY__DESCRIPTION = SATTRIBUTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Accessors</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_ARRAY__ACCESSORS = SATTRIBUTE__ACCESSORS;

	/**
	 * The feature id for the '<em><b>Available Types</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_ARRAY__AVAILABLE_TYPES = SATTRIBUTE__AVAILABLE_TYPES;

	/**
	 * The feature id for the '<em><b>SType</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_ARRAY__STYPE = SATTRIBUTE__STYPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_ARRAY__OWNER = SATTRIBUTE__OWNER;

	/**
	 * The feature id for the '<em><b>Gather Data</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_ARRAY__GATHER_DATA = SATTRIBUTE__GATHER_DATA;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_ARRAY__DEFAULT_VALUE = SATTRIBUTE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_ARRAY__UNITS = SATTRIBUTE__UNITS;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_ARRAY__IMMUTABLE = SATTRIBUTE__IMMUTABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_ARRAY__DERIVED = SATTRIBUTE__DERIVED;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_ARRAY__CHILDREN = SATTRIBUTE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_ARRAY__SIZE = SATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SAttribute Array</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SATTRIBUTE_ARRAY_FEATURE_COUNT = SATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.metaabm.impl.SAgentImpl <em>SAgent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.impl.SAgentImpl
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSAgent()
	 * @generated
	 */
	int SAGENT = 13;

	/**
	 * The meta object id for the '{@link org.metaabm.impl.SContextImpl <em>SContext</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.impl.SContextImpl
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSContext()
	 * @generated
	 */
	int SCONTEXT = 14;

	/**
	 * The meta object id for the '{@link org.metaabm.impl.SProjectionImpl <em>SProjection</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.impl.SProjectionImpl
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSProjection()
	 * @generated
	 */
	int SPROJECTION = 15;

	/**
	 * The meta object id for the '{@link org.metaabm.impl.SNDimensionalImpl <em>SN Dimensional</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.impl.SNDimensionalImpl
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSNDimensional()
	 * @generated
	 */
	int SN_DIMENSIONAL = 16;

	/**
	 * The meta object id for the '{@link org.metaabm.impl.SContinuousSpaceImpl <em>SContinuous Space</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.impl.SContinuousSpaceImpl
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSContinuousSpace()
	 * @generated
	 */
	int SCONTINUOUS_SPACE = 17;

	/**
	 * The meta object id for the '{@link org.metaabm.impl.SGridImpl <em>SGrid</em>}' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.metaabm.impl.SGridImpl
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSGrid()
	 * @generated
	 */
	int SGRID = 18;

	/**
	 * The meta object id for the '{@link org.metaabm.impl.SNetworkImpl <em>SNetwork</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.impl.SNetworkImpl
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSNetwork()
	 * @generated
	 */
	int SNETWORK = 19;

	/**
	 * The meta object id for the '{@link org.metaabm.impl.SGeographyImpl <em>SGeography</em>}' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.metaabm.impl.SGeographyImpl
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSGeography()
	 * @generated
	 */
	int SGEOGRAPHY = 20;

	/**
	 * The meta object id for the '{@link org.metaabm.impl.SValueLayerImpl <em>SValue Layer</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.impl.SValueLayerImpl
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSValueLayer()
	 * @generated
	 */
	int SVALUE_LAYER = 21;

	/**
	 * The meta object id for the '{@link org.metaabm.impl.SImplementedImpl <em>SImplemented</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.impl.SImplementedImpl
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSImplemented()
	 * @generated
	 */
	int SIMPLEMENTED = 26;

	/**
	 * The meta object id for the '{@link org.metaabm.impl.SStyleImpl <em>SStyle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.impl.SStyleImpl
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSStyle()
	 * @generated
	 */
	int SSTYLE = 22;

	/**
	 * The meta object id for the '{@link org.metaabm.impl.SStyle3DImpl <em>SStyle3 D</em>}' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.metaabm.impl.SStyle3DImpl
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSStyle3D()
	 * @generated
	 */
	int SSTYLE3_D = 25;

	/**
	 * The meta object id for the '{@link org.metaabm.impl.SStyle2DImpl <em>SStyle2 D</em>}' class.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.metaabm.impl.SStyle2DImpl
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSStyle2D()
	 * @generated
	 */
	int SSTYLE2_D = 23;

	/**
	 * The meta object id for the '{@link org.metaabm.impl.SImplementationImpl <em>SImplementation</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.impl.SImplementationImpl
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSImplementation()
	 * @generated
	 */
	int SIMPLEMENTATION = 27;

	/**
	 * The meta object id for the '{@link org.metaabm.impl.SStateImpl <em>SState</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.impl.SStateImpl
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSState()
	 * @generated
	 */
	int SSTATE = 11;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTATE__LABEL = SATTRIBUTE__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTATE__ID = SATTRIBUTE__ID;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTATE__PLURAL_LABEL = SATTRIBUTE__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTATE__DESCRIPTION = SATTRIBUTE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Accessors</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTATE__ACCESSORS = SATTRIBUTE__ACCESSORS;

	/**
	 * The feature id for the '<em><b>Available Types</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SSTATE__AVAILABLE_TYPES = SATTRIBUTE__AVAILABLE_TYPES;

	/**
	 * The feature id for the '<em><b>SType</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTATE__STYPE = SATTRIBUTE__STYPE;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTATE__OWNER = SATTRIBUTE__OWNER;

	/**
	 * The feature id for the '<em><b>Gather Data</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTATE__GATHER_DATA = SATTRIBUTE__GATHER_DATA;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTATE__DEFAULT_VALUE = SATTRIBUTE__DEFAULT_VALUE;

	/**
	 * The feature id for the '<em><b>Units</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTATE__UNITS = SATTRIBUTE__UNITS;

	/**
	 * The feature id for the '<em><b>Immutable</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTATE__IMMUTABLE = SATTRIBUTE__IMMUTABLE;

	/**
	 * The feature id for the '<em><b>Derived</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTATE__DERIVED = SATTRIBUTE__DERIVED;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTATE__CHILDREN = SATTRIBUTE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTATE__OPTIONS = SATTRIBUTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Option</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTATE__DEFAULT_OPTION = SATTRIBUTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SState</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTATE_FEATURE_COUNT = SATTRIBUTE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.metaabm.impl.SStateValueImpl <em>SState Value</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.impl.SStateValueImpl
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSStateValue()
	 * @generated
	 */
	int SSTATE_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTATE_VALUE__LABEL = SNAMED__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTATE_VALUE__ID = SNAMED__ID;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTATE_VALUE__PLURAL_LABEL = SNAMED__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTATE_VALUE__DESCRIPTION = SNAMED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Accessors</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTATE_VALUE__ACCESSORS = SNAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Available Types</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SSTATE_VALUE__AVAILABLE_TYPES = SNAMED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Set</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTATE_VALUE__SET = SNAMED_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SState Value</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SSTATE_VALUE_FEATURE_COUNT = SNAMED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGENT__LABEL = SACTABLE__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGENT__ID = SACTABLE__ID;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGENT__PLURAL_LABEL = SACTABLE__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGENT__DESCRIPTION = SACTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGENT__ATTRIBUTES = SACTABLE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Root Activity</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGENT__ROOT_ACTIVITY = SACTABLE__ROOT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGENT__IMPLEMENTATION = SACTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGENT__PARENT = SACTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGENT__STYLES = SACTABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGENT__OWNER = SACTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGENT__CHILDREN = SACTABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>SAgent</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAGENT_FEATURE_COUNT = SACTABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTEXT__LABEL = SAGENT__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTEXT__ID = SAGENT__ID;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTEXT__PLURAL_LABEL = SAGENT__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTEXT__DESCRIPTION = SAGENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTEXT__ATTRIBUTES = SAGENT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Root Activity</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTEXT__ROOT_ACTIVITY = SAGENT__ROOT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTEXT__IMPLEMENTATION = SAGENT__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTEXT__PARENT = SAGENT__PARENT;

	/**
	 * The feature id for the '<em><b>Styles</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTEXT__STYLES = SAGENT__STYLES;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTEXT__OWNER = SAGENT__OWNER;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTEXT__CHILDREN = SAGENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTEXT__AGENTS = SAGENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Projections</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTEXT__PROJECTIONS = SAGENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value Layers</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTEXT__VALUE_LAYERS = SAGENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Library</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTEXT__LIBRARY = SAGENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>All Agents</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTEXT__ALL_AGENTS = SAGENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>All Contexts</b></em>' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTEXT__ALL_CONTEXTS = SAGENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>SContext</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTEXT_FEATURE_COUNT = SAGENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPROJECTION__LABEL = SATTRIBUTED__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPROJECTION__ID = SATTRIBUTED__ID;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPROJECTION__PLURAL_LABEL = SATTRIBUTED__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPROJECTION__DESCRIPTION = SATTRIBUTED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPROJECTION__ATTRIBUTES = SATTRIBUTED__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPROJECTION__OWNER = SATTRIBUTED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SProjection</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SPROJECTION_FEATURE_COUNT = SATTRIBUTED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN_DIMENSIONAL__LABEL = SPROJECTION__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN_DIMENSIONAL__ID = SPROJECTION__ID;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN_DIMENSIONAL__PLURAL_LABEL = SPROJECTION__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN_DIMENSIONAL__DESCRIPTION = SPROJECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN_DIMENSIONAL__ATTRIBUTES = SPROJECTION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN_DIMENSIONAL__OWNER = SPROJECTION__OWNER;

	/**
	 * The feature id for the '<em><b>Dimensionality</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN_DIMENSIONAL__DIMENSIONALITY = SPROJECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Border Rule</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SN_DIMENSIONAL__BORDER_RULE = SPROJECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SN Dimensional</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SN_DIMENSIONAL_FEATURE_COUNT = SPROJECTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTINUOUS_SPACE__LABEL = SN_DIMENSIONAL__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTINUOUS_SPACE__ID = SN_DIMENSIONAL__ID;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTINUOUS_SPACE__PLURAL_LABEL = SN_DIMENSIONAL__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTINUOUS_SPACE__DESCRIPTION = SN_DIMENSIONAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTINUOUS_SPACE__ATTRIBUTES = SN_DIMENSIONAL__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTINUOUS_SPACE__OWNER = SN_DIMENSIONAL__OWNER;

	/**
	 * The feature id for the '<em><b>Dimensionality</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTINUOUS_SPACE__DIMENSIONALITY = SN_DIMENSIONAL__DIMENSIONALITY;

	/**
	 * The feature id for the '<em><b>Border Rule</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTINUOUS_SPACE__BORDER_RULE = SN_DIMENSIONAL__BORDER_RULE;

	/**
	 * The number of structural features of the '<em>SContinuous Space</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCONTINUOUS_SPACE_FEATURE_COUNT = SN_DIMENSIONAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRID__LABEL = SN_DIMENSIONAL__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRID__ID = SN_DIMENSIONAL__ID;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRID__PLURAL_LABEL = SN_DIMENSIONAL__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRID__DESCRIPTION = SN_DIMENSIONAL__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRID__ATTRIBUTES = SN_DIMENSIONAL__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRID__OWNER = SN_DIMENSIONAL__OWNER;

	/**
	 * The feature id for the '<em><b>Dimensionality</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRID__DIMENSIONALITY = SN_DIMENSIONAL__DIMENSIONALITY;

	/**
	 * The feature id for the '<em><b>Border Rule</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRID__BORDER_RULE = SN_DIMENSIONAL__BORDER_RULE;

	/**
	 * The feature id for the '<em><b>Multi Occupant</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRID__MULTI_OCCUPANT = SN_DIMENSIONAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Neighborhood</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRID__NEIGHBORHOOD = SN_DIMENSIONAL_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SGrid</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGRID_FEATURE_COUNT = SN_DIMENSIONAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNETWORK__LABEL = SPROJECTION__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNETWORK__ID = SPROJECTION__ID;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNETWORK__PLURAL_LABEL = SPROJECTION__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNETWORK__DESCRIPTION = SPROJECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNETWORK__ATTRIBUTES = SPROJECTION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNETWORK__OWNER = SPROJECTION__OWNER;

	/**
	 * The feature id for the '<em><b>Directed</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNETWORK__DIRECTED = SPROJECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SNetwork</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SNETWORK_FEATURE_COUNT = SPROJECTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGEOGRAPHY__LABEL = SPROJECTION__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGEOGRAPHY__ID = SPROJECTION__ID;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGEOGRAPHY__PLURAL_LABEL = SPROJECTION__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGEOGRAPHY__DESCRIPTION = SPROJECTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGEOGRAPHY__ATTRIBUTES = SPROJECTION__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGEOGRAPHY__OWNER = SPROJECTION__OWNER;

	/**
	 * The number of structural features of the '<em>SGeography</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SGEOGRAPHY_FEATURE_COUNT = SPROJECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVALUE_LAYER__LABEL = SNAMED__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVALUE_LAYER__ID = SNAMED__ID;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVALUE_LAYER__PLURAL_LABEL = SNAMED__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SVALUE_LAYER__DESCRIPTION = SNAMED__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>SValue Layer</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SVALUE_LAYER_FEATURE_COUNT = SNAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE__LABEL = SACTABLE__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE__ID = SACTABLE__ID;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE__PLURAL_LABEL = SACTABLE__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE__DESCRIPTION = SACTABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE__ATTRIBUTES = SACTABLE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Root Activity</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE__ROOT_ACTIVITY = SACTABLE__ROOT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE__IMPLEMENTATION = SACTABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE__PARENT = SACTABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE__AGENT = SACTABLE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>SStyle</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE_FEATURE_COUNT = SACTABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE2_D__LABEL = SSTYLE__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE2_D__ID = SSTYLE__ID;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE2_D__PLURAL_LABEL = SSTYLE__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE2_D__DESCRIPTION = SSTYLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE2_D__ATTRIBUTES = SSTYLE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Root Activity</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE2_D__ROOT_ACTIVITY = SSTYLE__ROOT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE2_D__IMPLEMENTATION = SSTYLE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE2_D__PARENT = SSTYLE__PARENT;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE2_D__AGENT = SSTYLE__AGENT;

	/**
	 * The number of structural features of the '<em>SStyle2 D</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE2_D_FEATURE_COUNT = SSTYLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.metaabm.impl.SStyleShapeImpl <em>SStyle Shape</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.impl.SStyleShapeImpl
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSStyleShape()
	 * @generated
	 */
	int SSTYLE_SHAPE = 24;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE_SHAPE__LABEL = SSTYLE2_D__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE_SHAPE__ID = SSTYLE2_D__ID;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE_SHAPE__PLURAL_LABEL = SSTYLE2_D__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE_SHAPE__DESCRIPTION = SSTYLE2_D__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE_SHAPE__ATTRIBUTES = SSTYLE2_D__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Root Activity</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE_SHAPE__ROOT_ACTIVITY = SSTYLE2_D__ROOT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE_SHAPE__IMPLEMENTATION = SSTYLE2_D__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE_SHAPE__PARENT = SSTYLE2_D__PARENT;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE_SHAPE__AGENT = SSTYLE2_D__AGENT;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE_SHAPE__SHAPE = SSTYLE2_D_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SStyle Shape</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SSTYLE_SHAPE_FEATURE_COUNT = SSTYLE2_D_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE3_D__LABEL = SSTYLE__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE3_D__ID = SSTYLE__ID;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE3_D__PLURAL_LABEL = SSTYLE__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE3_D__DESCRIPTION = SSTYLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE3_D__ATTRIBUTES = SSTYLE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Root Activity</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE3_D__ROOT_ACTIVITY = SSTYLE__ROOT_ACTIVITY;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE3_D__IMPLEMENTATION = SSTYLE__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE3_D__PARENT = SSTYLE__PARENT;

	/**
	 * The feature id for the '<em><b>Agent</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE3_D__AGENT = SSTYLE__AGENT;

	/**
	 * The number of structural features of the '<em>SStyle3 D</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SSTYLE3_D_FEATURE_COUNT = SSTYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEMENTED__LABEL = IID__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEMENTED__ID = IID__ID;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEMENTED__IMPLEMENTATION = IID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEMENTED__PARENT = IID_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>SImplemented</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SIMPLEMENTED_FEATURE_COUNT = IID_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEMENTATION__PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEMENTATION__CLASS_NAME = 1;

	/**
	 * The feature id for the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEMENTATION__BASE_PATH = 2;

	/**
	 * The feature id for the '<em><b>Mode</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEMENTATION__MODE = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' container reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEMENTATION__TARGET = 4;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEMENTATION__QUALIFIED_NAME = 5;

	/**
	 * The feature id for the '<em><b>Derived Path</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEMENTATION__DERIVED_PATH = 6;

	/**
	 * The feature id for the '<em><b>Derived Package</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEMENTATION__DERIVED_PACKAGE = 7;

	/**
	 * The feature id for the '<em><b>Java File Loc</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEMENTATION__JAVA_FILE_LOC = 8;

	/**
	 * The feature id for the '<em><b>Src Dir</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEMENTATION__SRC_DIR = 9;

	/**
	 * The feature id for the '<em><b>Bin Dir</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEMENTATION__BIN_DIR = 10;

	/**
	 * The feature id for the '<em><b>Class File Loc</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEMENTATION__CLASS_FILE_LOC = 11;

	/**
	 * The feature id for the '<em><b>Derived Bin Dir</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEMENTATION__DERIVED_BIN_DIR = 12;

	/**
	 * The feature id for the '<em><b>Derived Src Dir</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEMENTATION__DERIVED_SRC_DIR = 13;

	/**
	 * The number of structural features of the '<em>SImplementation</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLEMENTATION_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link org.metaabm.IModelExtension <em>IModel Extension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.IModelExtension
	 * @see org.metaabm.impl.MetaABMPackageImpl#getIModelExtension()
	 * @generated
	 */
	int IMODEL_EXTENSION = 30;

	/**
	 * The number of structural features of the '<em>IModel Extension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMODEL_EXTENSION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.metaabm.IAgentChild <em>IAgent Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.IAgentChild
	 * @see org.metaabm.impl.MetaABMPackageImpl#getIAgentChild()
	 * @generated
	 */
	int IAGENT_CHILD = 28;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IAGENT_CHILD__PARENT = IMODEL_EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IAgent Child</em>' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IAGENT_CHILD_FEATURE_COUNT = IMODEL_EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.metaabm.IAttributeChild <em>IAttribute Child</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.IAttributeChild
	 * @see org.metaabm.impl.MetaABMPackageImpl#getIAttributeChild()
	 * @generated
	 */
	int IATTRIBUTE_CHILD = 29;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IATTRIBUTE_CHILD__PARENT = IMODEL_EXTENSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IAttribute Child</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IATTRIBUTE_CHILD_FEATURE_COUNT = IMODEL_EXTENSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.metaabm.SAttributeType <em>SAttribute Type</em>}' enum.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see org.metaabm.SAttributeType
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSAttributeType()
	 * @generated
	 */
	int SATTRIBUTE_TYPE = 31;

	/**
	 * The meta object id for the '{@link org.metaabm.SBorderRule <em>SBorder Rule</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.SBorderRule
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSBorderRule()
	 * @generated
	 */
	int SBORDER_RULE = 32;

	/**
	 * The meta object id for the '{@link org.metaabm.SNeighborhoodType <em>SNeighborhood Type</em>}' enum. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.SNeighborhoodType
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSNeighborhoodType()
	 * @generated
	 */
	int SNEIGHBORHOOD_TYPE = 33;

	/**
	 * The meta object id for the '{@link org.metaabm.SImplementationMode <em>SImplementation Mode</em>}' enum. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.SImplementationMode
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSImplementationMode()
	 * @generated
	 */
	int SIMPLEMENTATION_MODE = 34;

	/**
	 * The meta object id for the '{@link org.metaabm.SShapeType <em>SShape Type</em>}' enum.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see org.metaabm.SShapeType
	 * @see org.metaabm.impl.MetaABMPackageImpl#getSShapeType()
	 * @generated
	 */
	int SSHAPE_TYPE = 35;

	/**
	 * Returns the meta object for class '{@link org.metaabm.IID <em>IID</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>IID</em>'.
	 * @see org.metaabm.IID
	 * @generated
	 */
	EClass getIID();

	/**
	 * Returns the meta object for the attribute '{@link org.metaabm.IID#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.metaabm.IID#getLabel()
	 * @see #getIID()
	 * @generated
	 */
	EAttribute getIID_Label();

	/**
	 * Returns the meta object for the attribute '{@link org.metaabm.IID#getID <em>ID</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see org.metaabm.IID#getID()
	 * @see #getIID()
	 * @generated
	 */
	EAttribute getIID_ID();

	/**
	 * Returns the meta object for class '{@link org.metaabm.ITyped <em>ITyped</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>ITyped</em>'.
	 * @see org.metaabm.ITyped
	 * @generated
	 */
	EClass getITyped();

	/**
	 * Returns the meta object for the attribute '{@link org.metaabm.ITyped#getSType <em>SType</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SType</em>'.
	 * @see org.metaabm.ITyped#getSType()
	 * @see #getITyped()
	 * @generated
	 */
	EAttribute getITyped_SType();

	/**
	 * Returns the meta object for class '{@link org.metaabm.ITypedArray <em>ITyped Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ITyped Array</em>'.
	 * @see org.metaabm.ITypedArray
	 * @generated
	 */
	EClass getITypedArray();

	/**
	 * Returns the meta object for the attribute ' {@link org.metaabm.ITypedArray#getSize <em>Size</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see org.metaabm.ITypedArray#getSize()
	 * @see #getITypedArray()
	 * @generated
	 */
	EAttribute getITypedArray_Size();

	/**
	 * Returns the meta object for class '{@link org.metaabm.IValue <em>IValue</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>IValue</em>'.
	 * @see org.metaabm.IValue
	 * @generated
	 */
	EClass getIValue();

	/**
	 * Returns the meta object for the reference list ' {@link org.metaabm.IValue#getAccessors <em>Accessors</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Accessors</em>'.
	 * @see org.metaabm.IValue#getAccessors()
	 * @see #getIValue()
	 * @generated
	 */
	EReference getIValue_Accessors();

	/**
	 * Returns the meta object for the attribute list '{@link org.metaabm.IValue#getAvailableTypes <em>Available Types</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Available Types</em>'.
	 * @see org.metaabm.IValue#getAvailableTypes()
	 * @see #getIValue()
	 * @generated
	 */
	EAttribute getIValue_AvailableTypes();

	/**
	 * Returns the meta object for class '{@link org.metaabm.IArtifact <em>IArtifact</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>IArtifact</em>'.
	 * @see org.metaabm.IArtifact
	 * @generated
	 */
	EClass getIArtifact();

	/**
	 * Returns the meta object for class '{@link org.metaabm.IAct <em>IAct</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>IAct</em>'.
	 * @see org.metaabm.IAct
	 * @generated
	 */
	EClass getIAct();

	/**
	 * Returns the meta object for class '{@link org.metaabm.SNamed <em>SNamed</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>SNamed</em>'.
	 * @see org.metaabm.SNamed
	 * @generated
	 */
	EClass getSNamed();

	/**
	 * Returns the meta object for the attribute ' {@link org.metaabm.SNamed#getPluralLabel <em>Plural Label</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Plural Label</em>'.
	 * @see org.metaabm.SNamed#getPluralLabel()
	 * @see #getSNamed()
	 * @generated
	 */
	EAttribute getSNamed_PluralLabel();

	/**
	 * Returns the meta object for the attribute ' {@link org.metaabm.SNamed#getDescription <em>Description</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.metaabm.SNamed#getDescription()
	 * @see #getSNamed()
	 * @generated
	 */
	EAttribute getSNamed_Description();

	/**
	 * Returns the meta object for class '{@link org.metaabm.SAttributed <em>SAttributed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SAttributed</em>'.
	 * @see org.metaabm.SAttributed
	 * @generated
	 */
	EClass getSAttributed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.metaabm.SAttributed#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.metaabm.SAttributed#getAttributes()
	 * @see #getSAttributed()
	 * @generated
	 */
	EReference getSAttributed_Attributes();

	/**
	 * Returns the meta object for class '{@link org.metaabm.SAttribute <em>SAttribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SAttribute</em>'.
	 * @see org.metaabm.SAttribute
	 * @generated
	 */
	EClass getSAttribute();

	/**
	 * Returns the meta object for the container reference ' {@link org.metaabm.SAttribute#getOwner <em>Owner</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see org.metaabm.SAttribute#getOwner()
	 * @see #getSAttribute()
	 * @generated
	 */
	EReference getSAttribute_Owner();

	/**
	 * Returns the meta object for the attribute ' {@link org.metaabm.SAttribute#isGatherData <em>Gather Data</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Gather Data</em>'.
	 * @see org.metaabm.SAttribute#isGatherData()
	 * @see #getSAttribute()
	 * @generated
	 */
	EAttribute getSAttribute_GatherData();

	/**
	 * Returns the meta object for the attribute '{@link org.metaabm.SAttribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see org.metaabm.SAttribute#getDefaultValue()
	 * @see #getSAttribute()
	 * @generated
	 */
	EAttribute getSAttribute_DefaultValue();

	/**
	 * Returns the meta object for the attribute ' {@link org.metaabm.SAttribute#getUnits <em>Units</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Units</em>'.
	 * @see org.metaabm.SAttribute#getUnits()
	 * @see #getSAttribute()
	 * @generated
	 */
	EAttribute getSAttribute_Units();

	/**
	 * Returns the meta object for the attribute ' {@link org.metaabm.SAttribute#isImmutable <em>Immutable</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Immutable</em>'.
	 * @see org.metaabm.SAttribute#isImmutable()
	 * @see #getSAttribute()
	 * @generated
	 */
	EAttribute getSAttribute_Immutable();

	/**
	 * Returns the meta object for the attribute '{@link org.metaabm.SAttribute#isDerived <em>Derived</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Derived</em>'.
	 * @see org.metaabm.SAttribute#isDerived()
	 * @see #getSAttribute()
	 * @generated
	 */
	EAttribute getSAttribute_Derived();

	/**
	 * Returns the meta object for the containment reference list '{@link org.metaabm.SAttribute#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.metaabm.SAttribute#getChildren()
	 * @see #getSAttribute()
	 * @generated
	 */
	EReference getSAttribute_Children();

	/**
	 * Returns the meta object for class '{@link org.metaabm.SAttributeArray <em>SAttribute Array</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>SAttribute Array</em>'.
	 * @see org.metaabm.SAttributeArray
	 * @generated
	 */
	EClass getSAttributeArray();

	/**
	 * Returns the meta object for class '{@link org.metaabm.SAgent <em>SAgent</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>SAgent</em>'.
	 * @see org.metaabm.SAgent
	 * @generated
	 */
	EClass getSAgent();

	/**
	 * Returns the meta object for the containment reference list '{@link org.metaabm.SAgent#getStyles <em>Styles</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Styles</em>'.
	 * @see org.metaabm.SAgent#getStyles()
	 * @see #getSAgent()
	 * @generated
	 */
	EReference getSAgent_Styles();

	/**
	 * Returns the meta object for the container reference '{@link org.metaabm.SAgent#getOwner <em>Owner</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see org.metaabm.SAgent#getOwner()
	 * @see #getSAgent()
	 * @generated
	 */
	EReference getSAgent_Owner();

	/**
	 * Returns the meta object for the containment reference list '{@link org.metaabm.SAgent#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.metaabm.SAgent#getChildren()
	 * @see #getSAgent()
	 * @generated
	 */
	EReference getSAgent_Children();

	/**
	 * Returns the meta object for class '{@link org.metaabm.SContext <em>SContext</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>SContext</em>'.
	 * @see org.metaabm.SContext
	 * @generated
	 */
	EClass getSContext();

	/**
	 * Returns the meta object for the containment reference list '{@link org.metaabm.SContext#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Agents</em>'.
	 * @see org.metaabm.SContext#getAgents()
	 * @see #getSContext()
	 * @generated
	 */
	EReference getSContext_Agents();

	/**
	 * Returns the meta object for the containment reference list '{@link org.metaabm.SContext#getProjections <em>Projections</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projections</em>'.
	 * @see org.metaabm.SContext#getProjections()
	 * @see #getSContext()
	 * @generated
	 */
	EReference getSContext_Projections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.metaabm.SContext#getValueLayers <em>Value Layers</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Value Layers</em>'.
	 * @see org.metaabm.SContext#getValueLayers()
	 * @see #getSContext()
	 * @generated
	 */
	EReference getSContext_ValueLayers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.metaabm.SContext#getLibrary <em>Library</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Library</em>'.
	 * @see org.metaabm.SContext#getLibrary()
	 * @see #getSContext()
	 * @generated
	 */
	EReference getSContext_Library();

	/**
	 * Returns the meta object for the reference list '{@link org.metaabm.SContext#getAllAgents <em>All Agents</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Agents</em>'.
	 * @see org.metaabm.SContext#getAllAgents()
	 * @see #getSContext()
	 * @generated
	 */
	EReference getSContext_AllAgents();

	/**
	 * Returns the meta object for the reference list '{@link org.metaabm.SContext#getAllContexts <em>All Contexts</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Contexts</em>'.
	 * @see org.metaabm.SContext#getAllContexts()
	 * @see #getSContext()
	 * @generated
	 */
	EReference getSContext_AllContexts();

	/**
	 * Returns the meta object for class '{@link org.metaabm.SProjection <em>SProjection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SProjection</em>'.
	 * @see org.metaabm.SProjection
	 * @generated
	 */
	EClass getSProjection();

	/**
	 * Returns the meta object for the container reference '{@link org.metaabm.SProjection#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Owner</em>'.
	 * @see org.metaabm.SProjection#getOwner()
	 * @see #getSProjection()
	 * @generated
	 */
	EReference getSProjection_Owner();

	/**
	 * Returns the meta object for class '{@link org.metaabm.SNDimensional <em>SN Dimensional</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>SN Dimensional</em>'.
	 * @see org.metaabm.SNDimensional
	 * @generated
	 */
	EClass getSNDimensional();

	/**
	 * Returns the meta object for the attribute '{@link org.metaabm.SNDimensional#getDimensionality <em>Dimensionality</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dimensionality</em>'.
	 * @see org.metaabm.SNDimensional#getDimensionality()
	 * @see #getSNDimensional()
	 * @generated
	 */
	EAttribute getSNDimensional_Dimensionality();

	/**
	 * Returns the meta object for the attribute '{@link org.metaabm.SNDimensional#getBorderRule <em>Border Rule</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Rule</em>'.
	 * @see org.metaabm.SNDimensional#getBorderRule()
	 * @see #getSNDimensional()
	 * @generated
	 */
	EAttribute getSNDimensional_BorderRule();

	/**
	 * Returns the meta object for class '{@link org.metaabm.SContinuousSpace <em>SContinuous Space</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>SContinuous Space</em>'.
	 * @see org.metaabm.SContinuousSpace
	 * @generated
	 */
	EClass getSContinuousSpace();

	/**
	 * Returns the meta object for class '{@link org.metaabm.SGrid <em>SGrid</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>SGrid</em>'.
	 * @see org.metaabm.SGrid
	 * @generated
	 */
	EClass getSGrid();

	/**
	 * Returns the meta object for the attribute '{@link org.metaabm.SGrid#isMultiOccupant <em>Multi Occupant</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Occupant</em>'.
	 * @see org.metaabm.SGrid#isMultiOccupant()
	 * @see #getSGrid()
	 * @generated
	 */
	EAttribute getSGrid_MultiOccupant();

	/**
	 * Returns the meta object for the attribute ' {@link org.metaabm.SGrid#getNeighborhood <em>Neighborhood</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Neighborhood</em>'.
	 * @see org.metaabm.SGrid#getNeighborhood()
	 * @see #getSGrid()
	 * @generated
	 */
	EAttribute getSGrid_Neighborhood();

	/**
	 * Returns the meta object for class '{@link org.metaabm.SNetwork <em>SNetwork</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>SNetwork</em>'.
	 * @see org.metaabm.SNetwork
	 * @generated
	 */
	EClass getSNetwork();

	/**
	 * Returns the meta object for the attribute ' {@link org.metaabm.SNetwork#isDirected <em>Directed</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Directed</em>'.
	 * @see org.metaabm.SNetwork#isDirected()
	 * @see #getSNetwork()
	 * @generated
	 */
	EAttribute getSNetwork_Directed();

	/**
	 * Returns the meta object for class '{@link org.metaabm.SGeography <em>SGeography</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SGeography</em>'.
	 * @see org.metaabm.SGeography
	 * @generated
	 */
	EClass getSGeography();

	/**
	 * Returns the meta object for class '{@link org.metaabm.SValueLayer <em>SValue Layer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SValue Layer</em>'.
	 * @see org.metaabm.SValueLayer
	 * @generated
	 */
	EClass getSValueLayer();

	/**
	 * Returns the meta object for class '{@link org.metaabm.SStyle <em>SStyle</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>SStyle</em>'.
	 * @see org.metaabm.SStyle
	 * @generated
	 */
	EClass getSStyle();

	/**
	 * Returns the meta object for the container reference '{@link org.metaabm.SStyle#getAgent <em>Agent</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Agent</em>'.
	 * @see org.metaabm.SStyle#getAgent()
	 * @see #getSStyle()
	 * @generated
	 */
	EReference getSStyle_Agent();

	/**
	 * Returns the meta object for class '{@link org.metaabm.SStyle3D <em>SStyle3 D</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>SStyle3 D</em>'.
	 * @see org.metaabm.SStyle3D
	 * @generated
	 */
	EClass getSStyle3D();

	/**
	 * Returns the meta object for class '{@link org.metaabm.SStyle2D <em>SStyle2 D</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>SStyle2 D</em>'.
	 * @see org.metaabm.SStyle2D
	 * @generated
	 */
	EClass getSStyle2D();

	/**
	 * Returns the meta object for class '{@link org.metaabm.SStyleShape <em>SStyle Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SStyle Shape</em>'.
	 * @see org.metaabm.SStyleShape
	 * @generated
	 */
	EClass getSStyleShape();

	/**
	 * Returns the meta object for the attribute ' {@link org.metaabm.SStyleShape#getShape <em>Shape</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see org.metaabm.SStyleShape#getShape()
	 * @see #getSStyleShape()
	 * @generated
	 */
	EAttribute getSStyleShape_Shape();

	/**
	 * Returns the meta object for class '{@link org.metaabm.SImplemented <em>SImplemented</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SImplemented</em>'.
	 * @see org.metaabm.SImplemented
	 * @generated
	 */
	EClass getSImplemented();

	/**
	 * Returns the meta object for the containment reference '{@link org.metaabm.SImplemented#getImplementation <em>Implementation</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Implementation</em>'.
	 * @see org.metaabm.SImplemented#getImplementation()
	 * @see #getSImplemented()
	 * @generated
	 */
	EReference getSImplemented_Implementation();

	/**
	 * Returns the meta object for the reference ' {@link org.metaabm.SImplemented#getParent <em>Parent</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.metaabm.SImplemented#getParent()
	 * @see #getSImplemented()
	 * @generated
	 */
	EReference getSImplemented_Parent();

	/**
	 * Returns the meta object for class '{@link org.metaabm.SImplementation <em>SImplementation</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>SImplementation</em>'.
	 * @see org.metaabm.SImplementation
	 * @generated
	 */
	EClass getSImplementation();

	/**
	 * Returns the meta object for the attribute ' {@link org.metaabm.SImplementation#getPackage <em>Package</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see org.metaabm.SImplementation#getPackage()
	 * @see #getSImplementation()
	 * @generated
	 */
	EAttribute getSImplementation_Package();

	/**
	 * Returns the meta object for the attribute '{@link org.metaabm.SImplementation#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.metaabm.SImplementation#getClassName()
	 * @see #getSImplementation()
	 * @generated
	 */
	EAttribute getSImplementation_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.metaabm.SImplementation#getBasePath <em>Base Path</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Path</em>'.
	 * @see org.metaabm.SImplementation#getBasePath()
	 * @see #getSImplementation()
	 * @generated
	 */
	EAttribute getSImplementation_BasePath();

	/**
	 * Returns the meta object for the attribute ' {@link org.metaabm.SImplementation#getMode <em>Mode</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Mode</em>'.
	 * @see org.metaabm.SImplementation#getMode()
	 * @see #getSImplementation()
	 * @generated
	 */
	EAttribute getSImplementation_Mode();

	/**
	 * Returns the meta object for the container reference '{@link org.metaabm.SImplementation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Target</em>'.
	 * @see org.metaabm.SImplementation#getTarget()
	 * @see #getSImplementation()
	 * @generated
	 */
	EReference getSImplementation_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.metaabm.SImplementation#getQualifiedName <em>Qualified Name</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qualified Name</em>'.
	 * @see org.metaabm.SImplementation#getQualifiedName()
	 * @see #getSImplementation()
	 * @generated
	 */
	EAttribute getSImplementation_QualifiedName();

	/**
	 * Returns the meta object for the attribute '{@link org.metaabm.SImplementation#getDerivedPath <em>Derived Path</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived Path</em>'.
	 * @see org.metaabm.SImplementation#getDerivedPath()
	 * @see #getSImplementation()
	 * @generated
	 */
	EAttribute getSImplementation_DerivedPath();

	/**
	 * Returns the meta object for the attribute '{@link org.metaabm.SImplementation#getDerivedPackage <em>Derived Package</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived Package</em>'.
	 * @see org.metaabm.SImplementation#getDerivedPackage()
	 * @see #getSImplementation()
	 * @generated
	 */
	EAttribute getSImplementation_DerivedPackage();

	/**
	 * Returns the meta object for the attribute '{@link org.metaabm.SImplementation#getJavaFileLoc <em>Java File Loc</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Java File Loc</em>'.
	 * @see org.metaabm.SImplementation#getJavaFileLoc()
	 * @see #getSImplementation()
	 * @generated
	 */
	EAttribute getSImplementation_JavaFileLoc();

	/**
	 * Returns the meta object for the attribute ' {@link org.metaabm.SImplementation#getSrcDir <em>Src Dir</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Src Dir</em>'.
	 * @see org.metaabm.SImplementation#getSrcDir()
	 * @see #getSImplementation()
	 * @generated
	 */
	EAttribute getSImplementation_SrcDir();

	/**
	 * Returns the meta object for the attribute ' {@link org.metaabm.SImplementation#getBinDir <em>Bin Dir</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Bin Dir</em>'.
	 * @see org.metaabm.SImplementation#getBinDir()
	 * @see #getSImplementation()
	 * @generated
	 */
	EAttribute getSImplementation_BinDir();

	/**
	 * Returns the meta object for the attribute '{@link org.metaabm.SImplementation#getClassFileLoc <em>Class File Loc</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class File Loc</em>'.
	 * @see org.metaabm.SImplementation#getClassFileLoc()
	 * @see #getSImplementation()
	 * @generated
	 */
	EAttribute getSImplementation_ClassFileLoc();

	/**
	 * Returns the meta object for the attribute '{@link org.metaabm.SImplementation#getDerivedBinDir <em>Derived Bin Dir</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived Bin Dir</em>'.
	 * @see org.metaabm.SImplementation#getDerivedBinDir()
	 * @see #getSImplementation()
	 * @generated
	 */
	EAttribute getSImplementation_DerivedBinDir();

	/**
	 * Returns the meta object for the attribute '{@link org.metaabm.SImplementation#getDerivedSrcDir <em>Derived Src Dir</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derived Src Dir</em>'.
	 * @see org.metaabm.SImplementation#getDerivedSrcDir()
	 * @see #getSImplementation()
	 * @generated
	 */
	EAttribute getSImplementation_DerivedSrcDir();

	/**
	 * Returns the meta object for class '{@link org.metaabm.IAgentChild <em>IAgent Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAgent Child</em>'.
	 * @see org.metaabm.IAgentChild
	 * @generated
	 */
	EClass getIAgentChild();

	/**
	 * Returns the meta object for the container reference '{@link org.metaabm.IAgentChild#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.metaabm.IAgentChild#getParent()
	 * @see #getIAgentChild()
	 * @generated
	 */
	EReference getIAgentChild_Parent();

	/**
	 * Returns the meta object for class '{@link org.metaabm.IAttributeChild <em>IAttribute Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAttribute Child</em>'.
	 * @see org.metaabm.IAttributeChild
	 * @generated
	 */
	EClass getIAttributeChild();

	/**
	 * Returns the meta object for the container reference '{@link org.metaabm.IAttributeChild#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see org.metaabm.IAttributeChild#getParent()
	 * @see #getIAttributeChild()
	 * @generated
	 */
	EReference getIAttributeChild_Parent();

	/**
	 * Returns the meta object for class '{@link org.metaabm.IModelExtension <em>IModel Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IModel Extension</em>'.
	 * @see org.metaabm.IModelExtension
	 * @generated
	 */
	EClass getIModelExtension();

	/**
	 * Returns the meta object for class '{@link org.metaabm.SState <em>SState</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>SState</em>'.
	 * @see org.metaabm.SState
	 * @generated
	 */
	EClass getSState();

	/**
	 * Returns the meta object for the containment reference list '{@link org.metaabm.SState#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see org.metaabm.SState#getOptions()
	 * @see #getSState()
	 * @generated
	 */
	EReference getSState_Options();

	/**
	 * Returns the meta object for the reference '{@link org.metaabm.SState#getDefaultOption <em>Default Option</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Default Option</em>'.
	 * @see org.metaabm.SState#getDefaultOption()
	 * @see #getSState()
	 * @generated
	 */
	EReference getSState_DefaultOption();

	/**
	 * Returns the meta object for class '{@link org.metaabm.SStateValue <em>SState Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SState Value</em>'.
	 * @see org.metaabm.SStateValue
	 * @generated
	 */
	EClass getSStateValue();

	/**
	 * Returns the meta object for the container reference '{@link org.metaabm.SStateValue#getSet <em>Set</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Set</em>'.
	 * @see org.metaabm.SStateValue#getSet()
	 * @see #getSStateValue()
	 * @generated
	 */
	EReference getSStateValue_Set();

	/**
	 * Returns the meta object for class '{@link org.metaabm.SActable <em>SActable</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for class '<em>SActable</em>'.
	 * @see org.metaabm.SActable
	 * @generated
	 */
	EClass getSActable();

	/**
	 * Returns the meta object for the containment reference '{@link org.metaabm.SActable#getRootActivity <em>Root Activity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Root Activity</em>'.
	 * @see org.metaabm.SActable#getRootActivity()
	 * @see #getSActable()
	 * @generated
	 */
	EReference getSActable_RootActivity();

	/**
	 * Returns the meta object for enum '{@link org.metaabm.SAttributeType <em>SAttribute Type</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SAttribute Type</em>'.
	 * @see org.metaabm.SAttributeType
	 * @generated
	 */
	EEnum getSAttributeType();

	/**
	 * Returns the meta object for enum '{@link org.metaabm.SBorderRule <em>SBorder Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SBorder Rule</em>'.
	 * @see org.metaabm.SBorderRule
	 * @generated
	 */
	EEnum getSBorderRule();

	/**
	 * Returns the meta object for enum '{@link org.metaabm.SNeighborhoodType <em>SNeighborhood Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>SNeighborhood Type</em>'.
	 * @see org.metaabm.SNeighborhoodType
	 * @generated
	 */
	EEnum getSNeighborhoodType();

	/**
	 * Returns the meta object for enum '{@link org.metaabm.SImplementationMode <em>SImplementation Mode</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for enum '<em>SImplementation Mode</em>'.
	 * @see org.metaabm.SImplementationMode
	 * @generated
	 */
	EEnum getSImplementationMode();

	/**
	 * Returns the meta object for enum '{@link org.metaabm.SShapeType <em>SShape Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SShape Type</em>'.
	 * @see org.metaabm.SShapeType
	 * @generated
	 */
	EEnum getSShapeType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetaABMFactory getMetaABMFactory();

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
		 * The meta object literal for the '{@link org.metaabm.impl.IIDImpl <em>IID</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.metaabm.impl.IIDImpl
		 * @see org.metaabm.impl.MetaABMPackageImpl#getIID()
		 * @generated
		 */
		EClass IID = eINSTANCE.getIID();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute IID__LABEL = eINSTANCE.getIID_Label();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @generated
		 */
		EAttribute IID__ID = eINSTANCE.getIID_ID();

		/**
		 * The meta object literal for the '{@link org.metaabm.ITyped <em>ITyped</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.metaabm.ITyped
		 * @see org.metaabm.impl.MetaABMPackageImpl#getITyped()
		 * @generated
		 */
		EClass ITYPED = eINSTANCE.getITyped();

		/**
		 * The meta object literal for the '<em><b>SType</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute ITYPED__STYPE = eINSTANCE.getITyped_SType();

		/**
		 * The meta object literal for the '{@link org.metaabm.ITypedArray <em>ITyped Array</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.ITypedArray
		 * @see org.metaabm.impl.MetaABMPackageImpl#getITypedArray()
		 * @generated
		 */
		EClass ITYPED_ARRAY = eINSTANCE.getITypedArray();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute ITYPED_ARRAY__SIZE = eINSTANCE.getITypedArray_Size();

		/**
		 * The meta object literal for the '{@link org.metaabm.IValue <em>IValue</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.metaabm.IValue
		 * @see org.metaabm.impl.MetaABMPackageImpl#getIValue()
		 * @generated
		 */
		EClass IVALUE = eINSTANCE.getIValue();

		/**
		 * The meta object literal for the '<em><b>Accessors</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference IVALUE__ACCESSORS = eINSTANCE.getIValue_Accessors();

		/**
		 * The meta object literal for the '<em><b>Available Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IVALUE__AVAILABLE_TYPES = eINSTANCE.getIValue_AvailableTypes();

		/**
		 * The meta object literal for the '{@link org.metaabm.IArtifact <em>IArtifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.metaabm.IArtifact
		 * @see org.metaabm.impl.MetaABMPackageImpl#getIArtifact()
		 * @generated
		 */
		EClass IARTIFACT = eINSTANCE.getIArtifact();

		/**
		 * The meta object literal for the '{@link org.metaabm.IAct <em>IAct</em>}' class.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @see org.metaabm.IAct
		 * @see org.metaabm.impl.MetaABMPackageImpl#getIAct()
		 * @generated
		 */
		EClass IACT = eINSTANCE.getIAct();

		/**
		 * The meta object literal for the '{@link org.metaabm.impl.SNamedImpl <em>SNamed</em>}' class.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.metaabm.impl.SNamedImpl
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSNamed()
		 * @generated
		 */
		EClass SNAMED = eINSTANCE.getSNamed();

		/**
		 * The meta object literal for the '<em><b>Plural Label</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SNAMED__PLURAL_LABEL = eINSTANCE.getSNamed_PluralLabel();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SNAMED__DESCRIPTION = eINSTANCE.getSNamed_Description();

		/**
		 * The meta object literal for the '{@link org.metaabm.impl.SAttributedImpl <em>SAttributed</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.impl.SAttributedImpl
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSAttributed()
		 * @generated
		 */
		EClass SATTRIBUTED = eINSTANCE.getSAttributed();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SATTRIBUTED__ATTRIBUTES = eINSTANCE.getSAttributed_Attributes();

		/**
		 * The meta object literal for the '{@link org.metaabm.impl.SAttributeImpl <em>SAttribute</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.impl.SAttributeImpl
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSAttribute()
		 * @generated
		 */
		EClass SATTRIBUTE = eINSTANCE.getSAttribute();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SATTRIBUTE__OWNER = eINSTANCE.getSAttribute_Owner();

		/**
		 * The meta object literal for the '<em><b>Gather Data</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SATTRIBUTE__GATHER_DATA = eINSTANCE.getSAttribute_GatherData();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getSAttribute_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SATTRIBUTE__UNITS = eINSTANCE.getSAttribute_Units();

		/**
		 * The meta object literal for the '<em><b>Immutable</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SATTRIBUTE__IMMUTABLE = eINSTANCE.getSAttribute_Immutable();

		/**
		 * The meta object literal for the '<em><b>Derived</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SATTRIBUTE__DERIVED = eINSTANCE.getSAttribute_Derived();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SATTRIBUTE__CHILDREN = eINSTANCE.getSAttribute_Children();

		/**
		 * The meta object literal for the '{@link org.metaabm.impl.SAttributeArrayImpl <em>SAttribute Array</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.metaabm.impl.SAttributeArrayImpl
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSAttributeArray()
		 * @generated
		 */
		EClass SATTRIBUTE_ARRAY = eINSTANCE.getSAttributeArray();

		/**
		 * The meta object literal for the '{@link org.metaabm.impl.SAgentImpl <em>SAgent</em>}' class.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.metaabm.impl.SAgentImpl
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSAgent()
		 * @generated
		 */
		EClass SAGENT = eINSTANCE.getSAgent();

		/**
		 * The meta object literal for the '<em><b>Styles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SAGENT__STYLES = eINSTANCE.getSAgent_Styles();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SAGENT__OWNER = eINSTANCE.getSAgent_Owner();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SAGENT__CHILDREN = eINSTANCE.getSAgent_Children();

		/**
		 * The meta object literal for the ' {@link org.metaabm.impl.SContextImpl <em>SContext</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.impl.SContextImpl
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSContext()
		 * @generated
		 */
		EClass SCONTEXT = eINSTANCE.getSContext();

		/**
		 * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCONTEXT__AGENTS = eINSTANCE.getSContext_Agents();

		/**
		 * The meta object literal for the '<em><b>Projections</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SCONTEXT__PROJECTIONS = eINSTANCE.getSContext_Projections();

		/**
		 * The meta object literal for the '<em><b>Value Layers</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SCONTEXT__VALUE_LAYERS = eINSTANCE.getSContext_ValueLayers();

		/**
		 * The meta object literal for the '<em><b>Library</b></em>' containment reference list feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCONTEXT__LIBRARY = eINSTANCE.getSContext_Library();

		/**
		 * The meta object literal for the '<em><b>All Agents</b></em>' reference list feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SCONTEXT__ALL_AGENTS = eINSTANCE.getSContext_AllAgents();

		/**
		 * The meta object literal for the '<em><b>All Contexts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCONTEXT__ALL_CONTEXTS = eINSTANCE.getSContext_AllContexts();

		/**
		 * The meta object literal for the '{@link org.metaabm.impl.SProjectionImpl <em>SProjection</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.impl.SProjectionImpl
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSProjection()
		 * @generated
		 */
		EClass SPROJECTION = eINSTANCE.getSProjection();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SPROJECTION__OWNER = eINSTANCE.getSProjection_Owner();

		/**
		 * The meta object literal for the '{@link org.metaabm.impl.SNDimensionalImpl <em>SN Dimensional</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.impl.SNDimensionalImpl
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSNDimensional()
		 * @generated
		 */
		EClass SN_DIMENSIONAL = eINSTANCE.getSNDimensional();

		/**
		 * The meta object literal for the '<em><b>Dimensionality</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SN_DIMENSIONAL__DIMENSIONALITY = eINSTANCE.getSNDimensional_Dimensionality();

		/**
		 * The meta object literal for the '<em><b>Border Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SN_DIMENSIONAL__BORDER_RULE = eINSTANCE.getSNDimensional_BorderRule();

		/**
		 * The meta object literal for the '{@link org.metaabm.impl.SContinuousSpaceImpl <em>SContinuous Space</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.metaabm.impl.SContinuousSpaceImpl
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSContinuousSpace()
		 * @generated
		 */
		EClass SCONTINUOUS_SPACE = eINSTANCE.getSContinuousSpace();

		/**
		 * The meta object literal for the '{@link org.metaabm.impl.SGridImpl <em>SGrid</em>}' class.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.metaabm.impl.SGridImpl
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSGrid()
		 * @generated
		 */
		EClass SGRID = eINSTANCE.getSGrid();

		/**
		 * The meta object literal for the '<em><b>Multi Occupant</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SGRID__MULTI_OCCUPANT = eINSTANCE.getSGrid_MultiOccupant();

		/**
		 * The meta object literal for the '<em><b>Neighborhood</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SGRID__NEIGHBORHOOD = eINSTANCE.getSGrid_Neighborhood();

		/**
		 * The meta object literal for the ' {@link org.metaabm.impl.SNetworkImpl <em>SNetwork</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.impl.SNetworkImpl
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSNetwork()
		 * @generated
		 */
		EClass SNETWORK = eINSTANCE.getSNetwork();

		/**
		 * The meta object literal for the '<em><b>Directed</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SNETWORK__DIRECTED = eINSTANCE.getSNetwork_Directed();

		/**
		 * The meta object literal for the '{@link org.metaabm.impl.SGeographyImpl <em>SGeography</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.impl.SGeographyImpl
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSGeography()
		 * @generated
		 */
		EClass SGEOGRAPHY = eINSTANCE.getSGeography();

		/**
		 * The meta object literal for the '{@link org.metaabm.impl.SValueLayerImpl <em>SValue Layer</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.impl.SValueLayerImpl
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSValueLayer()
		 * @generated
		 */
		EClass SVALUE_LAYER = eINSTANCE.getSValueLayer();

		/**
		 * The meta object literal for the '{@link org.metaabm.impl.SStyleImpl <em>SStyle</em>}' class.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.metaabm.impl.SStyleImpl
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSStyle()
		 * @generated
		 */
		EClass SSTYLE = eINSTANCE.getSStyle();

		/**
		 * The meta object literal for the '<em><b>Agent</b></em>' container reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SSTYLE__AGENT = eINSTANCE.getSStyle_Agent();

		/**
		 * The meta object literal for the ' {@link org.metaabm.impl.SStyle3DImpl <em>SStyle3 D</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.impl.SStyle3DImpl
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSStyle3D()
		 * @generated
		 */
		EClass SSTYLE3_D = eINSTANCE.getSStyle3D();

		/**
		 * The meta object literal for the ' {@link org.metaabm.impl.SStyle2DImpl <em>SStyle2 D</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.impl.SStyle2DImpl
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSStyle2D()
		 * @generated
		 */
		EClass SSTYLE2_D = eINSTANCE.getSStyle2D();

		/**
		 * The meta object literal for the '{@link org.metaabm.impl.SStyleShapeImpl <em>SStyle Shape</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.impl.SStyleShapeImpl
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSStyleShape()
		 * @generated
		 */
		EClass SSTYLE_SHAPE = eINSTANCE.getSStyleShape();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SSTYLE_SHAPE__SHAPE = eINSTANCE.getSStyleShape_Shape();

		/**
		 * The meta object literal for the '{@link org.metaabm.impl.SImplementedImpl <em>SImplemented</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.impl.SImplementedImpl
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSImplemented()
		 * @generated
		 */
		EClass SIMPLEMENTED = eINSTANCE.getSImplemented();

		/**
		 * The meta object literal for the '<em><b>Implementation</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SIMPLEMENTED__IMPLEMENTATION = eINSTANCE.getSImplemented_Implementation();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SIMPLEMENTED__PARENT = eINSTANCE.getSImplemented_Parent();

		/**
		 * The meta object literal for the '{@link org.metaabm.impl.SImplementationImpl <em>SImplementation</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.metaabm.impl.SImplementationImpl
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSImplementation()
		 * @generated
		 */
		EClass SIMPLEMENTATION = eINSTANCE.getSImplementation();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLEMENTATION__PACKAGE = eINSTANCE.getSImplementation_Package();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLEMENTATION__CLASS_NAME = eINSTANCE.getSImplementation_ClassName();

		/**
		 * The meta object literal for the '<em><b>Base Path</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLEMENTATION__BASE_PATH = eINSTANCE.getSImplementation_BasePath();

		/**
		 * The meta object literal for the '<em><b>Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLEMENTATION__MODE = eINSTANCE.getSImplementation_Mode();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLEMENTATION__TARGET = eINSTANCE.getSImplementation_Target();

		/**
		 * The meta object literal for the '<em><b>Qualified Name</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLEMENTATION__QUALIFIED_NAME = eINSTANCE.getSImplementation_QualifiedName();

		/**
		 * The meta object literal for the '<em><b>Derived Path</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLEMENTATION__DERIVED_PATH = eINSTANCE.getSImplementation_DerivedPath();

		/**
		 * The meta object literal for the '<em><b>Derived Package</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLEMENTATION__DERIVED_PACKAGE = eINSTANCE.getSImplementation_DerivedPackage();

		/**
		 * The meta object literal for the '<em><b>Java File Loc</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLEMENTATION__JAVA_FILE_LOC = eINSTANCE.getSImplementation_JavaFileLoc();

		/**
		 * The meta object literal for the '<em><b>Src Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLEMENTATION__SRC_DIR = eINSTANCE.getSImplementation_SrcDir();

		/**
		 * The meta object literal for the '<em><b>Bin Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLEMENTATION__BIN_DIR = eINSTANCE.getSImplementation_BinDir();

		/**
		 * The meta object literal for the '<em><b>Class File Loc</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLEMENTATION__CLASS_FILE_LOC = eINSTANCE.getSImplementation_ClassFileLoc();

		/**
		 * The meta object literal for the '<em><b>Derived Bin Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLEMENTATION__DERIVED_BIN_DIR = eINSTANCE.getSImplementation_DerivedBinDir();

		/**
		 * The meta object literal for the '<em><b>Derived Src Dir</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLEMENTATION__DERIVED_SRC_DIR = eINSTANCE.getSImplementation_DerivedSrcDir();

		/**
		 * The meta object literal for the '{@link org.metaabm.IAgentChild <em>IAgent Child</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.IAgentChild
		 * @see org.metaabm.impl.MetaABMPackageImpl#getIAgentChild()
		 * @generated
		 */
		EClass IAGENT_CHILD = eINSTANCE.getIAgentChild();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IAGENT_CHILD__PARENT = eINSTANCE.getIAgentChild_Parent();

		/**
		 * The meta object literal for the '{@link org.metaabm.IAttributeChild <em>IAttribute Child</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.metaabm.IAttributeChild
		 * @see org.metaabm.impl.MetaABMPackageImpl#getIAttributeChild()
		 * @generated
		 */
		EClass IATTRIBUTE_CHILD = eINSTANCE.getIAttributeChild();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IATTRIBUTE_CHILD__PARENT = eINSTANCE.getIAttributeChild_Parent();

		/**
		 * The meta object literal for the '{@link org.metaabm.IModelExtension <em>IModel Extension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.metaabm.IModelExtension
		 * @see org.metaabm.impl.MetaABMPackageImpl#getIModelExtension()
		 * @generated
		 */
		EClass IMODEL_EXTENSION = eINSTANCE.getIModelExtension();

		/**
		 * The meta object literal for the '{@link org.metaabm.impl.SStateImpl <em>SState</em>}' class.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.metaabm.impl.SStateImpl
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSState()
		 * @generated
		 */
		EClass SSTATE = eINSTANCE.getSState();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference SSTATE__OPTIONS = eINSTANCE.getSState_Options();

		/**
		 * The meta object literal for the '<em><b>Default Option</b></em>' reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SSTATE__DEFAULT_OPTION = eINSTANCE.getSState_DefaultOption();

		/**
		 * The meta object literal for the '{@link org.metaabm.impl.SStateValueImpl <em>SState Value</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.impl.SStateValueImpl
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSStateValue()
		 * @generated
		 */
		EClass SSTATE_VALUE = eINSTANCE.getSStateValue();

		/**
		 * The meta object literal for the '<em><b>Set</b></em>' container reference feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EReference SSTATE_VALUE__SET = eINSTANCE.getSStateValue_Set();

		/**
		 * The meta object literal for the ' {@link org.metaabm.impl.SActableImpl <em>SActable</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.impl.SActableImpl
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSActable()
		 * @generated
		 */
		EClass SACTABLE = eINSTANCE.getSActable();

		/**
		 * The meta object literal for the '<em><b>Root Activity</b></em>' containment reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SACTABLE__ROOT_ACTIVITY = eINSTANCE.getSActable_RootActivity();

		/**
		 * The meta object literal for the '{@link org.metaabm.SAttributeType <em>SAttribute Type</em>}' enum. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.SAttributeType
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSAttributeType()
		 * @generated
		 */
		EEnum SATTRIBUTE_TYPE = eINSTANCE.getSAttributeType();

		/**
		 * The meta object literal for the '{@link org.metaabm.SBorderRule <em>SBorder Rule</em>}' enum.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.metaabm.SBorderRule
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSBorderRule()
		 * @generated
		 */
		EEnum SBORDER_RULE = eINSTANCE.getSBorderRule();

		/**
		 * The meta object literal for the '{@link org.metaabm.SNeighborhoodType <em>SNeighborhood Type</em>}' enum. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.SNeighborhoodType
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSNeighborhoodType()
		 * @generated
		 */
		EEnum SNEIGHBORHOOD_TYPE = eINSTANCE.getSNeighborhoodType();

		/**
		 * The meta object literal for the '{@link org.metaabm.SImplementationMode <em>SImplementation Mode</em>}' enum.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.metaabm.SImplementationMode
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSImplementationMode()
		 * @generated
		 */
		EEnum SIMPLEMENTATION_MODE = eINSTANCE.getSImplementationMode();

		/**
		 * The meta object literal for the '{@link org.metaabm.SShapeType <em>SShape Type</em>}' enum.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @see org.metaabm.SShapeType
		 * @see org.metaabm.impl.MetaABMPackageImpl#getSShapeType()
		 * @generated
		 */
		EEnum SSHAPE_TYPE = eINSTANCE.getSShapeType();

	}

} // MetaABMPackage
