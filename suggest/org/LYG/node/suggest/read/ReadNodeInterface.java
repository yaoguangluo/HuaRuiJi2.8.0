package org.LYG.node.suggest.read;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;

import org.LYG.GUI.Flash.ThisCanvas;
import org.LYG.GUI.OSGI.*;
public class ReadNodeInterface extends ObjectInterface{	
	public ReadNodeInterface(Object[][] tableData_old, JTextPane text) throws IOException{
		thisIcon= new ImageIcon(this.getClass().getResource("LUO.jpg"));
		thisName= new String("Read");
		position= new String("BI");
		Image img= ((ImageIcon) thisIcon).getImage();  
		Image newimg= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage= img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisIcon= new ImageIcon(newimg);
	}
	
	public void config(JTextPane jTextPane, ThisCanvas canvas) throws IOException{
		thisView= new ReadNodeView();
		thisRun= new ReadNodeRun();
		thisPanel= new ReadNodePanel((ReadNodeRun) thisRun, canvas);
		thisPanel.config();
		showed= false;
	}
	
	public void execute(JTextPane jTextPane) throws FileNotFoundException, IOException{
		((ReadNodeRun) thisRun).run((ReadNodeView) thisView);
	}
	
	public void view(JTextPane rightBotJTextPane) throws Exception{
		thisView.view();
		showed= true;
	}
	
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException {  
		thisInterface= new ReadNodeInterface(null, null);   
		return thisInterface;  
	}
}
