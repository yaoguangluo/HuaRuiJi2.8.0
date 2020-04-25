package org.tinos.node.sound.max.mini.filter;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import org.tinos.gui.osgi.*;
public class MaxMiniFilterNodeInterface extends ObjectInterface
{	
	public MaxMiniFilterNodeInterface() throws IOException
 	{
		thisIcon=new ImageIcon(this.getClass().getResource("LUO.jpg"));
		thisName=new String("ÂÞÑþ¹âFilter");
		position=new String("SOUND");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage=img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
 	}
	public void config(JTextPane jTextPane) throws IOException
	{
		thisView=new MaxMiniFilterNodeView();
		thisRun=new MaxMiniFilterNodeRun();
		thisPanel=new MaxMiniFilterNodePanel((MaxMiniFilterNodeRun) thisRun);
		thisPanel.config();
		showed=false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		((MaxMiniFilterNodeRun) thisRun).run((MaxMiniFilterNodeView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception
	{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        thisInterface = new MaxMiniFilterNodeInterface();   
	        return thisInterface;  
	}
}
