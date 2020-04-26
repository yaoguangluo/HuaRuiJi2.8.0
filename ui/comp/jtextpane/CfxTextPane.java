package comp.jtextpane;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.BorderFactory;
import javax.swing.JTextPane;
public class CfxTextPane extends JTextPane {
	private static final long serialVersionUID = 1L;
	private int x,y=0;
	public CfxTextPane(String string, final int x, final int y, java.awt.Color c) {  
		super(); 
		this.x=x;
		this.y=y; 
		this.setBorder(BorderFactory.createRaisedBevelBorder()); 
		this.setPreferredSize(new Dimension(this.x+1, this.y+1));
		this.setOpaque(true);
		this.setBackground(c);
		this.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {
			}
			public void mouseMoved(MouseEvent e) {
			}
		});
	}
}