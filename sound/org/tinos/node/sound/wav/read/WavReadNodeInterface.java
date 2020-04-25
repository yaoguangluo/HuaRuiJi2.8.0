package org.tinos.node.sound.wav.read;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import org.tinos.gui.osgi.*;
public class WavReadNodeInterface extends ObjectInterface
{	
	public WavReadNodeInterface() throws IOException
 	{
		thisIcon=new ImageIcon(this.getClass().getResource("MUSIC.jpg"));
		thisName=new String("WAVRead");
		position=new String("SOUND");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage=img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
 	}
	public void config(JTextPane jTextPane) throws IOException
	{
		thisView=new WavReadNodeView();
		thisRun=new WavReadNodeRun();
		thisPanel=new WavReadNodePanel((WavReadNodeRun) thisRun);
		thisPanel.config();
		showed=false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		((WavReadNodeRun) thisRun).run((WavReadNodeView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception
	{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        thisInterface = new WavReadNodeInterface();   
	        return thisInterface;  
	}
}
