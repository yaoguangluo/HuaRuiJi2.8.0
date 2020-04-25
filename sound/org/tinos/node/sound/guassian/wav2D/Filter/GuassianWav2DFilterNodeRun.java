package org.tinos.node.sound.guassian.wav2D.Filter;


import java.io.IOException;
import java.util.Vector;



import javax.sound.sampled.UnsupportedAudioFileException;

import org.tinos.gui.osgi.*;

import soundProcessor.Guassian2dPro;


public class GuassianWav2DFilterNodeRun extends ObjectRun
{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public GuassianWav2DFilterNodeRun( ) throws IOException
 	{	
 	}
	@SuppressWarnings({ "rawtypes", "unused" })
	public void run(final GuassianWav2DFilterNodeView thisView) throws IOException, UnsupportedAudioFileException
	{
	  		
				 //anasys
		 Guassian2dPro gs2=new Guassian2dPro();
		 Vector lines = gs2.getVectorLines(toplygin);
		 thisView.lygout=toplygin;
	}
}
