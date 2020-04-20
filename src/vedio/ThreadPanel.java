package vedio;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.image.BufferedImage;
import java.util.Map;

public class ThreadPanel extends Panel implements Runnable{
	private static final long serialVersionUID = 1L;
	int widthInt;
	int heightInt;
	int[] control; 
	PlayerControl playerControl;
	Map<Integer, BufferedImage> flipImage;
	BufferedImage flip;
	public ThreadPanel(PlayerControl playerControl, int widthInt, int heightInt
			, Map<Integer, BufferedImage> flipImage, int[] control) {
		this.setBounds(0, 0, widthInt, heightInt);
		this.setVisible(true);
		this.widthInt= widthInt;
		this.heightInt= heightInt;
		this.flipImage= flipImage;
		this.control= control;
		this.playerControl= playerControl;
	}
	public void run(){ 
		//init; 
		control[6]= 0;
		int j= flipImage.size();
		Graphics g= this.getGraphics();
		while(true) {
			if(control[6]< 0|| control[6]>j) {
				control[6]= 0;
			}
			try {
				Thread.sleep(50);
				if(1== control[0]) {//确定播放
					if(1== control[7]) {
						g.drawImage(flipImage.get(control[6]), 0, 0, this);
						control[0]= 0;
						control[7]= 0;
					}
					if(1== control[1]) {//确定倒放
						control[6]--;
						if(control[6]< 0) {//停止条件
							control[0]= 0;
							control[6]= 0;
						}
						if(0< control[3]) {//确定加速放
							Thread.sleep(300/control[3]);
							if(flipImage.containsKey(control[6])) {
								if(null!= playerControl.sliderx) {
									playerControl.sliderx.setValue(control[6]);
								}
								g.drawImage(flipImage.get(control[6]), 0, 0, this);
							}	
						}else if(0< control[4]) {//确定减速速放
							Thread.sleep(300+ 200* control[4]);
							if(flipImage.containsKey(control[6])) {
								if(null!= playerControl.sliderx) {
									playerControl.sliderx.setValue(control[6]);
								}
								g.drawImage(flipImage.get(control[6]), 0, 0, this);
							}	
						} 
					}else if(1== control[2]) {//确定正放
						control[6]++;
						if(control[6]>= j) {//停止条件
							control[0]= 0;
							control[6]= 0;
						}
						if(0< control[3]) {//确定加速放
							Thread.sleep(300/control[3]);
							if(flipImage.containsKey(control[6])) {
								if(null!= playerControl.sliderx) {
									playerControl.sliderx.setValue(control[6]);
								}
								g.drawImage(flipImage.get(control[6]), 0, 0, this);
							}	
						}else if(0< control[4]) {//确定减速速放
							Thread.sleep(300+ 200* control[4]);
							if(flipImage.containsKey(control[6])) {
								if(null!= playerControl.sliderx) {
									playerControl.sliderx.setValue(control[6]);
								}
								g.drawImage(flipImage.get(control[6]), 0, 0, this);
							}	
						} 
					}
				}
			}catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	}

	public void paint(int x, int y) {
		Graphics g= this.getGraphics();
		g.drawLine(x, y, x+1, y+1);
		g.drawLine(x, y+1, x+1, y);
		Graphics gf= flipImage.get(control[6]).getGraphics();
		gf.drawLine(x, y, x+1, y+1);
		gf.drawLine(x, y+1, x+1, y);
	}
}