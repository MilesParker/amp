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

import org.eclipse.amp.agf.zest.GraphViewPart;
import org.eclipse.amp.agf.zest.SpringPartitionLayoutAlgorithm;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Slider;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.zest.layouts.algorithms.AbstractLayoutAlgorithm;

// TODO: Auto-generated Javadoc
/**
 * The Class SpringLayoutModAction.
 */
public class SpringLayoutModAction implements IViewActionDelegate {

	SpringPartitionLayoutAlgorithm algorithm;

    private boolean modified = false;

    GraphViewPart zestPart;

    /**
     * @param view
     * @see org.eclipse.ui.IViewActionDelegate#init(org.eclipse.ui.IViewPart)
     */
    public void init(IViewPart view) {
        zestPart = (GraphViewPart) view;
        algorithm = ((GraphViewPart) view).getSpringLayout();
        gravity = zestPart.getGravity();
        strain = zestPart.getStrain();
        move = zestPart.getSpringMove();
        length = zestPart.getSpringLength();
    }

    /**
     * Modify algorithm.
     * 
     * @param alg the alg
     * 
     * @return true, if successful
     */
    protected boolean modifyAlgorithm(AbstractLayoutAlgorithm alg) {
        modified = false;
        Shell shell = new Shell(Display.getDefault());

        TitleAreaDialog dialog = new ModifyDialog(shell);
        dialog.open();

        return modified;
    }

    double gravity = 0.5;
    double strain = 0.5;
    double move = 0.5;
    double length = 0.5;

    /**
     * The Class ModifyDialog.
     */
    class ModifyDialog extends TitleAreaDialog {

        /**
         * Instantiates a new modify dialog.
         * 
         * @param parentShell the parent shell
         */
        public ModifyDialog(Shell parentShell) {
            super(parentShell);
        }

        /**
         * @param parent
         * @return
         * @see org.eclipse.jface.dialogs.TitleAreaDialog#createDialogArea(org.eclipse.swt.widgets.Composite)
         */
        protected Control createDialogArea(Composite parent) {
            this.setTitle("Spring Layout Settings");
            this.setMessage("Adjust settings for graph layout.");
            parent.setLayout(new GridLayout(3, true));

            gravitationAdjustment(parent);
            strainAdjustment(parent);
            lengthAdjustment(parent);
            springMove(parent);

            return super.createDialogArea(parent);
        }

        private void modifyLayout() {
            // zestPart.getViewer().getGraphControl().setLayoutAlgorithm(algorithm, true);
        }

        private void springMove(Composite parent) {
            Label spring = new Label(parent, SWT.NONE);
            spring.setText("Move");
            final Slider springSlider = new Slider(parent, SWT.HORIZONTAL);
            final Text text = new Text(parent, SWT.NONE);

            springSlider.setSelection((int) (move * 100));
            text.setText("" + move);
            springSlider.setMinimum(0);
            springSlider.setMaximum(100);
            springSlider.setIncrement(1);

            springSlider.addSelectionListener(new SelectionListener() {

                public void widgetDefaultSelected(SelectionEvent arg0) {
                }

                public void widgetSelected(SelectionEvent arg0) {
                    move = (double) springSlider.getSelection() / 100;
                    zestPart.setSpringMove(move);
                    text.setText("" + algorithm.getSpringMove());
                    modified = true;
                    modifyLayout();
                }
            });
        }

        private void lengthAdjustment(Composite parent) {
            Label spring = new Label(parent, SWT.NONE);
            spring.setText("Length");
            final Slider springSlider = new Slider(parent, SWT.HORIZONTAL);
            final Text text = new Text(parent, SWT.NONE);
            text.setText("" + length);
            springSlider.setSelection((int) (length * 100));
            springSlider.setMinimum(0);

            springSlider.setMaximum(100);
            springSlider.setIncrement(1);

            springSlider.addSelectionListener(new SelectionListener() {

                public void widgetDefaultSelected(SelectionEvent arg0) {
                }

                public void widgetSelected(SelectionEvent arg0) {
                    length = (double) springSlider.getSelection() / 100;
                    zestPart.setSpringLength(length);
                    text.setText("" + algorithm.getSpringLength());
                    modified = true;
                    modifyLayout();
                }
            });
        }

        private void strainAdjustment(Composite parent) {
            Label spring = new Label(parent, SWT.NONE);

            spring.setText("Strain");
            final Slider springSlider = new Slider(parent, SWT.HORIZONTAL);
            final Text text = new Text(parent, SWT.NONE);
            text.setText("" + strain);
            springSlider.setSelection((int) (strain * 100));
            springSlider.setMinimum(0);
            springSlider.setMaximum(100);
            springSlider.setIncrement(1);

            springSlider.addSelectionListener(new SelectionListener() {

                public void widgetDefaultSelected(SelectionEvent arg0) {
                }

                public void widgetSelected(SelectionEvent arg0) {
                    strain = (double) springSlider.getSelection() / 100;
                    zestPart.setStrain(strain);
                    text.setText("" + algorithm.getSpringStrain());
                    modified = true;
                    modifyLayout();
                }
            });
        }

        private void gravitationAdjustment(Composite parent) {
            Label spring = new Label(parent, SWT.NONE);

            spring.setText("Gravity");
            final Slider springSlider = new Slider(parent, SWT.HORIZONTAL);
            final Text text = new Text(parent, SWT.NONE);
            text.setText("" + gravity);
            springSlider.setSelection((int) (gravity * 100));
            springSlider.setMinimum(0);
            springSlider.setMaximum(100);
            springSlider.setIncrement(1);

            springSlider.addSelectionListener(new SelectionListener() {

                public void widgetDefaultSelected(SelectionEvent arg0) {
                }

                public void widgetSelected(SelectionEvent arg0) {
                    gravity = (double) springSlider.getSelection() / 100;
                    zestPart.setGravity(gravity);
                    text.setText("" + gravity);
                    modified = true;
                    modifyLayout();
                }
            });
        }
    }

    /**
     * @param action
     * @see org.eclipse.ui.IActionDelegate#run(org.eclipse.jface.action.IAction)
     */
    public void run(IAction action) {
        modified = false;
        Shell shell = Display.getDefault().getActiveShell();

        TitleAreaDialog dialog = new ModifyDialog(shell);
        dialog.open();
    }

    /**
     * @param action
     * @param selection
     * @see org.eclipse.ui.IActionDelegate#selectionChanged(org.eclipse.jface.action.IAction, org.eclipse.jface.viewers.ISelection)
     */
    public void selectionChanged(IAction action, ISelection selection) {
        zestPart.setSpringCustomizer(action);
    }
}
