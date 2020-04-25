package org.tinos.node.movie.LYGPlayer;
import java.io.IOException;
import java.io.RandomAccessFile;
import movieProcessor.LYGFileIO;
public class BufferReader
{
   public synchronized void asyBufferReader(RandomAccessFile raf,LYGFileIO io,byte[] buffer,int readtype) throws IOException//0 video 1 audio
   {
	   if(readtype==0)
	   {
	     raf.seek(io.header.SMovCurrentPos);
		 raf.read(buffer);
		 io.header.SMovCurrentPos+=buffer.length;
	   }
	   else
	   {
		 raf.seek(io.header.SWavCurrentPos);
		 raf.read(buffer);
		 io.header.SWavCurrentPos+=buffer.length;  
	   }

   }
   

      
}

