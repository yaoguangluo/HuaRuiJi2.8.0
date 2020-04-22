package sample.xi.yi.yao.xue;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;

import comp.jbutton.DetaButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import org.deta.tinos.string.StringSwap;
import org.tinos.engine.analysis.Analyzer;
import org.tinos.tcp.http.RestCall;
import org.tinos.view.obj.WordFrequency;
import org.tinos.view.stable.StableData;

import sample.AppBoot;
import sample.TableSorter;
//import sample.xysc.dictionary;
import sort.Quick6DLYGWithStringSwap;
public class xysc extends Container implements MouseListener, KeyListener{
	private static final long serialVersionUID = 1L;
	public String key;
	public JTextPane data ;
	public JTextPane statistic;
	public DetaButton buttonPrev;
	public DetaButton buttonNext;
	public DetaButton buttonSum;
	public DetaButton buttonCrt;
	public int currentPage;
	public List<String> sets;
	public JTextField name;
	public javax.swing.JTable table;  
	public Object[][] tableData_old;
	public DefaultTableModel newTableModel = null;
	public List<String> copy;
	public AppBoot app;
	public Map<String,Object> dic_yao_ming;
	public Map<String,Object> dic_chengfen_danwei;
	public Map<String,Object> dic_yong_fa;
	public Map<String,Object> dic_yong_liang;
	public Map<String,Object> dic_yao_li;
	public Map<String,Object> dic_zhu_yi;
	public Map<String,Object> dic_shi_ying;
	public Map<String,Object> dic_bu_liang_fan_ying;
	public Map<String,Object> dic_yao_wu_xiang_hu_zuo_yong;
	public Map<String,Object> dic_qi_ta;
	public Map<String, Object> dic_jie_shao;
	public Analyzer analyzer; 
	public Map<String, String> pos;
	public DetaButton buttonCTE;
	public DetaButton buttonFRS;
	public DetaButton buttonETC;
	public Map<String, String> pose;
	public Map<String, String> etc;
	public Map<String, String> cte;
	public JTabbedPane jTabbedpanel;
	public Object[] columnTitle= {"ID", "���", "��ҩ��", "����", "ҩ��", "��Ҫ�ɷ�", "�÷�", 
			"ע������", "��Ӧ֢", "������Ӧ", "����", "ҩ���໥����", "����"};  
	public JTextPane text ;
	public xysc(JTextPane text, Analyzer analyzer, Map<String, String> pos
			, Map<String, String> pose, Map<String, String> etc
			, Map<String, String> cte, AppBoot app, JTabbedPane jTabbedpane) throws IOException{
		this.app= app;
		this.text = text;	this.pose = pose;
		this.etc = etc;
		this.cte = cte;
		this.analyzer = analyzer;
		this.pos = pos;
		this.jTabbedpanel= jTabbedpane;
		this.setLayout(null);
		this.setBounds(0, 0, 1490, 980);	
		JScrollPane jsp_name = new JScrollPane(this.name());
		jsp_name.setBounds(100, 15, 680, 50);
		JScrollPane jsp_data = new JScrollPane(this.data());
		JScrollPane jsp_statistic = new JScrollPane(this.statistic());

		jsp_statistic.setBounds(5, 290 + 100 - 80 + 200-260, 1440 - 650 - 645, 500-166+90);
		jsp_data.setBounds(5 + 800-650, 290 + 100 - 80 + 200-260, 1440-800+650-130, 500-166+90);
		JLabel jlabel = new JLabel("��Ϣ����:");  
		jlabel.setBounds(5, 15, 100, 50);
		JScrollPane jsp = new JScrollPane(this.jTable());
		jsp.setBounds(5, 80-80, 1440-130, 200+100+200-260);

		this.add(jsp);  
		this.add(jsp_data); 
		this.add(jsp_statistic);  
	}

