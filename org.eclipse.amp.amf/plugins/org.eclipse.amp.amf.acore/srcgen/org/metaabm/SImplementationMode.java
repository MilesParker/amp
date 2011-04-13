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
 * <!-- begin-user-doc --> A representation of the literals of the enumeration ' <em><b>SImplementation Mode</b></em>',
 * and utility methods for working with them.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 * @see org.metaabm.MetaABMPackage#getSImplementationMode()
 * @model
 * @generated
 */
public enum SImplementationMode implements Enumerator {
	/**
	 * The '<em><b>Generate</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #GENERATE
	 * @generated
	 * @ordered
	 */
	GENERATE_LITERAL(1000, "Generate", "GENERATE"),
	/**
	 * The '<em><b>Generate Protected</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #GENERATE_PROTECTED
	 * @generated
	 * @ordered
	 */
	GENERATE_PROTECTED_LITERAL(1500, "GenerateProtected", "GENERATE_PROTECTED"), /**
																																								 * The '<em><b>Generate Empty</b></em>' literal object.
																																								 * <!-- begin-user-doc --> <!-- end-user-doc -->
																																								 * @see #GENERATE_EMPTY
																																								 * @generated
																																								 * @ordered
																																								 */
	GENERATE_EMPTY_LITERAL(1600, "GenerateEmpty", "GENERATE_EMPTY"), /**
																																		 * The '<em><b>Load</b></em>' literal object. <!--
																																		 * begin-user-doc --> <!-- end-user-doc -->
																																		 * 
																																		 * @see #LOAD
																																		 * @generated
																																		 * @ordered
																																		 */
	LOAD_LITERAL(2000, "Load", "LOAD"),
	/**
	 * The '<em><b>External</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #EXTERNAL
	 * @generated
	 * @ordered
	 */
	EXTERNAL_LITERAL(3000, "External", "EXTERNAL");
	/**
	 * The '<em><b>Generate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Generate</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERATE_LITERAL
	 * @model name="Generate" literal="GENERATE"
	 * @generated
	 * @ordered
	 */
	public static final int GENERATE = 1000;

	/**
	 * The '<em><b>Generate Protected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Generate Protected</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERATE_PROTECTED_LITERAL
	 * @model name="GenerateProtected" literal="GENERATE_PROTECTED"
	 * @generated
	 * @ordered
	 */
	public static final int GENERATE_PROTECTED = 1500;

	/**
	 * The '<em><b>Generate Empty</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Generate Empty</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERATE_EMPTY_LITERAL
	 * @model name="GenerateEmpty" literal="GENERATE_EMPTY"
	 * @generated
	 * @ordered
	 */
	public static final int GENERATE_EMPTY = 1600;

	/**
	 * The '<em><b>Load</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Load</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOAD_LITERAL
	 * @model name="Load" literal="LOAD"
	 * @generated
	 * @ordered
	 */
	public static final int LOAD = 2000;

	/**
	 * The '<em><b>External</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>External</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTERNAL_LITERAL
	 * @model name="External" literal="EXTERNAL"
	 * @generated
	 * @ordered
	 */
	public static final int EXTERNAL = 3000;

	/**
	 * An array of all the '<em><b>SImplementation Mode</b></em>' enumerators. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @generated
	 */
	private static final SImplementationMode[] VALUES_ARRAY = new SImplementationMode[] { GENERATE_LITERAL, GENERATE_PROTECTED_LITERAL, GENERATE_EMPTY_LITERAL, LOAD_LITERAL, EXTERNAL_LITERAL, };

	/**
	 * A public read-only list of all the '<em><b>SImplementation Mode</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final List<SImplementationMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SImplementation Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public static SImplementationMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SImplementationMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SImplementation Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static SImplementationMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SImplementationMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SImplementation Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @generated
	 */
	public static SImplementationMode get(int value) {
		switch (value) {
			case GENERATE:
				return GENERATE_LITERAL;
			case GENERATE_PROTECTED:
				return GENERATE_PROTECTED_LITERAL;
			case GENERATE_EMPTY:
				return GENERATE_EMPTY_LITERAL;
			case LOAD:
				return LOAD_LITERAL;
			case EXTERNAL:
				return EXTERNAL_LITERAL;
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
	private SImplementationMode(int value, String name, String literal) {
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
