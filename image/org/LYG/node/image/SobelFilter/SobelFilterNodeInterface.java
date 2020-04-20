package org.LYG.node.image.SobelFilter;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;
import org.LYG.GUI.OSGI.*;
public class SobelFilterNodeInterface extends ObjectInterface{	
	public SobelFilterNodeInterface() throws IOException{
		thisIcon=new ImageIcon(this.getClass().getResource("sobel.jpg"));
		thisName=new String("SobelFilter");
		position=new String("IMAGE");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage=img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
	}
	public void config(JTextPane jTextPane) throws IOException{
		thisView=new SobelFilterNodeView();
		thisRun=new SobelFilterNodeRun();
		thisPanel=new SobelFilterNodePanel((SobelFilterNodeRun) thisRun);
		thisPanel.config();
		showed=false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException{
		((SobelFilterNodeRun) thisRun).run((SobelFilterNodeView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception{
		((SobelFilterNodeView) thisView).view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException {  
		thisInterface = new SobelFilterNodeInterface();   
		return thisInterface;  
	}
}
