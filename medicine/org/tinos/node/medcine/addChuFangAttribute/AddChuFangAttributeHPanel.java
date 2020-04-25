package org.tinos.node.medcine.addChuFangAttribute;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextPane;

import org.tinos.gui.osgi.*;

import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Color;
@SuppressWarnings("unused")
public class AddChuFangAttributeHPanel extends ObjectPanel{
	private static final long serialVersionUID= 1L;
	private JTextPane textTemp;
	private Object[][] tableData_old;
	public AddChuFangAttributeHPanel(final AddChuFangAttributeHRun thisRun, JTextPane text
			, Object[][] tableData_old){
		this.textTemp= text;
		this.tableData_old= tableData_old;
		setLayout(null);
		scrollPane= new ScrollPane();
		add(scrollPane);
		panel= new Panel();
		panel.setLayout(null);
		panel.setBackground(Color.white);
		JButton button= new JButton("完成");
		button.setBounds(0, 0, 150, 30);
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println(e.getSource());
				close= true;
				thisRun.value= 1;
			}
		});
		panel.add(button);
		JButton readfile= new JButton("补充处方列重要属性");
		readfile.setBounds(0, 35, 150, 65);
		readfile.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					int rc= thisRun.toptablein.getRowCount();
					Object[][] content= new Object[rc][6]; 
					//表头
					Object[] spec= new Object[] {"中药名","克重","功效","禁忌","性味","经脉"};
					//表行
					Here:
						for(int i= 0; i< rc; i++){
							content[i][0]= thisRun.toptablein.getValueAt(i, 0);
							content[i][1]= thisRun.toptablein.getValueAt(i, 1);
							for(int j= 0; j< tableData_old.length; j++) {
								if(tableData_old[j][2].toString().equalsIgnoreCase(content[i][0].toString())) {
									content[i][2]=tableData_old[j][4];
									content[i][3]=tableData_old[j][5];
									content[i][4]=tableData_old[j][7];
									content[i][5]=tableData_old[j][8];
									continue Here;
								}
							}
						}				
					thisRun.toptablein= new JTable(content,spec); 
					thisRun.toptablein.setBounds(0, 100, 400, 400);
					thisRun.toptablein.setVisible(true);
				}catch(Exception e) {
				}
			}
		});
		panel.add(readfile);
		scrollPane.add(panel);
		close= false;
	}
	public void config(){
		System.out.println("configued");
	}
}
