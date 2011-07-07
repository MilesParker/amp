/**
 * <copyright>
 *
 * Copyright (c) 2009 Metascape, LLC.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   Metascape - Initial API and Implementation
 *
 * </copyright>
 *
 */
package org.eclipse.amp.escape.ascape.wrap;

import java.util.TooManyListenersException;

import org.ascape.model.Scape;
import org.ascape.model.event.DefaultScapeListener;
import org.ascape.model.event.ScapeEvent;
import org.eclipse.amp.axf.core.ILifeCycleListener;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.core.IStateListener;
import org.eclipse.amp.axf.core.LifeCycleState;

/**
 * The listener interface for receiving modelWrapperScape events. The class that
 * is interested in processing a modelWrapperScape event implements this
 * interface, and the object created with that class is registered with a
 * component using the component's <code>addModelWrapperScapeListener<code> method. When
 * the modelWrapperScape event occurs, that object's appropriate
 * method is invoked.
 * 
 * @see ScapeEvent
 */
public class ModelWrapperScapeListener extends DefaultScapeListener {

	private static final long serialVersionUID = 1L;

	private IModel model;

	private IStateListener wrapped;

	/**
	 * Instantiates a new model wrapper scape listener.
	 * 
	 * @param model
	 *          the model
	 * @param scape
	 *          the scape
	 * @param wrapped
	 *          the wrapped
	 */
	public ModelWrapperScapeListener(IModel model, Scape scape, ILifeCycleListener wrapped) {
		this.model = model;
		this.scape = scape;
		this.wrapped = wrapped;
		if (model == null) {
			throw new RuntimeException("Model cannot be null.");
		}
		if (scape == null) {
			throw new RuntimeException("Scape cannot be null.");
		}
		if (wrapped == null) {
			throw new RuntimeException("Wrapped listener cannot be null." + wrapped + " for " + scape);
		}
	}

	@Override
	public void scapeAdded(ScapeEvent scapeEvent) throws TooManyListenersException {
		wrapped.stateChange(LifeCycleState.OBSERVED, model);
		super.scapeAdded(scapeEvent);
	}

	@Override
	public void scapeClosing(ScapeEvent scapeEvent) {
		wrapped.stateChange(LifeCycleState.ENDING, model);
		super.scapeClosing(scapeEvent);
	}

	@Override
	public void scapeInitialized(ScapeEvent scapeEvent) {
		wrapped.stateChange(LifeCycleState.INITIALIZE, model);
	}

	@Override
	public void scapeIterated(ScapeEvent scapeEvent) {
		wrapped.stateChange(LifeCycleState.UPDATE, model);
	}

	@Override
	public void scapeRemoved(ScapeEvent scapeEvent) {
		wrapped.stateChange(LifeCycleState.END, model);
		super.scapeRemoved(scapeEvent);
	}

	@Override
	public void scapeSetup(ScapeEvent scapeEvent) {
		wrapped.stateChange(LifeCycleState.CREATE, model);
	}

	@Override
	public void scapeStarted(ScapeEvent scapeEvent) {
		wrapped.stateChange(LifeCycleState.START, model);
	}

	@Override
	public void scapeStopped(ScapeEvent scapeEvent) {
		wrapped.stateChange(LifeCycleState.STOP, model);
	}

	@Override
	public Scape getScape() {
		return scape;
	}

	@Override
	public boolean isGraphic() {
		return false;
	}

	@Override
	public boolean isLifeOfScape() {
		return false;
	}

	@Override
	public String getName() {
		return wrapped.toString() + " Wrapped";
	}

	@Override
	public Object clone() {
		ModelWrapperScapeListener clone = (ModelWrapperScapeListener) super.clone();
		return clone;
	}
}
