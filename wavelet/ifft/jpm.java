package ifft;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.LYG.GUI.platForm.UnicornJSplitPane;
public class jpm extends Panel
{
	 private static final long serialVersionUID = 1L;
	 final static double pi = 6.28318530;
	 final static int N = 1024;
	 public double y0 = 0;  
	 public double y1 = 0;  
	 public double y2 = 0;  
	 public double y3 = 0; 
	 Jpl jpl;
     Jpr jpr;
	 public jpm()
	 {
		this.setLayout(null);
		UnicornJSplitPane mainsplitPane;
		mainsplitPane = new UnicornJSplitPane();
		mainsplitPane.setAutoscrolls(true);
		//mainsplitPane.setEnabled(false);//
		mainsplitPane.setBounds(10, 10, 1400, 600);
		mainsplitPane.setVisible(true);
		this.add(mainsplitPane);
		mainsplitPane.setDividerLocation(0.75); 
		jpl=new Jpl();
		jpr=new Jpr();
		mainsplitPane.setLeftComponent(jpl);
		mainsplitPane.setRightComponent(jpr);	
	}
	public class Jpl extends Panel
	{
		private static final long serialVersionUID = 1L;
		@SuppressWarnings("unused")
		public void paint(Graphics g) {
	     	  Dimension d = this.getSize();
	          int w = 1024;
	          int h = 400;
	          //System.out.println(d.width+"**"+d.height);
	          int INFOPAD = 15;
	          //Graphics g = getGraphics();  
	          Graphics2D g2 = (Graphics2D) g;
	          g2.setBackground(Color.white);
	          g2.clearRect(0, 0, w, h);
	          g2.setColor(Color.white);
	          g2.fillRect(0, h-INFOPAD, w, INFOPAD);  
	      	   double []p=new double[1024];
			   double []f=new double[1024];
			   for(int k=0;k<N;k++)
				{
				 f[k]=0;  
				}
	   ///////////////////////  
			   f[2]=y0;
			   f[5]=y1;  
			   f[9]=y2;
			   f[16]=y3;   
			   g2.setColor(Color.blue);
			   for (int i = 0; i <N-1; i++) 
		          {
		              g2.drawLine(i,400,i,(int)(f[i]/4)+400);           
		          }	 
	///////////////////////////////////////////////////                 
			   for(int k=0;k<N;k++)
				{
					double r=0,i=0;
					double v1=pi*k/N;
					for(int n=0;n<N;n++)
					{
						double v=v1*n;
						r=r+f[n]*Math.cos(v);
						i=i+f[n]*Math.sin(v);
					}
					p[k]=r-i;
				}
	          g2.setColor(Color.red);
	          for (int i = 0; i <N-1; i++) 
	          {
	              g2.drawLine(i,(int)(p[i]/6)+200,i+1,(int)(p[i+1]/6)+200);           
	          }
	     /////////////////////////////////////////////            
	          for(int k=0;k<N/2;k++)
	  		{
	  			double r=0,i=0;
	  			double v1 = pi*k/N;
	  			for(int n=0;n<N;n++)
	  			{
	  				double v = v1*n;
	  				r=r+p[n]*Math.cos(v);
	  				i=i+p[n]*Math.sin(v);
	  			}
	  			f[k]=Math.sqrt(r*r+i*i);
	  		} 
	  		   g2.setColor(Color.black);
	  		 for (int i = 0; i <N-1; i++) 
	          {
	              g2.drawLine(i,500,i,(int)(f[i]/3000)+500);           
	          }	 
	     }
	}
	public class Jpr extends Panel
	{
		private static final long serialVersionUID = 1L;
		final static double pi=3.14159265;
		final static int N=128;
		JSlider  s0;
		JSlider  s1;
		JSlider  s2;
		JSlider  s3;
		public Jpr()
		{
			s0 = new JSlider(0 , 360); 
			s0.setSnapToTicks(true);  
			s0.setPaintTicks(true);  
			s0.setMajorTickSpacing(20);  
			s0.setMinorTickSpacing(5);  
			s0.addChangeListener( 
		        		    new ChangeListener()  
		        	        {    
		        	            public void stateChanged(ChangeEvent event)  
		        	            {    
		        	                JSlider source = (JSlider) event.getSource();  
		        	                y0= source.getValue();  
		        	                jpl.repaint(); 
		        	                //jpl.update(getGraphics());       
		        	            }
		        	        });  
			this.add(s0);
			s1 = new JSlider(0 , 360); 
			s1.setSnapToTicks(true);  
			s1.setPaintTicks(true);  
			s1.setMajorTickSpacing(20);  
			s1.setMinorTickSpacing(5);  
			s1.addChangeListener( 
		        		    new ChangeListener()  
		        	        {    
		        	            public void stateChanged(ChangeEvent event)  
		        	            {    
		        	                JSlider source = (JSlider) event.getSource();  
		        	                y1= source.getValue();  
		        	                jpl.repaint();
		        	            }
		        	        });  
			this.add(s1);
			s2 = new JSlider(0 , 360); 
			s2.setSnapToTicks(true);  
			s2.setPaintTicks(true);  
			s2.setMajorTickSpacing(20);  
			s2.setMinorTickSpacing(5);  
			s2.addChangeListener( 
		        		    new ChangeListener()  
		        	        {    
		        	            public void stateChanged(ChangeEvent event)  
		        	            {    
		        	                JSlider source = (JSlider) event.getSource();  
		        	                y2= source.getValue();  
		        	                jpl.repaint();
		        	            }
		        	        });  
			this.add(s2);
			s3 = new JSlider(0 , 360); 
			s3.setSnapToTicks(true);  
			s3.setPaintTicks(true);  
			s3.setMajorTickSpacing(20);  
			s3.setMinorTickSpacing(5);  
			s3.addChangeListener( 
		        		    new ChangeListener()  
		        	        {    
		        	            public void stateChanged(ChangeEvent event)  
		        	            {    
		        	                JSlider source = (JSlider) event.getSource();  
		        	                y3= source.getValue();  
		        	                jpl.repaint();
		        	            }
		        	        });  
			this.add(s3);		
		}
	}
}