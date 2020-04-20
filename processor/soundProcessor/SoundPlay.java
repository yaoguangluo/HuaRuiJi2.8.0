package soundProcessor;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

import org.LYG.node.sound.wavePlay.jp;

import movieProcessor.AdataFrame;
import movieProcessor.LYGFileIO;
import waveProcessor.DFT;
public class SoundPlay implements Runnable {
	private LYGFileIO cur;
	private AdataFrame af;
	private jp jp;
	private Object bootSound;
	public SoundPlay(){
	}
	public void Play(AudioInputStream ais1){
		if (ais1 == null) {
			return;
		}
		AudioFormat format = ais1.getFormat();
		AudioInputStream playbackInputStream = AudioSystem.getAudioInputStream(format, ais1);             
		if (playbackInputStream == null) {
			return;
		}
		SourceDataLine line1;
		DataLine.Info info1 = new DataLine.Info(SourceDataLine.class, format);
		try {
			line1 = (SourceDataLine) AudioSystem.getLine(info1);
			int frameSizeInBytes = ais1.getFormat().getFrameSize();
			int bufferLengthInFrames = line1.getBufferSize() / (8*frameSizeInBytes);
			int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
			int bufSize=bufferLengthInBytes;       
			line1.open(format, bufSize);
		} catch (LineUnavailableException ex) { 
			return;
		}
		int frameSizeInBytes = format.getFrameSize();
		int bufferLengthInFrames = line1.getBufferSize() /(8*frameSizeInBytes) ;
		int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
		byte[] data = new byte[bufferLengthInBytes];
		int numBytesRead = 0;
		line1.start();
		while(true){
			try {
				if ((numBytesRead = ais1.read(data)) == -1) {
					break;
				}
				int numBytesRemaining = numBytesRead;
				while (numBytesRemaining > 0 ) {
					numBytesRemaining -= line1.write(data, 0, numBytesRemaining);
				}
			} catch (Exception e) {
				break;
			}
		}
		line1.stop();
		line1.close();
		line1 = null;
	}

	public void Play(AdataFrame af) throws IOException{
		if (af.audioIS == null) {
			return;
		}
		AudioFormat format = af.audioIS.getFormat();
		AudioInputStream playbackInputStream = AudioSystem.getAudioInputStream(format, af.audioIS);             
		if (playbackInputStream == null) {
			return;
		}
		SourceDataLine line1;
		DataLine.Info info1 = new DataLine.Info(SourceDataLine.class, format);
		try {
			line1 = (SourceDataLine) AudioSystem.getLine(info1);    
			int frameSizeInBytes = af.audioIS.getFormat().getFrameSize();
			int bufferLengthInFrames = line1.getBufferSize() / (8*frameSizeInBytes);
			int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
			int bufSize=bufferLengthInBytes;       
			line1.open(format, bufSize);
		} catch (LineUnavailableException ex) { 
			return;
		}
		int frameSizeInBytes = format.getFrameSize();
		int bufferLengthInFrames = line1.getBufferSize() /(8*frameSizeInBytes) ;
		int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
		byte[] data = new byte[bufferLengthInBytes];
		int numBytesRead = 0;
		line1.start();
		af.audioIS.reset();
		while(true) {
			try {
				if ((numBytesRead = af.audioIS.read(data)) == -1) {
					break;
				}
				int numBytesRemaining = numBytesRead;
				while (numBytesRemaining > 0 ) {
					numBytesRemaining -= line1.write(data, 0, numBytesRemaining);
				}
			} catch (Exception e) {
				break;
			}
		}
		while(af.next!=null){
			af=af.next;
			af.audioIS.reset();
			while(true)  {
				try {
					if ((numBytesRead = af.audioIS.read(data)) == -1) {
						break;
					}
					int numBytesRemaining = numBytesRead;
					while (numBytesRemaining > 0 ) {
						numBytesRemaining -= line1.write(data, 0, numBytesRemaining);
					}
				} catch (Exception e) {
					break;
				}
			}   
		}   
		line1.stop();
		line1.close();
		line1 = null;
	}

