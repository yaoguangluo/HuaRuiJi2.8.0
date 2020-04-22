package org.LYG.node.medcine.addChuFangAttribute;
import java.io.IOException;
import org.LYG.GUI.OSGI.*;
public class AddChuFangAttributeHRun extends ObjectRun{
	private static final long serialVersionUID = 1L;
	public int value = 0;
	public String filepath;
	public AddChuFangAttributeHRun( ) throws IOException{	
		super();
	}
	public void run(final AddChuFangAttributeHView thisView) throws IOException{
		 thisView.tableout = this.toptablein; 	
	}
}
