package org.LYG.node.image.GrayFilter;
import imageProcessor.ReadWritePng;
import java.io.IOException;
import org.LYG.GUI.OSGI.*;
public class GrayFilterNodeRun extends ObjectRun
{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public GrayFilterNodeRun( ) throws IOException{	
 	}
	public void run(final GrayFilterNodeView thisView) throws IOException{
		System.out.println("runed"+value);   
		topgin=new ReadWritePng().GRNpngRead(toplygin.image);
		thisView.gout=topgin;
		
		
		
		
	}
}
