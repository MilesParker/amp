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
 *   <li>{@link org.eclipse.amp.amf.adata.DataPoint#getRun <em>Run</em>}</li>
 *   <li>{@link org.eclipse.amp.amf.adata.DataPoint#getMeasure <em>Measure</em>}</li>
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
     * Returns the value of the '<em><b>Run</b></em>' reference.
     * It is bidirectional and its opposite is '{@link org.eclipse.amp.amf.adata.Run#getEntries <em>Entries</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Run</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Run</em>' reference.
     * @see #setRun(Run)
     * @see org.eclipse.amp.amf.adata.DataPackage#getDataPoint_Run()
     * @see org.eclipse.amp.amf.adata.Run#getEntries
     * @model opposite="entries" transient="true"
     * @generated
     */
    Run getRun();

    /**
     * Sets the value of the '{@link org.eclipse.amp.amf.adata.DataPoint#getRun <em>Run</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Run</em>' reference.
     * @see #getRun()
     * @generated
     */
    void setRun(Run value);

    /**
     * Returns the value of the '<em><b>Measure</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Measure</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Measure</em>' reference.
     * @see #setMeasure(Measurement)
     * @see org.eclipse.amp.amf.adata.DataPackage#getDataPoint_Measure()
     * @model
     * @generated
     */
    Measurement getMeasure();

    /**
     * Sets the value of the '{@link org.eclipse.amp.amf.adata.DataPoint#getMeasure <em>Measure</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Measure</em>' reference.
     * @see #getMeasure()
     * @generated
     */
    void setMeasure(Measurement value);

} // DataPoint
