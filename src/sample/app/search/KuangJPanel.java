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

public class KuangJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public KuangJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);
		//copy tab
		JLabel 诳语= new JLabel("诳语:");  
		诳语.setForeground(Color.WHITE);
		诳语.setBounds(10+110+110, 20+350, 100, 50);
		JCheckBox 诳语_box= new JCheckBox();
		诳语_box.setBounds(10+60+110+110, 33+350, 20, 20);
		诳语_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(诳语_box.isSelected()) {
					if(!name.getText().contains("诳语")) {
						name.setText(name.getText()+" 诳语");
					}
				}else {
					if(name.getText().contains("诳语")) {
						name.setText(name.getText().replace("诳语", ""));
					}
				}
				
			}
		});
		this.add(诳语);
		this.add(诳语_box);	
				//copy tab
				JLabel 心烦= new JLabel("心烦:");  
				心烦.setForeground(Color.WHITE);
				心烦.setBounds(10+110+110+440, 20+250, 100, 50);
				JCheckBox 心烦_box= new JCheckBox();
				心烦_box.setBounds(10+60+110+110+440, 33+250, 20, 20);
				心烦_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(心烦_box.isSelected()) {
							if(!name.getText().contains("心烦")) {
								name.setText(name.getText()+" 心烦");
							}
						}else {
							if(name.getText().contains("心烦")) {
								name.setText(name.getText().replace("心烦", ""));
							}
						}
						
					}
				});
				this.add(心烦);
				this.add(心烦_box);	
				//copy tab
				JLabel 脾气暴烈= new JLabel("脾气暴烈:");  
				脾气暴烈.setForeground(Color.WHITE);
				脾气暴烈.setBounds(10+110+110+220, 20+300, 100, 50);
				JCheckBox 脾气暴烈_box= new JCheckBox();
				脾气暴烈_box.setBounds(10+60+110+110+220, 33+300, 20, 20);
				脾气暴烈_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(脾气暴烈_box.isSelected()) {
							if(!name.getText().contains("脾气暴烈")) {
								name.setText(name.getText()+" 脾气暴烈");
							}
						}else {
							if(name.getText().contains("脾气暴烈")) {
								name.setText(name.getText().replace("脾气暴烈", ""));
							}
						}
						
					}
				});
				this.add(脾气暴烈);
				this.add(脾气暴烈_box);	
				//copy tab
				JLabel 易怒= new JLabel("易怒:");  
				易怒.setForeground(Color.WHITE);
				易怒.setBounds(10+110+110+440, 20+425, 100, 50);
				JCheckBox 易怒_box= new JCheckBox();
				易怒_box.setBounds(10+60+110+110+440, 33+425, 20, 20);
				易怒_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(易怒_box.isSelected()) {
							if(!name.getText().contains("易怒")) {
								name.setText(name.getText()+" 易怒");
							}
						}else {
							if(name.getText().contains("易怒")) {
								name.setText(name.getText().replace("易怒", ""));
							}
						}
						
					}
				});
				this.add(易怒);
				this.add(易怒_box);	
				//copy tab
				JLabel 狂笑= new JLabel("狂笑:");  
				狂笑.setForeground(Color.WHITE);
				狂笑.setBounds(10+110+110+110, 20, 100, 50);
				JCheckBox 狂笑_box= new JCheckBox();
				狂笑_box.setBounds(10+60+110+110+110, 33, 20, 20);
				狂笑_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(狂笑_box.isSelected()) {
							if(!name.getText().contains("狂笑")) {
								name.setText(name.getText()+" 狂笑");
							}
						}else {
							if(name.getText().contains("狂笑")) {
								name.setText(name.getText().replace("狂笑", ""));
							}
						}
						
					}
				});
				this.add(狂笑);
				this.add(狂笑_box);
				//copy tab
				JLabel 痴狂= new JLabel("痴狂:");  
				痴狂.setForeground(Color.WHITE);
				痴狂.setBounds(10+110+110+110, 20+25, 100, 50);
				JCheckBox 痴狂_box= new JCheckBox();
				痴狂_box.setBounds(10+60+110+110+110, 33+25, 20, 20);
				痴狂_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(痴狂_box.isSelected()) {
							if(!name.getText().contains("痴狂")) {
								name.setText(name.getText()+" 痴狂");
							}
						}else {
							if(name.getText().contains("痴狂")) {
								name.setText(name.getText().replace("痴狂", ""));
							}
						}
						
					}
				});
				this.add(痴狂);
				this.add(痴狂_box);
				//copy tab
				JLabel 疯狂= new JLabel("疯狂:");  
				疯狂.setForeground(Color.WHITE);
				疯狂.setBounds(10+110+110+110, 20+50, 100, 50);
				JCheckBox 疯狂_box= new JCheckBox();
				疯狂_box.setBounds(10+60+110+110+110, 33+50, 20, 20);
				疯狂_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(疯狂_box.isSelected()) {
							if(!name.getText().contains("疯狂")) {
								name.setText(name.getText()+" 疯狂");
							}
						}else {
							if(name.getText().contains("疯狂")) {
								name.setText(name.getText().replace("疯狂", ""));
							}
						}
						
					}
				});
				this.add(疯狂);
				this.add(疯狂_box);
				//copy tab
				JLabel 失心疯= new JLabel("失心疯:");  
				失心疯.setForeground(Color.WHITE);
				失心疯.setBounds(10+110+110+110, 20+75, 100, 50);
				JCheckBox 失心疯_box= new JCheckBox();
				失心疯_box.setBounds(10+60+110+110+110, 33+75, 20, 20);
				失心疯_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(失心疯_box.isSelected()) {
							if(!name.getText().contains("失心疯")) {
								name.setText(name.getText()+" 失心疯");
							}
						}else {
							if(name.getText().contains("失心疯")) {
								name.setText(name.getText().replace("失心疯", ""));
							}
						}
						
					}
				});
				this.add(失心疯);
				this.add(失心疯_box);
				//copy tab
				JLabel 发狂= new JLabel("发狂:");  
				发狂.setForeground(Color.WHITE);
				发狂.setBounds(10+110+110+110, 20+100, 100, 50);
				JCheckBox 发狂_box= new JCheckBox();
				发狂_box.setBounds(10+60+110+110+110, 33+100, 20, 20);
				发狂_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(发狂_box.isSelected()) {
							if(!name.getText().contains("发狂")) {
								name.setText(name.getText()+" 发狂");
							}
						}else {
							if(name.getText().contains("发狂")) {
								name.setText(name.getText().replace("发狂", ""));
							}
						}
						
					}
				});
				this.add(发狂);
				this.add(发狂_box);
				//copy tab
				JLabel 不进人言= new JLabel("不进人言:");  
				不进人言.setForeground(Color.WHITE);
				不进人言.setBounds(10+110+110+110, 20+125, 100, 50);
				JCheckBox 不进人言_box= new JCheckBox();
				不进人言_box.setBounds(10+60+110+110+110, 33+125, 20, 20);
				不进人言_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(不进人言_box.isSelected()) {
							if(!name.getText().contains("不进人言")) {
								name.setText(name.getText()+" 不进人言");
							}
						}else {
							if(name.getText().contains("不进人言")) {
								name.setText(name.getText().replace("不进人言", ""));
							}
						}
						
					}
				});
				this.add(不进人言);
				this.add(不进人言_box);
				//copy tab
				JLabel 倔强= new JLabel("倔强:");  
				倔强.setForeground(Color.WHITE);
				倔强.setBounds(10+110+110+110, 20+150, 100, 50);
				JCheckBox 倔强_box= new JCheckBox();
				倔强_box.setBounds(10+60+110+110+110, 33+150, 20, 20);
				倔强_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(倔强_box.isSelected()) {
							if(!name.getText().contains("倔强")) {
								name.setText(name.getText()+" 倔强");
							}
						}else {
							if(name.getText().contains("倔强")) {
								name.setText(name.getText().replace("倔强", ""));
							}
						}
						
					}
				});
				this.add(倔强);
				this.add(倔强_box);
				//copy tab
				JLabel 冲动= new JLabel("冲动:");  
				冲动.setForeground(Color.WHITE);
				冲动.setBounds(10+110+110+110, 20+175, 100, 50);
				JCheckBox 冲动_box= new JCheckBox();
				冲动_box.setBounds(10+60+110+110+110, 33+175, 20, 20);
				冲动_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(冲动_box.isSelected()) {
							if(!name.getText().contains("冲动")) {
								name.setText(name.getText()+" 冲动");
							}
						}else {
							if(name.getText().contains("冲动")) {
								name.setText(name.getText().replace("冲动", ""));
							}
						}
						
					}
				});
				this.add(冲动);
				this.add(冲动_box);
				//copy tab
				JLabel 牛角尖= new JLabel("牛角尖:");  
				牛角尖.setForeground(Color.WHITE);
				牛角尖.setBounds(10+110+110+110, 20+200, 100, 50);
				JCheckBox 牛角尖_box= new JCheckBox();
				牛角尖_box.setBounds(10+60+110+110+110, 33+200, 20, 20);
				牛角尖_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(牛角尖_box.isSelected()) {
							if(!name.getText().contains("牛角尖")) {
								name.setText(name.getText()+" 牛角尖");
							}
						}else {
							if(name.getText().contains("牛角尖")) {
								name.setText(name.getText().replace("牛角尖", ""));
							}
						}
						
					}
				});
				this.add(牛角尖);
				this.add(牛角尖_box);
				//copy tab
				JLabel 好奇冒险= new JLabel("好奇冒险:");  
				好奇冒险.setForeground(Color.WHITE);
				好奇冒险.setBounds(10+110+110+110, 20+225, 100, 50);
				JCheckBox 好奇冒险_box= new JCheckBox();
				好奇冒险_box.setBounds(10+60+110+110+110, 33+225, 20, 20);
				好奇冒险_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(好奇冒险_box.isSelected()) {
							if(!name.getText().contains("好奇冒险")) {
								name.setText(name.getText()+" 好奇冒险");
							}
						}else {
							if(name.getText().contains("好奇冒险")) {
								name.setText(name.getText().replace("好奇冒险", ""));
							}
						}
						
					}
				});
				this.add(好奇冒险);
				this.add(好奇冒险_box);
				//copy tab
				JLabel 脑疝= new JLabel("脑疝:");  
				脑疝.setForeground(Color.WHITE);
				脑疝.setBounds(10+110+110+110, 20+250, 100, 50);
				JCheckBox 脑疝_box= new JCheckBox();
				脑疝_box.setBounds(10+60+110+110+110, 33+250, 20, 20);
				脑疝_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(脑疝_box.isSelected()) {
							if(!name.getText().contains("脑疝")) {
								name.setText(name.getText()+" 脑疝");
							}
						}else {
							if(name.getText().contains("脑疝")) {
								name.setText(name.getText().replace("脑疝", ""));
							}
						}
						
					}
				});
				this.add(脑疝);
				this.add(脑疝_box);
				//copy tab
				JLabel 精神分裂= new JLabel("精神分裂:");  
				精神分裂.setForeground(Color.WHITE);
				精神分裂.setBounds(10+110+110+110, 20+275, 100, 50);
				JCheckBox 精神分裂_box= new JCheckBox();
				精神分裂_box.setBounds(10+60+110+110+110, 33+275, 20, 20);
				精神分裂_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(精神分裂_box.isSelected()) {
							if(!name.getText().contains("精神分裂")) {
								name.setText(name.getText()+" 精神分裂");
							}
						}else {
							if(name.getText().contains("精神分裂")) {
								name.setText(name.getText().replace("精神分裂", ""));
							}
						}
						
					}
				});
				this.add(精神分裂);
				this.add(精神分裂_box);
				
				
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