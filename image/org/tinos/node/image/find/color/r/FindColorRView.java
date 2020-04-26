package org.tinos.node.image.find.color.r;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.image.BufferedImage;
import javax.swing.JButton;

import org.tinos.gui.osgi.*;

public class FindColorRView extends ObjectView{
	private static final long serialVersionUID = 1L;
	public JButton button;
	public String path;
	public FindColorRView(){
		super();
 	}
	public void view() throws Exception
	{
		scrollPane= new ScrollPane();
		panel= new Panel(){
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			public void paint(Graphics g){
				BufferedImage image= lygout.image;
				for (int i= 0; i < image.getHeight(); ++i) {
					for (int j= 0; j< image.getWidth(); ++j) {    	    	
						int rr= image.getRGB(j, i)>> 16 & 0xFF;//x,y coordinates opposite to array   	
					int bb= 0;
					int gg= 0;
					int pixel= (rr<< 16)| (gg<< 8)| (bb);   	
					image.setRGB(j, i, pixel);
					}
				}
				Image im= (Image)image;
				g.drawImage(im, 0, 0, this);	  			
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
