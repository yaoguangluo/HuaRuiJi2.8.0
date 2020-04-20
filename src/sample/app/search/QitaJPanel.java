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

public class QitaJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public QitaJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);
		//
		JLabel hotqichuan_filter= new JLabel("·¢ÈÈ:");  
		hotqichuan_filter.setForeground(Color.WHITE);
		hotqichuan_filter.setBounds(10, 20, 100, 50);
		JCheckBox hotqichuan_filter_box= new JCheckBox();
		hotqichuan_filter_box.setBounds(10+60, 33, 20, 20);
		hotqichuan_filter_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(hotqichuan_filter_box.isSelected()) {
					if(!name.getText().contains("·¢ÈÈ")) {
						name.setText(name.getText()+" ·¢ÈÈ");
					}
				}else {
					if(name.getText().contains("·¢ÈÈ")) {
						name.setText(name.getText().replace("·¢ÈÈ", ""));
					}
				}
				
			}
		});
		this.add(hotqichuan_filter);
		this.add(hotqichuan_filter_box);
		//
		JLabel shentongqichuan_filter= new JLabel("ÉíÍ´:");  
		shentongqichuan_filter.setForeground(Color.WHITE);
		shentongqichuan_filter.setBounds(10, 45, 100, 50);
		JCheckBox shentongqichuan_filter_box= new JCheckBox();
		shentongqichuan_filter_box.setBounds(10+60, 58, 20, 20);
		shentongqichuan_filter_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(shentongqichuan_filter_box.isSelected()) {
					if(!name.getText().contains("ÉíÍ´")) {
						name.setText(name.getText()+" ÉíÍ´");
					}
				}else {
					if(name.getText().contains("ÉíÍ´")) {
						name.setText(name.getText().replace("ÉíÍ´", ""));
					}
				}
				
			}
		});
		this.add(shentongqichuan_filter);
		this.add(shentongqichuan_filter_box);
		//
		JLabel etoutongqichuan_filter= new JLabel("¶îÍ·Í´:");  
		etoutongqichuan_filter.setForeground(Color.WHITE);
		etoutongqichuan_filter.setBounds(10, 45+25, 100, 50);
		JCheckBox etoutongqichuan_filter_box= new JCheckBox();
		etoutongqichuan_filter_box.setBounds(10+60, 58+25, 20, 20);
		etoutongqichuan_filter_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(etoutongqichuan_filter_box.isSelected()) {
					if(!name.getText().contains("¶îÍ·Í´")) {
						name.setText(name.getText()+" ¶îÍ·Í´");
					}
				}else {
					if(name.getText().contains("¶îÍ·Í´")) {
						name.setText(name.getText().replace("¶îÍ·Í´", ""));
					}
				}
				
			}
		});
		this.add(etoutongqichuan_filter);
		this.add(etoutongqichuan_filter_box);
		//copy tab
				JLabel kesou= new JLabel("¿ÈËÔ:");  
				kesou.setForeground(Color.WHITE);
				kesou.setBounds(10, 45+25+25, 100, 50);
				JCheckBox kesou_box= new JCheckBox();
				kesou_box.setBounds(10+60, 58+25+25, 20, 20);
				kesou_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(kesou_box.isSelected()) {
							if(!name.getText().contains("¿ÈËÔ")) {
								name.setText(name.getText()+" ¿ÈËÔ");
							}
						}else {
							if(name.getText().contains("¿ÈËÔ")) {
								name.setText(name.getText().replace("¿ÈËÔ", ""));
							}
						}
						
					}
				});
				this.add(kesou);
				this.add(kesou_box);
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
				JLabel toutong= new JLabel("Í·Í´:");  
				toutong.setForeground(Color.WHITE);
				toutong.setBounds(10, 45+25+100+25+100, 100, 50);
				JCheckBox toutong_box= new JCheckBox();
				toutong_box.setBounds(10+60, 58+25+100+25+100, 20, 20);
				toutong_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(toutong_box.isSelected()) {
							if(!name.getText().contains("Í·Í´")) {
								name.setText(name.getText()+" Í·Í´");
							}
						}else {
							if(name.getText().contains("Í·Í´")) {
								name.setText(name.getText().replace("Í·Í´", ""));
							}
						}
						
					}
				});
				this.add(toutong);
				this.add(toutong_box);
				//copy tab
				JLabel bozitong= new JLabel("²±×ÓÍ´:");  
				bozitong.setForeground(Color.WHITE);
				bozitong.setBounds(10, 45+25+100+25+125, 100, 50);
				JCheckBox bozitong_box= new JCheckBox();
				bozitong_box.setBounds(10+60, 58+25+100+25+125, 20, 20);
				bozitong_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(bozitong_box.isSelected()) {
							if(!name.getText().contains("²±×ÓÍ´")) {
								name.setText(name.getText()+" ²±×ÓÍ´");
							}
						}else {
							if(name.getText().contains("²±×ÓÍ´")) {
								name.setText(name.getText().replace("²±×ÓÍ´", ""));
							}
						}
						
					}
				});
				this.add(bozitong);
				this.add(bozitong_box);
				//copy tab
				JLabel xiongtong= new JLabel("ÐØÍ´:");  
				xiongtong.setForeground(Color.WHITE);
				xiongtong.setBounds(10, 45+25+100+25+150, 100, 50);
				JCheckBox xiongtong_box= new JCheckBox();
				xiongtong_box.setBounds(10+60, 58+25+100+25+150, 20, 20);
				xiongtong_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(xiongtong_box.isSelected()) {
							if(!name.getText().contains("ÐØÍ´")) {
								name.setText(name.getText()+" ÐØÍ´");
							}
						}else {
							if(name.getText().contains("ÐØÍ´")) {
								name.setText(name.getText().replace("ÐØÍ´", ""));
							}
						}
						
					}
				});
				this.add(xiongtong);
				this.add(xiongtong_box);
				//copy tab
				JLabel futong= new JLabel("¸¹Í´:");  
				futong.setForeground(Color.WHITE);
				futong.setBounds(10, 45+25+100+25+150, 100, 50);
				JCheckBox futong_box= new JCheckBox();
				futong_box.setBounds(10+60, 58+25+100+25+150, 20, 20);
				futong_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(futong_box.isSelected()) {
							if(!name.getText().contains("¸¹Í´")) {
								name.setText(name.getText()+" ¸¹Í´");
							}
						}else {
							if(name.getText().contains("¸¹Í´")) {
								name.setText(name.getText().replace("¸¹Í´", ""));
							}
						}
						
					}
				});
				this.add(futong);
				this.add(futong_box);
				//copy tab
				JLabel ¹Ø½ÚÍ´= new JLabel("¹Ø½ÚÍ´:");  
				¹Ø½ÚÍ´.setForeground(Color.WHITE);
				¹Ø½ÚÍ´.setBounds(10, 45+25+100+25+175, 100, 50);
				JCheckBox ¹Ø½ÚÍ´_box= new JCheckBox();
				¹Ø½ÚÍ´_box.setBounds(10+60, 58+25+100+25+175, 20, 20);
				¹Ø½ÚÍ´_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(¹Ø½ÚÍ´_box.isSelected()) {
							if(!name.getText().contains("¹Ø½ÚÍ´")) {
								name.setText(name.getText()+" ¹Ø½ÚÍ´");
							}
						}else {
							if(name.getText().contains("¹Ø½ÚÍ´")) {
								name.setText(name.getText().replace("¹Ø½ÚÍ´", ""));
							}
						}
						
					}
				});
				this.add(¹Ø½ÚÍ´);
				this.add(¹Ø½ÚÍ´_box);
				//copy tab
				JLabel ¿ÕÍ´= new JLabel("¿ÕÍ´:");  
				¿ÕÍ´.setForeground(Color.WHITE);
				¿ÕÍ´.setBounds(10, 45+25+100+25+200, 100, 50);
				JCheckBox ¿ÕÍ´_box= new JCheckBox();
				¿ÕÍ´_box.setBounds(10+60, 58+25+100+25+200, 20, 20);
				¿ÕÍ´_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(¿ÕÍ´_box.isSelected()) {
							if(!name.getText().contains("¿ÕÍ´")) {
								name.setText(name.getText()+" ¿ÕÍ´");
							}
						}else {
							if(name.getText().contains("¿ÕÍ´")) {
								name.setText(name.getText().replace("¿ÕÍ´", ""));
							}
						}
						
					}
				});
				this.add(¿ÕÍ´);
				this.add(¿ÕÍ´_box);
				//copy tab
				JLabel ÒþÍ´= new JLabel("ÒþÍ´:");  
				ÒþÍ´.setForeground(Color.WHITE);
				ÒþÍ´.setBounds(10, 45+25+100+25+225, 100, 50);
				JCheckBox ÒþÍ´_box= new JCheckBox();
				ÒþÍ´_box.setBounds(10+60, 58+25+100+25+225, 20, 20);
				ÒþÍ´_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÒþÍ´_box.isSelected()) {
							if(!name.getText().contains("ÒþÍ´")) {
								name.setText(name.getText()+" ÒþÍ´");
							}
						}else {
							if(name.getText().contains("ÒþÍ´")) {
								name.setText(name.getText().replace("ÒþÍ´", ""));
							}
						}
						
					}
				});
				this.add(ÒþÍ´);
				this.add(ÒþÍ´_box);
				//copy tab
				JLabel ½ÊÍ´= new JLabel("½ÊÍ´:");  
				½ÊÍ´.setForeground(Color.WHITE);
				½ÊÍ´.setBounds(10, 45+25+100+25+250, 100, 50);
				JCheckBox ½ÊÍ´_box= new JCheckBox();
				½ÊÍ´_box.setBounds(10+60, 58+25+100+25+250, 20, 20);
				½ÊÍ´_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(½ÊÍ´_box.isSelected()) {
							if(!name.getText().contains("½ÊÍ´")) {
								name.setText(name.getText()+" ½ÊÍ´");
							}
						}else {
							if(name.getText().contains("½ÊÍ´")) {
								name.setText(name.getText().replace("½ÊÍ´", ""));
							}
						}
						
					}
				});
				this.add(½ÊÍ´);
				this.add(½ÊÍ´_box);
				//copy tab
				JLabel ´ÌÍ´= new JLabel("´ÌÍ´:");  
				´ÌÍ´.setForeground(Color.WHITE);
				´ÌÍ´.setBounds(10, 45+25+100+25+275, 100, 50);
				JCheckBox ´ÌÍ´_box= new JCheckBox();
				´ÌÍ´_box.setBounds(10+60, 58+25+100+25+275, 20, 20);
				´ÌÍ´_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(´ÌÍ´_box.isSelected()) {
							if(!name.getText().contains("´ÌÍ´")) {
								name.setText(name.getText()+" ´ÌÍ´");
							}
						}else {
							if(name.getText().contains("´ÌÍ´")) {
								name.setText(name.getText().replace("´ÌÍ´", ""));
							}
						}
						
					}
				});
				this.add(´ÌÍ´);
				this.add(´ÌÍ´_box);
				//copy tab
				JLabel ¾çÍ´= new JLabel("¾çÍ´:");  
				¾çÍ´.setForeground(Color.WHITE);
				¾çÍ´.setBounds(10, 45+25+100+25+300, 100, 50);
				JCheckBox ¾çÍ´_box= new JCheckBox();
				¾çÍ´_box.setBounds(10+60, 58+25+100+25+300, 20, 20);
				¾çÍ´_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(¾çÍ´_box.isSelected()) {
							if(!name.getText().contains("¾çÍ´")) {
								name.setText(name.getText()+" ¾çÍ´");
							}
						}else {
							if(name.getText().contains("¾çÍ´")) {
								name.setText(name.getText().replace("¾çÍ´", ""));
							}
						}
						
					}
				});
				this.add(¾çÍ´);
				this.add(¾çÍ´_box);
				//copy tab
				JLabel ·´ÌøÍ´= new JLabel("·´ÌøÍ´:");  
				·´ÌøÍ´.setForeground(Color.WHITE);
				·´ÌøÍ´.setBounds(10, 45+25+100+25+325, 100, 50);
				JCheckBox ·´ÌøÍ´_box= new JCheckBox();
				·´ÌøÍ´_box.setBounds(10+60, 58+25+100+25+325, 20, 20);
				·´ÌøÍ´_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(·´ÌøÍ´_box.isSelected()) {
							if(!name.getText().contains("·´ÌøÍ´")) {
								name.setText(name.getText()+" ·´ÌøÍ´");
							}
						}else {
							if(name.getText().contains("·´ÌøÍ´")) {
								name.setText(name.getText().replace("·´ÌøÍ´", ""));
							}
						}
						
					}
				});
				this.add(·´ÌøÍ´);
				this.add(·´ÌøÍ´_box);
				//copy tab
				JLabel Ñ¹Í´= new JLabel("Ñ¹Í´:");  
				Ñ¹Í´.setForeground(Color.WHITE);
				Ñ¹Í´.setBounds(10+110, 20+0, 100, 50);
				JCheckBox Ñ¹Í´_box= new JCheckBox();
				Ñ¹Í´_box.setBounds(10+60+110, 33+0, 20, 20);
				Ñ¹Í´_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ñ¹Í´_box.isSelected()) {
							if(!name.getText().contains("Ñ¹Í´")) {
								name.setText(name.getText()+" Ñ¹Í´");
							}
						}else {
							if(name.getText().contains("Ñ¹Í´")) {
								name.setText(name.getText().replace("Ñ¹Í´", ""));
							}
						}
						
					}
				});
				this.add(Ñ¹Í´);
				this.add(Ñ¹Í´_box);
				//copy tab
				JLabel ³éÍ´= new JLabel("³éÍ´:");  
				³éÍ´.setForeground(Color.WHITE);
				³éÍ´.setBounds(10+110, 20+25, 100, 50);
				JCheckBox ³éÍ´_box= new JCheckBox();
				³éÍ´_box.setBounds(10+60+110, 33+25, 20, 20);
				³éÍ´_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(³éÍ´_box.isSelected()) {
							if(!name.getText().contains("³éÍ´")) {
								name.setText(name.getText()+" ³éÍ´");
							}
						}else {
							if(name.getText().contains("³éÍ´")) {
								name.setText(name.getText().replace("³éÍ´", ""));
							}
						}
						
					}
				});
				this.add(³éÍ´);
				this.add(³éÍ´_box);	
				//copy tab
				JLabel ×ÆÍ´= new JLabel("×ÆÍ´:");  
				×ÆÍ´.setForeground(Color.WHITE);
				×ÆÍ´.setBounds(10+110, 20+50, 100, 50);
				JCheckBox ×ÆÍ´_box= new JCheckBox();
				×ÆÍ´_box.setBounds(10+60+110, 33+50, 20, 20);
				×ÆÍ´_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(×ÆÍ´_box.isSelected()) {
							if(!name.getText().contains("×ÆÍ´")) {
								name.setText(name.getText()+" ×ÆÍ´");
							}
						}else {
							if(name.getText().contains("×ÆÍ´")) {
								name.setText(name.getText().replace("×ÆÍ´", ""));
							}
						}
						
					}
				});
				this.add(×ÆÍ´);
				this.add(×ÆÍ´_box);	
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
				JLabel ÊÖÍ´= new JLabel("ÊÖÍ´:");  
				ÊÖÍ´.setForeground(Color.WHITE);
				ÊÖÍ´.setBounds(10+110, 20+175, 100, 50);
				JCheckBox ÊÖÍ´_box= new JCheckBox();
				ÊÖÍ´_box.setBounds(10+60+110, 33+175, 20, 20);
				ÊÖÍ´_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÊÖÍ´_box.isSelected()) {
							if(!name.getText().contains("ÊÖÍ´")) {
								name.setText(name.getText()+" ÊÖÍ´");
							}
						}else {
							if(name.getText().contains("ÊÖÍ´")) {
								name.setText(name.getText().replace("ÊÖÍ´", ""));
							}
						}
						
					}
				});
				this.add(ÊÖÍ´);
				this.add(ÊÖÍ´_box);	
				//copy tab
				JLabel ½ÅÍ´= new JLabel("½ÅÍ´:");  
				½ÅÍ´.setForeground(Color.WHITE);
				½ÅÍ´.setBounds(10+110, 20+200, 100, 50);
				JCheckBox ½ÅÍ´_box= new JCheckBox();
				½ÅÍ´_box.setBounds(10+60+110, 33+200, 20, 20);
				½ÅÍ´_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(½ÅÍ´_box.isSelected()) {
							if(!name.getText().contains("½ÅÍ´")) {
								name.setText(name.getText()+" ½ÅÍ´");
							}
						}else {
							if(name.getText().contains("½ÅÍ´")) {
								name.setText(name.getText().replace("½ÅÍ´", ""));
							}
						}
						
					}
				});
				this.add(½ÅÍ´);
				this.add(½ÅÍ´_box);	
				//copy tab
				JLabel ÑüÍ´= new JLabel("ÑüÍ´:");  
				ÑüÍ´.setForeground(Color.WHITE);
				ÑüÍ´.setBounds(10+110, 20+225, 100, 50);
				JCheckBox ÑüÍ´_box= new JCheckBox();
				ÑüÍ´_box.setBounds(10+60+110, 33+225, 20, 20);
				ÑüÍ´_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÑüÍ´_box.isSelected()) {
							if(!name.getText().contains("ÑüÍ´")) {
								name.setText(name.getText()+" ÑüÍ´");
							}
						}else {
							if(name.getText().contains("ÑüÍ´")) {
								name.setText(name.getText().replace("ÑüÍ´", ""));
							}
						}
						
					}
				});
				this.add(ÑüÍ´);
				this.add(ÑüÍ´_box);	
				//copy tab
				JLabel ±³Í´= new JLabel("±³Í´:");  
				±³Í´.setForeground(Color.WHITE);
				±³Í´.setBounds(10+110, 20+250, 100, 50);
				JCheckBox ±³Í´_box= new JCheckBox();
				±³Í´_box.setBounds(10+60+110, 33+250, 20, 20);
				±³Í´_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(±³Í´_box.isSelected()) {
							if(!name.getText().contains("±³Í´")) {
								name.setText(name.getText()+" ±³Í´");
							}
						}else {
							if(name.getText().contains("±³Í´")) {
								name.setText(name.getText().replace("±³Í´", ""));
							}
						}
						
					}
				});
				this.add(±³Í´);
				this.add(±³Í´_box);	
				//copy tab
				JLabel Ö¸¼×Í´= new JLabel("Ö¸¼×Í´:");  
				Ö¸¼×Í´.setForeground(Color.WHITE);
				Ö¸¼×Í´.setBounds(10+110, 20+275, 100, 50);
				JCheckBox Ö¸¼×Í´_box= new JCheckBox();
				Ö¸¼×Í´_box.setBounds(10+60+110, 33+275, 20, 20);
				Ö¸¼×Í´_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ö¸¼×Í´_box.isSelected()) {
							if(!name.getText().contains("Ö¸¼×Í´")) {
								name.setText(name.getText()+" Ö¸¼×Í´");
							}
						}else {
							if(name.getText().contains("Ö¸¼×Í´")) {
								name.setText(name.getText().replace("Ö¸¼×Í´", ""));
							}
						}
						
					}
				});
				this.add(Ö¸¼×Í´);
				this.add(Ö¸¼×Í´_box);	
				//copy tab
				JLabel ÊÖÕÆÍ´= new JLabel("ÊÖÕÆÍ´:");  
				ÊÖÕÆÍ´.setForeground(Color.WHITE);
				ÊÖÕÆÍ´.setBounds(10+110, 20+300, 100, 50);
				JCheckBox ÊÖÕÆÍ´_box= new JCheckBox();
				ÊÖÕÆÍ´_box.setBounds(10+60+110, 33+300, 20, 20);
				ÊÖÕÆÍ´_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÊÖÕÆÍ´_box.isSelected()) {
							if(!name.getText().contains("ÊÖÕÆÍ´")) {
								name.setText(name.getText()+" ÊÖÕÆÍ´");
							}
						}else {
							if(name.getText().contains("ÊÖÕÆÍ´")) {
								name.setText(name.getText().replace("ÊÖÕÆÍ´", ""));
							}
						}
						
					}
				});
				this.add(ÊÖÕÆÍ´);
				this.add(ÊÖÕÆÍ´_box);	
				//copy tab
				JLabel ½ÅÖºÍ´= new JLabel("½ÅÖºÍ´:");  
				½ÅÖºÍ´.setForeground(Color.WHITE);
				½ÅÖºÍ´.setBounds(10+110, 20+325, 100, 50);
				JCheckBox ½ÅÖºÍ´_box= new JCheckBox();
				½ÅÖºÍ´_box.setBounds(10+60+110, 33+325, 20, 20);
				½ÅÖºÍ´_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(½ÅÖºÍ´_box.isSelected()) {
							if(!name.getText().contains("½ÅÖºÍ´")) {
								name.setText(name.getText()+" ½ÅÖºÍ´");
							}
						}else {
							if(name.getText().contains("½ÅÖºÍ´")) {
								name.setText(name.getText().replace("½ÅÖºÍ´", ""));
							}
						}
						
					}
				});
				this.add(½ÅÖºÍ´);
				this.add(½ÅÖºÍ´_box);	
				//copy tab
				JLabel Æø´­= new JLabel("Æø´­:");  
				Æø´­.setForeground(Color.WHITE);
				Æø´­.setBounds(10+110, 20+350, 100, 50);
				JCheckBox Æø´­_box= new JCheckBox();
				Æø´­_box.setBounds(10+60+110, 33+350, 20, 20);
				Æø´­_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Æø´­_box.isSelected()) {
							if(!name.getText().contains("Æø´­")) {
								name.setText(name.getText()+" Æø´­");
							}
						}else {
							if(name.getText().contains("Æø´­")) {
								name.setText(name.getText().replace("Æø´­", ""));
							}
						}
						
					}
				});
				this.add(Æø´­);
				this.add(Æø´­_box);	
				//copy tab
				JLabel Ïø´­= new JLabel("Ïø´­:");  
				Ïø´­.setForeground(Color.WHITE);
				Ïø´­.setBounds(10+110, 20+375, 100, 50);
				JCheckBox Ïø´­_box= new JCheckBox();
				Ïø´­_box.setBounds(10+60+110, 33+375, 20, 20);
				Ïø´­_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ïø´­_box.isSelected()) {
							if(!name.getText().contains("Ïø´­")) {
								name.setText(name.getText()+" Ïø´­");
							}
						}else {
							if(name.getText().contains("Ïø´­")) {
								name.setText(name.getText().replace("Ïø´­", ""));
							}
						}
						
					}
				});
				this.add(Ïø´­);
				this.add(Ïø´­_box);	
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
				JLabel ÃÎ»°= new JLabel("ÃÎ»°:");  
				ÃÎ»°.setForeground(Color.WHITE);
				ÃÎ»°.setBounds(10+110, 20+475, 100, 50);
				JCheckBox ÃÎ»°_box= new JCheckBox();
				ÃÎ»°_box.setBounds(10+60+110, 33+475, 20, 20);
				ÃÎ»°_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÃÎ»°_box.isSelected()) {
							if(!name.getText().contains("ÃÎ»°")) {
								name.setText(name.getText()+" ÃÎ»°");
							}
						}else {
							if(name.getText().contains("ÃÎ»°")) {
								name.setText(name.getText().replace("ÃÎ»°", ""));
							}
						}
						
					}
				});
				this.add(ÃÎ»°);
				this.add(ÃÎ»°_box);	
				//copy tab
				JLabel ÃÎÒÅ= new JLabel("ÃÎÒÅ:");  
				ÃÎÒÅ.setForeground(Color.WHITE);
				ÃÎÒÅ.setBounds(10+110, 20+500, 100, 50);
				JCheckBox ÃÎÒÅ_box= new JCheckBox();
				ÃÎÒÅ_box.setBounds(10+60+110, 33+500, 20, 20);
				ÃÎÒÅ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÃÎÒÅ_box.isSelected()) {
							if(!name.getText().contains("ÃÎÒÅ")) {
								name.setText(name.getText()+" ÃÎÒÅ");
							}
						}else {
							if(name.getText().contains("ÃÎÒÅ")) {
								name.setText(name.getText().replace("ÃÎÒÅ", ""));
							}
						}
						
					}
				});
				this.add(ÃÎÒÅ);
				this.add(ÃÎÒÅ_box);	
				//copy tab
				JLabel ÃÎÓÎ= new JLabel("ÃÎÓÎ:");  
				ÃÎÓÎ.setForeground(Color.WHITE);
				ÃÎÓÎ.setBounds(10+110+110, 20+0, 100, 50);
				JCheckBox ÃÎÓÎ_box= new JCheckBox();
				ÃÎÓÎ_box.setBounds(10+60+110+110, 33+0, 20, 20);
				ÃÎÓÎ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÃÎÓÎ_box.isSelected()) {
							if(!name.getText().contains("ÃÎÓÎ")) {
								name.setText(name.getText()+" ÃÎÓÎ");
							}
						}else {
							if(name.getText().contains("ÃÎÓÎ")) {
								name.setText(name.getText().replace("ÃÎÓÎ", ""));
							}
						}
						
					}
				});
				this.add(ÃÎÓÎ);
				this.add(ÃÎÓÎ_box);	
				//copy tab
				JLabel ¾ªØÊ= new JLabel("¾ªØÊ:");  
				¾ªØÊ.setForeground(Color.WHITE);
				¾ªØÊ.setBounds(10+110+110, 20+25, 100, 50);
				JCheckBox ¾ªØÊ_box= new JCheckBox();
				¾ªØÊ_box.setBounds(10+60+110+110, 33+25, 20, 20);
				¾ªØÊ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(¾ªØÊ_box.isSelected()) {
							if(!name.getText().contains("¾ªØÊ")) {
								name.setText(name.getText()+" ¾ªØÊ");
							}
						}else {
							if(name.getText().contains("¾ªØÊ")) {
								name.setText(name.getText().replace("¾ªØÊ", ""));
							}
						}
						
					}
				});
				this.add(¾ªØÊ);
				this.add(¾ªØÊ_box);	
				//copy tab
				JLabel »èÃÔ= new JLabel("»èÃÔ:");  
				»èÃÔ.setForeground(Color.WHITE);
				»èÃÔ.setBounds(10+110+110, 20+50, 100, 50);
				JCheckBox »èÃÔ_box= new JCheckBox();
				»èÃÔ_box.setBounds(10+60+110+110, 33+50, 20, 20);
				»èÃÔ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(»èÃÔ_box.isSelected()) {
							if(!name.getText().contains("»èÃÔ")) {
								name.setText(name.getText()+" »èÃÔ");
							}
						}else {
							if(name.getText().contains("»èÃÔ")) {
								name.setText(name.getText().replace("»èÃÔ", ""));
							}
						}
						
					}
				});
				this.add(»èÃÔ);
				this.add(»èÃÔ_box);	
				//copy tab
				JLabel ÖÐ·ç= new JLabel("ÖÐ·ç:");  
				ÖÐ·ç.setForeground(Color.WHITE);
				ÖÐ·ç.setBounds(10+110+110, 20+75, 100, 50);
				JCheckBox ÖÐ·ç_box= new JCheckBox();
				ÖÐ·ç_box.setBounds(10+60+110+110, 33+75, 20, 20);
				ÖÐ·ç_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÖÐ·ç_box.isSelected()) {
							if(!name.getText().contains("ÖÐ·ç")) {
								name.setText(name.getText()+" ÖÐ·ç");
							}
						}else {
							if(name.getText().contains("ÖÐ·ç")) {
								name.setText(name.getText().replace("ÖÐ·ç", ""));
							}
						}
						
					}
				});
				this.add(ÖÐ·ç);
				this.add(ÖÐ·ç_box);	
				//copy tab
				JLabel Æ«Ì±= new JLabel("Æ«Ì±:");  
				Æ«Ì±.setForeground(Color.WHITE);
				Æ«Ì±.setBounds(10+110+110, 20+100, 100, 50);
				JCheckBox Æ«Ì±_box= new JCheckBox();
				Æ«Ì±_box.setBounds(10+60+110+110, 33+100, 20, 20);
				Æ«Ì±_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Æ«Ì±_box.isSelected()) {
							if(!name.getText().contains("Æ«Ì±")) {
								name.setText(name.getText()+" Æ«Ì±");
							}
						}else {
							if(name.getText().contains("Æ«Ì±")) {
								name.setText(name.getText().replace("Æ«Ì±", ""));
							}
						}
						
					}
				});
				this.add(Æ«Ì±);
				this.add(Æ«Ì±_box);	
				//copy tab
				JLabel ±ãÑª= new JLabel("±ãÑª:");  
				±ãÑª.setForeground(Color.WHITE);
				±ãÑª.setBounds(10+110+110, 20+125, 100, 50);
				JCheckBox ±ãÑª_box= new JCheckBox();
				±ãÑª_box.setBounds(10+60+110+110, 33+125, 20, 20);
				±ãÑª_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(±ãÑª_box.isSelected()) {
							if(!name.getText().contains("±ãÑª")) {
								name.setText(name.getText()+" ±ãÑª");
							}
						}else {
							if(name.getText().contains("±ãÑª")) {
								name.setText(name.getText().replace("±ãÑª", ""));
							}
						}
						
					}
				});
				this.add(±ãÑª);
				this.add(±ãÑª_box);	
				//copy tab
				JLabel ±ã°×= new JLabel("±ã°×:");  
				±ã°×.setForeground(Color.WHITE);
				±ã°×.setBounds(10+110+110, 20+150, 100, 50);
				JCheckBox ±ã°×_box= new JCheckBox();
				±ã°×_box.setBounds(10+60+110+110, 33+150, 20, 20);
				±ã°×_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(±ã°×_box.isSelected()) {
							if(!name.getText().contains("±ã°×")) {
								name.setText(name.getText()+" ±ã°×");
							}
						}else {
							if(name.getText().contains("±ã°×")) {
								name.setText(name.getText().replace("±ã°×", ""));
							}
						}
						
					}
				});
				this.add(±ã°×);
				this.add(±ã°×_box);	
				//copy tab
				JLabel ±ãäç= new JLabel("±ãäç:");  
				±ãäç.setForeground(Color.WHITE);
				±ãäç.setBounds(10+110+110, 20+175, 100, 50);
				JCheckBox ±ãäç_box= new JCheckBox();
				±ãäç_box.setBounds(10+60+110+110, 33+175, 20, 20);
				±ãäç_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(±ãäç_box.isSelected()) {
							if(!name.getText().contains("±ãäç")) {
								name.setText(name.getText()+" ±ãäç");
							}
						}else {
							if(name.getText().contains("±ãäç")) {
								name.setText(name.getText().replace("±ãäç", ""));
							}
						}
						
					}
				});
				this.add(±ãäç);
				this.add(±ãäç_box);	
				//copy tab
				JLabel ±ãÃØ= new JLabel("±ãÃØ:");  
				±ãÃØ.setForeground(Color.WHITE);
				±ãÃØ.setBounds(10+110+110, 20+200, 100, 50);
				JCheckBox ±ãÃØ_box= new JCheckBox();
				±ãÃØ_box.setBounds(10+60+110+110, 33+200, 20, 20);
				±ãÃØ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(±ãÃØ_box.isSelected()) {
							if(!name.getText().contains("±ãÃØ")) {
								name.setText(name.getText()+" ±ãÃØ");
							}
						}else {
							if(name.getText().contains("±ãÃØ")) {
								name.setText(name.getText().replace("±ãÃØ", ""));
							}
						}
						
					}
				});
				this.add(±ãÃØ);
				this.add(±ãÃØ_box);	
				//copy tab
				JLabel ±ã¶ñ³ô= new JLabel("±ã¶ñ³ô:");  
				±ã¶ñ³ô.setForeground(Color.WHITE);
				±ã¶ñ³ô.setBounds(10+110+110, 20+225, 100, 50);
				JCheckBox ±ã¶ñ³ô_box= new JCheckBox();
				±ã¶ñ³ô_box.setBounds(10+60+110+110, 33+225, 20, 20);
				±ã¶ñ³ô_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(±ã¶ñ³ô_box.isSelected()) {
							if(!name.getText().contains("±ã¶ñ³ô")) {
								name.setText(name.getText()+" ±ã¶ñ³ô");
							}
						}else {
							if(name.getText().contains("±ã¶ñ³ô")) {
								name.setText(name.getText().replace("±ã¶ñ³ô", ""));
							}
						}
						
					}
				});
				this.add(±ã¶ñ³ô);
				this.add(±ã¶ñ³ô_box);	
				//copy tab
				JLabel ¸¹ÕÍ= new JLabel("¸¹ÕÍ:");  
				¸¹ÕÍ.setForeground(Color.WHITE);
				¸¹ÕÍ.setBounds(10+110+110, 20+250, 100, 50);
				JCheckBox ¸¹ÕÍ_box= new JCheckBox();
				¸¹ÕÍ_box.setBounds(10+60+110+110, 33+250, 20, 20);
				¸¹ÕÍ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(¸¹ÕÍ_box.isSelected()) {
							if(!name.getText().contains("¸¹ÕÍ")) {
								name.setText(name.getText()+" ¸¹ÕÍ");
							}
						}else {
							if(name.getText().contains("¸¹ÕÍ")) {
								name.setText(name.getText().replace("¸¹ÕÍ", ""));
							}
						}
						
					}
				});
				this.add(¸¹ÕÍ);
				this.add(¸¹ÕÍ_box);	
				
				//copy tab
				JLabel Æ¨¶à= new JLabel("Æ¨¶à:");  
				Æ¨¶à.setForeground(Color.WHITE);
				Æ¨¶à.setBounds(10+110+110, 20+275, 100, 50);
				JCheckBox Æ¨¶à_box= new JCheckBox();
				Æ¨¶à_box.setBounds(10+60+110+110, 33+275, 20, 20);
				Æ¨¶à_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Æ¨¶à_box.isSelected()) {
							if(!name.getText().contains("Æ¨¶à")) {
								name.setText(name.getText()+" Æ¨¶à");
							}
						}else {
							if(name.getText().contains("Æ¨¶à")) {
								name.setText(name.getText().replace("Æ¨¶à", ""));
							}
						}
						
					}
				});
				this.add(Æ¨¶à);
				this.add(Æ¨¶à_box);	
				//copy tab
				JLabel ÖÌ´¯= new JLabel("ÖÌ´¯:");  
				ÖÌ´¯.setForeground(Color.WHITE);
				ÖÌ´¯.setBounds(10+110+110, 20+300, 100, 50);
				JCheckBox ÖÌ´¯_box= new JCheckBox();
				ÖÌ´¯_box.setBounds(10+60+110+110, 33+300, 20, 20);
				ÖÌ´¯_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÖÌ´¯_box.isSelected()) {
							if(!name.getText().contains("ÖÌ´¯")) {
								name.setText(name.getText()+" ÖÌ´¯");
							}
						}else {
							if(name.getText().contains("ÖÌ´¯")) {
								name.setText(name.getText().replace("ÖÌ´¯", ""));
							}
						}
						
					}
				});
				this.add(ÖÌ´¯);
				this.add(ÖÌ´¯_box);	
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
				JLabel Ú¿Óï= new JLabel("Ú¿Óï:");  
				Ú¿Óï.setForeground(Color.WHITE);
				Ú¿Óï.setBounds(10+110+110, 20+350, 100, 50);
				JCheckBox Ú¿Óï_box= new JCheckBox();
				Ú¿Óï_box.setBounds(10+60+110+110, 33+350, 20, 20);
				Ú¿Óï_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ú¿Óï_box.isSelected()) {
							if(!name.getText().contains("Ú¿Óï")) {
								name.setText(name.getText()+" Ú¿Óï");
							}
						}else {
							if(name.getText().contains("Ú¿Óï")) {
								name.setText(name.getText().replace("Ú¿Óï", ""));
							}
						}
						
					}
				});
				this.add(Ú¿Óï);
				this.add(Ú¿Óï_box);	
				//copy tab
				JLabel Ê§Òô= new JLabel("Ê§Òô:");  
				Ê§Òô.setForeground(Color.WHITE);
				Ê§Òô.setBounds(10+110+110, 20+375, 100, 50);
				JCheckBox Ê§Òô_box= new JCheckBox();
				Ê§Òô_box.setBounds(10+60+110+110, 33+375, 20, 20);
				Ê§Òô_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ê§Òô_box.isSelected()) {
							if(!name.getText().contains("Ê§Òô")) {
								name.setText(name.getText()+" Ê§Òô");
							}
						}else {
							if(name.getText().contains("Ê§Òô")) {
								name.setText(name.getText().replace("Ê§Òô", ""));
							}
						}
						
					}
				});
				this.add(Ê§Òô);
				this.add(Ê§Òô_box);	
				//copy tab
				JLabel É¤Í´= new JLabel("É¤Í´:");  
				É¤Í´.setForeground(Color.WHITE);
				É¤Í´.setBounds(10+110+110, 20+400, 100, 50);
				JCheckBox É¤Í´_box= new JCheckBox();
				É¤Í´_box.setBounds(10+60+110+110, 33+400, 20, 20);
				É¤Í´_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(É¤Í´_box.isSelected()) {
							if(!name.getText().contains("É¤Í´")) {
								name.setText(name.getText()+" É¤Í´");
							}
						}else {
							if(name.getText().contains("É¤Í´")) {
								name.setText(name.getText().replace("É¤Í´", ""));
							}
						}
						
					}
				});
				this.add(É¤Í´);
				this.add(É¤Í´_box);	
				//copy tab
				JLabel ¶ñÐÄ= new JLabel("¶ñÐÄ:");  
				¶ñÐÄ.setForeground(Color.WHITE);
				¶ñÐÄ.setBounds(10+110+110, 20+425, 100, 50);
				JCheckBox ¶ñÐÄ_box= new JCheckBox();
				¶ñÐÄ_box.setBounds(10+60+110+110, 33+425, 20, 20);
				¶ñÐÄ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(¶ñÐÄ_box.isSelected()) {
							if(!name.getText().contains("¶ñÐÄ")) {
								name.setText(name.getText()+" ¶ñÐÄ");
							}
						}else {
							if(name.getText().contains("¶ñÐÄ")) {
								name.setText(name.getText().replace("¶ñÐÄ", ""));
							}
						}
						
					}
				});
				this.add(¶ñÐÄ);
				this.add(¶ñÐÄ_box);	
				//copy tab
				JLabel ·´Î¸= new JLabel("·´Î¸:");  
				·´Î¸.setForeground(Color.WHITE);
				·´Î¸.setBounds(10+110+110, 20+450, 100, 50);
				JCheckBox ·´Î¸_box= new JCheckBox();
				·´Î¸_box.setBounds(10+60+110+110, 33+450, 20, 20);
				·´Î¸_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(·´Î¸_box.isSelected()) {
							if(!name.getText().contains("·´Î¸")) {
								name.setText(name.getText()+" ·´Î¸");
							}
						}else {
							if(name.getText().contains("·´Î¸")) {
								name.setText(name.getText().replace("·´Î¸", ""));
							}
						}
						
					}
				});
				this.add(·´Î¸);
				this.add(·´Î¸_box);	
				//copy tab
				JLabel Å»ÍÂ= new JLabel("Å»ÍÂ:");  
				Å»ÍÂ.setForeground(Color.WHITE);
				Å»ÍÂ.setBounds(10+110+110, 20+475, 100, 50);
				JCheckBox Å»ÍÂ_box= new JCheckBox();
				Å»ÍÂ_box.setBounds(10+60+110+110, 33+475, 20, 20);
				Å»ÍÂ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Å»ÍÂ_box.isSelected()) {
							if(!name.getText().contains("Å»ÍÂ")) {
								name.setText(name.getText()+" Å»ÍÂ");
							}
						}else {
							if(name.getText().contains("Å»ÍÂ")) {
								name.setText(name.getText().replace("Å»ÍÂ", ""));
							}
						}
						
					}
				});
				this.add(Å»ÍÂ);
				this.add(Å»ÍÂ_box);	
				//copy tab
				JLabel ÍÂÑª= new JLabel("ÍÂÑª:");  
				ÍÂÑª.setForeground(Color.WHITE);
				ÍÂÑª.setBounds(10+110+110, 20+500, 100, 50);
				JCheckBox ÍÂÑª_box= new JCheckBox();
				ÍÂÑª_box.setBounds(10+60+110+110, 33+500, 20, 20);
				ÍÂÑª_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÍÂÑª_box.isSelected()) {
							if(!name.getText().contains("ÍÂÑª")) {
								name.setText(name.getText()+" ÍÂÑª");
							}
						}else {
							if(name.getText().contains("ÍÂÑª")) {
								name.setText(name.getText().replace("ÍÂÑª", ""));
							}
						}
						
					}
				});
				this.add(ÍÂÑª);
				this.add(ÍÂÑª_box);	
				//copy tab
				JLabel ÍÂ°×Ä­= new JLabel("ÍÂ°×Ä­:");  
				ÍÂ°×Ä­.setForeground(Color.WHITE);
				ÍÂ°×Ä­.setBounds(10+110+110+110, 20+0, 100, 50);
				JCheckBox ÍÂ°×Ä­_box= new JCheckBox();
				ÍÂ°×Ä­_box.setBounds(10+60+110+110+110, 33+0, 20, 20);
				ÍÂ°×Ä­_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÍÂ°×Ä­_box.isSelected()) {
							if(!name.getText().contains("ÍÂ°×Ä­")) {
								name.setText(name.getText()+" ÍÂ°×Ä­");
							}
						}else {
							if(name.getText().contains("ÍÂ°×Ä­")) {
								name.setText(name.getText().replace("ÍÂ°×Ä­", ""));
							}
						}
						
					}
				});
				this.add(ÍÂ°×Ä­);
				this.add(ÍÂ°×Ä­_box);	
				//copy tab
				JLabel ·¢Àä= new JLabel("·¢Àä:");  
				·¢Àä.setForeground(Color.WHITE);
				·¢Àä.setBounds(10+110+110+110, 20+25, 100, 50);
				JCheckBox ·¢Àä_box= new JCheckBox();
				·¢Àä_box.setBounds(10+60+110+110+110, 33+25, 20, 20);
				·¢Àä_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(·¢Àä_box.isSelected()) {
							if(!name.getText().contains("·¢Àä")) {
								name.setText(name.getText()+" ·¢Àä");
							}
						}else {
							if(name.getText().contains("·¢Àä")) {
								name.setText(name.getText().replace("·¢Àä", ""));
							}
						}
						
					}
				});
				this.add(·¢Àä);
				this.add(·¢Àä_box);	
				//copy tab
				JLabel Å§Ñª= new JLabel("Å§Ñª:");  
				Å§Ñª.setForeground(Color.WHITE);
				Å§Ñª.setBounds(10+110+110+110, 20+50, 100, 50);
				JCheckBox Å§Ñª_box= new JCheckBox();
				Å§Ñª_box.setBounds(10+60+110+110+110, 33+50, 20, 20);
				Å§Ñª_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Å§Ñª_box.isSelected()) {
							if(!name.getText().contains("Å§Ñª")) {
								name.setText(name.getText()+" Å§Ñª");
							}
						}else {
							if(name.getText().contains("Å§Ñª")) {
								name.setText(name.getText().replace("Å§Ñª", ""));
							}
						}
						
					}
				});
				this.add(Å§Ñª);
				this.add(Å§Ñª_box);	
				//copy tab
				JLabel Æ¤Ñ×= new JLabel("Æ¤Ñ×:");  
				Æ¤Ñ×.setForeground(Color.WHITE);
				Æ¤Ñ×.setBounds(10+110+110+110, 20+75, 100, 50);
				JCheckBox Æ¤Ñ×_box= new JCheckBox();
				Æ¤Ñ×_box.setBounds(10+60+110+110+110, 33+75, 20, 20);
				Æ¤Ñ×_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Æ¤Ñ×_box.isSelected()) {
							if(!name.getText().contains("Æ¤Ñ×")) {
								name.setText(name.getText()+" Æ¤Ñ×");
							}
						}else {
							if(name.getText().contains("Æ¤Ñ×")) {
								name.setText(name.getText().replace("Æ¤Ñ×", ""));
							}
						}
						
					}
				});
				this.add(Æ¤Ñ×);
				this.add(Æ¤Ñ×_box);	
				
				//copy tab
				JLabel ðåÕî= new JLabel("ðåÕî:");  
				ðåÕî.setForeground(Color.WHITE);
				ðåÕî.setBounds(10+110+110+110, 20+100, 100, 50);
				JCheckBox ðåÕî_box= new JCheckBox();
				ðåÕî_box.setBounds(10+60+110+110+110, 33+100, 20, 20);
				ðåÕî_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ðåÕî_box.isSelected()) {
							if(!name.getText().contains("ðåÕî")) {
								name.setText(name.getText()+" ðåÕî");
							}
						}else {
							if(name.getText().contains("ðåÕî")) {
								name.setText(name.getText().replace("ðåÕî", ""));
							}
						}
						
					}
				});
				this.add(ðåÕî);
				this.add(ðåÕî_box);	
				//copy tab
				JLabel ·çÕî= new JLabel("·çÕî:");  
				·çÕî.setForeground(Color.WHITE);
				·çÕî.setBounds(10+110+110+110, 20+125, 100, 50);
				JCheckBox ·çÕî_box= new JCheckBox();
				·çÕî_box.setBounds(10+60+110+110+110, 33+125, 20, 20);
				·çÕî_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(·çÕî_box.isSelected()) {
							if(!name.getText().contains("·çÕî")) {
								name.setText(name.getText()+" ·çÕî");
							}
						}else {
							if(name.getText().contains("·çÕî")) {
								name.setText(name.getText().replace("·çÕî", ""));
							}
						}
						
					}
				});
				this.add(·çÕî);
				this.add(·çÕî_box);	
				//copy tab
				JLabel ÂéÕî= new JLabel("ÂéÕî:");  
				ÂéÕî.setForeground(Color.WHITE);
				ÂéÕî.setBounds(10+110+110+110, 20+150, 100, 50);
				JCheckBox ÂéÕî_box= new JCheckBox();
				ÂéÕî_box.setBounds(10+60+110+110+110, 33+150, 20, 20);
				ÂéÕî_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÂéÕî_box.isSelected()) {
							if(!name.getText().contains("ÂéÕî")) {
								name.setText(name.getText()+" ÂéÕî");
							}
						}else {
							if(name.getText().contains("ÂéÕî")) {
								name.setText(name.getText().replace("ÂéÕî", ""));
							}
						}
						
					}
				});
				this.add(ÂéÕî);
				this.add(ÂéÕî_box);	
				//copy tab
				JLabel ÊªÕî= new JLabel("ÊªÕî:");  
				ÊªÕî.setForeground(Color.WHITE);
				ÊªÕî.setBounds(10+110+110+110, 20+175, 100, 50);
				JCheckBox ÊªÕî_box= new JCheckBox();
				ÊªÕî_box.setBounds(10+60+110+110+110, 33+175, 20, 20);
				ÊªÕî_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÊªÕî_box.isSelected()) {
							if(!name.getText().contains("ÊªÕî")) {
								name.setText(name.getText()+" ÊªÕî");
							}
						}else {
							if(name.getText().contains("ÊªÕî")) {
								name.setText(name.getText().replace("ÊªÕî", ""));
							}
						}
						
					}
				});
				this.add(ÊªÕî);
				this.add(ÊªÕî_box);	
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
				//copy tab
				JLabel Ã·¶¾= new JLabel("Ã·¶¾:");  
				Ã·¶¾.setForeground(Color.WHITE);
				Ã·¶¾.setBounds(10+110+110+110, 20+225, 100, 50);
				JCheckBox Ã·¶¾_box= new JCheckBox();
				Ã·¶¾_box.setBounds(10+60+110+110+110, 33+225, 20, 20);
				Ã·¶¾_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ã·¶¾_box.isSelected()) {
							if(!name.getText().contains("Ã·¶¾")) {
								name.setText(name.getText()+" Ã·¶¾");
							}
						}else {
							if(name.getText().contains("Ã·¶¾")) {
								name.setText(name.getText().replace("Ã·¶¾", ""));
							}
						}
						
					}
				});
				this.add(Ã·¶¾);
				this.add(Ã·¶¾_box);	
				//copy tab
				JLabel Ö§Ô­Ìå²¡= new JLabel("Ö§Ô­Ìå²¡:");  
				Ö§Ô­Ìå²¡.setForeground(Color.WHITE);
				Ö§Ô­Ìå²¡.setBounds(10+110+110+110, 20+250, 100, 50);
				JCheckBox Ö§Ô­Ìå²¡_box= new JCheckBox();
				Ö§Ô­Ìå²¡_box.setBounds(10+60+110+110+110, 33+250, 20, 20);
				Ö§Ô­Ìå²¡_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ö§Ô­Ìå²¡_box.isSelected()) {
							if(!name.getText().contains("Ö§Ô­Ìå²¡")) {
								name.setText(name.getText()+" Ö§Ô­Ìå²¡");
							}
						}else {
							if(name.getText().contains("Ö§Ô­Ìå²¡")) {
								name.setText(name.getText().replace("Ö§Ô­Ìå²¡", ""));
							}
						}
						
					}
				});
				this.add(Ö§Ô­Ìå²¡);
				this.add(Ö§Ô­Ìå²¡_box);	
				//copy tab
				JLabel ÒÂÔ­Ìå²¡= new JLabel("ÒÂÔ­Ìå²¡:");  
				ÒÂÔ­Ìå²¡.setForeground(Color.WHITE);
				ÒÂÔ­Ìå²¡.setBounds(10+110+110+110, 20+275, 100, 50);
				JCheckBox ÒÂÔ­Ìå²¡_box= new JCheckBox();
				ÒÂÔ­Ìå²¡_box.setBounds(10+60+110+110+110, 33+275, 20, 20);
				ÒÂÔ­Ìå²¡_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÒÂÔ­Ìå²¡_box.isSelected()) {
							if(!name.getText().contains("ÒÂÔ­Ìå²¡")) {
								name.setText(name.getText()+" ÒÂÔ­Ìå²¡");
							}
						}else {
							if(name.getText().contains("ÒÂÔ­Ìå²¡")) {
								name.setText(name.getText().replace("ÒÂÔ­Ìå²¡", ""));
							}
						}
						
					}
				});
				this.add(ÒÂÔ­Ìå²¡);
				this.add(ÒÂÔ­Ìå²¡_box);	
				//copy tab
				JLabel ²¡¶¾¸ÐÈ¾= new JLabel("²¡¶¾¸ÐÈ¾:");  
				²¡¶¾¸ÐÈ¾.setForeground(Color.WHITE);
				²¡¶¾¸ÐÈ¾.setBounds(10+110+110+110, 20+300, 100, 50);
				JCheckBox ²¡¶¾¸ÐÈ¾_box= new JCheckBox();
				²¡¶¾¸ÐÈ¾_box.setBounds(10+60+110+110+110, 33+300, 20, 20);
				²¡¶¾¸ÐÈ¾_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(²¡¶¾¸ÐÈ¾_box.isSelected()) {
							if(!name.getText().contains("²¡¶¾¸ÐÈ¾")) {
								name.setText(name.getText()+" ²¡¶¾¸ÐÈ¾");
							}
						}else {
							if(name.getText().contains("²¡¶¾¸ÐÈ¾")) {
								name.setText(name.getText().replace("²¡¶¾¸ÐÈ¾", ""));
							}
						}
						
					}
				});
				this.add(²¡¶¾¸ÐÈ¾);
				this.add(²¡¶¾¸ÐÈ¾_box);	
				//copy tab
				JLabel ¿ñÈ®²¡¶¾= new JLabel("¿ñÈ®²¡¶¾:");  
				¿ñÈ®²¡¶¾.setForeground(Color.WHITE);
				¿ñÈ®²¡¶¾.setBounds(10+110+110+110, 20+325, 100, 50);
				JCheckBox ¿ñÈ®²¡¶¾_box= new JCheckBox();
				¿ñÈ®²¡¶¾_box.setBounds(10+60+110+110+110, 33+325, 20, 20);
				¿ñÈ®²¡¶¾_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(¿ñÈ®²¡¶¾_box.isSelected()) {
							if(!name.getText().contains("¿ñÈ®²¡¶¾")) {
								name.setText(name.getText()+" ¿ñÈ®²¡¶¾");
							}
						}else {
							if(name.getText().contains("¿ñÈ®²¡¶¾")) {
								name.setText(name.getText().replace("¿ñÈ®²¡¶¾", ""));
							}
						}
						
					}
				});
				this.add(¿ñÈ®²¡¶¾);
				this.add(¿ñÈ®²¡¶¾_box);	
				//copy tab
				JLabel ÆÆÉú·ç= new JLabel("ÆÆÉú·ç:");  
				ÆÆÉú·ç.setForeground(Color.WHITE);
				ÆÆÉú·ç.setBounds(10+110+110+110, 20+350, 100, 50);
				JCheckBox ÆÆÉú·ç_box= new JCheckBox();
				ÆÆÉú·ç_box.setBounds(10+60+110+110+110, 33+350, 20, 20);
				ÆÆÉú·ç_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÆÆÉú·ç_box.isSelected()) {
							if(!name.getText().contains("ÆÆÉú·ç")) {
								name.setText(name.getText()+" ÆÆÉú·ç");
							}
						}else {
							if(name.getText().contains("ÆÆÉú·ç")) {
								name.setText(name.getText().replace("ÆÆÉú·ç", ""));
							}
						}
						
					}
				});
				this.add(ÆÆÉú·ç);
				this.add(ÆÆÉú·ç_box);	
				//copy tab
				JLabel ¹ÇÕÛ= new JLabel("¹ÇÕÛ:");  
				¹ÇÕÛ.setForeground(Color.WHITE);
				¹ÇÕÛ.setBounds(10+110+110+110, 20+375, 100, 50);
				JCheckBox ¹ÇÕÛ_box= new JCheckBox();
				¹ÇÕÛ_box.setBounds(10+60+110+110+110, 33+375, 20, 20);
				¹ÇÕÛ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(¹ÇÕÛ_box.isSelected()) {
							if(!name.getText().contains("¹ÇÕÛ")) {
								name.setText(name.getText()+" ¹ÇÕÛ");
							}
						}else {
							if(name.getText().contains("¹ÇÕÛ")) {
								name.setText(name.getText().replace("¹ÇÕÛ", ""));
							}
						}
						
					}
				});
				this.add(¹ÇÕÛ);
				this.add(¹ÇÕÛ_box);	
				//copy tab
				JLabel ¹ÇÖÊÊèËÉ= new JLabel("¹ÇÖÊÊèËÉ:");  
				¹ÇÖÊÊèËÉ.setForeground(Color.WHITE);
				¹ÇÖÊÊèËÉ.setBounds(10+110+110+110, 20+400, 100, 50);
				JCheckBox ¹ÇÖÊÊèËÉ_box= new JCheckBox();
				¹ÇÖÊÊèËÉ_box.setBounds(10+60+110+110+110, 33+400, 20, 20);
				¹ÇÖÊÊèËÉ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(¹ÇÖÊÊèËÉ_box.isSelected()) {
							if(!name.getText().contains("¹ÇÖÊÊèËÉ")) {
								name.setText(name.getText()+" ¹ÇÖÊÊèËÉ");
							}
						}else {
							if(name.getText().contains("¹ÇÖÊÊèËÉ")) {
								name.setText(name.getText().replace("¹ÇÖÊÊèËÉ", ""));
							}
						}
						
					}
				});
				this.add(¹ÇÖÊÊèËÉ);
				this.add(¹ÇÖÊÊèËÉ_box);	
				//copy tab
				JLabel ÑÀÍ´= new JLabel("ÑÀÍ´:");  
				ÑÀÍ´.setForeground(Color.WHITE);
				ÑÀÍ´.setBounds(10+110+110+110, 20+425, 100, 50);
				JCheckBox ÑÀÍ´_box= new JCheckBox();
				ÑÀÍ´_box.setBounds(10+60+110+110+110, 33+425, 20, 20);
				ÑÀÍ´_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÑÀÍ´_box.isSelected()) {
							if(!name.getText().contains("ÑÀÍ´")) {
								name.setText(name.getText()+" ÑÀÍ´");
							}
						}else {
							if(name.getText().contains("ÑÀÍ´")) {
								name.setText(name.getText().replace("ÑÀÍ´", ""));
							}
						}
						
					}
				});
				this.add(ÑÀÍ´);
				this.add(ÑÀÍ´_box);	
				//copy tab
				JLabel »³ÔÐ= new JLabel("»³ÔÐ:");  
				»³ÔÐ.setForeground(Color.WHITE);
				»³ÔÐ.setBounds(10+110+110+110, 20+450, 100, 50);
				JCheckBox »³ÔÐ_box= new JCheckBox();
				»³ÔÐ_box.setBounds(10+60+110+110+110, 33+450, 20, 20);
				»³ÔÐ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(»³ÔÐ_box.isSelected()) {
							if(!name.getText().contains("»³ÔÐ")) {
								name.setText(name.getText()+" »³ÔÐ");
							}
						}else {
							if(name.getText().contains("»³ÔÐ")) {
								name.setText(name.getText().replace("»³ÔÐ", ""));
							}
						}
						
					}
				});
				this.add(»³ÔÐ);
				this.add(»³ÔÐ_box);	
				//copy tab
				JLabel ÄÑ²ú= new JLabel("ÄÑ²ú:");  
				ÄÑ²ú.setForeground(Color.WHITE);
				ÄÑ²ú.setBounds(10+110+110+110, 20+475, 100, 50);
				JCheckBox ÄÑ²ú_box= new JCheckBox();
				ÄÑ²ú_box.setBounds(10+60+110+110+110, 33+475, 20, 20);
				ÄÑ²ú_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÄÑ²ú_box.isSelected()) {
							if(!name.getText().contains("ÄÑ²ú")) {
								name.setText(name.getText()+" ÄÑ²ú");
							}
						}else {
							if(name.getText().contains("ÄÑ²ú")) {
								name.setText(name.getText().replace("ÄÑ²ú", ""));
							}
						}
						
					}
				});
				this.add(ÄÑ²ú);
				this.add(ÄÑ²ú_box);	
				//copy tab
				JLabel ´øÏÂ= new JLabel("´øÏÂ:");  
				´øÏÂ.setForeground(Color.WHITE);
				´øÏÂ.setBounds(10+110+110+110, 20+500, 100, 50);
				JCheckBox ´øÏÂ_box= new JCheckBox();
				´øÏÂ_box.setBounds(10+60+110+110+110, 33+500, 20, 20);
				´øÏÂ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(´øÏÂ_box.isSelected()) {
							if(!name.getText().contains("´øÏÂ")) {
								name.setText(name.getText()+" ´øÏÂ");
							}
						}else {
							if(name.getText().contains("´øÏÂ")) {
								name.setText(name.getText().replace("´øÏÂ", ""));
							}
						}
						
					}
				});
				this.add(´øÏÂ);
				this.add(´øÏÂ_box);	
				//copy tab
				JLabel ÃÀÈÝ= new JLabel("ÃÀÈÝ:");  
				ÃÀÈÝ.setForeground(Color.WHITE);
				ÃÀÈÝ.setBounds(10+110+110+220, 20+0, 100, 50);
				JCheckBox ÃÀÈÝ_box= new JCheckBox();
				ÃÀÈÝ_box.setBounds(10+60+110+110+220, 33+0, 20, 20);
				ÃÀÈÝ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÃÀÈÝ_box.isSelected()) {
							if(!name.getText().contains("ÃÀÈÝ")) {
								name.setText(name.getText()+" ÃÀÈÝ");
							}
						}else {
							if(name.getText().contains("ÃÀÈÝ")) {
								name.setText(name.getText().replace("ÃÀÈÝ", ""));
							}
						}
						
					}
				});
				this.add(ÃÀÈÝ);
				this.add(ÃÀÈÝ_box);	
				//copy tab
				JLabel »¤·ô= new JLabel("»¤·ô:");  
				»¤·ô.setForeground(Color.WHITE);
				»¤·ô.setBounds(10+110+110+220, 20+25, 100, 50);
				JCheckBox »¤·ô_box= new JCheckBox();
				»¤·ô_box.setBounds(10+60+110+110+220, 33+25, 20, 20);
				»¤·ô_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(»¤·ô_box.isSelected()) {
							if(!name.getText().contains("»¤·ô")) {
								name.setText(name.getText()+" »¤·ô");
							}
						}else {
							if(name.getText().contains("»¤·ô")) {
								name.setText(name.getText().replace("»¤·ô", ""));
							}
						}
						
					}
				});
				this.add(»¤·ô);
				this.add(»¤·ô_box);	
				//copy tab
				JLabel Éú·¢= new JLabel("Éú·¢:");  
				Éú·¢.setForeground(Color.WHITE);
				Éú·¢.setBounds(10+110+110+220, 20+50, 100, 50);
				JCheckBox Éú·¢_box= new JCheckBox();
				Éú·¢_box.setBounds(10+60+110+110+220, 33+50, 20, 20);
				Éú·¢_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Éú·¢_box.isSelected()) {
							if(!name.getText().contains("Éú·¢")) {
								name.setText(name.getText()+" Éú·¢");
							}
						}else {
							if(name.getText().contains("Éú·¢")) {
								name.setText(name.getText().replace("Éú·¢", ""));
							}
						}
						
					}
				});
				this.add(Éú·¢);
				this.add(Éú·¢_box);	
				//copy tab
				JLabel Ã÷Ä¿= new JLabel("Ã÷Ä¿:");  
				Ã÷Ä¿.setForeground(Color.WHITE);
				Ã÷Ä¿.setBounds(10+110+110+220, 20+75, 100, 50);
				JCheckBox Ã÷Ä¿_box= new JCheckBox();
				Ã÷Ä¿_box.setBounds(10+60+110+110+220, 33+75, 20, 20);
				Ã÷Ä¿_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ã÷Ä¿_box.isSelected()) {
							if(!name.getText().contains("Ã÷Ä¿")) {
								name.setText(name.getText()+" Ã÷Ä¿");
							}
						}else {
							if(name.getText().contains("Ã÷Ä¿")) {
								name.setText(name.getText().replace("Ã÷Ä¿", ""));
							}
						}
						
					}
				});
				this.add(Ã÷Ä¿);
				this.add(Ã÷Ä¿_box);	
				//copy tab
				JLabel Èóºí= new JLabel("Èóºí:");  
				Èóºí.setForeground(Color.WHITE);
				Èóºí.setBounds(10+110+110+220, 20+100, 100, 50);
				JCheckBox Èóºí_box= new JCheckBox();
				Èóºí_box.setBounds(10+60+110+110+220, 33+100, 20, 20);
				Èóºí_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Èóºí_box.isSelected()) {
							if(!name.getText().contains("Èóºí")) {
								name.setText(name.getText()+" Èóºí");
							}
						}else {
							if(name.getText().contains("Èóºí")) {
								name.setText(name.getText().replace("Èóºí", ""));
							}
						}
						
					}
				});
				this.add(Èóºí);
				this.add(Èóºí_box);	
				//copy tab
				JLabel ½âÉß¶¾= new JLabel("½âÉß¶¾:");  
				½âÉß¶¾.setForeground(Color.WHITE);
				½âÉß¶¾.setBounds(10+110+110+220, 20+125, 100, 50);
				JCheckBox ½âÉß¶¾_box= new JCheckBox();
				½âÉß¶¾_box.setBounds(10+60+110+110+220, 33+125, 20, 20);
				½âÉß¶¾_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(½âÉß¶¾_box.isSelected()) {
							if(!name.getText().contains("½âÉß¶¾")) {
								name.setText(name.getText()+" ½âÉß¶¾");
							}
						}else {
							if(name.getText().contains("½âÉß¶¾")) {
								name.setText(name.getText().replace("½âÉß¶¾", ""));
							}
						}
						
					}
				});
				this.add(½âÉß¶¾);
				this.add(½âÉß¶¾_box);	
				//copy tab
				JLabel ÓªÑø= new JLabel("ÓªÑø:");  
				ÓªÑø.setForeground(Color.WHITE);
				ÓªÑø.setBounds(10+110+110+220, 20+150, 100, 50);
				JCheckBox ÓªÑø_box= new JCheckBox();
				ÓªÑø_box.setBounds(10+60+110+110+220, 33+150, 20, 20);
				ÓªÑø_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÓªÑø_box.isSelected()) {
							if(!name.getText().contains("ÓªÑø")) {
								name.setText(name.getText()+" ÓªÑø");
							}
						}else {
							if(name.getText().contains("ÓªÑø")) {
								name.setText(name.getText().replace("ÓªÑø", ""));
							}
						}
						
					}
				});
				this.add(ÓªÑø);
				this.add(ÓªÑø_box);	
				//copy tab
				JLabel ¶úÁû= new JLabel("¶úÁû:");  
				¶úÁû.setForeground(Color.WHITE);
				¶úÁû.setBounds(10+110+110+220, 20+175, 100, 50);
				JCheckBox ¶úÁû_box= new JCheckBox();
				¶úÁû_box.setBounds(10+60+110+110+220, 33+175, 20, 20);
				¶úÁû_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(¶úÁû_box.isSelected()) {
							if(!name.getText().contains("¶úÁû")) {
								name.setText(name.getText()+" ¶úÁû");
							}
						}else {
							if(name.getText().contains("¶úÁû")) {
								name.setText(name.getText().replace("¶úÁû", ""));
							}
						}
						
					}
				});
				this.add(¶úÁû);
				this.add(¶úÁû_box);	
				//copy tab
				JLabel ÔÂ¾­²»µ÷= new JLabel("ÔÂ¾­²»µ÷:");  
				ÔÂ¾­²»µ÷.setForeground(Color.WHITE);
				ÔÂ¾­²»µ÷.setBounds(10+110+110+220, 20+200, 100, 50);
				JCheckBox ÔÂ¾­²»µ÷_box= new JCheckBox();
				ÔÂ¾­²»µ÷_box.setBounds(10+60+110+110+220, 33+200, 20, 20);
				ÔÂ¾­²»µ÷_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÔÂ¾­²»µ÷_box.isSelected()) {
							if(!name.getText().contains("ÔÂ¾­²»µ÷")) {
								name.setText(name.getText()+" ÔÂ¾­²»µ÷");
							}
						}else {
							if(name.getText().contains("ÔÂ¾­²»µ÷")) {
								name.setText(name.getText().replace("ÔÂ¾­²»µ÷", ""));
							}
						}
						
					}
				});
				this.add(ÔÂ¾­²»µ÷);
				this.add(ÔÂ¾­²»µ÷_box);	
				//copy tab
				JLabel È¸Ä¿= new JLabel("È¸Ä¿:");  
				È¸Ä¿.setForeground(Color.WHITE);
				È¸Ä¿.setBounds(10+110+110+220, 20+225, 100, 50);
				JCheckBox È¸Ä¿_box= new JCheckBox();
				È¸Ä¿_box.setBounds(10+60+110+110+220, 33+225, 20, 20);
				È¸Ä¿_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(È¸Ä¿_box.isSelected()) {
							if(!name.getText().contains("È¸Ä¿")) {
								name.setText(name.getText()+" È¸Ä¿");
							}
						}else {
							if(name.getText().contains("È¸Ä¿")) {
								name.setText(name.getText().replace("È¸Ä¿", ""));
							}
						}
						
					}
				});
				this.add(È¸Ä¿);
				this.add(È¸Ä¿_box);	
				//copy tab
				JLabel Ó¸´¯Å§¸í= new JLabel("Ó¸´¯Å§¸í:");  
				Ó¸´¯Å§¸í.setForeground(Color.WHITE);
				Ó¸´¯Å§¸í.setBounds(10+110+110+220, 20+250, 100, 50);
				JCheckBox Ó¸´¯Å§¸í_box= new JCheckBox();
				Ó¸´¯Å§¸í_box.setBounds(10+60+110+110+220, 33+250, 20, 20);
				Ó¸´¯Å§¸í_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ó¸´¯Å§¸í_box.isSelected()) {
							if(!name.getText().contains("Ó¸´¯Å§¸í")) {
								name.setText(name.getText()+" Ó¸´¯Å§¸í");
							}
						}else {
							if(name.getText().contains("Ó¸´¯Å§¸í")) {
								name.setText(name.getText().replace("Ó¸´¯Å§¸í", ""));
							}
						}
						
					}
				});
				this.add(Ó¸´¯Å§¸í);
				this.add(Ó¸´¯Å§¸í_box);	
				//copy tab
				JLabel ÀÍÀÛËùÉË= new JLabel("ÀÍÀÛËùÉË:");  
				ÀÍÀÛËùÉË.setForeground(Color.WHITE);
				ÀÍÀÛËùÉË.setBounds(10+110+110+220, 20+275, 100, 50);
				JCheckBox ÀÍÀÛËùÉË_box= new JCheckBox();
				ÀÍÀÛËùÉË_box.setBounds(10+60+110+110+220, 33+275, 20, 20);
				ÀÍÀÛËùÉË_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÀÍÀÛËùÉË_box.isSelected()) {
							if(!name.getText().contains("ÀÍÀÛËùÉË")) {
								name.setText(name.getText()+" ÀÍÀÛËùÉË");
							}
						}else {
							if(name.getText().contains("ÀÍÀÛËùÉË")) {
								name.setText(name.getText().replace("ÀÍÀÛËùÉË", ""));
							}
						}
						
					}
				});
				this.add(ÀÍÀÛËùÉË);
				this.add(ÀÍÀÛËùÉË_box);	
				//copy tab
				JLabel Æ¢Æø±©ÁÒ= new JLabel("Æ¢Æø±©ÁÒ:");  
				Æ¢Æø±©ÁÒ.setForeground(Color.WHITE);
				Æ¢Æø±©ÁÒ.setBounds(10+110+110+220, 20+300, 100, 50);
				JCheckBox Æ¢Æø±©ÁÒ_box= new JCheckBox();
				Æ¢Æø±©ÁÒ_box.setBounds(10+60+110+110+220, 33+300, 20, 20);
				Æ¢Æø±©ÁÒ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Æ¢Æø±©ÁÒ_box.isSelected()) {
							if(!name.getText().contains("Æ¢Æø±©ÁÒ")) {
								name.setText(name.getText()+" Æ¢Æø±©ÁÒ");
							}
						}else {
							if(name.getText().contains("Æ¢Æø±©ÁÒ")) {
								name.setText(name.getText().replace("Æ¢Æø±©ÁÒ", ""));
							}
						}
						
					}
				});
				this.add(Æ¢Æø±©ÁÒ);
				this.add(Æ¢Æø±©ÁÒ_box);	
				//copy tab
				JLabel °ßÕî= new JLabel("°ßÕî:");  
				°ßÕî.setForeground(Color.WHITE);
				°ßÕî.setBounds(10+110+110+220, 20+325, 100, 50);
				JCheckBox °ßÕî_box= new JCheckBox();
				°ßÕî_box.setBounds(10+60+110+110+220, 33+325, 20, 20);
				°ßÕî_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(°ßÕî_box.isSelected()) {
							if(!name.getText().contains("°ßÕî")) {
								name.setText(name.getText()+" °ßÕî");
							}
						}else {
							if(name.getText().contains("°ßÕî")) {
								name.setText(name.getText().replace("°ßÕî", ""));
							}
						}
						
					}
				});
				this.add(°ßÕî);
				this.add(°ßÕî_box);	
				//copy tab
				JLabel Éö½áÊ¯= new JLabel("Éö½áÊ¯:");  
				Éö½áÊ¯.setForeground(Color.WHITE);
				Éö½áÊ¯.setBounds(10+110+110+220, 20+350, 100, 50);
				JCheckBox Éö½áÊ¯_box= new JCheckBox();
				Éö½áÊ¯_box.setBounds(10+60+110+110+220, 33+350, 20, 20);
				Éö½áÊ¯_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Éö½áÊ¯_box.isSelected()) {
							if(!name.getText().contains("Éö½áÊ¯")) {
								name.setText(name.getText()+" Éö½áÊ¯");
							}
						}else {
							if(name.getText().contains("Éö½áÊ¯")) {
								name.setText(name.getText().replace("Éö½áÊ¯", ""));
							}
						}
						
					}
				});
				this.add(Éö½áÊ¯);
				this.add(Éö½áÊ¯_box);	
				//copy tab
				JLabel µ¨½áÊ¯= new JLabel("µ¨½áÊ¯:");  
				µ¨½áÊ¯.setForeground(Color.WHITE);
				µ¨½áÊ¯.setBounds(10+110+110+220, 20+375, 100, 50);
				JCheckBox µ¨½áÊ¯_box= new JCheckBox();
				µ¨½áÊ¯_box.setBounds(10+60+110+110+220, 33+375, 20, 20);
				µ¨½áÊ¯_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(µ¨½áÊ¯_box.isSelected()) {
							if(!name.getText().contains("µ¨½áÊ¯")) {
								name.setText(name.getText()+" µ¨½áÊ¯");
							}
						}else {
							if(name.getText().contains("µ¨½áÊ¯")) {
								name.setText(name.getText().replace("µ¨½áÊ¯", ""));
							}
						}
						
					}
				});
				this.add(µ¨½áÊ¯);
				this.add(µ¨½áÊ¯_box);	
				//copy tab
				JLabel ¸ßÑªÑ¹= new JLabel("¸ßÑªÑ¹:");  
				¸ßÑªÑ¹.setForeground(Color.WHITE);
				¸ßÑªÑ¹.setBounds(10+110+110+220, 20+400, 100, 50);
				JCheckBox ¸ßÑªÑ¹_box= new JCheckBox();
				¸ßÑªÑ¹_box.setBounds(10+60+110+110+220, 33+400, 20, 20);
				¸ßÑªÑ¹_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(¸ßÑªÑ¹_box.isSelected()) {
							if(!name.getText().contains("¸ßÑªÑ¹")) {
								name.setText(name.getText()+" ¸ßÑªÑ¹");
							}
						}else {
							if(name.getText().contains("¸ßÑªÑ¹")) {
								name.setText(name.getText().replace("¸ßÑªÑ¹", ""));
							}
						}
						
					}
				});
				this.add(¸ßÑªÑ¹);
				this.add(¸ßÑªÑ¹_box);	
				//copy tab
				JLabel µÍÑªÑ¹= new JLabel("µÍÑªÑ¹:");  
				µÍÑªÑ¹.setForeground(Color.WHITE);
				µÍÑªÑ¹.setBounds(10+110+110+220, 20+425, 100, 50);
				JCheckBox µÍÑªÑ¹_box= new JCheckBox();
				µÍÑªÑ¹_box.setBounds(10+60+110+110+220, 33+425, 20, 20);
				µÍÑªÑ¹_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(µÍÑªÑ¹_box.isSelected()) {
							if(!name.getText().contains("µÍÑªÑ¹")) {
								name.setText(name.getText()+" µÍÑªÑ¹");
							}
						}else {
							if(name.getText().contains("µÍÑªÑ¹")) {
								name.setText(name.getText().replace("µÍÑªÑ¹", ""));
							}
						}
						
					}
				});
				this.add(µÍÑªÑ¹);
				this.add(µÍÑªÑ¹_box);	
				//copy tab
				JLabel ±ÀÂ©= new JLabel("±ÀÂ©:");  
				±ÀÂ©.setForeground(Color.WHITE);
				±ÀÂ©.setBounds(10+110+110+220, 20+450, 100, 50);
				JCheckBox ±ÀÂ©_box= new JCheckBox();
				±ÀÂ©_box.setBounds(10+60+110+110+220, 33+450, 20, 20);
				±ÀÂ©_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(±ÀÂ©_box.isSelected()) {
							if(!name.getText().contains("±ÀÂ©")) {
								name.setText(name.getText()+" ±ÀÂ©");
							}
						}else {
							if(name.getText().contains("±ÀÂ©")) {
								name.setText(name.getText().replace("±ÀÂ©", ""));
							}
						}
						
					}
				});
				this.add(±ÀÂ©);
				this.add(±ÀÂ©_box);	
				
				//copy tab
				JLabel ÌôÊ³= new JLabel("ÌôÊ³:");  
				ÌôÊ³.setForeground(Color.WHITE);
				ÌôÊ³.setBounds(10+110+110+220, 20+475, 100, 50);
				JCheckBox ÌôÊ³_box= new JCheckBox();
				ÌôÊ³_box.setBounds(10+60+110+110+220, 33+475, 20, 20);
				ÌôÊ³_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÌôÊ³_box.isSelected()) {
							if(!name.getText().contains("ÌôÊ³")) {
								name.setText(name.getText()+" ÌôÊ³");
							}
						}else {
							if(name.getText().contains("ÌôÊ³")) {
								name.setText(name.getText().replace("ÌôÊ³", ""));
							}
						}
						
					}
				});
				this.add(ÌôÊ³);
				this.add(ÌôÊ³_box);	
				//copy tab
				JLabel ÑáÊ³= new JLabel("ÑáÊ³:");  
				ÑáÊ³.setForeground(Color.WHITE);
				ÑáÊ³.setBounds(10+110+110+220, 20+500, 100, 50);
				JCheckBox ÑáÊ³_box= new JCheckBox();
				ÑáÊ³_box.setBounds(10+60+110+110+220, 33+500, 20, 20);
				ÑáÊ³_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÑáÊ³_box.isSelected()) {
							if(!name.getText().contains("ÑáÊ³")) {
								name.setText(name.getText()+" ÑáÊ³");
							}
						}else {
							if(name.getText().contains("ÑáÊ³")) {
								name.setText(name.getText().replace("ÑáÊ³", ""));
							}
						}
						
					}
				});
				this.add(ÑáÊ³);
				this.add(ÑáÊ³_box);	
				//copy tab
				JLabel ¾øÊ³= new JLabel("¾øÊ³:");  
				¾øÊ³.setForeground(Color.WHITE);
				¾øÊ³.setBounds(10+110+110+330, 20+0, 100, 50);
				JCheckBox ¾øÊ³_box= new JCheckBox();
				¾øÊ³_box.setBounds(10+60+110+110+330, 33+0, 20, 20);
				¾øÊ³_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(¾øÊ³_box.isSelected()) {
							if(!name.getText().contains("¾øÊ³")) {
								name.setText(name.getText()+" ¾øÊ³");
							}
						}else {
							if(name.getText().contains("¾øÊ³")) {
								name.setText(name.getText().replace("¾øÊ³", ""));
							}
						}
						
					}
				});
				this.add(¾øÊ³);
				this.add(¾øÊ³_box);	
				//copy tab
				JLabel ±©Òû±©Ê³= new JLabel("±©Òû±©Ê³:");  
				±©Òû±©Ê³.setForeground(Color.WHITE);
				±©Òû±©Ê³.setBounds(10+110+110+330, 20+25, 100, 50);
				JCheckBox ±©Òû±©Ê³_box= new JCheckBox();
				±©Òû±©Ê³_box.setBounds(10+60+110+110+330, 33+25, 20, 20);
				±©Òû±©Ê³_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(±©Òû±©Ê³_box.isSelected()) {
							if(!name.getText().contains("±©Òû±©Ê³")) {
								name.setText(name.getText()+" ±©Òû±©Ê³");
							}
						}else {
							if(name.getText().contains("±©Òû±©Ê³")) {
								name.setText(name.getText().replace("±©Òû±©Ê³", ""));
							}
						}
						
					}
				});
				this.add(±©Òû±©Ê³);
				this.add(±©Òû±©Ê³_box);	
				//copy tab
				JLabel Ë®Ö×= new JLabel("Ë®Ö×:");  
				Ë®Ö×.setForeground(Color.WHITE);
				Ë®Ö×.setBounds(10+110+110+330, 20+50, 100, 50);
				JCheckBox Ë®Ö×_box= new JCheckBox();
				Ë®Ö×_box.setBounds(10+60+110+110+330, 33+50, 20, 20);
				Ë®Ö×_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ë®Ö×_box.isSelected()) {
							if(!name.getText().contains("Ë®Ö×")) {
								name.setText(name.getText()+" Ë®Ö×");
							}
						}else {
							if(name.getText().contains("Ë®Ö×")) {
								name.setText(name.getText().replace("Ë®Ö×", ""));
							}
						}
						
					}
				});
				this.add(Ë®Ö×);
				this.add(Ë®Ö×_box);	
				//copy tab
				JLabel Ö×ÕÍ= new JLabel("Ö×ÕÍ:");  
				Ö×ÕÍ.setForeground(Color.WHITE);
				Ö×ÕÍ.setBounds(10+110+110+330, 20+75, 100, 50);
				JCheckBox Ö×ÕÍ_box= new JCheckBox();
				Ö×ÕÍ_box.setBounds(10+60+110+110+330, 33+75, 20, 20);
				Ö×ÕÍ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ö×ÕÍ_box.isSelected()) {
							if(!name.getText().contains("Ö×ÕÍ")) {
								name.setText(name.getText()+" Ö×ÕÍ");
							}
						}else {
							if(name.getText().contains("Ö×ÕÍ")) {
								name.setText(name.getText().replace("Ö×ÕÍ", ""));
							}
						}
						
					}
				});
				this.add(Ö×ÕÍ);
				this.add(Ö×ÕÍ_box);	
				//copy tab
				JLabel ºôÎü²»³©= new JLabel("ºôÎü²»³©:");  
				ºôÎü²»³©.setForeground(Color.WHITE);
				ºôÎü²»³©.setBounds(10+110+110+330, 20+100, 100, 50);
				JCheckBox ºôÎü²»³©_box= new JCheckBox();
				ºôÎü²»³©_box.setBounds(10+60+110+110+330, 33+100, 20, 20);
				ºôÎü²»³©_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ºôÎü²»³©_box.isSelected()) {
							if(!name.getText().contains("ºôÎü²»³©")) {
								name.setText(name.getText()+" ºôÎü²»³©");
							}
						}else {
							if(name.getText().contains("ºôÎü²»³©")) {
								name.setText(name.getText().replace("ºôÎü²»³©", ""));
							}
						}
						
					}
				});
				this.add(ºôÎü²»³©);
				this.add(ºôÎü²»³©_box);	
				//copy tab
				JLabel ¿Ú³ô= new JLabel("¿Ú³ô:");  
				¿Ú³ô.setForeground(Color.WHITE);
				¿Ú³ô.setBounds(10+110+110+330, 20+125, 100, 50);
				JCheckBox ¿Ú³ô_box= new JCheckBox();
				¿Ú³ô_box.setBounds(10+60+110+110+330, 33+125, 20, 20);
				¿Ú³ô_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(¿Ú³ô_box.isSelected()) {
							if(!name.getText().contains("¿Ú³ô")) {
								name.setText(name.getText()+" ¿Ú³ô");
							}
						}else {
							if(name.getText().contains("¿Ú³ô")) {
								name.setText(name.getText().replace("¿Ú³ô", ""));
							}
						}
						
					}
				});
				this.add(¿Ú³ô);
				this.add(¿Ú³ô_box);	
				//copy tab
				JLabel ´òàÃ= new JLabel("´òàÃ:");  
				´òàÃ.setForeground(Color.WHITE);
				´òàÃ.setBounds(10+110+110+330, 20+150, 100, 50);
				JCheckBox ´òàÃ_box= new JCheckBox();
				´òàÃ_box.setBounds(10+60+110+110+330, 33+150, 20, 20);
				´òàÃ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(´òàÃ_box.isSelected()) {
							if(!name.getText().contains("´òàÃ")) {
								name.setText(name.getText()+" ´òàÃ");
							}
						}else {
							if(name.getText().contains("´òàÃ")) {
								name.setText(name.getText().replace("´òàÃ", ""));
							}
						}
						
					}
				});
				this.add(´òàÃ);
				this.add(´òàÃ_box);	
				//copy tab
				JLabel ÉÝË¯= new JLabel("ÉÝË¯:");  
				ÉÝË¯.setForeground(Color.WHITE);
				ÉÝË¯.setBounds(10+110+110+330, 20+175, 100, 50);
				JCheckBox ÉÝË¯_box= new JCheckBox();
				ÉÝË¯_box.setBounds(10+60+110+110+330, 33+175, 20, 20);
				ÉÝË¯_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÉÝË¯_box.isSelected()) {
							if(!name.getText().contains("ÉÝË¯")) {
								name.setText(name.getText()+" ÉÝË¯");
							}
						}else {
							if(name.getText().contains("ÉÝË¯")) {
								name.setText(name.getText().replace("ÉÝË¯", ""));
							}
						}
						
					}
				});
				this.add(ÉÝË¯);
				this.add(ÉÝË¯_box);	
				//copy tab
				JLabel ·ÊÅÖ= new JLabel("·ÊÅÖ:");  
				·ÊÅÖ.setForeground(Color.WHITE);
				·ÊÅÖ.setBounds(10+110+110+330, 20+200, 100, 50);
				JCheckBox ·ÊÅÖ_box= new JCheckBox();
				·ÊÅÖ_box.setBounds(10+60+110+110+330, 33+200, 20, 20);
				·ÊÅÖ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(·ÊÅÖ_box.isSelected()) {
							if(!name.getText().contains("·ÊÅÖ")) {
								name.setText(name.getText()+" ·ÊÅÖ");
							}
						}else {
							if(name.getText().contains("·ÊÅÖ")) {
								name.setText(name.getText().replace("·ÊÅÖ", ""));
							}
						}
						
					}
				});
				this.add(·ÊÅÖ);
				this.add(·ÊÅÖ_box);	
				//copy tab
				JLabel Á÷¿ÚË®= new JLabel("Á÷¿ÚË®:");  
				Á÷¿ÚË®.setForeground(Color.WHITE);
				Á÷¿ÚË®.setBounds(10+110+110+330, 20+225, 100, 50);
				JCheckBox Á÷¿ÚË®_box= new JCheckBox();
				Á÷¿ÚË®_box.setBounds(10+60+110+110+330, 33+225, 20, 20);
				Á÷¿ÚË®_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Á÷¿ÚË®_box.isSelected()) {
							if(!name.getText().contains("Á÷¿ÚË®")) {
								name.setText(name.getText()+" Á÷¿ÚË®");
							}
						}else {
							if(name.getText().contains("Á÷¿ÚË®")) {
								name.setText(name.getText().replace("Á÷¿ÚË®", ""));
							}
						}
						
					}
				});
				this.add(Á÷¿ÚË®);
				this.add(Á÷¿ÚË®_box);	
				//copy tab
				JLabel ±Õ¾­= new JLabel("±Õ¾­:");  
				±Õ¾­.setForeground(Color.WHITE);
				±Õ¾­.setBounds(10+110+110+330, 20+250, 100, 50);
				JCheckBox ±Õ¾­_box= new JCheckBox();
				±Õ¾­_box.setBounds(10+60+110+110+330, 33+250, 20, 20);
				±Õ¾­_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(±Õ¾­_box.isSelected()) {
							if(!name.getText().contains("±Õ¾­")) {
								name.setText(name.getText()+" ±Õ¾­");
							}
						}else {
							if(name.getText().contains("±Õ¾­")) {
								name.setText(name.getText().replace("±Õ¾­", ""));
							}
						}
						
					}
				});
				this.add(±Õ¾­);
				this.add(±Õ¾­_box);	
				//copy tab
				JLabel ÖÐ¶¾= new JLabel("ÖÐ¶¾:");  
				ÖÐ¶¾.setForeground(Color.WHITE);
				ÖÐ¶¾.setBounds(10+110+110+330, 20+275, 100, 50);
				JCheckBox ÖÐ¶¾_box= new JCheckBox();
				ÖÐ¶¾_box.setBounds(10+60+110+110+330, 33+275, 20, 20);
				ÖÐ¶¾_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÖÐ¶¾_box.isSelected()) {
							if(!name.getText().contains("ÖÐ¶¾")) {
								name.setText(name.getText()+" ÖÐ¶¾");
							}
						}else {
							if(name.getText().contains("ÖÐ¶¾")) {
								name.setText(name.getText().replace("ÖÐ¶¾", ""));
							}
						}
						
					}
				});
				this.add(ÖÐ¶¾);
				this.add(ÖÐ¶¾_box);	
				//copy tab
				JLabel ÄòÑª= new JLabel("ÄòÑª:");  
				ÄòÑª.setForeground(Color.WHITE);
				ÄòÑª.setBounds(10+110+110+330, 20+300, 100, 50);
				JCheckBox ÄòÑª_box= new JCheckBox();
				ÄòÑª_box.setBounds(10+60+110+110+330, 33+300, 20, 20);
				ÄòÑª_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÄòÑª_box.isSelected()) {
							if(!name.getText().contains("ÄòÑª")) {
								name.setText(name.getText()+" ÄòÑª");
							}
						}else {
							if(name.getText().contains("ÄòÑª")) {
								name.setText(name.getText().replace("ÄòÑª", ""));
							}
						}
						
					}
				});
				this.add(ÄòÑª);
				this.add(ÄòÑª_box);	
				//copy tab
				JLabel Ö¹Ñª= new JLabel("Ö¹Ñª:");  
				Ö¹Ñª.setForeground(Color.WHITE);
				Ö¹Ñª.setBounds(10+110+110+330, 20+325, 100, 50);
				JCheckBox Ö¹Ñª_box= new JCheckBox();
				Ö¹Ñª_box.setBounds(10+60+110+110+330, 33+325, 20, 20);
				Ö¹Ñª_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ö¹Ñª_box.isSelected()) {
							if(!name.getText().contains("Ö¹Ñª")) {
								name.setText(name.getText()+" Ö¹Ñª");
							}
						}else {
							if(name.getText().contains("Ö¹Ñª")) {
								name.setText(name.getText().replace("Ö¹Ñª", ""));
							}
						}
						
					}
				});
				this.add(Ö¹Ñª);
				this.add(Ö¹Ñª_box);	
				//copy tab
				JLabel Æ¶Ñª= new JLabel("Æ¶Ñª:");  
				Æ¶Ñª.setForeground(Color.WHITE);
				Æ¶Ñª.setBounds(10+110+110+330, 20+350, 100, 50);
				JCheckBox Æ¶Ñª_box= new JCheckBox();
				Æ¶Ñª_box.setBounds(10+60+110+110+330, 33+350, 20, 20);
				Æ¶Ñª_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Æ¶Ñª_box.isSelected()) {
							if(!name.getText().contains("Æ¶Ñª")) {
								name.setText(name.getText()+" Æ¶Ñª");
							}
						}else {
							if(name.getText().contains("Æ¶Ñª")) {
								name.setText(name.getText().replace("Æ¶Ñª", ""));
							}
						}
						
					}
				});
				this.add(Æ¶Ñª);
				this.add(Æ¶Ñª_box);	
				//copy tab
				JLabel Çà´º¶»= new JLabel("Çà´º¶»:");  
				Çà´º¶».setForeground(Color.WHITE);
				Çà´º¶».setBounds(10+110+110+330, 20+375, 100, 50);
				JCheckBox Çà´º¶»_box= new JCheckBox();
				Çà´º¶»_box.setBounds(10+60+110+110+330, 33+375, 20, 20);
				Çà´º¶»_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Çà´º¶»_box.isSelected()) {
							if(!name.getText().contains("Çà´º¶»")) {
								name.setText(name.getText()+" Çà´º¶»");
							}
						}else {
							if(name.getText().contains("Çà´º¶»")) {
								name.setText(name.getText().replace("Çà´º¶»", ""));
							}
						}
						
					}
				});
				this.add(Çà´º¶»);
				this.add(Çà´º¶»_box);	
				//copy tab
				JLabel ½îÉË= new JLabel("½îÉË:");  
				½îÉË.setForeground(Color.WHITE);
				½îÉË.setBounds(10+110+110+330, 20+400, 100, 50);
				JCheckBox ½îÉË_box= new JCheckBox();
				½îÉË_box.setBounds(10+60+110+110+330, 33+400, 20, 20);
				½îÉË_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(½îÉË_box.isSelected()) {
							if(!name.getText().contains("½îÉË")) {
								name.setText(name.getText()+" ½îÉË");
							}
						}else {
							if(name.getText().contains("½îÉË")) {
								name.setText(name.getText().replace("½îÉË", ""));
							}
						}
						
					}
				});
				this.add(½îÉË);
				this.add(½îÉË_box);	
				//copy tab
				JLabel °©Ö¢= new JLabel("°©Ö¢:");  
				°©Ö¢.setForeground(Color.WHITE);
				°©Ö¢.setBounds(10+110+110+330, 20+425, 100, 50);
				JCheckBox °©Ö¢_box= new JCheckBox();
				°©Ö¢_box.setBounds(10+60+110+110+330, 33+425, 20, 20);
				°©Ö¢_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(°©Ö¢_box.isSelected()) {
							if(!name.getText().contains("°©Ö¢")) {
								name.setText(name.getText()+" °©Ö¢");
							}
						}else {
							if(name.getText().contains("°©Ö¢")) {
								name.setText(name.getText().replace("°©Ö¢", ""));
							}
						}
						
					}
				});
				this.add(°©Ö¢);
				this.add(°©Ö¢_box);	
				//copy tab
				JLabel Ö×Áö= new JLabel("Ö×Áö:");  
				Ö×Áö.setForeground(Color.WHITE);
				Ö×Áö.setBounds(10+110+110+330, 20+450, 100, 50);
				JCheckBox Ö×Áö_box= new JCheckBox();
				Ö×Áö_box.setBounds(10+60+110+110+330, 33+450, 20, 20);
				Ö×Áö_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ö×Áö_box.isSelected()) {
							if(!name.getText().contains("Ö×Áö")) {
								name.setText(name.getText()+" Ö×Áö");
							}
						}else {
							if(name.getText().contains("Ö×Áö")) {
								name.setText(name.getText().replace("Ö×Áö", ""));
							}
						}
						
					}
				});
				this.add(Ö×Áö);
				this.add(Ö×Áö_box);	
				//copy tab
				JLabel ÐÝ¿Ë= new JLabel("ÐÝ¿Ë:");  
				ÐÝ¿Ë.setForeground(Color.WHITE);
				ÐÝ¿Ë.setBounds(10+110+110+330, 20+475, 100, 50);
				JCheckBox ÐÝ¿Ë_box= new JCheckBox();
				ÐÝ¿Ë_box.setBounds(10+60+110+110+330, 33+475, 20, 20);
				ÐÝ¿Ë_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÐÝ¿Ë_box.isSelected()) {
							if(!name.getText().contains("ÐÝ¿Ë")) {
								name.setText(name.getText()+" ÐÝ¿Ë");
							}
						}else {
							if(name.getText().contains("ÐÝ¿Ë")) {
								name.setText(name.getText().replace("ÐÝ¿Ë", ""));
							}
						}
						
					}
				});
				this.add(ÐÝ¿Ë);
				this.add(ÐÝ¿Ë_box);	
				//copy tab
				JLabel ºìÑÛ²¡= new JLabel("ºìÑÛ²¡:");  
				ºìÑÛ²¡.setForeground(Color.WHITE);
				ºìÑÛ²¡.setBounds(10+110+110+330, 20+500, 100, 50);
				JCheckBox ºìÑÛ²¡_box= new JCheckBox();
				ºìÑÛ²¡_box.setBounds(10+60+110+110+330, 33+500, 20, 20);
				ºìÑÛ²¡_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ºìÑÛ²¡_box.isSelected()) {
							if(!name.getText().contains("ºìÑÛ²¡")) {
								name.setText(name.getText()+" ºìÑÛ²¡");
							}
						}else {
							if(name.getText().contains("ºìÑÛ²¡")) {
								name.setText(name.getText().replace("ºìÑÛ²¡", ""));
							}
						}
						
					}
				});
				this.add(ºìÑÛ²¡);
				this.add(ºìÑÛ²¡_box);	
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
				JLabel Ê§Ãß²»ÃÂ= new JLabel("Ê§Ãß²»ÃÂ:");  
				Ê§Ãß²»ÃÂ.setForeground(Color.WHITE);
				Ê§Ãß²»ÃÂ.setBounds(10+110+110+440, 20+25, 100, 50);
				JCheckBox Ê§Ãß²»ÃÂ_box= new JCheckBox();
				Ê§Ãß²»ÃÂ_box.setBounds(10+60+110+110+440, 33+25, 20, 20);
				Ê§Ãß²»ÃÂ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ê§Ãß²»ÃÂ_box.isSelected()) {
							if(!name.getText().contains("Ê§Ãß²»ÃÂ")) {
								name.setText(name.getText()+" Ê§Ãß²»ÃÂ");
							}
						}else {
							if(name.getText().contains("Ê§Ãß²»ÃÂ")) {
								name.setText(name.getText().replace("Ê§Ãß²»ÃÂ", ""));
							}
						}
						
					}
				});
				this.add(Ê§Ãß²»ÃÂ);
				this.add(Ê§Ãß²»ÃÂ_box);	
				//copy tab
				JLabel ¾ª¿Ö= new JLabel("¾ª¿Ö:");  
				¾ª¿Ö.setForeground(Color.WHITE);
				¾ª¿Ö.setBounds(10+110+110+440, 20+50, 100, 50);
				JCheckBox ¾ª¿Ö_box= new JCheckBox();
				¾ª¿Ö_box.setBounds(10+60+110+110+440, 33+50, 20, 20);
				¾ª¿Ö_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(¾ª¿Ö_box.isSelected()) {
							if(!name.getText().contains("¾ª¿Ö")) {
								name.setText(name.getText()+" ¾ª¿Ö");
							}
						}else {
							if(name.getText().contains("¾ª¿Ö")) {
								name.setText(name.getText().replace("¾ª¿Ö", ""));
							}
						}
						
					}
				});
				this.add(¾ª¿Ö);
				this.add(¾ª¿Ö_box);	
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
				JLabel ðÞÆø= new JLabel("ðÞÆø:");  
				ðÞÆø.setForeground(Color.WHITE);
				ðÞÆø.setBounds(10+110+110+440, 20+100, 100, 50);
				JCheckBox ðÞÆø_box= new JCheckBox();
				ðÞÆø_box.setBounds(10+60+110+110+440, 33+100, 20, 20);
				ðÞÆø_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ðÞÆø_box.isSelected()) {
							if(!name.getText().contains("ðÞÆø")) {
								name.setText(name.getText()+" ðÞÆø");
							}
						}else {
							if(name.getText().contains("ðÞÆø")) {
								name.setText(name.getText().replace("ðÞÆø", ""));
							}
						}
						
					}
				});
				this.add(ðÞÆø);
				this.add(ðÞÆø_box);	
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
				JLabel ½¡Íü= new JLabel("½¡Íü:");  
				½¡Íü.setForeground(Color.WHITE);
				½¡Íü.setBounds(10+110+110+440, 20+150, 100, 50);
				JCheckBox ½¡Íü_box= new JCheckBox();
				½¡Íü_box.setBounds(10+60+110+110+440, 33+150, 20, 20);
				½¡Íü_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(½¡Íü_box.isSelected()) {
							if(!name.getText().contains("½¡Íü")) {
								name.setText(name.getText()+" ½¡Íü");
							}
						}else {
							if(name.getText().contains("½¡Íü")) {
								name.setText(name.getText().replace("½¡Íü", ""));
							}
						}
						
					}
				});
				this.add(½¡Íü);
				this.add(½¡Íü_box);	
				//copy tab
				JLabel ô¬Ñª= new JLabel("ô¬Ñª:");  
				ô¬Ñª.setForeground(Color.WHITE);
				ô¬Ñª.setBounds(10+110+110+440, 20+175, 100, 50);
				JCheckBox ô¬Ñª_box= new JCheckBox();
				ô¬Ñª_box.setBounds(10+60+110+110+440, 33+175, 20, 20);
				ô¬Ñª_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ô¬Ñª_box.isSelected()) {
							if(!name.getText().contains("ô¬Ñª")) {
								name.setText(name.getText()+" ô¬Ñª");
							}
						}else {
							if(name.getText().contains("ô¬Ñª")) {
								name.setText(name.getText().replace("ô¬Ñª", ""));
							}
						}
						
					}
				});
				this.add(ô¬Ñª);
				this.add(ô¬Ñª_box);	
				//copy tab
				JLabel Éà´¯= new JLabel("Éà´¯:");  
				Éà´¯.setForeground(Color.WHITE);
				Éà´¯.setBounds(10+110+110+440, 20+200, 100, 50);
				JCheckBox Éà´¯_box= new JCheckBox();
				Éà´¯_box.setBounds(10+60+110+110+440, 33+200, 20, 20);
				Éà´¯_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Éà´¯_box.isSelected()) {
							if(!name.getText().contains("Éà´¯")) {
								name.setText(name.getText()+" Éà´¯");
							}
						}else {
							if(name.getText().contains("Éà´¯")) {
								name.setText(name.getText().replace("Éà´¯", ""));
							}
						}
						
					}
				});
				this.add(Éà´¯);
				this.add(Éà´¯_box);	
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
				//copy tab
				JLabel ÐÄ·³= new JLabel("ÐÄ·³:");  
				ÐÄ·³.setForeground(Color.WHITE);
				ÐÄ·³.setBounds(10+110+110+440, 20+250, 100, 50);
				JCheckBox ÐÄ·³_box= new JCheckBox();
				ÐÄ·³_box.setBounds(10+60+110+110+440, 33+250, 20, 20);
				ÐÄ·³_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÐÄ·³_box.isSelected()) {
							if(!name.getText().contains("ÐÄ·³")) {
								name.setText(name.getText()+" ÐÄ·³");
							}
						}else {
							if(name.getText().contains("ÐÄ·³")) {
								name.setText(name.getText().replace("ÐÄ·³", ""));
							}
						}
						
					}
				});
				this.add(ÐÄ·³);
				this.add(ÐÄ·³_box);	
				//copy tab
				JLabel Ê§½û= new JLabel("Ê§½û:");  
				Ê§½û.setForeground(Color.WHITE);
				Ê§½û.setBounds(10+110+110+440, 20+275, 100, 50);
				JCheckBox Ê§½û_box= new JCheckBox();
				Ê§½û_box.setBounds(10+60+110+110+440, 33+275, 20, 20);
				Ê§½û_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ê§½û_box.isSelected()) {
							if(!name.getText().contains("Ê§½û")) {
								name.setText(name.getText()+" Ê§½û");
							}
						}else {
							if(name.getText().contains("Ê§½û")) {
								name.setText(name.getText().replace("Ê§½û", ""));
							}
						}
						
					}
				});
				this.add(Ê§½û);
				this.add(Ê§½û_box);	
				//copy tab
				JLabel Ñôðô= new JLabel("Ñôðô:");  
				Ñôðô.setForeground(Color.WHITE);
				Ñôðô.setBounds(10+110+110+440, 20+300, 100, 50);
				JCheckBox Ñôðô_box= new JCheckBox();
				Ñôðô_box.setBounds(10+60+110+110+440, 33+300, 20, 20);
				Ñôðô_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ñôðô_box.isSelected()) {
							if(!name.getText().contains("Ñôðô")) {
								name.setText(name.getText()+" Ñôðô");
							}
						}else {
							if(name.getText().contains("Ñôðô")) {
								name.setText(name.getText().replace("Ñôðô", ""));
							}
						}
						
					}
				});
				this.add(Ñôðô);
				this.add(Ñôðô_box);	
				//copy tab
				JLabel ñª±Õ= new JLabel("ñª±Õ:");  
				ñª±Õ.setForeground(Color.WHITE);
				ñª±Õ.setBounds(10+110+110+440, 20+325, 100, 50);
				JCheckBox ñª±Õ_box= new JCheckBox();
				ñª±Õ_box.setBounds(10+60+110+110+440, 33+325, 20, 20);
				ñª±Õ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ñª±Õ_box.isSelected()) {
							if(!name.getText().contains("ñª±Õ")) {
								name.setText(name.getText()+" ñª±Õ");
							}
						}else {
							if(name.getText().contains("ñª±Õ")) {
								name.setText(name.getText().replace("ñª±Õ", ""));
							}
						}
						
					}
				});
				this.add(ñª±Õ);
				this.add(ñª±Õ_box);	
				//copy tab
				JLabel Ïûðô= new JLabel("Ïûðô:");  
				Ïûðô.setForeground(Color.WHITE);
				Ïûðô.setBounds(10+110+110+440, 20+350, 100, 50);
				JCheckBox Ïûðô_box= new JCheckBox();
				Ïûðô_box.setBounds(10+60+110+110+440, 33+350, 20, 20);
				Ïûðô_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ïûðô_box.isSelected()) {
							if(!name.getText().contains("Ïûðô")) {
								name.setText(name.getText()+" Ïûðô");
							}
						}else {
							if(name.getText().contains("Ïûðô")) {
								name.setText(name.getText().replace("Ïûðô", ""));
							}
						}
						
					}
				});
				this.add(Ïûðô);
				this.add(Ïûðô_box);	
				//copy tab
				JLabel Ð¡±ã´ÌÍ´= new JLabel("Ð¡±ã´ÌÍ´:");  
				Ð¡±ã´ÌÍ´.setForeground(Color.WHITE);
				Ð¡±ã´ÌÍ´.setBounds(10+110+110+440, 20+375, 100, 50);
				JCheckBox Ð¡±ã´ÌÍ´_box= new JCheckBox();
				Ð¡±ã´ÌÍ´_box.setBounds(10+60+110+110+440, 33+375, 20, 20);
				Ð¡±ã´ÌÍ´_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ð¡±ã´ÌÍ´_box.isSelected()) {
							if(!name.getText().contains("Ð¡±ã´ÌÍ´")) {
								name.setText(name.getText()+" Ð¡±ã´ÌÍ´");
							}
						}else {
							if(name.getText().contains("Ð¡±ã´ÌÍ´")) {
								name.setText(name.getText().replace("Ð¡±ã´ÌÍ´", ""));
							}
						}
						
					}
				});
				this.add(Ð¡±ã´ÌÍ´);
				this.add(Ð¡±ã´ÌÍ´_box);		
				//copy tab
				JLabel ÒÅÄò= new JLabel("ÒÅÄò:");  
				ÒÅÄò.setForeground(Color.WHITE);
				ÒÅÄò.setBounds(10+110+110+440, 20+400, 100, 50);
				JCheckBox ÒÅÄò_box= new JCheckBox();
				ÒÅÄò_box.setBounds(10+60+110+110+440, 33+400, 20, 20);
				ÒÅÄò_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÒÅÄò_box.isSelected()) {
							if(!name.getText().contains("ÒÅÄò")) {
								name.setText(name.getText()+" ÒÅÄò");
							}
						}else {
							if(name.getText().contains("ÒÅÄò")) {
								name.setText(name.getText().replace("ÒÅÄò", ""));
							}
						}
						
					}
				});
				this.add(ÒÅÄò);
				this.add(ÒÅÄò_box);	
				//copy tab
				JLabel Ò×Å­= new JLabel("Ò×Å­:");  
				Ò×Å­.setForeground(Color.WHITE);
				Ò×Å­.setBounds(10+110+110+440, 20+425, 100, 50);
				JCheckBox Ò×Å­_box= new JCheckBox();
				Ò×Å­_box.setBounds(10+60+110+110+440, 33+425, 20, 20);
				Ò×Å­_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ò×Å­_box.isSelected()) {
							if(!name.getText().contains("Ò×Å­")) {
								name.setText(name.getText()+" Ò×Å­");
							}
						}else {
							if(name.getText().contains("Ò×Å­")) {
								name.setText(name.getText().replace("Ò×Å­", ""));
							}
						}
						
					}
				});
				this.add(Ò×Å­);
				this.add(Ò×Å­_box);	
				//copy tab
				JLabel Æ£¾ë= new JLabel("Æ£¾ë:");  
				Æ£¾ë.setForeground(Color.WHITE);
				Æ£¾ë.setBounds(10+110+110+440, 20+450, 100, 50);
				JCheckBox Æ£¾ë_box= new JCheckBox();
				Æ£¾ë_box.setBounds(10+60+110+110+440, 33+450, 20, 20);
				Æ£¾ë_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Æ£¾ë_box.isSelected()) {
							if(!name.getText().contains("Æ£¾ë")) {
								name.setText(name.getText()+" Æ£¾ë");
							}
						}else {
							if(name.getText().contains("Æ£¾ë")) {
								name.setText(name.getText().replace("Æ£¾ë", ""));
							}
						}
						
					}
				});
				this.add(Æ£¾ë);
				this.add(Æ£¾ë_box);	
				//copy tab
				JLabel ðþÑ÷= new JLabel("ðþÑ÷:");  
				ðþÑ÷.setForeground(Color.WHITE);
				ðþÑ÷.setBounds(10+110+110+440, 20+475, 100, 50);
				JCheckBox ðþÑ÷_box= new JCheckBox();
				ðþÑ÷_box.setBounds(10+60+110+110+440, 33+475, 20, 20);
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
				JLabel »Æðã= new JLabel("»Æðã:");  
				»Æðã.setForeground(Color.WHITE);
				»Æðã.setBounds(10+110+110+440, 20+500, 100, 50);
				JCheckBox »Æðã_box= new JCheckBox();
				»Æðã_box.setBounds(10+60+110+110+440, 33+500, 20, 20);
				»Æðã_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(»Æðã_box.isSelected()) {
							if(!name.getText().contains("»Æðã")) {
								name.setText(name.getText()+" »Æðã");
							}
						}else {
							if(name.getText().contains("»Æðã")) {
								name.setText(name.getText().replace("»Æðã", ""));
							}
						}
						
					}
				});
				this.add(»Æðã);
				this.add(»Æðã_box);	
		
		
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