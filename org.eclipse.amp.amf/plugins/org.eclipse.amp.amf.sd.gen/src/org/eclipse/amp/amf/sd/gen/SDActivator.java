package org.eclipse.amp.amf.sd.gen;

import java.io.IOException;
import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class SDActivator extends AbstractUIPlugin {
	public static final String PLUGIN_ID = "org.eclipse.amp.amf.sd.gen";
	// The shared instance.
	private static SDActivator plugin;

	public SDActivator() {
		plugin = this;
	}

	/**
	 * This method is called upon plug-in activation
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/**
	 * This method is called when the plug-in is stopped
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
	}

	/**
	 * @return singleton
	 */
	public static SDActivator getDefault() {
		return plugin;
	}

	public static String getAbsoluteDir(String relativPath) {
		URL logURL = getURL(relativPath);
		if (logURL != null) {
			try {
				return FileLocator.toFileURL(logURL).getPath();
			} catch (IOException e) {
				return null;
			}
		}
		return null;
	}

	/**
	 * @param relativPath
	 * @return URL to the relative path
	 */
	public static URL getURL(String relativPath) {
		return FileLocator.find(getDefault().getBundle(), new Path(relativPath), null);
	}
}
