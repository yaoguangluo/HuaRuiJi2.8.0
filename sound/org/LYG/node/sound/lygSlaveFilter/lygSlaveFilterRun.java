package org.LYG.node.sound.lygSlaveFilter;

import java.io.IOException;
import javax.sound.sampled.UnsupportedAudioFileException;

import movieProcessor.LYGFileIO;

import org.LYG.GUI.OSGI.*;

public class lygSlaveFilterRun extends ObjectRun
{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public lygSlaveFilterRun( ) throws IOException
 	{	
 	}
	@SuppressWarnings("unused")
	public void run(final lygSlaveFilterView thisView) throws IOException, UnsupportedAudioFileException
	{
		   int size[] = new int[toplygin.adataFrame.audioArray.length];
	         int cacucount = 0;
	         toplygin.toHead();
	         lygBss(toplygin);
	         toplygin.toHead();
           thisView.lygout=toplygin;		 
	}
	private void lygBss(LYGFileIO toplygin){
		if(toplygin.adataFrame.audioArray!=null)
		{
			lygBssSet(toplygin);
		}
		while(toplygin.adataFrame.next!=null)
		{
			toplygin.adataFrame=toplygin.adataFrame.next;
			lygBssSet(toplygin);
		}
		// TODO Auto-generated method stub
	}
	private void lygBssSet(LYGFileIO toplygin) {
		// TODO Auto-generated method stub
		double master[]=new double[toplygin.adataFrame.audioArray.length];
		double slave[]=new double[toplygin.adataFrame.audioArray.length];
		double []reg = toplygin.adataFrame.master;
		for(int i = 1;i<reg.length-1;i++)
		{
			//find high
			
			master[i]=reg[i];
			slave[i]=master[i];
			if(reg[i]<reg[i+1]&&reg[i]<reg[i-1])
			{    
    			 i=lygFilter(reg,i,master,slave);
			}                	  
		}  
		toplygin.adataFrame.master=master;
		toplygin.adataFrame.slave=slave;
		toplygin.adataFrame.orge=reg;
		
		//median filter
		/*
		for(int i = 2;i<reg.length-2;i++)
		{
			double temp=0;
			for(int j=-2;j<3;j++)
			{
				temp+=toplygin.adataFrame.master[i+j];	
			}
			toplygin.adataFrame.master[i]=temp/5;
			toplygin.adataFrame.slave[i]=reg[i]-toplygin.adataFrame.master[i];
		}
		*/
		
		
		
		
		
		
		
	}
	private int lygFilter(double[] reg, int i, double[] master, double[] slave) {
		
		 int x[]=new int[4];
	     double y[]=new double[4];
		 x[0]=i;
		 y[0]=reg[i];

		 int j=0;
		 for(j = i;j<reg.length-1;j++)
         {

        	 if(reg[j]>reg[j+1]&&reg[j]>reg[j-1])
        	 {
        	    x[1]=j;
        	    y[1]=reg[j];
        	    for(int k = j;k<reg.length-1;k++)
                {   

               	 	if(reg[k]<reg[k+1]&&reg[k]<reg[k-1])
               	 	{
               	 		    x[2]=k;
               	 		    y[2]=reg[k];

               	 			KERNER(k,reg,x,y,master,slave);
               	 		    return k-1;

               	 	}
        	    
                }
        	 }
         }
		return i;
    }
	private void KERNER(int k, double[] reg, int[] x, double[] y, double[] master, double[] slave) {
		// TODO Auto-generated method stub
	 		for(int l = k;l<reg.length-1;l++)
   	 		{	
   	 			if(reg[l]>reg[l+1]&&reg[l]>reg[l-1])
   	 			{
   	 			  x[3]=l;
   	 			  y[3]=reg[l];
   	 			  int xlyg=(x[0]+x[1])/2;
   	 			  int xlyg1=(x[1]+x[2])/2;
   	 			  double ylyg=(y[0]+y[1])/2;
   	 			  double elyg=(y[2]-y[0])/(x[2]-x[0]);
   	 			  for(int i1=xlyg,j1=0;i1<xlyg1;i1++,j1++)
   	 			  {
   	 				 master[i1]=ylyg+j1*elyg;
   	 				 slave[i1]=reg[i1]-master[i1];
   	 			  }
   	 			  xlyg=(x[1]+x[2])/2;
   	 			  xlyg1=(x[2]+x[3])/2;
   	 			  ylyg=(y[1]+y[2])/2;
   	 			  elyg=(y[3]-y[1])/(x[3]-x[1]);
   	 			  for(int i1=xlyg,j1=0;i1<xlyg1;i1++,j1++)
   	 			  {
   	 				 master[i1]=ylyg+j1*elyg;
   	 				 slave[i1]=reg[i1]-master[i1];
   	 			  } 
   	 			  return;
   	 			}
   	 		}
	}
	
}
