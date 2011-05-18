package org.eclipse.amp.escape.amf.ide3d;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class EscapeAMF3DPlugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.amp.escape.amf.ide3d"; //$NON-NLS-1$

	// The shared instance
	private static EscapeAMF3DPlugin plugin;

	/**
	 * The constructor
	 */
	public EscapeAMF3DPlugin() {
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static EscapeAMF3DPlugin getDefault() {
		return plugin;
	}

}
