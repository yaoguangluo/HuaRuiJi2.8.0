package org.tinos.node.sound.guassian.wav2D.Filter;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import org.tinos.gui.osgi.*;
public class GuassianWav2DFilterNodeInterface extends ObjectInterface
{	
	public GuassianWav2DFilterNodeInterface() throws IOException
 	{
		thisIcon=new ImageIcon(this.getClass().getResource("gaosi.jpg"));
		thisName=new String("GuassianWaveFilter");
		position=new String("SOUND");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage=img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
 	}
	public void config(JTextPane jTextPane) throws IOException
	{
		thisView=new GuassianWav2DFilterNodeView();
		thisRun=new GuassianWav2DFilterNodeRun();
		thisPanel=new GuassianWav2DFilterNodePanel((GuassianWav2DFilterNodeRun) thisRun);
		thisPanel.config();
		showed=false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		((GuassianWav2DFilterNodeRun) thisRun).run((GuassianWav2DFilterNodeView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception
	{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        thisInterface = new GuassianWav2DFilterNodeInterface();   
	        return thisInterface;  
	}
}
