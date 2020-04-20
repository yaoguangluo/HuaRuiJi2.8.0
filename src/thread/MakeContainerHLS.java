package thread;
import java.awt.Container;
import java.io.IOException;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import org.tinos.engine.analysis.Analyzer;
import sample.App3;
import sample.cecil.cecil;
public class MakeContainerHLS extends Thread implements Runnable{
	public Container jpanelSecond;
	public App3 u;
	public JTabbedPane jTabbedpane;
	public String[] tabNames;
	public Analyzer analyzer;
	public Map<String, String> pos;
	public Map<String, String> pose;
	public Map<String, String> etc;
	public Map<String, String> cte;
	public Map<String, String> posec;
	public Map<String, String> posFullec;
	public MakeContainerHLS(Analyzer analyzer,App3 u2, JTabbedPane jTabbedpane, String[] tabNames
			, Map<String, String> pos, Map<String, String> pose, Map<String, String> etc
			, Map<String, String> cte, Map<String, String> posec, Map<String, String> posFullec) {
		super();
		this.u = u2;
		this.tabNames = tabNames;
		this.jTabbedpane = jTabbedpane;
		this.analyzer = analyzer;
		this.pos = pos;
		this.pose = pose;
		this.etc = etc;
		this.cte = cte;
		this.posec = posec;
		this.posFullec = posFullec;
	}
	public void run(){ 
		try {
			jTabbedpane.validate();
			Thread.sleep(1000*70);
			u.jpanel17 = new cecil(u.text, this.analyzer, pos, pose, etc, cte, posec, posFullec);
			jTabbedpane.addTab(tabNames[16],new ImageIcon() , u.jpanel17, "哈里森大内科英文版");// 加入第一个页面  
			jTabbedpane.validate();
		} catch (IOException e) {
			jTabbedpane.validate();
		} catch (InterruptedException e) {
			jTabbedpane.validate();
		} 	
	}
}