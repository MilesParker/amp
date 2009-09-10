package org.eclipse.amp.escape.ascape.adapt;

import java.util.ArrayList;
import java.util.List;

import org.ascape.model.Agent;
import org.ascape.model.CellOccupant;
import org.ascape.model.HostCell;
import org.ascape.model.Scape;
import org.ascape.model.space.Graph;
import org.eclipse.amp.agf3d.AgentEdit3DPart;
import org.eclipse.amp.agf3d.CubeEdit3DPart;
import org.eclipse.amp.agf3d.ScapeEdit3DPart;
import org.eclipse.amp.agf3d.TileEdit3DPart;
import org.eclipse.amp.axf.core.ICompositionProvider;
import org.eclipse.amp.escape.ascape.wrap.ScapeWrapperModel;
import org.eclipse.gef.EditPart;

public class Ascape3DPartFactory extends AscapePartFactory {

    protected EditPart getPartForElement(Object model) {
        if (model instanceof ScapeWrapperModel) {
            return getPartForElement(((ScapeWrapperModel) model).getScape());
        }
        if (model instanceof Scape) {
            Scape scape = (Scape) model;
            AscapeProvider memberProvider = (AscapeProvider) getMemberProvider(scape);
            return new ScapeEdit3DPart(memberProvider, memberProvider, memberProvider, memberProvider, getFilter(scape));
        } else if (model instanceof HostCell) {
            return new TileEdit3DPart();
        } else if (model instanceof CellOccupant) {
            return new CubeEdit3DPart();
        } else if (model instanceof Agent) {
            return new AgentEdit3DPart();
        } else {
            return null;
            // throw new RuntimeException("No part for the model: " + model
            // + (model != null ? "[" + model.getClass() + "]" : ""));
        }
    }

    protected ICompositionProvider getMemberProvider(Scape scape) {
        ICompositionProvider memberProvider = null;
        if (scape.isRoot()) {
            memberProvider = new AscapeProvider() {
                @SuppressWarnings("unchecked")
                public java.util.List getList(Object hasIterable) {
                    List list = new ArrayList(super.getList(hasIterable));
                    List newList = new ArrayList(super.getList(hasIterable));
                    for (Object object : list) {
                        if (!(((Scape) object).getSpace() instanceof Graph)) {
                            newList.add(object);
                        }
                    }
                    return newList;
                };
            };
        } else {
            memberProvider = new AscapeProvider();
        }
        return memberProvider;
    }
}
