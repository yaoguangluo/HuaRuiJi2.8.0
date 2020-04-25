package org.tinos.node.movie.LYGPlayer;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import soundProcessor.SoundPlay;
import movieProcessor.LYGFileIO;
public class ps extends Thread
{
   public RandomAccessFile raf; 
   public LYGFileIO io;
   public BufferReader read;
   public ps(RandomAccessFile raf1, LYGFileIO io1, BufferReader read1)
   {
			raf=raf1;
			io=io1;
			read=read1;
   }
   public void run() 
   {
	 int times=0;
	 int secbytes=(int) (io.header.SFrameSize*io.header.SFrameRate);
	 AudioFormat af=new AudioFormat(io.header.SEn,
			 io.header.SSampleRate , 
			 io.header.SSampleSizeInBits,
			 io.header.SChannels,
			 io.header.SFrameSize,
			 io.header.SFrameRate,
			 io.header.SBigEndian);
	    io.header.SWavCurrentPos=io.header.SWavPos;
	    SourceDataLine line1;
        DataLine.Info info1 = new DataLine.Info(SourceDataLine.class,af);
        try {
            line1 = (SourceDataLine) AudioSystem.getLine(info1);
            int bufSize =line1.getBufferSize() / 8;
            line1.open(af, bufSize);
        } catch (LineUnavailableException ex) { 
            return;
        }
        int bufSize =line1.getBufferSize() / 8;
        byte[] data = new byte[bufSize];
        byte secbytesarray[]=new byte[secbytes];
        int sp=secbytesarray.length/data.length;
        line1.start();
        while(times++<io.duration)
        {
		 try {
			 read.asyBufferReader(raf, io, secbytesarray, 1);
		     new SoundPlay().Play(secbytesarray,af,line1,sp,data);
		 	} catch (IOException e) {
		 		e.printStackTrace();
		 		}
		 		catch (LineUnavailableException e) {
		 			e.printStackTrace();
		 			}
        }
        line1.stop();
        line1.close();
        line1 = null;  
   }

		
}