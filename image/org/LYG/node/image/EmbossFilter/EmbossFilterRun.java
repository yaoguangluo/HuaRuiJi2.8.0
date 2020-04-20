package org.LYG.node.image.EmbossFilter;
import imageProcessor.Emboss;
import java.io.IOException;
import org.LYG.GUI.OSGI.*;
public class EmbossFilterRun extends ObjectRun{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public EmbossFilterRun( ) throws IOException{	
		super();
	}
	public void run(final EmbossFilterView thisView) throws IOException{
		System.out.println("runed"+value); 
		//thisView.path=new String(filepath); 
		int out[][] = new int[topgin.length][topgin[0].length];
		for (int i = 0; i < topgin.length; i++) {
			for (int j = 0; j < topgin[0].length; j++) 
			{
				out[i][j]=topgin[i][j];
			}
		}		    	
		out= new Emboss().Processor(out);
		//gin = new Strech().Processor(out,0.1,0.9); 
		thisView.gout=out;	
	}
}
