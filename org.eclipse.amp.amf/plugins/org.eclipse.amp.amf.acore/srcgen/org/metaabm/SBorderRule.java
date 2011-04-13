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
 * <!-- begin-user-doc --> A representation of the literals of the enumeration ' <em><b>SBorder Rule</b></em>', and
 * utility methods for working with them.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 * @see org.metaabm.MetaABMPackage#getSBorderRule()
 * @model
 * @generated
 */
public enum SBorderRule implements Enumerator {
	/**
	 * The '<em><b>Sticky</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #STICKY
	 * @generated
	 * @ordered
	 */
	STICKY_LITERAL(1000, "Sticky", "STICKY"),
	/**
	 * The '<em><b>Strict</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #STRICT
	 * @generated
	 * @ordered
	 */
	STRICT_LITERAL(100, "Strict", "STRICT"),
	/**
	 * The '<em><b>Bouncy</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #BOUNCY
	 * @generated
	 * @ordered
	 */
	BOUNCY_LITERAL(2000, "Bouncy", "BOUNCY"),
	/**
	 * The '<em><b>Periodic</b></em>' literal object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #PERIODIC
	 * @generated
	 * @ordered
	 */
	PERIODIC_LITERAL(3000, "Periodic", "PERIODIC");
	/**
	 * The '<em><b>Sticky</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sticky</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STICKY_LITERAL
	 * @model name="Sticky" literal="STICKY"
	 * @generated
	 * @ordered
	 */
	public static final int STICKY = 1000;

	/**
	 * The '<em><b>Strict</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Strict</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRICT_LITERAL
	 * @model name="Strict" literal="STRICT"
	 * @generated
	 * @ordered
	 */
	public static final int STRICT = 100;

	/**
	 * The '<em><b>Bouncy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bouncy</b></em>' literal object isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOUNCY_LITERAL
	 * @model name="Bouncy" literal="BOUNCY"
	 * @generated
	 * @ordered
	 */
	public static final int BOUNCY = 2000;

	/**
	 * The '<em><b>Periodic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Periodic</b></em>' literal object isn't clear, there really should be more of a
	 * description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERIODIC_LITERAL
	 * @model name="Periodic" literal="PERIODIC"
	 * @generated
	 * @ordered
	 */
	public static final int PERIODIC = 3000;

	/**
	 * An array of all the '<em><b>SBorder Rule</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private static final SBorderRule[] VALUES_ARRAY = new SBorderRule[] { STICKY_LITERAL, STRICT_LITERAL, BOUNCY_LITERAL, PERIODIC_LITERAL, };

	/**
	 * A public read-only list of all the '<em><b>SBorder Rule</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static final List<SBorderRule> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SBorder Rule</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static SBorderRule get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SBorderRule result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SBorder Rule</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static SBorderRule getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SBorderRule result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SBorder Rule</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	public static SBorderRule get(int value) {
		switch (value) {
			case STICKY:
				return STICKY_LITERAL;
			case STRICT:
				return STRICT_LITERAL;
			case BOUNCY:
				return BOUNCY_LITERAL;
			case PERIODIC:
				return PERIODIC_LITERAL;
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
	private SBorderRule(int value, String name, String literal) {
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
