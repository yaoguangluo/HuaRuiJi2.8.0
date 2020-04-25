package org.tinos.node.image.Show3D;




import java.io.IOException;

import org.tinos.gui.osgi.*;
public class Show3DRun extends ObjectRun
{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public Show3DRun( ) throws IOException
 	{	
		super();
 	}
	public void run(final Show3DView thisView) throws IOException
	{
		System.out.println("runed"+value); 
  		//thisView.path=new String(filepath); 
	 	  int out[][] = new int[topgin.length][topgin[0].length];
	       for (int i = 0; i < topgin.length; i++) 
	       {
	           for (int j = 0; j < topgin[0].length; j++) 
	           {
	            out[i][j]=topgin[i][j];
	           }
	       }		    	
		//gin = new Strech().Processor(out,0.1,0.9); 
		thisView.gout=out;
	  //thisView.out=new JTable(content,spec); 	
		  //thisView.out=new JTable(content,spec); 	
	}
}
