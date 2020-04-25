package org.tinos.node.medcine.editPaneReaderH;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;

import org.tinos.gui.flash.ThisCanvas;
import org.tinos.gui.osgi.*;
public class EditPanelReaderHInterface extends ObjectInterface{	
	JTextPane text;
	public EditPanelReaderHInterface(JTextPane text) throws IOException{
		this.text = text;
		thisIcon = new ImageIcon(this.getClass().getResource("editPaneReader.jpg"));
		thisName = new String("读取编辑页处方生成列");
		position = new String("MEDCINE");
		Image img = ((ImageIcon) thisIcon).getImage();  
		Image newimg = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH);
		thisImage = img.getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH );
		thisIcon = new ImageIcon(newimg);
	}
	
	public void config(JTextPane rightBotJTextPane, ThisCanvas canvas) throws IOException{
		try {
			thisView = new EditPanelReaderHView();
			thisRun = new EditPanelReaderHRun();
			thisPanel = new EditPanelReaderHPanel((EditPanelReaderHRun) thisRun, this.text);
			thisPanel.config();
			showed = false;
		}catch(Exception e1) {
			rightBotJTextPane.setText("<读取编辑页处方生成列> 节点配置失败请注意是否链接正确。");
			rightBotJTextPane.validate();
		} 
	}
	public void execute(JTextPane rightBotJTextPane) throws FileNotFoundException, IOException{
		try {
			((EditPanelReaderHRun) thisRun).run((EditPanelReaderHView) thisView);
		}catch(Exception e1) {
			rightBotJTextPane.setText("<读取编辑页处方生成列> 节点运行失败请注意是否配置正确。");
			rightBotJTextPane.validate();
		} 
	}
	public void view(JTextPane rightBotJTextPane) throws Exception{
		try {
			thisView.view();
			showed = true;
		}catch(Exception e1) {
			rightBotJTextPane.setText("<读取编辑页处方生成列> 节点查看失败请注意是否运行正确。");
			rightBotJTextPane.validate();
		} 
	}
	public ObjectInterface luoyaoguang() throws CloneNotSupportedException, IOException{
		thisInterface = new EditPanelReaderHInterface(this.text);   
		return thisInterface;  
	}
}
