package org.tinos.node.image.show.third.dimension;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;

import org.tinos.gui.osgi.*;
public class Show3DInterface extends ObjectInterface{	
	public Show3DInterface() throws IOException{
		thisIcon=new ImageIcon(this.getClass().getResource("3Dshow.jpg"));
		thisName=new String("3D Show");
		position=new String("IMAGE");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage=img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
	}
	public void config(JTextPane jTextPane) throws IOException{
		thisView=new Show3DView();
		thisRun=new Show3DRun();
		thisPanel=new Show3DPanel((Show3DRun) thisRun);
		thisPanel.config();
		showed=false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException{
		((Show3DRun) thisRun).run((Show3DView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException {  
		thisInterface = new Show3DInterface();   
		return thisInterface;  
	}
}
