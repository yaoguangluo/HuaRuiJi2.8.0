package sample.app.search;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ChanJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ChanJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);
		//copy tab
		JLabel 停经= new JLabel("停经:");  
		停经.setForeground(Color.WHITE);
		停经.setBounds(10+110+110+440, 20+0, 100, 50);
		JCheckBox 停经_box= new JCheckBox();
		停经_box.setBounds(10+60+110+110+440, 33+0, 20, 20);
		停经_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(停经_box.isSelected()) {
					if(!name.getText().contains("停经")) {
						name.setText(name.getText()+" 停经");
					}
				}else {
					if(name.getText().contains("停经")) {
						name.setText(name.getText().replace("停经", ""));
					}
				}
				
			}
		});
		this.add(停经);
		this.add(停经_box);	
		
		//copy tab
		JLabel 少经= new JLabel("少经:");  
		少经.setForeground(Color.WHITE);
		少经.setBounds(10+110+110+440, 20+25, 100, 50);
		JCheckBox 少经_box= new JCheckBox();
		少经_box.setBounds(10+60+110+110+440, 33+25, 20, 20);
		少经_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(少经_box.isSelected()) {
					if(!name.getText().contains("少经")) {
						name.setText(name.getText()+" 少经");
					}
				}else {
					if(name.getText().contains("少经")) {
						name.setText(name.getText().replace("少经", ""));
					}
				}
				
			}
		});
		this.add(少经);
		this.add(少经_box);	
		//copy tab
		JLabel 月经不调= new JLabel("月经不调:");  
		月经不调.setForeground(Color.WHITE);
		月经不调.setBounds(10+110+110+440, 20+75, 100, 50);
		JCheckBox 月经不调_box= new JCheckBox();
		月经不调_box.setBounds(10+60+110+110+440, 33+75, 20, 20);
		月经不调_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(月经不调_box.isSelected()) {
					if(!name.getText().contains("月经不调")) {
						name.setText(name.getText()+" 月经不调");
					}
				}else {
					if(name.getText().contains("月经不调")) {
						name.setText(name.getText().replace("月经不调", ""));
					}
				}
				
			}
		});
		this.add(月经不调);
		this.add(月经不调_box);	
		//copy tab
		JLabel 经血过多= new JLabel("经血过多:");  
		经血过多.setForeground(Color.WHITE);
		经血过多.setBounds(10+110+110+440, 20+100, 100, 50);
		JCheckBox 经血过多_box= new JCheckBox();
		经血过多_box.setBounds(10+60+110+110+440, 33+100, 20, 20);
		经血过多_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(经血过多_box.isSelected()) {
					if(!name.getText().contains("经血过多")) {
						name.setText(name.getText()+" 经血过多");
					}
				}else {
					if(name.getText().contains("经血过多")) {
						name.setText(name.getText().replace("经血过多", ""));
					}
				}
				
			}
		});
		this.add(经血过多);
		this.add(经血过多_box);	
		
		//copy tab
		JLabel 痛经= new JLabel("痛经:");  
		痛经.setForeground(Color.WHITE);
		痛经.setBounds(10+110+110+440, 20+125, 100, 50);
		JCheckBox 痛经_box= new JCheckBox();
		痛经_box.setBounds(10+60+110+110+440, 33+125, 20, 20);
		痛经_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(痛经_box.isSelected()) {
					if(!name.getText().contains("痛经")) {
						name.setText(name.getText()+" 痛经");
					}
				}else {
					if(name.getText().contains("痛经")) {
						name.setText(name.getText().replace("痛经", ""));
					}
				}
				
			}
		});
		this.add(痛经);
		this.add(痛经_box);	
		//copy tab
		JLabel 繁乱经期= new JLabel("繁乱经期:");  
		繁乱经期.setForeground(Color.WHITE);
		繁乱经期.setBounds(10+110+110+440, 20+150, 100, 50);
		JCheckBox 繁乱经期_box= new JCheckBox();
		繁乱经期_box.setBounds(10+60+110+110+440, 33+150, 20, 20);
		繁乱经期_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(繁乱经期_box.isSelected()) {
					if(!name.getText().contains("不规则经期")) {
						name.setText(name.getText()+" 不规则经期");
					}
				}else {
					if(name.getText().contains("不规则经期")) {
						name.setText(name.getText().replace("不规则经期", ""));
					}
				}
				
			}
		});
		this.add(繁乱经期);
		this.add(繁乱经期_box);	
		//copy tab
		JLabel 怀孕= new JLabel("怀孕:");  
		怀孕.setForeground(Color.WHITE);
		怀孕.setBounds(10+110+110+440, 20+175, 100, 50);
		JCheckBox 怀孕_box= new JCheckBox();
		怀孕_box.setBounds(10+60+110+110+440, 33+175, 20, 20);
		怀孕_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(怀孕_box.isSelected()) {
					if(!name.getText().contains("怀孕")) {
						name.setText(name.getText()+" 怀孕");
					}
				}else {
					if(name.getText().contains("怀孕")) {
						name.setText(name.getText().replace("怀孕", ""));
					}
				}
				
			}
		});
		this.add(怀孕);
		this.add(怀孕_box);	
		//copy tab
		JLabel 难产= new JLabel("难产:");  
		难产.setForeground(Color.WHITE);
		难产.setBounds(10+110+110+440, 20+200, 100, 50);
		JCheckBox 难产_box= new JCheckBox();
		难产_box.setBounds(10+60+110+110+440, 33+200, 20, 20);
		难产_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(难产_box.isSelected()) {
					if(!name.getText().contains("难产")) {
						name.setText(name.getText()+" 难产");
					}
				}else {
					if(name.getText().contains("难产")) {
						name.setText(name.getText().replace("难产", ""));
					}
				}
				
			}
		});
		this.add(难产);
		this.add(难产_box);	
		//copy tab
		JLabel 带下= new JLabel("带下:");  
		带下.setForeground(Color.WHITE);
		带下.setBounds(10+110+110+440, 20+225, 100, 50);
		JCheckBox 带下_box= new JCheckBox();
		带下_box.setBounds(10+60+110+110+440, 33+225, 20, 20);
		带下_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(带下_box.isSelected()) {
					if(!name.getText().contains("带下")) {
						name.setText(name.getText()+" 带下");
					}
				}else {
					if(name.getText().contains("带下")) {
						name.setText(name.getText().replace("带下", ""));
					}
				}
				
			}
		});
		this.add(带下);
		this.add(带下_box);	
		//copy tab
		JLabel 流产= new JLabel("流产:");  
		流产.setForeground(Color.WHITE);
		流产.setBounds(10, 20, 100, 50);
		JCheckBox 流产_box= new JCheckBox();
		流产_box.setBounds(10+60, 33, 20, 20);
		流产_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(流产_box.isSelected()) {
					if(!name.getText().contains("流产")) {
						name.setText(name.getText()+" 流产");
					}
				}else {
					if(name.getText().contains("流产")) {
						name.setText(name.getText().replace("流产", ""));
					}
				}
				
			}
		});
		this.add(流产);
		this.add(流产_box);	
		//copy tab
		JLabel 少乳= new JLabel("少乳:");  
		少乳.setForeground(Color.WHITE);
		少乳.setBounds(10, 20+25, 100, 50);
		JCheckBox 少乳_box= new JCheckBox();
		少乳_box.setBounds(10+60, 33+25, 20, 20);
		少乳_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(少乳_box.isSelected()) {
					if(!name.getText().contains("少乳")) {
						name.setText(name.getText()+" 少乳");
					}
				}else {
					if(name.getText().contains("少乳")) {
						name.setText(name.getText().replace("少乳", ""));
					}
				}
				
			}
		});
		this.add(少乳);
		this.add(少乳_box);	
		//copy tab
		JLabel 早产= new JLabel("早产:");  
		早产.setForeground(Color.WHITE);
		早产.setBounds(10, 20+25+25, 100, 50);
		JCheckBox 早产_box= new JCheckBox();
		早产_box.setBounds(10+60, 33+25+25, 20, 20);
		早产_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(早产_box.isSelected()) {
					if(!name.getText().contains("早产")) {
						name.setText(name.getText()+" 早产");
					}
				}else {
					if(name.getText().contains("早产")) {
						name.setText(name.getText().replace("早产", ""));
					}
				}
				
			}
		});
		this.add(早产);
		this.add(早产_box);	
		//copy tab
		JLabel 晚产= new JLabel("晚产:");  
		晚产.setForeground(Color.WHITE);
		晚产.setBounds(10, 20+25+25+25, 100, 50);
		JCheckBox 晚产_box= new JCheckBox();
		晚产_box.setBounds(10+60, 33+25+25+25, 20, 20);
		晚产_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(晚产_box.isSelected()) {
					if(!name.getText().contains("晚产")) {
						name.setText(name.getText()+" 晚产");
					}
				}else {
					if(name.getText().contains("晚产")) {
						name.setText(name.getText().replace("晚产", ""));
					}
				}
				
			}
		});
		this.add(晚产);
		this.add(晚产_box);	
		//copy tab
		JLabel 安胎= new JLabel("安胎:");  
		安胎.setForeground(Color.WHITE);
		安胎.setBounds(10, 20+25+25+25+25, 100, 50);
		JCheckBox 安胎_box= new JCheckBox();
		安胎_box.setBounds(10+60, 33+25+25+25+25, 20, 20);
		安胎_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(安胎_box.isSelected()) {
					if(!name.getText().contains("安胎")) {
						name.setText(name.getText()+" 安胎");
					}
				}else {
					if(name.getText().contains("安胎")) {
						name.setText(name.getText().replace("安胎", ""));
					}
				}
				
			}
		});
		this.add(安胎);
		this.add(安胎_box);	
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