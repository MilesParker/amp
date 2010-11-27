/**
 * <copyright>
 * </copyright>
 *
 * $Id: DataFactory.java,v 1.2 2010/08/04 01:54:19 mparker Exp $
 */
package org.eclipse.amp.amf.adata;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.amp.amf.adata.DataPackage
 * @generated
 */
public interface DataFactory extends EFactory {
    /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    DataFactory eINSTANCE = org.eclipse.amp.amf.adata.impl.DataFactoryImpl.init();

    /**
	 * Returns a new object of class '<em>Run</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Run</em>'.
	 * @generated
	 */
    Run createRun();

    /**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
    Parameter createParameter();

    /**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
    DataPoint createDataPoint();

    /**
	 * Returns a new object of class '<em>Catalog</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Catalog</em>'.
	 * @generated
	 */
    Catalog createCatalog();

    /**
	 * Returns a new object of class '<em>Measurement</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Measurement</em>'.
	 * @generated
	 */
    Measurement createMeasurement();

    /**
	 * Returns a new object of class '<em>Parameter Set</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter Set</em>'.
	 * @generated
	 */
    ParameterSet createParameterSet();

    /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
    DataPackage getDataPackage();

} //DataFactory
