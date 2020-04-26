package org.tinos.node.image.gray.filter;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;

import org.tinos.gui.osgi.*;
public class GrayFilterNodeInterface extends ObjectInterface
{	
	public GrayFilterNodeInterface() throws IOException
 	{
		thisIcon=new ImageIcon(this.getClass().getResource("strench.jpg"));
		thisName=new String("GrayFilter");
		position=new String("IMAGE");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage=img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
 	}
	public void config(JTextPane jTextPane) throws IOException
	{
		thisView=new GrayFilterNodeView();
		thisRun=new GrayFilterNodeRun();
		thisPanel=new GrayFilterNodePanel((GrayFilterNodeRun) thisRun);
		thisPanel.config();
		showed=false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException
	{
		((GrayFilterNodeRun) thisRun).run((GrayFilterNodeView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception
	{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException 
	{  
	        thisInterface = new GrayFilterNodeInterface();   
	        return thisInterface;  
	}
}
