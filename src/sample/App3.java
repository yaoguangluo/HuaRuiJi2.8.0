package sample;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import org.tinos.vpcs.restServer.restServer;

import SP.jp;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.text.BadLocationException;

import org.LYG.sets.stable.StableData;
import org.deta.tinos.string.StringSwap;
import org.tinos.engine.analysis.Analyzer;
import org.tinos.engine.analysis.imp.CogsBinaryForestAnalyzerImp;
import org.tinos.engine.base.translator.Translator;
import org.tinos.engine.base.translator.imp.TranslatorImp;
import org.tinos.rest.medicine.RestMedicinePortImpl;
import org.tinos.view.obj.Verbal;
import org.tinos.view.obj.WordFrequency;

import biProcessor.coAuthorForWord;
import cap.Monitor;
import comp.jbutton.DetaButton;
import comp.jbutton.cfxButton;
import comp.jtextfield.cfxTextField;
import comp.jtextpane.cfxTextPane;
import disk.GetDisk;
import mapProcessor.VtoV;
import sample.cecil.cecil;
import sample.editPane.editPane;
import sample.fckx.fckx;
import sample.fqz.fqz;
import sample.fyyd.fyyd;
import sample.jzkx.jzkx;
import sample.nk.xynk;
import sample.wkx.wkx;
import sample.wskx.wskx;
import sample.xysc.xysc;
import sample.zynkx.zynkx;
import sample.zyzdx.zyzdx;
import sort.Quick6DLYGWithStringSwap;
import thread.MakeContainer_ZHONG_YAO;
import thread.MakeContainerZYFC;
import thread.MakeContainerXXFC;
import thread.MakeContainerXYJZ;
import thread.MakeContainerXYWK;
import thread.MakeContainerZYWS;
import thread.MakeContainerXYCF;
import thread.MakeContainerBJY;
import thread.MakeContainerHLS;
import thread.MakeContainerSJFX;
import thread.MakeContainerZNXZ;
import thread.MakeContainerZNSZ;
import thread.MakeContainerQMDJ;
import thread.MakeContainerXYNK;
import thread.MakeContainerZYNKFJ;
import thread.MakeContainerZYZD;
import thread.MakeContainerGJJD;
public class App3 extends JApplet implements MouseListener, KeyListener, ActionListener, ChangeListener{	
	private static final long serialVersionUID= 1L;
	public int row= 0;
	public jp jp1;
	public int col= 0;
	public boolean disableCursor= true;
	public Translator ts;
	public JTextPane text;
	public String key;
	public JFrame frame;
	public String hint;
	public AppSearch appSearch;
	public Analyzer analyzer;
	public coAuthorForWord app;
	public Monitor m;
	public Map<String, String> pos;
	public Map<String, String> posec;
	public Map<String, String> pose;
	public Map<String, String> posFullec;
	public Map<String, String> posFullce;
	public Map<String, String> etc;
	public Map<String, String> cte;
	public Map<String, String> pinyin;
	public Map<String, String> ctk;
	public Map<String, String> ctj;
	public Map<String, String> ctt;
	public JCheckBox risk_filter_box;
	public JCheckBox feel_filter_box;
	public JCheckBox jingmai_filter_box;
	public JCheckBox gongxiao_filter_box;
	public JCheckBox zonghe_filter_box;
	public JCheckBox shuming_filter_box;
	public List<String> sets;
	public xynk jpanel6;
	public zynkx jpanel7;
	public zyzdx jpanel8;
	public fyyd jpanel9;
	public fqz jpanel10;
	public fckx jpanel11;
	public jzkx jpanel12;
	public wkx jpanel13;
	public wskx jpanel14;
	public xysc jpanel15;
	public cecil jpanel17;
	public editPane jpanel16;
	public JLabel label0001;
	public JTextPane data;
	public JPanel panel_yt;
	public JTextField name;
	public JTextField name_filter;
	public javax.swing.JTable table;  
	public Object[][] tableData_old;
	public DefaultTableModel newTableModel= null;
	public List<String> dic_list;
	public List<String> copy;
	public Map<String, Object> dic_map= new HashMap<>();
	public Map<String, Object> dic_li= new HashMap<>();
	public Map<String, Object> dic_hai= new HashMap<>();
	public Map<String, Object> dic_xz= new HashMap<>();
	public Map<String, Object> dic_ya= new HashMap<>();
	public Map<String, Object> dic_jm= new HashMap<>();
	public Map<String, Object> dic_xw= new HashMap<>();
	public Map<String, Object> dic_cy= new HashMap<>();
	public Map<String, Object> dic_cj= new HashMap<>();
	public Map<String, Object> dic_jj= new HashMap<>();
	public Map<String, Object> dic_zf= new HashMap<>();
	public Map<String, Object> dic_yl= new HashMap<>();
	public Map<String, Object> dic_yw= new HashMap<>();
	public JPanel panel= new JPanel(); 
	public JButton buttonCTE;
	public JButton buttonFRS;
	public JButton buttonETC;
	public JButton buttonADD;
	public JButton buttonGXB;
	public JButton buttonBCJ;
	public JFrame frameTag;
	public TagSearch tagSearch;
	public ImageIcon logo= new ImageIcon(getClass().getResource("logo.png"));  
	public ImageIcon pnga= new ImageIcon(getClass().getResource("sc/a.png")); 
	public ImageIcon pngo= new ImageIcon(getClass().getResource("sc/o.png")); 
	public ImageIcon pnge= new ImageIcon(getClass().getResource("sc/e.png")); 
	public ImageIcon pngi= new ImageIcon(getClass().getResource("sc/i.png")); 
	public ImageIcon pngu= new ImageIcon(getClass().getResource("sc/u.png")); 
	public ImageIcon shoujueyin= new ImageIcon(getClass().getResource("手厥阴心包经.png")); 
	public ImageIcon shoushaoyang= new ImageIcon(getClass().getResource("手少阳三焦经.png"));  
	public ImageIcon shoushaoyin= new ImageIcon(getClass().getResource("手少阴心经.png"));  
	public ImageIcon shoutaiyang= new ImageIcon(getClass().getResource("手太阳小肠经.png"));  
	public ImageIcon shoutaiyin= new ImageIcon(getClass().getResource("手太阴肺经.png"));  
	public ImageIcon shouyangmin= new ImageIcon(getClass().getResource("手阳明大肠经.png"));  
	public ImageIcon zujueyin= new ImageIcon(getClass().getResource("足厥阴肝经.png"));  
	public ImageIcon zushaoyang= new ImageIcon(getClass().getResource("足少阳胆经.png"));
	public ImageIcon zushaoyin= new ImageIcon(getClass().getResource("足少阴肾经.png"));  
	public ImageIcon zutaiyang= new ImageIcon(getClass().getResource("足太阳膀胱经.png"));  
	public ImageIcon zutaiyin= new ImageIcon(getClass().getResource("足太阴脾经.png"));  
	public ImageIcon zuyangmin= new ImageIcon(getClass().getResource("足阳明胃经.png"));  
	public ImageIcon png88 = new ImageIcon(getClass().getResource("bagua.png"));  
	public ImageIcon wsp = new ImageIcon(getClass().getResource("wsp.png"));  
	public ImageIcon wwp = new ImageIcon(getClass().getResource("wwp.png"));  
	public ImageIcon wxp = new ImageIcon(getClass().getResource("wxp.png"));
	public ImageIcon shun = new ImageIcon(getClass().getResource("shun.png"));  
	public ImageIcon bagua_bgbz= new ImageIcon(getClass().getResource("bagua_bgbz.png"));  
	public ImageIcon bagua_ljbz= new ImageIcon(getClass().getResource("bagua_ljbz.png"));  
	public ImageIcon bagua_sjbz= new ImageIcon(getClass().getResource("bagua_sjbz.png"));
	public ImageIcon bagua_qxbz= new ImageIcon(getClass().getResource("bagua_qxbz.png"));  
	public ImageIcon bagua_gzxs= new ImageIcon(getClass().getResource("bagua_gzxs.png"));  
	public ImageIcon bagua_skch= new ImageIcon(getClass().getResource("bagua_skch.png"));  
	public ImageIcon qp4= new ImageIcon(getClass().getResource("4qp.png"));  
	public ImageIcon pngy_2_1= new ImageIcon(getClass().getResource("yc/2_1.png"));  
	public Object[] columnTitle= {"ID", "打分", "中药名称", "笔记原文", "功效", "风险规避", "用量/克, 别名，其他，备注", "性味", "经脉/经络", "中医馆药理", "经解", "崇源", "愚按", "搭配", "常见药"};
	private cfxTextField name_filter_not_have;
	private Map<String, String> ctr;
	private cfxTextField name_feel_filter;
	public JScrollPane jsp_name= null;
	public boolean ready= false;
	public App3 appInstance;
	public void init(){
		if(!new GetDisk().getKey().replaceAll(" ", "").contains("1152661394")) {
			//System.out.println(new GetDisk().getKey());
			//return;
		}
		//stop cursor
		appInstance= this;
		analyzer= new CogsBinaryForestAnalyzerImp();
		JTabbedPane jTabbedpane= new JTabbedPane();// 存放选项卡的组件
		try {
			restServer rest= new restServer(this);
			rest.start();
			while(!ready) {
				Thread.sleep(3000);
			}
			Thread.sleep(10000);
			analyzer.initMixed();
			pos= analyzer.getPosCnToCn();
			pose= analyzer.getPosEnToEn();
			posec= analyzer.getPosEnToCn();
			etc= analyzer.getEnToCn();
			cte= analyzer.getFullCnToEn();
			posFullec= analyzer.getFullEnToCn();
			posFullce= analyzer.getFullCnToEn();
			pinyin= analyzer.getPinYin();
			ctt= analyzer.getCtT();
			ctk= analyzer.getCtA();
			ctr= analyzer.getCtR();
			ctj= analyzer.getCtJ();
			ts= new TranslatorImp();
			ts.init(analyzer);
			text= new JTextPane();
			System.setProperty("java.library.path", new File("").getCanonicalPath() + "\node");
			System.out.println(new File("").getCanonicalPath()+ "\node");
			UIManager.put("ScrollBarUI", "org.LYG.GUI.platForm.UnicornScrollBarUI");	
			jTabbedpane.setBounds(0, 60, 1490, 980);
			String[] tabNames= {"中药本草", "数据分析", "智能相诊", "智能声诊", "奇门遁甲", "西医内科", "中医内科方剂", "中医诊断", "古籍经典", 
					"中医生殖", "西医妇幼", "西医急诊", "大外科", "中医外伤", "西药处方", "编辑页", "哈里森大内科"};

			jsp_name= new JScrollPane(this.name());
			jsp_name.setBounds(10+50, 6, 580- 300, 50);
			
			comp.jbutton.DetaButton jlabel_button= new comp.jbutton.DetaButton("搜:");
			jlabel_button.setBounds(2, 6, 56, 50);
			jlabel_button.addActionListener(new ActionListener() {
				@SuppressWarnings("deprecation")
				public void actionPerformed(ActionEvent e) {
					if(null== frame) {
						appSearch= new AppSearch();
						appSearch.init(name);
						appSearch.setBounds(0, 0, 785, 655);
						appSearch.setVisible(true);
						appSearch.show();
						frame= new JFrame("电子护理站 V1.1.0");
						//frame.setLayout(null);
						frame.setSize(780, 650);
						frame.setLocation(300, 300);
						frame.setResizable(false);
						frame.add(appSearch);
						frame.setVisible(true);
						frame.show();
						frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	
					}else {
						frame.setVisible(true);
						frame.show();
					}
				}
			});
			//filter
			JLabel jlabel_filter= new JLabel("包含过滤:");  
			jlabel_filter.setForeground(Color.WHITE); 
			jlabel_filter.setBounds(10+350, 6, 100, 25);
			JScrollPane jsp_name_filter= null;
			jsp_name_filter= new JScrollPane(this.name_filter());
			jsp_name_filter.setBounds(30+350+40, 6, 580- 356, 24);
			
			JLabel jlabel_filter_not_have= new JLabel("有关经络:");  
			jlabel_filter_not_have.setForeground(Color.WHITE); 
			jlabel_filter_not_have.setBounds(60+15+7+585+ 100, -6, 100, 50);
			//jlabel_filter_not_have.setBounds(10+350, 6+25, 100, 25);
			JScrollPane jsp_name_filter_not_have= null;
			jsp_name_filter_not_have= new JScrollPane(this.name_filter_not_have());
			jsp_name_filter_not_have.setBounds(60+15+30+580+ 100+ 40, 8, 580- 455, 22);	
			//jsp_name_filter_not_have.setBounds(40+350+40, 6+28, 580- 465, 22);
			
			JLabel risk_filter= new JLabel("风险过滤:");  
			risk_filter.setForeground(Color.WHITE);
			risk_filter.setBounds(10+350, 20, 100, 50);
			
			JLabel feel_filter= new JLabel("无关性味:"); 
			feel_filter.setForeground(Color.WHITE);
			feel_filter.setBounds(60+15+7+585+ 100, 20, 100, 50);
			
			risk_filter_box= new JCheckBox();
			risk_filter_box.setBounds(10+350+60, 33, 20, 20);
			JScrollPane jsp_name_feel_filter= null;
			jsp_name_feel_filter= new JScrollPane(this.name_feel_filter());
			jsp_name_feel_filter.setBounds(60+15+30+580+ 100+ 40, 6+28, 580- 455, 22);
			
			
			JLabel jingmai_filter= new JLabel("线性观测:");  
			jingmai_filter.setForeground(Color.WHITE);
			jingmai_filter.setBounds(60+15+7+585, -6, 100, 50);
			//jingmai_filter.setBounds(60+15+7+585+ 100, -6, 100, 50);
			
			JLabel xingwei_filter= new JLabel("性味过滤:");  
			xingwei_filter.setForeground(Color.WHITE); 
			xingwei_filter.setBounds(60+15+7+585, 20, 100, 50);
			
			jingmai_filter_box= new JCheckBox();
			jingmai_filter_box.setBounds(60+15+30+580+40, 8, 20, 20);
			//jingmai_filter_box.setBounds(60+15+30+580+ 100+ 40, 8, 20, 20);
			feel_filter_box= new JCheckBox();
			feel_filter_box.setBounds(60+15+30+580+40, 33, 20, 20);
			
			JLabel zonghe_filter= new JLabel("配伍过滤:");  
			zonghe_filter.setForeground(Color.WHITE); 
			zonghe_filter.setBounds(50+15+7+485+7, 20, 100, 50);

			JLabel shuming_filter= new JLabel("术名过滤:");  
			shuming_filter.setForeground(Color.WHITE); 
			shuming_filter.setBounds(1+350+100+10, 20, 100, 50);
			
			zonghe_filter_box= new JCheckBox();
			zonghe_filter_box.setBounds(50+15+7+485+60+7, 33, 20, 20);
			//zonghe_filter_box.setBounds(60+15+30+580+ 200+ 40, 8, 20, 20);
			zonghe_filter_box.addActionListener(this);
			shuming_filter_box= new JCheckBox();
			shuming_filter_box.setBounds(1+350+100+60+10, 33, 20, 20);
		
			JButton addChuFang= new cfxButton("电子医院", 100, 50, Color.red); 
			//addChuFang.setBounds(60+ 760- 100- 50, 6, 100, 50);
			addChuFang.setBounds(50+50+760+130+130-100-50, 6, 100, 50);
			addChuFang.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//
					String preAdd= "仅作病症预测推荐，不做行医诊治分析，请拥有医师资格证人员慎重分析病情，来做证候分析。谢谢!";
					preAdd+= "\r\n\r\n *************************************************\r\n\r\n";
					preAdd+= "大综合证候分析：";
					preAdd+= "\r\n\r\n *************************************************\r\n\r\n";
					//中医诊断：
					preAdd+= "中医诊断：\r\n\r\n";
					for(int i=0;i<5;i++) {
						preAdd+= "证候名："+ (null==jpanel8.table.getValueAt(i, 2)?"":jpanel8.table.getValueAt(i, 2).toString())
							//	+ "证候内容："+	(null==jpanel8.table.getValueAt(i, 5)?"":jpanel8.table.getValueAt(i, 5).toString())
								+ "可能性："+	(null==jpanel8.table.getValueAt(i, 1)?"":jpanel8.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}
					preAdd+= "内科诊断：\r\n\r\n";
					//内科分析：
					for(int i=0;i<5;i++) {
						preAdd+= "证候名："+ (null==jpanel6.table.getValueAt(i, 2)?"":jpanel6.table.getValueAt(i, 2).toString())
							//	+ "证候意义："+	(null==jpanel6.table.getValueAt(i, 9)?"":jpanel6.table.getValueAt(i, 9).toString())
								+ "可能性："+	(null==jpanel6.table.getValueAt(i, 1)?"":jpanel6.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}
					preAdd+= "西医诊断：\r\n\r\n";
					//西医急诊：
					for(int i=0;i<5;i++) {
						preAdd+= "证候名："+ (null==jpanel12.table.getValueAt(i, 2)?"":jpanel12.table.getValueAt(i, 2).toString())
								+ "可能性："+	(null==jpanel12.table.getValueAt(i, 1)?"":jpanel12.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}
					preAdd+= "外科诊断：\r\n\r\n";
					//外科分析：
					for(int i=0;i<5;i++) {
						preAdd+= "证候内容："+ (null==jpanel13.table.getValueAt(i, 2)?"":jpanel13.table.getValueAt(i, 2).toString())
								+ "可能性："+	(null==jpanel13.table.getValueAt(i, 1)?"":jpanel13.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}
					preAdd+= "\r\n\r\n *************************************************\r\n\r\n";
					preAdd+= "小专科系统组合诊断（可选）：";
					preAdd+= "\r\n\r\n *************************************************\r\n\r\n";
					preAdd+= "妇幼诊断：\r\n\r\n";
					//妇幼分析：
					for(int i=0;i<5;i++) {
						preAdd+= "证候内容："+ (null==jpanel11.table.getValueAt(i, 2)?"":jpanel11.table.getValueAt(i, 2).toString())
								+ "可能性："+	(null==jpanel11.table.getValueAt(i, 1)?"":jpanel11.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}
					
					preAdd+= "伤科：\r\n\r\n";
					//伤科分析：
					for(int i=0;i<5;i++) {
						preAdd+= "证候内容："+ (null==jpanel14.table.getValueAt(i, 2)?"":jpanel14.table.getValueAt(i, 2).toString())
								+ "可能性："+	(null==jpanel14.table.getValueAt(i, 1)?"":jpanel14.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}
					preAdd+= "\r\n\r\n *************************************************\r\n\r\n";
					preAdd+= "中西医结合用药打分排序（可选）：";
					preAdd+= "\r\n\r\n *************************************************\r\n\r\n";
					preAdd+= "西药推荐：\r\n\r\n";
					//分析：
					for(int i=0;i<10;i++) {
						preAdd+= "推荐名："+ (null==jpanel15.table.getValueAt(i, 2)?"":jpanel15.table.getValueAt(i, 2).toString())
								+ "适应内容："+	(null==jpanel15.table.getValueAt(i, 8)?"":jpanel15.table.getValueAt(i, 8).toString())
								+ "可能性："+	(null==jpanel15.table.getValueAt(i, 1)?"":jpanel15.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}
					preAdd+= "方剂推荐：\r\n\r\n";
					//方剂分析：
					for(int i=0;i<5;i++) {
						preAdd+= "推荐名："+ (null==jpanel7.table.getValueAt(i, 2)?"":jpanel7.table.getValueAt(i, 2).toString())
								+ "推荐内容："+(null==jpanel7.table.getValueAt(i, 4)?"":jpanel7.table.getValueAt(i, 4).toString())
								+ "可能性："+	(null==jpanel7.table.getValueAt(i, 1)?"":jpanel7.table.getValueAt(i, 1).toString());
						preAdd+= "\r\n\r\n";
					}
					preAdd+= "\r\n\r\n";
					//
					preAdd+= "\r\n\r\n *************************************************\r\n\r\n";
					preAdd+= "仅作中药推荐，不做处方权分析，请拥有处方权职业药师慎重分析药理根据病情搭配修改。谢谢!";
					preAdd+= "\r\n\r\n *************************************************\r\n\r\n";
					preAdd+= "\r\n\r\n";
					for(int r= 0; r< (newTableModel.getRowCount()< 30? newTableModel.getRowCount(): 30); r++) {
						if(newTableModel.getValueAt(r, 2)!= null&& !newTableModel.getValueAt(r, 2).toString().isEmpty()) {
							preAdd+= newTableModel.getValueAt(r, 2);
						}
						preAdd+= "/";
						if(newTableModel.getValueAt(r, 6)!= null&&!newTableModel.getValueAt(r, 6).toString().isEmpty()) {
							String temp= newTableModel.getValueAt(r, 6).toString();
							String value= "";
							for(int i = 0; i < temp.length(); i++){
								if(temp.charAt(i)<128 || temp.charAt(i)=='—') {
									value+=temp.charAt(i);
								}else {
									value+=" ";
								}
							}
							String[] temps = value.replaceAll("\\s+", " ").split(" ");
							if(temps.length>0 && temps[0].split("—").length > 1) {
								value = temps[0].split("—")[1];
								value += "g;";
							}else {
								value = "请酌情添加;";
							}
							preAdd += value;
						}else {
							preAdd += "请酌情添加;";
						}
						if(r%2!=0) {
							preAdd += "\r\n\r\n";
						}else {
							preAdd += "    ";
						}
					}
					if(text.getText().length()< 8000) {
						if(preAdd.length()< 8000) {
							if(!text.getText().isEmpty()) {
								text.setText(text.getText() +"\r\n\r\n"+ preAdd);
							}else {
								text.setText(preAdd);
							}
						}
					}
					text.validate();
				}
			});

			JButton button2= new cfxButton("德塔在线", 100, 50, Color.cyan); 
			//button2.setBounds(60+ 760+ 130- 100- 50, 6, 100, 50);
			button2.setBounds(30+60+760+130+130+130-100-50, 6, 100, 50);
			button2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						String link= "http://tinos.qicp.vip/data.html";
						Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+link);
					} catch (IOException e1) {	
						jTabbedpane.validate();
					}
				}
			});

//			JButton button3= new cfxButton("中医大学", 100, 50, Color.yellow); 
//			button3.setBounds(60+760+130+130-100-50, 6, 100, 50);
//			button3.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent e) {
//					try {
//						String link = "http://qkzzs.hnucm.edu.cn/";
//						Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+link);
//					} catch (IOException e1) {	
//						jTabbedpane.validate();
//					}
//				}
//			});

//			JButton button4= new cfxButton("中医科学院",100,50, Color.green); 
//			button4.setBounds(60+760+130+130+130-100-50, 6, 100, 50);
//			button4.addActionListener(new ActionListener() {
//				public void actionPerformed(ActionEvent e) {
//					try {
//						String link="http://www.cintcm.com/opencms/opencms/index.html";
//						Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+link);
//					} catch (IOException e1) {	
//					}
//				}
//			});

			JButton button5= new cfxButton("卫健委",100,50, Color.orange); 
			button5.setBounds(10+70+760+130+130+130+130-100-50, 6, 100, 50);
			button5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						String link="http://www.nhc.gov.cn";
						Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+link);
					} catch (IOException e1) {	
						jTabbedpane.validate();
					}
				}
			});	
			JPanel jp= new JPanel();
			jp.setLayout(null);
			jp.setBounds(0, 0, 1470, 980);
			jp.setBackground(Color.BLACK);
			jp.add(addChuFang);
			jp.add(button2);
			//jp.add(button3);
			//jp.add(button4);
			jp.add(button5);
			jp.add(jlabel_button);
			jp.add(jsp_name);
			jp.add(jsp_name_filter);
			jp.add(jlabel_filter);
			jp.add(jsp_name_filter_not_have);
			jp.add(jlabel_filter_not_have);
			jp.add(jTabbedpane);
			jp.add(risk_filter);
			jp.add(feel_filter);
			jp.add(xingwei_filter);
			jp.add(risk_filter_box);
			jp.add(jsp_name_feel_filter);
			jp.add(jingmai_filter);
			jp.add(feel_filter_box);
			jp.add(jingmai_filter_box);
			jp.add(zonghe_filter);
			jp.add(shuming_filter);
			jp.add(zonghe_filter_box);
			jp.add(shuming_filter_box);
			jp.setPreferredSize(new Dimension(1330, 730+ 40));
			JScrollPane js= new JScrollPane(jp);
			js.setBounds(0, 0, 1335, 730+ 50);	
			this.setLayout(null);  
			this.getContentPane().add(js);
			js.setViewportView(jp);
			this.setBounds(0, 0, 1345, 770+ 25);
			this.setVisible(true);
			Container jpanelFirst= new Container();
			MakeContainer_ZHONG_YAO c1= null;
			c1= new MakeContainer_ZHONG_YAO(analyzer, jpanelFirst, this, tabNames, pos);

			c1.start();
			jTabbedpane.addTab(tabNames[0], new ImageIcon(), jpanelFirst, "first");
			jTabbedpane.setMnemonicAt(0, KeyEvent.VK_0); 
			jTabbedpane.addChangeListener(this);
			Container jpanelSecond= new Container();  
			MakeContainerSJFX c2=new MakeContainerSJFX(tableData_old, text, analyzer,jpanelSecond,this,jTabbedpane,tabNames,  pos,pose,etc,cte);
			c2.start();
			Thread.sleep(20);
			Container jpanelThird= new Container();  

			MakeContainerZNXZ c3=new MakeContainerZNXZ(analyzer,jpanelThird,this,jTabbedpane,tabNames, pos,pose,etc,cte);
			c3.start();
			Thread.sleep(20);
			Container jpanelFourth= new Container();
			MakeContainerZNSZ c4=new MakeContainerZNSZ(analyzer,jpanelFourth,this,jTabbedpane,tabNames,  pos,pose,etc,cte);
			c4.start();
			Thread.sleep(20);
			Container jpanel5= new Container();  
			MakeContainerQMDJ c5=new MakeContainerQMDJ(analyzer,jpanel5,this,jTabbedpane,tabNames,  pos,pose,etc,cte);
			c5.start();
			Thread.sleep(20);
			MakeContainerXYNK c6=new MakeContainerXYNK(analyzer,this,jTabbedpane,tabNames, pos,pose,etc,cte);
			c6.start();
			Thread.sleep(20);
			MakeContainerZYNKFJ c7=new MakeContainerZYNKFJ(analyzer,this,jTabbedpane,tabNames,  pos,pose,etc,cte);
			c7.start();
			Thread.sleep(20);
			MakeContainerZYZD c8=new MakeContainerZYZD(analyzer,this,jTabbedpane,tabNames,  pos,pose,etc,cte);
			c8.start();
			Thread.sleep(20);
			MakeContainerGJJD c9=new MakeContainerGJJD(analyzer,this,jTabbedpane,tabNames,  pos,pose,etc,cte);
			c9.start();
			Thread.sleep(20);
			MakeContainerZYFC c10=new MakeContainerZYFC(analyzer,this,jTabbedpane,tabNames,  pos,pose,etc,cte);
			c10.start();
			Thread.sleep(20);
			MakeContainerXXFC c11=new MakeContainerXXFC(analyzer,this,jTabbedpane,tabNames, pos,pose,etc,cte);
			c11.start();
			Thread.sleep(20);
			MakeContainerXYJZ c12=new MakeContainerXYJZ(analyzer,this,jTabbedpane,tabNames,  pos,pose,etc,cte);
			c12.start();
			Thread.sleep(20);
			MakeContainerXYWK c13=new MakeContainerXYWK(analyzer,this,jTabbedpane,tabNames, pos,pose,etc,cte);
			c13.start();
			Thread.sleep(20);
			MakeContainerZYWS c14=new MakeContainerZYWS(analyzer,this,jTabbedpane,tabNames,  pos,pose,etc,cte);
			c14.start();	
			Thread.sleep(20);
			MakeContainerXYCF c15=new MakeContainerXYCF(analyzer,this,jTabbedpane,tabNames,  pos,pose,etc,cte);
			c15.start();
			Thread.sleep(20);
			MakeContainerBJY c16=new MakeContainerBJY(analyzer,this,jTabbedpane,tabNames,  pos,pose,etc
					,cte,pinyin,ctj,ctt,ctk,ctr);
			c16.start();	
			Thread.sleep(20);
			MakeContainerHLS c17=new MakeContainerHLS(analyzer,this,jTabbedpane,tabNames,  pos,pose,etc,cte,posec,posFullec);
			c17.start();
			disableCursor= false;
		} catch (IOException | InterruptedException e4) {
			jTabbedpane.validate();
			e4.printStackTrace();
		}
	}
	
	private JTextField name_feel_filter() {
		name_feel_filter= new cfxTextField(null, 0, 0, null);  
		name_feel_filter.setBounds(180-50, 50, 380, 80);
		name_feel_filter.setBackground(Color.white);
		name_feel_filter.addKeyListener(this);
		return name_feel_filter;
	}

	public JPanel panel() throws IOException{
		panel_yt= new JPanel();
		panel_yt.setBackground(Color.white);
		pngy_2_1= new ImageIcon(getClass().getResource("yc/2_1.png"));
		label0001= new JLabel(pngy_2_1);
		panel_yt.add(label0001);
		return panel_yt;
	}

	public JTextPane data() throws IOException {
		data= new cfxTextPane("内容", 1350, 2980, null);  
		data.setBounds(850, 150, 1350, 2980);	
		data.setBackground(Color.white);
		Box buttonBoxLineTwo= new Box(BoxLayout.X_AXIS);  
//		buttonBoxLineTwo.add(buttonGXB);
//		buttonBoxLineTwo.add(buttonBCJ);
		buttonBoxLineTwo.setBounds(0, 22, 450, 20);
		//container.add(buttonBox);
		//container.add(buttonBoxLineTwo);
		return data; 
	}
	
	public Box getBox() {	
    	buttonADD= new DetaButton("添加到编辑页", 100, 50, Color.red);
		buttonADD.setBounds(295-15, 0, 135, 30);
		buttonADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sets== null) {
					return;
				}
				if(text.getText().length()>5000) {
					return;
				}
				StringBuilder page= new StringBuilder();
				List<String> setsForGet= sets;
				Iterator<String> iterator= setsForGet.iterator();
					while(iterator.hasNext()) {
						String setOfi= iterator.next();
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
		buttonCTE= new DetaButton("英文注释", 100, 50, Color.orange);
		buttonCTE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sets== null) {
					return;
				}
				StringBuilder page= new StringBuilder();
				List<String> setsForGet = sets;
				Iterator<String> iterator = setsForGet.iterator();
				Here:
					while(iterator.hasNext()) {
						String setOfi = iterator.next();
						if(pos.get(setOfi) == null) {
							page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");
							continue Here;
						}
						if (!setOfi.equals("")) {
							if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
								page.append("<span style=\"background:red\"><font color=\"white\" size=\"5\">" + setOfi +(posFullce.containsKey(setOfi)?":("+posFullce.get(setOfi)+")":"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("名")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 245, 255)+ "\"><font color=\"black\" size=\"5\">"+ "<A href=\"http://localhost:8000/search?word="+ setOfi+"\">"
										+ setOfi+ "</A>" + (posFullce.containsKey(setOfi)?":("+posFullce.get(setOfi)+")":"")+ "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("动")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">" + setOfi +(posFullce.containsKey(setOfi)?":("+posFullce.get(setOfi)+")":"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("形")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">" + setOfi +(posFullce.containsKey(setOfi)?":("+posFullce.get(setOfi)+")":"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("副")) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">" + setOfi +(posFullce.containsKey(setOfi)?":("+posFullce.get(setOfi)+")":"") + "</font></span>");
								continue Here;
							} 
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">" + setOfi +(posFullce.containsKey(setOfi)?":("+posFullce.get(setOfi)+")":"") + "</font></span>");			 
						}}
				data.setText(page.toString());
				data.addHyperlinkListener(new HyperlinkListener(){
						@SuppressWarnings({ "deprecation", "hiding" })
						@Override
						public void hyperlinkUpdate(HyperlinkEvent e) {
							//.........
							//本函数的hyperlinkUpdate 格式 查阅了https://blog.csdn.net/nullpointer2008/article/details/7998986 文章。
							//20200323 罗瑶光修改
							//版权声明：本文为CSDN博主「空指针1996」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
							//原文链接：https://blog.csdn.net/nullpointer2008/article/details/7998986);
							//.........
							if (e.getEventType()!= HyperlinkEvent.EventType.ACTIVATED) 
								return;
							URL linkUrl= e.getURL();
							String string; System.out.println(linkUrl.getFile());
							try {
								string= StringSwap.charsetSwap(linkUrl.getFile().toString(), "GBK", "GBK");
								String[] value= string.split("=");
								if(value.length> 1) {
									VtoV.ObjectToJsonString(RestMedicinePortImpl.doSearch(appInstance, value[1]));
								}
							} catch (UnsupportedEncodingException e2) {
								e2.printStackTrace();
							} catch (IOException e1) {
								e1.printStackTrace();
							}
							//弹窗
							//1 得到文字
							//2 文字标注解释字符串
							//3 生成frame
							if(null== frameTag) {
								tagSearch= new TagSearch();
								tagSearch.init(name);
								tagSearch.setBounds(0, 0, 435, 355);
								tagSearch.setVisible(true);
								tagSearch.show();
								frameTag= new JFrame("提示栏");
								//frame.setLayout(null);
								frameTag.setSize(430, 350);
								//摘自第37行 https://blog.csdn.net/code_better/article/details/53505962
								Point point= java.awt.MouseInfo.getPointerInfo().getLocation();
								//
								frameTag.setLocation(point.x, point.y);
								frameTag.setResizable(false);
								frameTag.add(tagSearch);
								frameTag.setVisible(true);
								frameTag.show();
								frameTag.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	
							}else {
								Point point= java.awt.MouseInfo.getPointerInfo().getLocation();
								frameTag.setLocation(point.x, point.y);
								frameTag.setVisible(true);
								frameTag.show();
							}
						}
				});
				data.setEditable(false);
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();
			}
		});
		
		buttonFRS= new DetaButton("中文词还原", 100, 50, Color.green);
		buttonFRS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sets== null) {
					return;
				}
				StringBuilder page= new StringBuilder();
				List<String> setsForGet= sets;
				Iterator<String> iterator= setsForGet.iterator();
				Here:
					while(iterator.hasNext()) {
						String setOfi = iterator.next();
						if(pos.get(setOfi) == null) {
							page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi + "</font></span>");
							continue Here;
						}
						if (!setOfi.equals("")) {
							if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
								page.append("<span style=\"background:red\"><font color=\"white\">"+setOfi +"</font></span>");
								continue Here;
						}
							if(pos.get(setOfi).contains("名")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("动")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("形")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("副")) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");
								continue Here;
							}
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>");			 
						}
					}	
				data.setText(page.toString());
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();
			}
		});
		
		buttonETC= new DetaButton("同义词描述", 100, 50, Color.pink);
		//buttonETC.setBounds(200-15, 0, 88, 30);
		buttonETC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sets==null) {
					return;
				}
				StringBuilder page= new StringBuilder();
				List<String> setsForGet = sets;
				Iterator<String> iterator = setsForGet.iterator();
				Here:
					while(iterator.hasNext()) {
						String setOfi = iterator.next();
						if(pos.get(setOfi) == null) {
							page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")" : "") : "") + "</font></span>");
							continue Here;
						}
						if (!setOfi.equals("")) {
							if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
								page.append("<span style=\"background:red\"><font color=\"white\">"+ setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")" : "") : "") +  "</font></span>");
			    				continue Here;
			    			}
							if(pos.get(setOfi).contains("名")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")" : "") : "") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("动")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">"+ setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")" : "") : "") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("形")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")" : "") : "") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("副")) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")" : "") : "") +  "</font></span>");
								continue Here;
							} 
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">"+ setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")" : "") : "") +  "</font></span>");			 
						}
					}	
				data.setText(page.toString());
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();
			}
		});
		
		buttonGXB= new JButton("更新到表格");
		buttonETC.setBounds(200 - 15, 0, 88, 30);
		buttonGXB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(sets== null) {
					return;
				}
				String temp = null;
				try {
					temp = data.getDocument().getText(0, data.getDocument().getLength());
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				table.setValueAt(temp, row, col);
				System.out.println(temp);
			}
		});

		buttonBCJ= new JButton("导出新篇本草全集");
		//buttonETC.setBounds(200 - 15, 0, 88, 30);
		buttonBCJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				FileWriter fw = null;
