package thread;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.Map;

import javax.swing.Box;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import org.tinos.engine.analysis.Analyzer;
import sample.AppBoot;
import semaphone.TaskMakeCoWorker;
public class MakeContainer_ZHONG_YAO extends Thread implements Runnable{
	public Container jpanelFirst;
	public AppBoot u;
	public JTabbedPane jTabbedpane;
	public String[] tabNames;
	public Box buttonBox;
	public Analyzer analyzer;
	public Map<String, String> pos;
	public TaskMakeCoWorker taskMakeCoWorker;
	public MakeContainer_ZHONG_YAO(Analyzer analyzer,Container jpanelFirst, AppBoot u2, String[] tabNames
			, Map<String, String> pos) throws IOException {
		super();
		this.jpanelFirst= jpanelFirst;
		this.u= u2;
		this.tabNames= tabNames;
		this.analyzer= analyzer;
		this.pos= pos;
		jpanelFirst.setLayout(null);
		jpanelFirst.setBounds(0, 0, 1490, 980);
		JScrollPane jsp_table= null;
		jsp_table= new JScrollPane(u.jTable());
		jsp_table.setBounds(5, 80-80, 1440-130, 200+120+50-135);
		jpanelFirst.add(jsp_table);  
	}
	public void start(){ 
		try {
			JScrollPane jsp_data= null;
			jsp_data= new JScrollPane(u.data());
			jsp_data.setBounds(5, 290+ 100- 65+ 50- 215+ 80+ 25, 397, 230);
			u.panel.setSize(500, 500);
			u.panel.setBackground(Color.white);
			u.panel.setLayout(new GridLayout(1, 1));
			JScrollPane jsp_jingmai= new JScrollPane(u.panel);
			jsp_jingmai.setBounds(405, 290+ 100- 65+ 50- 215+ 80, 285, 255);
			jsp_jingmai.setBackground(Color.white);
			JScrollPane jsp_yaotu= null;
			jsp_yaotu= new JScrollPane(u.panel());
			jsp_yaotu.setBounds(5, 600+ 100- 65+ 50- 215+ 25+ 3, 685, 182);	
			jsp_yaotu.setBackground(Color.white);
			buttonBox= u.getBox();
			buttonBox.setBackground(Color.white);
			buttonBox.setBounds(5, 290+ 100- 65+ 50- 215+ 80, 398, 22);
			jpanelFirst.add(jsp_yaotu);  
			jpanelFirst.add(jsp_jingmai);    
			jpanelFirst.add(jsp_data);  
			jpanelFirst.add(buttonBox);  
			jpanelFirst.validate();
			taskMakeCoWorker= new TaskMakeCoWorker(u, jpanelFirst,analyzer,pos);
			taskMakeCoWorker.start();
		}catch(Exception e) {
			jTabbedpane.validate();
		}
	}
}