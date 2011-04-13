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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc --> A representation of the literals of the enumeration ' <em><b>SAttribute Type</b></em>', and
 * utility methods for working with them.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 * @see org.metaabm.MetaABMPackage#getSAttributeType()
 * @model
 * @generated
 */
public enum SAttributeType implements Enumerator {
	/**
	 * The '<em><b>Boolean</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #BOOLEAN
	 * @generated
	 * @ordered
	 */
	BOOLEAN_LITERAL(100, "Boolean", "BOOLEAN"),

	/**
	 * The '<em><b>Integer</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #INTEGER
	 * @generated
	 * @ordered
	 */
	INTEGER_LITERAL(101, "Integer", "INTEGER"),
	/**
	 * The '<em><b>Real</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #REAL
	 * @generated
	 * @ordered
	 */
	REAL_LITERAL(150, "Real", "REAL"), /**
																			 * The '<em><b>Symbol</b></em>' literal object.
																			 * <!-- begin-user-doc --> <!--
																			 * end-user-doc -->
																			 * @see #SYMBOL
																			 * @generated
																			 * @ordered
																			 */
	SYMBOL_LITERAL(200, "Symbol", "SYMBOL"), /**
																						 * The '<em><b>Undefined</b></em>' literal object.
																						 * <!-- begin-user-doc -->
																						 * <!-- end-user-doc -->
																						 * @see #UNDEFINED
																						 * @generated
																						 * @ordered
																						 */
	UNDEFINED_LITERAL(0, "Undefined", "UNDEFINED"),
	/**
	 * The '<em><b>Numeric</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #NUMERIC
	 * @generated
	 * @ordered
	 */
	NUMERIC_LITERAL(110, "Numeric", "NUMERIC");
	/**
	 * The '<em><b>Boolean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Boolean</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOOLEAN_LITERAL
	 * @model name="Boolean" literal="BOOLEAN"
	 * @generated
	 * @ordered
	 */
	public static final int BOOLEAN = 100;

	/**
	 * The '<em><b>Integer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Integer</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTEGER_LITERAL
	 * @model name="Integer" literal="INTEGER"
	 * @generated
	 * @ordered
	 */
	public static final int INTEGER = 101;

	/**
	 * The '<em><b>Real</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Real</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REAL_LITERAL
	 * @model name="Real" literal="REAL"
	 * @generated
	 * @ordered
	 */
	public static final int REAL = 150;

	/**
	 * The '<em><b>Symbol</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Symbol</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYMBOL_LITERAL
	 * @model name="Symbol" literal="SYMBOL"
	 * @generated
	 * @ordered
	 */
	public static final int SYMBOL = 200;

	/**
	 * The '<em><b>Undefined</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Undefined</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDEFINED_LITERAL
	 * @model name="Undefined" literal="UNDEFINED"
	 * @generated
	 * @ordered
	 */
	public static final int UNDEFINED = 0;

	/**
	 * The '<em><b>Numeric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Numeric</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMERIC_LITERAL
	 * @model name="Numeric" literal="NUMERIC"
	 * @generated
	 * @ordered
	 */
	public static final int NUMERIC = 110;

	/**
	 * An array of all the '<em><b>SAttribute Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static final SAttributeType[] VALUES_ARRAY = new SAttributeType[] { BOOLEAN_LITERAL, INTEGER_LITERAL, REAL_LITERAL, SYMBOL_LITERAL, UNDEFINED_LITERAL, NUMERIC_LITERAL, };

	public final static EList<SAttributeType> EMPTY_TYPES = new BasicEList<SAttributeType>();

	/**
	 * A public read-only list of all the '<em><b>SAttribute Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final List<SAttributeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	public final static EList<SAttributeType> BOOLEAN_ACCEPTS = new BasicEList<SAttributeType>();
	static {
		BOOLEAN_ACCEPTS.add(SAttributeType.BOOLEAN_LITERAL);
	}

	public final static EList<SAttributeType> SYMBOL_ACCEPTS = new BasicEList<SAttributeType>();
	static {
		SYMBOL_ACCEPTS.add(SAttributeType.SYMBOL_LITERAL);
	}

	public final static EList<SAttributeType> REAL_ACCEPTS = new BasicEList<SAttributeType>();
	static {
		REAL_ACCEPTS.add(SAttributeType.REAL_LITERAL);
		REAL_ACCEPTS.add(SAttributeType.NUMERIC_LITERAL);
	}

	public final static EList<SAttributeType> INT_ACCEPTS = new BasicEList<SAttributeType>();
	static {
		INT_ACCEPTS.add(SAttributeType.INTEGER_LITERAL);
		INT_ACCEPTS.add(SAttributeType.REAL_LITERAL);
		INT_ACCEPTS.add(SAttributeType.NUMERIC_LITERAL);
	}

	public final static EList<SAttributeType> NUMERIC_ACCEPTS = new BasicEList<SAttributeType>();
	static {
		NUMERIC_ACCEPTS.add(SAttributeType.INTEGER_LITERAL);
		NUMERIC_ACCEPTS.add(SAttributeType.REAL_LITERAL);
		NUMERIC_ACCEPTS.add(SAttributeType.NUMERIC_LITERAL);
	}

	public final static EList<SAttributeType> UNDEFINED_ACCEPTS = new BasicEList<SAttributeType>();
	static {
		UNDEFINED_ACCEPTS.add(SAttributeType.INTEGER_LITERAL);
		UNDEFINED_ACCEPTS.add(SAttributeType.REAL_LITERAL);
		UNDEFINED_ACCEPTS.add(SAttributeType.NUMERIC_LITERAL);
		UNDEFINED_ACCEPTS.add(SAttributeType.BOOLEAN_LITERAL);
		UNDEFINED_ACCEPTS.add(SAttributeType.SYMBOL_LITERAL);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public static EList<SAttributeType> getAvailableTypes(SAttributeType sourceType) {
		switch (sourceType.getValue()) {
			case SAttributeType.BOOLEAN:
				return SAttributeType.BOOLEAN_ACCEPTS;
			case SAttributeType.REAL:
				return SAttributeType.REAL_ACCEPTS;
			case SAttributeType.INTEGER:
				return SAttributeType.INT_ACCEPTS;
			case SAttributeType.NUMERIC:
				return SAttributeType.NUMERIC_ACCEPTS;
			case SAttributeType.UNDEFINED:
				return SAttributeType.UNDEFINED_ACCEPTS;
			case SAttributeType.SYMBOL:
				return SAttributeType.SYMBOL_ACCEPTS;
			default:
				return SAttributeType.EMPTY_TYPES;
		}
	}

	/**
	 * Returns the '<em><b>SAttribute Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SAttributeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SAttributeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SAttribute Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static SAttributeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SAttributeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SAttribute Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SAttributeType get(int value) {
		switch (value) {
			case BOOLEAN:
				return BOOLEAN_LITERAL;
			case INTEGER:
				return INTEGER_LITERAL;
			case REAL:
				return REAL_LITERAL;
			case SYMBOL:
				return SYMBOL_LITERAL;
			case UNDEFINED:
				return UNDEFINED_LITERAL;
			case NUMERIC:
				return NUMERIC_LITERAL;
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
	private SAttributeType(int value, String name, String literal) {
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
