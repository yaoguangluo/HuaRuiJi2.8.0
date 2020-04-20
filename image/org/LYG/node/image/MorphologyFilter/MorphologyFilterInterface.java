package org.LYG.node.image.MorphologyFilter;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;

import org.LYG.GUI.OSGI.*;
public class MorphologyFilterInterface extends ObjectInterface{	
	public MorphologyFilterInterface() throws IOException{
		thisIcon=new ImageIcon(this.getClass().getResource("strench.jpg"));
		thisName=new String("Morphology");
		position=new String("IMAGE");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage=img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
	}
	public void config(JTextPane jTextPane) throws IOException{
		thisView=new MorphologyFilterView();
		thisRun=new MorphologyFilterRun();
		thisPanel=new MorphologyFilterPanel((MorphologyFilterRun) thisRun);
		thisPanel.config();
		showed=false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException{
		((MorphologyFilterRun) thisRun).run((MorphologyFilterView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException {  
		thisInterface = new MorphologyFilterInterface();   
		return thisInterface;  
	}
}
