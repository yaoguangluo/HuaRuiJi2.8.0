package org.tinos.node.image.FindColorG;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;

import org.tinos.gui.osgi.*;
public class FindColorGInterface extends ObjectInterface{	
	public FindColorGInterface() throws IOException{
		thisIcon = new ImageIcon(this.getClass().getResource("emboss.jpg"));
		thisName = new String("FindColorG");
		position = new String("IMAGE");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH);
		thisIcon = new ImageIcon(newimg);
 	}
	public void config(JTextPane jTextPane) throws IOException
	{
		thisView=new FindColorGView();
		thisRun=new FindColorGRun();
		thisPanel=new FindColorGPanel((FindColorGRun) thisRun);
		thisPanel.config();
		showed=false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException
	{
		((FindColorGRun) thisRun).run((FindColorGView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception
	{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        thisInterface = new FindColorGInterface();   
	        return thisInterface;  
	}
}
