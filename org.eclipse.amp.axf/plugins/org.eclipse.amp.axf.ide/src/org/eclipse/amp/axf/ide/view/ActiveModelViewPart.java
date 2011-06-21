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

package org.eclipse.amp.axf.ide.view;

import org.eclipse.amp.axf.core.IModel;
import org.eclipse.amp.axf.ide.AbstractModelWorkbenchListener;
import org.eclipse.amp.axf.ide.ModelViewManager;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;

/**
 * 
 * @author mparker
 * @author jonas.ruettimann
 */
public abstract class ActiveModelViewPart extends ViewPart {

	@Override
	public void createPartControl(Composite parent) {
		ModelViewManager manager = ModelViewManager.getInstance();
		if (manager.getActiveModel() != null) {
			modelChanged((IModel) manager.getActiveModel());
		}

		manager.getManagerListeners().addModelManagerListener(new AbstractModelWorkbenchListener() {
			@Override
			public void modelActivated(IModel model) {
				modelChanged(model);
			}
		});
	}

	protected abstract void modelChanged(IModel activeModel);

	@Override
	public void setFocus() {
	}

}