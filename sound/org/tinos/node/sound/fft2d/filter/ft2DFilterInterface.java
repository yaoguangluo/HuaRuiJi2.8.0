package org.tinos.node.sound.fft2d.filter;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import org.tinos.gui.osgi.*;
public class ft2DFilterInterface extends ObjectInterface
{	
	public ft2DFilterInterface() throws IOException
 	{
		thisIcon=new ImageIcon(this.getClass().getResource("med.jpg"));
		thisName=new String("fft2D");
		position=new String("SOUND");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage=img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
 	}
	public void config(JTextPane jTextPane) throws IOException
	{
		thisView=new ft2DFilterView();
		thisRun=new ft2DFilterRun();
		thisPanel=new ft2DFilterPanel((ft2DFilterRun) thisRun);
		thisPanel.config();
		showed=false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		((ft2DFilterRun) thisRun).run((ft2DFilterView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception
	{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        thisInterface = new ft2DFilterInterface();   
	        return thisInterface;  
	}
}
