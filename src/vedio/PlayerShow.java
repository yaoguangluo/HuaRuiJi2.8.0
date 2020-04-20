package vedio;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.Map;
import javax.swing.JFrame;

public class PlayerShow extends Thread implements Runnable, MouseListener, MouseMotionListener{
	int widthInt;
	int heightInt;
	int[] crontol; 
	PlayerControl playerControl;
	Map<Integer, BufferedImage> flipImage;
	ThreadPanel panel;
	public PlayerShow(PlayerControl playerControl, int widthInt, int heightInt
			, Map<Integer, BufferedImage> flipImage, int[] crontol) {
		this.widthInt= widthInt;
		this.heightInt= heightInt;
		this.flipImage= flipImage;
		this.crontol= crontol;
		this.playerControl= playerControl;
	}
	public void run(){ 
		JFrame jframe= new JFrame();
		jframe.setLayout(null);
		jframe.setLocation(200, 200);
		jframe.setSize(widthInt, heightInt);
		jframe.setResizable(true);
		panel= new ThreadPanel(playerControl, widthInt, heightInt, flipImage, crontol);
		panel.setLayout(null);
		jframe.add(panel);
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);
		jframe.addMouseListener(this);
		jframe.setBackground(Color.BLUE);
		jframe.setVisible(true);
		jframe.validate();
		panel.run();
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
	}
	
	@Override
	public void mouseEntered(MouseEvent arg0) {
	}
	
	@Override
	public void mouseExited(MouseEvent arg0) {
	}
	
	@Override
	public void mousePressed(MouseEvent arg0) {
	}
	
	@Override
	public void mouseReleased(MouseEvent arg0) {
	}
	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		int x= arg0.getX();
		int y= arg0.getY();
		panel.paint(x, y);
	}
	
	@Override
	public void mouseMoved(MouseEvent arg0) {
	}
}