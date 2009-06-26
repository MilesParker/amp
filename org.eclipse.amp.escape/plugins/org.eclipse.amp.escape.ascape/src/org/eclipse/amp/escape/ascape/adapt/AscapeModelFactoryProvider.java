package org.eclipse.amp.escape.ascape.adapt;

import org.eclipse.amp.agf.gef.ModelFactoryProvider;
import org.eclipse.gef.EditPartFactory;

public class AscapeModelFactoryProvider implements ModelFactoryProvider {

    public EditPartFactory getEditPartFactory() {
        return new AscapePartFactory();
    }

    public EditPartFactory getEditPartTreeFactory() {
        return new AscapePartTreeFactory();
    }

}
