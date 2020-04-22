package thread;
import java.awt.Container;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;

import org.LYG.GUI.Flash.GUISample;
import org.tinos.engine.analysis.Analyzer;
import sample.AppBoot;
public class MakeContainerShuJuFenXi extends Thread implements Runnable{
	public Container jpanelSecond;
	public AppBoot u;
	public JTabbedPane jTabbedpane;
	public String[] tabNames;
	public Analyzer analyzer;
	public Map<String, String> pos;
	public Map<String, String> pose;
	public Map<String, String> etc;
	public Map<String, String> cte;
	public Object[][] tableData_old;
	public JTextPane text;
	public MakeContainerShuJuFenXi(Object[][] tableData_old, JTextPane text
			, Analyzer analyzer,Container jpanelSecond, AppBoot u2
			, JTabbedPane jTabbedpane, String[] tabNames, Map<String, String> pos
			, Map<String, String> pose, Map<String, String> etc, Map<String, String> cte) {
		super();
		this.jpanelSecond = jpanelSecond;
		this.u = u2;
		this.tabNames = tabNames;
		this.jTabbedpane = jTabbedpane;
		this.analyzer = analyzer;
		this.pos = pos;
		this.pose = pose;
		this.etc = etc;
		this.cte = cte;
		this.text = text;
		this.tableData_old = tableData_old;
	}
	public void run(){ 
		try {
			jTabbedpane.validate();
			Thread.sleep(1000* 75);
			jpanelSecond.setBounds(0, 0, 1490, 980);
			GUISample NE= new GUISample();
			NE.init(this.tableData_old,this.text);
			NE.start();
			jpanelSecond.add(NE);
			jTabbedpane.addTab(tabNames[1], new ImageIcon(), jpanelSecond, "数据分析");// 加入第一个页面  
			NE.validate();
			jTabbedpane.validate();
		//	u.validate();
		} catch (InterruptedException e) {
			jTabbedpane.validate();
		}
	}
}