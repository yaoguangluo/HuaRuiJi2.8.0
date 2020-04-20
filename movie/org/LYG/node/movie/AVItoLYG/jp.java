package org.LYG.node.movie.AVItoLYG;





import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.nio.channels.FileChannel;
import javax.media.Buffer;
import javax.media.CannotRealizeException;
import javax.media.Manager;
import javax.media.NoDataSourceException;
import javax.media.NoPlayerException;
import javax.media.NoProcessorException;
import javax.media.Player;
import javax.media.Processor;
import javax.media.control.FrameGrabbingControl;
import javax.media.control.FramePositioningControl;
import javax.media.format.VideoFormat;
import javax.media.protocol.ContentDescriptor;
import javax.media.protocol.DataSource;
import javax.media.protocol.PushBufferDataSource;
import javax.media.protocol.PushBufferStream;
import javax.media.util.BufferToImage;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JPanel;

import soundProcessor.SoundWaveVector;

//import com.sun.image.codec.jpeg.JPEGCodec;
//import com.sun.image.codec.jpeg.JPEGEncodeParam;
//import com.sun.image.codec.jpeg.JPEGImageEncoder;
import com.sun.media.format.AviVideoFormat;
import com.sun.media.format.WavAudioFormat;

import movieProcessor.AdataFrame;
import movieProcessor.Header;
import movieProcessor.LYGFileIO;

