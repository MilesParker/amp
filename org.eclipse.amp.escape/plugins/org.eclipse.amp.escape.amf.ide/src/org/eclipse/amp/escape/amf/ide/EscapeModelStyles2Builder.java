package org.eclipse.amp.escape.amf.ide;

import org.eclipse.amp.amf.gen.ide.MetaABMBuilder;
import org.eclipse.amp.escape.gen.EscapeGenActivator;
import org.metaabm.gen.ascape.AscapeGenActivator;


public class EscapeModelStyles2Builder extends MetaABMBuilder {

    public final static String ESCAPE_BUILDER_2_ID = "escapeBuilder2";

    private static MetaABMBuilder escapeBuilder;

    public EscapeModelStyles2Builder() {
        super("Generating Escape Styles", "org.eclipse.amp.escape.gen", "model/generate_escape_styles2.mwe", true);
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
            escapeBuilder = new EscapeModelStyles2Builder();
        }
        return escapeBuilder;
    }
}
