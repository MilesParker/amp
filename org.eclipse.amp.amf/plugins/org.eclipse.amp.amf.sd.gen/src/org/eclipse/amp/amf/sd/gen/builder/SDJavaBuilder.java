package org.eclipse.amp.amf.sd.gen.builder;

import org.eclipse.amp.amf.gen.ide.MetaABMBuilder;
import org.eclipse.amp.amf.sd.gen.SDActivator;
import org.eclipse.amp.escape.gen.EscapeGenActivator;
import org.metaabm.gen.ascape.AscapeGenActivator;

public class SDJavaBuilder extends MetaABMBuilder {

	private static MetaABMBuilder escapeBuilder;

	public SDJavaBuilder() {
		super("Generating Escape", SDActivator.PLUGIN_ID,
				new String[] { "org/eclipse/amp/amf/sd/gen/builder/buildSd.mwe" }, true);
	}

	public SDJavaBuilder(String workflow) {
		super("Generating Escape", SDActivator.PLUGIN_ID, workflow, true);
	}

	@Override
	public void loadPlugins() {
		EscapeGenActivator.getDefault();
		AscapeGenActivator.getDefault();
		super.loadPlugins();
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static MetaABMBuilder getEscapeBuilderDefault() {
		if (escapeBuilder == null) {
			escapeBuilder = new SDJavaBuilder();
		}
		return escapeBuilder;
	}
}
