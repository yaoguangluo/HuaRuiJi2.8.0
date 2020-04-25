package org.tinos.node.image.MorphologyFilter;



import java.io.IOException;

import org.tinos.gui.osgi.*;
public class MorphologyFilterRun extends ObjectRun
{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public MorphologyFilterRun( ) throws IOException
 	{	
 	}
	public void run(final MorphologyFilterView thisView) throws IOException
	{
		System.out.println("runed"+value);   
		  int out[][] = new int[topgin.length][topgin[0].length];
		  int mor[][] = new int[topgin.length][topgin[0].length];
		  
		  double t=Math.PI/6;
	       for (int i = 0; i < topgin.length; i++) 
	       {
	           for (int j = 0; j < topgin[0].length; j++) 
	           {
	            out[i][j]=topgin[i][j];
	            
	            int temp = (int)(i-j*Math.tan(t));
	            if(temp<topgin.length)
	            	if(temp>=0)
	                 mor[temp][j]=topgin[i][j];
	           }
	       }		    	
	 
	      
	       
	       
	       
	       
		thisView.gout=mor;
		
		
		
		
	}
}
