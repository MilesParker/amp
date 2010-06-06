/**
 * <copyright>
 *
 * Copyright (c) 2007-2009 Metascape, LLC
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *   Metascape - Initial development and maintenance
 *
 * </copyright>
 */
package org.eclipse.amp.amf.gen.ide.prefs;

import org.eclipse.amp.amf.gen.ide.GenIDEPlugin;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

/**
 * This class represents a preference page that is contributed to the
 * Preferences dialog. By subclassing <samp>FieldEditorPreferencePage</samp>, we
 * can use the field support built into JFace that allows us to create a page
 * that is small and knows how to save, restore and apply itself.
 * <p>
 * This page is used to modify preferences only. They are stored in the
 * preference store that belongs to the main plug-in class. That way,
 * preferences can be accessed directly via the preference store.
 */

public class AMPPreferencePage extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

    public AMPPreferencePage() {
        super(GRID);
        setPreferenceStore(GenIDEPlugin.getPlugin().getPreferenceStore());
        setDescription("Customize Agent Modeling Platform and Framework Code Generation.");
    }

    /**
     * Creates the field editors. Field editors are abstractions of the common
     * GUI blocks needed to manipulate various types of preferences. Each field
     * editor knows how to save and restore itself.
     */
    public void createFieldEditors() {
        // addField(new StringFieldEditor(GenConstants.SOURCE_GEN_DIR,
        // "&Generation Directory:", getFieldEditorParent()));
        addField(new BooleanFieldEditor(GenConstants.FORMAT_CODE, "&Format Generated Code", getFieldEditorParent()));
        addField(new BooleanFieldEditor(GenConstants.ORGANIZE_IMPORTS, "&Organize Imports", getFieldEditorParent()));
        addField(new BooleanFieldEditor(GenConstants.GENERATE_COMMENTS, "&Generate Comments", getFieldEditorParent()));
        addField(new RadioGroupFieldEditor(GenConstants.GENERATE_STATS, "Statistics Generation", 1, new String[][] {
            { "&None", "none" }, { "&Single", "single" }, { "&Cross", "cross" } }, getFieldEditorParent()));
    }

    /*
     * (non-Javadoc)
     * @see
     * org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
     */
    public void init(IWorkbench workbench) {
    }

}