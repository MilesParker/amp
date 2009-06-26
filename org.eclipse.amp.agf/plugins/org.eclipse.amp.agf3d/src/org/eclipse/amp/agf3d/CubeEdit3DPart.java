package org.eclipse.amp.agf3d;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw3d.Figure3D;
import org.eclipse.draw3d.IFigure3D;
import org.eclipse.draw3d.RenderContext;
import org.eclipse.draw3d.geometry.IVector3f;
import org.eclipse.draw3d.geometry.Position3D;
import org.eclipse.draw3d.geometry.Position3DImpl;
import org.eclipse.draw3d.geometry.Vector3fImpl;
import org.eclipse.draw3d.shapes.SolidCube;

public class CubeEdit3DPart extends AgentEdit3DPart {

    SolidCube[] markers = new SolidCube[4];

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
                IVector3f fl = fp.getLocation3D();
                int i = 0;
                for (SolidCube marker : markers) {
                    Position3DImpl pos = new Position3DImpl();
                    pos.setSize3D(new Vector3fImpl(SCALE * .25f, SCALE * .25f, SCALE * .25f));
                    pos.setLocation3D(new Vector3fImpl(fl.getX() + SCALE * (i / 2) * 0.5f, fl.getY() + SCALE * (i % 2)
                                                       * 0.5f, fl.getZ() + SCALE * 0.75f));
                    if (marker != null) {
                        marker.setPosition(pos);
                        marker.render(renderContext);
                    }
                    i++;
                }
                cube.setPosition(fp);
                cube.render(renderContext);
            }
        };
        cube = new SolidCube();
        updateGraphics();
        assignSize(figure);
        return figure;
    }

    public SolidCube getMarker(int index) {
        return markers[index - 1];
    }

    public void setShowMarker(int markerID, boolean show) {
        if (show) {
            markers[markerID - 1] = new SolidCube();
        } else {
            markers[markerID - 1] = null;
        }
    }
}
