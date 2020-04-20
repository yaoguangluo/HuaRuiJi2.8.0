package org.LYG.node.ai.WekaPilot2D;
import java.io.IOException;
import org.LYG.GUI.OSGI.*;
public class WekaPilot2DNodeRun extends ObjectRun{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public WekaPilot2DNodeRun( ) throws IOException{	
 	}
	public void run(final WekaPilot2DNodeView thisView) throws IOException{
		  System.out.println("runed"+value); 
	  		thisView.path=new String(filepath); 
		  //thisView.out=new JTable(content,spec); 	
	}
}
