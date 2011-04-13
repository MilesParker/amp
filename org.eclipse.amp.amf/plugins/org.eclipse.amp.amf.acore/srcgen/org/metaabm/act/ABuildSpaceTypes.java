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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration ' <em><b>ABuild Space Types</b></em>',
 * and utility methods for working with them.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 * @see org.metaabm.act.MetaABMActPackage#getABuildSpaceTypes()
 * @model
 * @generated
 */
public enum ABuildSpaceTypes implements Enumerator {
	/**
	 * The '<em><b>Random</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #RANDOM_VALUE
	 * @generated
	 * @ordered
	 */
	RANDOM(10, "Random", "RANDOM"),
	/**
	 * The '<em><b>Random Around Point</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #RANDOM_AROUND_POINT_VALUE
	 * @generated
	 * @ordered
	 */
	RANDOM_AROUND_POINT(20, "RandomAroundPoint", "RANDOM_POINT"),
	/**
	 * The '<em><b>File</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #FILE_VALUE
	 * @generated
	 * @ordered
	 */
	FILE(30, "File", "FILE");
	/**
	 * The '<em><b>Random</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Random</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RANDOM
	 * @model name="Random" literal="RANDOM"
	 * @generated
	 * @ordered
	 */
	public static final int RANDOM_VALUE = 10;

	/**
	 * The '<em><b>Random Around Point</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Random Around Point</b></em>' literal object isn't clear, there really should be more of
	 * a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RANDOM_AROUND_POINT
	 * @model name="RandomAroundPoint" literal="RANDOM_POINT"
	 * @generated
	 * @ordered
	 */
	public static final int RANDOM_AROUND_POINT_VALUE = 20;

	/**
	 * The '<em><b>File</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>File</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILE
	 * @model name="File" literal="FILE"
	 * @generated
	 * @ordered
	 */
	public static final int FILE_VALUE = 30;

	/**
	 * An array of all the '<em><b>ABuild Space Types</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static final ABuildSpaceTypes[] VALUES_ARRAY = new ABuildSpaceTypes[] { RANDOM, RANDOM_AROUND_POINT, FILE, };

	/**
	 * A public read-only list of all the '<em><b>ABuild Space Types</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final List<ABuildSpaceTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>ABuild Space Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ABuildSpaceTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ABuildSpaceTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ABuild Space Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static ABuildSpaceTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ABuildSpaceTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>ABuild Space Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ABuildSpaceTypes get(int value) {
		switch (value) {
			case RANDOM_VALUE:
				return RANDOM;
			case RANDOM_AROUND_POINT_VALUE:
				return RANDOM_AROUND_POINT;
			case FILE_VALUE:
				return FILE;
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
	private ABuildSpaceTypes(int value, String name, String literal) {
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
}
