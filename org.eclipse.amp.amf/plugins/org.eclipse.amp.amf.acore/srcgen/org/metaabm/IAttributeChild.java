/**
 * Copyright (c) 2007-2009 Metascape, LLC, Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.metaabm;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IAttribute Child</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.IAttributeChild#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.MetaABMPackage#getIAttributeChild()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IAttributeChild extends IModelExtension {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.metaabm.SAttribute#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(SAttribute)
	 * @see org.metaabm.MetaABMPackage#getIAttributeChild_Parent()
	 * @see org.metaabm.SAttribute#getChildren
	 * @model opposite="children" transient="false"
	 * @generated
	 */
	SAttribute getParent();

	/**
	 * Sets the value of the '{@link org.metaabm.IAttributeChild#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(SAttribute value);

} // IAttributeChild
