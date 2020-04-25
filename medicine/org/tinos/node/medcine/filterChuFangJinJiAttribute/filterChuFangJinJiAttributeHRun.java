package org.tinos.node.medcine.filterChuFangJinJiAttribute;
import java.io.IOException;

import org.tinos.gui.osgi.*;
public class filterChuFangJinJiAttributeHRun extends ObjectRun{
	private static final long serialVersionUID = 1L;
	public int value = 0;
	public String filepath;
	public filterChuFangJinJiAttributeHRun( ) throws IOException{	
		super();
	}
	
	public void run(final filterChuFangJinJiAttributeHView thisView) throws IOException{
		 thisView.tableout = this.toptablein; 	
	}
}
