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

import org.metaabm.SNamed;

/**
 * <!-- begin-user-doc --> A representation of the model object ' <em><b>ASchedule</b></em>'.
 * 
 * @author Miles Parker <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.metaabm.act.ASchedule#getStart <em>Start</em>}</li>
 *   <li>{@link org.metaabm.act.ASchedule#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.metaabm.act.ASchedule#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.metaabm.act.ASchedule#getPick <em>Pick</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.metaabm.act.MetaABMActPackage#getASchedule()
 * @model
 * @generated
 */
public interface ASchedule extends ARoot, SNamed {
	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> The first iteration in which to execute the activity. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(int)
	 * @see org.metaabm.act.MetaABMActPackage#getASchedule_Start()
	 * @model
	 * @generated
	 */
	int getStart();

	/**
	 * Sets the value of the '{@link org.metaabm.act.ASchedule#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(int value);

	/**
	 * Returns the value of the '<em><b>Interval</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Specifies the interval. If > 0, then the method is scheduled to repeat at the specified
	 * interval. Otherwise, method is scheduled for one time execution. Default is 0 meaning by default the method will
	 * only execute once. <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Interval</em>' attribute.
	 * @see #setInterval(int)
	 * @see org.metaabm.act.MetaABMActPackage#getASchedule_Interval()
	 * @model
	 * @generated
	 */
	int getInterval();

	/**
	 * Sets the value of the '{@link org.metaabm.act.ASchedule#getInterval <em>Interval</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Interval</em>' attribute.
	 * @see #getInterval()
	 * @generated
	 */
	void setInterval(int value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> Priority w/r to other actions scheduled for the same tick. Default is [currently unspecified].
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see org.metaabm.act.MetaABMActPackage#getASchedule_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link org.metaabm.act.ASchedule#getPriority <em>Priority</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *          the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Pick</b></em>' attribute. <!-- begin-user-doc --> <!-- end-user-doc --> <!--
	 * begin-model-doc --> How many ticks the action can execute in the background while the tick count progresses.
	 * Default is no duration [-1] meaning the method must finish execution before the next scheduled action can execute.
	 * <!-- end-model-doc -->
	 * 
	 * @return the value of the '<em>Pick</em>' attribute.
	 * @see #setPick(int)
	 * @see org.metaabm.act.MetaABMActPackage#getASchedule_Pick()
	 * @model
	 * @generated
	 */
	int getPick();

	/**
	 * Sets the value of the '{@link org.metaabm.act.ASchedule#getPick <em>Pick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pick</em>' attribute.
	 * @see #getPick()
	 * @generated
	 */
	void setPick(int value);

} // ASchedule
