package org.LYG.node.medcine.ChuFangWuXingShow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextPane;
import org.LYG.GUI.OSGI.*;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.Color;
@SuppressWarnings("unused")
public class ChuFangWuXingShowHPanel extends ObjectPanel{
	private static final long serialVersionUID = 1L;
	private JTextPane textTemp;
	private Object[][] tableData_old;
	public ChuFangWuXingShowHPanel(final ChuFangWuXingShowHRun thisRun, JTextPane text
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
		JButton readfile = new JButton("处方五行配置生成");
		readfile.setBounds(0, 35, 150, 65);
		readfile.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					thisRun.topMapIn = new ConcurrentHashMap<>();
					for(int i=0;i<thisRun.toptablein.getRowCount();i++) {
						if(null != thisRun.toptablein.getValueAt(i, 5)) {
							String temp = thisRun.toptablein.getValueAt(i, 5).toString();
							if(temp.contains("足太阴")||temp.contains("通行十二")||temp.contains("脾")) {
								if(thisRun.topMapIn.containsKey("足太阴")) {
									thisRun.topMapIn.put("足太阴", thisRun.topMapIn.get("足太阴"));
								}else {
									thisRun.topMapIn.put("足太阴", 1);
								}
							}
							if(temp.contains("足少阴")||temp.contains("通行十二")||temp.contains("肾")) {
								if(thisRun.topMapIn.containsKey("足少阴")) {
									thisRun.topMapIn.put("足少阴", thisRun.topMapIn.get("足少阴"));
								}else {
									thisRun.topMapIn.put("足少阴", 1);
								}
							}
							if(temp.contains("足厥阴")||temp.contains("通行十二")||temp.contains("肝")) {
								if(thisRun.topMapIn.containsKey("足厥阴")) {
									thisRun.topMapIn.put("足厥阴", thisRun.topMapIn.get("足厥阴"));
								}else {
									thisRun.topMapIn.put("足厥阴", 1);
								}
							}
							if(temp.contains("足太阳")||temp.contains("通行十二")||temp.contains("膀胱")) {
								if(thisRun.topMapIn.containsKey("足太阳")) {
									thisRun.topMapIn.put("足太阳", thisRun.topMapIn.get("足太阳"));
								}else {
									thisRun.topMapIn.put("足太阳", 1);
								}
							}
							if(temp.contains("足少阳")||temp.contains("通行十二")||temp.contains("胆")) {
								if(thisRun.topMapIn.containsKey("足少阳")) {
									thisRun.topMapIn.put("足少阳", thisRun.topMapIn.get("足少阳"));
								}else {
									thisRun.topMapIn.put("足少阳", 1);
								}
							}
							if(temp.contains("足阳明")||temp.contains("通行十二")||temp.contains("胃")) {
								if(thisRun.topMapIn.containsKey("足阳明")) {
									thisRun.topMapIn.put("足阳明", thisRun.topMapIn.get("足阳明"));
								}else {
									thisRun.topMapIn.put("足阳明", 1);
								}
							}
							if(temp.contains("手太阴")||temp.contains("通行十二")||temp.contains("肺")) {
								if(thisRun.topMapIn.containsKey("手太阴")) {
									thisRun.topMapIn.put("手太阴", thisRun.topMapIn.get("手太阴"));
								}else {
									thisRun.topMapIn.put("手太阴", 1);
								}
							}
							if(temp.contains("手少阴")||temp.contains("通行十二")||temp.contains("心")) {
								if(thisRun.topMapIn.containsKey("手少阴")) {
									thisRun.topMapIn.put("手少阴", thisRun.topMapIn.get("手少阴"));
								}else {
									thisRun.topMapIn.put("手少阴", 1);
								}
							}
							if(temp.contains("手厥阴")||temp.contains("通行十二")||temp.contains("心包")) {
								if(thisRun.topMapIn.containsKey("手厥阴")) {
									thisRun.topMapIn.put("手厥阴", thisRun.topMapIn.get("手厥阴"));
								}else {
									thisRun.topMapIn.put("手厥阴", 1);
								}
							}
							if(temp.contains("手太阳")||temp.contains("通行十二")||temp.contains("小肠")) {
								if(thisRun.topMapIn.containsKey("手太阳")) {
									thisRun.topMapIn.put("手太阳", thisRun.topMapIn.get("手太阳"));
								}else {
									thisRun.topMapIn.put("手太阳", 1);
								}
							}
							if(temp.contains("手少阳")||temp.contains("通行十二")||temp.contains("三焦")) {
								if(thisRun.topMapIn.containsKey("手少阳")) {
									thisRun.topMapIn.put("手少阳", thisRun.topMapIn.get("手少阳"));
								}else {
									thisRun.topMapIn.put("手少阳", 1);
								}
							}
							if(temp.contains("手阳明")||temp.contains("通行十二")||temp.contains("大肠")) {
								if(thisRun.topMapIn.containsKey("手阳明")) {
									thisRun.topMapIn.put("手阳明", thisRun.topMapIn.get("手阳明"));
								}else {
									thisRun.topMapIn.put("手阳明", 1);
								}
							}
						}
					}
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
