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

import sample.tag.search.CaiJPanel;
public class TagSearch extends ScrollPane implements MouseListener, KeyListener, ActionListener{	
	private static final long serialVersionUID= 1L;
	public void init(JTextField name){
		JTabbedPane jTabbedpane= new JTabbedPane();
		Container 多国语言Container= new Container();
		CaiJPanel 多国语言JPanel= new CaiJPanel(name);
		多国语言Container.setLayout(null);
		多国语言Container.setBounds(0, 0, 1490, 980);
		多国语言Container.add(多国语言JPanel);
		jTabbedpane.addTab("多国语言", new ImageIcon(), 多国语言Container, "做词汇的解释详细解释。");
		jTabbedpane.setMnemonicAt(0, KeyEvent.VK_0); 
		
		Container 猜猜我心Container= new Container();
		CaiJPanel 猜猜我心JPanel= new CaiJPanel(name);
		猜猜我心Container.setLayout(null);
		猜猜我心Container.setBounds(0, 0, 1490, 980);
		猜猜我心Container.add(猜猜我心JPanel);
		jTabbedpane.addTab("猜猜我心", new ImageIcon(), 猜猜我心Container, "猜猜我心");
		jTabbedpane.setMnemonicAt(1, KeyEvent.VK_1); 
		
		Container 在线搜索Container= new Container();
		CaiJPanel 在线搜索JPanel= new CaiJPanel(name);
		在线搜索Container.setLayout(null);
		在线搜索Container.setBounds(0, 0, 1490, 980);
		在线搜索Container.add(在线搜索JPanel);
		jTabbedpane.addTab("在线搜索", new ImageIcon(), 在线搜索Container, "在线搜索");
		jTabbedpane.setMnemonicAt(2, KeyEvent.VK_2); 
		
		Container 词语联想Container= new Container();
		CaiJPanel 词语联想JPanel= new CaiJPanel(name);
		词语联想Container.setLayout(null);
		词语联想Container.setBounds(0, 0, 1490, 980);
		词语联想Container.add(词语联想JPanel);
		jTabbedpane.addTab("词语联想", new ImageIcon(), 词语联想Container, "词语联想");
		jTabbedpane.setMnemonicAt(3, KeyEvent.VK_3); 
		
		Container 多国语音Container= new Container();
		CaiJPanel 多国语音JPanel= new CaiJPanel(name);
		多国语音Container.setLayout(null);
		多国语音Container.setBounds(0, 0, 1490, 980);
		多国语音Container.add(多国语音JPanel);
		jTabbedpane.addTab("多国语音", new ImageIcon(), 多国语音Container, "多国语音");
		jTabbedpane.setMnemonicAt(4, KeyEvent.VK_4);
		
		this.setPreferredSize(new Dimension(450, 300));
		this.add(jTabbedpane);
		this.setBounds(0, 0, 455, 305);
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