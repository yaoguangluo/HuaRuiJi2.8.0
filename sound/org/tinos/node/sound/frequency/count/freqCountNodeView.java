package org.tinos.node.sound.frequency.count;
import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.ScrollPane;
import javax.swing.JButton;

import org.tinos.gui.osgi.*;
public class freqCountNodeView extends ObjectView
{
	private static final long serialVersionUID = 1L;
	public JButton button;
	public String path;
	public freqCountNodeView()
	{
 	}
	public void view() throws Exception
	{
		scrollPane = new ScrollPane();
		//show graph
		panel=new Panel()
		{
			private static final long serialVersionUID = 1L;

			@SuppressWarnings("unused")
			public void paint(Graphics g) {

		     	  Dimension d = this.getSize();
		          int w = 800;
		          int h = 600;
		         // System.out.println(d.width+"**"+d.height);
		          int INFOPAD = 15;
		          //Graphics g= getGraphics();  
		          Graphics2D g2 = (Graphics2D) g;
		          g2.setBackground(Color.white);
		          g2.clearRect(0, 0, w, h);
		          g2.setColor(Color.white);
		          g2.fillRect(0, h-INFOPAD, w, INFOPAD);
		              if (lygout != null) {
		                  // .. render sampling graph ..
		                  g2.setColor(Color.black);
		                  for (int i = 1; i < lygout.fsize.length; i++) {
		                	 
		                      g2.drawLine(i-1,300-lygout.fsize[i-1]/5, i, 300-lygout.fsize[i]/5);
		                      
		                      if(lygout.fsize[i]>0)
		                      {
		                    	  System.out.println(i+":"+lygout.fsize[i]);
		                      }
		                  }
		              }
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
