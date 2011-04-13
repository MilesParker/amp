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
 * </copyright> $Id: SImport.java,v 1.2 2010/06/02 01:19:00 mparker Exp $
 */
package org.metaabm;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>SImport</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.metaabm.SImport#getURI <em>URI</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.metaabm.MetaABMPackage#getSImport()
 * @model
 * @generated
 */
public interface SImport extends IArtifact {
	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see org.metaabm.MetaABMPackage#getSImport_Model()
	 * @model required="true"
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link org.metaabm.SImport#getModel <em>Model</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

} // SImport
