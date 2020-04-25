package org.tinos.node.medcine.updateToEditPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextPane;

import org.tinos.gui.osgi.*;

import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Color;
@SuppressWarnings("unused")
public class updateToEditPanePanel extends ObjectPanel{
	private static final long serialVersionUID = 1L;
	private JTextPane textTemp;
	private Object[][] tableData_old;
	public updateToEditPanePanel(final updateToEditPaneRun thisRun, JTextPane text
			, Object[][] tableData_old){
		this.textTemp = text;
		this.tableData_old = tableData_old;
		setLayout(null);
		scrollPane = new ScrollPane();
		add(scrollPane);
		panel = new Panel();
		panel.setLayout(null);
		panel.setBackground(Color.white);
		JButton button = new JButton("完成");
		button.setBounds(0, 0, 150, 30);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println(e.getSource());
				close = true;
				thisRun.value = 1;
			}
		});
		panel.add(button);
		JButton readfile = new JButton("补充处方列重要属性");
		readfile.setBounds(0, 35, 150, 65);
		readfile.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					int rc = thisRun.toptablein.getRowCount();
					
					Map<Integer,Object[]> cf = new ConcurrentHashMap<>();
					String preAdd = "仅作中药推荐，不做处方权分析，请拥有处方权职业药师慎重分析药理根据病情搭配修改。谢谢!";
					preAdd += "\r\n\r\n";
					for(int i=0;i<rc;i++) {
						preAdd += thisRun.toptablein.getValueAt(i, 0);
						preAdd += "/";
						preAdd += thisRun.toptablein.getValueAt(i, 1);
						if(!thisRun.toptablein.getValueAt(i, 1).toString().contains("酌情")) {
							preAdd += "g";	
						}
						preAdd += ";";
						if(i%2!=1) {
							preAdd += "\r\n\r\n";
						}else {
							preAdd += "    ";
						}
					}	
					text.setText(preAdd);
				}catch(Exception e) {		
				}
				
			}
		});
		panel.add(readfile);
		scrollPane.add(panel);
		close=false;
		
	}
	public void config(){
		System.out.println("configued");
	}
}
