package org.tinos.node.medcine.editPaneReaderH;
import java.io.IOException;

import org.tinos.gui.osgi.*;
public class EditPanelReaderHRun extends ObjectRun{
	private static final long serialVersionUID = 1L;
	public int value = 0;
	public String filepath;
	public EditPanelReaderHRun( ) throws IOException{	
		super();
	}
	public void run(final EditPanelReaderHView thisView) throws IOException{
		 thisView.tableout = this.toptablein; 	
	}
}
