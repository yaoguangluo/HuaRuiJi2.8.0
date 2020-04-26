package thread;
import java.awt.Container;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import org.tinos.engine.analysis.Analyzer;
import sample.AppBoot;
import sample.editPane.EditPane;
public class MakeContainerBianJiYe extends Thread implements  Runnable{
	public Container jpanelSecond;
	public AppBoot u;
    public JTabbedPane jTabbedpane;
    public String[] tabNames;
    public Analyzer analyzer;
    public Map<String, String> pos;
   	public Map<String, String> pose;
   	public Map<String, String> etc;
   	public Map<String, String> cte;
	private Map<String, String> pinyin;
	private Map<String, String> ctj;
	private Map<String, String> ctk;
	private Map<String, String> ctt;
	private Map<String, String> ctr;
	public MakeContainerBianJiYe(Analyzer analyzer, AppBoot u2, JTabbedPane jTabbedpane
			, String[] tabNames, Map<String, String> pos, Map<String, String> pose
			, Map<String, String> etc, Map<String, String> cte, Map<String, String> pinyin
			, Map<String, String> ctj, Map<String, String> ctt, Map<String, String> ctk, Map<String, String> ctr) {
		super();
		this.u = u2;
		this.tabNames = tabNames;
		this.jTabbedpane = jTabbedpane;
		this.analyzer = analyzer;
		this.pos = pos;
		this.pose = pose;
		this.etc = etc;
		this.cte = cte;
		this.ctj = ctj;
		this.ctk = ctk;
		this.ctt = ctt;
		this.ctr = ctr;
		this.pinyin= pinyin;
	}
	public void run(){ 
		try {
			jTabbedpane.validate();
			Thread.sleep(1000*55);
			u.jpanel16 = new EditPane(u.text, this.analyzer,pos, pose, etc, cte, pinyin, ctk, ctt, ctj, ctr); 	
			jTabbedpane.addTab(tabNames[15],new ImageIcon() , u.jpanel16, "编辑页");// 加入第一个页面  
		//	new restServer(this.u).start();
			jTabbedpane.validate();
		} catch (InterruptedException e) {
			jTabbedpane.validate();
		}
	}
}