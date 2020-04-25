package org.tinos.node.ai.XlsReaderNode;
import java.io.IOException;

import org.tinos.gui.osgi.*;
public class XlsReaderNodeRun extends ObjectRun{
	private static final long serialVersionUID = 1L;
	public int value = 0;
	public String filepath;
	public XlsReaderNodeRun( ) throws IOException{	
	}
	public void run(final XlsReaderNodeView thisView) throws IOException{
		this.setLayout(null);
		System.out.println("runed"+value);	
		thisView.tableout=this.toptablein; 	
	}
}
