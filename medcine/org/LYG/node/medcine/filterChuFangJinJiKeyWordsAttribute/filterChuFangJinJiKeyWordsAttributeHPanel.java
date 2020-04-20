package org.LYG.node.medcine.filterChuFangJinJiKeyWordsAttribute;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import org.LYG.GUI.OSGI.*;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Color;
@SuppressWarnings("unused")
public class filterChuFangJinJiKeyWordsAttributeHPanel extends ObjectPanel{
	private static final long serialVersionUID = 1L;
	private JTextPane textTemp;
	private Object[][] tableData_old;
	public filterChuFangJinJiKeyWordsAttributeHPanel(final filterChuFangJinJiKeyWordsAttributeHRun thisRun, JTextPane text
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
				close= true;
				thisRun.value= 1;
			}
		});
		panel.add(button);
		
		JTextField filterWords=new JTextField("请在此输入需要过滤关键字谢谢！");
		filterWords.setBounds(0, 35, 150, 65);
		panel.add(filterWords);
		
		JButton readfile = new JButton("补充处方列重要属性");
		readfile.setBounds(0, 100, 150, 65);
		readfile.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					int rc = thisRun.toptablein.getRowCount();
					String filterw=filterWords.getText();
					//表头
					Object[] spec = new Object[] {"中药名","克重","功效","禁忌","性味","经脉"};
					//表行
					Map<Integer,Object[]> cf = new ConcurrentHashMap<>();
					int c=0;
					Here:
						for(int i = 0; i < rc; i++){
							for(int j = 0; j < filterw.length();j++) {
								if(thisRun.toptablein.getValueAt(i, 3).toString().contains(""+filterw.charAt(j))) {
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
