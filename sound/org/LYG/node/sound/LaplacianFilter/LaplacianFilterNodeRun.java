package org.LYG.node.sound.LaplacianFilter;


import java.io.IOException;
import java.util.Vector;


import javax.sound.sampled.UnsupportedAudioFileException;

import org.LYG.GUI.OSGI.*;


import soundProcessor.BytestoAIS;
import soundProcessor.LaplacianPro;


public class LaplacianFilterNodeRun extends ObjectRun
{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public LaplacianFilterNodeRun( ) throws IOException
 	{	
 	}
	@SuppressWarnings({ "rawtypes", "unused" })
	public void run(final LaplacianFilterNodeView thisView) throws IOException, UnsupportedAudioFileException
	{
	  		
				 //anasys
		 LaplacianPro gs=new LaplacianPro();
		 Vector lines = gs.getVectorLines(topaisin);
		 topaisin = new BytestoAIS().getAIS(gs.laplacian,topaisin);
				 //play
				 //new soundPlay().Play(ais1);
		 thisView.aisout=topaisin;
	}
}
