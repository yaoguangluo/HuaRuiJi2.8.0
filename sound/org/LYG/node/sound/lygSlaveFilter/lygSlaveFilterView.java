package org.LYG.node.sound.lygSlaveFilter;
import java.awt.Color;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;


import java.awt.Panel;
import java.awt.ScrollPane;


import java.util.Vector;

import javax.swing.JButton;

import org.LYG.GUI.OSGI.*;



import soundProcessor.SoundWaveVector;
public class lygSlaveFilterView extends ObjectView
{
	private static final long serialVersionUID = 1L;
	public JButton button;
	public String path;
	@SuppressWarnings("rawtypes")
	public Vector lines = new Vector();
	public lygSlaveFilterView()
	{
 	}
	public void view() throws Exception
	{
		scrollPane = new ScrollPane();
		//show graph
		SoundWaveVector sv = new SoundWaveVector();
		lines = sv.getVectorLines(lygout);

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
	                
	                  for (int i = 1; i < lygout.adataFrame.master.length; i++) {
	                	  g2.setColor(Color.black);
	                	  g2.drawLine((i-1)*5,300-(int)lygout.adataFrame.orge[i-1]/30, i*5, 300-(int)lygout.adataFrame.orge[i]/30);
	                	  g2.setColor(Color.blue);
	                      g2.drawLine((i-1)*5,300-(int)lygout.adataFrame.master[i-1]/30, i*5, 300-(int)lygout.adataFrame.master[i]/30);
	                      g2.setColor(Color.RED);
	                      g2.drawLine((i-1)*5,300-(int)lygout.adataFrame.slave[i-1]/30, i*5, 300-(int)lygout.adataFrame.slave[i]/30);
	                  
	                  
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
