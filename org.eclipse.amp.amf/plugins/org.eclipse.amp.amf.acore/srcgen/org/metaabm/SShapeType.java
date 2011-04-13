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
 * </copyright> $Id: SShapeType.java,v 1.3 2010/06/16 18:01:14 mparker Exp $
 */
package org.metaabm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration ' <em><b>SShape Type</b></em>', and
 * utility methods for working with them. <!-- end-user-doc -->
 * @see org.metaabm.MetaABMPackage#getSShapeType()
 * @model
 * @generated
 */
public enum SShapeType implements Enumerator {
	/**
	 * The '<em><b>Point</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #POINT_VALUE
	 * @generated
	 * @ordered
	 */
	POINT(1, "Point", "POINT"),

	/**
	 * The '<em><b>Line</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #LINE_VALUE
	 * @generated
	 * @ordered
	 */
	LINE(2, "Line", "LINE"),

	/**
	 * The '<em><b>Polygon</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #POLYGON_VALUE
	 * @generated
	 * @ordered
	 */
	POLYGON(3, "Polygon", "POLYGON");

	/**
	 * The '<em><b>Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Point</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POINT
	 * @model name="Point" literal="POINT"
	 * @generated
	 * @ordered
	 */
	public static final int POINT_VALUE = 1;

	/**
	 * The '<em><b>Line</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Line</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE
	 * @model name="Line" literal="LINE"
	 * @generated
	 * @ordered
	 */
	public static final int LINE_VALUE = 2;

	/**
	 * The '<em><b>Polygon</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Polygon</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POLYGON
	 * @model name="Polygon" literal="POLYGON"
	 * @generated
	 * @ordered
	 */
	public static final int POLYGON_VALUE = 3;

	/**
	 * An array of all the '<em><b>SShape Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static final SShapeType[] VALUES_ARRAY = new SShapeType[] { POINT, LINE, POLYGON, };

	/**
	 * A public read-only list of all the '<em><b>SShape Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final List<SShapeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SShape Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static SShapeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SShapeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SShape Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static SShapeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SShapeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SShape Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static SShapeType get(int value) {
		switch (value) {
			case POINT_VALUE:
				return POINT;
			case LINE_VALUE:
				return LINE;
			case POLYGON_VALUE:
				return POLYGON;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private SShapeType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} // SShapeType
