package ifft;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class demo
{
	@SuppressWarnings("deprecation")
	public static void main(String [] argv)
	{
		//创造线程录音每5秒录一次
		
		//创造线程显示数值
		//jp jp1=new jp();
		jpm jp1=new jpm();
		jp1.setVisible(true);
		JFrame f = new JFrame("Capture");  
		         f.addWindowListener(new WindowAdapter() {  
		             public void windowClosing(WindowEvent e) {  
		                 System.exit(0);  
		             }  
		         });  
		         f.getContentPane().add("Center", jp1);  
		         f.pack();  
		         Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();  
		         int w = 1500;  
		         int h = 650;  
		         f.setLocation(screenSize.width/2-w/2,screenSize.height/2-h/2);  
		         f.setSize(w, h);  
		         f.show();  

	}
}