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

public class TongJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TongJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);
		
		JLabel shentongqichuan_filter= new JLabel("…ÌÕ¥:");  
		shentongqichuan_filter.setForeground(Color.WHITE);
		shentongqichuan_filter.setBounds(10, 45, 100, 50);
		JCheckBox shentongqichuan_filter_box= new JCheckBox();
		shentongqichuan_filter_box.setBounds(10+60, 58, 20, 20);
		shentongqichuan_filter_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(shentongqichuan_filter_box.isSelected()) {
					if(!name.getText().contains("…ÌÕ¥")) {
						name.setText(name.getText()+" …ÌÕ¥");
					}
				}else {
					if(name.getText().contains("…ÌÕ¥")) {
						name.setText(name.getText().replace("…ÌÕ¥", ""));
					}
				}
				
			}
		});
		this.add(shentongqichuan_filter);
		this.add(shentongqichuan_filter_box);
		//
		JLabel etoutongqichuan_filter= new JLabel("∂ÓÕ∑Õ¥:");  
		etoutongqichuan_filter.setForeground(Color.WHITE);
		etoutongqichuan_filter.setBounds(10, 45+25, 100, 50);
		JCheckBox etoutongqichuan_filter_box= new JCheckBox();
		etoutongqichuan_filter_box.setBounds(10+60, 58+25, 20, 20);
		etoutongqichuan_filter_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(etoutongqichuan_filter_box.isSelected()) {
					if(!name.getText().contains("∂ÓÕ∑Õ¥")) {
						name.setText(name.getText()+" ∂ÓÕ∑Õ¥");
					}
				}else {
					if(name.getText().contains("∂ÓÕ∑Õ¥")) {
						name.setText(name.getText().replace("∂ÓÕ∑Õ¥", ""));
					}
				}
				
			}
		});
		this.add(etoutongqichuan_filter);
		this.add(etoutongqichuan_filter_box);
		

			
				//copy tab
				JLabel toutong= new JLabel("Õ∑Õ¥:");  
				toutong.setForeground(Color.WHITE);
				toutong.setBounds(10, 45+25+100+25+100, 100, 50);
				JCheckBox toutong_box= new JCheckBox();
				toutong_box.setBounds(10+60, 58+25+100+25+100, 20, 20);
				toutong_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(toutong_box.isSelected()) {
							if(!name.getText().contains("Õ∑Õ¥")) {
								name.setText(name.getText()+" Õ∑Õ¥");
							}
						}else {
							if(name.getText().contains("Õ∑Õ¥")) {
								name.setText(name.getText().replace("Õ∑Õ¥", ""));
							}
						}
						
					}
				});
				this.add(toutong);
				this.add(toutong_box);
				//copy tab
				JLabel bozitong= new JLabel("≤±◊”Õ¥:");  
				bozitong.setForeground(Color.WHITE);
				bozitong.setBounds(10, 45+25+100+25+125, 100, 50);
				JCheckBox bozitong_box= new JCheckBox();
				bozitong_box.setBounds(10+60, 58+25+100+25+125, 20, 20);
				bozitong_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(bozitong_box.isSelected()) {
							if(!name.getText().contains("≤±◊”Õ¥")) {
								name.setText(name.getText()+" ≤±◊”Õ¥");
							}
						}else {
							if(name.getText().contains("≤±◊”Õ¥")) {
								name.setText(name.getText().replace("≤±◊”Õ¥", ""));
							}
						}
						
					}
				});
				this.add(bozitong);
				this.add(bozitong_box);
				//copy tab
				JLabel xiongtong= new JLabel("–ÿÕ¥:");  
				xiongtong.setForeground(Color.WHITE);
				xiongtong.setBounds(10+440, 45+25+100+25+150, 100, 50);
				JCheckBox xiongtong_box= new JCheckBox();
				xiongtong_box.setBounds(10+60+440, 58+25+100+25+150, 20, 20);
				xiongtong_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(xiongtong_box.isSelected()) {
							if(!name.getText().contains("–ÿÕ¥")) {
								name.setText(name.getText()+" –ÿÕ¥");
							}
						}else {
							if(name.getText().contains("–ÿÕ¥")) {
								name.setText(name.getText().replace("–ÿÕ¥", ""));
							}
						}
						
					}
				});
				this.add(xiongtong);
				this.add(xiongtong_box);
				//copy tab
				JLabel futong= new JLabel("∏πÕ¥:");  
				futong.setForeground(Color.WHITE);
				futong.setBounds(10, 45+25+100+25+150, 100, 50);
				JCheckBox futong_box= new JCheckBox();
				futong_box.setBounds(10+60, 58+25+100+25+150, 20, 20);
				futong_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(futong_box.isSelected()) {
							if(!name.getText().contains("∏πÕ¥")) {
								name.setText(name.getText()+" ∏πÕ¥");
							}
						}else {
							if(name.getText().contains("∏πÕ¥")) {
								name.setText(name.getText().replace("∏πÕ¥", ""));
							}
						}
						
					}
				});
				this.add(futong);
				this.add(futong_box);
				//copy tab
				JLabel πÿΩ⁄Õ¥= new JLabel("πÿΩ⁄Õ¥:");  
				πÿΩ⁄Õ¥.setForeground(Color.WHITE);
				πÿΩ⁄Õ¥.setBounds(10, 45+25+100+25+175, 100, 50);
				JCheckBox πÿΩ⁄Õ¥_box= new JCheckBox();
				πÿΩ⁄Õ¥_box.setBounds(10+60, 58+25+100+25+175, 20, 20);
				πÿΩ⁄Õ¥_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(πÿΩ⁄Õ¥_box.isSelected()) {
							if(!name.getText().contains("πÿΩ⁄Õ¥")) {
								name.setText(name.getText()+" πÿΩ⁄Õ¥");
							}
						}else {
							if(name.getText().contains("πÿΩ⁄Õ¥")) {
								name.setText(name.getText().replace("πÿΩ⁄Õ¥", ""));
							}
						}
						
					}
				});
				this.add(πÿΩ⁄Õ¥);
				this.add(πÿΩ⁄Õ¥_box);
				//copy tab
				JLabel ø’Õ¥= new JLabel("ø’Õ¥:");  
				ø’Õ¥.setForeground(Color.WHITE);
				ø’Õ¥.setBounds(10, 45+25+100+25+200, 100, 50);
				JCheckBox ø’Õ¥_box= new JCheckBox();
				ø’Õ¥_box.setBounds(10+60, 58+25+100+25+200, 20, 20);
				ø’Õ¥_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ø’Õ¥_box.isSelected()) {
							if(!name.getText().contains("ø’Õ¥")) {
								name.setText(name.getText()+" ø’Õ¥");
							}
						}else {
							if(name.getText().contains("ø’Õ¥")) {
								name.setText(name.getText().replace("ø’Õ¥", ""));
							}
						}
						
					}
				});
				this.add(ø’Õ¥);
				this.add(ø’Õ¥_box);
				//copy tab
				JLabel “˛Õ¥= new JLabel("“˛Õ¥:");  
				“˛Õ¥.setForeground(Color.WHITE);
				“˛Õ¥.setBounds(10, 45+25+100+25+225, 100, 50);
				JCheckBox “˛Õ¥_box= new JCheckBox();
				“˛Õ¥_box.setBounds(10+60, 58+25+100+25+225, 20, 20);
				“˛Õ¥_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(“˛Õ¥_box.isSelected()) {
							if(!name.getText().contains("“˛Õ¥")) {
								name.setText(name.getText()+" “˛Õ¥");
							}
						}else {
							if(name.getText().contains("“˛Õ¥")) {
								name.setText(name.getText().replace("“˛Õ¥", ""));
							}
						}
						
					}
				});
				this.add(“˛Õ¥);
				this.add(“˛Õ¥_box);
				//copy tab
				JLabel Ω Õ¥= new JLabel("Ω Õ¥:");  
				Ω Õ¥.setForeground(Color.WHITE);
				Ω Õ¥.setBounds(10, 45+25+100+25+250, 100, 50);
				JCheckBox Ω Õ¥_box= new JCheckBox();
				Ω Õ¥_box.setBounds(10+60, 58+25+100+25+250, 20, 20);
				Ω Õ¥_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ω Õ¥_box.isSelected()) {
							if(!name.getText().contains("Ω Õ¥")) {
								name.setText(name.getText()+" Ω Õ¥");
							}
						}else {
							if(name.getText().contains("Ω Õ¥")) {
								name.setText(name.getText().replace("Ω Õ¥", ""));
							}
						}
						
					}
				});
				this.add(Ω Õ¥);
				this.add(Ω Õ¥_box);
				//copy tab
				JLabel ¥ÃÕ¥= new JLabel("¥ÃÕ¥:");  
				¥ÃÕ¥.setForeground(Color.WHITE);
				¥ÃÕ¥.setBounds(10, 45+25+100+25+275, 100, 50);
				JCheckBox ¥ÃÕ¥_box= new JCheckBox();
				¥ÃÕ¥_box.setBounds(10+60, 58+25+100+25+275, 20, 20);
				¥ÃÕ¥_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(¥ÃÕ¥_box.isSelected()) {
							if(!name.getText().contains("¥ÃÕ¥")) {
								name.setText(name.getText()+" ¥ÃÕ¥");
							}
						}else {
							if(name.getText().contains("¥ÃÕ¥")) {
								name.setText(name.getText().replace("¥ÃÕ¥", ""));
							}
						}
						
					}
				});
				this.add(¥ÃÕ¥);
				this.add(¥ÃÕ¥_box);
				//copy tab
				JLabel æÁÕ¥= new JLabel("æÁÕ¥:");  
				æÁÕ¥.setForeground(Color.WHITE);
				æÁÕ¥.setBounds(10, 45+25+100+25+300, 100, 50);
				JCheckBox æÁÕ¥_box= new JCheckBox();
				æÁÕ¥_box.setBounds(10+60, 58+25+100+25+300, 20, 20);
				æÁÕ¥_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(æÁÕ¥_box.isSelected()) {
							if(!name.getText().contains("æÁÕ¥")) {
								name.setText(name.getText()+" æÁÕ¥");
							}
						}else {
							if(name.getText().contains("æÁÕ¥")) {
								name.setText(name.getText().replace("æÁÕ¥", ""));
							}
						}
						
					}
				});
				this.add(æÁÕ¥);
				this.add(æÁÕ¥_box);
				//copy tab
				JLabel ∑¥Ã¯Õ¥= new JLabel("∑¥Ã¯Õ¥:");  
				∑¥Ã¯Õ¥.setForeground(Color.WHITE);
				∑¥Ã¯Õ¥.setBounds(10, 45+25+100+25+325, 100, 50);
				JCheckBox ∑¥Ã¯Õ¥_box= new JCheckBox();
				∑¥Ã¯Õ¥_box.setBounds(10+60, 58+25+100+25+325, 20, 20);
				∑¥Ã¯Õ¥_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(∑¥Ã¯Õ¥_box.isSelected()) {
							if(!name.getText().contains("∑¥Ã¯Õ¥")) {
								name.setText(name.getText()+" ∑¥Ã¯Õ¥");
							}
						}else {
							if(name.getText().contains("∑¥Ã¯Õ¥")) {
								name.setText(name.getText().replace("∑¥Ã¯Õ¥", ""));
							}
						}
						
					}
				});
				this.add(∑¥Ã¯Õ¥);
				this.add(∑¥Ã¯Õ¥_box);
				//copy tab
				JLabel —πÕ¥= new JLabel("—πÕ¥:");  
				—πÕ¥.setForeground(Color.WHITE);
				—πÕ¥.setBounds(10+110, 20+0, 100, 50);
				JCheckBox —πÕ¥_box= new JCheckBox();
				—πÕ¥_box.setBounds(10+60+110, 33+0, 20, 20);
				—πÕ¥_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(—πÕ¥_box.isSelected()) {
							if(!name.getText().contains("—πÕ¥")) {
								name.setText(name.getText()+" —πÕ¥");
							}
						}else {
							if(name.getText().contains("—πÕ¥")) {
								name.setText(name.getText().replace("—πÕ¥", ""));
							}
						}
						
					}
				});
				this.add(—πÕ¥);
				this.add(—πÕ¥_box);
				//copy tab
				JLabel ≥ÈÕ¥= new JLabel("≥ÈÕ¥:");  
				≥ÈÕ¥.setForeground(Color.WHITE);
				≥ÈÕ¥.setBounds(10+110, 20+25, 100, 50);
				JCheckBox ≥ÈÕ¥_box= new JCheckBox();
				≥ÈÕ¥_box.setBounds(10+60+110, 33+25, 20, 20);
				≥ÈÕ¥_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(≥ÈÕ¥_box.isSelected()) {
							if(!name.getText().contains("≥ÈÕ¥")) {
								name.setText(name.getText()+" ≥ÈÕ¥");
							}
						}else {
							if(name.getText().contains("≥ÈÕ¥")) {
								name.setText(name.getText().replace("≥ÈÕ¥", ""));
							}
						}
						
					}
				});
				this.add(≥ÈÕ¥);
				this.add(≥ÈÕ¥_box);	
				//copy tab
				JLabel ◊∆Õ¥= new JLabel("◊∆Õ¥:");  
				◊∆Õ¥.setForeground(Color.WHITE);
				◊∆Õ¥.setBounds(10+110, 20+50, 100, 50);
				JCheckBox ◊∆Õ¥_box= new JCheckBox();
				◊∆Õ¥_box.setBounds(10+60+110, 33+50, 20, 20);
				◊∆Õ¥_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(◊∆Õ¥_box.isSelected()) {
							if(!name.getText().contains("◊∆Õ¥")) {
								name.setText(name.getText()+" ◊∆Õ¥");
							}
						}else {
							if(name.getText().contains("◊∆Õ¥")) {
								name.setText(name.getText().replace("◊∆Õ¥", ""));
							}
						}
						
					}
				});
				this.add(◊∆Õ¥);
				this.add(◊∆Õ¥_box);	
			
				//copy tab
				JLabel  ÷Õ¥= new JLabel(" ÷Õ¥:");  
				 ÷Õ¥.setForeground(Color.WHITE);
				 ÷Õ¥.setBounds(10+110, 20+175, 100, 50);
				JCheckBox  ÷Õ¥_box= new JCheckBox();
				 ÷Õ¥_box.setBounds(10+60+110, 33+175, 20, 20);
				 ÷Õ¥_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if( ÷Õ¥_box.isSelected()) {
							if(!name.getText().contains(" ÷Õ¥")) {
								name.setText(name.getText()+"  ÷Õ¥");
							}
						}else {
							if(name.getText().contains(" ÷Õ¥")) {
								name.setText(name.getText().replace(" ÷Õ¥", ""));
							}
						}
						
					}
				});
				this.add( ÷Õ¥);
				this.add( ÷Õ¥_box);	
				//copy tab
				JLabel Ω≈Õ¥= new JLabel("Ω≈Õ¥:");  
				Ω≈Õ¥.setForeground(Color.WHITE);
				Ω≈Õ¥.setBounds(10+110, 20+200, 100, 50);
				JCheckBox Ω≈Õ¥_box= new JCheckBox();
				Ω≈Õ¥_box.setBounds(10+60+110, 33+200, 20, 20);
				Ω≈Õ¥_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ω≈Õ¥_box.isSelected()) {
							if(!name.getText().contains("Ω≈Õ¥")) {
								name.setText(name.getText()+" Ω≈Õ¥");
							}
						}else {
							if(name.getText().contains("Ω≈Õ¥")) {
								name.setText(name.getText().replace("Ω≈Õ¥", ""));
							}
						}
						
					}
				});
				this.add(Ω≈Õ¥);
				this.add(Ω≈Õ¥_box);	
				//copy tab
				JLabel —¸Õ¥= new JLabel("—¸Õ¥:");  
				—¸Õ¥.setForeground(Color.WHITE);
				—¸Õ¥.setBounds(10+110, 20+225, 100, 50);
				JCheckBox —¸Õ¥_box= new JCheckBox();
				—¸Õ¥_box.setBounds(10+60+110, 33+225, 20, 20);
				—¸Õ¥_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(—¸Õ¥_box.isSelected()) {
							if(!name.getText().contains("—¸Õ¥")) {
								name.setText(name.getText()+" —¸Õ¥");
							}
						}else {
							if(name.getText().contains("—¸Õ¥")) {
								name.setText(name.getText().replace("—¸Õ¥", ""));
							}
						}
						
					}
				});
				this.add(—¸Õ¥);
				this.add(—¸Õ¥_box);	
				//copy tab
				JLabel ±≥Õ¥= new JLabel("±≥Õ¥:");  
				±≥Õ¥.setForeground(Color.WHITE);
				±≥Õ¥.setBounds(10+110, 20+250, 100, 50);
				JCheckBox ±≥Õ¥_box= new JCheckBox();
				±≥Õ¥_box.setBounds(10+60+110, 33+250, 20, 20);
				±≥Õ¥_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(±≥Õ¥_box.isSelected()) {
							if(!name.getText().contains("±≥Õ¥")) {
								name.setText(name.getText()+" ±≥Õ¥");
							}
						}else {
							if(name.getText().contains("±≥Õ¥")) {
								name.setText(name.getText().replace("±≥Õ¥", ""));
							}
						}
						
					}
				});
				this.add(±≥Õ¥);
				this.add(±≥Õ¥_box);	
				//copy tab
				JLabel ÷∏º◊Õ¥= new JLabel("÷∏º◊Õ¥:");  
				÷∏º◊Õ¥.setForeground(Color.WHITE);
				÷∏º◊Õ¥.setBounds(10+110, 20+275, 100, 50);
				JCheckBox ÷∏º◊Õ¥_box= new JCheckBox();
				÷∏º◊Õ¥_box.setBounds(10+60+110, 33+275, 20, 20);
				÷∏º◊Õ¥_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(÷∏º◊Õ¥_box.isSelected()) {
							if(!name.getText().contains("÷∏º◊Õ¥")) {
								name.setText(name.getText()+" ÷∏º◊Õ¥");
							}
						}else {
							if(name.getText().contains("÷∏º◊Õ¥")) {
								name.setText(name.getText().replace("÷∏º◊Õ¥", ""));
							}
						}
						
					}
				});
				this.add(÷∏º◊Õ¥);
				this.add(÷∏º◊Õ¥_box);	
				//copy tab
				JLabel  ÷’∆Õ¥= new JLabel(" ÷’∆Õ¥:");  
				 ÷’∆Õ¥.setForeground(Color.WHITE);
				 ÷’∆Õ¥.setBounds(10+110, 20+300, 100, 50);
				JCheckBox  ÷’∆Õ¥_box= new JCheckBox();
				 ÷’∆Õ¥_box.setBounds(10+60+110, 33+300, 20, 20);
				 ÷’∆Õ¥_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if( ÷’∆Õ¥_box.isSelected()) {
							if(!name.getText().contains(" ÷’∆Õ¥")) {
								name.setText(name.getText()+"  ÷’∆Õ¥");
							}
						}else {
							if(name.getText().contains(" ÷’∆Õ¥")) {
								name.setText(name.getText().replace(" ÷’∆Õ¥", ""));
							}
						}
						
					}
				});
				this.add( ÷’∆Õ¥);
				this.add( ÷’∆Õ¥_box);	
				//copy tab
				JLabel Ω≈÷∫Õ¥= new JLabel("Ω≈÷∫Õ¥:");  
				Ω≈÷∫Õ¥.setForeground(Color.WHITE);
				Ω≈÷∫Õ¥.setBounds(10+110, 20+325, 100, 50);
				JCheckBox Ω≈÷∫Õ¥_box= new JCheckBox();
				Ω≈÷∫Õ¥_box.setBounds(10+60+110, 33+325, 20, 20);
				Ω≈÷∫Õ¥_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ω≈÷∫Õ¥_box.isSelected()) {
							if(!name.getText().contains("Ω≈÷∫Õ¥")) {
								name.setText(name.getText()+" Ω≈÷∫Õ¥");
							}
						}else {
							if(name.getText().contains("Ω≈÷∫Õ¥")) {
								name.setText(name.getText().replace("Ω≈÷∫Õ¥", ""));
							}
						}
						
					}
				});
				this.add(Ω≈÷∫Õ¥);
				this.add(Ω≈÷∫Õ¥_box);	
			
				//copy tab
				JLabel …§Õ¥= new JLabel("…§Õ¥:");  
				…§Õ¥.setForeground(Color.WHITE);
				…§Õ¥.setBounds(10+110+110, 20+400, 100, 50);
				JCheckBox …§Õ¥_box= new JCheckBox();
				…§Õ¥_box.setBounds(10+60+110+110, 33+400, 20, 20);
				…§Õ¥_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(…§Õ¥_box.isSelected()) {
							if(!name.getText().contains("…§Õ¥")) {
								name.setText(name.getText()+" …§Õ¥");
							}
						}else {
							if(name.getText().contains("…§Õ¥")) {
								name.setText(name.getText().replace("…§Õ¥", ""));
							}
						}
						
					}
				});
				this.add(…§Õ¥);
				this.add(…§Õ¥_box);	
				
				//copy tab
				JLabel —¿Õ¥= new JLabel("—¿Õ¥:");  
				—¿Õ¥.setForeground(Color.WHITE);
				—¿Õ¥.setBounds(10+110+110+110, 20+425, 100, 50);
				JCheckBox —¿Õ¥_box= new JCheckBox();
				—¿Õ¥_box.setBounds(10+60+110+110+110, 33+425, 20, 20);
				—¿Õ¥_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(—¿Õ¥_box.isSelected()) {
							if(!name.getText().contains("—¿Õ¥")) {
								name.setText(name.getText()+" —¿Õ¥");
							}
						}else {
							if(name.getText().contains("—¿Õ¥")) {
								name.setText(name.getText().replace("—¿Õ¥", ""));
							}
						}
						
					}
				});
				this.add(—¿Õ¥);
				this.add(—¿Õ¥_box);	
			
				//copy tab
				JLabel –°±„¥ÃÕ¥= new JLabel("–°±„¥ÃÕ¥:");  
				–°±„¥ÃÕ¥.setForeground(Color.WHITE);
				–°±„¥ÃÕ¥.setBounds(10+110+110+440, 20+375, 100, 50);
				JCheckBox –°±„¥ÃÕ¥_box= new JCheckBox();
				–°±„¥ÃÕ¥_box.setBounds(10+60+110+110+440, 33+375, 20, 20);
				–°±„¥ÃÕ¥_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(–°±„¥ÃÕ¥_box.isSelected()) {
							if(!name.getText().contains("–°±„¥ÃÕ¥")) {
								name.setText(name.getText()+" –°±„¥ÃÕ¥");
							}
						}else {
							if(name.getText().contains("–°±„¥ÃÕ¥")) {
								name.setText(name.getText().replace("–°±„¥ÃÕ¥", ""));
							}
						}
						
					}
				});
				this.add(–°±„¥ÃÕ¥);
				this.add(–°±„¥ÃÕ¥_box);		
			
				//copy tab
				JLabel π«Õ¥= new JLabel("π«Õ¥:");  
				π«Õ¥.setForeground(Color.WHITE);
				π«Õ¥.setBounds(10, 20, 100, 50);
				JCheckBox π«Õ¥_box= new JCheckBox();
				π«Õ¥_box.setBounds(10+60, 33, 20, 20);
				π«Õ¥_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(π«Õ¥_box.isSelected()) {
							if(!name.getText().contains("π«Õ¥")) {
								name.setText(name.getText()+" π«Õ¥");
							}
						}else {
							if(name.getText().contains("π«Õ¥")) {
								name.setText(name.getText().replace("π«Õ¥", ""));
							}
						}
						
					}
				});
				this.add(π«Õ¥);
				this.add(π«Õ¥_box);
				
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