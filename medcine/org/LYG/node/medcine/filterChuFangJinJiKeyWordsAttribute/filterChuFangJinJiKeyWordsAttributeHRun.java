package org.LYG.node.medcine.filterChuFangJinJiKeyWordsAttribute;
import java.io.IOException;
import org.LYG.GUI.OSGI.*;
public class filterChuFangJinJiKeyWordsAttributeHRun extends ObjectRun{
	private static final long serialVersionUID = 1L;
	public int value = 0;
	public String filepath;
	public filterChuFangJinJiKeyWordsAttributeHRun( ) throws IOException{	
		super();
	}
	
	public void run(final filterChuFangJinJiKeyWordsAttributeHView thisView) throws IOException{
		 thisView.tableout = this.toptablein; 	
	}
}
