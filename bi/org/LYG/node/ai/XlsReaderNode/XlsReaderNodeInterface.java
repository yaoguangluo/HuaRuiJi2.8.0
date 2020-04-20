package org.LYG.node.ai.XlsReaderNode;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;

import org.LYG.GUI.OSGI.*;
public class XlsReaderNodeInterface extends ObjectInterface{	
	public XlsReaderNodeInterface() throws IOException{
		thisIcon = new ImageIcon(this.getClass().getResource("image.jpg"));
		thisName = new String("XlsReader");
		position = new String("BI");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisImage = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
 	}
	public void config(JTextPane jTextPane) throws IOException {
		thisView = new XlsReaderNodeView();
		thisRun = new XlsReaderNodeRun();
		thisPanel = new XlsReaderNodePanel((XlsReaderNodeRun) thisRun);
		thisPanel.config();
		showed = false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException{
		((XlsReaderNodeRun) thisRun).run((XlsReaderNodeView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException {  
	        thisInterface = new XlsReaderNodeInterface();   
	        return thisInterface;  
	}
}
