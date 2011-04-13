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

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>SImplemented</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.SImplemented#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.metaabm.SImplemented#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.MetaABMPackage#getSImplemented()
 * @model abstract="true"
 * @generated
 */
public interface SImplemented extends IID {
	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.metaabm.SImplementation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Implementation</em>' containment reference isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation</em>' containment reference.
	 * @see #setImplementation(SImplementation)
	 * @see org.metaabm.MetaABMPackage#getSImplemented_Implementation()
	 * @see org.metaabm.SImplementation#getTarget
	 * @model opposite="target" containment="true" required="true"
	 * @generated
	 */
	SImplementation getImplementation();

	/**
	 * Sets the value of the '{@link org.metaabm.SImplemented#getImplementation <em>Implementation</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Implementation</em>' containment reference.
	 * @see #getImplementation()
	 * @generated
	 */
	void setImplementation(SImplementation value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see org.metaabm.MetaABMPackage#getSImplemented_Parent()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	SImplemented getParent();

} // SImplemented