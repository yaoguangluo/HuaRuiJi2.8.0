


import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;


import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;


import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import javax.media.*;
import javax.media.protocol.CachedStream;
import javax.swing.JFrame;
import javax.swing.JPanel;




//import com.sun.image.codec.jpeg.JPEGCodec;
//import com.sun.image.codec.jpeg.JPEGImageDecoder;
import com.sun.media.format.AviVideoFormat;
import com.sun.media.format.WavAudioFormat;
import com.sun.media.protocol.DataSource;

public class test1 extends JPanel
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
	@SuppressWarnings({ "resource", "unused" })
	public void test11() throws NoDataSourceException, MalformedURLException, IOException, NoProcessorException 
	{
		f = new File("C:\\Users\\yaoguang\\Desktop\\study\\media\\jpegs.lyg");
		FileInputStream fis=new FileInputStream(f);
		
	    byte[] toph= new byte[17];
	    fis.read(toph);
	    byte[] midh= new byte[(int)toph[16]];
	    fis.read(midh);
	    byte[] endh= new byte[29];
	    fis.read(endh);
	    byte[] line= new byte[16];
	    fis.read(line);
	    //get header frames
	    int f0 = ((int)toph[8]&0x000000ff);
   	 	int f1 = ((int)toph[9]<<8&0x0000ff00);
   	 	int f2 = ((int)toph[10]<<16&0x00ff0000);
   	 	int f3 = ((int)toph[11]<<24&0xff000000);
	    
	    int fl = f3|f2|f1|f0;;
	    
	    
	    //fsize to int
		int reg=1;
		
		
		while(reg++<fl)
		{
			System.out.println(reg);
			byte[] fsize= new byte[4];
		    fis.read(fsize);
	 	  	int len = ((int)fsize[3]<<24&0xff000000)|((int)fsize[2]<<16&0x00ff0000)|((int)fsize[1]<<8&0x0000ff00)|((int)fsize[0]&0x000000ff);
	 	  	System.out.println(len);
	 	  	byte[] jpeg= new byte[len];
		    fis.read(jpeg);
			InputStream is=new ByteArrayInputStream(jpeg);
			//JPEGImageDecoder jid=JPEGCodec.createJPEGDecoder(is);
			//BufferedImage bi=jid.decodeAsBufferedImage();
			
			//bi = new Strech().Processor(bi,0.1,0.9); 
				//media filter
			//bi = new Median().Processor(bi,0.1,0.9); 
	   	      	//guassian filter
			//bi = new Guassian().Processor(bi,5,5,1.6); //(lygimage,0.1,0.9)
			
			//this.paint((Image)bi);
			//mpeg to lyg
			/*
			int h=bi.getHeight();
	    	int w=bi.getWidth();
	    	int hb=2;
	    	int wb=3;
	    	int lh=h*hb;
	    	int lw=w*wb;
        	BufferedImage lygimage = new BufferedImage(lw, lh, BufferedImage.TYPE_INT_RGB);
   	      	for (int i = 0; i < lh-hb; i+=hb) 
   	      	{
   	    	    for (int j = 0; j < lw-wb; j+=wb) 
   	    	    {
   	    	    	for(int k=0;k<hb;k++)
   	    	    	{
   	    	    		for(int l=0;l<wb;l++)
   	    	    		{
   	    	    			lygimage.setRGB(j+l,i+k,bi.getRGB(j/wb, i/hb));			
   	    	    		}
   	    	    	}
   	    		}
   	      }
   	      	//streach filter
   	         lygimage = new Strech().Processor(lygimage,0.1,0.9); 
   		
			//media filter
   	         //lygimage = new Median().Processor(lygimage,0.1,0.9); 
  	
   	      	//guassian filter
   	         lygimage = new Guassian().Processor(lygimage,5,5,1.6); //(lygimage,0.1,0.9); 
			//
			this.paint((Image)lygimage);
			/**/
		}
		
	
	}
	@SuppressWarnings("unused")
	private void a() {
		// TODO Auto-generated method stub
		
	}
	@SuppressWarnings("unused")
	private void m() throws NoDataSourceException, MalformedURLException, IOException, NoPlayerException, CannotRealizeException {

        
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
		//Export x = new Export(f.toURL().toString());
		//x.setVisible(true);
		//x.setSize(800, 600);
		
		
		test1 t = new test1();
		t.setVisible(true);
		t.setPreferredSize(new Dimension(800,600));
		JFrame fr = new JFrame();
		fr.setSize(800, 600);
		fr.add(t);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		t.test11();
        
        
	}

	
}