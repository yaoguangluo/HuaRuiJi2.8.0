package org.LYG.node.image.FindColorR;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;

import org.LYG.GUI.OSGI.*;
public class FindColorRInterface extends ObjectInterface{	
	public FindColorRInterface() throws IOException{
		thisIcon = new ImageIcon(this.getClass().getResource("emboss.jpg"));
		thisName = new String("FindColorR");
		position = new String("IMAGE");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH);
		thisIcon = new ImageIcon(newimg);
 	}
	public void config(JTextPane jTextPane) throws IOException
	{
		thisView=new FindColorRView();
		thisRun=new FindColorRRun();
		thisPanel=new FindColorRPanel((FindColorRRun) thisRun);
		thisPanel.config();
		showed=false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException
	{
		((FindColorRRun) thisRun).run((FindColorRView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception
	{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        thisInterface = new FindColorRInterface();   
	        return thisInterface;  
	}
}
