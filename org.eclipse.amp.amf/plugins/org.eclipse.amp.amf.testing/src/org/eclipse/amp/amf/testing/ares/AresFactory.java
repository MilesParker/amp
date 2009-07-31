/**
 * <copyright>
 * </copyright>
 *
 * $Id: AresFactory.java,v 1.1 2009/07/31 21:48:19 mparker Exp $
 */
package org.eclipse.amp.amf.testing.ares;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.amp.amf.testing.ares.AresPackage
 * @generated
 */
public interface AresFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    AresFactory eINSTANCE = org.eclipse.amp.amf.testing.ares.impl.AresFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Run</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Run</em>'.
     * @generated
     */
    Run createRun();

    /**
     * Returns a new object of class '<em>Failure</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Failure</em>'.
     * @generated
     */
    Failure createFailure();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    AresPackage getAresPackage();

} //AresFactory
