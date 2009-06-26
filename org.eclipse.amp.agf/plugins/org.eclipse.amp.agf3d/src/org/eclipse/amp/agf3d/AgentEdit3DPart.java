package org.eclipse.amp.agf3d;

import org.eclipse.amp.agf.gef.AgentEditPart;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw3d.Figure3D;
import org.eclipse.draw3d.IFigure3D;
import org.eclipse.draw3d.RenderContext;
import org.eclipse.draw3d.geometry.Position3D;
import org.eclipse.draw3d.geometry.Vector3fImpl;
import org.eclipse.draw3d.shapes.SolidCube;

public class AgentEdit3DPart extends AgentEditPart {

    SolidCube cube;

    boolean update = true;

    protected IFigure createFigure() {
        // if (getMemberProvider().getParent(getModel()) == null) {
        // ScalableFreeformLayeredPane scalableFreeformLayeredPane = new ScalableFreeformLayeredPane();
        // f = scalableFreeformLayeredPane;
        // f.setBounds(new Rectangle(new Point(0, 0), calculateDimension()));
        // } else {
        // f = new FreeformLayer();
        // f.setBounds(getRootScapeEditPart().getFigure().getBounds());
        // }
        // f.setLayoutManager(new XYLayout());
        // f.setOpaque(false);
        final IFigure3D figure = new Figure3D() {
            public void render(RenderContext renderContext) {
                Position3D fp = getPosition3D();
                cube.setPosition(fp);
                cube.render(renderContext);
            }
        };
        cube = new SolidCube();
        updateGraphics();
        assignSize(figure);
        return figure;
    }

    protected void assignSize(final IFigure3D figure) {
        figure.getPosition3D().setSize3D(new Vector3fImpl(SCALE * .75f, SCALE * .75f, SCALE * .75f));
        // marker.getPosition3D().setLocation3D(new Vector3fImpl(SCALE * .25f, SCALE * .25f, SCALE * .25f));
        // marker.getPosition3D().setSize3D(new Vector3fImpl(SCALE * .25f, SCALE * .25f, SCALE * .25f));
    }

    protected void updateGraphics() {
    }

    protected void refreshVisuals() {
        super.refreshVisuals();
        if (update) {
            updateGraphics();
        }
    }

    public boolean isUpdate() {
        return update;
    }

    public void setUpdate(boolean update) {
        this.update = update;
    }

    public SolidCube getCube() {
        return cube;
    }

}
