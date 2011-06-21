/*******************************************************************************
 * Copyright (c) 2009, Metascape LLC, Miles Parker.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Miles Parker - initial API and implementation
 ******************************************************************************/
package org.eclipse.amp.escape.ascape.view;

import java.util.TooManyListenersException;

import org.ascape.model.event.DefaultScapeListener;
import org.ascape.model.event.ScapeEvent;
import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.ide.ModelViewManager;
import org.eclipse.amp.axf.view.ModelInput;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.viewers.StructuredSelection;

public abstract class ModelScapeView extends DefaultScapeListener implements IAdaptable {

	private static final long serialVersionUID = -2831280332433751678L;

	private String primaryID;

	private IModel model;

	public ModelScapeView(String primaryID, String secondaryID, String name) {
		super();
		this.primaryID = primaryID;

		if (name == null) {
			setName(primaryID + (secondaryID != null ? ":" + secondaryID : ""));
		} else {
			setName(name);
		}
	}

	public ModelScapeView(String primaryID) {
		this(primaryID, null, null);
	}

	public Object getAdapter(Class key) {
		if (key == IModel.class) {
			return ModelViewManager.getInstance().getAdapter(getScape().getRoot(), key);
		}
		return null;
	}

	public ModelInput createInput() {
		return new ModelInput(getModel(), new StructuredSelection(getScape()));
	}

	@Override
	public void scapeAdded(ScapeEvent scapeEvent) throws TooManyListenersException {
		super.scapeAdded(scapeEvent);
		model = (IModel) getAdapter(IModel.class);
		ModelViewManager.getInstance().createViewPart(primaryID, createInput(), getName());
	}

	public IModel getModel() {
		return model;
	}

	@Override
	public String toString() {
		return getName() + " View";
	}
}
