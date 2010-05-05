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
import org.eclipse.amp.axf.ide.AXFWorkbenchPlugin;
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
 *
 */
public abstract class AGFViewPart extends ModelViewPart {

    class PropertySelectionListener implements ISelectionChangedListener {
        public void selectionChanged(SelectionChangedEvent event) {
            if (!event.getSelection().isEmpty() && event.getSelection() instanceof StructuredSelection) {
                StructuredSelection sel = (StructuredSelection) event.getSelection();
                propertySheetPage.selectionChanged(AGFViewPart.this,
                                                   new StructuredSelection(sel.getFirstElement()));
            }
        }
    }

    private PropertySelectionListener selectionListener;
    /**
     * 
     */
    public AGFViewPart() {
        super();
    }

    /**
     * @param parent
     * @see org.eclipse.amp.axf.view.ModelViewPart#createPartControl(org.eclipse.swt.widgets.Composite)
     */
    public void createPartControl(Composite parent) {
        super.createPartControl(parent);
        createSelectionSynchronizer();
    }

    protected void createSelectionListener(ISelectionProvider provider) {
        super.createSelectionListener(provider);
        selectionListener = new PropertySelectionListener();
        provider.addSelectionChangedListener(selectionListener);
    }

    public void createSelectionSynchronizer() {
        new Thread() {
            public void run() {
                AXFWorkbenchPlugin default1 = AXFWorkbenchPlugin.getDefault();
                while (default1 == null) {
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                    }
                    default1 = AXFWorkbenchPlugin.getDefault();
                }
                ModelViewManager manager = default1.getManager();
                if (!(manager.getSelectionSynchronizer() instanceof EditPartSelectionSynchronizer)) {
                    manager.setSelectionSynchronizer(new EditPartSelectionSynchronizer());
                }
                manager.getSelectionSynchronizer().addViewer(getSelectionProvider());
                getSite().setSelectionProvider(getSelectionProvider());
            }

        }.start();
    }

    @Override
    public Object getAdapter(Class type) {
        if (type == ISelectionProvider.class) {
            return getSelectionProvider();
        }
        return super.getAdapter(type);
    }

    public void dispose() {
        super.dispose();
        removeSelectionListener(getSelectionProvider());
        getSelectionProvider().removeSelectionChangedListener(selectionListener);
    }

    protected abstract ISelectionProvider getSelectionProvider();
}