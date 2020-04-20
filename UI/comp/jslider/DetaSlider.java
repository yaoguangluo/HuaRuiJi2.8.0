package comp.jslider;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JSlider;
public class DetaSlider extends JSlider{
	private static final long serialVersionUID = 1L;
	public DetaSlider(final int x, final int y) {  
		super(x, y); 
		this.setForeground(Color.lightGray);
		this.setBackground(Color.black);
		this.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {
			}
			
			public void mouseMoved(MouseEvent e) {
//				Graphics g = getGraphics();
//				g.setColor(new Color(255,0,255,128));
//				int xPoints[]={8,8+15,8};
//				int yPoints[]={8,8,8+15};
//				g.fillPolygon(xPoints,yPoints,3);
//				int xPoints1[]={x-16-5,x-8,x-8};
//				int yPoints1[]={y-8,y-16-5,y-8};
//				g.fillPolygon(xPoints1,yPoints1,3);
//				g.fillRect(8,8,x-16 ,5);
//				g.fillRect(8,8,5 ,y-16);
//				g.fillRect(8,y-12,x-16 ,5);
//				g.fillRect(x-12,8,5 ,y-16);
			}
		});
	}
}