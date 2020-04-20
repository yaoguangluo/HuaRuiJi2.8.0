package SP;
import java.awt.Color;


import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;
import java.util.Vector;
public class jpv extends Panel implements Runnable{
	public Vector<Double> lines;
	public Vector<Double> mlines1;
	public Vector<Double> mlines2;
	public Vector<Double> mlines3;
	public Vector<Double> mlines4;
	public Vector<Double> mlines5;
	public Vector<Double> mlines6;
	public Vector<Double> mlines7;
	public Vector<Double> mlines8;
	public Vector<Double> mlines9;
	public Vector<Double> mlines10;
	public Vector<Double> mlines11;
	public Vector<Double> mlines12;
	public Vector<Double> forOutput= new Vector<Double>(); ;
	public String v1; 
	Graphics2D g2;
	Graphics g3;
	private static final long serialVersionUID = 1L;
	public jpv(Graphics graphics) {
		this.g3= graphics;
	}

	public void paint1(Vector<Double> mlines) {
		g2.clearRect(0, 200, 300, 130);
		g3.clearRect(0, 200, 300, 130);
		if (mlines != null) {
			g2.setColor(Color.red); 
			g3.setColor(Color.red); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D v=(Line2D) mlines.get(i);
					g2.drawLine((int)v.getX1()+10, 200, (int)v.getX2()+10, (int)v.getY2()+200);      
					g3.drawLine((int)v.getX1()+10, 200, (int)v.getX2()+10, (int)v.getY2()+200);  
				}
			}
		}
		g2.drawString("傅里叶变换", 0+10,  200+120);
		g3.drawString("傅里叶变换", 0+10,  200+120);
	}

	public void paint2(Vector<Double> mlines) {
		g2.setColor(Color.black); 
		g2.clearRect(0, 300+30, 300, 200);
		if (mlines != null) {
			g2.setColor(Color.blue); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					g2.drawLine((int)v.getX1()+10,350,(int)v.getX2()+10,(int)v.getY2()+350);      
				}
			}
		}
		g2.drawString("锐化熵", 0+10,  350+120);
		g3.clearRect(0, 300+30, 300, 200);
		if (mlines != null) {
			g3.setColor(Color.blue); 
			if(mlines.size()>2) {
				for (int i= 0; i < mlines.size(); i++) {
					Line2D v= (Line2D) mlines.get(i);
					g3.drawLine((int)v.getX1()+10,350,(int)v.getX2()+10,(int)v.getY2()+350);      
				}
			}
		}
		g3.drawString("锐化熵", 0+10,  350+120);
	}

	public void paint3(Vector<Double> mlines) {
		g2.setColor(Color.black); 
		g2.clearRect(0,450+30, 300, 250);
		if (mlines != null) {
			g2.setColor(Color.yellow); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					g2.drawLine((int)v.getX1()+10,500,(int)v.getX2()+10,(int)v.getY2()+500);      
				}
			}
		}
		g2.drawString("高斯过滤", 0+10,  500+120);
		g3.clearRect(0,450+30, 300, 250);
		if (mlines != null) {
			g3.setColor(Color.yellow); 
			if(mlines.size()>2) {
				for(int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					g3.drawLine((int)v.getX1()+10,500,(int)v.getX2()+10,(int)v.getY2()+500);      
				}
			}
		}
		g3.drawString("高斯过滤", 0+10,  500+120);
	}

	public void paint4(Vector<Double> mlines) {
		g2.setColor(Color.black); 
		g2.clearRect(260, 200, 300, 130);
		if (mlines != null) {
			// .. render sampling graph ..
			g2.setColor(Color.orange); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					g2.drawLine((int)v.getX1()+260+10,200,(int)v.getX2()+260+10,(int)v.getY2()+200);        
				}
			}
		}
		g2.drawString("细化", 260+10,  200+120);
		g3.clearRect(260, 200, 300, 130);
		if (mlines != null) {
			// .. render sampling graph ..
			g3.setColor(Color.orange); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					g3.drawLine((int)v.getX1()+260+10,200,(int)v.getX2()+260+10,(int)v.getY2()+200);        
				}
			}
		}
		g3.drawString("细化", 260+10,  200+120);
	}

	public void paint5(Vector<Double> mlines) {
		g2.setColor(Color.black); 
		g2.clearRect(260,300+30, 300, 200); 
		if (mlines != null) {
			g2.setColor(Color.red); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					g2.drawLine((int)v.getX1()+260+10,350,(int)v.getX2()+260+10,(int)v.getY2()+350);          
				}
			}
		}
		g2.drawString("裁剪", 260+10,  350+120);
		g3.clearRect(260,300+30, 300, 200); 
		if (mlines != null) {
			g3.setColor(Color.red); 
			if(mlines.size()>2) {
				for(int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					g3.drawLine((int)v.getX1()+260+10,350,(int)v.getX2()+260+10,(int)v.getY2()+350);          
				}
			}
		}
		g3.drawString("裁剪", 260+10,  350+120);
	}

	public void paint6(Vector<Double> mlines) {
		g2.setColor(Color.black); 
		g2.clearRect(260, 450+30, 300, 250);
		if (mlines!= null) {
			g2.setColor(Color.BLUE); 
			if(mlines.size()> 2) {
				for (int i= 0; i< mlines.size(); i++) {
					Line2D v= (Line2D) mlines.get(i);
					g2.drawLine((int)v.getX1()+ 260+ 10, 500, (int)v.getX2()+ 260+ 10, (int)v.getY2()+ 500);        
				}
			}
		}
		g2.drawString("平移", 260+10,  500+120);
		g3.clearRect(260, 450+30, 300, 250);
		if (mlines!= null) {
			g3.setColor(Color.BLUE); 
			if(mlines.size()> 2) {
				for (int i= 0; i< mlines.size(); i++) {
					Line2D v= (Line2D) mlines.get(i);
					g3.drawLine((int)v.getX1()+ 260+ 10, 500, (int)v.getX2()+ 260+ 10, (int)v.getY2()+ 500);        
				}
			}
		}
		g3.drawString("平移", 260+10,  500+120);
	}

	public void paint7(Vector<Double> mlines) {
		g2.setColor(Color.black); 
		g2.clearRect(520, 200, 500, 100+30);
		if (mlines != null) {
			g2.setColor(Color.BLUE); 
			if(mlines.size()>2) {
				for(int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					g2.drawLine((int)v.getX1()+520+10,200,(int)v.getX2()+520+10,(int)v.getY2()+200);        
				}
			}
		}
		g2.drawString("高阶傅里叶", 520+10,  200+120);
		g3.clearRect(520, 200, 500, 100+30);
		if (mlines != null) {
			g3.setColor(Color.BLUE); 
			if(mlines.size()>2) {
				for(int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					g3.drawLine((int)v.getX1()+520+10,200,(int)v.getX2()+520+10,(int)v.getY2()+200);        
				}
			}
		}
		g3.drawString("高阶傅里叶", 520+10,  200+120);
	}

	public void paint8(Vector<Double> mlines) {
		g2.setColor(Color.black); 
		g2.clearRect(520,300+30, 500, 200); 
		if (mlines != null) {
			g2.setColor(Color.cyan); 
			if(mlines.size()>2) {
				for(int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					g2.drawLine((int)v.getX1()+520+10,350,(int)v.getX2()+520+10,(int)v.getY2()+350);        
				}
			}
		}
		g2.drawString("截取拉伸", 520+10,  350+120);
		g3.clearRect(520,300+30, 500, 200); 
		if (mlines != null) {
			g3.setColor(Color.cyan); 
			if(mlines.size()>2) {
				for(int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					g3.drawLine((int)v.getX1()+520+10,350,(int)v.getX2()+520+10,(int)v.getY2()+350);        
				}
			}
		}
		g3.drawString("截取拉伸", 520+10,  350+120);
	}

	public void paint9(Vector<Double> mlines) {
		g2.setColor(Color.black); 
		g2.clearRect(520,450+30, 500, 250+30);
		if (mlines != null) {
			g2.setColor(Color.red); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					g2.drawLine((int)v.getX1()+520+10,500,(int)v.getX2()+520+10,(int)v.getY2()+500);         
				}
			}
		}
		g2.drawString("细化", 520+10,  500+120);
		g3.clearRect(520,450+30, 500, 250+30);
		if (mlines != null) {
			g3.setColor(Color.red); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					g3.drawLine((int)v.getX1()+520+10,500,(int)v.getX2()+520+10,(int)v.getY2()+500);         
				}
			}
		}
		g3.drawString("细化", 520+10,  500+120);
	}

	public void paint10(Vector<Double> mlines) {
		g2.setColor(Color.black); 
		g2.clearRect(780, 200, 500, 100+30);
		if (mlines != null) {
			g2.setColor(Color.BLUE); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					g2.drawLine((int)v.getX1()+780+10,200,(int)v.getX2()+780+10,(int)v.getY2()+200);        
				}
			}
		}
		g2.drawString("量化裁剪", 780+10,  200+120);
		g3.clearRect(780, 200, 500, 100+30);
		if (mlines != null) {
			g3.setColor(Color.BLUE); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					g3.drawLine((int)v.getX1()+780+10,200,(int)v.getX2()+780+10,(int)v.getY2()+200);        
				}
			}
		}
		g3.drawString("量化裁剪", 780+10,  200+120);
	}

	public void paint11(Vector<Double> mlines) {
		g2.setColor(Color.black); 
		g2.clearRect(780,300+30, 500, 400); 
		if (mlines != null) {
			// .. render sampling graph ..
			g2.setColor(Color.white); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					g2.drawLine((int)v.getX1()+780+10,350,(int)v.getX2()+780+10,(int)v.getY2()+350);       
				}
			}
		}
		g2.drawString("输出", 780+10,  350+120);
		g3.clearRect(780,300+30, 500, 400); 
		if (mlines != null) {
			// .. render sampling graph ..
			g3.setColor(Color.white); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					g3.drawLine((int)v.getX1()+780+10,350,(int)v.getX2()+780+10,(int)v.getY2()+350);       
				}
			}
		}
		g3.drawString("输出", 780+10,  350+120);
		g2.drawString("噪音报警类别:", 780+10,  350+220);
		g3.drawString("噪音报警类别:", 780+10,  350+220);
	}

	public void paint12(Vector<Double> mlines) {
		g2.setColor(Color.black); 
		g2.clearRect(780, 450, 500, 250);
		if (mlines != null) {
			g2.setColor(Color.red); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					g2.drawLine((int)v.getX1()+780+10,500,(int)v.getX2()+780+10,(int)v.getY2()+500);          
				}
			}
		}
		g2.drawString("12", 780+10, 500+50);
		g3.clearRect(780, 450, 500, 250);
		if (mlines != null) {
			g3.setColor(Color.red); 
			if(mlines.size()>2) {
				for (int i = 0; i < mlines.size(); i++) {
					Line2D  v=(Line2D) mlines.get(i);
					g3.drawLine((int)v.getX1()+780+10,500,(int)v.getX2()+780+10,(int)v.getY2()+500);          
				}
			}
		}
	}

	public void paintvalue(String v1) {
		g2.setColor(Color.black); 
		g2.clearRect(0,600, 1600, 350);
		g2.setFont(new Font("宋体",Font.BOLD+Font.ITALIC,20));
		if(v1!=null)
			g2.drawString("你说的是"+v1, 10, 780);
	}

	public void paint(Graphics g, Vector<Double> lines, Vector<Double> forOutput) {
		int w= 1400;
		int h= 980;
		int INFOPAD= 15;
		g2= (Graphics2D) g;
		g2.setBackground(Color.black);
		g2.clearRect(0, 40, w, 200);
		g2.setColor(Color.black);
		g2.fillRect(0, h-INFOPAD, w, INFOPAD);
		if (lines != null) {
			// .. recode data .. 
			forOutput.clear(); 	
			g2.setColor(Color.pink);
			for (int i= 1,j= 1; i< lines.size()- 1; i++, j++) {
				Line2D v= (Line2D) lines.get(i);
				Line2D v1= (Line2D) lines.get(i+ 1);
				forOutput.add(lines.get(i+ 1));
				int x= (int)v.getY1()+ 120;
				int y= (int)v1.getY2()+ 120;
				if(x<42) {
					x=42;
				}
				if(x>185) {
					x=185;
				}
				if(y<42) {
					y=42;
				}
				if(y>185) {
					y=185;
				}
				g2.drawLine(j+ 10, x, j+ 1+ 10,y);  
	
			}
		}
		g2.drawString("时序波", 0+10,  120+50);
		g3.clearRect(0, 40, w, 200);
		g3.setColor(Color.white);
		g3.fillRect(0, h-INFOPAD, w, INFOPAD);
		if (lines != null) {
			// .. recode data .. 
			forOutput.clear(); 	
			g3.setColor(Color.pink);
			for (int i= 1,j= 1; i< lines.size()- 1; i++, j++) {
				Line2D v= (Line2D) lines.get(i);
				Line2D v1= (Line2D) lines.get(i+ 1);
				forOutput.add(lines.get(i+ 1));
				int x= (int)v.getY1()+ 120;
				int y= (int)v1.getY2()+ 120;
				if(x<42) {
					x=42;
				}
				if(x>200) {
					x=190;
				}
				if(y<42) {
					y=42;
				}
				if(y>200) {
					y=190;
				}
				g3.drawLine(j+ 10, x, j+ 1+ 10,y);  
			}
		}
		g3.drawString("时序波", 0+10,  120+50);
		
	}

	@Override
	public void run() {
	}
}
