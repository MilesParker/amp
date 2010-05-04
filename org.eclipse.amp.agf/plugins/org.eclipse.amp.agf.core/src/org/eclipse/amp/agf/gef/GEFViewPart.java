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
package org.eclipse.amp.agf.gef;

import org.eclipse.gef.GraphicalViewer;
import org.eclipse.gef.MouseWheelHandler;
import org.eclipse.gef.MouseWheelZoomHandler;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.editparts.ScalableFreeformRootEditPart;
import org.eclipse.gef.editparts.ZoomManager;
import org.eclipse.gef.ui.actions.ZoomComboContributionItem;
import org.eclipse.gef.ui.parts.GraphicalViewerKeyHandler;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IEditorInput;

public class GEFViewPart extends EditPartViewPart {
    private String zoomFit = ZoomManager.FIT_ALL;

    @Override
    public void createPartControl(Composite parent) {
        super.createPartControl(parent);
        IToolBarManager toolBar = getViewSite().getActionBars().getToolBarManager();
        ZoomComboContributionItem item = new ZoomComboContributionItem(getViewSite().getPage()) {
            /**
             * @param zm
             * @see org.eclipse.gef.ui.actions.ZoomComboContributionItem#setZoomManager(org.eclipse.gef.editparts.ZoomManager)
             */
            public void setZoomManager(ZoomManager zm) {
                super.setZoomManager(getZoomer());
            }
        };
        toolBar.add(item);
    }

    public RootEditPart createRoot() {
        return new ScalableFreeformRootEditPart();
    }

    @Override
    public void setInput(IEditorInput input) {
        super.setInput(input);
        getViewer().setProperty(MouseWheelHandler.KeyGenerator.getKey(SWT.MOD1), MouseWheelZoomHandler.SINGLETON);
        getViewer().setKeyHandler(new GraphicalViewerKeyHandler((GraphicalViewer) getViewer()));
        if (input != null) {
            getViewer().getControl().addControlListener(new ControlListener() {
                public void controlMoved(ControlEvent e) {
                }
                public void controlResized(ControlEvent e) {
                    if (!(getModel().isEnding() || getModel().isEnded()) && e.widget == getViewer().getControl()) {
                        setZoomFit(zoomFit);
                    }
                }
            });
            getViewer().getControl().getDisplay().asyncExec(new Runnable() {
                public void run() {
                    setZoomFit(zoomFit);
                }
            });
        }
    }

    public String getZoomFit() {
        return zoomFit;
    }

    public void setZoomFit(String zoomFit) {
        this.zoomFit = zoomFit;
        if (!zoomFit.equals("")) {
            if (getZoomer() != null) {
                getZoomer().setZoomAsText(zoomFit);
            }
        }
    }
}