//				try {
//					fw= new FileWriter("C:/Users/Administrator/Desktop/养疗金项目/bcqj.txt", true);
//					for(int i=0;i<table.getRowCount();i++){
//						fw.write("摘要");
//						for(int j=0;j<table.getColumnCount();j++){
//							fw.write("\r\n");
//							fw.write("["+table.getColumnName(j)+"]");
//							if(table.getValueAt(i, j)!=null) {
//								if(j==3) {
//									fw.write(table.getValueAt(i, j).toString().replaceAll("\\[()\\]", ""));
//								}else {
//									fw.write(table.getValueAt(i, j).toString());
//								}
//							}
//							fw.write("\r\n");
//						}
//					}
//					fw.write("\r\n");
//					fw.write("摘要");
//					fw.close();
//				} catch (IOException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}	
				//一行一行的插入
				boolean mod= true;
				for(int i= 0; i< table.getRowCount(); i++){
					String plsql= "setRoot:C:/DetaDB;";
					   plsql+= "baseName:ZYY;"; 
					   plsql+= "tableName:zybc:insert;" +
						   		"culumnValue:ID:"+ table.getValueAt(i, 0).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:打分:"+ table.getValueAt(i, 1).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:中药名称:"+ table.getValueAt(i, 2).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:笔记原文:"+ table.getValueAt(i, 3).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:功效:"+ table.getValueAt(i, 4).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:风险规避:"+ table.getValueAt(i, 5).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:用量:"+ table.getValueAt(i, 6).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:性味:"+ table.getValueAt(i, 7).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:经脉:"+ table.getValueAt(i, 8).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:中医馆药理:"+ table.getValueAt(i, 9).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:经解:"+ table.getValueAt(i, 10).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:崇源:"+ table.getValueAt(i, 11).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:愚按:"+ table.getValueAt(i, 12).toString().replace(":", "@biky@")+ ";" + 
						   		"culumnValue:搭配:"+ table.getValueAt(i, 13).toString().replace(":", "@biky@")+ ";" +  
						   		"culumnValue:常见药:"+ table.getValueAt(i, 14).toString().replace(":", "@biky@")+ ";";
					try {
						org.plsql.db.plsql.imp.ExecPLSQLImp.ExecPLSQL(plsql, mod);
					}catch(Exception e1) {
						e1.printStackTrace();
					}
				}
			}
		});
    	
    	
    	Box buttonBox= new Box(BoxLayout.X_AXIS);
		buttonBox.add(buttonCTE);
		buttonBox.add(buttonFRS);
		buttonBox.add(buttonETC);
		//buttonBox.add(buttonBCJ);
		buttonBox.add(buttonADD);
		buttonBox.setBounds(0, 0, 445, 20);
		
	//	Box buttonBoxLineTwo= new Box(BoxLayout.X_AXIS);  
	//	buttonBoxLineTwo.add(buttonGXB);
	//	buttonBoxLineTwo.add(buttonBCJ);
	//	buttonBoxLineTwo.setBounds(0, 22, 450, 20);
	//	container.add(buttonBoxLineTwo);
		return buttonBox;
    } 
    
	public JTextField name() throws IOException {
		name= new cfxTextField(null, 0, 0, null);  
		name.setBounds(180-50, 50, 380, 80);
		name.setBackground(Color.white);
		name.addKeyListener(this);
		return name;
	}	

	public JTextField name_filter() throws IOException {
		name_filter= new cfxTextField(null, 0, 0, null);  
		name_filter.setBounds(180-50, 50, 380, 80);
		name_filter.setBackground(Color.white);
		name_filter.addKeyListener(this);
		return name_filter;
	}	
	
	public JTextField name_filter_not_have() throws IOException {
		name_filter_not_have= new cfxTextField(null, 0, 0, null);  
		name_filter_not_have.setBounds(180-50, 50, 380, 80);
		name_filter_not_have.setBackground(Color.white);
		name_filter_not_have.addKeyListener(this);
		return name_filter_not_have;
	}	
	
	@SuppressWarnings({"serial"})
	public javax.swing.JTable jTable() throws IOException {
		dictionaryFromDB d= new dictionaryFromDB();
		dic_list= d.txtToList();
		dic_map= d.listToMap(dic_yw, dic_li, dic_hai, dic_xz, dic_ya, dic_jm
				, dic_xw, dic_cy, dic_jj, dic_zf, dic_cj, dic_yl);
//		dic_yw= d.mapToMap_yw(dic_map);
//		dic_li= d.mapToMap_li(dic_map);
//		dic_hai= d.mapToMap_hai(dic_map);
//		dic_xz= d.mapToMap_xz(dic_map);
//		dic_ya= d.mapToMap_ya(dic_map);
//		dic_jm= d.mapToMap_jm(dic_map);
//		dic_xw= d.mapToMap_xw(dic_map);
//		dic_cy= d.mapToMap_cy(dic_map);
//		dic_jj= d.mapToMap_jj(dic_map);
//		dic_zf= d.mapToMap_zf(dic_map);
//		dic_cj= d.mapToMap_cj(dic_map);
//		dic_yl= d.mapToMap_yl(dic_map,dic_xw,dic_li,dic_xz,dic_jm);
		tableData_old= new Object[dic_map.size()][14];
		Object[][] tableData_old_for_model= new Object[dic_map.size()][14];
		Iterator<String> iter= dic_map.keySet().iterator();
		copy= new ArrayList<>();
		int cc=0;
		while (iter.hasNext()) {
			String temp= iter.next();
			copy.add(temp);
		}
		System.out.println(cc);
		for(int i = 0; i < copy.size(); i++) {
			tableData_old[i]= new Object[]{""+(i+1),""+0,copy.get(i).trim(),
					dic_yw.get(copy.get(i)).toString().replaceAll("\\s*", "") , 
					dic_li.get(copy.get(i)).toString().replaceAll("\\s*", ""),
					(dic_hai.get(copy.get(i))==null?"详情参考笔记原文列":dic_hai.get(copy.get(i))
							.toString().replaceAll("\\s*", "").equalsIgnoreCase("")
							?"详情参考笔记原文列":dic_hai.get(copy.get(i)).toString().replaceAll("\\s*", "")), 
					(dic_yl.get(copy.get(i))==null?"":dic_yl.get(copy.get(i))).toString()
					.replaceAll("\\s*", ""),
					dic_xw.get(copy.get(i)).toString().replaceAll("\\s*", "") ,
					dic_jm.get(copy.get(i)).toString().replaceAll("\\s*", "") ,
					(dic_xz.get(copy.get(i))==null?"":dic_xz.get(copy.get(i))).toString()
					.replaceAll("\\s*", "") , 
					(dic_jj.get(copy.get(i))==null?"":dic_jj.get(copy.get(i))).toString()
					.replaceAll("\\s*", "") , 
					(dic_cy.get(copy.get(i))==null?"":dic_cy.get(copy.get(i))).toString()
					.replaceAll("\\s*", "") ,
					(dic_ya.get(copy.get(i))==null?"":dic_ya.get(copy.get(i))).toString()
					.replaceAll("\\s*", "") , 
					(dic_zf.get(copy.get(i))==null?"":dic_zf.get(copy.get(i))).toString()
					.replaceAll("\\s*", ""),
					(dic_cj.get(copy.get(i))==null?"":dic_cj.get(copy.get(i))).toString()
					.replaceAll("\\s*", "")};
			tableData_old_for_model[i]=tableData_old[i].clone();
		}	
		table= new javax.swing.JTable();  
		newTableModel= new DefaultTableModel(tableData_old_for_model,columnTitle){  
			@Override  
			public boolean isCellEditable(int row,int column){  
				return false;  
			}  
		};  
		TableSorterWithLYG4DQS4D sorter= new TableSorterWithLYG4DQS4D(newTableModel); //ADDE
		sorter.setTableHeader(table.getTableHeader());
		table.setModel(sorter); 
		table.setRowHeight(35);                                        //设置高度
		JTableHeader header = table.getTableHeader();
		header.setFont(new Font("楷体", Font.PLAIN, 18));// 设置表格字体
		table.addMouseListener(this);
		table.getColumnModel().getColumn(3).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(4).setPreferredWidth(80+130);
		table.getColumnModel().getColumn(5).setPreferredWidth(80+130);
		table.getColumnModel().getColumn(6).setPreferredWidth(80+130);
		table.getColumnModel().getColumn(7).setPreferredWidth(80+130);
		table.getColumnModel().getColumn(8).setPreferredWidth(80+130);
		table.getColumnModel().getColumn(9).setPreferredWidth(80+130);
		table.getColumnModel().getColumn(10).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(11).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(12).setPreferredWidth(80+30);
		table.getColumnModel().getColumn(14).setPreferredWidth(300+60);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.getTableHeader().setReorderingAllowed(false);
		table.validate();
		table.setVisible(true);
		colorTableRender tcr= new colorTableRender();  
		table.setDefaultRenderer(Object.class, tcr);	
		return table;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		if(disableCursor) {
			return;
		}
		key= name.getText();
		if(key!= null && !key.replace(" ", "").equals("") && key.length()>20) {
			key= key.substring(0, 20);
		}
		if(key== null) {
			key= "";	
		}
		row= table.getSelectedRow();
		col= table.getSelectedColumn();
		try {
			app.bootClassificationMap(table.getValueAt(row, 2).toString(), false);
		}catch(Exception e) {
			this.validate();
		}
		try {
			String value = table.getValueAt(row, col).toString();
			data.setSize(500, 800);
			sets = analyzer.parserMixedString(value);//词性分析
			data.setContentType("text/html");
			String page="";
			Iterator<String> iterator = sets.iterator();
			Here:
				while(iterator.hasNext()) {
					String setOfi = iterator.next();
					if(pos.get(setOfi) == null) {
						page += ("<span style=\"background:#FEFEFE\"><font color=\"black\" size=\"5\">" 
					+ setOfi + "</font></span>");
						continue Here;
					}
					if (!setOfi.equals("")) {
						if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi)
								.contains("动")||pos.get(setOfi).contains("形"))) {
							page+="<span style=\"background:red\"><font color=\"white\">"+setOfi
									+"</font></span>";
							continue Here;
						}
						if(pos.get(setOfi).contains("名")) {
							page+="<span style=\"background:"+new imageProcessor.ColorProcessor()
									.Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>";
							continue Here;
						}
						if(pos.get(setOfi).contains("动")) {
							page+="<span style=\"background:"+new imageProcessor.ColorProcessor()
									.Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>";
							continue Here;
						}
						if(pos.get(setOfi).contains("形")) {
							page+="<span style=\"background:"+new imageProcessor.ColorProcessor()
									.Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">"+setOfi+"</font></span>";
							continue Here;
						}
						if(pos.get(setOfi).contains("副")) {
							page+="<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"+setOfi
									+"</font></span>";
							continue Here;
						} 
						page+="<span style=\"background:white\"><font color=\"black\" size=\"5\">"+setOfi
								+"</font></span>";				 
					}
				}
			data.setText(page);
			data.setSelectionStart(0);
			data.setSelectionEnd(0);
			data.validate();
		}catch(Exception e){	
			e.printStackTrace();
		}          
		//add graph
		try {
			panel_yt.removeAll();
			label0001.removeAll();
			String value_temp= table.getValueAt(row, 2).toString().replace("\\s+", "");
			pngy_2_1= new ImageIcon(getClass().getResource("yc/"+ value_temp+ ".png"));
			label0001.setIcon(pngy_2_1);
			label0001.validate();
			panel_yt.add(label0001);
			panel_yt.validate();
			panel_yt.updateUI();
		}catch(Exception e) {
			JLabel temp= new JLabel("亲，没找到~~");
			panel_yt.add(temp);
			panel_yt.validate();
			panel_yt.updateUI();
		}
		this.panel.removeAll();
		this.panel.setLayout(new GridLayout(1, 1));
		//add jingmai
		String value_jingmai = "";
		try {
			for(int i = 0; i < table.getColumnCount(); i++) {
				if(table.getValueAt(row, i)!=null) {
					String temp = table.getValueAt(row, i).toString();
					if(temp.length()<30) {
						value_jingmai += temp;
					}
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		try {
			int c = 0;
			Box jingMaiBox= new Box(BoxLayout.Y_AXIS);
			if(!value_jingmai.equals("")) {
				if(value_jingmai.contains("手阳明")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("大肠")) {
					JLabel label1= new JLabel(this.shouyangmin);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("手少阳")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("三焦")) {
					JLabel label1= new JLabel(this.shoushaoyang);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("手少阴")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("心")
						||value_jingmai.contains("苦")) {
					JLabel label1= new JLabel(this.shoushaoyin);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("手太阳")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("小肠")) {
					JLabel label1= new JLabel(this.shoutaiyang);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("手太阴")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("肺")
						||value_jingmai.contains("辛")) {
					JLabel label1= new JLabel(this.shoutaiyin);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("手厥阴")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("心包")) {
					JLabel label1= new JLabel(this.shoujueyin);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("足阳明")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("胃")) {
					JLabel label1= new JLabel(this.zuyangmin);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("足少阳")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("胆")) {
					JLabel label1= new JLabel(this.zushaoyang);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("足少阴")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("肾")
						||value_jingmai.contains("咸")||value_jingmai.contains("寒")) {
					JLabel label1= new JLabel(this.zushaoyin);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("足太阳")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("膀胱")) {
					JLabel label1= new JLabel(this.zutaiyang);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("足太阴")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("脾")) {
					JLabel label1= new JLabel(this.zutaiyin);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}

				if(value_jingmai.contains("足厥阴")||value_jingmai.contains("通行十二")
						||value_jingmai.contains("肝")
						||value_jingmai.contains("温")) {
					JLabel label1= new JLabel(this.zujueyin);
					//this.panel.add(label1);
					jingMaiBox.add(label1);
					c=1;
				}
			}
			if(c==0){
				JLabel temp= new JLabel("亲，没找到~~");
				//this.panel.add(temp);
				jingMaiBox.add(temp);
			}
			
			//box, button, 
			//panel add box
			this.panel.add(jingMaiBox);
			this.panel.updateUI();
		}catch(Exception e) {
			e.printStackTrace();
			this.panel.updateUI();
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
		String zhongyao="";
		key= name.getText();
		String forE = key.toLowerCase().toString();
		if(key != null && !key.replace(" ", "").equals("") && key.length()>50) {
			key = key.substring(0, 50);
		}
		if(forE != null && !forE.replace(" ", "").equals("") && forE.length()>110) {
			forE = forE.substring(0, 110);
		}
		key = key.length()==0?"":ts.MixedStringToChineseString(analyzer, key);
		if(key.replaceAll("\\s+", " ").equalsIgnoreCase(" ")){
			key="";
		}
		zhongyao= key.toString();
		Here:
			for(int i= 0; i< key.length(); i++) {
				if(StableData.feng.contains(""+ key.charAt(i))) {
					key+= "风";
					continue Here;
				}
				if(StableData.han.contains(""+ key.charAt(i))) {
					key+= "风寒";
					continue Here;
				}
				if(StableData.hot.contains(""+ key.charAt(i))) {
					key+= "风热";
					continue Here;
				}
				if(StableData.shi.contains(""+ key.charAt(i))) {
					key+= "风湿";
					continue Here;
				}
				if(StableData.huo.contains(""+ key.charAt(i))) {
					key+= "火";
					continue Here;
				}
				if(StableData.zao.contains(""+ key.charAt(i))) {
					key+= "燥";
					continue Here;
				}
				if(StableData.liuYin.contains(""+ key.charAt(i))) {
					key+= "六淫";
					continue Here;
				}
				if(StableData.qiQing.contains(""+ key.charAt(i))) {
					key+= "七情";
					continue Here;
				}
				if(StableData.wangYang.contains(""+ key.charAt(i))) {
					key+= "亡阳";
					continue Here;
				}
				if(StableData.wangYin.contains(""+ key.charAt(i))) {
					key+= "亡阴";
					continue Here;
				}
				if(StableData.jiBaoShiChang.contains(""+ key.charAt(i))) {
					key+= "饥饱失常";
					continue Here;
				}
				if(StableData.yinShiBuJie.contains(""+ key.charAt(i))) {
					key+= "饮食不洁";
					continue Here;
				}
				if(StableData.tiaoShiPianShe.contains(""+ key.charAt(i))) {
					key+= "挑食偏食";
					continue Here;
				}
				if(StableData.biaoHan.contains(""+ key.charAt(i))) {
					key+= "表寒";
					continue Here;
				}
				if(StableData.biaoRe.contains(""+ key.charAt(i))) {
					key+= "表热";
					continue Here;
				}
				if(StableData.yuXue.contains(""+ key.charAt(i))) {
					key+= "淤";
				}
			}
		if(jpanel6!= null) {
			this.jpanel6.key= zhongyao.toString();
			this.jpanel6.keyReleased(null);
		}
		if(jpanel7!= null) {
			this.jpanel7.key= zhongyao.toString();
			this.jpanel7.keyReleased(null);
		}
		if(jpanel8!= null) {
			this.jpanel8.key= zhongyao.toString();
			this.jpanel8.keyReleased(null);
		}
		if(jpanel9!= null) {
			this.jpanel9.key= zhongyao.toString();
			this.jpanel9.keyReleased(null);
		}
		if(jpanel10!= null) {
			this.jpanel10.key= zhongyao.toString();
			this.jpanel10.keyReleased(null);
		}
		if(jpanel11!= null) {
			this.jpanel11.key= zhongyao.toString();
			this.jpanel11.keyReleased(null);
		}
		if(jpanel12!= null) {
			this.jpanel12.key= zhongyao.toString();
			this.jpanel12.keyReleased(null);
		}
		if(jpanel13!= null) {
			this.jpanel13.key= zhongyao.toString();
			this.jpanel13.keyReleased(null);
		}
		if(jpanel14!= null) {
			this.jpanel14.key= zhongyao.toString();
			this.jpanel14.keyReleased(null);
		}
		if(jpanel15!= null) {
			this.jpanel15.key= zhongyao.toString();
			this.jpanel15.keyReleased(null);
		}
		if(jpanel16!= null) {
			this.jpanel16.key= zhongyao.toString();
			this.jpanel16.keyReleased(null);
		}
		Translator ts= new TranslatorImp();
		try {
			ts.init(analyzer);
		} catch (IOException e) {
		} 
		List<Verbal> verbals= ts.index(analyzer, forE);
		if(jpanel17!= null) {
			this.jpanel17.verbals= verbals;
			this.jpanel17.keyReleased(null);
		}
		String[] score= new String[copy.size()];
		int[] score_code= new int[copy.size()];
		double []reg= new double[copy.size()];
		int count= 0;
		Map<String, WordFrequency> mapSearchWithoutSort= null;
		Map<Integer, WordFrequency> mapSearchWithSort= null;
		if(dic_map.containsKey(zhongyao.replaceAll(" ", ""))) {
			mapSearchWithoutSort= analyzer.parserMixStringByReturnFrequencyMap(zhongyao);	
		}else {
			if(key.split(" ")[0].length()> 5) {
				mapSearchWithoutSort= analyzer.parserMixStringByReturnFrequencyMap(key);
			}else {
				mapSearchWithoutSort= analyzer.parserMixStringByReturnFrequencyMap(zhongyao);	
			}
		}	
		Iterator<String> iteratorForCopy= copy.iterator();	
		int copyCount= 0;
		while(iteratorForCopy.hasNext()) {
			String iteratorForCopyString= iteratorForCopy.next();
			score[copyCount]= iteratorForCopyString;
			String temps= dic_map.get(iteratorForCopyString).toString();
			String tempsPCA= dic_li.get(iteratorForCopyString).toString();
			Iterator<String> iteratorWordFrequency= mapSearchWithoutSort.keySet().iterator();
			Here:
				while(iteratorWordFrequency.hasNext()) {  
					String mapSearchaAtII = iteratorWordFrequency.next();
					WordFrequency wordFrequencySearch = mapSearchWithoutSort.get(mapSearchaAtII);
					if(temps.contains(mapSearchaAtII)) {
						if(reg[copyCount] == 0){
							count += 1;
						}
						if(score[copyCount].contains(zhongyao.replace(" ", ""))) {
							reg[copyCount]+= 1000;
						}
						score[copyCount]= iteratorForCopyString;
						if(!pos.containsKey(mapSearchaAtII)) {
							reg[copyCount]+= 1;
							score_code[copyCount]+= 1<< mapSearchaAtII.length()
									<< wordFrequencySearch.getFrequency() ;
							if(tempsPCA.contains(mapSearchaAtII)) {
								score_code[copyCount] *= 2;
							}
							if(score[copyCount].contains(mapSearchaAtII)) {
								reg[copyCount]+= 1000;
							}
							continue Here;
						}
						if(pos.get(mapSearchaAtII).contains("名")|| pos.get(mapSearchaAtII).contains("动")
								|| pos.get(mapSearchaAtII).contains("形")|| pos.get(mapSearchaAtII).contains("谓")) {
							reg[copyCount]+= 2;
							if(tempsPCA.contains(mapSearchaAtII)) {
								reg[copyCount]*= 2;
							}
						}
						reg[copyCount] += 1;
						score_code[copyCount] += (iteratorForCopyString.contains(mapSearchaAtII) ? 2 : 1) 
							* (!pos.get(mapSearchaAtII).contains("名") ? pos.get(mapSearchaAtII).contains("动")? 10 : 1 : 150) 
								<< mapSearchaAtII.length() * wordFrequencySearch.getFrequency();
						if(score[copyCount].contains(mapSearchaAtII)) {
							reg[copyCount]+= 1000;
						}
						continue Here;
					}
					if(mapSearchaAtII.length()>1) {
						for(int j=0;j<mapSearchaAtII.length();j++) {
							if(temps.contains(String.valueOf(mapSearchaAtII.charAt(j)))) {
								if(reg[copyCount] == 0){
									count += 1;
								}
								score[copyCount] = iteratorForCopyString;
								score_code[copyCount]+=1;
								if(pos.containsKey(String.valueOf(mapSearchaAtII.charAt(j)))&&(
										pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("名")
										||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("动")
										||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("形")
										||pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("谓")
										)) {
									reg[copyCount] += 2;
								}
								reg[copyCount] += 1;
								if(score[copyCount].contains(mapSearchaAtII)) {
									reg[copyCount]+= 1000;
								}
								continue Here;
							}
						}
					}
				}
			score_code[copyCount] = score_code[copyCount] * (int)reg[copyCount];
			if(jingmai_filter_box.isSelected()) {
				score_code[copyCount] *= count;	
			}
			copyCount++;
		}
		LABEL2:
			new Quick6DLYGWithStringSwap().sort(score_code, score);
			int max= score_code[0];
			Object[][] tableData= new Object[count][13];
			int new_count = 0;
			newTableModel.getDataVector().clear();
			if(null== key|| key.equals("")) {
				for(int i= 0; i < tableData_old.length; i++) {
					newTableModel.insertRow(i, tableData_old[i]);
				}		
				newTableModel.fireTableDataChanged();	
				return;
			}
			Here:
				for(int i = copy.size()-1; i > -1; i--) {
					if(score_code[i]< 1){
						continue Here;
					}
					if(risk_filter_box.isSelected()) {
						String hai= (dic_hai.get(score[i])==null?"null."
								:dic_hai.get(score[i]).toString().replaceAll("\\s*", "")
								.equalsIgnoreCase("")?"null":dic_hai.get(score[i]).toString()
										.replaceAll("\\s*", ""));
						String temp= name_filter.getText();
						for(int j=0;j<temp.length();j++) {
							if(hai.contains(""+ temp.charAt(j))) {
								continue Here;
							}	
						}
					}
					if(feel_filter_box.isSelected()) {
						String wei= dic_xw.get(score[i]).toString().replaceAll("\\s*", "");
						String temp= name_feel_filter.getText();
						for(int j=0;j<temp.length();j++) {
							if(wei.contains(""+ temp.charAt(j))) {
								continue Here;
							}	
						}
					}
					if(null!= name_filter_not_have.getText()) {
						if(!name_filter_not_have.getText().replace(" ", "").isEmpty()) {
							String wei= dic_jm.get(score[i]).toString().replaceAll("\\s*", "");
							String temp= name_filter_not_have.getText();
							for(int j=0;j<temp.length();j++) {
								if(!wei.contains(""+ temp.charAt(j))) {
									continue Here;
								}	
							}
						}
					}
					if(shuming_filter_box.isSelected()) {
						String wei= score[i];
						String temp= name_filter.getText();
						for(int j=0;j<temp.length();j++) {
							if(wei.contains(""+ temp.charAt(j))) {
								continue Here;
							}	
						}
					}
					String temp= dic_map.get(score[i]).toString();
					if(tableData.length<= new_count) {
						continue Here;
					}
					tableData[new_count]= new Object[]{new_count+1, score_code[i], score[i],
							dic_yw.get(score[i]).toString(),
							dic_li.get(score[i]).toString().replaceAll("\\s*", ""),
							(dic_hai.get(score[i])==null?"详情参考笔记原文列: 是药三分毒, 补药甚三分. 食材亦如此, 勤俭亦长生.":dic_hai.get(score[i]).toString().replaceAll("\\s*", "").equalsIgnoreCase("")?"详情参考笔记原文列":dic_hai.get(score[i]).toString().replaceAll("\\s*", "")), 				
							(dic_yl.get(score[i])==null?"":dic_yl.get(score[i])).toString()
							.replaceAll("\\s*", ""),
							dic_xw.get(score[i]).toString().replaceAll("\\s*", "") ,
							dic_jm.get(score[i]).toString().replaceAll("\\s*", "") ,
							(dic_xz.get(score[i])==null?"":dic_xz.get(score[i])).toString()
							.replaceAll("\\s*", "") , 
							(dic_jj.get(score[i])==null?"":dic_jj.get(score[i])).toString()
							.replaceAll("\\s*", ""), 
							(dic_cy.get(score[i])==null?"":dic_cy.get(score[i])).toString()
							.replaceAll("\\s*", ""),
							(dic_ya.get(score[i])==null?"":dic_ya.get(score[i])).toString()
							.replaceAll("\\s*", "") , 
							(dic_zf.get(score[i])==null?"":dic_zf.get(score[i])).toString()
							.replaceAll("\\s*", ""),
							(dic_cj.get(score[i])==null?"":dic_cj.get(score[i])).toString()
							.replaceAll("\\s*", "")};
					if(zhongyao.contains("风寒")) {
						if(temp.contains("风寒")) {
							newTableModel.insertRow(new_count, tableData[new_count]);
							new_count += 1;
						}
					}else if(zhongyao.contains("风热")){
						if(temp.contains("风热")) {
							newTableModel.insertRow(new_count, tableData[new_count]);
							new_count += 1;
						}		
					}else {
						newTableModel.insertRow(new_count, tableData[new_count]);
						new_count+=1;
					}		 
				}	
			newTableModel.fireTableDataChanged();				
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		//if(arg0.getID())
	}

	public class colorTableRender extends DefaultTableCellRenderer { 
		private static final long serialVersionUID = 1L;
		public Component getTableCellRendererComponent(JTable table,Object value
				, boolean isSelected, boolean hasFocus, int row,
				int column) {
			if (isSelected && hasFocus && row == table.getSelectedRow() && column 
					== table.getSelectedColumn()) {
				//2.设置当前Cell的颜色
				Component c = super.getTableCellRendererComponent(table, value, isSelected
						, hasFocus, row, column);
				c.setBackground(Color.CYAN);//设置背景色
				c.setForeground(Color.gray);//设置前景色
				return c;
			} else {
				//3.设置单数行，偶数行的颜色
				if (row % 3 == 0) {//偶数行时的颜色
					setBackground(new Color(253,233,254));
				}else if (row % 3 == 1) {//设置单数行的颜色
					setBackground(new Color(233,254,234));
				}else if (row % 3 == 2) {//设置单数行的颜色
					setBackground(new Color(255,251,232));
				}
				return super.getTableCellRendererComponent(table, value,
						isSelected, hasFocus, row, column);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(zonghe_filter_box.isSelected()) {
			for(int i = 0; i < newTableModel.getRowCount(); i++){
					for(int j = 0; j < newTableModel.getRowCount(); j++){
						if(i!= j) {
							if(newTableModel.getValueAt(i, 5).toString()
									.contains(newTableModel.getValueAt(j, 2).toString())) {
								newTableModel.removeRow(j);
								j-= 1;
							}
						}
					}
				}
			newTableModel.fireTableDataChanged();
		}else {
			this.keyReleased(null);;
		}
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		if(null!= jp1) {
			jp1.reg= 0;
			if(null!= jp1.waveJpanel) {
				jp1.waveJpanel.reg= 0;	
			}
			this.validate();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				this.validate();
			}
		}
		// TODO Auto-generated method stub
		
	}
}