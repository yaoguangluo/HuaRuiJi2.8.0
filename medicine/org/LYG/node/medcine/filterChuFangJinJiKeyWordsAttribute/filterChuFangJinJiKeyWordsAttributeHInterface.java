package org.LYG.node.medcine.filterChuFangJinJiKeyWordsAttribute;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;

import org.LYG.GUI.Flash.ThisCanvas;
import org.LYG.GUI.OSGI.*;
public class filterChuFangJinJiKeyWordsAttributeHInterface extends ObjectInterface{	
	JTextPane text;
	Object[][] tableData_old;
	public filterChuFangJinJiKeyWordsAttributeHInterface(Object[][] tableData_old, JTextPane text) throws IOException{
		this.text = text;
		this.tableData_old = tableData_old;
		thisIcon = new ImageIcon(this.getClass().getResource("editPaneReader.jpg"));
		thisName = new String("处方药禁忌属性过滤");
		position = new String("MEDCINE");
		Image img = ((ImageIcon) thisIcon).getImage();
		Image newimg = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
	}
	public void config(JTextPane jTextPane, ThisCanvas canvas) throws IOException{
		thisView = new filterChuFangJinJiKeyWordsAttributeHView();
		thisRun = new filterChuFangJinJiKeyWordsAttributeHRun();
		thisPanel = new filterChuFangJinJiKeyWordsAttributeHPanel((filterChuFangJinJiKeyWordsAttributeHRun) thisRun, this.text, this.tableData_old);
		thisPanel.config();
		showed = false;
	}
	public void execute(JTextPane jTextPane)  throws FileNotFoundException, IOException{
		((filterChuFangJinJiKeyWordsAttributeHRun) thisRun).run((filterChuFangJinJiKeyWordsAttributeHView) thisView);
	}
	public void view(JTextPane jTextPane)  throws Exception{
		thisView.view();
		showed = true;
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException{
		thisInterface = new filterChuFangJinJiKeyWordsAttributeHInterface(this.tableData_old, this.text);   
		return thisInterface;  
	}
}
