package org.LYG.node.sound.logFFTcount;

import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;





import org.LYG.GUI.OSGI.*;
import org.apache.commons.math.complex.Complex;
import org.apache.commons.math.transform.FastFourierTransformer;

public class logFFTcountRun extends ObjectRun
{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public logFFTcountRun( ) throws IOException
 	{	
 	}
	public void run(final logFFTcountView thisView) throws IOException, UnsupportedAudioFileException
	{
	toplygin.toHead();
		
		FastFourierTransformer fft = new FastFourierTransformer();
		double matrix[][]=new double[500][500];
		
		
	    int high=200;
	    int count[]=new int[high];
		
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
				
				    count[(int) toplygin.adataFrame.logfftarray[i][j]]++;
				
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
					 // 17, 30, 33, 39, 42, 45, 54, 84, 87, 89, 92, 120, 122, 128, 130
					
					/*
					if(toplygin.adataFrame.logfftarray[i][j]==17)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					if(toplygin.adataFrame.logfftarray[i][j]==30)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					if(toplygin.adataFrame.logfftarray[i][j]==33)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					if(toplygin.adataFrame.logfftarray[i][j]==39)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					if(toplygin.adataFrame.logfftarray[i][j]==42)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					if(toplygin.adataFrame.logfftarray[i][j]==45)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					*/
					
					if(toplygin.adataFrame.logfftarray[i][j]>=84 && toplygin.adataFrame.logfftarray[i][j]<=92)
					{
						
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					}
					
					/*
					if(toplygin.adataFrame.logfftarray[i][j]==54)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					if(toplygin.adataFrame.logfftarray[i][j]==84)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					if(toplygin.adataFrame.logfftarray[i][j]==87)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					if(toplygin.adataFrame.logfftarray[i][j]==89)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					if(toplygin.adataFrame.logfftarray[i][j]==92)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					/*
					if(toplygin.adataFrame.logfftarray[i][j]==120)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					if(toplygin.adataFrame.logfftarray[i][j]==122)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					if(toplygin.adataFrame.logfftarray[i][j]==128)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					if(toplygin.adataFrame.logfftarray[i][j]==130)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					 */
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
					    count[(int) toplygin.adataFrame.logfftarray[i][j]]++;
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
					
					 // 17, 30, 33, 39, 42, 45, 54, 84, 87, 89, 92, 120, 122, 128, 130
					/*
					if(toplygin.adataFrame.logfftarray[i][j]==17)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					if(toplygin.adataFrame.logfftarray[i][j]==30)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					if(toplygin.adataFrame.logfftarray[i][j]==33)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					if(toplygin.adataFrame.logfftarray[i][j]==39)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					if(toplygin.adataFrame.logfftarray[i][j]==42)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					if(toplygin.adataFrame.logfftarray[i][j]==45)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					*/
					
					if(toplygin.adataFrame.logfftarray[i][j]>=84 && toplygin.adataFrame.logfftarray[i][j]<=92)
					{
						
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					}
					
					/*
					if(toplygin.adataFrame.logfftarray[i][j]==54)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					/*
					if(toplygin.adataFrame.logfftarray[i][j]==84)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					if(toplygin.adataFrame.logfftarray[i][j]==87)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					if(toplygin.adataFrame.logfftarray[i][j]==89)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					if(toplygin.adataFrame.logfftarray[i][j]==92)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					/*
					if(toplygin.adataFrame.logfftarray[i][j]==120)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					if(toplygin.adataFrame.logfftarray[i][j]==122)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					if(toplygin.adataFrame.logfftarray[i][j]==128)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
					if(toplygin.adataFrame.logfftarray[i][j]==130)
						toplygin.adataFrame.fftarray[i*j]=toplygin.adataFrame.audioArray[i*j];
				    */
				}	
			}
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    }
	
	    //find high
	   
	    
	    //0~ high
	    
	    
	    // get count
	    int value=0;
	    for(int i=1;i<199;i++)
	    {
	    	if(count[i]>count[i-1] && count[i]>count[i+1])
	    	{
	    		value++;
	    	}
	    }
	    int  cv[]=new int[value];
	    
	    value=0;
	    for(int i=1;i<199;i++)
	    {
	    	if(count[i]>count[i-1] && count[i]>count[i+1])
	    	{
	    		cv[value++]=i;
	    	}
	    }
	    
		
	   // 17, 30, 33, 39, 42, 45, 54, 84, 87, 89, 92, 120, 122, 128, 130
		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		toplygin.fftmatrix=matrix;
		toplygin.fftLogCount=count;
		
		
		
		thisView.lygout=toplygin;	 
	}
	
}
