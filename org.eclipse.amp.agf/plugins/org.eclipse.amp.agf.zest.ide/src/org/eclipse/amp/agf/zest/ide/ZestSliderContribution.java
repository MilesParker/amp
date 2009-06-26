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
package org.eclipse.amp.agf.zest.ide;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Scale;
import org.eclipse.ui.menus.WorkbenchWindowControlContribution;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.layouts.algorithms.SpringLayoutAlgorithm;

// TODO: Auto-generated Javadoc
/**
 * The Class ZestSliderContribution.
 */
public class ZestSliderContribution extends WorkbenchWindowControlContribution {

    Graph graph;

    /**
     * Instantiates a new zest slider contribution.
     * 
     * @param graph the graph
     */
    public ZestSliderContribution(Graph graph) {
        super();
        this.graph = graph;
    }

    /**
     * @param parent
     * @return
     * @see org.eclipse.jface.action.ControlContribution#createControl(org.eclipse.swt.widgets.Composite)
     */
    @Override
    protected Control createControl(Composite parent) {
        Scale slider = new Scale(parent, SWT.HORIZONTAL);
        slider.setMaximum(100);
        slider.setSelection(50);
        slider.addSelectionListener(new SelectionListener() {
            public void widgetDefaultSelected(SelectionEvent e) {
            }
            public void widgetSelected(SelectionEvent e) {
                int sel = ((Scale) e.getSource()).getSelection();
                ((SpringLayoutAlgorithm) graph.getLayoutAlgorithm()).setSpringGravitation(sel / 100.0);
                        graph.applyLayout();
            }
        });
        return slider;
    }

    /**
     * @param control
     * @return
     * @see org.eclipse.jface.action.ControlContribution#computeWidth(org.eclipse.swt.widgets.Control)
     */
    protected int computeWidth(Control control) {
        return 100;
    }
}
