package org.tinos.node.medcine.addChuFangAttribute;
import java.io.IOException;

import org.tinos.gui.osgi.*;
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
