package org.tinos.node.image.MedianImageFilter;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;

import org.tinos.gui.osgi.*;
public class MedianImageNodeInterface extends ObjectInterface{	
	public MedianImageNodeInterface() throws IOException{
		thisIcon=new ImageIcon(this.getClass().getResource("strench.jpg"));
		thisName=new String("MedianImage");
		position=new String("IMAGE");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage=img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
	}
	public void config(JTextPane jTextPane) throws IOException{
		thisView=new MedianImageNodeView();
		thisRun=new MedianImageNodeRun();
		thisPanel=new MedianImageNodePanel((MedianImageNodeRun) thisRun);
		thisPanel.config();
		showed=false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException{
		((MedianImageNodeRun) thisRun).run((MedianImageNodeView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException {  
		thisInterface = new MedianImageNodeInterface();   
		return thisInterface;  
	}
}
