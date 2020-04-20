package dft;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
public class jp2 extends Panel implements Runnable
{

	private static final long serialVersionUID = 1L;
	final static double pi=3.14159265;
	final static int N=128;
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
           
      	   double []p=new double[128];
		   double []f=new double[128];
		for(int n=0;n<128;n++)
		{
			p[n]=Math.sin(2*pi*n/128);
			System.out.println(":"+p[n]);
		}
		
		   g2.setColor(Color.RED);	   
           for (int i = 0; i < (128-1); i++) 
           {

               g2.drawLine(i,(int)(p[i]*100)+100,i+1,(int)(p[i+1]*100)+100);           
           }
		
   ///////////////////////    
   		
		for(int k=0;k<N;k++)
		{
			double r=0,i=0;
			for(int n=0;n<N;n++)
			{
				r=r+p[n]*Math.cos(2*pi*k*n/N);
				i=i+p[n]*Math.sin(2*pi*k*n/N);
			}
		//	System.out.println(":"+r+":"+i);
			f[k]=Math.sqrt(r*r+i*i)*2;
			System.out.println("::"+f[k]);
		} 
		   g2.setColor(Color.blue);
		   f[10]=100; 
		   f[20]=100;
           for (int i = 200; i < (200+128-1); i++) 
           {
               g2.drawLine(i,(int)(f[i-200]*1)+100,i+1,(int)(f[i-200+1]*1)+100);           
           }
           
///////////////////////////////////////////////////        
               
		for(int k=0;k<N;k++)
		{
			double r=0,i=0;
			for(int n=0;n<N;n++)
			{
				r=r+f[n]*Math.cos(2*pi*k*(n)/N);
				i=i+f[n]*Math.sin(2*pi*k*(n)/N);
			}
			p[k]=(r-i)/6;
			System.out.println(":::"+p[k]);
		}     
          g2.setColor(Color.black);
    
          for (int i = 400; i < (400+128-1); i++) 
          {
              g2.drawLine(i,(int)(p[i-400]*1)+100,i+1,(int)(p[i-400+1]*1)+100);           
          }
              
     /////////////////////////////////////////////            
      	for(int k=0;k<N;k++)
		{
			double r=0,i=0;
			for(int n=0;n<N;n++)
			{
				r=r+p[n]*Math.cos(2*pi*k*n/N);
				i=i+p[n]*Math.sin(2*pi*k*n/N);
			}
			f[k]=Math.sqrt(r*r+i*i)/10;
			System.out.println("::"+f[k]);
		} 
		   g2.setColor(Color.green);
		   
           for (int i = 600; i < (600+128-1); i++) 
           {

               g2.drawLine(i,(int)(f[i-600]*1)+100,i+1,(int)(f[i-600+1]*1)+100);           
           }
          
         ////////////////////////////////////////
           
           
   		for(int k=0;k<N;k++)
   		{
   			double r=0,i=0;
   			for(int n=0;n<N;n++)
   			{
   				r=r+f[n]*Math.cos(2*pi*k*(n)/N);
   				i=i+f[n]*Math.sin(2*pi*k*(n)/N);
   			}
   			p[k]=(r-i)/10;
   			System.out.println(":::"+p[k]);
   		}     
             g2.setColor(Color.black);
       
             for (int i = 800; i < (800+128-1); i++) 
             {
                 g2.drawLine(i,(int)(p[i-800]*1)+100,i+1,(int)(p[i-800+1]*1)+100);           
             }
          
          
          
          
          
          
          
          
          
          
     }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}