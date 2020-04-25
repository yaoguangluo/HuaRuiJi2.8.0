package org.tinos.node.image.imageRead;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import org.tinos.gui.osgi.*;

import movieProcessor.LYGFileIO;
public class imageReadNodeRun extends ObjectRun{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public imageReadNodeRun( ) throws IOException{	
	}
	public void run(final imageReadNodeView thisView) throws IOException{
		System.out.println("runed"+value); 
		thisView.path=new String(filepath); 
		BufferedImage image = ImageIO.read(new File(filepath));
		//image = new Strech().Processor(image,0.1,0.9); 
		//image = new Median().Processor(image,0.1,0.9); 
		//guassian filter
		//image = new Guassian().Processor(image,3,3,1.6);
		//lygimage to jpeg
		//String pathBin = filepath;//output path
		//File outputBin = new File(pathBin);
		//mageIO.write(image, "jpg", outputBin);
		thisView.lygout=new LYGFileIO();
		thisView.lygout.image=image;
		//thisView.gout=topgin;
	}
}
