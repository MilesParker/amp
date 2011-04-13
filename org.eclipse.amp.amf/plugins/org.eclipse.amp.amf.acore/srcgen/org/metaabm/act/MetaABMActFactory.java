/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * Copyright (c) 2006-2007 Argonne National Labs
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Argonne National Laboratory - Initial development (pre-contribution)
 *   Metascape - Subsequent development and maintenance
 *
 * </copyright>
 */
package org.metaabm.act;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a create method for each non-abstract class of
 * the model.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 * @see org.metaabm.act.MetaABMActPackage
 * @generated
 */
public interface MetaABMActFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	MetaABMActFactory eINSTANCE = org.metaabm.act.impl.MetaABMActFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>AGroup</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>AGroup</em>'.
	 * @generated
	 */
	AGroup createAGroup();

	/**
	 * Returns a new object of class '<em>ASchedule</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>ASchedule</em>'.
	 * @generated
	 */
	ASchedule createASchedule();

	/**
	 * Returns a new object of class '<em>ABuild</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>ABuild</em>'.
	 * @generated
	 */
	ABuild createABuild();

	/**
	 * Returns a new object of class '<em>AInitialize</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>AInitialize</em>'.
	 * @generated
	 */
	AInitialize createAInitialize();

	/**
	 * Returns a new object of class '<em>ARule</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>ARule</em>'.
	 * @generated
	 */
	ARule createARule();

	/**
	 * Returns a new object of class '<em>AMethod</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>AMethod</em>'.
	 * @generated
	 */
	AMethod createAMethod();

	/**
	 * Returns a new object of class '<em>AAny</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>AAny</em>'.
	 * @generated
	 */
	AAny createAAny();

	/**
	 * Returns a new object of class '<em>AAll</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>AAll</em>'.
	 * @generated
	 */
	AAll createAAll();

	/**
	 * Returns a new object of class '<em>ANone</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>ANone</em>'.
	 * @generated
	 */
	ANone createANone();

	/**
	 * Returns a new object of class '<em>AQuery</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>AQuery</em>'.
	 * @generated
	 */
	AQuery createAQuery();

	/**
	 * Returns a new object of class '<em>AEvaluate</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>AEvaluate</em>'.
	 * @generated
	 */
	AEvaluate createAEvaluate();

	/**
	 * Returns a new object of class '<em>AWatch</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>AWatch</em>'.
	 * @generated
	 */
	AWatch createAWatch();

	/**
	 * Returns a new object of class '<em>ASet</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>ASet</em>'.
	 * @generated
	 */
	ASet createASet();

	/**
	 * Returns a new object of class '<em>ACreate Agents</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>ACreate Agents</em>'.
	 * @generated
	 */
	ACreateAgents createACreateAgents();

	/**
	 * Returns a new object of class '<em>ABuild Network</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>ABuild Network</em>'.
	 * @generated
	 */
	ABuildNetwork createABuildNetwork();

	/**
	 * Returns a new object of class '<em>ABuild Space</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>ABuild Space</em>'.
	 * @generated
	 */
	ABuildSpace createABuildSpace();

	/**
	 * Returns a new object of class '<em>ABuild Geography</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>ABuild Geography</em>'.
	 * @generated
	 */
	ABuildGeography createABuildGeography();

	/**
	 * Returns a new object of class '<em>ABuild Grid</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>ABuild Grid</em>'.
	 * @generated
	 */
	ABuildGrid createABuildGrid();

	/**
	 * Returns a new object of class '<em>ASelect</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>ASelect</em>'.
	 * @generated
	 */
	ASelect createASelect();

	/**
	 * Returns a new object of class '<em>AMove</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>AMove</em>'.
	 * @generated
	 */
	AMove createAMove();

	/**
	 * Returns a new object of class '<em>ALeave</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>ALeave</em>'.
	 * @generated
	 */
	ALeave createALeave();

	/**
	 * Returns a new object of class '<em>ADie</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>ADie</em>'.
	 * @generated
	 */
	ADie createADie();

	/**
	 * Returns a new object of class '<em>AConnect</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>AConnect</em>'.
	 * @generated
	 */
	AConnect createAConnect();

	/**
	 * Returns a new object of class '<em>ADisconnect</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>ADisconnect</em>'.
	 * @generated
	 */
	ADisconnect createADisconnect();

	/**
	 * Returns a new object of class '<em>AReplace</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>AReplace</em>'.
	 * @generated
	 */
	AReplace createAReplace();

	/**
	 * Returns a new object of class '<em>ACause</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>ACause</em>'.
	 * @generated
	 */
	ACause createACause();

	/**
	 * Returns a new object of class '<em>ADiffuse</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>ADiffuse</em>'.
	 * @generated
	 */
	ADiffuse createADiffuse();

	/**
	 * Returns a new object of class '<em>APerform</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>APerform</em>'.
	 * @generated
	 */
	APerform createAPerform();

	/**
	 * Returns a new object of class '<em>ADerive</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>ADerive</em>'.
	 * @generated
	 */
	ADerive createADerive();

	/**
	 * Returns a new object of class '<em>ALoad Shaped Agents</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>ALoad Shaped Agents</em>'.
	 * @generated
	 */
	ALoadShapedAgents createALoadShapedAgents();

	/**
	 * Returns a new object of class '<em>ACreate Shaped Agents</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>ACreate Shaped Agents</em>'.
	 * @generated
	 */
	ACreateShapedAgents createACreateShapedAgents();

	/**
	 * Returns a new object of class '<em>ALoad Agents</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>ALoad Agents</em>'.
	 * @generated
	 */
	ALoadAgents createALoadAgents();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MetaABMActPackage getMetaABMActPackage();

	/**
	 * Returns a new object of class '<em>AInput</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>AInput</em>'.
	 * @generated
	 */
	AInput createAInput();

	/**
	 * Returns a new object of class '<em>ALiteral</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>ALiteral</em>'.
	 * @generated
	 */
	ALiteral createALiteral();

	/**
	 * Returns a new object of class '<em>AMulti Value</em>'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @return a new object of class '<em>AMulti Value</em>'.
	 * @generated
	 */
	AMultiValue createAMultiValue();

} // MetaABMActFactory
