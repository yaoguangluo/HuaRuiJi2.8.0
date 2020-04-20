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

public class ReJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ReJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);
		//
		JLabel hotqichuan_filter= new JLabel("发热:");  
		hotqichuan_filter.setForeground(Color.WHITE);
		hotqichuan_filter.setBounds(10, 20, 100, 50);
		JCheckBox hotqichuan_filter_box= new JCheckBox();
		hotqichuan_filter_box.setBounds(10+60, 33, 20, 20);
		hotqichuan_filter_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(hotqichuan_filter_box.isSelected()) {
					if(!name.getText().contains("发热")) {
						name.setText(name.getText()+" 发热");
					}
				}else {
					if(name.getText().contains("发热")) {
						name.setText(name.getText().replace("发热", ""));
					}
				}
				
			}
		});
		this.add(hotqichuan_filter);
		this.add(hotqichuan_filter_box);
		
		//copy tab
		JLabel 发烧= new JLabel("发烧:");  
		发烧.setForeground(Color.WHITE);
		发烧.setBounds(10+110+110+110, 20+25, 100, 50);
		JCheckBox 发烧_box= new JCheckBox();
		发烧_box.setBounds(10+60+110+110+110, 33+25, 20, 20);
		发烧_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(发烧_box.isSelected()) {
					if(!name.getText().contains("发烧")) {
						name.setText(name.getText()+" 发烧");
					}
				}else {
					if(name.getText().contains("发烧")) {
						name.setText(name.getText().replace("发烧", ""));
					}
				}
				
			}
		});
		this.add(发烧);
		this.add(发烧_box);
		
		//copy tab
				JLabel 手热= new JLabel("手热:");  
				手热.setForeground(Color.WHITE);
				手热.setBounds(10+110+110+110, 20+50, 100, 50);
				JCheckBox 手热_box= new JCheckBox();
				手热_box.setBounds(10+60+110+110+110, 33+50, 20, 20);
				手热_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(手热_box.isSelected()) {
							if(!name.getText().contains("手热")) {
								name.setText(name.getText()+" 手热");
							}
						}else {
							if(name.getText().contains("手热")) {
								name.setText(name.getText().replace("手热", ""));
							}
						}
						
					}
				});
				this.add(手热);
				this.add(手热_box);
				
				//copy tab
				JLabel 背热= new JLabel("背热:");  
				背热.setForeground(Color.WHITE);
				背热.setBounds(10+110+110+110, 20+75, 100, 50);
				JCheckBox 背热_box= new JCheckBox();
				背热_box.setBounds(10+60+110+110+110, 33+75, 20, 20);
				背热_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(背热_box.isSelected()) {
							if(!name.getText().contains("背热")) {
								name.setText(name.getText()+" 背热");
							}
						}else {
							if(name.getText().contains("背热")) {
								name.setText(name.getText().replace("背热", ""));
							}
						}
						
					}
				});
				this.add(背热);
				this.add(背热_box);
				//copy tab
				JLabel 腹热= new JLabel("腹热:");  
				腹热.setForeground(Color.WHITE);
				腹热.setBounds(10+110+110+110, 20+100, 100, 50);
				JCheckBox 腹热_box= new JCheckBox();
				腹热_box.setBounds(10+60+110+110+110, 33+100, 20, 20);
				腹热_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(腹热_box.isSelected()) {
							if(!name.getText().contains("腹热")) {
								name.setText(name.getText()+" 腹热");
							}
						}else {
							if(name.getText().contains("腹热")) {
								name.setText(name.getText().replace("腹热", ""));
							}
						}
						
					}
				});
				this.add(腹热);
				this.add(腹热_box);
				//copy tab
				JLabel 脚心热= new JLabel("脚心热:");  
				脚心热.setForeground(Color.WHITE);
				脚心热.setBounds(10+110+110+110, 20+125, 100, 50);
				JCheckBox 脚心热_box= new JCheckBox();
				脚心热_box.setBounds(10+60+110+110+110, 33+125, 20, 20);
				脚心热_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(脚心热_box.isSelected()) {
							if(!name.getText().contains("脚心热")) {
								name.setText(name.getText()+" 脚心热");
							}
						}else {
							if(name.getText().contains("脚心热")) {
								name.setText(name.getText().replace("脚心热", ""));
							}
						}
						
					}
				});
				this.add(脚心热);
				this.add(脚心热_box);
				//copy tab
				JLabel 手指热= new JLabel("手指热:");  
				手指热.setForeground(Color.WHITE);
				手指热.setBounds(10+110+110+110, 20+150, 100, 50);
				JCheckBox 手指热_box= new JCheckBox();
				手指热_box.setBounds(10+60+110+110+110, 33+150, 20, 20);
				手指热_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(手指热_box.isSelected()) {
							if(!name.getText().contains("手指热")) {
								name.setText(name.getText()+" 手指热");
							}
						}else {
							if(name.getText().contains("手指热")) {
								name.setText(name.getText().replace("手指热", ""));
							}
						}
						
					}
				});
				this.add(手指热);
				this.add(手指热_box);
				//copy tab
				JLabel 面热= new JLabel("面热:");  
				面热.setForeground(Color.WHITE);
				面热.setBounds(10+110+110+110, 20+175, 100, 50);
				JCheckBox 面热_box= new JCheckBox();
				面热_box.setBounds(10+60+110+110+110, 33+175, 20, 20);
				面热_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(面热_box.isSelected()) {
							if(!name.getText().contains("面热")) {
								name.setText(name.getText()+" 面热");
							}
						}else {
							if(name.getText().contains("面热")) {
								name.setText(name.getText().replace("面热", ""));
							}
						}
						
					}
				});
				this.add(面热);
				this.add(面热_box);
				//copy tab
				JLabel 耳朵热= new JLabel("耳朵热:");  
				耳朵热.setForeground(Color.WHITE);
				耳朵热.setBounds(10+110+110+110, 20+200, 100, 50);
				JCheckBox 耳朵热_box= new JCheckBox();
				耳朵热_box.setBounds(10+60+110+110+110, 33+200, 20, 20);
				耳朵热_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(耳朵热_box.isSelected()) {
							if(!name.getText().contains("耳朵热")) {
								name.setText(name.getText()+" 耳朵热");
							}
						}else {
							if(name.getText().contains("耳朵热")) {
								name.setText(name.getText().replace("耳朵热", ""));
							}
						}
						
					}
				});
				this.add(耳朵热);
				this.add(耳朵热_box);
				//copy tab
				JLabel 全身热= new JLabel("全身热:");  
				全身热.setForeground(Color.WHITE);
				全身热.setBounds(10+110+110+110, 20+225, 100, 50);
				JCheckBox 全身热_box= new JCheckBox();
				全身热_box.setBounds(10+60+110+110+110, 33+225, 20, 20);
				全身热_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(全身热_box.isSelected()) {
							if(!name.getText().contains("全身热")) {
								name.setText(name.getText()+" 全身热");
							}
						}else {
							if(name.getText().contains("全身热")) {
								name.setText(name.getText().replace("全身热", ""));
							}
						}
						
					}
				});
				this.add(全身热);
				this.add(全身热_box);
				//copy tab
				JLabel 额头热= new JLabel("额头热:");  
				额头热.setForeground(Color.WHITE);
				额头热.setBounds(10+110+110+110, 20+250, 100, 50);
				JCheckBox 额头热_box= new JCheckBox();
				额头热_box.setBounds(10+60+110+110+110, 33+250, 20, 20);
				额头热_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(额头热_box.isSelected()) {
							if(!name.getText().contains("额头热")) {
								name.setText(name.getText()+" 额头热");
							}
						}else {
							if(name.getText().contains("额头热")) {
								name.setText(name.getText().replace("额头热", ""));
							}
						}
						
					}
				});
				this.add(额头热);
				this.add(额头热_box);
				
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