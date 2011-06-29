package org.eclipse.amp.agf.gef;

import org.eclipse.ui.IPartListener2;
import org.eclipse.ui.IWorkbenchPartReference;

public class EditPartPartListener implements IPartListener2 {

	private EditPartViewPart viewPart;
	
	public EditPartPartListener(EditPartViewPart viewPart){
		this.viewPart = viewPart;
	}
	
	public void partActivated(IWorkbenchPartReference partRef) {
		if(viewPart.getId().equals(partRef.getId())){
			viewPart.refresh();
		}
	}

	public void partBroughtToTop(IWorkbenchPartReference partRef) {
		//
	}

	public void partClosed(IWorkbenchPartReference partRef) {
		if(viewPart.getId().equals(partRef.getId())){
			viewPart.removePartListener(this);
		}
	}

	public void partDeactivated(IWorkbenchPartReference partRef) {
		//
	}

	public void partOpened(IWorkbenchPartReference partRef) {
		// 
	}

	public void partHidden(IWorkbenchPartReference partRef) {
		// 
	}

	public void partVisible(IWorkbenchPartReference partRef) {
		// 
	}

	public void partInputChanged(IWorkbenchPartReference partRef) {
		// 			
	}

}
