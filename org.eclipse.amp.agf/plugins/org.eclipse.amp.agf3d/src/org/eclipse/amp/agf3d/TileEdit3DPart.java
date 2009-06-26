package org.eclipse.amp.agf3d;

import org.eclipse.draw3d.IFigure3D;
import org.eclipse.draw3d.geometry.Vector3fImpl;

public class TileEdit3DPart extends AgentEdit3DPart {

    public TileEdit3DPart() {
        super();
        setUpdate(false);
    }

    @Override
    protected void assignSize(IFigure3D figure) {
        figure.getPosition3D().setSize3D(new Vector3fImpl(SCALE, SCALE, 0.0f));
    }
}
