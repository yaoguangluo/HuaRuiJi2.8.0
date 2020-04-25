package org.tinos.node.medcine.editPaneReader;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;

import org.tinos.gui.flash.ThisCanvas;
import org.tinos.gui.osgi.*;
public class EditPanelReaderInterface extends ObjectInterface{	
	JTextPane text;
	public EditPanelReaderInterface(JTextPane text) throws IOException{
		this.text = text;
		thisIcon = new ImageIcon(this.getClass().getResource("editPaneReader.jpg"));
		thisName = new String("读取编辑页处方生成行");
		position = new String("MEDCINE");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
	}
	public void config(JTextPane jTextPane, ThisCanvas canvas) throws IOException{
		thisView = new EditPanelReaderView();
		thisRun = new EditPanelReaderRun();
		thisPanel = new EditPanelReaderPanel((EditPanelReaderRun) thisRun, this.text);
		thisPanel.config();
		showed = false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException{
		((EditPanelReaderRun) thisRun).run((EditPanelReaderView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception{
		thisView.view();
		showed = true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException{
		thisInterface = new EditPanelReaderInterface(this.text);   
		return thisInterface;  
	}
}
