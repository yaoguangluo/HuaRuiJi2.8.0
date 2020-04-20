package sample;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import sample.app.search.ChanJPanel;
import sample.app.search.ChouchuJPanel;
import sample.app.search.ChuangJPanel;
import sample.app.search.DuJPanel;
import sample.app.search.HanJPanel;
import sample.app.search.KuangJPanel;
import sample.app.search.PaixieJPanel;
import sample.app.search.QitaJPanel;
import sample.app.search.ReJPanel;
import sample.app.search.TanJPanel;
import sample.app.search.TongJPanel;
import sample.app.search.XueJPanel;
import sample.app.search.YangJPanel;
public class AppSearch extends ScrollPane implements MouseListener, KeyListener, ActionListener{	
	private static final long serialVersionUID= 1L;
	
	public void init(JTextField name){
		JTabbedPane jTabbedpane= new JTabbedPane();
		Container HanContainer= new Container();
		HanJPanel hanJPanel= new HanJPanel(name);
		HanContainer.setLayout(null);
		HanContainer.setBounds(0, 0, 1490, 980);
		HanContainer.add(hanJPanel);
		jTabbedpane.addTab("·¢Àä", new ImageIcon(), HanContainer, "·¢Àä");
		jTabbedpane.setMnemonicAt(0, KeyEvent.VK_0); 
		
		Container reContainer= new Container();
		ReJPanel reJPanel= new ReJPanel(name);
		reContainer.setLayout(null);
		reContainer.setBounds(0, 0, 1490, 980);
		reContainer.add(reJPanel);
		jTabbedpane.addTab("·¢ÈÈ", new ImageIcon(), reContainer, "·¢ÈÈ");
		jTabbedpane.setMnemonicAt(1, KeyEvent.VK_1); 
		
		Container TongContainer= new Container();
		TongJPanel tongPanel= new TongJPanel(name);
		TongContainer.setLayout(null);
		TongContainer.setBounds(0, 0, 1490, 980);
		TongContainer.add(tongPanel);
		jTabbedpane.addTab("ÌÛÍ´", new ImageIcon(), TongContainer, "ÌÛÍ´");
		jTabbedpane.setMnemonicAt(2, KeyEvent.VK_2); 
		
		Container chouContainer= new Container();
		ChouchuJPanel chouJPanel= new ChouchuJPanel(name);
		chouContainer.setLayout(null);
		chouContainer.setBounds(0, 0, 1490, 980);
		chouContainer.add(chouJPanel);
		jTabbedpane.addTab("³é½î", new ImageIcon(), chouContainer, "³é½î");
		jTabbedpane.setMnemonicAt(3, KeyEvent.VK_3); 
		
		Container duContainer= new Container();
		DuJPanel duJPanel= new DuJPanel(name);
		duContainer.setLayout(null);
		duContainer.setBounds(0, 0, 1490, 980);
		duContainer.add(duJPanel);
		jTabbedpane.addTab("ÖÐ¶¾", new ImageIcon(), duContainer, "ÖÐ¶¾");
		jTabbedpane.setMnemonicAt(4, KeyEvent.VK_4); 
		
		Container chuangContainer= new Container();
		ChuangJPanel chuangJPanel= new ChuangJPanel(name);
		chuangContainer.setLayout(null);
		chuangContainer.setBounds(0, 0, 1490, 980);
		chuangContainer.add(chuangJPanel);
		jTabbedpane.addTab("Å§´¯", new ImageIcon(), chuangContainer, "Å§´¯");
		jTabbedpane.setMnemonicAt(5, KeyEvent.VK_5); 
		
		Container kuangContainer= new Container();
		KuangJPanel kuangJPanel= new KuangJPanel(name);
		kuangContainer.setLayout(null);
		kuangContainer.setBounds(0, 0, 1490, 980);
		kuangContainer.add(kuangJPanel);
		jTabbedpane.addTab("ñ²¿ñ", new ImageIcon(), kuangContainer, "ñ²¿ñ");
		jTabbedpane.setMnemonicAt(6, KeyEvent.VK_6); 
		
		Container paixieContainer= new Container();
		PaixieJPanel paixieJPanel= new PaixieJPanel(name);
		paixieContainer.setLayout(null);
		paixieContainer.setBounds(0, 0, 1490, 980);
		paixieContainer.add(paixieJPanel);
		jTabbedpane.addTab("ÅÅÐ¹", new ImageIcon(), paixieContainer, "ÅÅÐ¹");
		jTabbedpane.setMnemonicAt(7, KeyEvent.VK_7); 
		
		Container TanContainer= new Container();
		TanJPanel tanJPanel= new TanJPanel(name);
		TanContainer.setLayout(null);
		TanContainer.setBounds(0, 0, 1490, 980);
		TanContainer.add(tanJPanel);
		jTabbedpane.addTab("Ìµº¹", new ImageIcon(), TanContainer, "Ìµº¹");
		jTabbedpane.setMnemonicAt(8, KeyEvent.VK_8); 
		
		Container xueContainer= new Container();
		XueJPanel xueJPanel= new XueJPanel(name);
		xueContainer.setLayout(null);
		xueContainer.setBounds(0, 0, 1490, 980);
		xueContainer.add(xueJPanel);
		jTabbedpane.addTab("³öÑª", new ImageIcon(), xueContainer, "³öÑª");
		jTabbedpane.setMnemonicAt(9, KeyEvent.VK_9); 
		
		Container yangContainer= new Container();
		YangJPanel yangJPanel= new YangJPanel(name);
		yangContainer.setLayout(null);
		yangContainer.setBounds(0, 0, 1490, 980);
		yangContainer.add(yangJPanel);
		jTabbedpane.addTab("ðþÑ÷", new ImageIcon(), yangContainer, "ðþÑ÷");
		
		Container fuchanContainer= new Container();
		ChanJPanel fuchanJPanel= new ChanJPanel(name);
		fuchanContainer.setLayout(null);
		fuchanContainer.setBounds(0, 0, 1490, 980);
		fuchanContainer.add(fuchanJPanel);
		jTabbedpane.addTab("¸¾²ú", new ImageIcon(), fuchanContainer, "¸¾²ú");
		
		Container qitaContainer= new Container();
		QitaJPanel qitaJPanel= new QitaJPanel(name);
		qitaContainer.setLayout(null);
		qitaContainer.setBounds(0, 0, 1490, 980);
		qitaContainer.add(qitaJPanel);
		jTabbedpane.addTab("ÆäËû", new ImageIcon(), qitaContainer, "ÆäËû");
		
		this.setPreferredSize(new Dimension(800, 600));
		this.add(jTabbedpane);
		this.setBounds(0, 0, 805, 605);
		this.setVisible(true);
		this.validate();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
		
}