package org.tinos.node.sound.lyg.slave.filter;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import org.tinos.gui.osgi.*;
public class lygSlaveFilterInterface extends ObjectInterface
{	
	public lygSlaveFilterInterface() throws IOException
 	{
		thisIcon=new ImageIcon(this.getClass().getResource("med.jpg"));
		thisName=new String("lygSlave");
		position=new String("SOUND");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage=img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
 	}
	public void config(JTextPane jTextPane) throws IOException
	{
		thisView=new lygSlaveFilterView();
		thisRun=new lygSlaveFilterRun();
		thisPanel=new lygSlaveFilterPanel((lygSlaveFilterRun) thisRun);
		thisPanel.config();
		showed=false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		((lygSlaveFilterRun) thisRun).run((lygSlaveFilterView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception
	{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        thisInterface = new lygSlaveFilterInterface();   
	        return thisInterface;  
	}
}
