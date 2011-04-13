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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration ' <em><b>SNeighborhood Type</b></em>',
 * and utility methods for working with them. <!-- end-user-doc -->
 * @see org.metaabm.MetaABMPackage#getSNeighborhoodType()
 * @model
 * @generated
 */
public enum SNeighborhoodType implements Enumerator {
	/**
	 * The '<em><b>Euclidian</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #EUCLIDIAN_VALUE
	 * @generated
	 * @ordered
	 */
	EUCLIDIAN(10, "Euclidian", "EUCLIDIAN"),

	/**
	 * The '<em><b>Moore</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #MOORE_VALUE
	 * @generated
	 * @ordered
	 */
	MOORE(20, "Moore", "MOORE"),

	/**
	 * The '<em><b>Von Neumann</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #VON_NEUMANN_VALUE
	 * @generated
	 * @ordered
	 */
	VON_NEUMANN(30, "VonNeumann", "VON_NEUMANN");

	/**
	 * The '<em><b>Euclidian</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Euclidian</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EUCLIDIAN
	 * @model name="Euclidian" literal="EUCLIDIAN"
	 * @generated
	 * @ordered
	 */
	public static final int EUCLIDIAN_VALUE = 10;

	/**
	 * The '<em><b>Moore</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Moore</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOORE
	 * @model name="Moore" literal="MOORE"
	 * @generated
	 * @ordered
	 */
	public static final int MOORE_VALUE = 20;

	/**
	 * The '<em><b>Von Neumann</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Von Neumann</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VON_NEUMANN
	 * @model name="VonNeumann" literal="VON_NEUMANN"
	 * @generated
	 * @ordered
	 */
	public static final int VON_NEUMANN_VALUE = 30;

	/**
	 * An array of all the '<em><b>SNeighborhood Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static final SNeighborhoodType[] VALUES_ARRAY = new SNeighborhoodType[] { EUCLIDIAN, MOORE, VON_NEUMANN, };

	/**
	 * A public read-only list of all the '<em><b>SNeighborhood Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final List<SNeighborhoodType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SNeighborhood Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SNeighborhoodType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SNeighborhoodType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SNeighborhood Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static SNeighborhoodType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SNeighborhoodType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SNeighborhood Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SNeighborhoodType get(int value) {
		switch (value) {
			case EUCLIDIAN_VALUE:
				return EUCLIDIAN;
			case MOORE_VALUE:
				return MOORE;
			case VON_NEUMANN_VALUE:
				return VON_NEUMANN;
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
	private SNeighborhoodType(int value, String name, String literal) {
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

} // SNeighborhoodType
