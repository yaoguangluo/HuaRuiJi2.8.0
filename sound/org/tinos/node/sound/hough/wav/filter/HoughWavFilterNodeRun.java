package org.tinos.node.sound.hough.wav.filter;


import java.io.IOException;
import java.util.Vector;



import javax.sound.sampled.UnsupportedAudioFileException;

import org.tinos.gui.osgi.*;

import soundProcessor.BytestoAIS;
import soundProcessor.HoughPro;


public class HoughWavFilterNodeRun extends ObjectRun
{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public HoughWavFilterNodeRun( ) throws IOException
 	{	
 	}
	@SuppressWarnings({ "rawtypes", "unused" })
	public void run(final HoughWavFilterNodeView thisView) throws IOException, UnsupportedAudioFileException
	{
	  		
				 //anasys
		 HoughPro gs=new HoughPro();
		 Vector lines = gs.getVectorLines(topaisin);
		 topaisin = new BytestoAIS().getAIS(gs.audioData,topaisin);
				 //play
				 //new soundPlay().Play(ais1);
		 thisView.aisout=topaisin;
	}
}
