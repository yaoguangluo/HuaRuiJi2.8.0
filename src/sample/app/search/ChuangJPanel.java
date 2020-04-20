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

public class ChuangJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ChuangJPanel(JTextField name){
		this.setLayout(null);
		this.setBounds(0, 0, 780, 610);
		this.setBackground(Color.BLACK);
		
		
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
				JLabel ğåÕî= new JLabel("ğåÕî:");  
				ğåÕî.setForeground(Color.WHITE);
				ğåÕî.setBounds(10+110+110+110, 20+100, 100, 50);
				JCheckBox ğåÕî_box= new JCheckBox();
				ğåÕî_box.setBounds(10+60+110+110+110, 33+100, 20, 20);
				ğåÕî_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ğåÕî_box.isSelected()) {
							if(!name.getText().contains("ğåÕî")) {
								name.setText(name.getText()+" ğåÕî");
							}
						}else {
							if(name.getText().contains("ğåÕî")) {
								name.setText(name.getText().replace("ğåÕî", ""));
							}
						}
						
					}
				});
				this.add(ğåÕî);
				this.add(ğåÕî_box);	
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
				JLabel Ñ×Õî= new JLabel("Ñ×Õî:");  
				Ñ×Õî.setForeground(Color.WHITE);
				Ñ×Õî.setBounds(10+110+110, 20, 100, 50);
				JCheckBox Ñ×Õî_box= new JCheckBox();
				Ñ×Õî_box.setBounds(10+60+110+110, 33, 20, 20);
				Ñ×Õî_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ñ×Õî_box.isSelected()) {
							if(!name.getText().contains("Ñ×Õî")) {
								name.setText(name.getText()+" Ñ×Õî");
							}
						}else {
							if(name.getText().contains("Ñ×Õî")) {
								name.setText(name.getText().replace("Ñ×Õî", ""));
							}
						}
						
					}
				});
				this.add(Ñ×Õî);
				this.add(Ñ×Õî_box);
				//copy tab
				JLabel ÈùÏÙÕî= new JLabel("ÈùÏÙÕî:");  
				ÈùÏÙÕî.setForeground(Color.WHITE);
				ÈùÏÙÕî.setBounds(10+110+110, 20+25, 100, 50);
				JCheckBox ÈùÏÙÕî_box= new JCheckBox();
				ÈùÏÙÕî_box.setBounds(10+60+110+110, 33+25, 20, 20);
				ÈùÏÙÕî_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÈùÏÙÕî_box.isSelected()) {
							if(!name.getText().contains("ÈùÏÙÕî")) {
								name.setText(name.getText()+" ÈùÏÙÕî");
							}
						}else {
							if(name.getText().contains("ÈùÏÙÕî")) {
								name.setText(name.getText().replace("ÈùÏÙÕî", ""));
							}
						}
						
					}
				});
				this.add(ÈùÏÙÕî);
				this.add(ÈùÏÙÕî_box);
				//copy tab
				JLabel Æ¤Õî= new JLabel("Æ¤Õî:");  
				Æ¤Õî.setForeground(Color.WHITE);
				Æ¤Õî.setBounds(10+110+110, 20+50, 100, 50);
				JCheckBox Æ¤Õî_box= new JCheckBox();
				Æ¤Õî_box.setBounds(10+60+110+110, 33+50, 20, 20);
				Æ¤Õî_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Æ¤Õî_box.isSelected()) {
							if(!name.getText().contains("Æ¤Õî")) {
								name.setText(name.getText()+" Æ¤Õî");
							}
						}else {
							if(name.getText().contains("Æ¤Õî")) {
								name.setText(name.getText().replace("Æ¤Õî", ""));
							}
						}
						
					}
				});
				this.add(Æ¤Õî);
				this.add(Æ¤Õî_box);
				//copy tab
				JLabel µ¶´¯= new JLabel("µ¶´¯:");  
				µ¶´¯.setForeground(Color.WHITE);
				µ¶´¯.setBounds(10+110+110, 20+75, 100, 50);
				JCheckBox µ¶´¯_box= new JCheckBox();
				µ¶´¯_box.setBounds(10+60+110+110, 33+75, 20, 20);
				µ¶´¯_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(µ¶´¯_box.isSelected()) {
							if(!name.getText().contains("µ¶´¯")) {
								name.setText(name.getText()+" µ¶´¯");
							}
						}else {
							if(name.getText().contains("µ¶´¯")) {
								name.setText(name.getText().replace("µ¶´¯", ""));
							}
						}
						
					}
				});
				this.add(µ¶´¯);
				this.add(µ¶´¯_box);
				//copy tab
				JLabel ÆÆÉË·ç= new JLabel("ÆÆÉË·ç:");  
				ÆÆÉË·ç.setForeground(Color.WHITE);
				ÆÆÉË·ç.setBounds(10+110+110, 20+100, 100, 50);
				JCheckBox ÆÆÉË·ç_box= new JCheckBox();
				ÆÆÉË·ç_box.setBounds(10+60+110+110, 33+100, 20, 20);
				ÆÆÉË·ç_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÆÆÉË·ç_box.isSelected()) {
							if(!name.getText().contains("ÆÆÉË·ç")) {
								name.setText(name.getText()+" ÆÆÉË·ç");
							}
						}else {
							if(name.getText().contains("ÆÆÉË·ç")) {
								name.setText(name.getText().replace("ÆÆÉË·ç", ""));
							}
						}
						
					}
				});
				this.add(ÆÆÉË·ç);
				this.add(ÆÆÉË·ç_box);
				//copy tab
				JLabel ¶¯ÎïÒ§ÉË= new JLabel("¶¯ÎïÒ§ÉË:");  
				¶¯ÎïÒ§ÉË.setForeground(Color.WHITE);
				¶¯ÎïÒ§ÉË.setBounds(10+110+110, 20+125, 100, 50);
				JCheckBox ¶¯ÎïÒ§ÉË_box= new JCheckBox();
				¶¯ÎïÒ§ÉË_box.setBounds(10+60+110+110, 33+125, 20, 20);
				¶¯ÎïÒ§ÉË_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(¶¯ÎïÒ§ÉË_box.isSelected()) {
							if(!name.getText().contains("¶¯ÎïÒ§ÉË")) {
								name.setText(name.getText()+" ¶¯ÎïÒ§ÉË");
							}
						}else {
							if(name.getText().contains("¶¯ÎïÒ§ÉË")) {
								name.setText(name.getText().replace("¶¯ÎïÒ§ÉË", ""));
							}
						}
						
					}
				});
				this.add(¶¯ÎïÒ§ÉË);
				this.add(¶¯ÎïÒ§ÉË_box);
				//copy tab
				JLabel ¶³´¯= new JLabel("¶³´¯:");  
				¶³´¯.setForeground(Color.WHITE);
				¶³´¯.setBounds(10+110+110, 20+150, 100, 50);
				JCheckBox ¶³´¯_box= new JCheckBox();
				¶³´¯_box.setBounds(10+60+110+110, 33+150, 20, 20);
				¶³´¯_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(¶³´¯_box.isSelected()) {
							if(!name.getText().contains("¶³´¯")) {
								name.setText(name.getText()+" ¶³´¯");
							}
						}else {
							if(name.getText().contains("¶³´¯")) {
								name.setText(name.getText().replace("¶³´¯", ""));
							}
						}
						
					}
				});
				this.add(¶³´¯);
				this.add(¶³´¯_box);
				//copy tab
				JLabel ¾Ã´¯²»Óú= new JLabel("¾Ã´¯²»Óú:");  
				¾Ã´¯²»Óú.setForeground(Color.WHITE);
				¾Ã´¯²»Óú.setBounds(10+110+110, 20+175, 100, 50);
				JCheckBox ¾Ã´¯²»Óú_box= new JCheckBox();
				¾Ã´¯²»Óú_box.setBounds(10+60+110+110, 33+175, 20, 20);
				¾Ã´¯²»Óú_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(¾Ã´¯²»Óú_box.isSelected()) {
							if(!name.getText().contains("¾Ã´¯²»Óú")) {
								name.setText(name.getText()+" ¾Ã´¯²»Óú");
							}
						}else {
							if(name.getText().contains("¾Ã´¯²»Óú")) {
								name.setText(name.getText().replace("¾Ã´¯²»Óú", ""));
							}
						}
						
					}
				});
				this.add(¾Ã´¯²»Óú);
				this.add(¾Ã´¯²»Óú_box);
				
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