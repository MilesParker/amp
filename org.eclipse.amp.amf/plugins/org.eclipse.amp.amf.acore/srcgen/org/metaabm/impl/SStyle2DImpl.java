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
import org.metaabm.MetaABMPackage;
import org.metaabm.SAgent;
import org.metaabm.SImplemented;
import org.metaabm.SStyle2D;

/**
 * <!-- begin-user-doc --> An implementation of the model object ' <em><b>SStyle2 D</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SStyle2DImpl extends SStyleImpl implements SStyle2D {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SStyle2DImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaABMPackage.Literals.SSTYLE2_D;
	}

	public SAgent getParent() {
		return getAgent();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public SImplemented basicGetParent() {
		return getParent();
	}

} // SStyle2DImpl