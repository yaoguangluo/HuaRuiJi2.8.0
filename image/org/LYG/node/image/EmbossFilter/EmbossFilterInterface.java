package org.LYG.node.image.EmbossFilter;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;
import org.LYG.GUI.OSGI.*;
public class EmbossFilterInterface extends ObjectInterface{	
	public EmbossFilterInterface() throws IOException{
		thisIcon = new ImageIcon(this.getClass().getResource("emboss.jpg"));
		thisName = new String("EmbossFilter");
		position = new String("IMAGE");
		Image img = thisIcon.getImage();
		Image newimg = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage = img.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
		thisIcon = new ImageIcon(newimg);
	}
	public void config(JTextPane jTextPane) throws IOException{
		thisView = new EmbossFilterView();
		thisRun = new EmbossFilterRun();
		thisPanel = new EmbossFilterPanel((EmbossFilterRun) thisRun);
		thisPanel.config();
		showed = false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException{
		((EmbossFilterRun) thisRun).run((EmbossFilterView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException {
		thisInterface = new EmbossFilterInterface();   
		return thisInterface;  
	}
}
