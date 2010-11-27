/**
 * <copyright>
 * </copyright>
 *
 * $Id: ScaleType.java,v 1.3 2010/08/04 01:54:19 mparker Exp $
 */
package org.eclipse.amp.amf.adata;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Scale Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.amp.amf.adata.DataPackage#getScaleType()
 * @model
 * @generated
 */
public enum ScaleType implements Enumerator {
    /**
	 * The '<em><b>Individual</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #INDIVIDUAL_VALUE
	 * @generated
	 * @ordered
	 */
    INDIVIDUAL(0, "Individual", "INDIVIDUAL"), /**
	 * The '<em><b>Count</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #COUNT_VALUE
	 * @generated
	 * @ordered
	 */
    COUNT(1, "Count", "COUNT"),

    /**
	 * The '<em><b>Sum</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #SUM_VALUE
	 * @generated
	 * @ordered
	 */
    SUM(2, "Sum", "SUM"),

    /**
	 * The '<em><b>Average</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #AVERAGE_VALUE
	 * @generated
	 * @ordered
	 */
    AVERAGE(3, "Average", "AVERAGE"),

    /**
	 * The '<em><b>Minimum</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #MINIMUM_VALUE
	 * @generated
	 * @ordered
	 */
    MINIMUM(4, "Minimum", "MINIMUM"),

    /**
	 * The '<em><b>Maximum</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #MAXIMUM_VALUE
	 * @generated
	 * @ordered
	 */
    MAXIMUM(5, "Maximum", "MAXIMUM"),

    /**
	 * The '<em><b>Standard Deviation</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #STANDARD_DEVIATION_VALUE
	 * @generated
	 * @ordered
	 */
    STANDARD_DEVIATION(6, "StandardDeviation", "STAMDARD_DEVIATION"),

    /**
	 * The '<em><b>Variance</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #VARIANCE_VALUE
	 * @generated
	 * @ordered
	 */
    VARIANCE(7, "Variance", "VARIANCE"),

    /**
	 * The '<em><b>Custom</b></em>' literal object.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #CUSTOM_VALUE
	 * @generated
	 * @ordered
	 */
    CUSTOM(1000, "Custom", "CUSTOM");

    /**
	 * The '<em><b>Individual</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Individual</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @see #INDIVIDUAL
	 * @model name="Individual" literal="INDIVIDUAL"
	 * @generated
	 * @ordered
	 */
    public static final int INDIVIDUAL_VALUE = 0;

    /**
	 * The '<em><b>Count</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Count</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @see #COUNT
	 * @model name="Count" literal="COUNT"
	 * @generated
	 * @ordered
	 */
    public static final int COUNT_VALUE = 1;

    /**
	 * The '<em><b>Sum</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Sum</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @see #SUM
	 * @model name="Sum" literal="SUM"
	 * @generated
	 * @ordered
	 */
    public static final int SUM_VALUE = 2;

    /**
	 * The '<em><b>Average</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Average</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @see #AVERAGE
	 * @model name="Average" literal="AVERAGE"
	 * @generated
	 * @ordered
	 */
    public static final int AVERAGE_VALUE = 3;

    /**
	 * The '<em><b>Minimum</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Minimum</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @see #MINIMUM
	 * @model name="Minimum" literal="MINIMUM"
	 * @generated
	 * @ordered
	 */
    public static final int MINIMUM_VALUE = 4;

    /**
	 * The '<em><b>Maximum</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Maximum</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @see #MAXIMUM
	 * @model name="Maximum" literal="MAXIMUM"
	 * @generated
	 * @ordered
	 */
    public static final int MAXIMUM_VALUE = 5;

    /**
	 * The '<em><b>Standard Deviation</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Standard Deviation</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @see #STANDARD_DEVIATION
	 * @model name="StandardDeviation" literal="STAMDARD_DEVIATION"
	 * @generated
	 * @ordered
	 */
    public static final int STANDARD_DEVIATION_VALUE = 6;

    /**
	 * The '<em><b>Variance</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Variance</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @see #VARIANCE
	 * @model name="Variance" literal="VARIANCE"
	 * @generated
	 * @ordered
	 */
    public static final int VARIANCE_VALUE = 7;

    /**
	 * The '<em><b>Custom</b></em>' literal value.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>Custom</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @see #CUSTOM
	 * @model name="Custom" literal="CUSTOM"
	 * @generated
	 * @ordered
	 */
    public static final int CUSTOM_VALUE = 1000;

    /**
	 * An array of all the '<em><b>Scale Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private static final ScaleType[] VALUES_ARRAY =
        new ScaleType[] {
			INDIVIDUAL,
			COUNT,
			SUM,
			AVERAGE,
			MINIMUM,
			MAXIMUM,
			STANDARD_DEVIATION,
			VARIANCE,
			CUSTOM,
		};

    /**
	 * A public read-only list of all the '<em><b>Scale Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final List<ScaleType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
	 * Returns the '<em><b>Scale Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static ScaleType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScaleType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

    /**
	 * Returns the '<em><b>Scale Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static ScaleType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScaleType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

    /**
	 * Returns the '<em><b>Scale Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static ScaleType get(int value) {
		switch (value) {
			case INDIVIDUAL_VALUE: return INDIVIDUAL;
			case COUNT_VALUE: return COUNT;
			case SUM_VALUE: return SUM;
			case AVERAGE_VALUE: return AVERAGE;
			case MINIMUM_VALUE: return MINIMUM;
			case MAXIMUM_VALUE: return MAXIMUM;
			case STANDARD_DEVIATION_VALUE: return STANDARD_DEVIATION;
			case VARIANCE_VALUE: return VARIANCE;
			case CUSTOM_VALUE: return CUSTOM;
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
    private ScaleType(int value, String name, String literal) {
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
    
} //ScaleType
