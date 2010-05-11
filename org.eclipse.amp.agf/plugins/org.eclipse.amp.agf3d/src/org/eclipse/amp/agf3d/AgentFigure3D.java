package org.eclipse.amp.agf3d;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw3d.FigureSurface;
import org.eclipse.draw3d.ISurface;
import org.eclipse.draw3d.ShapeFigure3D;
import org.eclipse.draw3d.shapes.Shape;

/**
 * 
 * @author mparker
 *
 */
public class AgentFigure3D extends ShapeFigure3D {

    private final AgentEdit3DPart agentPart3D;
    private ISurface m_surface = new FigureSurface(this);

    public AgentFigure3D(AgentEdit3DPart agentEdit3DPart) {
        agentPart3D = agentEdit3DPart;
        setBackgroundColor(ColorConstants.white);
        setAlpha(255);
    }
    @Override
    public ISurface getSurface() {
        return m_surface;
    }
    /**
     * @see IFigure#revalidate()
     */
    public void revalidate() {
        // if our state or position can change, we will always want to redraw, otherwise, we never do.
        if (agentPart3D.update) {
            // invalidate();
            // helper.revalidate();
        }
    }
    /**
     * @return
     * @see org.eclipse.draw3d.ShapeFigure3D#createShape()
     */
    protected Shape createShape() {
        Shape createShape = agentPart3D.getShapeProvider().getShape3D(agentPart3D.getModel(), this);
        return createShape;
    }
}