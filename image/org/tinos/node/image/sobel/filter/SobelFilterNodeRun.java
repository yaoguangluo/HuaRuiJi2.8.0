package org.tinos.node.image.sobel.filter;
import imageProcessor.Mask;
import imageProcessor.Sobel;
import imageProcessor.Threshold;

import java.io.IOException;

import org.tinos.gui.osgi.*;
public class SobelFilterNodeRun extends ObjectRun{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public SobelFilterNodeRun( ) throws IOException{	
	}
	public void run(final SobelFilterNodeView thisView) throws IOException{
		System.out.println("runed"+value); 
		//thisView.path=new String(filepath); 
		int[][] mag= new Sobel().Processor(topgin,1);	    //1 for mag 2 for dir
		int[][] dir= new Sobel().Processor(topgin,2);
		mag = new Threshold().Processor(mag,12);      //bina value = 20
		dir= new Mask().Processor(mag,dir);           // mag as mask
		topgin=dir;
		thisView.gout=topgin;
		//thisView.out=new JTable(content,spec); 	
		//thisView.out=new JTable(content,spec); 	
	}
}
