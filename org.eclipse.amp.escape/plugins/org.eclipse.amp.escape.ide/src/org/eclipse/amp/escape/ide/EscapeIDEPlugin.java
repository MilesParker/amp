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
package org.eclipse.amp.escape.ide;

import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.statushandlers.StatusManager;
import org.osgi.framework.BundleContext;

// TODO: Auto-generated Javadoc
/**
 * The activator class controls the plug-in life cycle.
 */
public class EscapeIDEPlugin extends AbstractUIPlugin {

    // The plug-in ID
    public static final String PLUGIN_ID = "org.eclipse.amp.escape.ide";

    // The shared instance
    private static EscapeIDEPlugin plugin;

    /**
     * The constructor.
     */
    public EscapeIDEPlugin() {
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    /**
     *
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    public void start(BundleContext context) throws Exception {
        super.start(context);
        plugin = this;
    }

    /*
     * (non-Javadoc)
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    /**
     *
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    /**
     * Info.
     * 
     * @param msg the msg
     */
    public static void info(String msg) {
        StatusManager.getManager().handle(new Status(Status.INFO, "org.eclipse.amp.escape.core", msg));
    }

    /**
     * Warn.
     * 
     * @param msg the msg
     * @param e the e
     */
    public static void warn(String msg, Throwable e) {
        StatusManager.getManager().handle(new Status(Status.WARNING, "org.eclipse.amp.escape.core", msg, e));
    }

    /**
     * Err show.
     * 
     * @param msg the msg
     * @param e the e
     */
    public static void errShow(String msg, Throwable e) {
        StatusManager.getManager().handle(new Status(Status.ERROR, "org.eclipse.amp.escape.core", msg, e),
                                          StatusManager.SHOW | StatusManager.LOG);
    }

    /**
     * Err.
     * 
     * @param msg the msg
     * @param e the e
     */
    public static void err(String msg, Throwable e) {
        StatusManager.getManager().handle(new Status(Status.ERROR, "org.eclipse.amp.escape.core", msg, e));
    }

    /**
     * Returns the shared instance.
     * 
     * @return the shared instance
     */
    public static EscapeIDEPlugin getDefault() {
        return plugin;
    }

}
