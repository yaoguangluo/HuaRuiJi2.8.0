package org.tinos.node.sound.median.filter;






import java.io.IOException;
import java.util.Vector;



import javax.sound.sampled.UnsupportedAudioFileException;

import org.tinos.gui.osgi.*;

import soundProcessor.MedianPro;


public class MedianFilterNodeRun extends ObjectRun
{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public MedianFilterNodeRun( ) throws IOException
 	{	
 	}
	@SuppressWarnings({ "rawtypes", "unused" })
	public void run(final MedianFilterNodeView thisView) throws IOException, UnsupportedAudioFileException
	{
	  		
				 //anasys
				 MedianPro gs=new MedianPro();
				 Vector lines = gs.getVectorLines(toplygin);
				 thisView.lygout=toplygin;
	}
}
