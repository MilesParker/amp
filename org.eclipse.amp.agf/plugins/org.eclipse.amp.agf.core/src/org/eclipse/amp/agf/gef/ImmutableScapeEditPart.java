package org.eclipse.amp.agf.gef;

import org.eclipse.amp.axf.core.ICompositionProvider;
import org.eclipse.jface.viewers.IFilter;


public class ImmutableScapeEditPart extends ScapeEditPart {

    public synchronized void refresh() {
        if (!isFirstRefresh()) {
            super.refresh();
        }
    }

    public ImmutableScapeEditPart(ICompositionProvider memberProvider, ILocationProvider locationProvider,
            IExtentProvider extentProvider, IGraphProvider graphProvider, IFilter filter) {
        super(memberProvider, locationProvider, extentProvider, graphProvider, filter);
    }
}
