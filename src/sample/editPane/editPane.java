package sample.editPane;
import java.awt.Container;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import org.tinos.engine.analysis.Analyzer;
import comp.filenameFilter.TXTFilter;
import comp.jbutton.DetaButton;
public class editPane extends Container implements MouseListener, KeyListener{
	private static final long serialVersionUID = 1L;
	public String key;
	public Map<String, String> pose;
	public Map<String, String> etc;
	public Map<String, String> cte;
	public Analyzer analyzer; 
	public Map<String, String> pos;
	public JTextPane data;
	public JTextPane text;
	public String dataValue;
	private Map<String, String> pinyin;
	private Map<String, String> ctj;
	private Map<String, String> ctk;
	private Map<String, String> ctt;
	private Map<String, String> ctr;
	public editPane(JTextPane text, Analyzer analyzer, Map<String, String> pos, Map<String, String> pose, Map<String, String> etc,
			Map<String, String> cte, Map<String, String> pinyin, Map<String, String> ctk
			, Map<String, String> ctt, Map<String, String> ctj, Map<String, String> ctr) {
		this.text = text;
		this.key = "";
		this.pose = pose;
		this.etc = etc;
		this.cte = cte;
		this.ctj = ctj;
		this.ctk = ctk;
		this.ctt = ctt;
		this.ctr = ctr;
		this.analyzer = analyzer;
		this.pos = pos;
		this.pinyin= pinyin;
		this.setLayout(null);
		this.setBounds(0, 0, 1490, 980);
		JScrollPane jsp_data = new JScrollPane(this.data());
		jsp_data.setBounds(5+600, 30, 1440-130-620, 650);
		JScrollPane jsp_text = new JScrollPane(this.text);
		jsp_text.setBounds(5, 30, 1440-130-720, 650);
		addOutputButton();
		addTranslateButton();
		addExplainButton();
		addClearButton();
		addTxtButton();
		addPrintButton();
		addReadButton();
		addPinYinButton();
		addArabicButton();
		addTranditionButton();
		addJapanButton();
		addRussianButton();
		this.add(jsp_data); 
		this.add(jsp_text); 
	}

