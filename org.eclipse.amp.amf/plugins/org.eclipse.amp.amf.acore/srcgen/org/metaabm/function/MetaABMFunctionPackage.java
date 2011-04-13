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
package org.metaabm.function;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.metaabm.function.MetaABMFunctionFactory
 * @model kind="package"
 * @generated
 */
public interface MetaABMFunctionPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "function";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://metaabm.org/function";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "function";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	MetaABMFunctionPackage eINSTANCE = org.metaabm.function.impl.MetaABMFunctionPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.metaabm.function.impl.FArgumentPrototypeImpl <em>FArgument Prototype</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.metaabm.function.impl.FArgumentPrototypeImpl
	 * @see org.metaabm.function.impl.MetaABMFunctionPackageImpl#getFArgumentPrototype()
	 * @generated
	 */
	int FARGUMENT_PROTOTYPE = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARGUMENT_PROTOTYPE__LABEL = MetaABMPackage.ITYPED__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARGUMENT_PROTOTYPE__ID = MetaABMPackage.ITYPED__ID;

	/**
	 * The feature id for the '<em><b>SType</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARGUMENT_PROTOTYPE__STYPE = MetaABMPackage.ITYPED__STYPE;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARGUMENT_PROTOTYPE__PLURAL_LABEL = MetaABMPackage.ITYPED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARGUMENT_PROTOTYPE__DESCRIPTION = MetaABMPackage.ITYPED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Input Function</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARGUMENT_PROTOTYPE__INPUT_FUNCTION = MetaABMPackage.ITYPED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Output Function</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARGUMENT_PROTOTYPE__OUTPUT_FUNCTION = MetaABMPackage.ITYPED_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARGUMENT_PROTOTYPE__OPTIONAL = MetaABMPackage.ITYPED_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>FArgument Prototype</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARGUMENT_PROTOTYPE_FEATURE_COUNT = MetaABMPackage.ITYPED_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.metaabm.function.impl.FFunctionImpl <em>FFunction</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.function.impl.FFunctionImpl
	 * @see org.metaabm.function.impl.MetaABMFunctionPackageImpl#getFFunction()
	 * @generated
	 */
	int FFUNCTION = 2;

	/**
	 * The meta object id for the '{@link org.metaabm.function.FLogical <em>FLogical</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.metaabm.function.FLogical
	 * @see org.metaabm.function.impl.MetaABMFunctionPackageImpl#getFLogical()
	 * @generated
	 */
	int FLOGICAL = 3;

	/**
	 * The meta object id for the '{@link org.metaabm.function.impl.FOperatorImpl <em>FOperator</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.function.impl.FOperatorImpl
	 * @see org.metaabm.function.impl.MetaABMFunctionPackageImpl#getFOperator()
	 * @generated
	 */
	int FOPERATOR = 4;

	/**
	 * The meta object id for the '{@link org.metaabm.function.impl.FLogicalOperatorImpl <em>FLogical Operator</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.metaabm.function.impl.FLogicalOperatorImpl
	 * @see org.metaabm.function.impl.MetaABMFunctionPackageImpl#getFLogicalOperator()
	 * @generated
	 */
	int FLOGICAL_OPERATOR = 5;

	/**
	 * The meta object id for the '{@link org.metaabm.function.impl.FGenericImpl <em>FGeneric</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.function.impl.FGenericImpl
	 * @see org.metaabm.function.impl.MetaABMFunctionPackageImpl#getFGeneric()
	 * @generated
	 */
	int FGENERIC = 6;

	/**
	 * The meta object id for the '{@link org.metaabm.function.impl.FGenericFunctionImpl <em>FGeneric Function</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.metaabm.function.impl.FGenericFunctionImpl
	 * @see org.metaabm.function.impl.MetaABMFunctionPackageImpl#getFGenericFunction()
	 * @generated
	 */
	int FGENERIC_FUNCTION = 7;

	/**
	 * The meta object id for the '{@link org.metaabm.function.impl.FGenericLogicalImpl <em>FGeneric Logical</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.metaabm.function.impl.FGenericLogicalImpl
	 * @see org.metaabm.function.impl.MetaABMFunctionPackageImpl#getFGenericLogical()
	 * @generated
	 */
	int FGENERIC_LOGICAL = 8;

	/**
	 * The meta object id for the '{@link org.metaabm.function.impl.FLibraryImpl <em>FLibrary</em>}' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.metaabm.function.impl.FLibraryImpl
	 * @see org.metaabm.function.impl.MetaABMFunctionPackageImpl#getFLibrary()
	 * @generated
	 */
	int FLIBRARY = 9;

	/**
	 * The meta object id for the '{@link org.metaabm.function.impl.FArgumentArrayPrototypeImpl <em>FArgument Array Prototype</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.metaabm.function.impl.FArgumentArrayPrototypeImpl
	 * @see org.metaabm.function.impl.MetaABMFunctionPackageImpl#getFArgumentArrayPrototype()
	 * @generated
	 */
	int FARGUMENT_ARRAY_PROTOTYPE = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARGUMENT_ARRAY_PROTOTYPE__LABEL = FARGUMENT_PROTOTYPE__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARGUMENT_ARRAY_PROTOTYPE__ID = FARGUMENT_PROTOTYPE__ID;

	/**
	 * The feature id for the '<em><b>SType</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARGUMENT_ARRAY_PROTOTYPE__STYPE = FARGUMENT_PROTOTYPE__STYPE;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARGUMENT_ARRAY_PROTOTYPE__PLURAL_LABEL = FARGUMENT_PROTOTYPE__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARGUMENT_ARRAY_PROTOTYPE__DESCRIPTION = FARGUMENT_PROTOTYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Input Function</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARGUMENT_ARRAY_PROTOTYPE__INPUT_FUNCTION = FARGUMENT_PROTOTYPE__INPUT_FUNCTION;

	/**
	 * The feature id for the '<em><b>Output Function</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARGUMENT_ARRAY_PROTOTYPE__OUTPUT_FUNCTION = FARGUMENT_PROTOTYPE__OUTPUT_FUNCTION;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARGUMENT_ARRAY_PROTOTYPE__OPTIONAL = FARGUMENT_PROTOTYPE__OPTIONAL;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARGUMENT_ARRAY_PROTOTYPE__SIZE = FARGUMENT_PROTOTYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FArgument Array Prototype</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FARGUMENT_ARRAY_PROTOTYPE_FEATURE_COUNT = FARGUMENT_PROTOTYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FFUNCTION__LABEL = MetaABMPackage.IID__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FFUNCTION__ID = MetaABMPackage.IID__ID;

	/**
	 * The feature id for the '<em><b>Available Types</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FFUNCTION__AVAILABLE_TYPES = MetaABMPackage.IID_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Input Prototypes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FFUNCTION__INPUT_PROTOTYPES = MetaABMPackage.IID_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multi Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FFUNCTION__MULTI_VALUE = MetaABMPackage.IID_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>FFunction</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FFUNCTION_FEATURE_COUNT = MetaABMPackage.IID_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOGICAL__LABEL = FFUNCTION__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOGICAL__ID = FFUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Available Types</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FLOGICAL__AVAILABLE_TYPES = FFUNCTION__AVAILABLE_TYPES;

	/**
	 * The feature id for the '<em><b>Input Prototypes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOGICAL__INPUT_PROTOTYPES = FFUNCTION__INPUT_PROTOTYPES;

	/**
	 * The feature id for the '<em><b>Multi Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOGICAL__MULTI_VALUE = FFUNCTION__MULTI_VALUE;

	/**
	 * The number of structural features of the '<em>FLogical</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOGICAL_FEATURE_COUNT = FFUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOPERATOR__LABEL = FFUNCTION__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOPERATOR__ID = FFUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Available Types</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FOPERATOR__AVAILABLE_TYPES = FFUNCTION__AVAILABLE_TYPES;

	/**
	 * The feature id for the '<em><b>Input Prototypes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOPERATOR__INPUT_PROTOTYPES = FFUNCTION__INPUT_PROTOTYPES;

	/**
	 * The feature id for the '<em><b>Multi Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOPERATOR__MULTI_VALUE = FFUNCTION__MULTI_VALUE;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOPERATOR__PLURAL_LABEL = FFUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOPERATOR__DESCRIPTION = FFUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOPERATOR__SYMBOL = FFUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Arity</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOPERATOR__ARITY = FFUNCTION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>FOperator</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOPERATOR_FEATURE_COUNT = FFUNCTION_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOGICAL_OPERATOR__LABEL = FOPERATOR__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOGICAL_OPERATOR__ID = FOPERATOR__ID;

	/**
	 * The feature id for the '<em><b>Available Types</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FLOGICAL_OPERATOR__AVAILABLE_TYPES = FOPERATOR__AVAILABLE_TYPES;

	/**
	 * The feature id for the '<em><b>Input Prototypes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOGICAL_OPERATOR__INPUT_PROTOTYPES = FOPERATOR__INPUT_PROTOTYPES;

	/**
	 * The feature id for the '<em><b>Multi Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOGICAL_OPERATOR__MULTI_VALUE = FOPERATOR__MULTI_VALUE;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOGICAL_OPERATOR__PLURAL_LABEL = FOPERATOR__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOGICAL_OPERATOR__DESCRIPTION = FOPERATOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOGICAL_OPERATOR__SYMBOL = FOPERATOR__SYMBOL;

	/**
	 * The feature id for the '<em><b>Arity</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOGICAL_OPERATOR__ARITY = FOPERATOR__ARITY;

	/**
	 * The number of structural features of the '<em>FLogical Operator</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOGICAL_OPERATOR_FEATURE_COUNT = FOPERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FGENERIC__LABEL = FFUNCTION__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FGENERIC__ID = FFUNCTION__ID;

	/**
	 * The feature id for the '<em><b>Available Types</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FGENERIC__AVAILABLE_TYPES = FFUNCTION__AVAILABLE_TYPES;

	/**
	 * The feature id for the '<em><b>Input Prototypes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FGENERIC__INPUT_PROTOTYPES = FFUNCTION__INPUT_PROTOTYPES;

	/**
	 * The feature id for the '<em><b>Multi Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FGENERIC__MULTI_VALUE = FFUNCTION__MULTI_VALUE;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FGENERIC__PLURAL_LABEL = FFUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FGENERIC__DESCRIPTION = FFUNCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FGeneric</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FGENERIC_FEATURE_COUNT = FFUNCTION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FGENERIC_FUNCTION__LABEL = FGENERIC__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FGENERIC_FUNCTION__ID = FGENERIC__ID;

	/**
	 * The feature id for the '<em><b>Available Types</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FGENERIC_FUNCTION__AVAILABLE_TYPES = FGENERIC__AVAILABLE_TYPES;

	/**
	 * The feature id for the '<em><b>Input Prototypes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FGENERIC_FUNCTION__INPUT_PROTOTYPES = FGENERIC__INPUT_PROTOTYPES;

	/**
	 * The feature id for the '<em><b>Multi Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FGENERIC_FUNCTION__MULTI_VALUE = FGENERIC__MULTI_VALUE;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FGENERIC_FUNCTION__PLURAL_LABEL = FGENERIC__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FGENERIC_FUNCTION__DESCRIPTION = FGENERIC__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Output Prototypes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FGENERIC_FUNCTION__OUTPUT_PROTOTYPES = FGENERIC_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FGeneric Function</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FGENERIC_FUNCTION_FEATURE_COUNT = FGENERIC_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FGENERIC_LOGICAL__LABEL = FGENERIC__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FGENERIC_LOGICAL__ID = FGENERIC__ID;

	/**
	 * The feature id for the '<em><b>Available Types</b></em>' attribute list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FGENERIC_LOGICAL__AVAILABLE_TYPES = FGENERIC__AVAILABLE_TYPES;

	/**
	 * The feature id for the '<em><b>Input Prototypes</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FGENERIC_LOGICAL__INPUT_PROTOTYPES = FGENERIC__INPUT_PROTOTYPES;

	/**
	 * The feature id for the '<em><b>Multi Value</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FGENERIC_LOGICAL__MULTI_VALUE = FGENERIC__MULTI_VALUE;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FGENERIC_LOGICAL__PLURAL_LABEL = FGENERIC__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FGENERIC_LOGICAL__DESCRIPTION = FGENERIC__DESCRIPTION;

	/**
	 * The number of structural features of the '<em>FGeneric Logical</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FGENERIC_LOGICAL_FEATURE_COUNT = FGENERIC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIBRARY__LABEL = MetaABMPackage.SNAMED__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIBRARY__ID = MetaABMPackage.SNAMED__ID;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIBRARY__PLURAL_LABEL = MetaABMPackage.SNAMED__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIBRARY__DESCRIPTION = MetaABMPackage.SNAMED__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIBRARY__FUNCTIONS = MetaABMPackage.SNAMED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subs</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FLIBRARY__SUBS = MetaABMPackage.SNAMED_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FLibrary</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLIBRARY_FEATURE_COUNT = MetaABMPackage.SNAMED_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.metaabm.function.impl.FImplementedLibraryImpl <em>FImplemented Library</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.metaabm.function.impl.FImplementedLibraryImpl
	 * @see org.metaabm.function.impl.MetaABMFunctionPackageImpl#getFImplementedLibrary()
	 * @generated
	 */
	int FIMPLEMENTED_LIBRARY = 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIMPLEMENTED_LIBRARY__LABEL = MetaABMPackage.SIMPLEMENTED__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIMPLEMENTED_LIBRARY__ID = MetaABMPackage.SIMPLEMENTED__ID;

	/**
	 * The feature id for the '<em><b>Implementation</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIMPLEMENTED_LIBRARY__IMPLEMENTATION = MetaABMPackage.SIMPLEMENTED__IMPLEMENTATION;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIMPLEMENTED_LIBRARY__PARENT = MetaABMPackage.SIMPLEMENTED__PARENT;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIMPLEMENTED_LIBRARY__PLURAL_LABEL = MetaABMPackage.SIMPLEMENTED_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIMPLEMENTED_LIBRARY__DESCRIPTION = MetaABMPackage.SIMPLEMENTED_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIMPLEMENTED_LIBRARY__FUNCTIONS = MetaABMPackage.SIMPLEMENTED_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Subs</b></em>' containment reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FIMPLEMENTED_LIBRARY__SUBS = MetaABMPackage.SIMPLEMENTED_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>FImplemented Library</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIMPLEMENTED_LIBRARY_FEATURE_COUNT = MetaABMPackage.SIMPLEMENTED_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.metaabm.function.impl.FMultiArgumentPrototypeImpl <em>FMulti Argument Prototype</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see org.metaabm.function.impl.FMultiArgumentPrototypeImpl
	 * @see org.metaabm.function.impl.MetaABMFunctionPackageImpl#getFMultiArgumentPrototype()
	 * @generated
	 */
	int FMULTI_ARGUMENT_PROTOTYPE = 11;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMULTI_ARGUMENT_PROTOTYPE__LABEL = FARGUMENT_PROTOTYPE__LABEL;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMULTI_ARGUMENT_PROTOTYPE__ID = FARGUMENT_PROTOTYPE__ID;

	/**
	 * The feature id for the '<em><b>SType</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMULTI_ARGUMENT_PROTOTYPE__STYPE = FARGUMENT_PROTOTYPE__STYPE;

	/**
	 * The feature id for the '<em><b>Plural Label</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMULTI_ARGUMENT_PROTOTYPE__PLURAL_LABEL = FARGUMENT_PROTOTYPE__PLURAL_LABEL;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMULTI_ARGUMENT_PROTOTYPE__DESCRIPTION = FARGUMENT_PROTOTYPE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Input Function</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMULTI_ARGUMENT_PROTOTYPE__INPUT_FUNCTION = FARGUMENT_PROTOTYPE__INPUT_FUNCTION;

	/**
	 * The feature id for the '<em><b>Output Function</b></em>' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMULTI_ARGUMENT_PROTOTYPE__OUTPUT_FUNCTION = FARGUMENT_PROTOTYPE__OUTPUT_FUNCTION;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMULTI_ARGUMENT_PROTOTYPE__OPTIONAL = FARGUMENT_PROTOTYPE__OPTIONAL;

	/**
	 * The number of structural features of the '<em>FMulti Argument Prototype</em>' class.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FMULTI_ARGUMENT_PROTOTYPE_FEATURE_COUNT = FARGUMENT_PROTOTYPE_FEATURE_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link org.metaabm.function.FArgumentPrototype <em>FArgument Prototype</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>FArgument Prototype</em>'.
	 * @see org.metaabm.function.FArgumentPrototype
	 * @generated
	 */
	EClass getFArgumentPrototype();

	/**
	 * Returns the meta object for the container reference '{@link org.metaabm.function.FArgumentPrototype#getInputFunction <em>Input Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Input Function</em>'.
	 * @see org.metaabm.function.FArgumentPrototype#getInputFunction()
	 * @see #getFArgumentPrototype()
	 * @generated
	 */
	EReference getFArgumentPrototype_InputFunction();

	/**
	 * Returns the meta object for the container reference '{@link org.metaabm.function.FArgumentPrototype#getOutputFunction <em>Output Function</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Output Function</em>'.
	 * @see org.metaabm.function.FArgumentPrototype#getOutputFunction()
	 * @see #getFArgumentPrototype()
	 * @generated
	 */
	EReference getFArgumentPrototype_OutputFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.metaabm.function.FArgumentPrototype#isOptional <em>Optional</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Optional</em>'.
	 * @see org.metaabm.function.FArgumentPrototype#isOptional()
	 * @see #getFArgumentPrototype()
	 * @generated
	 */
	EAttribute getFArgumentPrototype_Optional();

	/**
	 * Returns the meta object for class '{@link org.metaabm.function.FFunction <em>FFunction</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>FFunction</em>'.
	 * @see org.metaabm.function.FFunction
	 * @generated
	 */
	EClass getFFunction();

	/**
	 * Returns the meta object for the attribute list '{@link org.metaabm.function.FFunction#getAvailableTypes <em>Available Types</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Available Types</em>'.
	 * @see org.metaabm.function.FFunction#getAvailableTypes()
	 * @see #getFFunction()
	 * @generated
	 */
	EAttribute getFFunction_AvailableTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.metaabm.function.FFunction#getInputPrototypes <em>Input Prototypes</em>}'.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input Prototypes</em>'.
	 * @see org.metaabm.function.FFunction#getInputPrototypes()
	 * @see #getFFunction()
	 * @generated
	 */
	EReference getFFunction_InputPrototypes();

	/**
	 * Returns the meta object for the attribute '{@link org.metaabm.function.FFunction#isMultiValue <em>Multi Value</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Value</em>'.
	 * @see org.metaabm.function.FFunction#isMultiValue()
	 * @see #getFFunction()
	 * @generated
	 */
	EAttribute getFFunction_MultiValue();

	/**
	 * Returns the meta object for class '{@link org.metaabm.function.FLogical <em>FLogical</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>FLogical</em>'.
	 * @see org.metaabm.function.FLogical
	 * @generated
	 */
	EClass getFLogical();

	/**
	 * Returns the meta object for class '{@link org.metaabm.function.FOperator <em>FOperator</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>FOperator</em>'.
	 * @see org.metaabm.function.FOperator
	 * @generated
	 */
	EClass getFOperator();

	/**
	 * Returns the meta object for the attribute ' {@link org.metaabm.function.FOperator#getSymbol <em>Symbol</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see org.metaabm.function.FOperator#getSymbol()
	 * @see #getFOperator()
	 * @generated
	 */
	EAttribute getFOperator_Symbol();

	/**
	 * Returns the meta object for the attribute ' {@link org.metaabm.function.FOperator#getArity <em>Arity</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Arity</em>'.
	 * @see org.metaabm.function.FOperator#getArity()
	 * @see #getFOperator()
	 * @generated
	 */
	EAttribute getFOperator_Arity();

	/**
	 * Returns the meta object for class '{@link org.metaabm.function.FLogicalOperator <em>FLogical Operator</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>FLogical Operator</em>'.
	 * @see org.metaabm.function.FLogicalOperator
	 * @generated
	 */
	EClass getFLogicalOperator();

	/**
	 * Returns the meta object for class '{@link org.metaabm.function.FGeneric <em>FGeneric</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>FGeneric</em>'.
	 * @see org.metaabm.function.FGeneric
	 * @generated
	 */
	EClass getFGeneric();

	/**
	 * Returns the meta object for class '{@link org.metaabm.function.FGenericFunction <em>FGeneric Function</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>FGeneric Function</em>'.
	 * @see org.metaabm.function.FGenericFunction
	 * @generated
	 */
	EClass getFGenericFunction();

	/**
	 * Returns the meta object for the containment reference list '{@link org.metaabm.function.FGenericFunction#getOutputPrototypes <em>Output Prototypes</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Output Prototypes</em>'.
	 * @see org.metaabm.function.FGenericFunction#getOutputPrototypes()
	 * @see #getFGenericFunction()
	 * @generated
	 */
	EReference getFGenericFunction_OutputPrototypes();

	/**
	 * Returns the meta object for class '{@link org.metaabm.function.FGenericLogical <em>FGeneric Logical</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>FGeneric Logical</em>'.
	 * @see org.metaabm.function.FGenericLogical
	 * @generated
	 */
	EClass getFGenericLogical();

	/**
	 * Returns the meta object for class '{@link org.metaabm.function.FLibrary <em>FLibrary</em>}'.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>FLibrary</em>'.
	 * @see org.metaabm.function.FLibrary
	 * @generated
	 */
	EClass getFLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link org.metaabm.function.FLibrary#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see org.metaabm.function.FLibrary#getFunctions()
	 * @see #getFLibrary()
	 * @generated
	 */
	EReference getFLibrary_Functions();

	/**
	 * Returns the meta object for the containment reference list '{@link org.metaabm.function.FLibrary#getSubs <em>Subs</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subs</em>'.
	 * @see org.metaabm.function.FLibrary#getSubs()
	 * @see #getFLibrary()
	 * @generated
	 */
	EReference getFLibrary_Subs();

	/**
	 * Returns the meta object for class '{@link org.metaabm.function.FImplementedLibrary <em>FImplemented Library</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>FImplemented Library</em>'.
	 * @see org.metaabm.function.FImplementedLibrary
	 * @generated
	 */
	EClass getFImplementedLibrary();

	/**
	 * Returns the meta object for class '{@link org.metaabm.function.FMultiArgumentPrototype <em>FMulti Argument Prototype</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>FMulti Argument Prototype</em>'.
	 * @see org.metaabm.function.FMultiArgumentPrototype
	 * @generated
	 */
	EClass getFMultiArgumentPrototype();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetaABMFunctionFactory getMetaABMFunctionFactory();

	/**
	 * Returns the meta object for class '{@link org.metaabm.function.FArgumentArrayPrototype <em>FArgument Array Prototype</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the meta object for class '<em>FArgument Array Prototype</em>'.
	 * @see org.metaabm.function.FArgumentArrayPrototype
	 * @generated
	 */
	EClass getFArgumentArrayPrototype();

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
		 * The meta object literal for the '{@link org.metaabm.function.impl.FArgumentPrototypeImpl <em>FArgument Prototype</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.metaabm.function.impl.FArgumentPrototypeImpl
		 * @see org.metaabm.function.impl.MetaABMFunctionPackageImpl#getFArgumentPrototype()
		 * @generated
		 */
		EClass FARGUMENT_PROTOTYPE = eINSTANCE.getFArgumentPrototype();

		/**
		 * The meta object literal for the '<em><b>Input Function</b></em>' container reference feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference FARGUMENT_PROTOTYPE__INPUT_FUNCTION = eINSTANCE.getFArgumentPrototype_InputFunction();

		/**
		 * The meta object literal for the '<em><b>Output Function</b></em>' container reference feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FARGUMENT_PROTOTYPE__OUTPUT_FUNCTION = eINSTANCE.getFArgumentPrototype_OutputFunction();

		/**
		 * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute FARGUMENT_PROTOTYPE__OPTIONAL = eINSTANCE.getFArgumentPrototype_Optional();

		/**
		 * The meta object literal for the '{@link org.metaabm.function.impl.FFunctionImpl <em>FFunction</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.function.impl.FFunctionImpl
		 * @see org.metaabm.function.impl.MetaABMFunctionPackageImpl#getFFunction()
		 * @generated
		 */
		EClass FFUNCTION = eINSTANCE.getFFunction();

		/**
		 * The meta object literal for the '<em><b>Available Types</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FFUNCTION__AVAILABLE_TYPES = eINSTANCE.getFFunction_AvailableTypes();

		/**
		 * The meta object literal for the '<em><b>Input Prototypes</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FFUNCTION__INPUT_PROTOTYPES = eINSTANCE.getFFunction_InputPrototypes();

		/**
		 * The meta object literal for the '<em><b>Multi Value</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute FFUNCTION__MULTI_VALUE = eINSTANCE.getFFunction_MultiValue();

		/**
		 * The meta object literal for the ' {@link org.metaabm.function.FLogical <em>FLogical</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.function.FLogical
		 * @see org.metaabm.function.impl.MetaABMFunctionPackageImpl#getFLogical()
		 * @generated
		 */
		EClass FLOGICAL = eINSTANCE.getFLogical();

		/**
		 * The meta object literal for the '{@link org.metaabm.function.impl.FOperatorImpl <em>FOperator</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.function.impl.FOperatorImpl
		 * @see org.metaabm.function.impl.MetaABMFunctionPackageImpl#getFOperator()
		 * @generated
		 */
		EClass FOPERATOR = eINSTANCE.getFOperator();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute FOPERATOR__SYMBOL = eINSTANCE.getFOperator_Symbol();

		/**
		 * The meta object literal for the '<em><b>Arity</b></em>' attribute feature.
		 * <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * @generated
		 */
		EAttribute FOPERATOR__ARITY = eINSTANCE.getFOperator_Arity();

		/**
		 * The meta object literal for the '{@link org.metaabm.function.impl.FLogicalOperatorImpl <em>FLogical Operator</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.metaabm.function.impl.FLogicalOperatorImpl
		 * @see org.metaabm.function.impl.MetaABMFunctionPackageImpl#getFLogicalOperator()
		 * @generated
		 */
		EClass FLOGICAL_OPERATOR = eINSTANCE.getFLogicalOperator();

		/**
		 * The meta object literal for the '{@link org.metaabm.function.impl.FGenericImpl <em>FGeneric</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.function.impl.FGenericImpl
		 * @see org.metaabm.function.impl.MetaABMFunctionPackageImpl#getFGeneric()
		 * @generated
		 */
		EClass FGENERIC = eINSTANCE.getFGeneric();

		/**
		 * The meta object literal for the '{@link org.metaabm.function.impl.FGenericFunctionImpl <em>FGeneric Function</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.metaabm.function.impl.FGenericFunctionImpl
		 * @see org.metaabm.function.impl.MetaABMFunctionPackageImpl#getFGenericFunction()
		 * @generated
		 */
		EClass FGENERIC_FUNCTION = eINSTANCE.getFGenericFunction();

		/**
		 * The meta object literal for the '<em><b>Output Prototypes</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FGENERIC_FUNCTION__OUTPUT_PROTOTYPES = eINSTANCE.getFGenericFunction_OutputPrototypes();

		/**
		 * The meta object literal for the '{@link org.metaabm.function.impl.FGenericLogicalImpl <em>FGeneric Logical</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.metaabm.function.impl.FGenericLogicalImpl
		 * @see org.metaabm.function.impl.MetaABMFunctionPackageImpl#getFGenericLogical()
		 * @generated
		 */
		EClass FGENERIC_LOGICAL = eINSTANCE.getFGenericLogical();

		/**
		 * The meta object literal for the '{@link org.metaabm.function.impl.FLibraryImpl <em>FLibrary</em>}' class. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see org.metaabm.function.impl.FLibraryImpl
		 * @see org.metaabm.function.impl.MetaABMFunctionPackageImpl#getFLibrary()
		 * @generated
		 */
		EClass FLIBRARY = eINSTANCE.getFLibrary();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference FLIBRARY__FUNCTIONS = eINSTANCE.getFLibrary_Functions();

		/**
		 * The meta object literal for the '<em><b>Subs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLIBRARY__SUBS = eINSTANCE.getFLibrary_Subs();

		/**
		 * The meta object literal for the '{@link org.metaabm.function.impl.FImplementedLibraryImpl <em>FImplemented Library</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.metaabm.function.impl.FImplementedLibraryImpl
		 * @see org.metaabm.function.impl.MetaABMFunctionPackageImpl#getFImplementedLibrary()
		 * @generated
		 */
		EClass FIMPLEMENTED_LIBRARY = eINSTANCE.getFImplementedLibrary();

		/**
		 * The meta object literal for the '{@link org.metaabm.function.impl.FMultiArgumentPrototypeImpl <em>FMulti Argument Prototype</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.metaabm.function.impl.FMultiArgumentPrototypeImpl
		 * @see org.metaabm.function.impl.MetaABMFunctionPackageImpl#getFMultiArgumentPrototype()
		 * @generated
		 */
		EClass FMULTI_ARGUMENT_PROTOTYPE = eINSTANCE.getFMultiArgumentPrototype();

		/**
		 * The meta object literal for the '{@link org.metaabm.function.impl.FArgumentArrayPrototypeImpl <em>FArgument Array Prototype</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * @see org.metaabm.function.impl.FArgumentArrayPrototypeImpl
		 * @see org.metaabm.function.impl.MetaABMFunctionPackageImpl#getFArgumentArrayPrototype()
		 * @generated
		 */
		EClass FARGUMENT_ARRAY_PROTOTYPE = eINSTANCE.getFArgumentArrayPrototype();

	}

} // MetaABMFunctionPackage
