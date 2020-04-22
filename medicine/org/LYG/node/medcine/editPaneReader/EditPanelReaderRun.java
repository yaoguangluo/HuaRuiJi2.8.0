package org.LYG.node.medcine.editPaneReader;
import java.io.IOException;
import org.LYG.GUI.OSGI.*;
public class EditPanelReaderRun extends ObjectRun{
	private static final long serialVersionUID = 1L;
	public int value = 0;
	public String filepath;
	public EditPanelReaderRun( ) throws IOException{	
		super();
	}
	public void run(final EditPanelReaderView thisView) throws IOException{
		 thisView.tableout = this.toptablein; 	
	}
}
