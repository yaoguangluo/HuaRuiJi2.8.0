package org.LYG.node.sound.WavRead;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.geom.Line2D;
import java.util.Vector;

import javax.sound.sampled.AudioInputStream;
import javax.swing.JButton;

import org.LYG.GUI.OSGI.*;

import soundProcessor.SoundWaveVector;

public class WavReadNodeView extends ObjectView
{
	private static final long serialVersionUID = 1L;
	public JButton button;
	public String path;
	@SuppressWarnings("rawtypes")
	public Vector lines = new Vector();
	public AudioInputStream cur;
	public int pos;
	public WavReadNodeView()
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
		          int w = 80000;
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
		                  /*
		                  for (int i = 1; i < lines.size(); i++) {
		                	  Line2D v=(Line2D) lines.get(i);
		                      g2.draw((Line2D) lines.get(i));
		                      */
		                  for (int i = 1,j=1; i < lines.size(); i+=100,j++) {
		                	  Line2D v=(Line2D) lines.get(i);
		                      g2.drawLine(j,(int)v.getY1(),j+1,(int)v.getY2());
		
		                      //
		                      
		                      
		                      
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
