package org.tinos.node.ai.WekaPilot2D;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;

import org.tinos.gui.flash.ThisCanvas;
import org.tinos.gui.osgi.*;
public class WekaPilot2DNodeInterface extends ObjectInterface{	
	public WekaPilot2DNodeInterface() throws IOException{
		thisIcon= new ImageIcon(this.getClass().getResource("weka.jpg"));
		thisName= new String("WekaPilot2D");
		position= new String("BI");
		Image img= ((ImageIcon) thisIcon).getImage();  
		Image newimg= img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage= img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisIcon= new ImageIcon(newimg);
	}
	public void config(JTextPane jTextPane, ThisCanvas canvas) throws IOException{
		thisView= new WekaPilot2DNodeView();
		thisRun= new WekaPilot2DNodeRun();
		thisPanel= new WekaPilot2DNodePanel((WekaPilot2DNodeRun) thisRun);
		thisPanel.config();
		showed= false;
	}
	public void execute(JTextPane jTextPane) throws FileNotFoundException, IOException{
		((WekaPilot2DNodeRun) thisRun).run((WekaPilot2DNodeView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException {  
		thisInterface = new WekaPilot2DNodeInterface();   
		return thisInterface;  
	}
}
