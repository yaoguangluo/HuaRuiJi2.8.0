package fft;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.tinos.gui.platForm.UnicornJSplitPane;
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
     cp []f;
     cp []p;
     int c=0;
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
	      	   p=new cp[1024];
			   f=new cp[1024];
			   for(int k=0;k<N;k++)
				{
				   f[k]=new cp(); 
				   p[k]=new cp(); 
				   f[k].real=0;
				   f[k].image=0;
				   p[k].real=0;
				   p[k].image=0;
				}
	   ///////////////////////  
			   f[8].real=y0;
			   f[80].real=y1;  
			   f[180].real=y2;
			   f[190].real=y3;
	
			   g2.setColor(Color.blue);
			   for (int i = 0; i<N-1; i++) 
		          {
		              g2.drawLine(i,400,i,(int)(f[i].real/4)+400);           
		          }	 
	///////////////////////////////////////////////////       
		         double cos[][]= new double [N][N] ;
		         double sin[][]= new double [N][N] ; 
			   for(int k=0;k<N;k++)
		  		{
	        	    double v1 = pi*k/N/2;
	        	 	for(int n=0;n<N;n++)
	 	  			{
	        	 	  double v = v1*n;
	         	      cos[k][n]=Math.cos(v);
	         	      sin[k][n]=Math.sin(v);
	 	  			}
		  		} 
			   
			   ////////////////////////////////
			   
			   for(int k=0;k<N;k++)
				{
					for(int n=0;n<N;n++)
					{
						p[k].real+=f[n].real*cos[k][n];
		  				p[k].image+=f[n].image*sin[k][n];
					}
				}		   
	          g2.setColor(Color.red);
	          for (int i = 0; i <N-1; i++) 
	          {
	              g2.drawLine(i,(int)((p[i].real-p[i].image)/4)+200,i+1,(int)((p[i+1].real-p[i+1].image)/4)+200);           
	          }
	     
	          
	          ////////////////////////////////////////////////////////   
	          /*
	          c=0;
	          for(int k=0;k<N;k++)
	  		{
	  			for(int n=0;n<N;n+=1)
	  			{
	  				f[k].real+=p[n].real*cos[k][n];
	  				f[k].image+=p[n].image*sin[k][n];
	  				c++;
	  			}
	  		}
	       */
	       //  /*
	          c=0;
	          cp[]o=new cp[N*2];
	          
	          for (int i = 0; i <N; i++) 
	          {
	        	o[i]=p[i];
	        	o[i+N]=p[i];
	          }
	         f= fft(o);
	        // */
	         System.out.println(c);
	  		   g2.setColor(Color.black);
	  		 for (int i = 0; i <N-1; i++) 
	          {
	              g2.drawLine(i,500,i,(int)(Math.sqrt(f[i].real*f[i].real+f[i].image*f[i].image)/3000)+500);           
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
	public class cp
	{
		public double real;
		public double image;
	}
    public  cp[] fft(cp[] x) {
        int N = x.length;
        if (N == 1) return new cp[] { x[0] };
        if (N % 2 != 0) { throw new RuntimeException("N is not a power of 2"); }
        cp[] even = new cp[N/2];
        for (int k = 0; k < N/2; k++) {	
            even[k] = x[2*k];
        }
        cp[] q = fft(even);
        cp[] odd  = even; 
        for (int k = 0; k < N/2; k++) {
            odd[k] = x[2*k + 1];
        }
        cp[] r = fft(odd);
        cp[] y = new cp[N];
        for (int k = 0; k < N; k++) {
            y[k]=new cp();
        } 
        for (int k = 0; k < N/2; k++) {
            double kth = k * pi / N ;
            cp wk=new cp();
            wk.real=Math.cos(kth);
            wk.image=Math.sin(kth);
            
            cp times=new cp();
            times.real=wk.real*r[k].real-wk.image*r[k].image;
            times.image=wk.real*r[k].image+wk.image*r[k].real;
            
            y[k].real = q[k].real+times.real;
            y[k].image = q[k].image+times.image;
            y[k+N/2].real = q[k].real-times.real;
            y[k+N/2].image = q[k].image-times.image;
            c++;
        }
        return y;
    }
}