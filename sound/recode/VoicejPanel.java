package recode;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.awt.geom.Line2D.Double;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Vector;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;
import javax.swing.JButton;
import javax.swing.JPanel;

import comp.jbutton.DetaButton;
import movieProcessor.LYGFileIO;


import soundProcessor.SoundRecord;
import soundProcessor.SoundWaveVector;

public class VoicejPanel extends JPanel implements Runnable{
	private static final long serialVersionUID = 1L;
	LYGFileIO cur;
	Thread t1;
	Thread time;
	int reg=0;
	SoundRecord rec;
	Vector<Double> lines ;
	jpv jp3;
	public VoicejPanel(){
		rec= new SoundRecord(null);
		JButton j= new DetaButton("开始录音",100,50,Color.red);
		j.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reg= 1;
				t1= new Thread(VoicejPanel.this);
				t1.setPriority(Thread.MIN_PRIORITY);
				t1.start();	  
			}
		});
		j.setSize(100,30);
		JButton j1= new DetaButton("关闭录音",100,50,Color.orange);
		j1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				reg= 0;
				t1.stop();
				t1= null;
			}
		});
		j1.setSize(100,30);
		JButton j2= new DetaButton("生成数列",100,50,Color.green);
		j2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				
			}
		});
		j2.setSize(100,30);
		this.add(j);	
		this.add(j1);
		this.add(j2);
		jp3=new jpv();
		jp3.setBounds(100,0, 400, 400);
		jp3.setVisible(true);
		this.add(jp3);
	} 

	@SuppressWarnings({ "unused", "unchecked" })
	public void run(){
		if(reg==1){
			//录音
			SoundWaveVector sw= new SoundWaveVector();
			time= new Thread(rec);
			time.setPriority(6);
			TargetDataLine line;
			AudioFormat.Encoding encoding= AudioFormat.Encoding.PCM_SIGNED;  
			float rate= 500f;  
			int sampleSize= 16;  
			String signedString= "signed";  
			boolean bigEndian= true;  
			int channels= 2;  
			AudioFormat format= new AudioFormat(encoding, rate, sampleSize,  
					channels, (sampleSize / 8)* channels, rate, bigEndian); 
			while(reg==1){
				try {
					Thread.sleep(1);
					DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);
					if (!AudioSystem.isLineSupported(info)) {
						return;
					}
					// get and open the target data line for capture.
					try {
						line = (TargetDataLine) AudioSystem.getLine(info);
						line.open(format, line.getBufferSize());
					} catch (LineUnavailableException ex) { 
						return;
					} catch (SecurityException ex) { 
						//shutDown(ex.toString());
						return;
					} catch (Exception ex) { 
						//shutDown(ex.toString());
						return;
					}
					ByteArrayOutputStream out = new ByteArrayOutputStream();
					int frameSizeInBytes = format.getFrameSize();
					int bufferLengthInFrames = line.getBufferSize() / 8;
					int bufferLengthInBytes = bufferLengthInFrames * frameSizeInBytes;
					//  System.out.println("bufferLengthInBytes : " + bufferLengthInBytes +" **");
					byte[] data = new byte[bufferLengthInBytes];
					int numBytesRead = 0;
					line.start();
					//System.out.println(line);
					for(int i=0;i<20;i++){
						if((numBytesRead = line.read(data, 0, bufferLengthInBytes)) == -1) {
							break;
						}
						out.write(data, 0, numBytesRead);
					}
					line.stop();
					line.close();
					line = null;
					// stop and close the output stream
					try {
						out.flush();
						out.close();
					} catch (IOException ex) {
						ex.printStackTrace();
					}
					// load bytes into the audio input stream for playback
					byte[] audioBytes = out.toByteArray();
					ByteArrayInputStream bais = new ByteArrayInputStream(audioBytes);
					AudioInputStream ais = new AudioInputStream(bais, format, audioBytes.length / format.getFrameSize());    
					lines = sw.getVectorLines1(ais);	
					System.out.println(sw.pshock-400);
					jp3.lines=lines;
					jp3.paint(getGraphics());	     
					//显示最大值				     
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			//显示波振幅 
			return;
		}	 
	}
}
