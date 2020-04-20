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

public class DuJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DuJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);

				//copy tab
				JLabel 解蛇毒= new JLabel("解蛇毒:");  
				解蛇毒.setForeground(Color.WHITE);
				解蛇毒.setBounds(10+110+110+220, 20+125, 100, 50);
				JCheckBox 解蛇毒_box= new JCheckBox();
				解蛇毒_box.setBounds(10+60+110+110+220, 33+125, 20, 20);
				解蛇毒_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(解蛇毒_box.isSelected()) {
							if(!name.getText().contains("解蛇毒")) {
								name.setText(name.getText()+" 解蛇毒");
							}
						}else {
							if(name.getText().contains("解蛇毒")) {
								name.setText(name.getText().replace("解蛇毒", ""));
							}
						}
						
					}
				});
				this.add(解蛇毒);
				this.add(解蛇毒_box);	

				//copy tab
				JLabel 中毒= new JLabel("中毒:");  
				中毒.setForeground(Color.WHITE);
				中毒.setBounds(10+110+110+330, 20+275, 100, 50);
				JCheckBox 中毒_box= new JCheckBox();
				中毒_box.setBounds(10+60+110+110+330, 33+275, 20, 20);
				中毒_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(中毒_box.isSelected()) {
							if(!name.getText().contains("中毒")) {
								name.setText(name.getText()+" 中毒");
							}
						}else {
							if(name.getText().contains("中毒")) {
								name.setText(name.getText().replace("中毒", ""));
							}
						}
						
					}
				});
				this.add(中毒);
				this.add(中毒_box);	
				
				//copy tab
				JLabel 氯中毒= new JLabel("氯中毒:");  
				氯中毒.setForeground(Color.WHITE);
				氯中毒.setBounds(10+110+110+110, 20, 100, 50);
				JCheckBox 氯中毒_box= new JCheckBox();
				氯中毒_box.setBounds(10+60+110+110+110, 33, 20, 20);
				氯中毒_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(氯中毒_box.isSelected()) {
							if(!name.getText().contains("氯中毒")) {
								name.setText(name.getText()+" 氯中毒");
							}
						}else {
							if(name.getText().contains("氯中毒")) {
								name.setText(name.getText().replace("氯中毒", ""));
							}
						}
						
					}
				});
				this.add(氯中毒);
				this.add(氯中毒_box);
				//copy tab
				JLabel 氰中毒= new JLabel("氰中毒:");  
				氰中毒.setForeground(Color.WHITE);
				氰中毒.setBounds(10+110+110+110, 20+25, 100, 50);
				JCheckBox 氰中毒_box= new JCheckBox();
				氰中毒_box.setBounds(10+60+110+110+110, 33+25, 20, 20);
				氰中毒_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(氰中毒_box.isSelected()) {
							if(!name.getText().contains("氰中毒")) {
								name.setText(name.getText()+" 氰中毒");
							}
						}else {
							if(name.getText().contains("氰中毒")) {
								name.setText(name.getText().replace("氰中毒", ""));
							}
						}
						
					}
				});
				this.add(氰中毒);
				this.add(氰中毒_box);
				//copy tab
				JLabel 糖中毒= new JLabel("糖中毒:");  
				糖中毒.setForeground(Color.WHITE);
				糖中毒.setBounds(10+110+110+110, 20+50, 100, 50);
				JCheckBox 糖中毒_box= new JCheckBox();
				糖中毒_box.setBounds(10+60+110+110+110, 33+50, 20, 20);
				糖中毒_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(糖中毒_box.isSelected()) {
							if(!name.getText().contains("糖中毒")) {
								name.setText(name.getText()+" 糖中毒");
							}
						}else {
							if(name.getText().contains("糖中毒")) {
								name.setText(name.getText().replace("糖中毒", ""));
							}
						}
						
					}
				});
				this.add(糖中毒);
				this.add(糖中毒_box);
				//copy tab
				JLabel 水中毒= new JLabel("水中毒:");  
				水中毒.setForeground(Color.WHITE);
				水中毒.setBounds(10+110+110+110, 20+75, 100, 50);
				JCheckBox 水中毒_box= new JCheckBox();
				水中毒_box.setBounds(10+60+110+110+110, 33+75, 20, 20);
				水中毒_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(水中毒_box.isSelected()) {
							if(!name.getText().contains("水中毒")) {
								name.setText(name.getText()+" 水中毒");
							}
						}else {
							if(name.getText().contains("水中毒")) {
								name.setText(name.getText().replace("水中毒", ""));
							}
						}
						
					}
				});
				this.add(水中毒);
				this.add(水中毒_box);
				
				//copy tab
				JLabel 铅中毒= new JLabel("铅中毒:");  
				铅中毒.setForeground(Color.WHITE);
				铅中毒.setBounds(10+110+110+110, 20+100, 100, 50);
				JCheckBox 铅中毒_box= new JCheckBox();
				铅中毒_box.setBounds(10+60+110+110+110, 33+100, 20, 20);
				铅中毒_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(铅中毒_box.isSelected()) {
							if(!name.getText().contains("铅中毒")) {
								name.setText(name.getText()+" 铅中毒");
							}
						}else {
							if(name.getText().contains("铅中毒")) {
								name.setText(name.getText().replace("铅中毒", ""));
							}
						}
						
					}
				});
				this.add(铅中毒);
				this.add(铅中毒_box);
				//copy tab
				JLabel 汞中毒= new JLabel("汞中毒:");  
				汞中毒.setForeground(Color.WHITE);
				汞中毒.setBounds(10+110+110+110, 20+125, 100, 50);
				JCheckBox 汞中毒_box= new JCheckBox();
				汞中毒_box.setBounds(10+60+110+110+110, 33+125, 20, 20);
				汞中毒_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(汞中毒_box.isSelected()) {
							if(!name.getText().contains("汞中毒")) {
								name.setText(name.getText()+" 汞中毒");
							}
						}else {
							if(name.getText().contains("汞中毒")) {
								name.setText(name.getText().replace("汞中毒", ""));
							}
						}
						
					}
				});
				this.add(汞中毒);
				this.add(汞中毒_box);
				//copy tab
				JLabel 酸中毒= new JLabel("酸中毒:");  
				酸中毒.setForeground(Color.WHITE);
				酸中毒.setBounds(10+110+110+110, 20+150, 100, 50);
				JCheckBox 酸中毒_box= new JCheckBox();
				酸中毒_box.setBounds(10+60+110+110+110, 33+150, 20, 20);
				酸中毒_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(酸中毒_box.isSelected()) {
							if(!name.getText().contains("酸中毒")) {
								name.setText(name.getText()+" 酸中毒");
							}
						}else {
							if(name.getText().contains("酸中毒")) {
								name.setText(name.getText().replace("酸中毒", ""));
							}
						}
						
					}
				});
				this.add(酸中毒);
				this.add(酸中毒_box);
				//copy tab
				JLabel 碱中毒= new JLabel("碱中毒:");  
				碱中毒.setForeground(Color.WHITE);
				碱中毒.setBounds(10+110+110+110, 20+175, 100, 50);
				JCheckBox 碱中毒_box= new JCheckBox();
				碱中毒_box.setBounds(10+60+110+110+110, 33+175, 20, 20);
				碱中毒_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(碱中毒_box.isSelected()) {
							if(!name.getText().contains("碱中毒")) {
								name.setText(name.getText()+" 碱中毒");
							}
						}else {
							if(name.getText().contains("碱中毒")) {
								name.setText(name.getText().replace("碱中毒", ""));
							}
						}
						
					}
				});
				this.add(碱中毒);
				this.add(碱中毒_box);
				//copy tab
				JLabel 霉中毒= new JLabel("霉中毒:");  
				霉中毒.setForeground(Color.WHITE);
				霉中毒.setBounds(10+110+110+110, 20+200, 100, 50);
				JCheckBox 霉中毒_box= new JCheckBox();
				霉中毒_box.setBounds(10+60+110+110+110, 33+200, 20, 20);
				霉中毒_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(霉中毒_box.isSelected()) {
							if(!name.getText().contains("霉中毒")) {
								name.setText(name.getText()+" 霉中毒");
							}
						}else {
							if(name.getText().contains("霉中毒")) {
								name.setText(name.getText().replace("霉中毒", ""));
							}
						}
						
					}
				});
				this.add(霉中毒);
				this.add(霉中毒_box);
				//copy tab
				JLabel 过敏性毒= new JLabel("过敏性毒:");  
				过敏性毒.setForeground(Color.WHITE);
				过敏性毒.setBounds(10+110+110+110, 20+225, 100, 50);
				JCheckBox 过敏性毒_box= new JCheckBox();
				过敏性毒_box.setBounds(10+60+110+110+110, 33+225, 20, 20);
				过敏性毒_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(过敏性毒_box.isSelected()) {
							if(!name.getText().contains("过敏性毒")) {
								name.setText(name.getText()+" 过敏性毒");
							}
						}else {
							if(name.getText().contains("过敏性毒")) {
								name.setText(name.getText().replace("过敏性毒", ""));
							}
						}
						
					}
				});
				this.add(过敏性毒);
				this.add(过敏性毒_box);
					
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