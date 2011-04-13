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

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>ABuild
 * Network</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.act.ABuildNetwork#getNetworkType <em>Network Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.act.MetaABMActPackage#getABuildNetwork()
 * @model
 * @generated
 */
public interface ABuildNetwork extends ABuildProjection {
	/**
	 * Returns the value of the '<em><b>Network Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.metaabm.act.ABuildNetworkTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Type</em>' attribute isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Type</em>' attribute.
	 * @see org.metaabm.act.ABuildNetworkTypes
	 * @see #setNetworkType(ABuildNetworkTypes)
	 * @see org.metaabm.act.MetaABMActPackage#getABuildNetwork_NetworkType()
	 * @model required="true"
	 * @generated
	 */
	ABuildNetworkTypes getNetworkType();

	/**
	 * Sets the value of the '{@link org.metaabm.act.ABuildNetwork#getNetworkType <em>Network Type</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Network Type</em>' attribute.
	 * @see org.metaabm.act.ABuildNetworkTypes
	 * @see #getNetworkType()
	 * @generated
	 */
	void setNetworkType(ABuildNetworkTypes value);

} // ABuildNetwork
