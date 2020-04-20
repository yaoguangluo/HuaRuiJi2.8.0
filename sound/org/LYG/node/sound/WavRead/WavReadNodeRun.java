package org.LYG.node.sound.WavRead;

import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.UnsupportedAudioFileException;

import movieProcessor.AdataFrame;
import movieProcessor.Header;
import movieProcessor.LYGFileIO;

import org.LYG.GUI.OSGI.*;

import soundProcessor.SoundWaveVector;
public class WavReadNodeRun extends ObjectRun
{
	private static final long serialVersionUID = 1L;
	public int value=0;
	public String filepath;
	public WavReadNodeRun( ) throws IOException
 	{	
 	}
	@SuppressWarnings({ "unused", "rawtypes" })
	public void run(final WavReadNodeView thisView) throws IOException, UnsupportedAudioFileException
	{
	  		    System.out.println("runed"+value); 
		  		thisView.path=new String(filepath); 
		  		topaisin = AudioSystem.getAudioInputStream(new File(filepath));
				 
				toplygin = new LYGFileIO();
				toplygin.reset();
				//IO.creat();
				toplygin.header=new Header();
				toplygin.adataFrame=new AdataFrame();
				AudioInputStream ais=topaisin;
				//get header
				toplygin.header.SBigEndian=ais.getFormat().isBigEndian();
				toplygin.header.SChannels=ais.getFormat().getChannels();
				toplygin.header.SEn=ais.getFormat().getEncoding();
				toplygin.header.SFrameRate=ais.getFormat().getFrameRate();
				toplygin.header.SFrameSize=ais.getFormat().getFrameSize();
				toplygin.header.SSampleRate=ais.getFormat().getSampleRate();
				toplygin.header.SSampleSizeInBits=ais.getFormat().getSampleSizeInBits();
				toplygin.header.SFrameLeangth=ais.getFrameLength();
				//get array
				//time
				 double times;
				 long milliseconds= (long)((toplygin.header.SFrameLeangth * 1000)/ toplygin.header.SFrameRate);
				 times= milliseconds/ 1000.0;
				 //
				 if((int)times< times){
					 times= (int)(times+ 1);
				 }
				//loop store main array to sub array
				int atime= 0;
				SoundWaveVector sv= new SoundWaveVector();
				Vector lines= sv.getVectorLines(ais,toplygin.header.SFrameRate);
				toplygin.adataFrame.audioArray= sv.audioData;
				toplygin.adataFrame.master= new double[sv.audioData.length];
				for(int i= 0; i< sv.audioData.length; i++){
					toplygin.adataFrame.master[i]= sv.audioData[i];
				}
				toplygin.adataFrame.seconds= atime++;
				for(int i= 0; i< times- 1; i++){
					toplygin.adataFrame.next= new AdataFrame();
					toplygin.adataFrame.next.prev= toplygin.adataFrame;
					toplygin.adataFrame = toplygin.adataFrame.next;
					sv = new SoundWaveVector();
					lines = sv.getVectorLines(ais,toplygin.header.SFrameRate);
					toplygin.adataFrame.audioArray = sv.audioData;
					
					toplygin.adataFrame.master=new double[sv.audioData.length];
					for(int j=0;j<sv.audioData.length;j++){
						toplygin.adataFrame.master[j]=sv.audioData[j];
					}
					toplygin.adataFrame.seconds=atime++;
				}
				//out
				toplygin.duration=times;
				toplygin.toHead();
				toplygin.init();

				thisView.lygout=toplygin;
		  		thisView.aisout=topaisin;
	}
}
