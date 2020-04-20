package org.LYG.node.movie.LYGRead;
import java.awt.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import org.LYG.GUI.OSGI.*;


public class LYGReadNodeInterface extends ObjectInterface
{	
	public LYGReadNodeInterface() throws IOException
 	{
		thisIcon=new ImageIcon(this.getClass().getResource("LUO.jpg"));
		thisName=new String("LYGRead");
		position=new String("MOVIE");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage=img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
 	}
	public void config(JTextPane jTextPane) throws IOException
	{
		thisView=new LYGReadNodeView();
		thisRun=new LYGReadNodeRun();
		thisPanel=new LYGReadNodePanel((LYGReadNodeRun) thisRun);
		thisPanel.config();
		showed=false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		((LYGReadNodeRun) thisRun).run((LYGReadNodeView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception
	{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        thisInterface = new LYGReadNodeInterface();   
	        return thisInterface;  
	}
}