	public void Play(byte[] secbytesarray, AudioFormat af, SourceDataLine line1, int sp, byte[] data) throws LineUnavailableException{
		for(int i=0;i<sp;i++){
			for(int j=0;j<data.length;j++){
				data[j]=secbytesarray[j+i*data.length];
			}
			line1.write(data, 0, data.length);
		}
	}

	@SuppressWarnings("unused")
	public void Play1(AudioInputStream ais1, AudioFormat af) throws IOException{
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
		int numBytesRead = 0;
		line1.start(); 
		byte all[]=new byte[(int) (ais1.getFrameLength()*2)];
		ais1.read(all);  
		int sp=all.length/data.length;
		int pos=0;  
		for(int i=0;i<sp;i++){
			for(int j=0;j<data.length;j++){
				data[j]=all[j+i*data.length];
			}
			int numBytesRemaining = data.length;//343
			while (numBytesRemaining > 0 ) {
				numBytesRemaining -= line1.write(data, 0, numBytesRemaining);
			}
		} 
		line1.stop();
		line1.close();
		line1 = null;
	}

	public void PlayArray(AdataFrame af) {
		if (af.audioIS == null) {
			return;
		} 
		AudioInputStream ais = new BytestoAIS().getAIS(af.audioArray,af.audioIS);
		AudioFormat format = af.audioIS.getFormat();
		AudioInputStream playbackInputStream = AudioSystem.getAudioInputStream(format, af.audioIS);             
		if (playbackInputStream == null) {
			return;
		}
		SourceDataLine line1;
		DataLine.Info info1 = new DataLine.Info(SourceDataLine.class, format);
		try {
			line1 = (SourceDataLine) AudioSystem.getLine(info1);

			int frameSizeInBytes = af.audioIS.getFormat().getFrameSize();
			int bufferLengthInFrames = line1.getBufferSize() / (8*frameSizeInBytes);
			int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
			int bufSize=bufferLengthInBytes;       
			line1.open(format, bufSize);
		} catch (LineUnavailableException ex) { 
			return;
		}
		int frameSizeInBytes = format.getFrameSize();
		int bufferLengthInFrames = line1.getBufferSize() /(8*frameSizeInBytes) ;
		int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
		byte[] data = new byte[bufferLengthInBytes];
		int numBytesRead = 0;
		line1.start();   
		while(true) {
			try {
				if ((numBytesRead = ais.read(data)) == -1) {
					break;
				}
				int numBytesRemaining = numBytesRead;
				while (numBytesRemaining > 0 ) {
					numBytesRemaining -= line1.write(data, 0, numBytesRemaining);
				}
			} catch (Exception e) {
				break;
			}
		}
		while(af.next!=null)  {
			af=af.next;
			ais = new BytestoAIS().getAIS(af.audioArray,af.audioIS);
			while(true)  {
				try {
					if ((numBytesRead = ais.read(data)) == -1) {
						break;
					}
					int numBytesRemaining = numBytesRead;
					while (numBytesRemaining > 0 ) {
						numBytesRemaining -= line1.write(data, 0, numBytesRemaining);
					}
				} catch (Exception e) {
					break;
				}
			}   
		}   
		line1.stop();
		line1.close();
		line1 = null;
	}

