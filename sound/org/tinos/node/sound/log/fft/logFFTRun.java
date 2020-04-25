package org.tinos.node.sound.log.fft;

import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;

import org.apache.commons.math.complex.Complex;
import org.apache.commons.math.transform.FastFourierTransformer;
import org.tinos.gui.osgi.*;

public class logFFTRun extends ObjectRun
{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public logFFTRun( ) throws IOException
 	{	
 	}
	public void run(final logFFTView thisView) throws IOException, UnsupportedAudioFileException
	{
	toplygin.toHead();
		
		FastFourierTransformer fft = new FastFourierTransformer();
		double matrix[][]=new double[500][500];
		
		
		
		int section= toplygin.adataFrame.audioArray.length/1024;
		toplygin.adataFrame.fftarray=new double[toplygin.adataFrame.audioArray.length];
		toplygin.adataFrame.fftlooparray=new double[toplygin.adataFrame.fftarray.length];

		
		
		if(toplygin.adataFrame.audioArray.length%1024 > 0)
		{
			section += 1;
		}

		toplygin.adataFrame.audiofft = new Complex[section][1024];
		
		toplygin.adataFrame.logfftarray=new int[section][1024];
		
		
		double[][] fftp = new double[section][1024];
		for(int i = 0;i < section;i++)
		{
			for(int j=0;j<1024;j++)
			{
				if(j+i*1024 >= toplygin.adataFrame.audioArray.length )
				{
					fftp[i][j]=0;
				}
				else
				{
					fftp[i][j] = toplygin.adataFrame.audioArray[j+i*1024];	
				}
			}
			toplygin.adataFrame.audiofft[i] = fft.transform(fftp[i]);
			for(int j=0;j<1024;j++)
			{
				    double p1=toplygin.adataFrame.audiofft[i][j].abs();
				
				    toplygin.adataFrame.logfftarray[i][j]=(int) (10*Math.log10(p1*p1+1));
				
				
				
					int ho=(int) (toplygin.adataFrame.audiofft[i][j].getReal());
					int wo=(int) (toplygin.adataFrame.audiofft[i][j].getImaginary());
					
					int h=ho/5000;
					int w=wo/5000;
					
					
					if(h>249 ||h<-250)
					{
						h=0;
					}
					if(w>249 ||w<-250)
					{
						w=0;
					}
					h=250+h;
					w=250+w;
					
					matrix[h][w]+=10;
					
					if(Math.abs(ho)<=21000||  Math.abs(wo)<=21000)
					{
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					}
					toplygin.adataFrame.fftlooparray[i]=toplygin.adataFrame.fftarray[i];
			}
			
		}
		
	    while(toplygin.adataFrame.next!=null)
	    {
	    	toplygin.adataFrame=toplygin.adataFrame.next;
	     	
	    	section= toplygin.adataFrame.audioArray.length/1024;
	    	toplygin.adataFrame.fftarray=new double[toplygin.adataFrame.audioArray.length];
	    	toplygin.adataFrame.fftlooparray=new double[toplygin.adataFrame.fftarray.length];
			
	    	
	    	
			if(toplygin.adataFrame.audioArray.length%1024 > 0)
			{
				section += 1;
			}
			

			
			toplygin.adataFrame.audiofft = new Complex[section][1024];
			fftp = new double[section][1024];
			
			toplygin.adataFrame.logfftarray=new int[section][1024];
			
			for(int i = 0;i < section;i++)
			{
				for(int j=0;j<1024;j++)
				{
					if(j+i*1024 >= toplygin.adataFrame.audioArray.length )
					{
						fftp[i][j]=0;
					}
					else
					{
						fftp[i][j] = toplygin.adataFrame.audioArray[j+i*1024];	
					}
				}
				toplygin.adataFrame.audiofft[i] = fft.transform(fftp[i]);
				for(int j=0;j<1024;j++)
				{
					 double p1=toplygin.adataFrame.audiofft[i][j].abs();
						
					    toplygin.adataFrame.logfftarray[i][j]=(int) (10*Math.log10(p1*p1+1));
					
					int ho=(int) (toplygin.adataFrame.audiofft[i][j].getReal());
					int wo=(int) (toplygin.adataFrame.audiofft[i][j].getImaginary());
					
					int h=ho/5000;
					int w=wo/5000;
					
					
					
					if(h>249 ||h<-250)
					{
						h=0;
					}
					if(w>249 ||w<-250)
					{
						w=0;
					}
					h=250+h;
					w=250+w;
					
					matrix[h][w]+=10;
					
					if(Math.abs(ho)<=21000||  Math.abs(wo)<=21000)
					{
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					}
					toplygin.adataFrame.fftlooparray[i]=toplygin.adataFrame.fftarray[i];
				}	
			}
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    }
		
	    
	    
	    
	    
		
		
		
		
		toplygin.fftmatrix=matrix;
		
		
		
		
		thisView.lygout=toplygin;	 
	}
	
}
