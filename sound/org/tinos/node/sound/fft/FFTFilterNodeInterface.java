package org.tinos.node.sound.fft;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import org.tinos.gui.osgi.*;
public class FFTFilterNodeInterface extends ObjectInterface
{	
	public FFTFilterNodeInterface() throws IOException
 	{
		thisIcon=new ImageIcon(this.getClass().getResource("LUO.jpg"));
		thisName=new String("FFT Filter");
		position=new String("SOUND");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage=img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
 	}
	public void config(JTextPane jTextPane) throws IOException
	{
		thisView=new FFTFilterNodeView();
		thisRun=new FFTFilterNodeRun();
		thisPanel=new FFTFilterNodePanel((FFTFilterNodeRun) thisRun);
		thisPanel.config();
		showed=false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		((FFTFilterNodeRun) thisRun).run((FFTFilterNodeView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception
	{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        thisInterface = new FFTFilterNodeInterface();   
	        return thisInterface;  
	}
}
