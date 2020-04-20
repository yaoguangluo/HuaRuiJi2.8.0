package org.LYG.node.sound.MaxMiniFilter;
import java.io.IOException;
import java.util.Vector;

import javax.sound.sampled.UnsupportedAudioFileException;

import org.LYG.GUI.OSGI.*;

import soundProcessor.BytestoAIS;
import soundProcessor.MaxMiniPro;

public class MaxMiniFilterNodeRun extends ObjectRun
{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public MaxMiniFilterNodeRun( ) throws IOException
 	{	
 	}
	@SuppressWarnings({ "rawtypes", "unused" })
	public void run(final MaxMiniFilterNodeView thisView) throws IOException, UnsupportedAudioFileException
	{
	  		
				 //anasys
		 MaxMiniPro MM=new MaxMiniPro();
		 Vector lines = MM.getVectorLines(topaisin);
		 topaisin = new BytestoAIS().getAIS(MM.audioData,topaisin);
				 //play
				 //new soundPlay().Play(ais1);
		 thisView.aisout=topaisin;
	}
}
