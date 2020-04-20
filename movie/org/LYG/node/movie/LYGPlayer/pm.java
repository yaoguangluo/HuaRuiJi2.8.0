package org.LYG.node.movie.LYGPlayer;




import java.awt.Graphics;
import java.awt.Image;


import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import javax.swing.JPanel;
import movieProcessor.LYGFileIO;
//import com.sun.image.codec.jpeg.JPEGCodec;
//import com.sun.image.codec.jpeg.JPEGImageDecoder;

public class pm extends JPanel implements Runnable
{
	private static final long serialVersionUID = 1L;
	public Image img;
    public static File f;
    public RandomAccessFile raf;
    public LYGFileIO io;
    public BufferReader read;
	public pm(RandomAccessFile raf1, LYGFileIO io1, BufferReader read1) {
		raf=raf1;
		io=io1;
		read=read1;
		// TODO Auto-generated constructor stub
	}
	public void paint(Image img2)
	{
		Graphics g= this.getGraphics();
		g.drawImage(img2,0,0,this);
	}
	@SuppressWarnings("unused")
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		try {
			int reg=1;
			byte[] fsize = new byte[4];
			io.header.SMovCurrentPos = io.header.MovPos;
			read.asyBufferReader(raf, io,fsize, 0);
			int len = ((int)fsize[3]<<24&0xff000000)|((int)fsize[2]<<16&0x00ff0000)|((int)fsize[1]<<8&0x0000ff00)|((int)fsize[0]&0x000000ff);
			byte[] jpeg = new byte[len];
			read.asyBufferReader(raf, io, jpeg, 0);
			InputStream is = new ByteArrayInputStream(jpeg);
		//	JPEGImageDecoder jid=JPEGCodec.createJPEGDecoder(is);
		//	BufferedImage bi=jid.decodeAsBufferedImage();	
			Thread.sleep(30);
			//this.paint((Image)bi);
			while(reg++<io.header.MFrameLeangth-1)
			{
				System.out.println(reg+1);
				read.asyBufferReader(raf, io,fsize, 0);
				len = ((int)fsize[3]<<24&0xff000000)|((int)fsize[2]<<16&0x00ff0000)|((int)fsize[1]<<8&0x0000ff00)|((int)fsize[0]&0x000000ff);
				int use=0;
				if(len>0)
				{
					jpeg = new byte[len];
					read.asyBufferReader(raf, io, jpeg, 0);
					is = new ByteArrayInputStream(jpeg);
			//		jid=JPEGCodec.createJPEGDecoder(is);
			//		bi=jid.decodeAsBufferedImage();
					
					//gray delete
					int sca=112;//100-155 delet
					//int sca=110;//115-140 delet
					int bl=32;
					int wh=223;
					
				//    int[][]r=new ReadWritePng().REDpngRead(bi);
				//    int[][]g=new ReadWritePng().GRNpngRead(bi);
				//    int[][]b=new ReadWritePng().BLUpngRead(bi);
				//	for(int j=0;j<bi.getHeight();j++)
					{
				//		for(int i=0;i<bi.getWidth();i++)
						{
							/*
                            if(r[j][i]>sca&&r[j][i]<255-sca)
                            {
                            	if(g[j][i]>sca&&r[j][i]<255-sca)
                            	{
                            		if(b[j][i]>sca&&r[j][i]<255-sca)
                            		{
                            			int cr=128;
                            			int cg=128;
                            			int cb=128;
                            			int pixel = (cr << 16) | (cg << 8) | (cb);
                    	    			bi.setRGB(i, j, pixel);
                    	    			use++;
                            		}
                            	}
                            }
                            */
                           //low frequency delete
                         //   	 if(g[j][i]>r[j][i]-20&&g[j][i]<r[j][i]+20)
                            	 {
                       //     		 if(b[j][i]>g[j][i]-20&&b[j][i]<g[j][i]+20)
                            		 {                  			 
                            //			int cr =(g[j][i]/8)*8;
                        //    			int cg = cr;
                         //   			int cb = cr;

                             //			int pixel = (cr << 16) | (cg << 8) | (cb);
                     	    	//		bi.setRGB(i, j, pixel);
                     	    			use++;
                            		 }
                            	 }
                            
                            
                            
						}
					}
					
					
					
					//bi = new Strech().Processor(bi,0.1,0.9); 
					//media filter
					//bi = new Median().Processor(bi,0.1,0.9); 
	   	      		//guassian filter
					//bi = new Guassian().Processor(bi,5,5,1.6);
					Thread.sleep(30);
				//	this.paint((Image)bi);
				}else
					{
						Thread.sleep(30);
				//		this.paint((Image)bi);
	
					}
				
				System.out.println("use-->"+use);
			}
			System.out.println(io.header.SMovCurrentPos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}