	public JTextPane data() throws IOException {
		data = new JTextPane();  
		data.setBounds(850, 150, 1440-600, 800);

		buttonSum = new DetaButton("���� " + (sets==null?0:(1 + sets.size() / 2001))+ " ҳ");
		buttonSum.setBounds(0, 0, 100, 30);
		buttonCrt = new DetaButton("��ǰҳ�棺" + (currentPage + 1));
		buttonCrt.setBounds(120, 0, 150, 30);

		buttonPrev= new DetaButton("<-��ǰ��ҳ");
		buttonPrev.setBounds(290, 0, 100, 30);
		buttonPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Map<String, WordFrequency> map = new ConcurrentHashMap<>();
				try {
					currentPage-=1;
					currentPage = (currentPage< 0 ? 0 : currentPage );
					StringBuilder page = new StringBuilder().append("<br/><br/>");
					List<String> setsForGet = sets.subList(currentPage*2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
					Iterator<String> iterator = setsForGet.iterator();
					Here:
						while(iterator.hasNext()) {
							String setOfi = iterator.next();
							if(pos.get(setOfi) == null) {
								page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("��")||pos.get(setOfi).contains("��")||pos.get(setOfi).contains("��")) {
								if (map.containsKey(setOfi)) {
									WordFrequency wordFrequency = map.get(setOfi);
									wordFrequency.setFrequency(wordFrequency.getFrequency() + StableData.INT_ONE);
									map.put(setOfi, wordFrequency);
								} else {
									WordFrequency wordFrequency = new WordFrequency();
									wordFrequency.setFrequency(StableData.INT_ONE);
									wordFrequency.setWord(setOfi);
									map.put(setOfi, wordFrequency);
								}
							}
							if (!setOfi.equals("")) {
								if(key.contains(setOfi)&&(pos.get(setOfi).contains("��")||pos.get(setOfi).contains("��")||pos.get(setOfi).contains("��"))) {
									page.append("<span style=\"background:red\"><font color=\"white\">"+setOfi+"</font></span>");
				    				continue Here;
				    			}
								if(pos.get(setOfi).contains("��")) {
									page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
									continue Here;
								}
								if(pos.get(setOfi).contains("��")) {
									page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
									continue Here;
								}
								if(pos.get(setOfi).contains("��")) {
									page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
									continue Here;
								}
								if(pos.get(setOfi).contains("��")) {
									page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
									continue Here;
								} 
								page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");			 
							}
						}	
					buttonCrt.setText("��ǰҳ�棺" + (currentPage + 1));
					data.setText(page.toString());
					data.setSelectionStart(0);
					data.setSelectionEnd(0);
					data.validate();
				}catch(Exception e1){
					jTabbedpanel.validate();
					data.validate();
				}   
				try {
					statistic.setSize(500, 800);
					Map<Integer, WordFrequency> fwa = analyzer.sortWordFrequencyMapToSortMap(map);
					statistic.setContentType("text/html");
					StringBuilder page = new StringBuilder();
					Here:
						for (int i = fwa.size()-1; i >= 0; i--) {
							if (fwa.get(i) != null) {
								if(pos.get(fwa.get(i).getWord()) == null) {
									page.append("<div style=\"background:black\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() + "</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("��")) {
									page.append( "<div style=\"background:#FF44FF\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("��")) {
									page.append("<div style=\"background:#8CEA00\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("��")) {
									page.append("<div style=\"background:#FF9224\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
								}
							}
						}	
					statistic.setText(page.toString());
					statistic.setSelectionStart(0);
					statistic.setSelectionEnd(0);
					statistic.validate();
				}catch(Exception e1){	
					jTabbedpanel.validate();
					statistic.validate();
				}          
			}
		});
		buttonNext= new DetaButton("���ҳ->");
		buttonNext.setBounds(410, 0, 100, 30);
		buttonNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Map<String, WordFrequency> map = new ConcurrentHashMap<>();
				try {
					currentPage+=1;
					currentPage = (currentPage > (sets == null ? 0 : sets.size()) / 2001 ? currentPage - 1 : currentPage );
					StringBuilder page = new StringBuilder().append("<br/><br/>");
					List<String> setsForGet = sets.subList(currentPage*2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
					Iterator<String> iterator = setsForGet.iterator();
					Here:
						while(iterator.hasNext()) {
							String setOfi = iterator.next();
							if(pos.get(setOfi) == null) {
								page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("��")||pos.get(setOfi).contains("��")||pos.get(setOfi).contains("��")) {
								if (map.containsKey(setOfi)) {
									WordFrequency wordFrequency = map.get(setOfi);
									wordFrequency.setFrequency(wordFrequency.getFrequency() + StableData.INT_ONE);
									map.put(setOfi, wordFrequency);
								} else {
									WordFrequency wordFrequency = new WordFrequency();
									wordFrequency.setFrequency(StableData.INT_ONE);
									wordFrequency.setWord(setOfi);
									map.put(setOfi, wordFrequency);
								}
							}
							if (!setOfi.equals("")) {
								if(key.contains(setOfi)&&(pos.get(setOfi).contains("��")||pos.get(setOfi).contains("��")||pos.get(setOfi).contains("��"))) {
									page.append("<span style=\"background:red\"><font color=\"white\">"+setOfi+"</font></span>");
				    				continue Here;
				    			}
								if(pos.get(setOfi).contains("��")) {
									page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
									continue Here;
								}
								if(pos.get(setOfi).contains("��")) {
									page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
									continue Here;
								}
								if(pos.get(setOfi).contains("��")) {
									page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
									continue Here;
								}
								if(pos.get(setOfi).contains("��")) {
									page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
									continue Here;
								} 
								page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");			 
							}
						}
					buttonCrt.setText("��ǰҳ�棺" + (currentPage + 1));
					data.setText(page.toString());
					data.setSelectionStart(0);
					data.setSelectionEnd(0);
					data.validate();
				}catch(Exception e1){	
					data.validate();
					jTabbedpanel.validate();
				}   
				try {
					statistic.setSize(500, 800);
					Map<Integer, WordFrequency> fwa = analyzer.sortWordFrequencyMapToSortMap(map);
					statistic.setContentType("text/html");
					StringBuilder page = new StringBuilder();
					Here:
						for (int i = fwa.size()-1; i >= 0; i--) {
							if (fwa.get(i) != null) {
								if(pos.get(fwa.get(i).getWord()) == null) {
									page.append("<div style=\"background:black\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() + "</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("��")) {
									page.append( "<div style=\"background:#FF44FF\"><font color=\"white\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("��")) {
									page.append("<div style=\"background:#8CEA00\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
									continue Here;
								}
								if(pos.get(fwa.get(i).getWord()).contains("��")) {
									page.append("<div style=\"background:#FF9224\"><font color=\"black\" size=\"5\">" + fwa.get(i).getWord()+""+fwa.get(i).getFrequency() +"</font></div>");
								}
							}
						}	
					statistic.setText(page.toString());
					statistic.setSelectionStart(0);
					statistic.setSelectionEnd(0);
					statistic.validate();
				}catch(Exception e1){	
					statistic.validate();
					jTabbedpanel.validate();
					data.validate();
				}  
			}
		});
		buttonCTE = new DetaButton("Ӣ��ע��");
		buttonCTE.setBounds(630, 0, 100, 30);
		buttonCTE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if(sets==null) {
				return;
			}
				StringBuilder page = new StringBuilder().append("<br/><br/>");
				List<String> setsForGet = sets.subList(currentPage * 2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
				Iterator<String> iterator = setsForGet.iterator();
				Here:
					while(iterator.hasNext()) {
						String setOfi = iterator.next();
						if(pos.get(setOfi) == null) {
							page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");
							continue Here;
						}
						if (!setOfi.equals("")) {
							if(key.contains(setOfi)&&(pos.get(setOfi).contains("��")||pos.get(setOfi).contains("��")||pos.get(setOfi).contains("��"))) {
								page.append("<span style=\"background:red\"><font color=\"white\">" + setOfi +(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");
			    				continue Here;
			    			}
							if(pos.get(setOfi).contains("��")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("��")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("��")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("��")) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");
								continue Here;
							} 
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");			 
						}
					}	
				buttonCrt.setText("��ǰҳ�棺" + (currentPage + 1));
				data.setText(page.toString());
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();
			}
		});
		
		buttonFRS = new DetaButton("���Ļ�ԭ");
		buttonFRS.setBounds(520, 0, 100, 30);
		buttonFRS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if(sets==null) {
				return;
			}
				StringBuilder page = new StringBuilder().append("<br/><br/>");
				List<String> setsForGet = sets.subList(currentPage * 2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
				Iterator<String> iterator = setsForGet.iterator();
				Here:
					while(iterator.hasNext()) {
						String setOfi = iterator.next();
						if(pos.get(setOfi) == null) {
							page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi + "</font></span>");
							continue Here;
						}
						if (!setOfi.equals("")) {
							if(key.contains(setOfi)&&(pos.get(setOfi).contains("��")||pos.get(setOfi).contains("��")||pos.get(setOfi).contains("��"))) {
								page.append("<span style=\"background:red\"><font color=\"white\">"+setOfi +"</font></span>");
			    				continue Here;
			    			}
							if(pos.get(setOfi).contains("��")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("��")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("��")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("��")) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							} 
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");			 
						}
					}	
				buttonCrt.setText("��ǰҳ�棺" + (currentPage + 1));
				data.setText(page.toString());
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();
			}
		});
		
		buttonETC = new DetaButton("ͬ������");
		buttonETC.setBounds(740, 0, 100, 30);
		buttonETC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {if(sets==null) {
				return;
			}
				StringBuilder page = new StringBuilder().append("<br/><br/>");
				List<String> setsForGet = sets.subList(currentPage * 2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
				Iterator<String> iterator = setsForGet.iterator();
				Here:
					while(iterator.hasNext()) {
						String setOfi = iterator.next();
						if(pos.get(setOfi) == null) {
							page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")":""):"") + "</font></span>");
							continue Here;
						}
						if (!setOfi.equals("")) {
							if(key.contains(setOfi)&&(pos.get(setOfi).contains("��")||pos.get(setOfi).contains("��")||pos.get(setOfi).contains("��"))) {
								page.append("<span style=\"background:red\"><font color=\"white\">" + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")":""):"") + "</font></span>");
			    				continue Here;
			    			}
							if(pos.get(setOfi).contains("��")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"  + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")":""):"") +  "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("��")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")":""):"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("��")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")":""):"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("��")) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"  + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")":""):"") +  "</font></span>");
								continue Here;
							} 
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")":""):"") +  "</font></span>");			 
						}
					}	
				buttonCrt.setText("��ǰҳ�棺" + (currentPage + 1));
				data.setText(page.toString());
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();
			}
		});
		DetaButton buttonADD = new DetaButton("���ӵ��༭ҳ");
		buttonADD.setBounds(868, 0, 115, 30);
		buttonADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sets==null) {
					return;
				}
				if(text.getText().length()>5000) {
					return;
				}
				StringBuilder page = new StringBuilder();
				List<String> setsForGet = sets.subList(currentPage * 2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
				Iterator<String> iterator = setsForGet.iterator();
				while(iterator.hasNext()) {
					String setOfi = iterator.next();
					page.append(setOfi); 
				}
				if(!text.getText().isEmpty()) {
					text.setText(text.getText() +"\r\n\r\n"+ page.toString());
				}else {
					text.setText(page.toString());
				}
				text.validate();
			}
		});
		DetaButton buttonKSLJ= new DetaButton("����DNN");
		buttonKSLJ.setBounds(990, 0, 115, 30);
		buttonKSLJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(null== sets) {
					return;
				}
				if(text.getText().length()>5000) {
					return;
				}
				StringBuilder page = new StringBuilder().append("<br/><br/>");
				List<String> setsForGet = sets.subList(currentPage * 2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
				Iterator<String> iterator = setsForGet.iterator();
				String setOfi= "";
				while(iterator.hasNext()) {
					setOfi += iterator.next();
				}
				try {
					String string= StringSwap.charsetSwap(setOfi, "GBK", "GBK");
					String encode= StringSwap.stringToURIencode(string, "UTF8");
					String response= RestCall.backEndRequest(encode);
					String[] strings= response.split("\"");
					response= strings.length> 3? strings[3]: "";
					response= StringSwap.uRIencodeToURIdecode(response);
					response= StringSwap.charsetSwap(response, "GBK", "UTF8");
					page.append(response.replace("\r\n", "<br/>"));
				} catch (IOException e1) {
					jTabbedpanel.validate();
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
//				Iterator<String> iterator = setsForGet.iterator();
//				while(iterator.hasNext()) {
//					String setOfi = iterator.next();
//					page.append(setOfi); 
//				}
				data.setText(page.toString());
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();
			}
		});
		
		DetaButton buttonBCJ= new DetaButton("������ƪ��ҩȫ��");
		//buttonETC.setBounds(200 - 15, 0, 88, 30);
		buttonBCJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//һ��һ�еĲ���
				boolean mod= true;
				for(int i= 0; i< table.getRowCount(); i++){
					String plsql= "setRoot:C:/DetaDB;";
					   plsql+= "baseName:ZYY;"; 
					   plsql+= "tableName:xybg:insert;" +
						   		"culumnValue:ID:"+ table.getValueAt(i, 0).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:���:"+ table.getValueAt(i, 1).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:��ҩ��:"+ table.getValueAt(i, 2).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:����:"+ table.getValueAt(i, 3).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:ҩ��:"+ table.getValueAt(i, 4).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:��Ҫ�ɷ�:"+ table.getValueAt(i, 5).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:�÷�:"+ table.getValueAt(i, 6).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:ע������:"+ table.getValueAt(i, 7).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:��Ӧ֢:"+ table.getValueAt(i, 8).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:������Ӧ:"+ table.getValueAt(i, 9).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:����:"+ table.getValueAt(i, 10).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:ҩ���໥����:"+ table.getValueAt(i, 11).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:����:"+ table.getValueAt(i, 12).toString().replace(":", "@biky@")+ ";";
						   		
					try {
						org.plsql.db.plsql.imp.ExecPLSQLImp.ExecPLSQL(plsql, mod);
					}catch(Exception e1) {
						jTabbedpanel.validate();
						data.validate();
					}
				}
			}
		});
		
		Box buttonBox = new Box(BoxLayout.X_AXIS);  
		buttonBox.add(buttonPrev);
		buttonBox.add(buttonNext);
		buttonBox.add(buttonSum);
		buttonBox.add(buttonCrt);
		buttonBox.add(buttonCTE);
		buttonBox.add(buttonFRS);
		buttonBox.add(buttonETC);
		buttonBox.add(buttonADD);
		buttonBox.add(buttonKSLJ);
	//	buttonBox.add(buttonBCJ);
		buttonBox.setBounds(0, 0, 950, 20);
		data.add(buttonBox);
		return data;  
	}

	public JTextPane statistic() throws IOException {
		statistic = new JTextPane();  
		statistic.setBounds(850, 150, 1440-840, 800);
		return statistic;  
	}


	public JTextField name() throws IOException {
		name = new JTextField();  
		name.setBounds(180, 50, 380, 80);
		name.addKeyListener(this);
		return name;
	}

	@SuppressWarnings({ "serial" })
	public javax.swing.JTable jTable() throws IOException {  
		dictionaryFromDB d= new dictionaryFromDB();
		dic_yao_ming= new ConcurrentHashMap<>();
		dic_chengfen_danwei= new ConcurrentHashMap<>();
		dic_yong_fa= new ConcurrentHashMap<>();
		dic_yong_liang= new ConcurrentHashMap<>();
		dic_yao_li= new ConcurrentHashMap<>();
		dic_zhu_yi= new ConcurrentHashMap<>();
		dic_shi_ying= new ConcurrentHashMap<>();
		dic_jie_shao= new ConcurrentHashMap<>();
		dic_bu_liang_fan_ying= new ConcurrentHashMap<>();
		dic_yao_wu_xiang_hu_zuo_yong= new ConcurrentHashMap<>();
		dic_qi_ta= new ConcurrentHashMap<>();
		d.txtToMap(dic_yao_ming, dic_chengfen_danwei, dic_yong_fa, dic_yao_li, dic_zhu_yi, dic_shi_ying,
				dic_bu_liang_fan_ying, dic_yao_wu_xiang_hu_zuo_yong, dic_qi_ta, dic_yong_liang, dic_jie_shao);
		tableData_old = new Object[dic_yao_ming.size()][18];
		Iterator<String> iter = dic_yao_ming.keySet().iterator();
		copy = new ArrayList<>();
		while (iter.hasNext())
			copy.add(iter.next());
		for(int i=0;i<copy.size();i++) {
			tableData_old[i]= new Object[]{""+(i+1),
					""+0,
					copy.get(i).trim(),
					dic_jie_shao.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_yao_li.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_chengfen_danwei.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_yong_fa.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_zhu_yi.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_shi_ying.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_bu_liang_fan_ying.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_yong_liang.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_yao_wu_xiang_hu_zuo_yong.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					dic_qi_ta.get(copy.get(i)).toString().replaceAll("\\s*", "")
			};
		}	
		table = new javax.swing.JTable();  
		newTableModel = new DefaultTableModel(tableData_old,columnTitle){  
			@Override  
			public boolean isCellEditable(int row,int column){  
				return false;  
			}  
		};  
		TableSorter sorter = new TableSorter(newTableModel); //ADDE
		sorter.setTableHeader(table.getTableHeader());
		table.setModel(sorter); 
		table.setRowHeight(35);                                        //���ø߶�
		JTableHeader header=table.getTableHeader();
		header.setFont(new Font("����", Font.PLAIN, 18));// ���ñ�������
		table.getColumnModel().getColumn(0).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(1).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(2).setPreferredWidth(80+130);
		table.getColumnModel().getColumn(3).setPreferredWidth(80+60);
		table.getColumnModel().getColumn(4).setPreferredWidth(80+60);
		table.getColumnModel().getColumn(5).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(6).setPreferredWidth(80+60);
		table.getColumnModel().getColumn(7).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(8).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(9).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(10).setPreferredWidth(80+60);
		table.getColumnModel().getColumn(11).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(12).setPreferredWidth(80+30);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.addMouseListener(this);
		colorTableRender tcr = new colorTableRender();  
		table.setDefaultRenderer(Object.class, tcr);	
		return table;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(key == null) {
			key = "";
		}
		sets = null;
		Map<String, WordFrequency> map = new ConcurrentHashMap<>();
		try {
			int row = table.getSelectedRow();
			int col = table.getSelectedColumn();
			String value = (String) table.getValueAt(row, col);
			data.setSize(500, 800);
			sets = analyzer.parserMixedString(value);//���Է���		
			data.setContentType("text/html");
			StringBuilder page = new StringBuilder().append("<br/><br/>");
			currentPage=0;
			List<String> setsForGet = sets.subList(currentPage*2000, (currentPage + 1)*2000<sets.size()? (currentPage + 1)*2000 : sets.size());
			Iterator<String> iterator = setsForGet.iterator();
			Here:
				while(iterator.hasNext()) {
					String setOfi = iterator.next();
					if(pos.get(setOfi) == null) {
						page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi + "</font></span>");
						continue Here;
					}
					if(pos.get(setOfi).contains("��")||pos.get(setOfi).contains("��")||pos.get(setOfi).contains("��")) {
						if (map.containsKey(setOfi)) {
							WordFrequency wordFrequency = map.get(setOfi);
							wordFrequency.setFrequency(wordFrequency.getFrequency() + StableData.INT_ONE);
							map.put(setOfi, wordFrequency);
						} else {
							WordFrequency wordFrequency = new WordFrequency();
							wordFrequency.setFrequency(StableData.INT_ONE);
							wordFrequency.setWord(setOfi);
							map.put(setOfi, wordFrequency);
						}
					}
					if (!setOfi.equals("")) {
						if(key.contains(setOfi)&&(pos.get(setOfi).contains("��")||pos.get(setOfi).contains("��")||pos.get(setOfi).contains("��"))) {
							page.append("<span style=\"background:red\"><font color=\"white\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pos.get(setOfi).contains("��")) {
							page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pos.get(setOfi).contains("��")) {
							page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pos.get(setOfi).contains("��")) {
							page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						}
						if(pos.get(setOfi).contains("��")) {
							page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
							continue Here;
						} 
						page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");			 
					}
				}	
			buttonSum.setText("���� " + (sets == null ? 0 : (1 + sets.size() / 2001)) + " ҳ");
			buttonCrt.setText("��ǰҳ�棺" + (sets == null? 0 : 1));
			data.setText(page.toString());
			data.setSelectionStart(0);
			data.setSelectionEnd(0);
			data.validate();
		}catch(Exception e){	
			data.validate();
			jTabbedpanel.validate();
		}   
		try {
			statistic.setSize(500, 800);
			Map<Integer, WordFrequency> fwa = analyzer.sortWordFrequencyMapToSortMap(map);
			statistic.setContentType("text/html");
			StringBuilder page = new StringBuilder();
			int i = fwa.size();
			Here:
				while(i>0) {
					i--;
					WordFrequency fwaMap = fwa.get(i);
					if (fwaMap!= null) {
						if(pos.get(fwaMap.getWord()) == null) {
							page.append("<div style=\"background:black\"><font color=\"white\">" + fwaMap.getWord()+""+fwaMap.getFrequency() + "</font></div>");
							continue Here;
						}
						if(pos.get(fwaMap.getWord()).contains("��")) {
							page.append( "<div style=\"background:#FF44FF\"><font color=\"white\">" + fwaMap.getWord()+""+fwaMap.getFrequency() +"</font></div>");
							continue Here;
						}
						if(pos.get(fwaMap.getWord()).contains("��")) {
							page.append("<div style=\"background:#8CEA00\"><font color=\"black\" size=\"5\">" + fwaMap.getWord()+""+fwaMap.getFrequency() +"</font></div>");
							continue Here;
						}
						if(pos.get(fwaMap.getWord()).contains("��")) {
							page.append("<div style=\"background:#FF9224\"><font color=\"black\" size=\"5\">" + fwaMap.getWord()+""+fwaMap.getFrequency() +"</font></div>");
						}
					}
				}	
			statistic.setText(page.toString());
			statistic.setSelectionStart(0);
			statistic.setSelectionEnd(0);
			statistic.validate();
		}catch(Exception e){	
			statistic.validate();
			jTabbedpanel.validate();
		}          
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {	
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
	}

	@SuppressWarnings("unused")
	@Override
	public void keyReleased(KeyEvent arg0) {
		String[] score=new String[copy.size()];
		int[] score_code=new int[copy.size()];
		int []reg = new int[copy.size()];
		int count = 0;
		Map<String, WordFrequency> mapSearchWithoutSort = null;
		mapSearchWithoutSort = analyzer.parserMixStringByReturnFrequencyMap(key);
		Iterator<String> iteratorForCopy = copy.iterator();	
		int copyCount = 0;
		while(iteratorForCopy.hasNext()) {
			String iteratorForCopyString = iteratorForCopy.next();
			score[copyCount] = iteratorForCopyString;
			String temps = iteratorForCopyString.toString()
					+	dic_jie_shao.get(iteratorForCopyString).toString().replaceAll("\\s*", "")
					+	dic_yao_li.get(iteratorForCopyString).toString().replaceAll("\\s*", "")
					+	dic_chengfen_danwei.get(iteratorForCopyString).toString().replaceAll("\\s*", "")
					+	dic_yong_fa.get(iteratorForCopyString).toString().replaceAll("\\s*", "")
					+	dic_zhu_yi.get(iteratorForCopyString).toString().replaceAll("\\s*", "")
					+	dic_shi_ying.get(iteratorForCopyString).toString().replaceAll("\\s*", "")
					+	dic_bu_liang_fan_ying.get(iteratorForCopyString).toString().replaceAll("\\s*", "")
					+	dic_yong_liang.get(iteratorForCopyString).toString().replaceAll("\\s*", "")
					+	dic_yao_wu_xiang_hu_zuo_yong.get(iteratorForCopyString).toString().replaceAll("\\s*", "")
					+	dic_qi_ta.get(iteratorForCopyString).toString().replaceAll("\\s*", "");
			Iterator<String> iteratorWordFrequency = mapSearchWithoutSort.keySet().iterator();
			Here:
				while(iteratorWordFrequency.hasNext()) {  
					String mapSearchaAtII = iteratorWordFrequency.next();
					WordFrequency wordFrequencySearch = mapSearchWithoutSort.get(mapSearchaAtII);
					if(temps.contains(mapSearchaAtII)) {
						if(reg[copyCount] == 0){
							count += 1;
						}
						reg[copyCount] += 1;
						score[copyCount] = iteratorForCopyString;
						if(pos.containsKey(mapSearchaAtII)) {
							score_code[copyCount] += (iteratorForCopyString.contains(mapSearchaAtII)?2:1) 
									* (!pos.get(mapSearchaAtII).contains("��")?pos.get(mapSearchaAtII).contains("��")?10:1:50) 
									<< mapSearchaAtII.length() * wordFrequencySearch.getFrequency();
							continue Here;
						} 
						score_code[copyCount] += 2 << mapSearchaAtII.length() * wordFrequencySearch.getFrequency() ;
						continue Here;
					}
					if(mapSearchaAtII.length()>1) {
						for(int j=0;j<mapSearchaAtII.length();j++) {
							if(temps.contains(String.valueOf(mapSearchaAtII.charAt(j)))) {
								if(reg[copyCount] == 0){
									count += 1;
								}
								reg[copyCount] += 1;
								score[copyCount] = iteratorForCopyString;
								score_code[copyCount]+=1;
							}
						}
					}
				}
			score_code[copyCount] = score_code[copyCount] * reg[copyCount];
			copyCount++;
		}
		LABEL2:
			new Quick6DLYGWithStringSwap().sort(score_code, score);
		int max= score_code[0];
		Object[][] tableData = new Object[count][18];
		int new_count=0;
		newTableModel.getDataVector().clear();
		if(null== key|| key.equals("")) {
			for(int i= 0; i< tableData_old.length; i++) {
				newTableModel.insertRow(i, tableData_old[i]);
			}		
			newTableModel.fireTableDataChanged();	
			return;
		}
		Here:
			for(int i = copy.size()-1; i > -1; i--) {
				if(score_code[i] < 1){
					continue Here;
				}
				if(app.risk_filter_box.isSelected()) {
					String hai= (dic_zhu_yi.get(score[i])==null
							?"null.":dic_zhu_yi.get(score[i]).toString().replaceAll("\\s*", "")
									.equalsIgnoreCase("")?"null":dic_zhu_yi.get(score[i])
											.toString().replaceAll("\\s*", ""));
					String temp= app.name_filter.getText();
					for(int j=0;j<temp.length();j++) {
						if(hai.contains(""+ temp.charAt(j))) {
							continue Here;
						}	
					}
				}
				if(app.shuming_filter_box.isSelected()) {
					String wei= score[i];
					String temp= app.name_filter.getText();
					for(int j=0;j<temp.length();j++) {
						if(wei.contains(""+ temp.charAt(j))) {
							continue Here;
						}	
					}
				}
				tableData[new_count]= new Object[]{new_count+1,
						score_code[i],
						score[i],
						dic_jie_shao.get(score[i]).toString().replaceAll("\\s*", ""),
						dic_yao_li.get(score[i]).toString().replaceAll("\\s*", ""),
						dic_chengfen_danwei.get(score[i]).toString().replaceAll("\\s*", ""),
						dic_yong_fa.get(score[i]).toString().replaceAll("\\s*", ""),
						dic_zhu_yi.get(score[i]).toString().replaceAll("\\s*", ""),
						dic_shi_ying.get(score[i]).toString().replaceAll("\\s*", ""),
						dic_bu_liang_fan_ying.get(score[i]).toString().replaceAll("\\s*", ""),
						dic_yong_liang.get(score[i]).toString().replaceAll("\\s*", ""),
						dic_yao_wu_xiang_hu_zuo_yong.get(score[i]).toString().replaceAll("\\s*", ""),
						dic_qi_ta.get(score[i]).toString().replaceAll("\\s*", "")
				};   
				newTableModel.insertRow(new_count, tableData[new_count]);
				new_count+=1;
			}	
		newTableModel.fireTableDataChanged();	
	}

	public class colorTableRender extends DefaultTableCellRenderer { 
		private static final long serialVersionUID = 1L;
		public Component getTableCellRendererComponent(JTable table,Object value, boolean isSelected, boolean hasFocus, int row,
				int column) {
			if (isSelected && hasFocus && row == table.getSelectedRow() && column == table.getSelectedColumn()) {
				//2.���õ�ǰCell����ɫ
				Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
				c.setBackground(Color.CYAN);//���ñ���ɫ
				c.setForeground(Color.gray);//����ǰ��ɫ
				return c;
			} else {
				//3.���õ����У�ż���е���ɫ
				if (row % 3 == 0) {//ż����ʱ����ɫ
					setBackground(new Color(253,233,254));
				}else if (row % 3 == 1) {//���õ����е���ɫ
					setBackground(new Color(233,254,234));
				}else if (row % 3 == 2) {//���õ����е���ɫ
					setBackground(new Color(255,251,232));
				}
				return super.getTableCellRendererComponent(table, value,
						isSelected, hasFocus, row, column);
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}
}