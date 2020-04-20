package org.LYG.node.image.FindColorB;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;
import org.LYG.GUI.OSGI.*;
public class FindColorBInterface extends ObjectInterface{	
	public FindColorBInterface() throws IOException{
		thisIcon = new ImageIcon(this.getClass().getResource("emboss.jpg"));
		thisName = new String("FindColorB");
		position = new String("IMAGE");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH );
		thisImage = img.getScaledInstance(30,30,java.awt.Image.SCALE_SMOOTH);
		thisIcon = new ImageIcon(newimg);
	}
	public void config(JTextPane jTextPane) throws IOException{
		thisView=new FindColorBView();
		thisRun=new FindColorBRun();
		thisPanel=new FindColorBPanel((FindColorBRun) thisRun);
		thisPanel.config();
		showed=false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException{
		((FindColorBRun) thisRun).run((FindColorBView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception{
		thisView.view();
		showed=true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException {  
		thisInterface = new FindColorBInterface();   
		return thisInterface;  
	}
}