	public void PlayMasterArray(AdataFrame af) {
		// TODO Auto-generated method stub
		if (af.audioIS == null) {
			return;
		}
		double master[]= new double[af.master.length];                              
		int psita=0;    
		for(int i = 2;i<master.length-2;i++){  
			psita=0;
			for(int p=-2;p<3;p++)
			{
				psita+=(af.master[i+p]);
			}
			master[i]=psita/5;                 
		}   
		AudioInputStream ais = new BytestoAIS().getAIS(master,af.audioIS); 
		AudioFormat format = af.audioIS.getFormat();
		AudioInputStream playbackInputStream = AudioSystem.getAudioInputStream(format, af.audioIS);             
		if (playbackInputStream == null) {
			return;
		}
		SourceDataLine line1;
		DataLine.Info info1 = new DataLine.Info(SourceDataLine.class, format);
		try {
			line1 = (SourceDataLine) AudioSystem.getLine(info1);

			int frameSizeInBytes = af.audioIS.getFormat().getFrameSize();
			int bufferLengthInFrames = line1.getBufferSize() / (8*frameSizeInBytes);
			int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
			int bufSize=bufferLengthInBytes;       
			line1.open(format, bufSize);
		} catch (LineUnavailableException ex) { 
			return;
		}
		int frameSizeInBytes = format.getFrameSize();
		int bufferLengthInFrames = line1.getBufferSize() /(8*frameSizeInBytes) ;
		int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
		byte[] data = new byte[bufferLengthInBytes];
		int numBytesRead = 0;
		line1.start();    
		while(true)  {
			try {
				if ((numBytesRead = ais.read(data)) == -1) {
					break;
				}
				int numBytesRemaining = numBytesRead;
				while (numBytesRemaining > 0 ) {
					numBytesRemaining -= line1.write(data, 0, numBytesRemaining);
				}
			} catch (Exception e) {
				break;
			}
		}
		while(af.next!=null)   {
			af=af.next;       
			psita=0;    
			for(int i = 2;i<master.length-2;i++){
				//find high  
				psita=0;
				for(int p= -2; p< 3; p++){
					psita+=(af.master[i+p]);
				}
				master[i]=psita/ 5;                
			}  
			ais = new BytestoAIS().getAIS(master,af.audioIS);
			while(true) {
				try {
					if((numBytesRead= ais.read(data))== -1)       {
						break;
					}
					int numBytesRemaining= numBytesRead;
					while (numBytesRemaining> 0 ) {
						numBytesRemaining-= line1.write(data, 0, numBytesRemaining);
					}
				} catch (Exception e) {
					break;
				}
			}   
		}   
		line1.stop();
		line1.close();
		line1= null;
	}
	public void PlaySlaveArray(AdataFrame af) {
		if (af.audioIS== null) {
			return;
		} 
		double slave[]= new double[af.slave.length]; 
		int psita=0;
		for(int i = 2;i<slave.length-2;i++)
		{
			//find high  
			psita=0;
			for(int p=-2;p<3;p++)
			{
				psita+=(af.slave[i+p]);
			}
			slave[i]=psita/5;

		}         
		AudioInputStream ais = new BytestoAIS().getAIS(slave,af.audioIS);
		AudioFormat format = af.audioIS.getFormat();
		AudioInputStream playbackInputStream = AudioSystem.getAudioInputStream(format, af.audioIS);             
		if (playbackInputStream == null) {
			return;
		}
		SourceDataLine line1;
		DataLine.Info info1 = new DataLine.Info(SourceDataLine.class, format);
		try {
			line1 = (SourceDataLine) AudioSystem.getLine(info1);

			int frameSizeInBytes = af.audioIS.getFormat().getFrameSize();
			int bufferLengthInFrames = line1.getBufferSize() / (8*frameSizeInBytes);
			int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
			int bufSize=bufferLengthInBytes;       
			line1.open(format, bufSize);
		} catch (LineUnavailableException ex) { 
			return;
		}
		int frameSizeInBytes = format.getFrameSize();
		int bufferLengthInFrames = line1.getBufferSize() /(8*frameSizeInBytes) ;
		int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
		byte[] data = new byte[bufferLengthInBytes];
		int numBytesRead = 0;
		line1.start();
		while(true){
			try {
				if ((numBytesRead = ais.read(data)) == -1) {
					break;
				}
				int numBytesRemaining = numBytesRead;
				while (numBytesRemaining > 0 )   {
					numBytesRemaining -= line1.write(data, 0, numBytesRemaining);
				}
			} catch (Exception e) {
				break;
			}
		}
		while(af.next!=null){
			af=af.next;
			psita=0;
			for(int i= 2; i< slave.length- 2; i++){
				//find high
				psita= 0;
				for(int p= -2; p< 3; p++)      {
					psita+= (af.slave[i+ p]);
				}
				slave[i]= psita/ 5;
			}    
			ais= new BytestoAIS().getAIS(slave, af.audioIS);
			while(true){
				try {
					if((numBytesRead = ais.read(data)) == -1)       {
						break;
					}
					int numBytesRemaining = numBytesRead;
					while (numBytesRemaining > 0 ) 
					{
						numBytesRemaining -= line1.write(data, 0, numBytesRemaining);
					}
				} catch (Exception e) 
				{
					break;
				}
			}   
		}   
		line1.stop();
		line1.close();
		line1 = null;

		// TODO Auto-generated method stub

	}
	public void PlayFftArray(AdataFrame af, LYGFileIO cur, jp jp, Object bootSound) throws InterruptedException {
		if (af.audioIS== null) {
			return;
		}
		this.cur= cur;
		this.af= af;
		this.jp= jp;
		this.bootSound= bootSound;
	}
	@Override
	public void run() {
		while(jp.reg==5){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
		}
			DFT dFT= new DFT();
			dFT.init(1024);
			double[] fft= new double[1024];
			fft[2]= cur.makeContainerZNSZ.source2* 60;
			fft[3]= cur.makeContainerZNSZ.source3* 60;
			fft[4]= cur.makeContainerZNSZ.source4* 60;
			fft[5]= cur.makeContainerZNSZ.source5* 60;
			fft[6]= cur.makeContainerZNSZ.source6* 60;
			fft[7]= cur.makeContainerZNSZ.source7* 60;
			fft[8]= cur.makeContainerZNSZ.source8* 60;
			fft[16]= cur.makeContainerZNSZ.source16* 60;
			fft[32]= cur.makeContainerZNSZ.source32* 60;
			fft[64]= cur.makeContainerZNSZ.source64* 60;
			fft[128]= cur.makeContainerZNSZ.source128* 60;
			fft[256]= cur.makeContainerZNSZ.source256* 60;
			fft[512]= cur.makeContainerZNSZ.source512* 60;
			double[] array= dFT.ft(fft);
			//for(int i=0;i<5;i++) {
				AudioInputStream ais= new BytestoAIS().getAIS(array, af.audioIS);
				AudioFormat format= af.audioIS.getFormat();
				AudioInputStream playbackInputStream = AudioSystem.getAudioInputStream(format, af.audioIS);             
				if (playbackInputStream== null) {
					return;
				}
				SourceDataLine line1;
				DataLine.Info info1= new DataLine.Info(SourceDataLine.class, format);
				try {
					line1= (SourceDataLine) AudioSystem.getLine(info1);
					int frameSizeInBytes= af.audioIS.getFormat().getFrameSize();
					int bufferLengthInFrames= line1.getBufferSize()/ (8* frameSizeInBytes);
					int bufferLengthInBytes= bufferLengthInFrames* frameSizeInBytes;
					int bufSize= bufferLengthInBytes;       
					line1.open(format, bufSize);
				} catch (LineUnavailableException ex) { 
					return;
				}
				int frameSizeInBytes= format.getFrameSize();
				int bufferLengthInFrames= line1.getBufferSize()/ (8* frameSizeInBytes) ;
				int bufferLengthInBytes= bufferLengthInFrames* frameSizeInBytes;
				
				byte[] data= new byte[bufferLengthInBytes];
				int numBytesRead= 0;
				line1.start();
				while(jp.reg==5){
					try {
						Thread.sleep(10);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						if ((numBytesRead= ais.read(data))== -1) {
							break;
						}
						int numBytesRemaining= numBytesRead;
						while (numBytesRemaining> 0) {
							Thread.sleep(1);
							numBytesRemaining-= line1.write(data, 0, numBytesRemaining);
						}
					} catch (Exception e) {
						break;
					}
				}
				line1.stop();
				line1.close();	
			}
	//	}
	}
}