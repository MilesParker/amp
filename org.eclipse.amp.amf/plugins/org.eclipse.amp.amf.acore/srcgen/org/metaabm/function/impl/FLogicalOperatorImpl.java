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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.metaabm.SAttributeType;
import org.metaabm.function.FLogicalOperator;
import org.metaabm.function.MetaABMFunctionPackage;

/*
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>FLogical Operator</b></em>'.
 * @author Miles Parker <!-- end-user-doc --> <p> </p>
 * @generated
 */
public class FLogicalOperatorImpl extends FOperatorImpl implements FLogicalOperator {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FLogicalOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMFunctionPackage.Literals.FLOGICAL_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<SAttributeType> getAvailableTypes() {
		return new EcoreEList.UnmodifiableEList.FastCompare<SAttributeType>(this, MetaABMFunctionPackage.Literals.FFUNCTION__AVAILABLE_TYPES, SAttributeType.BOOLEAN_ACCEPTS.size(), SAttributeType.BOOLEAN_ACCEPTS.toArray());
	}

} // FLogicalOperatorImpl
