package org.LYG.node.medcine.updateToEditPane;
import java.io.IOException;
import org.LYG.GUI.OSGI.*;
public class updateToEditPaneRun extends ObjectRun{
	private static final long serialVersionUID = 1L;
	public int value = 0;
	public String filepath;
	public updateToEditPaneRun( ) throws IOException{	
		super();
	}
	
	public void run(final updateToEditPaneView thisView) throws IOException{
		 thisView.tableout = this.toptablein; 	
	}
}
