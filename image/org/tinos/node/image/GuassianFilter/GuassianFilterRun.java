package org.tinos.node.image.GuassianFilter;
import imageProcessor.Guassian;
import java.io.IOException;

import org.tinos.gui.osgi.*;

import movieProcessor.LYGFileIO;
public class GuassianFilterRun extends ObjectRun{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public GuassianFilterRun( ) throws IOException{	
		super();
 	}
	
	public void run(final GuassianFilterView thisView) throws IOException{
		System.out.println("runed"+value); 
		thisView.lygout=new LYGFileIO();
	    thisView.lygout.image=new Guassian().Processor(toplygin.image,3,3,1.6);
	}
}
