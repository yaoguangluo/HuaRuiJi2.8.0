package org.LYG.node.image.FindColorB;
import movieProcessor.LYGFileIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.LYG.GUI.OSGI.*;
public class FindColorBRun extends ObjectRun{
	private static final long serialVersionUID= 1L;
	public int value= 0;
	public String filepath;
	public FindColorBRun() throws IOException{	
		super();
 	}
	public void run(final FindColorBView thisView) throws IOException{
		System.out.println("runed"+ value); 
		thisView.path= new String(filepath); 
  		BufferedImage image= ImageIO.read(new File(filepath));
  		thisView.lygout= new LYGFileIO();
	    thisView.lygout.image= image;
	}
}
