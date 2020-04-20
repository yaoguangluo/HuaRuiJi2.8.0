package org.LYG.node.movie.AVItoLYG;
import java.awt.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import org.LYG.GUI.OSGI.*;


public class AVItoLYGNodeInterface extends ObjectInterface
{	
	public AVItoLYGNodeInterface() throws IOException
 	{
		thisIcon=new ImageIcon(this.getClass().getResource("LUO.jpg"));
		thisName=new String("AVItoLYG");
		position=new String("MOVIE");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage=img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
 	}
	public void config(JTextPane jTextPane) throws IOException
	{
		thisView=new AVItoLYGNodeView();
		thisRun=new AVItoLYGNodeRun();
		thisPanel=new AVItoLYGNodePanel((AVItoLYGNodeRun) thisRun);
		thisPanel.config();
		showed=false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		((AVItoLYGNodeRun) thisRun).run((AVItoLYGNodeView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception
	{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        thisInterface = new AVItoLYGNodeInterface();   
	        return thisInterface;  
	}
}
