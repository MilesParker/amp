package org.eclipse.amp.axf.sd;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class SdRtActivator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	public void start(BundleContext bundleContext) throws Exception {
		SdRtActivator.context = bundleContext;
	}

	public void stop(BundleContext bundleContext) throws Exception {
		SdRtActivator.context = null;
	}

}
