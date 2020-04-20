package org.LYG.node.image.HoughTransform;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;

import org.LYG.GUI.OSGI.*;
public class HoughTransformInterface extends ObjectInterface{	
	public HoughTransformInterface() throws IOException{
		thisIcon=new ImageIcon(this.getClass().getResource("hutans.jpg"));
		thisName=new String("HoughTransform");
		position=new String("IMAGE");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage=img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
	}
	public void config(JTextPane jTextPane) throws IOException{
		thisView=new HoughTransformView();
		thisRun=new HoughTransformRun();
		thisPanel=new HoughTransformPanel((HoughTransformRun) thisRun);
		thisPanel.config();
		showed=false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException{
		((HoughTransformRun) thisRun).run((HoughTransformView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException {  
		thisInterface = new HoughTransformInterface();   
		return thisInterface;  
	}
}
