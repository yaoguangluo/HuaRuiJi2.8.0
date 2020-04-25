package org.tinos.node.medcine.filterChuFangJinJiAttribute;
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
public class filterChuFangJinJiAttributeHPanel extends ObjectPanel{
	private static final long serialVersionUID = 1L;
	private JTextPane textTemp;
	private Object[][] tableData_old;
	public filterChuFangJinJiAttributeHPanel(final filterChuFangJinJiAttributeHRun thisRun, JTextPane text
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
					//表头
					Object[] spec = new Object[] {"中药名","克重","功效","禁忌","性味","经脉"};
					//表行
					Map<Integer,Object[]> cf = new ConcurrentHashMap<>();
					int c=0;
					Here:
						for(int i = 0; i < rc; i++){
							for(int j = 0; j < rc; j++){
								if(thisRun.toptablein.getValueAt(j, 3).toString()
										.contains(thisRun.toptablein.getValueAt(i, 0).toString())) {
									continue Here;
								}
							}
							Object[] obj = new Object[] {thisRun.toptablein.getValueAt(i, 0),
									thisRun.toptablein.getValueAt(i, 1),
									thisRun.toptablein.getValueAt(i, 2),
									thisRun.toptablein.getValueAt(i, 3),
									thisRun.toptablein.getValueAt(i, 4),
									thisRun.toptablein.getValueAt(i, 5),
							};
							cf.put(c++, obj);
						}
					Object[][] content = new Object[cf.size()][6]; 
					for(int i=0;i<content.length;i++) {
						content[i]=cf.get(i);
					}
					thisRun.toptablein = new JTable(content,spec); 
					thisRun.toptablein.setBounds(0, 100, 400, 400);
					thisRun.toptablein.setVisible(true);
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
