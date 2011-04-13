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
 * </copyright> $Id: AShaped.java,v 1.3 2010/06/16 18:01:15 mparker Exp $
 */
package org.metaabm.act;

import org.eclipse.emf.ecore.EObject;
import org.metaabm.SShapeType;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>AShaped</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.act.AShaped#getShape <em>Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.act.MetaABMActPackage#getAShaped()
 * @model abstract="true"
 * @generated
 */
public interface AShaped extends EObject {
	/**
	 * Returns the value of the '<em><b>Shape</b></em>' attribute.
	 * The default value is <code>"POINT"</code>.
	 * The literals are from the enumeration {@link org.metaabm.SShapeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' attribute.
	 * @see org.metaabm.SShapeType
	 * @see #setShape(SShapeType)
	 * @see org.metaabm.act.MetaABMActPackage#getAShaped_Shape()
	 * @model default="POINT" required="true"
	 * @generated
	 */
	SShapeType getShape();

	/**
	 * Sets the value of the '{@link org.metaabm.act.AShaped#getShape <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' attribute.
	 * @see org.metaabm.SShapeType
	 * @see #getShape()
	 * @generated
	 */
	void setShape(SShapeType value);

} // AShaped
