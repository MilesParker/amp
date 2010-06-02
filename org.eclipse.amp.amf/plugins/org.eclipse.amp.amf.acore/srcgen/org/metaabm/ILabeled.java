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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>ILabeled</b></em>'.
 * 
 * @author Miles Parker * <!-- end-user-doc -->
 *         <p>
 *         The following features are supported:
 *         <ul>
 *         <li>{@link org.metaabm.ILabeled#getLabel <em>Label</em>}</li>
 *         </ul>
 *         </p>
 * @see org.metaabmPackage#getILabeled()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ILabeled extends EObject {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String copyright = "";

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute. The default
	 * value is <code>""</code>. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see org.metaabmPackage#getILabeled_Label()
	 * @model default="" unique="false" transient="true" changeable="false"
	 *        volatile="true" derived="true"
	 * @generated
	 */
	String getLabel();

} // ILabeled
