package org.tinos.node.movie.AVItoLYG;
import java.io.IOException;


import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

import movieProcessor.LYGFileIO;

import org.tinos.gui.osgi.*;
import org.tinos.node.movie.AVItoLYG.jp;

public class AVItoLYGNodeRun extends ObjectRun
{
	private static final long serialVersionUID = 1L;
	public int value = 0;
	public String filepath;
	public String writefile;
	jp jj;
	public String filepathWAV;
	public AVItoLYGNodeRun()throws IOException
 	{	
 	}
	public void run(final AVItoLYGNodeView thisView) throws IOException, UnsupportedAudioFileException
	{		
		 thisView.lygout = new LYGFileIO();
		 jj = new jp(filepath ,filepathWAV,writefile, thisView.lygout);			
		 JFrame ff = new JFrame();
		 ff.add(jj);
	     ff.setSize(500, 200);
	     ff.setVisible(true);
	    System.out.println("run end");
	}
}
