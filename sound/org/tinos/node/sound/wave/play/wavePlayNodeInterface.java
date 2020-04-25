package org.tinos.node.sound.wave.play;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import org.tinos.gui.osgi.*;
public class wavePlayNodeInterface extends ObjectInterface
{	
	public wavePlayNodeInterface() throws IOException
 	{
		thisIcon=new ImageIcon(this.getClass().getResource("play.jpg"));
		thisName=new String("WavePlay");
		position=new String("SOUND");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage=img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
 	}
	public void config(JTextPane jTextPane) throws IOException
	{
		thisView=new wavePlayNodeView();
		thisRun=new wavePlayNodeRun();
		thisPanel=new wavePlayNodePanel((wavePlayNodeRun) thisRun);
		thisPanel.config();
		showed=false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException, UnsupportedAudioFileException, InterruptedException
	{
		((wavePlayNodeRun) thisRun).run((wavePlayNodeView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception
	{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        thisInterface = new wavePlayNodeInterface();   
	        return thisInterface;  
	}
}
