package org.tinos.node.movie.MovieTransfer;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;


import javax.sound.sampled.UnsupportedAudioFileException;

import javax.swing.*;

import org.tinos.gui.osgi.*;

public class MovieTransferNodeInterface extends ObjectInterface
{	
	public MovieTransferNodeInterface() throws IOException
 	{
		thisIcon = new ImageIcon(this.getClass().getResource("LUO.jpg"));
		thisName = new String("MovieTransfer");
		position = new String("MOVIE");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
 	}
	public void config(JTextPane jTextPane) throws IOException
	{
		thisView = new MovieTransferNodeView();
		thisRun = new MovieTransferNodeRun();
		thisPanel = new MovieTransferNodePanel((MovieTransferNodeRun) thisRun);
		thisPanel.config();
		showed = false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		try {
			((MovieTransferNodeRun) thisRun).run((MovieTransferNodeView) thisView);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		} 
	}
	public void view(JTextPane jTextPane)  throws Exception
	{
		thisView.view();
		showed = true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        thisInterface = new MovieTransferNodeInterface();   
	        return thisInterface;  
	}
}
