package org.eclipse.amp.escape.amf.ide;

import org.eclipse.amp.amf.gen.ide.MetaABMBuilder;
import org.eclipse.amp.escape.gen.EscapeGenActivator;
import org.metaabm.gen.ascape.AscapeGenActivator;


public class EscapeModelBuilder extends MetaABMBuilder {

    public final static String ESCAPE_BUILDER_ID = "escapeBuilder";

    private static MetaABMBuilder escapeBuilder;

    public EscapeModelBuilder() {
        super("Generating Escape", "org.eclipse.amp.escape.gen", "model/generate_escape.mwe", true);
    }

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
            escapeBuilder = new EscapeModelBuilder();
        }
        return escapeBuilder;
    }
}
