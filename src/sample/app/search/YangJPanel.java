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

public class YangJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public YangJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);

		//copy tab
		JLabel ðþÑ÷= new JLabel("ðþÑ÷:");  
		ðþÑ÷.setForeground(Color.WHITE);
		ðþÑ÷.setBounds(10, 20, 100, 50);
		JCheckBox ðþÑ÷_box= new JCheckBox();
		ðþÑ÷_box.setBounds(10+60, 33, 20, 20);
		ðþÑ÷_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(ðþÑ÷_box.isSelected()) {
					if(!name.getText().contains("ðþÑ÷")) {
						name.setText(name.getText()+" ðþÑ÷");
					}
				}else {
					if(name.getText().contains("ðþÑ÷")) {
						name.setText(name.getText().replace("ðþÑ÷", ""));
					}
				}
				
			}
		});
		this.add(ðþÑ÷);
		this.add(ðþÑ÷_box);	
				//copy tab
				JLabel ¸¹¹É¹µÑ÷= new JLabel("¸¹¹É¹µÑ÷:");  
				¸¹¹É¹µÑ÷.setForeground(Color.WHITE);
				¸¹¹É¹µÑ÷.setBounds(10, 20+25, 100, 50);
				JCheckBox ¸¹¹É¹µÑ÷_box= new JCheckBox();
				¸¹¹É¹µÑ÷_box.setBounds(10+60, 33+25, 20, 20);
				¸¹¹É¹µÑ÷_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(¸¹¹É¹µÑ÷_box.isSelected()) {
							if(!name.getText().contains("¸¹¹É¹µÑ÷")) {
								name.setText(name.getText()+" ¸¹¹É¹µÑ÷");
							}
						}else {
							if(name.getText().contains("¸¹¹É¹µÑ÷")) {
								name.setText(name.getText().replace("¸¹¹É¹µÑ÷", ""));
							}
						}
						
					}
				});
				this.add(¸¹¹É¹µÑ÷);
				this.add(¸¹¹É¹µÑ÷_box);	
				//copy tab
				JLabel Æ¤Ñ÷= new JLabel("Æ¤Ñ÷:");  
				Æ¤Ñ÷.setForeground(Color.WHITE);
				Æ¤Ñ÷.setBounds(10, 20+50, 100, 50);
				JCheckBox Æ¤Ñ÷_box= new JCheckBox();
				Æ¤Ñ÷_box.setBounds(10+60, 33+50, 20, 20);
				Æ¤Ñ÷_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Æ¤Ñ÷_box.isSelected()) {
							if(!name.getText().contains("Æ¤Ñ÷")) {
								name.setText(name.getText()+" Æ¤Ñ÷");
							}
						}else {
							if(name.getText().contains("Æ¤Ñ÷")) {
								name.setText(name.getText().replace("Æ¤Ñ÷", ""));
							}
						}
						
					}
				});
				this.add(Æ¤Ñ÷);
				this.add(Æ¤Ñ÷_box);	
				//copy tab
				JLabel ½Ó´¥Ñ÷= new JLabel("½Ó´¥Ñ÷:");  
				½Ó´¥Ñ÷.setForeground(Color.WHITE);
				½Ó´¥Ñ÷.setBounds(10, 20+75, 100, 50);
				JCheckBox ½Ó´¥Ñ÷_box= new JCheckBox();
				½Ó´¥Ñ÷_box.setBounds(10+60, 33+75, 20, 20);
				½Ó´¥Ñ÷_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(½Ó´¥Ñ÷_box.isSelected()) {
							if(!name.getText().contains("½Ó´¥Ñ÷")) {
								name.setText(name.getText()+" ½Ó´¥Ñ÷");
							}
						}else {
							if(name.getText().contains("½Ó´¥Ñ÷")) {
								name.setText(name.getText().replace("½Ó´¥Ñ÷", ""));
							}
						}
						
					}
				});
				this.add(½Ó´¥Ñ÷);
				this.add(½Ó´¥Ñ÷_box);	
				//copy tab
				JLabel ÊÖÑ÷= new JLabel("ÊÖÑ÷:");  
				ÊÖÑ÷.setForeground(Color.WHITE);
				ÊÖÑ÷.setBounds(10, 20+100, 100, 50);
				JCheckBox ÊÖÑ÷_box= new JCheckBox();
				ÊÖÑ÷_box.setBounds(10+60, 33+100, 20, 20);
				ÊÖÑ÷_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÊÖÑ÷_box.isSelected()) {
							if(!name.getText().contains("ÊÖÑ÷")) {
								name.setText(name.getText()+" ÊÖÑ÷");
							}
						}else {
							if(name.getText().contains("ÊÖÑ÷")) {
								name.setText(name.getText().replace("ÊÖÑ÷", ""));
							}
						}
						
					}
				});
				this.add(ÊÖÑ÷);
				this.add(ÊÖÑ÷_box);	
				//copy tab
				JLabel ½ÅÑ÷= new JLabel("½ÅÑ÷:");  
				½ÅÑ÷.setForeground(Color.WHITE);
				½ÅÑ÷.setBounds(10, 20+125, 100, 50);
				JCheckBox ½ÅÑ÷_box= new JCheckBox();
				½ÅÑ÷_box.setBounds(10+60, 33+125, 20, 20);
				½ÅÑ÷_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(½ÅÑ÷_box.isSelected()) {
							if(!name.getText().contains("½ÅÑ÷")) {
								name.setText(name.getText()+" ½ÅÑ÷");
							}
						}else {
							if(name.getText().contains("½ÅÑ÷")) {
								name.setText(name.getText().replace("½ÅÑ÷", ""));
							}
						}
						
					}
				});
				this.add(½ÅÑ÷);
				this.add(½ÅÑ÷_box);
				//copy tab
				JLabel Ïã¸Û½Å= new JLabel("Ïã¸Û½Å:");  
				Ïã¸Û½Å.setForeground(Color.WHITE);
				Ïã¸Û½Å.setBounds(10, 20+150, 100, 50);
				JCheckBox Ïã¸Û½Å_box= new JCheckBox();
				Ïã¸Û½Å_box.setBounds(10+60, 33+150, 20, 20);
				Ïã¸Û½Å_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ïã¸Û½Å_box.isSelected()) {
							if(!name.getText().contains("Ïã¸Û½Å")) {
								name.setText(name.getText()+" Ïã¸Û½Å");
							}
						}else {
							if(name.getText().contains("Ïã¸Û½Å")) {
								name.setText(name.getText().replace("Ïã¸Û½Å", ""));
							}
						}
						
					}
				});
				this.add(Ïã¸Û½Å);
				this.add(Ïã¸Û½Å_box);	
				//copy tab
				JLabel ÉàÑ÷= new JLabel("ÉàÑ÷:");  
				ÉàÑ÷.setForeground(Color.WHITE);
				ÉàÑ÷.setBounds(10, 20+175, 100, 50);
				JCheckBox ÉàÑ÷_box= new JCheckBox();
				ÉàÑ÷_box.setBounds(10+60, 33+175, 20, 20);
				ÉàÑ÷_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÉàÑ÷_box.isSelected()) {
							if(!name.getText().contains("ÉàÑ÷")) {
								name.setText(name.getText()+" ÉàÑ÷");
							}
						}else {
							if(name.getText().contains("ÉàÑ÷")) {
								name.setText(name.getText().replace("ÉàÑ÷", ""));
							}
						}
						
					}
				});
				this.add(ÉàÑ÷);
				this.add(ÉàÑ÷_box);	
				//copy tab
				JLabel ×ì½ÇÑ÷= new JLabel("×ì½ÇÑ÷:");  
				×ì½ÇÑ÷.setForeground(Color.WHITE);
				×ì½ÇÑ÷.setBounds(10, 20+200, 100, 50);
				JCheckBox ×ì½ÇÑ÷_box= new JCheckBox();
				×ì½ÇÑ÷_box.setBounds(10+60, 33+200, 20, 20);
				×ì½ÇÑ÷_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(×ì½ÇÑ÷_box.isSelected()) {
							if(!name.getText().contains("×ì½ÇÑ÷")) {
								name.setText(name.getText()+" ×ì½ÇÑ÷");
							}
						}else {
							if(name.getText().contains("×ì½ÇÑ÷")) {
								name.setText(name.getText().replace("×ì½ÇÑ÷", ""));
							}
						}
						
					}
				});
				this.add(×ì½ÇÑ÷);
				this.add(×ì½ÇÑ÷_box);	
				//copy tab
				JLabel ÑÛÑ÷= new JLabel("ÑÛÑ÷:");  
				ÑÛÑ÷.setForeground(Color.WHITE);
				ÑÛÑ÷.setBounds(10, 20+225, 100, 50);
				JCheckBox ÑÛÑ÷_box= new JCheckBox();
				ÑÛÑ÷_box.setBounds(10+60, 33+225, 20, 20);
				ÑÛÑ÷_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÑÛÑ÷_box.isSelected()) {
							if(!name.getText().contains("ÑÛÑ÷")) {
								name.setText(name.getText()+" ÑÛÑ÷");
							}
						}else {
							if(name.getText().contains("ÑÛÑ÷")) {
								name.setText(name.getText().replace("ÑÛÑ÷", ""));
							}
						}
						
					}
				});
				this.add(ÑÛÑ÷);
				this.add(ÑÛÑ÷_box);	
				//copy tab
				JLabel ÉúÖ³Æ÷Ñ÷= new JLabel("ÉúÖ³Æ÷Ñ÷:");  
				ÉúÖ³Æ÷Ñ÷.setForeground(Color.WHITE);
				ÉúÖ³Æ÷Ñ÷.setBounds(10, 20+250, 100, 50);
				JCheckBox ÉúÖ³Æ÷Ñ÷_box= new JCheckBox();
				ÉúÖ³Æ÷Ñ÷_box.setBounds(10+60, 33+250, 20, 20);
				ÉúÖ³Æ÷Ñ÷_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÉúÖ³Æ÷Ñ÷_box.isSelected()) {
							if(!name.getText().contains("ÉúÖ³Æ÷Ñ÷")) {
								name.setText(name.getText()+" ÉúÖ³Æ÷Ñ÷");
							}
						}else {
							if(name.getText().contains("ÉúÖ³Æ÷Ñ÷")) {
								name.setText(name.getText().replace("ÉúÖ³Æ÷Ñ÷", ""));
							}
						}
						
					}
				});
				this.add(ÉúÖ³Æ÷Ñ÷);
				this.add(ÉúÖ³Æ÷Ñ÷_box);	
				//copy tab
				JLabel Ò¸ÏÂÑ÷= new JLabel("Ò¸ÏÂÑ÷:");  
				Ò¸ÏÂÑ÷.setForeground(Color.WHITE);
				Ò¸ÏÂÑ÷.setBounds(10, 20+275, 100, 50);
				JCheckBox Ò¸ÏÂÑ÷_box= new JCheckBox();
				Ò¸ÏÂÑ÷_box.setBounds(10+60, 33+275, 20, 20);
				Ò¸ÏÂÑ÷_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ò¸ÏÂÑ÷_box.isSelected()) {
							if(!name.getText().contains("Ò¸ÏÂÑ÷")) {
								name.setText(name.getText()+" Ò¸ÏÂÑ÷");
							}
						}else {
							if(name.getText().contains("Ò¸ÏÂÑ÷")) {
								name.setText(name.getText().replace("Ò¸ÏÂÑ÷", ""));
							}
						}
						
					}
				});
				this.add(Ò¸ÏÂÑ÷);
				this.add(Ò¸ÏÂÑ÷_box);	
				//copy tab
				JLabel ±³Ñ÷= new JLabel("±³Ñ÷:");  
				±³Ñ÷.setForeground(Color.WHITE);
				±³Ñ÷.setBounds(10, 20+300, 100, 50);
				JCheckBox ±³Ñ÷_box= new JCheckBox();
				±³Ñ÷_box.setBounds(10+60, 33+300, 20, 20);
				±³Ñ÷_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(±³Ñ÷_box.isSelected()) {
							if(!name.getText().contains("±³Ñ÷")) {
								name.setText(name.getText()+" ±³Ñ÷");
							}
						}else {
							if(name.getText().contains("±³Ñ÷")) {
								name.setText(name.getText().replace("±³Ñ÷", ""));
							}
						}
						
					}
				});
				this.add(±³Ñ÷);
				this.add(±³Ñ÷_box);	
				//copy tab
				JLabel ÍÈÑ÷= new JLabel("ÍÈÑ÷:");  
				ÍÈÑ÷.setForeground(Color.WHITE);
				ÍÈÑ÷.setBounds(10, 20+325, 100, 50);
				JCheckBox ÍÈÑ÷_box= new JCheckBox();
				ÍÈÑ÷_box.setBounds(10+60, 33+325, 20, 20);
				ÍÈÑ÷_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÍÈÑ÷_box.isSelected()) {
							if(!name.getText().contains("ÍÈÑ÷")) {
								name.setText(name.getText()+" ÍÈÑ÷");
							}
						}else {
							if(name.getText().contains("ÍÈÑ÷")) {
								name.setText(name.getText().replace("ÍÈÑ÷", ""));
							}
						}
						
					}
				});
				this.add(ÍÈÑ÷);
				this.add(ÍÈÑ÷_box);	
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