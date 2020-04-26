package org.tinos.node.image.find.color.b;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.image.BufferedImage;
import javax.swing.JButton;

import org.tinos.gui.osgi.*;
public class FindColorBView extends ObjectView{
	private static final long serialVersionUID = 1L;
	public JButton button;
	public String path;
	public FindColorBView(){
		super();
	}
	public void view() throws Exception{
		scrollPane = new ScrollPane();
		panel=new Panel(){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			public void paint(Graphics g){
				BufferedImage image = lygout.image;
				//	 BufferedImage image = new BufferedImage(gout[0].length, gout.length, BufferedImage.TYPE_INT_RGB);
				for (int i = 0; i < image.getHeight(); ++i) {
					for (int j = 0; j < image.getWidth(); ++j) {
						int bb = image.getRGB(j, i) & 0xFF;	 	
						int rr = 0;
						int gg = 0;
						int pixel = (rr << 16) | (gg << 8) | (bb);
						image.setRGB(j, i, pixel);
					}
				}
				Image im=(Image)image;
				g.drawImage(im,0,0,this);	  			
			}	
		};	
		//
		scrollPane.add(panel);
		add(scrollPane);
		close = false;
		
	}
	@Override  
	public ObjectView clone() {   
		objectView = (ObjectView)super.clone();  
		return objectView;  
	}
}
