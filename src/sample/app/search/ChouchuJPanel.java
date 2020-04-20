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

public class ChouchuJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ChouchuJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);
		//
		//copy tab
				JLabel Âé±Ô= new JLabel("Âé±Ô:");  
				Âé±Ô.setForeground(Color.WHITE);
				Âé±Ô.setBounds(10, 20, 100, 50);
				JCheckBox Âé±Ô_box= new JCheckBox();
				Âé±Ô_box.setBounds(10+60, 33, 20, 20);
				Âé±Ô_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Âé±Ô_box.isSelected()) {
							if(!name.getText().contains("Âé±Ô")) {
								name.setText(name.getText()+" Âé±Ô");
							}
						}else {
							if(name.getText().contains("Âé±Ô")) {
								name.setText(name.getText().replace("Âé±Ô", ""));
							}
						}
						
					}
				});
				this.add(Âé±Ô);
				this.add(Âé±Ô_box);
				
				//copy tab
				JLabel Ñôðï= new JLabel("Ñôðï:");  
				Ñôðï.setForeground(Color.WHITE);
				Ñôðï.setBounds(10, 20+25, 100, 50);
				JCheckBox Ñôðï_box= new JCheckBox();
				Ñôðï_box.setBounds(10+60, 33+25, 20, 20);
				Ñôðï_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ñôðï_box.isSelected()) {
							if(!name.getText().contains("Ñôðï")) {
								name.setText(name.getText()+" Ñôðï");
							}
						}else {
							if(name.getText().contains("Ñôðï")) {
								name.setText(name.getText().replace("Ñôðï", ""));
							}
						}
						
					}
				});
				this.add(Ñôðï);
				this.add(Ñôðï_box);
				
				
				//copy tab
				JLabel ËÄÖ«³é´¤= new JLabel("ËÄÖ«³é´¤:");  
				ËÄÖ«³é´¤.setForeground(Color.WHITE);
				ËÄÖ«³é´¤.setBounds(10+110, 20+400, 100, 50);
				JCheckBox ËÄÖ«³é´¤_box= new JCheckBox();
				ËÄÖ«³é´¤_box.setBounds(10+60+110, 33+400, 20, 20);
				ËÄÖ«³é´¤_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ËÄÖ«³é´¤_box.isSelected()) {
							if(!name.getText().contains("ËÄÖ«³é´¤")) {
								name.setText(name.getText()+" ËÄÖ«³é´¤");
							}
						}else {
							if(name.getText().contains("ËÄÖ«³é´¤")) {
								name.setText(name.getText().replace("ËÄÖ«³é´¤", ""));
							}
						}
						
					}
				});
				this.add(ËÄÖ«³é´¤);
				this.add(ËÄÖ«³é´¤_box);	
				//copy tab
				JLabel ñ²ðï= new JLabel("ñ²ðï:");  
				ñ²ðï.setForeground(Color.WHITE);
				ñ²ðï.setBounds(10+110, 20+425, 100, 50);
				JCheckBox ñ²ðï_box= new JCheckBox();
				ñ²ðï_box.setBounds(10+60+110, 33+425, 20, 20);
				ñ²ðï_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ñ²ðï_box.isSelected()) {
							if(!name.getText().contains("ñ²ðï")) {
								name.setText(name.getText()+" ñ²ðï");
							}
						}else {
							if(name.getText().contains("ñ²ðï")) {
								name.setText(name.getText().replace("ñ²ðï", ""));
							}
						}
						
					}
				});
				this.add(ñ²ðï);
				this.add(ñ²ðï_box);	
				//copy tab
				JLabel ÃÎðï= new JLabel("ÃÎðï:");  
				ÃÎðï.setForeground(Color.WHITE);
				ÃÎðï.setBounds(10+110, 20+450, 100, 50);
				JCheckBox ÃÎðï_box= new JCheckBox();
				ÃÎðï_box.setBounds(10+60+110, 33+450, 20, 20);
				ÃÎðï_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÃÎðï_box.isSelected()) {
							if(!name.getText().contains("ÃÎðï")) {
								name.setText(name.getText()+" ÃÎðï");
							}
						}else {
							if(name.getText().contains("ÃÎðï")) {
								name.setText(name.getText().replace("ÃÎðï", ""));
							}
						}
						
					}
				});
				this.add(ÃÎðï);
				this.add(ÃÎðï_box);	
				
			
			
				//copy tab
				JLabel ´ò°Ú×Ó= new JLabel("´ò°Ú×Ó:");  
				´ò°Ú×Ó.setForeground(Color.WHITE);
				´ò°Ú×Ó.setBounds(10+110+110, 20+325, 100, 50);
				JCheckBox ´ò°Ú×Ó_box= new JCheckBox();
				´ò°Ú×Ó_box.setBounds(10+60+110+110, 33+325, 20, 20);
				´ò°Ú×Ó_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(´ò°Ú×Ó_box.isSelected()) {
							if(!name.getText().contains("´ò°Ú×Ó")) {
								name.setText(name.getText()+" ´ò°Ú×Ó");
							}
						}else {
							if(name.getText().contains("´ò°Ú×Ó")) {
								name.setText(name.getText().replace("´ò°Ú×Ó", ""));
							}
						}
						
					}
				});
				this.add(´ò°Ú×Ó);
				this.add(´ò°Ú×Ó_box);	
		
			
			
				//copy tab
				JLabel ¾·ÂÎ= new JLabel("¾·ÂÎ:");  
				¾·ÂÎ.setForeground(Color.WHITE);
				¾·ÂÎ.setBounds(10+110+110+440, 20+0, 100, 50);
				JCheckBox ¾·ÂÎ_box= new JCheckBox();
				¾·ÂÎ_box.setBounds(10+60+110+110+440, 33+0, 20, 20);
				¾·ÂÎ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(¾·ÂÎ_box.isSelected()) {
							if(!name.getText().contains("¾·ÂÎ")) {
								name.setText(name.getText()+" ¾·ÂÎ");
							}
						}else {
							if(name.getText().contains("¾·ÂÎ")) {
								name.setText(name.getText().replace("¾·ÂÎ", ""));
							}
						}
						
					}
				});
				this.add(¾·ÂÎ);
				this.add(¾·ÂÎ_box);	
			
				//copy tab
				JLabel ¶úÃù= new JLabel("¶úÃù:");  
				¶úÃù.setForeground(Color.WHITE);
				¶úÃù.setBounds(10+110+110+440, 20+75, 100, 50);
				JCheckBox ¶úÃù_box= new JCheckBox();
				¶úÃù_box.setBounds(10+60+110+110+440, 33+75, 20, 20);
				¶úÃù_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(¶úÃù_box.isSelected()) {
							if(!name.getText().contains("¶úÃù")) {
								name.setText(name.getText()+" ¶úÃù");
							}
						}else {
							if(name.getText().contains("¶úÃù")) {
								name.setText(name.getText().replace("¶úÃù", ""));
							}
						}
						
					}
				});
				this.add(¶úÃù);
				this.add(¶úÃù_box);	
			
				//copy tab
				JLabel Õð²ü= new JLabel("Õð²ü:");  
				Õð²ü.setForeground(Color.WHITE);
				Õð²ü.setBounds(10+110+110+440, 20+125, 100, 50);
				JCheckBox Õð²ü_box= new JCheckBox();
				Õð²ü_box.setBounds(10+60+110+110+440, 33+125, 20, 20);
				Õð²ü_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Õð²ü_box.isSelected()) {
							if(!name.getText().contains("Õð²ü")) {
								name.setText(name.getText()+" Õð²ü");
							}
						}else {
							if(name.getText().contains("Õð²ü")) {
								name.setText(name.getText().replace("Õð²ü", ""));
							}
						}
						
					}
				});
				this.add(Õð²ü);
				this.add(Õð²ü_box);	
			
				//copy tab
				JLabel ÐÄ¼Â= new JLabel("ÐÄ¼Â:");  
				ÐÄ¼Â.setForeground(Color.WHITE);
				ÐÄ¼Â.setBounds(10+110+110+440, 20+225, 100, 50);
				JCheckBox ÐÄ¼Â_box= new JCheckBox();
				ÐÄ¼Â_box.setBounds(10+60+110+110+440, 33+225, 20, 20);
				ÐÄ¼Â_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÐÄ¼Â_box.isSelected()) {
							if(!name.getText().contains("ÐÄ¼Â")) {
								name.setText(name.getText()+" ÐÄ¼Â");
							}
						}else {
							if(name.getText().contains("ÐÄ¼Â")) {
								name.setText(name.getText().replace("ÐÄ¼Â", ""));
							}
						}
						
					}
				});
				this.add(ÐÄ¼Â);
				this.add(ÐÄ¼Â_box);	
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