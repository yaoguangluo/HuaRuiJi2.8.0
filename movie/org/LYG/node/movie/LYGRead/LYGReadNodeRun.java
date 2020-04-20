package org.LYG.node.movie.LYGRead;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;

import movieProcessor.LYGFileIO;

import org.LYG.GUI.OSGI.*;

public class LYGReadNodeRun extends ObjectRun{
	private static final long serialVersionUID = 1L;
	public int value = 0;
	public String filepath;
	public LYGReadNodeRun()throws IOException{	
 	}
	public void run(final LYGReadNodeView thisView) throws IOException, UnsupportedAudioFileException{		
		toplygin = new LYGFileIO();
		toplygin.reset();
		toplygin.lygRead(filepath);
		//IO.lygRead("C:\\Users\\yaoguang\\Desktop\\study\\sound\\newluo.lyg");
		toplygin.init();
	    thisView.lygout=toplygin;
	    System.out.println("run end");
	}
}
