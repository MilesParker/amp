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
 * </copyright> $Id: SStyleShape.java,v 1.3 2010/06/16 18:01:14 mparker Exp $
 */
package org.metaabm;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>SStyle
 * Shape</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.SStyleShape#getShape <em>Shape</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.MetaABMPackage#getSStyleShape()
 * @model
 * @generated
 */
public interface SStyleShape extends SStyle2D {
	/**
	 * Returns the value of the '<em><b>Shape</b></em>' attribute.
	 * The literals are from the enumeration {@link org.metaabm.SShapeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape</em>' attribute isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' attribute.
	 * @see org.metaabm.SShapeType
	 * @see #setShape(SShapeType)
	 * @see org.metaabm.MetaABMPackage#getSStyleShape_Shape()
	 * @model required="true"
	 * @generated
	 */
	SShapeType getShape();

	/**
	 * Sets the value of the '{@link org.metaabm.SStyleShape#getShape <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' attribute.
	 * @see org.metaabm.SShapeType
	 * @see #getShape()
	 * @generated
	 */
	void setShape(SShapeType value);

} // SStyleShape
