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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>IValue</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.IValue#getAccessors <em>Accessors</em>}</li>
 *   <li>{@link org.metaabm.IValue#getAvailableTypes <em>Available Types</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.MetaABMPackage#getIValue()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IValue extends IID {

	/**
	 * Returns the value of the '<em><b>Accessors</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accessors</em>' reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accessors</em>' reference list.
	 * @see org.metaabm.MetaABMPackage#getIValue_Accessors()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<EObject> getAccessors();

	/**
	 * Returns the value of the '<em><b>Available Types</b></em>' attribute list. The list contents are of type
	 * {@link org.metaabm.SAttributeType}. The literals are from the enumeration {@link org.metaabm.SAttributeType}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Available Types</em>' attribute list isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Available Types</em>' attribute list.
	 * @see org.metaabm.SAttributeType
	 * @see org.metaabm.MetaABMPackage#getIValue_AvailableTypes()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<SAttributeType> getAvailableTypes();

	boolean references(IValue value);

} // IValue
