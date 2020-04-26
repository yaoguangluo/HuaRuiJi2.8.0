package sample;

import java.awt.Dimension;  
import java.awt.Graphics;  
import java.awt.Graphics2D;  
import java.awt.Image;  
import java.awt.Panel;  
import java.awt.image.BufferedImage;  
import javax.swing.ImageIcon;  
public class Jingmai extends Panel{  
	private static final long serialVersionUID = 1L;
	public ImageIcon png1 = new ImageIcon(getClass().getResource("手厥阴心包经.png"));  
	public ImageIcon png2 = new ImageIcon(getClass().getResource("手少阳三焦经.png"));  
	public ImageIcon png3 = new ImageIcon(getClass().getResource("手少阴心经.png"));  
	public ImageIcon png4 = new ImageIcon(getClass().getResource("手太阳小肠经.png"));  
	public ImageIcon png5 = new ImageIcon(getClass().getResource("手太阴肺经.png"));  
	public ImageIcon png6 = new ImageIcon(getClass().getResource("手阳明大肠经.png"));  
	public ImageIcon png7 = new ImageIcon(getClass().getResource("足厥阴肝经.png"));  
	public ImageIcon png8 = new ImageIcon(getClass().getResource("足少阳胆经.png"));
	public ImageIcon png9 = new ImageIcon(getClass().getResource("足少阴肾经.png"));  
	public ImageIcon png10 = new ImageIcon(getClass().getResource("足太阳膀胱经.png"));  
	public ImageIcon png11 = new ImageIcon(getClass().getResource("足太阴脾经.png"));  
	public ImageIcon png12 = new ImageIcon(getClass().getResource("足阳明胃经.png"));  

	private final Image screenImage = new BufferedImage(800, 600, 2);  

	private final Graphics2D screenGraphic = (Graphics2D) screenImage  
			.getGraphics();  

	private Image backgroundImage;  

	public Jingmai() {  
		loadImage();  
		// 设定焦点在本窗体  
		setFocusable(true);  
		// 设定初始构造时面板大小,这里先采用图片的大小  
		setPreferredSize(new Dimension(800,600));  
		// 绘制背景  
		drawView();  
	}  

	/** 
	 * 载入图像 
	 */  
	private void loadImage() {  
		//获得当前类对应的相对位置image文件夹下的背景图像  
		//将图像实例赋给backgroundImage  
		backgroundImage = png1.getImage();  
	}  

	private void drawView() {  
		screenGraphic.drawImage(backgroundImage, 0, 0, null);  
	}  

	public void paint(Graphics g) {  
		g.drawImage(screenImage, 0, 0, null);  
	}  

}  