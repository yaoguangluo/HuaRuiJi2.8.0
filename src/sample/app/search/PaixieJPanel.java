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

public class PaixieJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PaixieJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);
		
			
		
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
				JLabel º¹¶à= new JLabel("º¹¶à:");  
				º¹¶à.setForeground(Color.WHITE);
				º¹¶à.setBounds(10+110+110+110, 20, 100, 50);
				JCheckBox º¹¶à_box= new JCheckBox();
				º¹¶à_box.setBounds(10+60+110+110+110, 33, 20, 20);
				º¹¶à_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(º¹¶à_box.isSelected()) {
							if(!name.getText().contains("º¹¶à")) {
								name.setText(name.getText()+" º¹¶à");
							}
						}else {
							if(name.getText().contains("º¹¶à")) {
								name.setText(name.getText().replace("º¹¶à", ""));
							}
						}
						
					}
				});
				this.add(º¹¶à);
				this.add(º¹¶à_box);
				//copy tab
				JLabel º¹Ñª= new JLabel("º¹Ñª:");  
				º¹Ñª.setForeground(Color.WHITE);
				º¹Ñª.setBounds(10+110+110+110, 20+25, 100, 50);
				JCheckBox º¹Ñª_box= new JCheckBox();
				º¹Ñª_box.setBounds(10+60+110+110+110, 33+25, 20, 20);
				º¹Ñª_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(º¹Ñª_box.isSelected()) {
							if(!name.getText().contains("º¹Ñª")) {
								name.setText(name.getText()+" º¹Ñª");
							}
						}else {
							if(name.getText().contains("º¹Ñª")) {
								name.setText(name.getText().replace("º¹Ñª", ""));
							}
						}
						
					}
				});
				this.add(º¹Ñª);
				this.add(º¹Ñª_box);
				//copy tab
				JLabel º¹³ô= new JLabel("º¹³ô:");  
				º¹³ô.setForeground(Color.WHITE);
				º¹³ô.setBounds(10+110+110+110, 20+50, 100, 50);
				JCheckBox º¹³ô_box= new JCheckBox();
				º¹³ô_box.setBounds(10+60+110+110+110, 33+50, 20, 20);
				º¹³ô_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(º¹³ô_box.isSelected()) {
							if(!name.getText().contains("º¹³ô")) {
								name.setText(name.getText()+" º¹³ô");
							}
						}else {
							if(name.getText().contains("º¹³ô")) {
								name.setText(name.getText().replace("º¹³ô", ""));
							}
						}
						
					}
				});
				this.add(º¹³ô);
				this.add(º¹³ô_box);
				//copy tab
				JLabel ºü³ô= new JLabel("ºü³ô:");  
				ºü³ô.setForeground(Color.WHITE);
				ºü³ô.setBounds(10+110+110+110, 20+75, 100, 50);
				JCheckBox ºü³ô_box= new JCheckBox();
				ºü³ô_box.setBounds(10+60+110+110+110, 33+75, 20, 20);
				ºü³ô_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ºü³ô_box.isSelected()) {
							if(!name.getText().contains("ºü³ô")) {
								name.setText(name.getText()+" ºü³ô");
							}
						}else {
							if(name.getText().contains("ºü³ô")) {
								name.setText(name.getText().replace("ºü³ô", ""));
							}
						}
						
					}
				});
				this.add(ºü³ô);
				this.add(ºü³ô_box);
				//copy tab
				JLabel ´ó±ãÂÌ= new JLabel("´ó±ãÂÌ:");  
				´ó±ãÂÌ.setForeground(Color.WHITE);
				´ó±ãÂÌ.setBounds(10+110+110+110, 20+100, 100, 50);
				JCheckBox ´ó±ãÂÌ_box= new JCheckBox();
				´ó±ãÂÌ_box.setBounds(10+60+110+110+110, 33+100, 20, 20);
				´ó±ãÂÌ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(´ó±ãÂÌ_box.isSelected()) {
							if(!name.getText().contains("´ó±ãÂÌ")) {
								name.setText(name.getText()+" ´ó±ãÂÌ");
							}
						}else {
							if(name.getText().contains("´ó±ãÂÌ")) {
								name.setText(name.getText().replace("´ó±ãÂÌ", ""));
							}
						}
						
					}
				});
				this.add(´ó±ãÂÌ);
				this.add(´ó±ãÂÌ_box);
				//copy tab
				JLabel ÄòºÚ= new JLabel("ÄòºÚ:");  
				ÄòºÚ.setForeground(Color.WHITE);
				ÄòºÚ.setBounds(10+110+110+110, 20+125, 100, 50);
				JCheckBox ÄòºÚ_box= new JCheckBox();
				ÄòºÚ_box.setBounds(10+60+110+110+110, 33+125, 20, 20);
				ÄòºÚ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÄòºÚ_box.isSelected()) {
							if(!name.getText().contains("ÄòºÚ")) {
								name.setText(name.getText()+" ÄòºÚ");
							}
						}else {
							if(name.getText().contains("ÄòºÚ")) {
								name.setText(name.getText().replace("ÄòºÚ", ""));
							}
						}
						
					}
				});
				this.add(ÄòºÚ);
				this.add(ÄòºÚ_box);
				//copy tab
				JLabel Äò³ô= new JLabel("Äò³ô:");  
				Äò³ô.setForeground(Color.WHITE);
				Äò³ô.setBounds(10+110+110+110, 20+150, 100, 50);
				JCheckBox Äò³ô_box= new JCheckBox();
				Äò³ô_box.setBounds(10+60+110+110+110, 33+150, 20, 20);
				Äò³ô_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Äò³ô_box.isSelected()) {
							if(!name.getText().contains("Äò³ô")) {
								name.setText(name.getText()+" Äò³ô");
							}
						}else {
							if(name.getText().contains("Äò³ô")) {
								name.setText(name.getText().replace("Äò³ô", ""));
							}
						}
						
					}
				});
				this.add(Äò³ô);
				this.add(Äò³ô_box);
				//copy tab
				JLabel ¿Ú³ô= new JLabel("¿Ú³ô:");  
				¿Ú³ô.setForeground(Color.WHITE);
				¿Ú³ô.setBounds(10+110+110+110, 20+175, 100, 50);
				JCheckBox ¿Ú³ô_box= new JCheckBox();
				¿Ú³ô_box.setBounds(10+60+110+110+110, 33+175, 20, 20);
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
				JLabel Æ¨³ô= new JLabel("Æ¨³ô:");  
				Æ¨³ô.setForeground(Color.WHITE);
				Æ¨³ô.setBounds(10+110+110+110, 20+200, 100, 50);
				JCheckBox Æ¨³ô_box= new JCheckBox();
				Æ¨³ô_box.setBounds(10+60+110+110+110, 33+200, 20, 20);
				Æ¨³ô_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Æ¨³ô_box.isSelected()) {
							if(!name.getText().contains("Æ¨³ô")) {
								name.setText(name.getText()+" Æ¨³ô");
							}
						}else {
							if(name.getText().contains("Æ¨³ô")) {
								name.setText(name.getText().replace("Æ¨³ô", ""));
							}
						}
						
					}
				});
				this.add(Æ¨³ô);
				this.add(Æ¨³ô_box);
				//copy tab
				JLabel Äò×Ø= new JLabel("Äò×Ø:");  
				Äò×Ø.setForeground(Color.WHITE);
				Äò×Ø.setBounds(10+110+110+110, 20+225, 100, 50);
				JCheckBox Äò×Ø_box= new JCheckBox();
				Äò×Ø_box.setBounds(10+60+110+110+110, 33+225, 20, 20);
				Äò×Ø_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Äò×Ø_box.isSelected()) {
							if(!name.getText().contains("Äò×Ø")) {
								name.setText(name.getText()+" Äò×Ø");
							}
						}else {
							if(name.getText().contains("Äò×Ø")) {
								name.setText(name.getText().replace("Äò×Ø", ""));
							}
						}
						
					}
				});
				this.add(Äò×Ø);
				this.add(Äò×Ø_box);
				
				//copy tab
				JLabel º¹É§= new JLabel("º¹É§:");  
				º¹É§.setForeground(Color.WHITE);
				º¹É§.setBounds(10+110+110+110, 20+250, 100, 50);
				JCheckBox º¹É§_box= new JCheckBox();
				º¹É§_box.setBounds(10+60+110+110+110, 33+250, 20, 20);
				º¹É§_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(º¹É§_box.isSelected()) {
							if(!name.getText().contains("º¹É§")) {
								name.setText(name.getText()+" º¹É§");
							}
						}else {
							if(name.getText().contains("º¹É§")) {
								name.setText(name.getText().replace("º¹É§", ""));
							}
						}
						
					}
				});
				this.add(º¹É§);
				this.add(º¹É§_box);
				
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