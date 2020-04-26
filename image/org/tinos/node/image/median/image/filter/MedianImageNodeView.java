package org.tinos.node.image.median.image.filter;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.ScrollPane;
import javax.swing.JButton;

import org.tinos.gui.osgi.*;
public class MedianImageNodeView extends ObjectView{
	private static final long serialVersionUID = 1L;
	public JButton button;
	public String path;
	public MedianImageNodeView(){
	}
	public void view() throws Exception{
		scrollPane = new ScrollPane();
		panel=new Panel(){
			private static final long serialVersionUID = 1L;
			public void paint(Graphics g){
				Image im=(Image)lygout.image;
				g.drawImage(im,0,0,this);	  					
			}	
		};	
		//
		scrollPane.add(panel);
		add(scrollPane);
		close=false;
		
		
	}
	@Override  
	public ObjectView clone() {   
		objectView = (ObjectView)super.clone();  
		return objectView;  
	}  
}
