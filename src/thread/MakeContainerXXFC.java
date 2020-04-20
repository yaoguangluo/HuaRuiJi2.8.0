package thread;
import java.awt.Container;
import java.io.IOException;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;

import org.tinos.engine.analysis.Analyzer;

import sample.App3;
import sample.fckx.fckx;
public class MakeContainerXXFC extends Thread implements Runnable{
	public Container jpanelSecond;
	public App3 u;
	public JTabbedPane jTabbedpane;
	public String[] tabNames;
	public Analyzer analyzer;
	public Map<String, String> pos;
	public Map<String, String> pose;
	public Map<String, String> etc;
	public Map<String, String> cte;
	public MakeContainerXXFC(Analyzer analyzer, App3 u2, JTabbedPane jTabbedpane, String[] tabNames, Map<String, String> pos, Map<String, String> pose, Map<String, String> etc, Map<String, String> cte) {
		super();
		this.u = u2;
		this.tabNames = tabNames;
		this.jTabbedpane = jTabbedpane;
		this.analyzer = analyzer;
		this.pos = pos;
		this.pose = pose;
		this.etc = etc;
		this.cte = cte;
	}
	public void run(){ 
		try {
			jTabbedpane.validate();
			Thread.sleep(1000*30);
			u.jpanel11 = new fckx(u.text, this.analyzer, pos, pose, etc, cte, jTabbedpane, u);
			jTabbedpane.addTab(tabNames[10],new ImageIcon() , u.jpanel11, "西医妇产科学");// 加入第一个页面  
			jTabbedpane.validate();
		} catch (InterruptedException e) {
			jTabbedpane.validate();
		} catch (IOException e) {
			jTabbedpane.validate();
		}
	}
}