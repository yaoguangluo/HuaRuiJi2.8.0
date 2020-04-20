package org.LYG.node.sound.freqCount;


import java.io.IOException;


import javax.sound.sampled.UnsupportedAudioFileException;

import org.LYG.GUI.OSGI.*;



public class freqCountNodeRun extends ObjectRun
{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public freqCountNodeRun( ) throws IOException
 	{	
 	}
	public void run(final freqCountNodeView thisView) throws IOException, UnsupportedAudioFileException
	{
	  		
				 //anasys
		         int size[] = new int[9999];
		         int cacucount = 0;
                 double []reg = toplygin.adataFrame.master;
                 for(int i = 1;i<reg.length-1;i++)
                 {
                	 //find high
                	 if(reg[i]<reg[i+1]&&reg[i]<reg[i-1])
                	 {
                			 size[cacucount]++;
                			 cacucount=0;	 
                     }                	 
                     cacucount++; 
                 }
				
				 
				 thisView.lygout=toplygin;
				 thisView.lygout.fsize=size;
	}
}
