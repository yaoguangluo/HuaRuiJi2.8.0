package org.LYG.node.movie.MovieTransfer;
import java.io.File;
import java.io.IOException;
import javax.media.NoDataSinkException;
import javax.media.NoProcessorException;
import javax.media.NotRealizedError;
import javax.sound.sampled.UnsupportedAudioFileException;
import movieProcessor.Export;
import org.LYG.GUI.OSGI.*;
public class MovieTransferNodeRun extends ObjectRun{
	private static final long serialVersionUID = 1L;
	public int value = 0;
	public String filepath;
	public MovieTransferNodeRun()throws IOException{	
 	}
	@SuppressWarnings({ "deprecation", "unused" })
	public void run(final MovieTransferNodeView thisView) throws IOException, UnsupportedAudioFileException
	, NoProcessorException, NoDataSinkException, NotRealizedError, InterruptedException{		
		File f = new File(this.filepath);
		Export e=new Export(f.toURL().toString());	
	    thisView.lygout=toplygin;
	    System.out.println("run end");
	}
}