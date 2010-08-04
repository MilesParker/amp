/**
 * 
 */
package org.eclipse.amp.axf.ide;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;


// TODO: Auto-generated Javadoc
/**
 * The Class ExecutionPerspectiveFactory.
 * 
 * @author Miles Parker
 */
public class ExecutionPerspectiveFactory implements IPerspectiveFactory {

    /*
     * (non-Javadoc)
     * @see
     * org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui
     * .IPageLayout)
     */
    /**
     * @param layout
     * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)
     */
    public void createInitialLayout(IPageLayout layout) {
        layout.setEditorAreaVisible(false);
//        layout.addPlaceholder("org.eclipse.amp.escape.view.GraphicsView:S0", IPageLayout.RIGHT, .5f, "org.eclipse.jdt.ui.PackageExplorer");
//        layout.addPlaceholder("org.eclipse.amp.view.GEFView:S0", IPageLayout.RIGHT, .5f, "org.eclipse.jdt.ui.PackageExplorer");
//        layout.addPlaceholder("org.eclipse.amp.view.GEFView:S1", IPageLayout.RIGHT, .5f, "org.eclipse.jdt.ui.PackageExplorer");
//        layout.addPlaceholder("org.eclipse.amp.view.GEFView:S2", IPageLayout.RIGHT, .5f, "org.eclipse.jdt.ui.PackageExplorer");
    }
}
