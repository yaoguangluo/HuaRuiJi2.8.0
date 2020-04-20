package movie.demos;




import java.io.IOException;


import javax.sound.sampled.UnsupportedAudioFileException;

import movieProcessor.LYGFileIO;


import soundProcessor.SoundPlay;



public class DEMO_LYG_to_WAV
{
	public static void main(String args[]) throws IOException, UnsupportedAudioFileException
	{
		LYGFileIO IO = new LYGFileIO();
		IO.reset();
		IO.lygRead("C:\\Users\\yaoguang\\Desktop\\study\\sound\\newlyg.lyg");
		//IO.lygRead("C:\\Users\\yaoguang\\Desktop\\study\\sound\\newluo.lyg");
		IO.toHead();
		IO.init();
		if(IO.adataFrame!=null)
		{
			new SoundPlay().Play(IO.adataFrame.audioIS);
			while(IO.adataFrame.next!=null)
			{
				IO.adataFrame=IO.adataFrame.next;
				new SoundPlay().Play(IO.adataFrame.audioIS);		
			}
			
		}
		
		
		IO.toHead();
		IO.init();
		if(IO.adataFrame!=null)
		{
			new SoundPlay().Play(IO.adataFrame.audioIS);
			while(IO.adataFrame.next!=null)
			{
				IO.adataFrame=IO.adataFrame.next;
				new SoundPlay().Play(IO.adataFrame.audioIS);		
			}
			
		}
		if(IO.adataFrame!=null)
		{
			new SoundPlay().Play(IO.adataFrame.audioIS);
			while(IO.adataFrame.next!=null)
			{
				IO.adataFrame=IO.adataFrame.next;
				new SoundPlay().Play(IO.adataFrame.audioIS);		
			}
			
		}
		
		System.out.println("read");
		//IO.reset();
	}
}