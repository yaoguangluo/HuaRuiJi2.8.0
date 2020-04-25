package org.tinos.node.image.LaplacianFilter;
import imageProcessor.Laplacian;
import java.io.IOException;

import org.tinos.gui.osgi.*;
public class LaplacianFilterRun extends ObjectRun{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public LaplacianFilterRun( ) throws IOException{	
		super();
	}
	public void run(final LaplacianFilterView thisView) throws IOException{
		System.out.println("runed"+value); 
		//thisView.path=new String(filepath); 
		int out[][] = new int[topgin.length][topgin[0].length];
		for (int i = 0; i < topgin.length; i++) {
			for (int j = 0; j < topgin[0].length; j++) {
				out[i][j]=topgin[i][j];
			}
		}		    	
		out= new Laplacian().Processor(out); 
		thisView.gout=out;
	}
}
