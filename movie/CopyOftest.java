

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;


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
import javax.media.protocol.FileTypeDescriptor;


import javax.media.protocol.PushBufferDataSource;
import javax.media.protocol.PushBufferStream;


import javax.media.util.BufferToImage;


import javax.swing.JPanel;
import com.sun.media.format.AviVideoFormat;
import com.sun.media.format.WavAudioFormat;
@SuppressWarnings("serial")
public class CopyOftest extends JPanel{
    public CachedStream cacheStream;
    public Image img;
    public DataSource d;
    public static File f;
    public AviVideoFormat fmv;
    public WavAudioFormat fav;
	@SuppressWarnings({ "deprecation", "static-access" })
	public void test() throws NoDataSourceException, MalformedURLException, IOException, NoProcessorException {
		f = new File("C:\\Users\\yaoguang\\Desktop\\study\\media\\DSCN9332.AVI");
		d = Manager.createDataSource(f.toURL());
		//get format
		Processor pr=Manager.createProcessor(d);
		pr.configure();
		while(pr.getState()<pr.Configured){}
		pr.setContentDescriptor(new ContentDescriptor(ContentDescriptor.RAW));
		pr.realize();
		while(pr.getState()<pr.Realized){}
		DataSource nd = pr.getDataOutput();
		PushBufferStream[] b = ((PushBufferDataSource) nd).getStreams();
		PushBufferStream mv = b[0];
		PushBufferStream av = b[1];
		fmv=(AviVideoFormat) mv.getFormat();
		fav=(WavAudioFormat) av.getFormat();
        //d=pr.getDataOutput();
		//get image
	}
	@SuppressWarnings("unused")
	private void a() {
		// TODO Auto-generated method stub
	}
	@SuppressWarnings({ "unused", "deprecation" })
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
        while((i++) < endtimes)
        {
        	int f1 = fpc.seek(i);
        	bmv = fgc.grabFrame();
        	img=(new BufferToImage((VideoFormat)bmv.getFormat()).createImage(bmv)); 
        	this.paint(img);
        	System.out.println(i);
        }	
	}
	@SuppressWarnings("unused")
	public void paint(Image img2)
	{
		Graphics g= this.getGraphics();
		Graphics2D gg=(Graphics2D)g;
		g.drawImage(img2,0,0,this);
	}
	@SuppressWarnings({ "deprecation", "static-access" })
	public static void main(String args[]) throws NoDataSourceException, MalformedURLException, NoPlayerException, CannotRealizeException, IOException, InterruptedException, NoDataSinkException, NotRealizedError
	{
		//File f = new File("C:\\Users\\yaoguang\\Desktop\\study\\media\\DSCN9332.AVI");
		File f = new File("C:/Users/Administrator/Desktop/deta/detasource/videoProcess/webwxgetvideo.avi");
		
		Processor p=Manager.createProcessor(f.toURL());
        p.configure();
		while(p.getState()<p.Configured){}
		p.setContentDescriptor(new FileTypeDescriptor(FileTypeDescriptor.QUICKTIME));
		VideoFormat mv=new VideoFormat(VideoFormat.CINEPAK);
		//AudioFormat av=new AudioFormat(AudioFormat.LINEAR);
		p.getTrackControls()[0].setFormat(mv);
		p.realize();
		while(p.getState()<p.Realized){}
		String wavout=new String("C:/Users/yaoguang/Desktop/study/media/sample.wav");
		File of=new File(wavout);
		of.createNewFile();
		DataSink out=Manager.createDataSink(p.getDataOutput(), new MediaLocator(of.toURL()));
		p.start();
		out.open();
		out.start();
		Thread.sleep((long) p.getDuration().getSeconds());
		p.close();
		out.stop();
		out.close();
	}
}