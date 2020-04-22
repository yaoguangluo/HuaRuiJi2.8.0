package org.LYG.node.medcine.updateToEditPane;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;

import org.LYG.GUI.Flash.ThisCanvas;
import org.LYG.GUI.OSGI.*;
public class updateToEditPaneInterface extends ObjectInterface{	
	JTextPane text;
	Object[][] tableData_old;
	public updateToEditPaneInterface(Object[][] tableData_old, JTextPane text) throws IOException{
		this.text = text;
		this.tableData_old = tableData_old;
		thisIcon = new ImageIcon(this.getClass().getResource("editPaneReader.jpg"));
		thisName = new String("更新处方列到编辑页");
		position = new String("MEDCINE");
		Image img = ((ImageIcon) thisIcon).getImage();
		Image newimg = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
	}
	public void config(JTextPane jTextPane, ThisCanvas canvas) throws IOException{
		thisView = new updateToEditPaneView();
		thisRun = new updateToEditPaneRun();
		thisPanel = new updateToEditPanePanel((updateToEditPaneRun) thisRun, this.text, this.tableData_old);
		thisPanel.config();
		showed = false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException{
		((updateToEditPaneRun) thisRun).run((updateToEditPaneView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception{
		thisView.view();
		showed = true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException{
		thisInterface = new updateToEditPaneInterface(this.tableData_old, this.text);   
		return thisInterface;  
	}
}
