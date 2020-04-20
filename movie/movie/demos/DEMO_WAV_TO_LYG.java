package movie.demos;

import java.io.IOException;

import javax.sound.sampled.UnsupportedAudioFileException;

import movieProcessor.WAVtoLYG;

public class DEMO_WAV_TO_LYG
{
	public static void main(String []args) throws IOException, UnsupportedAudioFileException
	{
		//String wavInputFile=new String("C:\\Users\\yaoguang\\Desktop\\study\\sound\\AHag.wav");
		String wavInputFile=new String("C:\\Users\\yaoguang\\Desktop\\study\\sound\\luo.wav");
		
		
		String lygOutputFile=new String("C:\\Users\\yaoguang\\Desktop\\study\\sound\\newluo.lyg");
		new WAVtoLYG(wavInputFile,lygOutputFile);	
	}
}