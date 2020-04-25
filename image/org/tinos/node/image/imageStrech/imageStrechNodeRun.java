package org.tinos.node.image.imageStrech;
import imageProcessor.Strech;
import java.io.IOException;

import org.tinos.gui.osgi.*;

import movieProcessor.LYGFileIO;
public class imageStrechNodeRun extends ObjectRun{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public imageStrechNodeRun( ) throws IOException{	
	}
	public void run(final imageStrechNodeView thisView) throws IOException{
		System.out.println("runed"+value);   
		thisView.lygout=new LYGFileIO();
		thisView.lygout.image=new Strech().Processor(this.toplygin.image,0.1,0.9); 
	}
}
