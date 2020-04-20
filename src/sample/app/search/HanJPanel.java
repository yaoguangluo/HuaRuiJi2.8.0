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

public class HanJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public HanJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);
		
		//copy tab
		JLabel bisai= new JLabel("±«»˚:");  
		bisai.setForeground(Color.WHITE);
		bisai.setBounds(10, 20, 100, 50);
		JCheckBox bisai_box= new JCheckBox();
		bisai_box.setBounds(10+60, 33, 20, 20);
		bisai_box.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(bisai_box.isSelected()) {
					if(!name.getText().contains("±«»˚")) {
						name.setText(name.getText()+" ±«»˚");
					}
				}else {
					if(name.getText().contains("±«»˚")) {
						name.setText(name.getText().replace("±«»˚", ""));
					}
				}
				
			}
		});
		this.add(bisai);
		this.add(bisai_box);
		
		//copy tab
				JLabel biti= new JLabel("±«ÃÈ:");  
				biti.setForeground(Color.WHITE);
				biti.setBounds(10, 20+25, 100, 50);
				JCheckBox biti_box= new JCheckBox();
				biti_box.setBounds(10+60, 33+25, 20, 20);
				biti_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(biti_box.isSelected()) {
							if(!name.getText().contains("±«ÃÈ")) {
								name.setText(name.getText()+" ±«ÃÈ");
							}
						}else {
							if(name.getText().contains("±«ÃÈ")) {
								name.setText(name.getText().replace("±«ÃÈ", ""));
							}
						}
						
					}
				});
				this.add(biti);
				this.add(biti_box);
		
		//copy tab
				JLabel kesou= new JLabel("ø»À‘:");  
				kesou.setForeground(Color.WHITE);
				kesou.setBounds(10, 45+25+25, 100, 50);
				JCheckBox kesou_box= new JCheckBox();
				kesou_box.setBounds(10+60, 58+25+25, 20, 20);
				kesou_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(kesou_box.isSelected()) {
							if(!name.getText().contains("ø»À‘")) {
								name.setText(name.getText()+" ø»À‘");
							}
						}else {
							if(name.getText().contains("ø»À‘")) {
								name.setText(name.getText().replace("ø»À‘", ""));
							}
						}
						
					}
				});
				this.add(kesou);
				this.add(kesou_box);
				
				//copy tab
				JLabel Œ∑∫Æ= new JLabel("Œ∑∫Æ:");  
				Œ∑∫Æ.setForeground(Color.WHITE);
				Œ∑∫Æ.setBounds(10, 45+25+50, 100, 50);
				JCheckBox Œ∑∫Æ_box= new JCheckBox();
				Œ∑∫Æ_box.setBounds(10+60, 58+25+50, 20, 20);
				Œ∑∫Æ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Œ∑∫Æ_box.isSelected()) {
							if(!name.getText().contains("Œ∑∫Æ")) {
								name.setText(name.getText()+" Œ∑∫Æ");
							}
						}else {
							if(name.getText().contains("Œ∑∫Æ")) {
								name.setText(name.getText().replace("Œ∑∫Æ", ""));
							}
						}
						
					}
				});
				this.add(Œ∑∫Æ);
				this.add(Œ∑∫Æ_box);
				
				
				//copy tab
				JLabel ∑¢¿‰= new JLabel("∑¢¿‰:");  
				∑¢¿‰.setForeground(Color.WHITE);
				∑¢¿‰.setBounds(10+110+110+110, 20+25, 100, 50);
				JCheckBox ∑¢¿‰_box= new JCheckBox();
				∑¢¿‰_box.setBounds(10+60+110+110+110, 33+25, 20, 20);
				∑¢¿‰_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(∑¢¿‰_box.isSelected()) {
							if(!name.getText().contains("∑¢¿‰")) {
								name.setText(name.getText()+" ∑¢¿‰");
							}
						}else {
							if(name.getText().contains("∑¢¿‰")) {
								name.setText(name.getText().replace("∑¢¿‰", ""));
							}
						}
						
					}
				});
				this.add(∑¢¿‰);
				this.add(∑¢¿‰_box);	
				
				//copy tab
				JLabel Ω≈¿‰= new JLabel("Ω≈¿‰:");  
				Ω≈¿‰.setForeground(Color.WHITE);
				Ω≈¿‰.setBounds(10+110+110+110, 20+25+25, 100, 50);
				JCheckBox Ω≈¿‰_box= new JCheckBox();
				Ω≈¿‰_box.setBounds(10+60+110+110+110, 33+25+25, 20, 20);
				Ω≈¿‰_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ω≈¿‰_box.isSelected()) {
							if(!name.getText().contains("Ω≈¿‰")) {
								name.setText(name.getText()+" Ω≈¿‰");
							}
						}else {
							if(name.getText().contains("Ω≈¿‰")) {
								name.setText(name.getText().replace("Ω≈¿‰", ""));
							}
						}
					}
				});
				this.add(Ω≈¿‰);
				this.add(Ω≈¿‰_box);	
				
				//copy tab
				JLabel ∂≥¥Ø= new JLabel("∂≥¥Ø:");  
				∂≥¥Ø.setForeground(Color.WHITE);
				∂≥¥Ø.setBounds(10+110+110+110, 20+25+25+25, 100, 50);
				JCheckBox ∂≥¥Ø_box= new JCheckBox();
				∂≥¥Ø_box.setBounds(10+60+110+110+110, 33+25+25+25, 20, 20);
				∂≥¥Ø_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(∂≥¥Ø_box.isSelected()) {
							if(!name.getText().contains("∂≥¥Ø")) {
								name.setText(name.getText()+" ∂≥¥Ø");
							}
						}else {
							if(name.getText().contains("∂≥¥Ø")) {
								name.setText(name.getText().replace("∂≥¥Ø", ""));
							}
						}
					}
				});
				this.add(∂≥¥Ø);
				this.add(∂≥¥Ø_box);	
				
				//copy tab
				JLabel ∏π¿‰= new JLabel("∏π¿‰:");  
				∏π¿‰.setForeground(Color.WHITE);
				∏π¿‰.setBounds(10+110+110+110, 20+25+25+25+25+25, 100, 50);
				JCheckBox ∏π¿‰_box= new JCheckBox();
				∏π¿‰_box.setBounds(10+60+110+110+110, 33+25+25+25+25+25, 20, 20);
				∏π¿‰_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(∏π¿‰_box.isSelected()) {
							if(!name.getText().contains("∏π¿‰")) {
								name.setText(name.getText()+" ∏π¿‰");
							}
						}else {
							if(name.getText().contains("∏π¿‰")) {
								name.setText(name.getText().replace("∏π¿‰", ""));
							}
						}
					}
				});
				this.add(∏π¿‰);
				this.add(∏π¿‰_box);	
				
				//copy tab
				JLabel Ω≈÷∫¿‰= new JLabel("Ω≈÷∫¿‰:");  
				Ω≈÷∫¿‰.setForeground(Color.WHITE);
				Ω≈÷∫¿‰.setBounds(10+110+110+110, 20+25+25+25+25+25+25, 100, 50);
				JCheckBox Ω≈÷∫¿‰_box= new JCheckBox();
				Ω≈÷∫¿‰_box.setBounds(10+60+110+110+110, 33+25+25+25+25+25+25, 20, 20);
				Ω≈÷∫¿‰_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ω≈÷∫¿‰_box.isSelected()) {
							if(!name.getText().contains("Ω≈÷∫¿‰")) {
								name.setText(name.getText()+" Ω≈÷∫¿‰");
							}
						}else {
							if(name.getText().contains("Ω≈÷∫¿‰")) {
								name.setText(name.getText().replace("Ω≈÷∫¿‰", ""));
							}
						}
					}
				});
				this.add(Ω≈÷∫¿‰);
				this.add(Ω≈÷∫¿‰_box);
				
				//copy tab
				JLabel ±≥¿‰= new JLabel("±≥¿‰:");  
				±≥¿‰.setForeground(Color.WHITE);
				±≥¿‰.setBounds(10+110+110+110, 20+25+25+25+25+75, 100, 50);
				JCheckBox ±≥¿‰_box= new JCheckBox();
				±≥¿‰_box.setBounds(10+60+110+110+110, 33+25+25+25+25+75, 20, 20);
				±≥¿‰_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(±≥¿‰_box.isSelected()) {
							if(!name.getText().contains("±≥¿‰")) {
								name.setText(name.getText()+" ±≥¿‰");
							}
						}else {
							if(name.getText().contains("±≥¿‰")) {
								name.setText(name.getText().replace("±≥¿‰", ""));
							}
						}
					}
				});
				this.add(±≥¿‰);
				this.add(±≥¿‰_box);	
				
				//copy tab
				JLabel ∂˙∂‰¿‰= new JLabel("∂˙∂‰¿‰:");  
				∂˙∂‰¿‰.setForeground(Color.WHITE);
				∂˙∂‰¿‰.setBounds(10+110+110+110, 20+25+25+25+25, 100, 50);
				JCheckBox ∂˙∂‰¿‰_box= new JCheckBox();
				∂˙∂‰¿‰_box.setBounds(10+60+110+110+110, 33+25+25+25+25, 20, 20);
				∂˙∂‰¿‰_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(∂˙∂‰¿‰_box.isSelected()) {
							if(!name.getText().contains("∂˙∂‰¿‰")) {
								name.setText(name.getText()+" ∂˙∂‰¿‰");
							}
						}else {
							if(name.getText().contains("∂˙∂‰¿‰")) {
								name.setText(name.getText().replace("∂˙∂‰¿‰", ""));
							}
						}
					}
				});
				this.add(∂˙∂‰¿‰);
				this.add(∂˙∂‰¿‰_box);	
				//copy tab
				JLabel  ÷¿‰= new JLabel(" ÷¿‰:");  
				 ÷¿‰.setForeground(Color.WHITE);
				 ÷¿‰.setBounds(10+110+110+440, 20+25, 100, 50);
				JCheckBox  ÷¿‰_box= new JCheckBox();
				 ÷¿‰_box.setBounds(10+60+110+110+440, 33+25, 20, 20);
				 ÷¿‰_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if( ÷¿‰_box.isSelected()) {
							if(!name.getText().contains(" ÷¿‰")) {
								name.setText(name.getText()+"  ÷¿‰");
							}
						}else {
							if(name.getText().contains(" ÷¿‰")) {
								name.setText(name.getText().replace(" ÷¿‰", ""));
							}
						}
						
					}
				});
				this.add( ÷¿‰);
				this.add( ÷¿‰_box);	
				//copy tab
				JLabel Ω≈’∆¿‰= new JLabel("Ω≈’∆¿‰:");  
				Ω≈’∆¿‰.setForeground(Color.WHITE);
				Ω≈’∆¿‰.setBounds(10+110+110+440, 20+50, 100, 50);
				JCheckBox Ω≈’∆¿‰_box= new JCheckBox();
				Ω≈’∆¿‰_box.setBounds(10+60+110+110+440, 33+50, 20, 20);
				Ω≈’∆¿‰_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ω≈’∆¿‰_box.isSelected()) {
							if(!name.getText().contains("Ω≈’∆¿‰")) {
								name.setText(name.getText()+" Ω≈’∆¿‰");
							}
						}else {
							if(name.getText().contains("Ω≈’∆¿‰")) {
								name.setText(name.getText().replace("Ω≈’∆¿‰", ""));
							}
						}
						
					}
				});
				this.add(Ω≈’∆¿‰);
				this.add(Ω≈’∆¿‰_box);	
				
				//copy tab
				JLabel Àƒ÷´±˘¿‰= new JLabel("Àƒ÷´±˘¿‰:");  
				Àƒ÷´±˘¿‰.setForeground(Color.WHITE);
				Àƒ÷´±˘¿‰.setBounds(10+110+110+440, 20+275, 100, 50);
				JCheckBox Àƒ÷´±˘¿‰_box= new JCheckBox();
				Àƒ÷´±˘¿‰_box.setBounds(10+60+110+110+440, 33+275, 20, 20);
				Àƒ÷´±˘¿‰_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Àƒ÷´±˘¿‰_box.isSelected()) {
							if(!name.getText().contains("Àƒ÷´±˘¿‰")) {
								name.setText(name.getText()+" Àƒ÷´±˘¿‰");
							}
						}else {
							if(name.getText().contains("Àƒ÷´±˘¿‰")) {
								name.setText(name.getText().replace("Àƒ÷´±˘¿‰", ""));
							}
						}
						
					}
				});
				this.add(Àƒ÷´±˘¿‰);
				this.add(Àƒ÷´±˘¿‰_box);	
				
				//copy tab
				JLabel Õ∑¿‰= new JLabel("Õ∑¿‰:");  
				Õ∑¿‰.setForeground(Color.WHITE);
				Õ∑¿‰.setBounds(10+110+110+440, 20+75, 100, 50);
				JCheckBox Õ∑¿‰_box= new JCheckBox();
				Õ∑¿‰_box.setBounds(10+60+110+110+440, 33+75, 20, 20);
				Õ∑¿‰_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Õ∑¿‰_box.isSelected()) {
							if(!name.getText().contains("Õ∑¿‰")) {
								name.setText(name.getText()+" Õ∑¿‰");
							}
						}else {
							if(name.getText().contains("Õ∑¿‰")) {
								name.setText(name.getText().replace("Õ∑¿‰", ""));
							}
						}
						
					}
				});
				this.add(Õ∑¿‰);
				this.add(Õ∑¿‰_box);	
				
				//copy tab
				JLabel œ•∏«¿‰= new JLabel("œ•∏«¿‰:");  
				œ•∏«¿‰.setForeground(Color.WHITE);
				œ•∏«¿‰.setBounds(10+110+110+440, 20+100, 100, 50);
				JCheckBox œ•∏«¿‰_box= new JCheckBox();
				œ•∏«¿‰_box.setBounds(10+60+110+110+440, 33+100, 20, 20);
				œ•∏«¿‰_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(œ•∏«¿‰_box.isSelected()) {
							if(!name.getText().contains("œ•∏«¿‰")) {
								name.setText(name.getText()+" œ•∏«¿‰");
							}
						}else {
							if(name.getText().contains("œ•∏«¿‰")) {
								name.setText(name.getText().replace("œ•∏«¿‰", ""));
							}
						}
						
					}
				});
				this.add(œ•∏«¿‰);
				this.add(œ•∏«¿‰_box);	
				
				//copy tab
				JLabel  ÷÷∏¿‰= new JLabel(" ÷÷∏¿‰:");  
				 ÷÷∏¿‰.setForeground(Color.WHITE);
				 ÷÷∏¿‰.setBounds(10+110+110+440, 20+125, 100, 50);
				JCheckBox  ÷÷∏¿‰_box= new JCheckBox();
				 ÷÷∏¿‰_box.setBounds(10+60+110+110+440, 33+125, 20, 20);
				 ÷÷∏¿‰_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if( ÷÷∏¿‰_box.isSelected()) {
							if(!name.getText().contains(" ÷÷∏¿‰")) {
								name.setText(name.getText()+"  ÷÷∏¿‰");
							}
						}else {
							if(name.getText().contains(" ÷÷∏¿‰")) {
								name.setText(name.getText().replace(" ÷÷∏¿‰", ""));
							}
						}
						
					}
				});
				this.add( ÷÷∏¿‰);
				this.add( ÷÷∏¿‰_box);	
				
				//copy tab
				JLabel πÿΩ⁄¿‰= new JLabel("πÿΩ⁄¿‰:");  
				πÿΩ⁄¿‰.setForeground(Color.WHITE);
				πÿΩ⁄¿‰.setBounds(10+110+110+440, 20+150, 100, 50);
				JCheckBox πÿΩ⁄¿‰_box= new JCheckBox();
				πÿΩ⁄¿‰_box.setBounds(10+60+110+110+440, 33+150, 20, 20);
				πÿΩ⁄¿‰_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(πÿΩ⁄¿‰_box.isSelected()) {
							if(!name.getText().contains("πÿΩ⁄¿‰")) {
								name.setText(name.getText()+" πÿΩ⁄¿‰");
							}
						}else {
							if(name.getText().contains("πÿΩ⁄¿‰")) {
								name.setText(name.getText().replace("πÿΩ⁄¿‰", ""));
							}
						}
						
					}
				});
				this.add(πÿΩ⁄¿‰);
				this.add(πÿΩ⁄¿‰_box);	
				
				//copy tab
				JLabel ∏–æı¿‰= new JLabel("∏–æı¿‰:");  
				∏–æı¿‰.setForeground(Color.WHITE);
				∏–æı¿‰.setBounds(10+110+110+440, 20+175, 100, 50);
				JCheckBox ∏–æı¿‰_box= new JCheckBox();
				∏–æı¿‰_box.setBounds(10+60+110+110+440, 33+175, 20, 20);
				∏–æı¿‰_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(∏–æı¿‰_box.isSelected()) {
							if(!name.getText().contains("∏–æı¿‰")) {
								name.setText(name.getText()+" ∏–æı¿‰");
							}
						}else {
							if(name.getText().contains("∏–æı¿‰")) {
								name.setText(name.getText().replace("∏–æı¿‰", ""));
							}
						}
						
					}
				});
				this.add(∏–æı¿‰);
				this.add(∏–æı¿‰_box);	
		
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