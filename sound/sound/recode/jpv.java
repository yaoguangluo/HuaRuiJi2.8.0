package sound.recode;

import java.awt.Color;


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;


import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;


import java.util.Vector;





public class jpv extends Panel implements Runnable
{

	public  Vector<Double> lines ;
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public void paint(Graphics g) {

     	  Dimension d = this.getSize();
          int w = 1600;
          int h = 600;
         // System.out.println(d.width+"**"+d.height);
          int INFOPAD = 15;
          //Graphics g= getGraphics();  
          Graphics2D g2 = (Graphics2D) g;
          g2.setBackground(Color.white);
          g2.clearRect(0, 0, w, h);
          g2.setColor(Color.white);
          g2.fillRect(0, h-INFOPAD, w, INFOPAD);
              if (lines != null) {
                  // .. render sampling graph ..
                  g2.setColor(Color.black);
    
                  for (int i = 1,j=1; i < lines.size()-1; i++,j++) {
                	  Line2D v=(Line2D) lines.get(i);
                	  Line2D v1=(Line2D) lines.get(i+1);
                      g2.drawLine(j,(int)v.getY1()+300,j+1,(int)v1.getY2()+300);           
                  }
              }
     }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}
