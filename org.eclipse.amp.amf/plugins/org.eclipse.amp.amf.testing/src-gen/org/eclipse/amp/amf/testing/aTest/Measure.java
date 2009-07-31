/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.amp.amf.testing.aTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Measure</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.amp.amf.testing.aTest.ATestPackage#getMeasure()
 * @model
 * @generated
 */
public enum Measure implements Enumerator
{
  /**
   * The '<em><b>COUNT</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #COUNT_VALUE
   * @generated
   * @ordered
   */
  COUNT(0, "COUNT", "Count"),

  /**
   * The '<em><b>AVERAGE</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #AVERAGE_VALUE
   * @generated
   * @ordered
   */
  AVERAGE(1, "AVERAGE", "Average"),

  /**
   * The '<em><b>SUM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SUM_VALUE
   * @generated
   * @ordered
   */
  SUM(2, "SUM", "Sum"),

  /**
   * The '<em><b>MINIMUM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MINIMUM_VALUE
   * @generated
   * @ordered
   */
  MINIMUM(3, "MINIMUM", "Minimum"),

  /**
   * The '<em><b>MAXIMUM</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #MAXIMUM_VALUE
   * @generated
   * @ordered
   */
  MAXIMUM(4, "MAXIMUM", "Maximum");

  /**
   * The '<em><b>COUNT</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>COUNT</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #COUNT
   * @model literal="Count"
   * @generated
   * @ordered
   */
  public static final int COUNT_VALUE = 0;

  /**
   * The '<em><b>AVERAGE</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>AVERAGE</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #AVERAGE
   * @model literal="Average"
   * @generated
   * @ordered
   */
  public static final int AVERAGE_VALUE = 1;

  /**
   * The '<em><b>SUM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>SUM</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SUM
   * @model literal="Sum"
   * @generated
   * @ordered
   */
  public static final int SUM_VALUE = 2;

  /**
   * The '<em><b>MINIMUM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MINIMUM</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MINIMUM
   * @model literal="Minimum"
   * @generated
   * @ordered
   */
  public static final int MINIMUM_VALUE = 3;

  /**
   * The '<em><b>MAXIMUM</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>MAXIMUM</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #MAXIMUM
   * @model literal="Maximum"
   * @generated
   * @ordered
   */
  public static final int MAXIMUM_VALUE = 4;

  /**
   * An array of all the '<em><b>Measure</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Measure[] VALUES_ARRAY =
    new Measure[]
    {
      COUNT,
      AVERAGE,
      SUM,
      MINIMUM,
      MAXIMUM,
    };

  /**
   * A public read-only list of all the '<em><b>Measure</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Measure> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Measure</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Measure get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Measure result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Measure</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Measure getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Measure result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Measure</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Measure get(int value)
  {
    switch (value)
    {
      case COUNT_VALUE: return COUNT;
      case AVERAGE_VALUE: return AVERAGE;
      case SUM_VALUE: return SUM;
      case MINIMUM_VALUE: return MINIMUM;
      case MAXIMUM_VALUE: return MAXIMUM;
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
  private Measure(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Measure
