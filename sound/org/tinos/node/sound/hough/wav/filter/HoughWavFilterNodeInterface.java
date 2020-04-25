package org.tinos.node.sound.hough.wav.filter;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import org.tinos.gui.osgi.*;
public class HoughWavFilterNodeInterface extends ObjectInterface
{	
	public HoughWavFilterNodeInterface() throws IOException
 	{
		thisIcon=new ImageIcon(this.getClass().getResource("hutans.jpg"));
		thisName=new String("HoughWavFilter");
		position=new String("SOUND");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage=img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
 	}
	public void config(JTextPane jTextPane) throws IOException
	{
		thisView=new HoughWavFilterNodeView();
		thisRun=new HoughWavFilterNodeRun();
		thisPanel=new HoughWavFilterNodePanel((HoughWavFilterNodeRun) thisRun);
		thisPanel.config();
		showed=false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		((HoughWavFilterNodeRun) thisRun).run((HoughWavFilterNodeView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception
	{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        thisInterface = new HoughWavFilterNodeInterface();   
	        return thisInterface;  
	}
}
