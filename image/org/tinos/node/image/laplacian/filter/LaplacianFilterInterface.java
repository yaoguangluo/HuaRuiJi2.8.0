package org.tinos.node.image.laplacian.filter;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;

import org.tinos.gui.osgi.*;
public class LaplacianFilterInterface extends ObjectInterface{	
	public LaplacianFilterInterface() throws IOException{
		thisIcon=new ImageIcon(this.getClass().getResource("laplas.jpg"));
		thisName=new String("LaplcianImageFilter");
		position=new String("IMAGE");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage=img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
	}
	public void config(JTextPane jTextPane) throws IOException{
		thisView=new LaplacianFilterView();
		thisRun=new LaplacianFilterRun();
		thisPanel=new LaplacianFilterPanel((LaplacianFilterRun) thisRun);
		thisPanel.config();
		showed=false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException{
		((LaplacianFilterRun) thisRun).run((LaplacianFilterView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException {  
		thisInterface = new LaplacianFilterInterface();   
		return thisInterface;  
	}
}
