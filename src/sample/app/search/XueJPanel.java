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

public class XueJPanel extends JPanel implements MouseListener, KeyListener, ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public XueJPanel(JTextField name){
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
				JLabel Ñª»Æ= new JLabel("Ñª»Æ:");  
				Ñª»Æ.setForeground(Color.WHITE);
				Ñª»Æ.setBounds(10+110, 20, 100, 50);
				JCheckBox Ñª»Æ_box= new JCheckBox();
				Ñª»Æ_box.setBounds(10+60+110, 33, 20, 20);
				Ñª»Æ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ñª»Æ_box.isSelected()) {
							if(!name.getText().contains("Ñª»Æ")) {
								name.setText(name.getText()+" Ñª»Æ");
							}
						}else {
							if(name.getText().contains("Ñª»Æ")) {
								name.setText(name.getText().replace("Ñª»Æ", ""));
							}
						}
						
					}
				});
				this.add(Ñª»Æ);
				this.add(Ñª»Æ_box);
				//copy tab
				JLabel ÑªºÚ= new JLabel("ÑªºÚ:");  
				ÑªºÚ.setForeground(Color.WHITE);
				ÑªºÚ.setBounds(10+110, 20+25, 100, 50);
				JCheckBox ÑªºÚ_box= new JCheckBox();
				ÑªºÚ_box.setBounds(10+60+110, 33+25, 20, 20);
				ÑªºÚ_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(ÑªºÚ_box.isSelected()) {
							if(!name.getText().contains("ÑªºÚ")) {
								name.setText(name.getText()+" ÑªºÚ");
							}
						}else {
							if(name.getText().contains("ÑªºÚ")) {
								name.setText(name.getText().replace("ÑªºÚ", ""));
							}
						}
						
					}
				});
				this.add(ÑªºÚ);
				this.add(ÑªºÚ_box);
				//copy tab
				JLabel Ñª°×= new JLabel("Ñª°×:");  
				Ñª°×.setForeground(Color.WHITE);
				Ñª°×.setBounds(10+110, 20+50, 100, 50);
				JCheckBox Ñª°×_box= new JCheckBox();
				Ñª°×_box.setBounds(10+60+110, 33+50, 20, 20);
				Ñª°×_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Ñª°×_box.isSelected()) {
							if(!name.getText().contains("Ñª°×")) {
								name.setText(name.getText()+" Ñª°×");
							}
						}else {
							if(name.getText().contains("Ñª°×")) {
								name.setText(name.getText().replace("Ñª°×", ""));
							}
						}
						
					}
				});
				this.add(Ñª°×);
				this.add(Ñª°×_box);
				//copy tab
				JLabel Á÷Ñª²»Ö¹= new JLabel("Á÷Ñª²»Ö¹:");  
				Á÷Ñª²»Ö¹.setForeground(Color.WHITE);
				Á÷Ñª²»Ö¹.setBounds(10+110, 20+75, 100, 50);
				JCheckBox Á÷Ñª²»Ö¹_box= new JCheckBox();
				Á÷Ñª²»Ö¹_box.setBounds(10+60+110, 33+75, 20, 20);
				Á÷Ñª²»Ö¹_box.addActionListener(new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent arg0) {
						if(Á÷Ñª²»Ö¹_box.isSelected()) {
							if(!name.getText().contains("Á÷Ñª²»Ö¹")) {
								name.setText(name.getText()+" Á÷Ñª²»Ö¹");
							}
						}else {
							if(name.getText().contains("Á÷Ñª²»Ö¹")) {
								name.setText(name.getText().replace("Á÷Ñª²»Ö¹", ""));
							}
						}
						
					}
				});
				this.add(Á÷Ñª²»Ö¹);
				this.add(Á÷Ñª²»Ö¹_box);
					
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