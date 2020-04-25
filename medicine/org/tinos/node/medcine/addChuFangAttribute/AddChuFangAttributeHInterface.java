package org.tinos.node.medcine.addChuFangAttribute;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;

import org.tinos.gui.flash.ThisCanvas;
import org.tinos.gui.osgi.*;
public class AddChuFangAttributeHInterface extends ObjectInterface{	
	JTextPane text;
	Object[][] tableData_old;
	public AddChuFangAttributeHInterface(Object[][] tableData_old, JTextPane text) throws IOException{
		this.text = text;
		this.tableData_old = tableData_old;
		thisIcon = new ImageIcon(this.getClass().getResource("editPaneReader.jpg"));
		thisName = new String("处方药重要属性补充");
		position = new String("MEDCINE");
		Image img = ((ImageIcon) thisIcon).getImage();
		Image newimg = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
	}
	public void config(JTextPane jTextPane, ThisCanvas canvas) throws IOException{
		thisView = new AddChuFangAttributeHView();
		thisRun = new AddChuFangAttributeHRun();
		thisPanel = new AddChuFangAttributeHPanel((AddChuFangAttributeHRun) thisRun, this.text, this.tableData_old);
		thisPanel.config();
		showed = false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException{
		((AddChuFangAttributeHRun) thisRun).run((AddChuFangAttributeHView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception{
		thisView.view();
		showed = true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException{
		thisInterface = new AddChuFangAttributeHInterface(this.tableData_old, this.text);   
		return thisInterface;  
	}
}
