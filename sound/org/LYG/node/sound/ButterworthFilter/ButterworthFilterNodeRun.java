package org.LYG.node.sound.ButterworthFilter;


import java.io.IOException;
import java.util.Vector;

import javax.sound.sampled.AudioInputStream;


import javax.sound.sampled.UnsupportedAudioFileException;

import org.LYG.GUI.OSGI.*;

import soundProcessor.ButterworthPro;
import soundProcessor.BytestoAIS;


public class ButterworthFilterNodeRun extends ObjectRun
{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public ButterworthFilterNodeRun( ) throws IOException
 	{	
 	}
	@SuppressWarnings({ "rawtypes", "unused" })
	public void run(final ButterworthFilterNodeView thisView) throws IOException, UnsupportedAudioFileException
	{ 		
		 //anasys
		 ButterworthPro Bs = new ButterworthPro();
		 Vector lines = Bs.getVectorLines(topaisin);
		 topaisin = new BytestoAIS().getAIS(Bs.butterworth,topaisin);
		 AudioInputStream cp = new BytestoAIS().getAIS(Bs.butterworth,topaisin);
		 thisView.aisout=cp;
	}
}
