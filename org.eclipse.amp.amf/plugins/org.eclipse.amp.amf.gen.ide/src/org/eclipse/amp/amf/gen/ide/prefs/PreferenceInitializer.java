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
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

    /*
     * (non-Javadoc)
     * @seeorg.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#
     * initializeDefaultPreferences()
     */
    public void initializeDefaultPreferences() {
        IPreferenceStore store = GenIDEPlugin.getPlugin().getPreferenceStore();
        store.setDefault(GenConstants.FORMAT_CODE, true);
        store.setDefault(GenConstants.GENERATE_COMMENTS, true);
        store.setDefault(GenConstants.GENERATE_STATS, "single");
        //        store.setDefault(GenConstants.SOURCE_GEN_DIR, "srcgen");
    }

}
