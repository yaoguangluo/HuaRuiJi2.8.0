package org.LYG.node.movie.LYGWrite;
import java.awt.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import org.LYG.GUI.OSGI.*;


public class LYGWriteNodeInterface extends ObjectInterface
{	
	public LYGWriteNodeInterface() throws IOException
 	{
		thisIcon=new ImageIcon(this.getClass().getResource("LUO.jpg"));
		thisName=new String("LYGWrite");
		position=new String("MOVIE");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage=img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
 	}
	public void config(JTextPane jTextPane) throws IOException
	{
		thisView=new LYGWriteNodeView();
		thisRun=new LYGWriteNodeRun();
		thisPanel=new LYGWriteNodePanel((LYGWriteNodeRun) thisRun);
		thisPanel.config();
		showed=false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		((LYGWriteNodeRun) thisRun).run((LYGWriteNodeView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception
	{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        thisInterface = new LYGWriteNodeInterface();   
	        return thisInterface;  
	}
}
