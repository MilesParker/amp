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

// TODO: Auto-generated Javadoc
/**
 * The listener interface for receiving modelWrapperScape events. The class that is interested in processing a
 * modelWrapperScape event implements this interface, and the object created with that class is registered with a
 * component using the component's <code>addModelWrapperScapeListener<code> method. When
 * the modelWrapperScape event occurs, that object's appropriate
 * method is invoked.
 * 
 * @see ModelWrapperScapeEvent
 */
public class ModelWrapperScapeListener extends DefaultScapeListener {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    IModel model;
    IStateListener wrapped;

    /**
     * Instantiates a new model wrapper scape listener.
     * 
     * @param model the model
     * @param scape the scape
     * @param wrapped the wrapped
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

    /**
     * @param scapeEvent
     * @throws TooManyListenersException
     * @see org.ascape.model.event.DefaultScapeListener#scapeAdded(org.ascape.model.event.ScapeEvent)
     */
    public void scapeAdded(ScapeEvent scapeEvent) throws TooManyListenersException {
        wrapped.stateChange(LifeCycleState.OBSERVED, model);
        super.scapeAdded(scapeEvent);
    }

    /**
     * @param scapeEvent
     * @see org.ascape.model.event.DefaultScapeListener#scapeClosing(org.ascape.model.event.ScapeEvent)
     */
    public void scapeClosing(ScapeEvent scapeEvent) {
        wrapped.stateChange(LifeCycleState.ENDING, model);
        super.scapeClosing(scapeEvent);
    }

    /**
     * @param scapeEvent
     * @see org.ascape.model.event.DefaultScapeListener#scapeInitialized(org.ascape.model.event.ScapeEvent)
     */
    public void scapeInitialized(ScapeEvent scapeEvent) {
        wrapped.stateChange(LifeCycleState.INITIALIZE, model);
    }

    /**
     * @param scapeEvent
     * @see org.ascape.model.event.DefaultScapeListener#scapeIterated(org.ascape.model.event.ScapeEvent)
     */
    public void scapeIterated(ScapeEvent scapeEvent) {
        wrapped.stateChange(LifeCycleState.UPDATE, model);
    }

    /**
     * @param scapeEvent
     * @see org.ascape.model.event.DefaultScapeListener#scapeRemoved(org.ascape.model.event.ScapeEvent)
     */
    public void scapeRemoved(ScapeEvent scapeEvent) {
        wrapped.stateChange(LifeCycleState.END, model);
        super.scapeRemoved(scapeEvent);
    }

    /**
     * @param scapeEvent
     * @see org.ascape.model.event.DefaultScapeListener#scapeSetup(org.ascape.model.event.ScapeEvent)
     */
    public void scapeSetup(ScapeEvent scapeEvent) {
        wrapped.stateChange(LifeCycleState.CREATE, model);
    }

    /**
     * @param scapeEvent
     * @see org.ascape.model.event.DefaultScapeListener#scapeStarted(org.ascape.model.event.ScapeEvent)
     */
    public void scapeStarted(ScapeEvent scapeEvent) {
        wrapped.stateChange(LifeCycleState.START, model);
    }

    /**
     * @param scapeEvent
     * @see org.ascape.model.event.DefaultScapeListener#scapeStopped(org.ascape.model.event.ScapeEvent)
     */
    public void scapeStopped(ScapeEvent scapeEvent) {
        wrapped.stateChange(LifeCycleState.STOP, model);
    }

    /**
     * @return
     * @see org.ascape.model.event.DefaultScapeListener#getScape()
     */
    public Scape getScape() {
        return scape;
    }

    /**
     * @return
     * @see org.ascape.model.event.DefaultScapeListener#isGraphic()
     */
    public boolean isGraphic() {
        return false;
    }

    /**
     * @return
     * @see org.ascape.model.event.DefaultScapeListener#isLifeOfScape()
     */
    public boolean isLifeOfScape() {
        return false;
    }

    /**
     * @return
     * @see org.ascape.model.event.DefaultScapeListener#getName()
     */
    public String getName() {
        return wrapped.toString() + " Wrapped";
    }

    /**
     * Clones this object.
     * 
     * @return the object
     */
    public Object clone() {
        ModelWrapperScapeListener clone = (ModelWrapperScapeListener) super.clone();
        return clone;
    }
}
