/**
 * <copyright>
 * </copyright>
 *
 * $Id: AresFactory.java,v 1.4 2010/08/04 01:54:47 mparker Exp $
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
	 * Returns a new object of class '<em>Constraint Test</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constraint Test</em>'.
	 * @generated
	 */
    ConstraintTest createConstraintTest();

    /**
	 * Returns a new object of class '<em>Run Set</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return a new object of class '<em>Run Set</em>'.
	 * @generated
	 */
    RunSet createRunSet();

    /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
    AresPackage getAresPackage();

} //AresFactory
