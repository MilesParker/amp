/**
 * <copyright>
 * </copyright>
 *
 * $Id: DataPoint.java,v 1.3 2010/08/04 01:54:19 mparker Exp $
 */
package org.eclipse.amp.amf.adata;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.amp.amf.adata.DataPoint#getPeriod <em>Period</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.DataPoint#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.DataPoint#getMeasurement <em>Measurement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.amp.amf.adata.DataPackage#getDataPoint()
 * @model
 * @generated
 */
public interface DataPoint extends EObject {
    /**
	 * Returns the value of the '<em><b>Period</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Period</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Period</em>' attribute.
	 * @see #setPeriod(long)
	 * @see org.eclipse.amp.amf.adata.DataPackage#getDataPoint_Period()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
    long getPeriod();

    /**
	 * Sets the value of the '{@link org.eclipse.amp.amf.adata.DataPoint#getPeriod <em>Period</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period</em>' attribute.
	 * @see #getPeriod()
	 * @generated
	 */
    void setPeriod(long value);

    /**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see org.eclipse.amp.amf.adata.DataPackage#getDataPoint_Value()
	 * @model
	 * @generated
	 */
    double getValue();

    /**
	 * Sets the value of the '{@link org.eclipse.amp.amf.adata.DataPoint#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
    void setValue(double value);

    /**
	 * Returns the value of the '<em><b>Measurement</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.amp.amf.adata.Measurement#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement</em>' container reference.
	 * @see #setMeasurement(Measurement)
	 * @see org.eclipse.amp.amf.adata.DataPackage#getDataPoint_Measurement()
	 * @see org.eclipse.amp.amf.adata.Measurement#getEntries
	 * @model opposite="entries" required="true" transient="false"
	 * @generated
	 */
	Measurement getMeasurement();

				/**
	 * Sets the value of the '{@link org.eclipse.amp.amf.adata.DataPoint#getMeasurement <em>Measurement</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Measurement</em>' container reference.
	 * @see #getMeasurement()
	 * @generated
	 */
	void setMeasurement(Measurement value);

} // DataPoint
