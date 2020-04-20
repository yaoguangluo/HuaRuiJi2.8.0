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

public class TanJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TanJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);
	
				//copy tab
				JLabel nongtan= new JLabel("Å¨Ìµ:");  
				nongtan.setForeground(Color.WHITE);
				nongtan.setBounds(10, 45+25+25+25, 100, 50);
				JCheckBox nongtan_box= new JCheckBox();
				nongtan_box.setBounds(10+60, 58+25+25+25, 20, 20);
				nongtan_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(nongtan_box.isSelected()) {
							if(!name.getText().contains("Å¨Ìµ")) {
								name.setText(name.getText()+" Å¨Ìµ");
							}
						}else {
							if(name.getText().contains("Å¨Ìµ")) {
								name.setText(name.getText().replace("Å¨Ìµ", ""));
							}
						}
						
					}
				});
				this.add(nongtan);
				this.add(nongtan_box);
				
				//copy tab
				JLabel huangtan= new JLabel("»ÆÌµ:");  
				huangtan.setForeground(Color.WHITE);
				huangtan.setBounds(10, 45+25+75, 100, 50);
				JCheckBox huangtan_box= new JCheckBox();
				huangtan_box.setBounds(10+60, 58+25+75, 20, 20);
				huangtan_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(huangtan_box.isSelected()) {
							if(!name.getText().contains("»ÆÌµ")) {
								name.setText(name.getText()+" »ÆÌµ");
							}
						}else {
							if(name.getText().contains("»ÆÌµ")) {
								name.setText(name.getText().replace("»ÆÌµ", ""));
							}
						}
						
					}
				});
				this.add(huangtan);
				this.add(huangtan_box);
				//copy tab
				JLabel baitan= new JLabel("°×Ìµ:");  
				baitan.setForeground(Color.WHITE);
				baitan.setBounds(10, 45+25+100, 100, 50);
				JCheckBox baitan_box= new JCheckBox();
				baitan_box.setBounds(10+60, 58+25+100, 20, 20);
				baitan_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(baitan_box.isSelected()) {
							if(!name.getText().contains("°×Ìµ")) {
								name.setText(name.getText()+" °×Ìµ");
							}
						}else {
							if(name.getText().contains("°×Ìµ")) {
								name.setText(name.getText().replace("°×Ìµ", ""));
							}
						}
						
					}
				});
				this.add(baitan);
				this.add(baitan_box);
				//copy tab
				JLabel duotan= new JLabel("¶àÌµ:");  
				duotan.setForeground(Color.WHITE);
				duotan.setBounds(10, 45+25+125, 100, 50);
				JCheckBox duotan_box= new JCheckBox();
				duotan_box.setBounds(10+60, 58+25+125, 20, 20);
				duotan_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(duotan_box.isSelected()) {
							if(!name.getText().contains("¶àÌµ")) {
								name.setText(name.getText()+" ¶àÌµ");
							}
						}else {
							if(name.getText().contains("¶àÌµ")) {
								name.setText(name.getText().replace("¶àÌµ", ""));
							}
						}
						
					}
				});
				this.add(duotan);
				this.add(duotan_box);
				//copy tab
				JLabel shaotan= new JLabel("ÉÙÌµ:");  
				shaotan.setForeground(Color.WHITE);
				shaotan.setBounds(10, 45+25+100+25+25, 100, 50);
				JCheckBox shaotan_box= new JCheckBox();
				shaotan_box.setBounds(10+60, 58+25+100+25+25, 20, 20);
				shaotan_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(shaotan_box.isSelected()) {
							if(!name.getText().contains("ÉÙÌµ")) {
								name.setText(name.getText()+" ÉÙÌµ");
							}
						}else {
							if(name.getText().contains("ÉÙÌµ")) {
								name.setText(name.getText().replace("ÉÙÌµ", ""));
							}
						}
						
					}
				});
				this.add(shaotan);
				this.add(shaotan_box);
				//copy tab
				JLabel chouyan= new JLabel("³íÌµ:");  
				chouyan.setForeground(Color.WHITE);
				chouyan.setBounds(10, 45+25+100+25+50, 100, 50);
				JCheckBox chouyan_box= new JCheckBox();
				chouyan_box.setBounds(10+60, 58+25+100+25+50, 20, 20);
				chouyan_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(chouyan_box.isSelected()) {
							if(!name.getText().contains("³íÌµ")) {
								name.setText(name.getText()+" ³íÌµ");
							}
						}else {
							if(name.getText().contains("³íÌµ")) {
								name.setText(name.getText().replace("³íÌµ", ""));
							}
						}
						
					}
				});
				this.add(chouyan);
				this.add(chouyan_box);
				//copy tab
				JLabel xitan= new JLabel("Ï¡Ìµ:");  
				xitan.setForeground(Color.WHITE);
				xitan.setBounds(10, 45+25+100+25+75, 100, 50);
				JCheckBox xitan_box= new JCheckBox();
				xitan_box.setBounds(10+60, 58+25+100+25+75, 20, 20);
				xitan_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(xitan_box.isSelected()) {
							if(!name.getText().contains("Ï¡Ìµ")) {
								name.setText(name.getText()+" Ï¡Ìµ");
							}
						}else {
							if(name.getText().contains("Ï¡Ìµ")) {
								name.setText(name.getText().replace("Ï¡Ìµ", ""));
							}
						}
						
					}
				});
				this.add(xitan);
				this.add(xitan_box);

				//copy tab
				JLabel ÓÐº¹= new JLabel("ÓÐº¹:");  
				ÓÐº¹.setForeground(Color.WHITE);
				ÓÐº¹.setBounds(10+110, 20+75, 100, 50);
				JCheckBox ÓÐº¹_box= new JCheckBox();
				ÓÐº¹_box.setBounds(10+60+110, 33+75, 20, 20);
				ÓÐº¹_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÓÐº¹_box.isSelected()) {
							if(!name.getText().contains("ÓÐº¹")) {
								name.setText(name.getText()+" ÓÐº¹");
							}
						}else {
							if(name.getText().contains("ÓÐº¹")) {
								name.setText(name.getText().replace("ÓÐº¹", ""));
							}
						}
						
					}
				});
				this.add(ÓÐº¹);
				this.add(ÓÐº¹_box);	
				//copy tab
				JLabel ÎÞº¹= new JLabel("ÎÞº¹:");  
				ÎÞº¹.setForeground(Color.WHITE);
				ÎÞº¹.setBounds(10+110, 20+100, 100, 50);
				JCheckBox ÎÞº¹_box= new JCheckBox();
				ÎÞº¹_box.setBounds(10+60+110, 33+100, 20, 20);
				ÎÞº¹_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÎÞº¹_box.isSelected()) {
							if(!name.getText().contains("ÎÞº¹")) {
								name.setText(name.getText()+" ÎÞº¹");
							}
						}else {
							if(name.getText().contains("ÎÞº¹")) {
								name.setText(name.getText().replace("ÎÞº¹", ""));
							}
						}
						
					}
				});
				this.add(ÎÞº¹);
				this.add(ÎÞº¹_box);	
				//copy tab
				JLabel µÁº¹= new JLabel("µÁº¹:");  
				µÁº¹.setForeground(Color.WHITE);
				µÁº¹.setBounds(10+110, 20+125, 100, 50);
				JCheckBox µÁº¹_box= new JCheckBox();
				µÁº¹_box.setBounds(10+60+110, 33+125, 20, 20);
				µÁº¹_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(µÁº¹_box.isSelected()) {
							if(!name.getText().contains("µÁº¹")) {
								name.setText(name.getText()+" µÁº¹");
							}
						}else {
							if(name.getText().contains("µÁº¹")) {
								name.setText(name.getText().replace("µÁº¹", ""));
							}
						}
						
					}
				});
				this.add(µÁº¹);
				this.add(µÁº¹_box);	
				//copy tab
				JLabel ×Ôº¹= new JLabel("×Ôº¹:");  
				×Ôº¹.setForeground(Color.WHITE);
				×Ôº¹.setBounds(10+ 110, 20+ 150, 100, 50);
				JCheckBox ×Ôº¹_box= new JCheckBox();
				×Ôº¹_box.setBounds(10+ 60+ 110, 33+ 150, 20, 20);
				×Ôº¹_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(×Ôº¹_box.isSelected()) {
							if(!name.getText().contains("×Ôº¹")) {
								name.setText(name.getText()+" ×Ôº¹");
							}
						}else {
							if(name.getText().contains("×Ôº¹")) {
								name.setText(name.getText().replace("×Ôº¹", ""));
							}
						}
						
					}
				});
				this.add(×Ôº¹);
				this.add(×Ôº¹_box);	

				//copy tab
				JLabel º¹Õî= new JLabel("º¹Õî:");  
				º¹Õî.setForeground(Color.WHITE);
				º¹Õî.setBounds(10+110+110+110, 20+200, 100, 50);
				JCheckBox º¹Õî_box= new JCheckBox();
				º¹Õî_box.setBounds(10+60+110+110+110, 33+200, 20, 20);
				º¹Õî_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(º¹Õî_box.isSelected()) {
							if(!name.getText().contains("º¹Õî")) {
								name.setText(name.getText()+" º¹Õî");
							}
						}else {
							if(name.getText().contains("º¹Õî")) {
								name.setText(name.getText().replace("º¹Õî", ""));
							}
						}
						
					}
				});
				this.add(º¹Õî);
				this.add(º¹Õî_box);	
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