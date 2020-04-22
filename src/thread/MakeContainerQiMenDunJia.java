package thread;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import comp.jbutton.DetaButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import org.tinos.engine.analysis.Analyzer;
import sample.AppBoot;
public class MakeContainerQiMenDunJia extends Thread implements Runnable{
	public Container jpanel5;
	public AppBoot u;
	public JTabbedPane jTabbedpane;
	public String[] tabNames;
	public Analyzer analyzer;
	public JPanel panel_bg;
	public Map<String, String> pos;
	public MakeContainerQiMenDunJia(Analyzer analyzer,Container jpanel5, AppBoot u2, JTabbedPane jTabbedpane
			, String[] tabNames,  Map<String, String> pos, Map<String, String> pose, Map<String, String> etc
			, Map<String, String> cte) {
		super();
		this.u= u2;
		this.tabNames= tabNames;
		this.jTabbedpane= jTabbedpane;
		this.jpanel5= jpanel5;
		this.analyzer= analyzer;
		this.pos= pos;
	}
	public void run(){ 
		try {
			jTabbedpane.validate();
			Thread.sleep(1000*5);
			JPanel panel_bg = new JPanel(); 
			panel_bg.setSize(460, 460);
			JLabel label88 = new JLabel(u.png88);
			//u.panel.setLayout(new GridLayout(20, 1));
			panel_bg.add(label88);
			JScrollPane jsp_bagua = new JScrollPane(panel_bg);
			jsp_bagua.setBounds(10, 60, 630, 410);

			JPanel panel_shun = new JPanel(); 
			panel_shun.setSize(460, 460);
			JLabel jshun = new JLabel(u.shun);
			//u.panel.setLayout(new GridLayout(20, 1));
			panel_shun.add(jshun);
			JScrollPane jsp_shun = new JScrollPane(panel_shun);
			jsp_shun.setBounds(10, 10+410+40+20, 630,190);

			JPanel panel_wsp = new JPanel(); 
			panel_wsp.setSize(460, 460);
			JLabel jwsp = new JLabel(u.wsp);
			//u.panel.setLayout(new GridLayout(20, 1));
			panel_wsp.add(jwsp);
			JScrollPane jsp_wsp = new JScrollPane(panel_wsp);
			jsp_wsp.setBounds(650, 10, 320,320);


			JPanel panel_wxp = new JPanel(); 
			panel_wxp.setSize(460, 460);
			JLabel jwxp = new JLabel(u.wxp);
		//	u.panel.setLayout(new GridLayout(20, 1));
			panel_wxp.add(jwxp);
			JScrollPane jsp_wxp = new JScrollPane(panel_wxp);
			jsp_wxp.setBounds(650+320+20, 10, 320, 320);

			JPanel panel_qp4 = new JPanel(); 
			panel_qp4.setSize(360, 360);
			JLabel jqp4 = new JLabel(u.qp4);
			u.panel.setLayout(new GridLayout(13, 1));
			panel_qp4.add(jqp4);
			JScrollPane jsp_qp4 = new JScrollPane(panel_qp4);
			jsp_qp4.setBounds(650, 10+320+20, 320, 320);

			JPanel panel_wwp = new JPanel(); 
			panel_wwp.setSize(460, 460);
			JLabel jwwp = new JLabel(u.wwp);
		//	u.panel.setLayout(new GridLayout(20, 1));
			panel_wwp.add(jwwp);
			JScrollPane jsp_wwp = new JScrollPane(panel_wwp);
			jsp_wwp.setBounds(650+320+20, 10+320+20, 320,320);


			Box buttonVecBox = new Box(BoxLayout.X_AXIS); 
			buttonVecBox.setBounds(10, 10, 630, 22);
			DetaButton bt_skch = new DetaButton("生克乘诲");
			bt_skch.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
							JLabel label88 = new JLabel(u.bagua_skch);
							panel_bg.removeAll();
							panel_bg.add(label88);
							panel_bg.validate();
						}
					});


			DetaButton bt_bgxs = new DetaButton("卦子象数");
			bt_bgxs.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
							JLabel label88 = new JLabel(u.bagua_gzxs);
							panel_bg.removeAll();
							panel_bg.add(label88);
							panel_bg.validate();
						}
					});
			buttonVecBox.add(bt_bgxs);

			DetaButton bt_bgbz = new DetaButton("八纲辨证");
			bt_bgbz.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
							JLabel label88 = new JLabel(u.bagua_bgbz);
							panel_bg.removeAll();
							panel_bg.add(label88);
							panel_bg.validate();	
						}
					});

			DetaButton bt_ljbz = new DetaButton("六经辨证");
			bt_ljbz.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
							JLabel label88 = new JLabel(u.bagua_ljbz);
							panel_bg.removeAll();
							panel_bg.add(label88);
							panel_bg.validate();	
						}
					});

			DetaButton bt_sjbz = new DetaButton("三焦辨证");
			bt_sjbz.addActionListener(
					new ActionListener(){    
						public void actionPerformed(ActionEvent e){
							JLabel label88 = new JLabel(u.bagua_sjbz);
							panel_bg.removeAll();
							panel_bg.add(label88);
							panel_bg.validate();	
						}
					});

			DetaButton bt_qxbz = new DetaButton("气血辨证");
			bt_qxbz.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
							JLabel label88 = new JLabel(u.bagua_qxbz);
							panel_bg.removeAll();
							panel_bg.add(label88);
							panel_bg.validate();	
						}
					});
			DetaButton bt_jlbz = new DetaButton("河洛天星");
			bt_jlbz.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
							JLabel label88 = new JLabel(u.png88);
							panel_bg.removeAll();
							panel_bg.add(label88);
							panel_bg.validate();	
						}
					});

			buttonVecBox.add(bt_bgbz);

			buttonVecBox.add(bt_ljbz);
			buttonVecBox.add(bt_sjbz);
			buttonVecBox.add(bt_qxbz);
			buttonVecBox.add(bt_jlbz);

			buttonVecBox.add(bt_skch);
			buttonVecBox.add(bt_bgxs);

			jpanel5.add(buttonVecBox);
			jpanel5.add(jsp_bagua);
			jpanel5.add(jsp_wwp);
			jpanel5.add(jsp_wxp);
			jpanel5.add(jsp_wsp);
			jpanel5.add(jsp_qp4);
			jpanel5.add(jsp_shun);
			jpanel5.setLayout(null);
			jpanel5.setBounds(0, 0, 1490, 980);
			jTabbedpane.addTab(tabNames[4],new ImageIcon() , jpanel5, "奇门遁甲");// 加入第一个页面  
			jTabbedpane.validate();
		} catch (InterruptedException e) {
			jTabbedpane.validate();
		}
	}
}