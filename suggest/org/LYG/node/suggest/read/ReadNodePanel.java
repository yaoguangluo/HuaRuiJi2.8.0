package org.LYG.node.suggest.read;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.LYG.GUI.Flash.ThisCanvas;
import org.LYG.GUI.OSGI.*;
import org.LYG.sets.stable.StableData;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Color;
import java.awt.Frame;
public class ReadNodePanel extends ObjectPanel{
	private static final long serialVersionUID= 1L;
	public JLabel labelWords;
	public String fileCurrentpath= "";
	public JTextField filterWords;
	public ReadNodePanel(final ReadNodeRun thisRun, ThisCanvas canvas){
		setLayout(null);
		scrollPane= new ScrollPane();
		add(scrollPane);
		panel= new Panel();
		panel.setLayout(null);
		
		panel.setBackground(Color.white);
		JButton button= new JButton("确定");
		button.setBounds(0, 120, 150, 30);
		button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	System.out.println(e.getSource());
                	close= true;
                	thisRun.value= 1;
                	thisRun.searchString= filterWords.getText();
                	String value= labelWords.getText();
                	thisRun.addressString= value;
                	}
        });   
		panel.add(button);
		
		labelWords= new JLabel("Null");
		labelWords.setBounds(155, 0, 100, 30);
		panel.add(labelWords);
		
		JButton buttonRoot= new JButton("选择搜索根目录");
		buttonRoot.setBounds(0, 0, 150, 30);
		buttonRoot.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	System.out.println(e.getSource());
            	String fileCurrentpath= "";
//        		javax.swing.JOptionPane jOptionPane= new JOptionPane(StableData.ATTENSION_SELECT_ENSURE
//        				+ fileCurrentpath+ StableData.MARK_QUESTION);
//				int confirm= jOptionPane.showConfirmDialog(canvas, StableData.ATTENSION_SELECT_ENSURE
//        				+ fileCurrentpath+ StableData.MARK_QUESTION);
//				FileDialog filedialog= new FileDialog(new Frame(), StableData.ATTENSION_LOAD_HISTORY
//						, FileDialog.LOAD);
//				filedialog.setFilenameFilter(new TXTFilter(StableData.FILE_FORMAT_ETL));
//				filedialog.setVisible(true);
//				fileCurrentpath= filedialog.getDirectory();
				
				JFileChooser jFileChooser= new JFileChooser();
				jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				jFileChooser.setFileHidingEnabled(false);
				jFileChooser.showDialog(new Frame(), StableData.ATTENSION_SELECT_ENSURE);
				File file= jFileChooser.getSelectedFile();
				fileCurrentpath= file.getAbsolutePath();
				
        		System.out.println(fileCurrentpath);
        		labelWords.setText(fileCurrentpath);
            }
        });   
		panel.add(buttonRoot);
		
		filterWords= new JTextField("请在此输入需要搜索的内容！");
		filterWords.setBounds(0, 35, 220, 70);
		panel.add(filterWords);
		
		scrollPane.add(panel);
		close= false;
 	}
	public void config(){    
		System.out.println("configued");      
	}
}
