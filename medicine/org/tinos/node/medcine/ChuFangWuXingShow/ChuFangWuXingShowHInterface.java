package org.tinos.node.medcine.ChuFangWuXingShow;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;

import org.tinos.gui.flash.ThisCanvas;
import org.tinos.gui.osgi.*;
public class ChuFangWuXingShowHInterface extends ObjectInterface{	
	JTextPane text;
	Object[][] tableData_old;
	public ChuFangWuXingShowHInterface(Object[][] tableData_old, JTextPane text) throws IOException{
		this.text = text;
		this.tableData_old = tableData_old;
		thisIcon = new ImageIcon(this.getClass().getResource("editPaneReader.jpg"));
		thisName = new String("处方五行属性显示");
		position = new String("MEDCINE");
		Image img = ((ImageIcon) thisIcon).getImage();
		Image newimg = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
	}
	public void config(JTextPane jTextPane, ThisCanvas canvas) throws IOException{
		thisView = new ChuFangWuXingShowHView();
		thisRun = new ChuFangWuXingShowHRun();
		thisPanel = new ChuFangWuXingShowHPanel((ChuFangWuXingShowHRun) thisRun, this.text, this.tableData_old);
		thisPanel.config();
		showed = false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException{
		((ChuFangWuXingShowHRun) thisRun).run((ChuFangWuXingShowHView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception{
		thisView.view();
		showed = true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException{
		thisInterface = new ChuFangWuXingShowHInterface(this.tableData_old, this.text);   
		return thisInterface;  
	}
}
