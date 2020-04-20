import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.media.*;
import javax.media.control.FrameGrabbingControl;
import javax.media.control.FramePositioningControl;
import javax.media.format.VideoFormat;
import javax.media.protocol.CachedStream;
import javax.media.protocol.ContentDescriptor;
import javax.media.protocol.DataSource;
import javax.media.protocol.PushBufferDataSource;
import javax.media.protocol.PushBufferStream;
import javax.media.util.BufferToImage;
import javax.swing.JFrame;
import javax.swing.JPanel;
import com.sun.media.format.AviVideoFormat;
import com.sun.media.format.WavAudioFormat;

public class test extends JPanel
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public CachedStream cacheStream;
    public Image img;
    public DataSource d;
    public static File f;
    public AviVideoFormat fmv;
    public WavAudioFormat fav;
	@SuppressWarnings({ "deprecation", "static-access" })
	public void test1() throws NoDataSourceException, MalformedURLException, IOException, NoProcessorException {
//		f = new File("C:\\Users\\yaoguang\\Desktop\\study\\media\\DSCN9332.AVI");
//		d = Manager.createDataSource(f.toURL());
//		//get format
		
		 
		
		f = new File("C:\\Users\\Administrator\\Desktop\\deta\\detasource\\videoProcess\\webwxgetvideo.avi");
		d = Manager.createDataSource(f.toURL());
		Processor pr=Manager.createProcessor(d);
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
			
        //d=pr.getDataOutput();
		//get image
	
	}
	private void a() {
		// TODO Auto-generated method stub
		
	}
	@SuppressWarnings({ "deprecation", "unused" })
	private void m() throws NoDataSourceException, MalformedURLException, IOException, NoPlayerException, CannotRealizeException {
		// TODO Auto-generated method stub
		d = Manager.createDataSource(f.toURL());
        Player p = Manager.createRealizedPlayer(d);
        double times=p.getDuration().getSeconds();
        FramePositioningControl fpc=(FramePositioningControl) p.getControl("javax.media.control.FramePositioningControl");  
        FrameGrabbingControl fgc=(FrameGrabbingControl) p.getControl("javax.media.control.FrameGrabbingControl");
        Buffer bmv=new Buffer();
        int i=0;
        int endtimes=(int) (fmv.getFrameRate()*times);
        /*
        while((i++) < endtimes)
        {
        	int f1 = fpc.seek(i);
        	bmv = fgc.grabFrame();
        	img=(new BufferToImage((VideoFormat)bmv.getFormat()).createImage(bmv)); 
        	this.paint(img);
        	System.out.println(i);
        }
        */
        
        int f1 = fpc.seek(1);
    	bmv = fgc.grabFrame();
    	img = new BufferToImage((VideoFormat)bmv.getFormat()).createImage(bmv);   	
    	BufferedImage newimage = new BufferedImage(fmv.getSize().width,fmv.getSize().height, BufferedImage.TYPE_INT_RGB);  	
    	newimage=(BufferedImage)img;
    	BufferedImage oldimage = new BufferedImage(fmv.getSize().width,fmv.getSize().height, BufferedImage.TYPE_INT_RGB);  	
    	
      	 int h=fmv.getSize().height;
    	 int w=fmv.getSize().width;
    	for (int j = 0; j < h; j++)
   	      	{
   	      		for (int k = 0; k < w; k++)
   	      		{
   	      			
   	      		 oldimage.setRGB(k, j,newimage.getRGB(k, j));
   	      		}
   	      	}
    	 if(newimage != null)
	        { 
    		 	for (int j = 0; j < h; j++)
	   	      	{
	   	      		for (int k = 0; k < w; k++)
	   	      		{
	   	      		        int v2=newimage.getRGB(k, j);
	   	      			
	   	      		}
	   	      	}
	        }
    	 System.out.println(1);
    //WRITE FRAME

    	i=19; 
    while(i < endtimes)
    {
    	//get new
    	f1  = fpc.seek(i);
    	bmv = fgc.grabFrame();
    	img = new BufferToImage((VideoFormat)bmv.getFormat()).createImage(bmv);   	
    	newimage=(BufferedImage)img;
    	 if(newimage != null)
	        {
    		    this.paint((Image)oldimage);
    		 //write diffrent
	   	      	for (int j = 0; j < h; j++)
	   	      	{
	   	      		for (int k = 0; k < w; k++)
	   	      		{
	   	      			
	   	      			int vn= newimage.getRGB(k, j);
	   	      			int nl= oldimage.getRGB(k, j);
	   	      			
	   	      		    byte[] ivn=new byte[3];
	   	      			ivn[0]=(byte)(vn&0xff);
	   	      			ivn[1]=(byte)(vn>>8&0xff);
	   	      			ivn[2]=(byte)(vn>>16&0xff);
	   	      			
	   	      			byte[] inl=new byte[3];
	   	      			inl[0]=(byte)(nl&0xff);
	   	      			inl[1]=(byte)(nl>>8&0xff);
	   	      			inl[2]=(byte)(nl>>16&0xff);
	   	      			
	   	      			int count=0;
	   	      		    if(ivn[0]>inl[0]+5||ivn[0]<inl[0]-5)
	   	      		       count++;
	   	      		    if(ivn[1]>inl[1]+5||ivn[1]<inl[1]-5)
	   	      		       count++;
	   	      		    if(ivn[2]>inl[2]+5||ivn[2]<inl[2]-5)
	   	      		       count++;
	   	      		    
	   	      			if(count>0)
	   	      		    {
	   	      				oldimage.setRGB(k,j,vn);
	   	      			 
	   	      			}
	   	      		}
	   	      	}
	   	     System.out.println(i+"-------------------------------------------------------");
	        }
    	i++;
    }	
        
        
	}
	@SuppressWarnings("unused")
	public void paint(Image img2)
	{
		Graphics g= this.getGraphics();
		Graphics2D gg=(Graphics2D)g;
		g.drawImage(img2,0,0,this);
	}
	public static void main(String args[]) throws NoDataSourceException, MalformedURLException, NoPlayerException, CannotRealizeException, IOException
	{
		//f = new File("C:\\Users\\yaoguang\\Desktop\\study\\media\\DSCN9332.AVI");
		//Export x=new Export(f.toURL().toString());
		//x.setVisible(true);
		//x.setSize(800, 600);
		
		
		test t = new test();
		t.setVisible(true);
		t.setPreferredSize(new Dimension(800,600));
		JFrame fr = new JFrame();
		fr.setSize(800, 600);
		fr.add(t);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t.test1();
		t.m();
        t.a();
        
        
	}

	
}