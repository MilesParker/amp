package org.eclipse.amp.escape.amf.ide;

import org.eclipse.amp.escape.gen.EscapeGenActivator;
import org.metaabm.gen.AMFGenPlugin;
import org.metaabm.gen.ascape.AscapeGenActivator;
import org.metaabm.ide.MetaABMBuilder;


public class EscapeGraphicsBuilder extends MetaABMBuilder {

    public final static String ESCAPE_BUILDER_3_ID = "escapeBuilder3";

    private static MetaABMBuilder escapeBuilder;

    public EscapeGraphicsBuilder() {
        super("Generating Escape Proxy", "org.eclipse.amp.escape.gen", "model/generate_escape_graphics.mwe", true);
    }

    public void loadPlugins() {
        AMFGenPlugin.getDefault();
        AscapeGenActivator.getDefault();
        EscapeGenActivator.getDefault();
        super.loadPlugins();
    }

    /**
     * Returns the shared instance
     *
     * @return the shared instance
     */
    public static MetaABMBuilder getEscapeBuilderDefault() {
        if (escapeBuilder == null) {
            escapeBuilder = new EscapeGraphicsBuilder();
        }
        return escapeBuilder;
    }
}
