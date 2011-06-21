/**
 * <copyright>
 *
 * Copyright (c) 2010 Metascape, LLC.
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

package org.eclipse.amp.agf.gef;

import org.eclipse.amp.agf.EditPartSelectionSynchronizer;
import org.eclipse.amp.axf.ide.ModelViewManager;
import org.eclipse.amp.axf.view.ModelViewPart;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.widgets.Composite;

/**
 * 
 * @author mparker
 * @author jonas.ruettimann
 */
public abstract class AGFViewPart extends ModelViewPart {

	class PropertySelectionListener implements ISelectionChangedListener {
		public void selectionChanged(SelectionChangedEvent event) {
			if (!event.getSelection().isEmpty() && event.getSelection() instanceof StructuredSelection) {
				StructuredSelection sel = (StructuredSelection) event.getSelection();
				getPropertySheetPage().selectionChanged(AGFViewPart.this, new StructuredSelection(sel.getFirstElement()));
			}
		}
	}

	private PropertySelectionListener selectionListener;

	public AGFViewPart() {
		super();
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		createSelectionSynchronizer();
	}

	@Override
	protected void createSelectionListener(ISelectionProvider provider) {
		super.createSelectionListener(provider);
		selectionListener = new PropertySelectionListener();
		provider.addSelectionChangedListener(selectionListener);
	}

	public void createSelectionSynchronizer() {
		ModelViewManager manager = ModelViewManager.getInstance();
		if (!(manager.getSelectionSynchronizer() instanceof EditPartSelectionSynchronizer)) {
			manager.setSelectionSynchronizer(new EditPartSelectionSynchronizer());
		}
		manager.getSelectionSynchronizer().addViewer(getSelectionProvider());
		getSite().setSelectionProvider(getSelectionProvider());
	}

	@Override
	public Object getAdapter(Class type) {
		if (type == ISelectionProvider.class) {
			return getSelectionProvider();
		}
		return super.getAdapter(type);
	}

	@Override
	public void dispose() {
		super.dispose();
		removeSelectionListener(getSelectionProvider());
		getSelectionProvider().removeSelectionChangedListener(selectionListener);
	}

	protected abstract ISelectionProvider getSelectionProvider();
}