package sample.tag.search;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CaiJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CaiJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);
//		//copy tab
		JLabel 词语中文= new JLabel("词语中文：之后这里横向扩展一个应用面 @^_^@ ");  
		词语中文.setForeground(Color.orange);
		词语中文.setBounds(10, 5, 400, 50);
		this.add(词语中文);
		
		JLabel 中文拼音= new JLabel("中文拼音：之后这里横向扩展一个应用面 @^_^@ ");  
		中文拼音.setForeground(Color.WHITE);
		中文拼音.setBounds(10, 5+ 25, 400, 50);
		this.add(中文拼音);

		JLabel 词语解释= new JLabel("词语解释：之后这里横向扩展一个应用面 @^_^@ ");  
		词语解释.setForeground(Color.WHITE);
		词语解释.setBounds(10, 5+ 50, 400, 50);
		this.add(词语解释);
		
		JLabel 词语翻译= new JLabel("词语翻译：之后这里横向扩展一个应用面 @^_^@ ");  
		词语翻译.setForeground(Color.WHITE);
		词语翻译.setBounds(10, 5+ 75, 400, 50);
		this.add(词语翻译);
		
		JLabel 同义词语= new JLabel("同义词语：之后这里横向扩展一个应用面 @^_^@ ");  
		同义词语.setForeground(Color.WHITE);
		同义词语.setBounds(10, 5+ 100, 400, 50);
		this.add(同义词语);
		
		JLabel 反义词语= new JLabel("反义词语：之后这里横向扩展一个应用面 @^_^@ ");  
		反义词语.setForeground(Color.WHITE);
		反义词语.setBounds(10, 5+ 125, 400, 50);
		this.add(反义词语);
		
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