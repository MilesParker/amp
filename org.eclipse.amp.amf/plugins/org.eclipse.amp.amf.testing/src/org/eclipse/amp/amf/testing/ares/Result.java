/**
 * <copyright>
 * </copyright>
 *
 * $Id: Result.java,v 1.1 2009/07/31 21:48:19 mparker Exp $
 */
package org.eclipse.amp.amf.testing.ares;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Result</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.amp.amf.testing.ares.AresPackage#getResult()
 * @model
 * @generated
 */
public enum Result implements Enumerator {
    /**
     * The '<em><b>Incomplete</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #INCOMPLETE_VALUE
     * @generated
     * @ordered
     */
    INCOMPLETE(1, "Incomplete", "INCOMPLETE"),

    /**
     * The '<em><b>Success</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SUCCESS_VALUE
     * @generated
     * @ordered
     */
    SUCCESS(2, "Success", "SUCCESS"),

    /**
     * The '<em><b>Failure</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FAILURE_VALUE
     * @generated
     * @ordered
     */
    FAILURE(3, "Failure", "FAILURE");

    /**
     * The '<em><b>Incomplete</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Incomplete</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #INCOMPLETE
     * @model name="Incomplete" literal="INCOMPLETE"
     * @generated
     * @ordered
     */
    public static final int INCOMPLETE_VALUE = 1;

    /**
     * The '<em><b>Success</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Success</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #SUCCESS
     * @model name="Success" literal="SUCCESS"
     * @generated
     * @ordered
     */
    public static final int SUCCESS_VALUE = 2;

    /**
     * The '<em><b>Failure</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Failure</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #FAILURE
     * @model name="Failure" literal="FAILURE"
     * @generated
     * @ordered
     */
    public static final int FAILURE_VALUE = 3;

    /**
     * An array of all the '<em><b>Result</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final Result[] VALUES_ARRAY =
        new Result[] {
            INCOMPLETE,
            SUCCESS,
            FAILURE,
        };

    /**
     * A public read-only list of all the '<em><b>Result</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<Result> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>Result</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Result get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            Result result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Result</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Result getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            Result result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Result</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static Result get(int value) {
        switch (value) {
            case INCOMPLETE_VALUE: return INCOMPLETE;
            case SUCCESS_VALUE: return SUCCESS;
            case FAILURE_VALUE: return FAILURE;
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
    private Result(int value, String name, String literal) {
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
    
} //Result
