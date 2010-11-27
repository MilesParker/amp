/**
 * <copyright>
 * </copyright>
 *
 * $Id: Measurement.java,v 1.5 2010/08/04 01:54:19 mparker Exp $
 */
package org.eclipse.amp.amf.adata;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import org.metaabm.IValue;
import org.metaabm.SAttribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Measurement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.adata.Measurement#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.Measurement#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.Measurement#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.Measurement#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.Measurement#getRun <em>Run</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amp.amf.adata.DataPackage#getMeasurement()
 * @model
 * @generated
 */
public interface Measurement extends EObject {
    /**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.amp.amf.adata.ScaleType}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.amp.amf.adata.ScaleType
	 * @see #setType(ScaleType)
	 * @see org.eclipse.amp.amf.adata.DataPackage#getMeasurement_Type()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
    ScaleType getType();

    /**
	 * Sets the value of the '{@link org.eclipse.amp.amf.adata.Measurement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.eclipse.amp.amf.adata.ScaleType
	 * @see #getType()
	 * @generated
	 */
    void setType(ScaleType value);

    /**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(IValue)
	 * @see org.eclipse.amp.amf.adata.DataPackage#getMeasurement_Value()
	 * @model
	 * @generated
	 */
    IValue getValue();

    /**
	 * Sets the value of the '{@link org.eclipse.amp.amf.adata.Measurement#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
    void setValue(IValue value);

    /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.amp.amf.adata.DataPackage#getMeasurement_Name()
	 * @model required="true"
	 * @generated
	 */
    String getName();

    /**
	 * Sets the value of the '{@link org.eclipse.amp.amf.adata.Measurement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(String value);

    /**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.amp.amf.adata.DataPoint}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.amp.amf.adata.DataPoint#getMeasurement <em>Measurement</em>}'.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.eclipse.amp.amf.adata.DataPackage#getMeasurement_Entries()
	 * @see org.eclipse.amp.amf.adata.DataPoint#getMeasurement
	 * @model opposite="measurement" containment="true" ordered="false"
	 * @generated
	 */
    EList<DataPoint> getEntries();

				/**
	 * Returns the value of the '<em><b>Run</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.amp.amf.adata.Run#getMeasurements <em>Measurements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Run</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run</em>' container reference.
	 * @see #setRun(Run)
	 * @see org.eclipse.amp.amf.adata.DataPackage#getMeasurement_Run()
	 * @see org.eclipse.amp.amf.adata.Run#getMeasurements
	 * @model opposite="measurements" required="true" transient="false"
	 * @generated
	 */
	Run getRun();

				/**
	 * Sets the value of the '{@link org.eclipse.amp.amf.adata.Measurement#getRun <em>Run</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Run</em>' container reference.
	 * @see #getRun()
	 * @generated
	 */
	void setRun(Run value);

} // Measurement
