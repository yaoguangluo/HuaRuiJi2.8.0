package movie.demos;

import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFormat.Encoding;

import movieProcessor.LYGFileIO;
import movieProcessor.LYGPlayer;

public class DEMO
{
	@SuppressWarnings("unused")
	public DEMO() throws IOException
	{
		String FilePath = new String("FilePath");
		LYGFileIO IO = new LYGFileIO();
		IO.reset();
		IO.lygRead(FilePath);
		LYGPlayer player = new LYGPlayer(IO);
		//processor IO begin;
		//...
		//end
		IO.lygWrite("filePath");
		IO.reset();
	}
	public static void main(String []args)
	{
		 Encoding en=new Encoding("ULAW");
		 AudioFormat F=new AudioFormat(en, 1, 2, 3, 4, 5, true);
		 //en /1sample rate /2samplesize /3 channels /4framesize  /5 framrate/bigendianture 
		 System.out.println("Channels"+F.getChannels());
		 System.out.println("FrameRate"+F.getFrameRate());
		 System.out.println("FrameSize"+F.getFrameSize());
		 System.out.println("SampleSizeInBits"+F.getSampleSizeInBits());
		 System.out.println("Encod"+F.getEncoding());
		 System.out.println("SampleRate"+F.getSampleRate());
		 System.out.println("BigEndian"+F.isBigEndian());
		 
		 
		
	}
}