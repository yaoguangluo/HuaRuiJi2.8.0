package org.tinos.node.image.MedianImageFilter;
import imageProcessor.Median;
import java.io.IOException;

import org.tinos.gui.osgi.*;

import movieProcessor.LYGFileIO;
public class MedianImageNodeRun extends ObjectRun{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public MedianImageNodeRun( ) throws IOException{	
 	}
	public void run(final MedianImageNodeView thisView) throws IOException{
		System.out.println("runed"+value);   
		thisView.lygout=new LYGFileIO();
	    thisView.lygout.image=new Median().Processor(this.toplygin.image,3,3); 
	}
}