	private void addArabicButton() {
		comp.jbutton.DetaButton button= new comp.jbutton.DetaButton("阿语");
		button.setBounds(5+ 105+ 105+ 105+ 105+ 105+ 105+ 105+ 105+ 105, 3, 100, 20);
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().equalsIgnoreCase("")) {
					return;
				}
				StringBuilder page = new StringBuilder();
				Iterator<String> iterator = analyzer.parserMixedString(text.getText().trim()).iterator();
				if(text.getSelectedText()!=null && !text.getSelectedText().trim().isEmpty()) {
					iterator = analyzer.parserMixedString(text.getSelectedText().trim()).iterator();
				}
				text.setSelectionStart(0);
				text.setSelectionEnd(0);
				String split="【";
				String splite="】";
				Here:
					while(iterator.hasNext()) {
						String setOfi = iterator.next();
						if(pos.get(setOfi) == null) {
							page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi + split+
									(ctk.containsKey(setOfi)? ctk.get(setOfi):"")+splite);
							continue Here;
						}
						if (!setOfi.equals("")) {
							if(key.contains(setOfi)&& (pos.get(setOfi).contains("名")|| pos.get(setOfi).contains("动")
									|| pos.get(setOfi).contains("形"))) {
								page.append("<span style=\"background:red\"><font color=\"white\">" + setOfi+split 
										+ (ctk.containsKey(setOfi)? ctk.get(setOfi):"")+splite  + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("名")) {
								page.append("<span style=\"background:"+ new imageProcessor.ColorProcessor().Processor(255, 245, 255)
										+"\"><font color=\"black\" size=\"5\">"  + setOfi + split +
										 (ctk.containsKey(setOfi)? ctk.get(setOfi): "")+splite  +  "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("动")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(245, 255, 245)+
										"\"><font color=\"black\" size=\"5\">" + setOfi + split +
										 (ctk.containsKey(setOfi)? ctk.get(setOfi):"")+splite  + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("形")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 255, 245)
										+ "\"><font color=\"black\" size=\"5\">" + setOfi + split +
										 (ctk.containsKey(setOfi)? ctk.get(setOfi):"") + splite + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("副")) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"  + setOfi + split +  
										(ctk.containsKey(setOfi)? ctk.get(setOfi):"") + splite +  "</font></span>");
								continue Here;
							} 
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">" + setOfi + split +  
									(ctk.containsKey(setOfi)? ctk.get(setOfi):"") + splite + "</font></span>");			 
						}
					}	
				data.setText(page.toString());
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();
			}
		});
		this.add(button); 
	}
	
	private void addRussianButton() {
		comp.jbutton.DetaButton button= new comp.jbutton.DetaButton("俄语");
		button.setBounds(5+ 105+ 105+ 105+ 105+ 105+ 105+ 105+ 105+ 105+ 105+ 105, 3, 100, 20);
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().equalsIgnoreCase("")) {
					return;
				}
				StringBuilder page = new StringBuilder();
				Iterator<String> iterator = analyzer.parserMixedString(text.getText().trim()).iterator();
				if(text.getSelectedText()!=null && !text.getSelectedText().trim().isEmpty()) {
					iterator = analyzer.parserMixedString(text.getSelectedText().trim()).iterator();
				}
				text.setSelectionStart(0);
				text.setSelectionEnd(0);
				String split="【";
				String splite="】";
				Here:
					while(iterator.hasNext()) {
						String setOfi = iterator.next();
						if(pos.get(setOfi) == null) {
							page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi + split+
									(ctr.containsKey(setOfi)? ctr.get(setOfi):"")+splite);
							continue Here;
						}
						if (!setOfi.equals("")) {
							if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
								page.append("<span style=\"background:red\"><font color=\"white\">" + setOfi+split 
										+ (ctr.containsKey(setOfi)? ctr.get(setOfi):"")+splite  + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("名")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"  + setOfi +split+
										 (ctr.containsKey(setOfi)? ctr.get(setOfi):"")+splite  +  "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("动")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(245, 255, 245)+
										"\"><font color=\"black\" size=\"5\">" + setOfi +split+
										 (ctr.containsKey(setOfi)? ctr.get(setOfi):"")+splite + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("形")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 255, 245)
										+"\"><font color=\"black\" size=\"5\">" + setOfi +split+
										 (ctr.containsKey(setOfi)? ctr.get(setOfi):"")+splite + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("副")) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"  + setOfi +split+ 
										(ctr.containsKey(setOfi)? ctr.get(setOfi):"")+splite +  "</font></span>");
								continue Here;
							} 
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">" + setOfi +split+ 
									(ctr.containsKey(setOfi)? ctr.get(setOfi):"")+splite+  "</font></span>");			 
						}
					}	
				data.setText(page.toString());
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();
			}
			
			
		});
		this.add(button); 
	}
	
	private void addTranditionButton() {
		comp.jbutton.DetaButton button= new comp.jbutton.DetaButton("繁体");
		button.setBounds(5+ 105+ 105+ 105+ 105+ 105+ 105+ 105+ 105, 3, 100, 20);
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().equalsIgnoreCase("")) {
					return;
				}
				StringBuilder page = new StringBuilder();
				Iterator<String> iterator = analyzer.parserMixedString(text.getText().trim()).iterator();
				if(text.getSelectedText()!=null && !text.getSelectedText().trim().isEmpty()) {
					iterator = analyzer.parserMixedString(text.getSelectedText().trim()).iterator();
				}
				text.setSelectionStart(0);
				text.setSelectionEnd(0);
				String split= "【";
				String splite="】";
				Here:
					while(iterator.hasNext()) {
						String setOfi = iterator.next();
						if(pos.get(setOfi) == null) {
							page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi +split+ 
									(ctt.containsKey(setOfi)? ctt.get(setOfi):"")+splite);
							continue Here;
						}
						if (!setOfi.equals("")) {
							if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
								page.append("<span style=\"background:red\"><font color=\"white\">" + setOfi+split 
										+ (ctt.containsKey(setOfi)? ctt.get(setOfi):"")+splite + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("名")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 245, 255)
										+"\"><font color=\"black\" size=\"5\">"  + setOfi +split+
										 (ctt.containsKey(setOfi)? ctt.get(setOfi):"")+splite +  "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("动")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(245, 255, 245)
										+"\"><font color=\"black\" size=\"5\">" + setOfi +split+
										 (ctt.containsKey(setOfi)? ctt.get(setOfi):"")+splite + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("形")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 255, 245)
										+"\"><font color=\"black\" size=\"5\">" + setOfi +split+
										 (ctt.containsKey(setOfi)? ctt.get(setOfi):"")+splite + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("副")) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"  
							+ setOfi +split+ (ctt.containsKey(setOfi)? ctt.get(setOfi):"")+splite +  "</font></span>");
								continue Here;
							} 
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">" + setOfi +split+ 
									(ctt.containsKey(setOfi)? ctt.get(setOfi):"")+splite+  "</font></span>");			 
						}
					}	
				data.setText(page.toString());
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();
			}
			
			
		});
		this.add(button); 
	}
	
	private void addJapanButton() {
		comp.jbutton.DetaButton button= new comp.jbutton.DetaButton("日语");
		button.setBounds(5+ 105+ 105+ 105+ 105+ 105+ 105+ 105+ 105+ 105+ 105, 3, 100, 20);
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().equalsIgnoreCase("")) {
					return;
				}
				StringBuilder page = new StringBuilder();
				Iterator<String> iterator = analyzer.parserMixedString(text.getText().trim()).iterator();
				if(text.getSelectedText()!=null && !text.getSelectedText().trim().isEmpty()) {
					iterator = analyzer.parserMixedString(text.getSelectedText().trim()).iterator();
				}
				text.setSelectionStart(0);
				text.setSelectionEnd(0);
				String split="【";
				String splite="】";
				Here:
					while(iterator.hasNext()) {
						String setOfi = iterator.next();
						if(pos.get(setOfi) == null) {
							page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi +split+
									(ctj.containsKey(setOfi)? ctj.get(setOfi):"")+splite);
							continue Here;
						}
						if (!setOfi.equals("")) {
							if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
								page.append("<span style=\"background:red\"><font color=\"white\">" + setOfi+split 
										+ (ctj.containsKey(setOfi)? ctj.get(setOfi):"")+splite + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("名")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 245, 255)
										+"\"><font color=\"black\" size=\"5\">"  + setOfi +split+
										 (ctj.containsKey(setOfi)? ctj.get(setOfi):"") +splite+  "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("动")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(245, 255, 245)
										+"\"><font color=\"black\" size=\"5\">" + setOfi +split+
										 (ctj.containsKey(setOfi)? ctj.get(setOfi):"") +splite+ "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("形")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 255, 245)
										+"\"><font color=\"black\" size=\"5\">" + setOfi +split+
										 (ctj.containsKey(setOfi)? ctj.get(setOfi):"")+splite + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("副")) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"  
							+ setOfi +split+ (ctj.containsKey(setOfi)? ctj.get(setOfi):"")+splite +  "</font></span>");
								continue Here;
							} 
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">" + setOfi 
									+split+ (ctj.containsKey(setOfi)? ctj.get(setOfi):"")+splite+  "</font></span>");			 
						}
					}	
				data.setText(page.toString());
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();
			}
			
			
		});
		this.add(button); 
	}
	
	private void addPinYinButton() {
		comp.jbutton.DetaButton button= new comp.jbutton.DetaButton("拼音");
		button.setBounds(5+ 105+ 105+ 105+ 105+ 105+ 105+ 105, 3, 100, 20);
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().equalsIgnoreCase("")) {
					return;
				}
				StringBuilder page = new StringBuilder();
				Iterator<String> iterator = analyzer.parserMixedString(text.getText().trim()).iterator();
				if(text.getSelectedText()!=null && !text.getSelectedText().trim().isEmpty()) {
					iterator = analyzer.parserMixedString(text.getSelectedText().trim()).iterator();
				}
				text.setSelectionStart(0);
				text.setSelectionEnd(0);
				Here:
					while(iterator.hasNext()) {
						String setOfi = iterator.next();
						if(pos.get(setOfi) == null) {
							page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi + (pinyin.containsKey(setOfi)? pinyin.get(setOfi):""));
							continue Here;
						}
						if (!setOfi.equals("")) {
							if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
								page.append("<span style=\"background:red\"><font color=\"white\">" + setOfi 
										+ (pinyin.containsKey(setOfi)? pinyin.get(setOfi):"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("名")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"  + setOfi +
										 (pinyin.containsKey(setOfi)? pinyin.get(setOfi):"") +  "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("动")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">" + setOfi +
										 (pinyin.containsKey(setOfi)? pinyin.get(setOfi):"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("形")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">" + setOfi +
										 (pinyin.containsKey(setOfi)? pinyin.get(setOfi):"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("副")) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"  + setOfi + 
										(pinyin.containsKey(setOfi)? pinyin.get(setOfi):"") +  "</font></span>");
								continue Here;
							} 
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">" + setOfi + 
									(pinyin.containsKey(setOfi)? pinyin.get(setOfi):"")+  "</font></span>");			 
						}
					}	
				data.setText(page.toString());
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();
			}
			
			
		});
		this.add(button); 
	}
	
	private void addReadButton() {
		comp.jbutton.DetaButton button= new comp.jbutton.DetaButton("阅读");
		button.setBounds(5+ 105+ 105+ 105+ 105+ 105+ 105, 3, 100, 20);
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//get path
				FileDialog filedialog= new FileDialog(new Frame(),"选择要阅读的医学书籍", FileDialog.LOAD);
				filedialog.setFilenameFilter(new TXTFilter("txt"));
				filedialog.setVisible(true);
				String filepath= filedialog.getDirectory()+ filedialog.getFile();
				System.out.println(filepath);
				if(filepath.endsWith(".doc")||filepath.endsWith(".docx")
						||filepath.endsWith(".txt")||filepath.endsWith(".pdf")) {
					try {
						Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+filepath);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		this.add(button); 
	}
	
	private void addPrintButton() {
		DetaButton button =new DetaButton("打印");
		button.setBounds(5+105+105+105+105+105, 3, 100, 20);
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().equalsIgnoreCase("")) {
					return;
				}
				
				String temp = text.getText();
				new PrintTest4(temp.substring(0, 1500 > temp.length() ? temp.length():1500));
				int page = temp.length()/1500;
				for(int i = 1; i <= page; i++) {
					new PrintTest4(temp.substring(i*1500, (i+1)*1500 
							> temp.length()?temp.length():(i+1)*1500));
				}
			}
		});
		this.add(button); 
	}

	private void addTxtButton() {
		DetaButton button= new DetaButton("生成TXT");
		button.setBounds(5+105+105+105+105, 3, 100, 20);
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().equalsIgnoreCase("")) {
					return;
				}
				//get path
				FileDialog filedialog=new FileDialog(new Frame(),"导入到这里",FileDialog.LOAD);
				filedialog.setFilenameFilter(new TXTFilter("txt"));
				filedialog.setVisible(true);
				String filepath=filedialog.getDirectory() + filedialog.getFile();
				System.out.println(filepath);
				//write file
				FileWriter fw = null;
				try {
					fw = new FileWriter(filepath, true);
					fw.write(text.getText());
					fw.close();
				} catch (IOException e) {
					try {
						fw.close();
					} catch (IOException e1) {
						fw=null;
						e1.printStackTrace();
					}
					e.printStackTrace();
				}	
			}
		});
		this.add(button); 
	}

	private void addClearButton() {
		DetaButton button =new DetaButton("还原");
		button.setBounds(5+105+105+105, 3, 100, 20);
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().equalsIgnoreCase("")) {
					return;
				}
				StringBuilder page = new StringBuilder();
				Iterator<String> iterator = analyzer.parserMixedString(text.getText().trim()).iterator();
				if(text.getSelectedText()!=null && !text.getSelectedText().trim().isEmpty()) {
					iterator = analyzer.parserMixedString(text.getSelectedText().trim()).iterator();
				}
				text.setSelectionStart(0);
				text.setSelectionEnd(0);
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
		this.add(button); 
	}

	private void addExplainButton() {
		DetaButton button =new DetaButton("解释");
		button.setBounds(5+105+105, 3, 100, 20);
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().equalsIgnoreCase("")) {
					return;
				}
				StringBuilder page = new StringBuilder();
				Iterator<String> iterator = analyzer.parserMixedString(text.getText().trim()).iterator();
				if(text.getSelectedText()!=null && !text.getSelectedText().trim().isEmpty()) {
					iterator = analyzer.parserMixedString(text.getSelectedText().trim()).iterator();
				}
				text.setSelectionStart(0);
				text.setSelectionEnd(0);
				Here:
					while(iterator.hasNext()) {
						String setOfi = iterator.next();
						if(pos.get(setOfi) == null) {
							page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")":""):"") + "</font></span>");
							continue Here;
						}
						if (!setOfi.equals("")) {
							if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
								page.append("<span style=\"background:red\"><font color=\"white\">" + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")":""):"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("名")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">"  + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")":""):"") +  "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("动")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")":""):"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("形")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")":""):"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("副")) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">"  + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")":""):"") +  "</font></span>");
								continue Here;
							} 
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?(etc.containsKey(cte.get(setOfi))?":("+etc.get(cte.get(setOfi))+")":""):"") +  "</font></span>");			 
						}
					}	
				data.setText(page.toString());
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();
			}
		});
		this.add(button); 
	}

	private void addTranslateButton() {
		DetaButton button =new DetaButton("英译");
		button.setBounds(5+105, 3, 100, 20);
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().equalsIgnoreCase("")) {
					return;
				}
				StringBuilder page = new StringBuilder();
				Iterator<String> iterator = analyzer.parserMixedString(text.getText().trim()).iterator();
				if(text.getSelectedText()!=null && !text.getSelectedText().trim().isEmpty()) {
					iterator = analyzer.parserMixedString(text.getSelectedText().trim()).iterator();
				}
				text.setSelectionStart(0);
				text.setSelectionEnd(0);
				Here:
					while(iterator.hasNext()) {
						String setOfi = iterator.next();
						if(pos.get(setOfi) == null) {
							page.append("<span style=\"background:#F1F1F1\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");
							continue Here;
						}
						if (!setOfi.equals("")) {
							if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
								page.append("<span style=\"background:red\"><font color=\"white\">" + setOfi +(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("名")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 245, 255)+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("动")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(245, 255, 245)+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("形")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 255, 245)+"\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("副")) {
								page.append("<span style=\"background:#F1FFFF\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");
								continue Here;
							} 
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">" + setOfi +(cte.containsKey(setOfi)?":("+cte.get(setOfi)+")":"") + "</font></span>");			 
						}
					}	
				data.setText(page.toString());
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();
			}
		});
		this.add(button); 
	}

	private void addOutputButton() {
		DetaButton button =new DetaButton("高亮");
		button.setBounds(5, 3, 100, 20);
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(text.getText().equalsIgnoreCase("")) {
					return;
				}
				StringBuilder page = new StringBuilder();
				Iterator<String> iterator = analyzer.parserMixedString(text.getText().trim()).iterator();
				if(text.getSelectedText()!=null && !text.getSelectedText().trim().isEmpty()) {
					iterator = analyzer.parserMixedString(text.getSelectedText().trim()).iterator();
				}
				text.setSelectionStart(0);
				text.setSelectionEnd(0);
				Here:
					while(iterator.hasNext()) {
						String setOfi = iterator.next();
						if(pos.get(setOfi) == null) {
							page.append("<span style=\"background:#818181\"><font color=\"black\" size=\"5\">" + setOfi + "</font></span>");
							continue Here;
						}
						if (!setOfi.equals("")) {
							if(key.contains(setOfi)&&(pos.get(setOfi).contains("名")||pos.get(setOfi).contains("动")||pos.get(setOfi).contains("形"))) {
								page.append("<span style=\"background:red\"><font color=\"white\">" + setOfi + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("名")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 145, 255)+"\"><font color=\"black\" size=\"5\">" + setOfi + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("动")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(145, 255, 145)+"\"><font color=\"black\" size=\"5\">" + setOfi + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("形")) {
								page.append("<span style=\"background:"+new imageProcessor.ColorProcessor().Processor(255, 255, 145)+"\"><font color=\"black\" size=\"5\">" + setOfi + "</font></span>");
								continue Here;
							}
							if(pos.get(setOfi).contains("副")) {
								page.append("<span style=\"background:#81FFFF\"><font color=\"black\" size=\"5\">" + setOfi + "</font></span>");
								continue Here;
							} 
							page.append("<span style=\"background:white\"><font color=\"black\" size=\"5\">" + setOfi + "</font></span>");			 
						}
					}	
				data.setText(page.toString());
				data.setSelectionStart(0);
				data.setSelectionEnd(0);
				data.validate();
			}	
		});
		this.add(button); 
	}

	protected int getPagesCount(String text) {
		int page=0;
		int position,count=0;
		String str=text;
		while(str.length()>0) {
			position=str.indexOf("\n");
			count +=1;
			if(position !=1) {
				str = str.substring(position + 1);
			}
			else {
				str="";
			}	
		}
		if(count>0) {
			page=count/54+1;
		}
		return page;
	}

	private JTextPane data() {
		data = new JTextPane();  
		data.setContentType("text/html");
		return data;
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
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
}