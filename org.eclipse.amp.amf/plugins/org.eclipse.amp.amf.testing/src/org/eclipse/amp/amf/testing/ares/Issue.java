/**
 * <copyright>
 * </copyright>
 *
 * $Id: Issue.java,v 1.3 2010/08/04 01:54:47 mparker Exp $
 */
package org.eclipse.amp.amf.testing.ares;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Issue</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.amp.amf.testing.ares.AresPackage#getIssue()
 * @model
 * @generated
 */
public enum Issue implements Enumerator {
    /**
	 * The '<em><b>Below Range</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #BELOW_RANGE_VALUE
	 * @generated
	 * @ordered
	 */
    BELOW_RANGE(10, "BelowRange", "BELOW_RANGE"),

    /**
	 * The '<em><b>Above Range</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #ABOVE_RANGE_VALUE
	 * @generated
	 * @ordered
	 */
    ABOVE_RANGE(15, "AboveRange", "ABOVE_RANGE"), /**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
    NONE(1, "None", "NONE"), /**
	 * The '<em><b>Not Found</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #NOT_FOUND_VALUE
	 * @generated
	 * @ordered
	 */
    NOT_FOUND(-1, "NotFound", "NOT_FOUND");

    /**
	 * The '<em><b>Below Range</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Below Range</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @see #BELOW_RANGE
	 * @model name="BelowRange" literal="BELOW_RANGE"
	 * @generated
	 * @ordered
	 */
    public static final int BELOW_RANGE_VALUE = 10;

    /**
	 * The '<em><b>Above Range</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Above Range</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @see #ABOVE_RANGE
	 * @model name="AboveRange" literal="ABOVE_RANGE"
	 * @generated
	 * @ordered
	 */
    public static final int ABOVE_RANGE_VALUE = 15;

    /**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None" literal="NONE"
	 * @generated
	 * @ordered
	 */
    public static final int NONE_VALUE = 1;

    /**
	 * The '<em><b>Not Found</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Not Found</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @see #NOT_FOUND
	 * @model name="NotFound" literal="NOT_FOUND"
	 * @generated
	 * @ordered
	 */
    public static final int NOT_FOUND_VALUE = -1;

    /**
	 * An array of all the '<em><b>Issue</b></em>' enumerators.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private static final Issue[] VALUES_ARRAY =
        new Issue[] {
			BELOW_RANGE,
			ABOVE_RANGE,
			NONE,
			NOT_FOUND,
		};

    /**
	 * A public read-only list of all the '<em><b>Issue</b></em>' enumerators.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final List<Issue> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
	 * Returns the '<em><b>Issue</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static Issue get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Issue result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

    /**
	 * Returns the '<em><b>Issue</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static Issue getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Issue result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

    /**
	 * Returns the '<em><b>Issue</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static Issue get(int value) {
		switch (value) {
			case BELOW_RANGE_VALUE: return BELOW_RANGE;
			case ABOVE_RANGE_VALUE: return ABOVE_RANGE;
			case NONE_VALUE: return NONE;
			case NOT_FOUND_VALUE: return NOT_FOUND;
		}
		return null;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private final int value;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private final String name;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private final String literal;

    /**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private Issue(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public int getValue() {
	  return value;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getName() {
	  return name;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getLiteral() {
	  return literal;
	}

    /**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String toString() {
		return literal;
	}
    
} //Issue
