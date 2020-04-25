package org.tinos.node.sound.laplacian.filter;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.*;

import org.tinos.gui.osgi.*;
public class LaplacianFilterNodeInterface extends ObjectInterface
{	
	public LaplacianFilterNodeInterface() throws IOException
 	{
		thisIcon=new ImageIcon(this.getClass().getResource("laplas.jpg"));
		thisName=new String("LaplacianWavFilter");
		position=new String("SOUND");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage=img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
 	}
	public void config(JTextPane jTextPane) throws IOException
	{
		thisView=new LaplacianFilterNodeView();
		thisRun=new LaplacianFilterNodeRun();
		thisPanel=new LaplacianFilterNodePanel((LaplacianFilterNodeRun) thisRun);
		thisPanel.config();
		showed=false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException, UnsupportedAudioFileException
	{
		((LaplacianFilterNodeRun) thisRun).run((LaplacianFilterNodeView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception
	{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        thisInterface = new LaplacianFilterNodeInterface();   
	        return thisInterface;  
	}
}