@SuppressWarnings("serial")
public class jp extends JPanel implements Runnable
{
	LYGFileIO cur;
	Thread t1;
    public Image img;
    public DataSource d;
    public File f;
    public AviVideoFormat fmv;
    public WavAudioFormat fav;
    public String fpath;
    public String Wpath;
    public String Apath;
	public jp (String filepath, String filepathWAV, String writefile, LYGFileIO toplygin)
	{
		cur   = toplygin;
		fpath = filepath;
		Wpath = writefile;
		Apath = filepathWAV;
		JButton j = new JButton("processor");
		j.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				  t1 = new Thread(jp.this);
				  t1.setPriority(Thread.MIN_PRIORITY);
				  t1.start();	  
			}
		});
		j.setSize(100,30);
		
		JButton j1=new JButton("close");
		j1.addActionListener(new ActionListener() 
		{
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) 
			{
				  t1.stop();
				  t1=null;
			}
		});
		j1.setSize(100,30);
		this.add(j);	
		this.add(j1);
	} 
	
	@SuppressWarnings({ "deprecation", "static-access", "unused" })
	public void run()
	{
		//av
		LYGFileIO IO = new LYGFileIO();
		IO.reset();
		//IO.creat();
		IO.header=new Header();
		IO.adataFrame=new AdataFrame();
		//IO.WAVRead("C:\\Users\\yaoguang\\Desktop\\study\\sound\\AHag.wav");
		//File F=new File("C:\\Users\\yaoguang\\Desktop\\study\\sound\\AHag.wav");
		File F=new File(Apath);
		System.out.println(F.length());
		AudioInputStream ais = null;
		try {
			ais = AudioSystem.getAudioInputStream(F);
		} catch (UnsupportedAudioFileException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//get header
		IO.header.SBigEndian=ais.getFormat().isBigEndian();
		IO.header.SChannels=ais.getFormat().getChannels();
		IO.header.SEn=ais.getFormat().getEncoding();
		IO.header.SFrameRate=ais.getFormat().getFrameRate();
		IO.header.SFrameSize=ais.getFormat().getFrameSize();
		IO.header.SSampleRate=ais.getFormat().getSampleRate();
		IO.header.SSampleSizeInBits=ais.getFormat().getSampleSizeInBits();
		IO.header.SFrameLeangth=ais.getFrameLength();
		//mv
		f = new File(fpath);
		try {
			d = Manager.createDataSource(f.toURL());
		} catch (NoDataSourceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//get format
		
		Processor pr = null;
		try {
			pr = Manager.createProcessor(d);
		} catch (NoProcessorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pr.configure();
		while(pr.getState()<pr.Configured){}
		pr.setContentDescriptor(new ContentDescriptor(ContentDescriptor.RAW));
		pr.realize();
		while(pr.getState()<pr.Realized){}
		DataSource nd=pr.getDataOutput();
		PushBufferStream[] b=((PushBufferDataSource) nd).getStreams();
		PushBufferStream mv=b[0];
		PushBufferStream av=b[1];
			
		fmv=(AviVideoFormat) mv.getFormat();
		fav=(WavAudioFormat) av.getFormat();
		
		//M
		
		try {
			d = Manager.createDataSource(f.toURL());
		} catch (NoDataSourceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Player p = null;
		try {
			p = Manager.createRealizedPlayer(d);
		} catch (NoPlayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CannotRealizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        double times=p.getDuration().getSeconds();
        FramePositioningControl fpc=(FramePositioningControl) p.getControl("javax.media.control.FramePositioningControl");  
        FrameGrabbingControl fgc=(FrameGrabbingControl) p.getControl("javax.media.control.FrameGrabbingControl");
        Buffer bmv=new Buffer();
        int i=1;
        int endtimes=(int)(fmv.getFrameRate()*times);
        cur.header=new Header();
        cur.header.MFrameLeangth = endtimes;
        cur.header.MHFrame = fmv.getSize().height;
        cur.header.MWFrame = fmv.getSize().width;
        cur.header.MFrameRate = (int) fmv.getFrameRate();
        //WRITE HEAD
        try {
        	FileOutputStream wr=new FileOutputStream(Wpath);
            /* 
        	int v=Float.floatToIntBits(floatv);
        	byte[] fv=new byte[4];
        	  fv[0]=(byte)(v&0xff);
        	  fv[1]=(byte)(v>>8&0xff);
        	  fv[2]=(byte)(v>>16&0xff);
        	  fv[3]=(byte)(v>>24&0xff);
        	*/
        	/*
        	int v;
        	byte[] iv=new byte[4]
        	fv[0]=(byte)(v&0xff);
      	  	fv[1]=(byte)(v>>8&0xff);
      	  	fv[2]=(byte)(v>>16&0xff);
      	  	fv[3]=(byte)(v>>24&0xff);
        	*/
        	/*
        	byte[] bv=new byte[1];
        	  bv[0]=(byte)(0);//false
        	  bv[0]=(byte)(1);//true
        	*/
        	/*
        	byte[] lv=new byte[8];
        	 lv[0]=(byte)(v&0xff);
      	  	 lv[1]=(byte)(v>>8&0xff);
      	     lv[2]=(byte)(v>>16&0xff);
      	     lv[3]=(byte)(v>>24&0xff);
        	 lv[4]=(byte)(v>>32&0xff);
        	 lv[5]=(byte)(v>>40&0xff);
        	 lv[6]=(byte)(v>>48&0xff);
        	 lv[7]=(byte)(v>>56&0xff);
        	*/
        	/*
        	   String s=new String("dsad");  
        	   byte[] size=new byte[1];
        	   size[0]=(byte)s.length();                  	
        	   char []c=s.toCharArray();
        	   for(int reg=0;reg<s.length();reg++)
        	   {
        		   c[reg]=s.charAt(reg);
        	   }
        	   byte[] sv=new byte[c.length*2];
        	   for(int reg=0;reg<c.length;reg++)
        	   {
        		   sv[2*reg]=(byte)((c[reg]&0xff00)>>8);
        	       sv[2*reg+1]=(byte)(c[reg]&0x00ff);
        	   }
        	*/
//1 
        	long headpos=0;
        	int v=cur.header.MWFrame;
        	byte[] iv=new byte[4];
        	iv[0]=(byte)(v&0xff);
      	  	iv[1]=(byte)(v>>8&0xff);
      	  	iv[2]=(byte)(v>>16&0xff);
      	  	iv[3]=(byte)(v>>24&0xff);
        	wr.write(iv);
	  		System.out.println("<MWR>\n"+cur.header.MWFrame+"\n</MWR>\n");
   //2     	
	  		headpos+=4;
	  		v=cur.header.MHFrame;
        	iv=new byte[4];
        	iv[0]=(byte)(v&0xff);
      	  	iv[1]=(byte)(v>>8&0xff);
      	  	iv[2]=(byte)(v>>16&0xff);
      	  	iv[3]=(byte)(v>>24&0xff);
        	wr.write(iv);
	  		System.out.println("<MHR>\n"+cur.header.MHFrame+"\n</MHR>\n");
	  //3		
	  		headpos+=4;
	  		v=cur.header.MFrameLeangth;
        	iv=new byte[4];
        	iv[0]=(byte)(v&0xff);
      	  	iv[1]=(byte)(v>>8&0xff);
      	  	iv[2]=(byte)(v>>16&0xff);
      	  	iv[3]=(byte)(v>>24&0xff);
        	wr.write(iv);
	  		System.out.println("<MFL>\n"+cur.header.MFrameLeangth+"\n</MFL>\n");
	  	//4	
	  		headpos+=4;
	  		v=cur.header.MFrameRate;
        	iv=new byte[4];
        	iv[0]=(byte)(v&0xff);
      	  	iv[1]=(byte)(v>>8&0xff);
      	  	iv[2]=(byte)(v>>16&0xff);
      	  	iv[3]=(byte)(v>>24&0xff);
        	wr.write(iv);
	  		System.out.println("<MFR>\n"+cur.header.MFrameRate+"\n</MFR>\n");
	    //5
	  		headpos+=4;
	  	  	byte[] size=new byte[1];
	  	if(IO.header.SEn!=null)
	  	{
	  		
	  		String s=IO.header.SEn.toString();  
	  	  	size[0]=(byte)s.length();                  	
	  	  	char []c=s.toCharArray();
	  	  	for(int reg=0;reg<s.length();reg++)
	  	  	{
	  	  		c[reg]=s.charAt(reg);
	  	  	}
	  	  	byte[] sv = new byte[c.length*2];
	  	  	for(int reg = 0;reg<c.length;reg++)
	  	  	{
	  	  		sv[2*reg]=(byte)((c[reg]&0xff00)>>8);
	  	  		sv[2*reg+1]=(byte)(c[reg]&0x00ff);
	  	  	}
	  	  	wr.write(size);
	  	  	wr.write(sv);
	  	    headpos+=(size.length+sv.length);
	  	}else
	  		{
	  			size[0]=0;
	  			wr.write(size);
	  			headpos+=1;
	  		}  	
	  		//cur.header.SEn.toString();
	  		
	  	//6
       	  v=Float.floatToIntBits(IO.header.SSampleRate);
    	  byte[] fv=new byte[4];
    	  fv[0]=(byte)(v&0xff);
    	  fv[1]=(byte)(v>>8&0xff);
    	  fv[2]=(byte)(v>>16&0xff);
    	  fv[3]=(byte)(v>>24&0xff);
    	  wr.write(fv);
	  		//cur.header.SSampleRate;
    	  headpos+=4;
    	  //7
    	  	v=IO.header.SSampleSizeInBits;
    	  	iv=new byte[4];
    	  	iv[0]=(byte)(v&0xff);
    	  	iv[1]=(byte)(v>>8&0xff);
    	  	iv[2]=(byte)(v>>16&0xff);
    	  	iv[3]=(byte)(v>>24&0xff);
    	  	wr.write(iv);
	  		//cur.header.SSampleSizeInBits;
    	  	headpos+=4;
    	  	//8
    	  	v=IO.header.SChannels;
    	  	iv=new byte[4];
    	  	iv[0]=(byte)(v&0xff);
    	  	iv[1]=(byte)(v>>8&0xff);
    	  	iv[2]=(byte)(v>>16&0xff);
    	  	iv[3]=(byte)(v>>24&0xff);
    	  	wr.write(iv);
	  		//cur.header.SChannels;
    	  	headpos+=4;
    	  	//9
    	  	v=IO.header.SFrameSize;
    	  	iv=new byte[4];
    	  	iv[0]=(byte)(v&0xff);
    	  	iv[1]=(byte)(v>>8&0xff);
    	  	iv[2]=(byte)(v>>16&0xff);
    	  	iv[3]=(byte)(v>>24&0xff);
    	  	wr.write(iv);
	  		//cur.header.SFrameSize;
    	  	headpos+=4;
    	  	
    	  	//10
    	  	v=Float.floatToIntBits(IO.header.SFrameRate);
    	  	fv=new byte[4];
    	  	fv[0]=(byte)(v&0xff);
    	  	fv[1]=(byte)(v>>8&0xff);
    	  	fv[2]=(byte)(v>>16&0xff);
    	  	fv[3]=(byte)(v>>24&0xff);
    	  	wr.write(fv);
	  		//cur.header.SFrameRate;
    	  	headpos+=4;
    	  	//11
    	  	byte[] bv=new byte[1];
    	  	if(IO.header.SBigEndian)
    	  		bv[0]=(byte)(1);
    	  	else
    	  		bv[0]=(byte)(0);
    	  	wr.write(bv);
	  		//cur.header.SBigEndian;
    	  	headpos+=1;
	  		//12
    	  	long v1=IO.header.SFrameLeangth;
        	byte[] lv=new byte[8];
       	 	lv[0]=(byte)(v1&0xff);
     	  	lv[1]=(byte)(v1>>8&0xff);
     	    lv[2]=(byte)(v1>>16&0xff);
     	    lv[3]=(byte)(v1>>24&0xff);
     	    lv[4]=(byte)(v1>>32&0xff);
     	    lv[5]=(byte)(v1>>40&0xff);
     	    lv[6]=(byte)(v1>>48&0xff);
     	    lv[7]=(byte)(v1>>56&0xff);
     	    wr.write(lv);
	  		//cur.header.SFrameLeangth;
     	    headpos+=8;
	  		
	  		
	  		//13
	  		//end head
	  		iv=new byte[16];
	  		for(int reg=0;reg<16;reg++ )
	  		{
	  			iv[reg]=0;
	  		}
	  		wr.write(iv);
	  		System.out.println("finish head");
	  		headpos+=16;
	  		
	  		//wav pos of lyg file
	  		long wavpos=0;
        	byte[] wp=new byte[8];
       	 	wp[0]=(byte)(wavpos&0xff);
     	  	wp[1]=(byte)(wavpos>>8&0xff);
     	    wp[2]=(byte)(wavpos>>16&0xff);
     	    wp[3]=(byte)(wavpos>>24&0xff);
     	    wp[4]=(byte)(wavpos>>32&0xff);
     	    wp[5]=(byte)(wavpos>>40&0xff);
     	    wp[6]=(byte)(wavpos>>48&0xff);
     	    wp[7]=(byte)(wavpos>>56&0xff);
     	    wr.write(wp);

	  		int f1 = fpc.seek(1);
        	bmv = fgc.grabFrame();
        	img = new BufferToImage((VideoFormat)bmv.getFormat()).createImage(bmv);   	
        	BufferedImage newimage = new BufferedImage(cur.header.MWFrame,cur.header.MHFrame, BufferedImage.TYPE_INT_RGB);  	
        	newimage=(BufferedImage)img;
        	BufferedImage oldimage = new BufferedImage(cur.header.MWFrame,cur.header.MHFrame, BufferedImage.TYPE_INT_RGB);  	
        	for(int l=0;l<cur.header.MHFrame;l++)
        	{
        		for(int k=0;k<cur.header.MWFrame;k++)
        		{
        			oldimage.setRGB(k, l,newimage.getRGB(k, l));
        		}
        	}	
        	
        //WRITE first FRAME
        	 ByteArrayOutputStream os=new ByteArrayOutputStream();
       		// JPEGImageEncoder encoder=JPEGCodec.createJPEGEncoder(os);
       		// JPEGEncodeParam prm=JPEGCodec.getDefaultJPEGEncodeParam(oldimage);
       		// prm.setQuality(25f/100f, true); 
     	   //  encoder.encode(oldimage,prm);
     	     byte[] ba=os.toByteArray();
     	     System.out.println(ba.length);
     	     int rl=ba.length;
        	 byte[] rlb = new byte[4];
        	 rlb[0] = (byte)(rl&0xff);
      	  	 rlb[1]=(byte)(rl>>8&0xff);
      	  	 rlb[2]=(byte)(rl>>16&0xff);
      	  	 rlb[3]=(byte)(rl>>24&0xff);
        	 wr.write(rlb);	     
     	     wr.write(ba);    
        //
     	     
     	int secfix=10;
     	double d1=0.94;
     	double d2=0.95;
     	double d3=0.96;
     	double d4=0.97;
     	double d5=0.98;
     	double d6=0.99;
     	double d7=0.995;
        while(i < endtimes)
        //while(i < 10)
        {
        	//write jpeg
        	//get new
        	f1  = fpc.seek(i);
        	bmv = fgc.grabFrame();
        	img = new BufferToImage((VideoFormat)bmv.getFormat()).createImage(bmv);   	
        	newimage=(BufferedImage)img;
        	//newimage = new Strech().Processor(newimage,0.1,0.9); 
			//media filter
		    //bi = new Median().Processor(bi,0.1,0.9); 
   	      	//guassian filter
		    //bi = new Guassian().Processor(bi,5,5,1.6);
        	//lygimage to jpeg
        	if(newimage != null)
		    {
        		int cop=0;
        		 //compare  new to old
            	for(int l=0;l<cur.header.MHFrame;l++)
            	{
            		for(int k=0;k<cur.header.MWFrame;k++)
            		{
            			if(oldimage.getRGB(k, l)!=newimage.getRGB(k, l))
            			{
            				cop++;
            			}
            		}
            	}	
        		if(cop>((cur.header.MHFrame*cur.header.MWFrame)*d7))
        		{
        			for(int l=0;l<cur.header.MHFrame;l++)
                	{
                		for(int k=0;k<cur.header.MWFrame;k++)
                		{
                			oldimage.setRGB(k, l,newimage.getRGB(k, l));
                		}
                	}	
        			//if not almost the same 
        			os=new ByteArrayOutputStream();
           		// 	encoder=JPEGCodec.createJPEGEncoder(os);
           		 //	prm=JPEGCodec.getDefaultJPEGEncodeParam(oldimage);
           		 //	prm.setQuality(25f/100f, true); 
           		 //	encoder.encode(oldimage,prm);
           		 	ba=os.toByteArray();
           		 	System.out.println(ba.length);
           		 	rl=ba.length;
           		 	rlb = new byte[4];
           		 	rlb[0] = (byte)(rl&0xff);
           		 	rlb[1]=(byte)(rl>>8&0xff);
           		 	rlb[2]=(byte)(rl>>16&0xff);
          	  	 	rlb[3]=(byte)(rl>>24&0xff);
          	  	 	wr.write(rlb);	     
          	  	 	wr.write(ba);     
          	  	 	System.out.println(i+"-------------------------------------------------------");
        		}
        		else
        			{  //if (almost the same
        			   if(i%secfix == 0) 
        			   {
        				   for(int l=0;l<cur.header.MHFrame;l++)
                       	{
                       		for(int k=0;k<cur.header.MWFrame;k++)
                       		{
                       			oldimage.setRGB(k, l,newimage.getRGB(k, l));
                       		}
                       	}	
               			//if not almost the same 
               			    os=new ByteArrayOutputStream();
                  	//	 	encoder=JPEGCodec.createJPEGEncoder(os);
                  	//	 	prm=JPEGCodec.getDefaultJPEGEncodeParam(oldimage);
                  	//	 	prm.setQuality(25f/100f, true); 
                  	//	 	encoder.encode(oldimage,prm);
                  		 	ba=os.toByteArray();
                  		 	System.out.println(ba.length);
                  		 	rl=ba.length;
                  		 	rlb = new byte[4];
                  		 	rlb[0] = (byte)(rl&0xff);
                  		 	rlb[1]=(byte)(rl>>8&0xff);
                  		 	rlb[2]=(byte)(rl>>16&0xff);
                 	  	 	rlb[3]=(byte)(rl>>24&0xff);
                 	  	 	wr.write(rlb);	     
                 	  	 	wr.write(ba);     
                 	  	 	System.out.println(i+"-------------------------------------------------------");
        			   }
        			   else
        			   {
        				   rl=0;
        				   rlb = new byte[4];
        				   rlb[0] = (byte)(rl&0xff);
             	  	 	   rlb[1] = (byte)(rl>>8&0xff);
             	  	 	   rlb[2] = (byte)(rl>>16&0xff);
             	  	 	   rlb[3] = (byte)(rl>>24&0xff);
             	  	 	   wr.write(rlb);
             	  	 	   System.out.println(i+"-------------------------------------------------------");
    
        			   }
        			}
		        }
        	i++;
        }	
		 wr.flush();
		 wr.close();
		 wr=null;
		 //get lyg length to long
		 RandomAccessFile raf=new RandomAccessFile(Wpath,"rw");
		 long wpos=raf.length();
		 java.nio.channels.FileChannel ch=raf.getChannel();
		 java.nio.MappedByteBuffer buffer = ch.map(FileChannel.MapMode.READ_WRITE, headpos, 8);
		 //get byte
		 byte [] audiopos=new byte[8];
		 //put long to byte
		 audiopos[0]=(byte)(wpos&0xff);
		 audiopos[1]=(byte)(wpos>>8&0xff);
		 audiopos[2]=(byte)(wpos>>16&0xff);
		 audiopos[3]=(byte)(wpos>>24&0xff);
		 audiopos[4]=(byte)(wpos>>32&0xff);
		 audiopos[5]=(byte)(wpos>>40&0xff);
		 audiopos[6]=(byte)(wpos>>48&0xff);
		 audiopos[7]=(byte)(wpos>>56&0xff);
		 //put byte to header
		 for(int reg=0;reg<8;reg++)
		 {
			 buffer.put(reg, audiopos[reg]);
		 }
		 buffer.force();
		 buffer.clear();
		 ch.close();
		 raf.close();
		 raf = null;
		 //add audio pos of lyg
		 long milliseconds = (long)((IO.header.SFrameLeangth * 1000) / IO.header.SFrameRate);
		 times = milliseconds / 1000.0;
		 //
		 if((int)times<times)
		 {
			 times=(int)(times+1);
		 }
		 
		 //open lygagain write audio data
		 raf = new RandomAccessFile(Wpath,"rw");
		 long fleanth =raf.length();
		 raf.seek(fleanth);
		 //
		 for(int reg=0;reg<times;reg++)
			{
			 SoundWaveVector sv = new SoundWaveVector();
		     sv.getVectorLines(ais,IO.header.SFrameRate);       
		     raf.write(sv.audioBytes);
			}
		 raf.close();
		 raf=null;
		 //add audio
		 System.out.println("end");
        } catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 return;
	}

}
