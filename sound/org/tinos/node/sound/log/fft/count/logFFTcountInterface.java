package org.tinos.node.sound.log.fft.count;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import org.tinos.gui.osgi.*;
public class logFFTcountInterface extends ObjectInterface
{	
	public logFFTcountInterface() throws IOException
 	{
		thisIcon=new ImageIcon(this.getClass().getResource("med.jpg"));
		thisName=new String("logFFTCount");
		position=new String("SOUND");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage=img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
 	}
	public void config(JTextPane jTextPane) throws IOException
	{
		thisView=new logFFTcountView();
		thisRun=new logFFTcountRun();
		thisPanel=new logFFTcountPanel((logFFTcountRun) thisRun);
		thisPanel.config();
		showed=false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		((logFFTcountRun) thisRun).run((logFFTcountView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception
	{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        thisInterface = new logFFTcountInterface();   
	        return thisInterface;  
	}
}
