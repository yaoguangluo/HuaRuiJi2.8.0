package SP;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.geom.Line2D.Double;
import java.io.IOException;
import java.util.Map;
import java.util.Vector;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;

import fLT.flt;
import waveProcessor.DFT;
public class soundWaveVector{
	Vector<Double> lines= new Vector<Double>();
	Vector<Double> mlines1= new Vector<Double>();
	Vector<Double> mlines2= new Vector<Double>();
	Vector<Double> mlines3= new Vector<Double>();
	Vector<Double> mlines4= new Vector<Double>();
	Vector<Double> mlines5= new Vector<Double>();
	Vector<Double> mlines6= new Vector<Double>();
	Vector<Double> mlines7= new Vector<Double>();
	Vector<Double> mlines8= new Vector<Double>();
	Vector<Double> mlines9= new Vector<Double>();
	Vector<Double> mlines10= new Vector<Double>();
	Vector<Double> mlines11= new Vector<Double>();
	Vector<Double> mlines12= new Vector<Double>();
	final  double pi= 6.28318530;
	public byte[] audioBytes;
	public double[] audioData= null;
	public double pshock;
	public double nshock;
	public String v;
	public int N= 1024;
	//
	@SuppressWarnings({ "rawtypes", "unused" })
	public Vector getVectorLines1(jp jpt, jpv jp3, AudioInputStream ais, Map<String,String> cache_bz
			, Map<String,String> cache_sj, DFT dFT, Vector<Double> forOutput
			, Graphics graphics, int type) throws IOException, InterruptedException{
		pshock= 0;
		nshock= 0;
		lines.removeAllElements();  // clear the old vector
		AudioFormat af= ais.getFormat();
		audioBytes= null;
		if (audioBytes== null) {
			try {
				audioBytes = new byte[(int) (ais.getFrameLength() *af.getFrameSize())/2];
				// System.out.println("audiobyte length:"+audioBytes.length);
				ais.read(audioBytes);
			} catch (Exception ex) { 
				//reportStatus(ex.toString());
				return lines;
			}
		}
		Dimension d = new Dimension(N,600);
		int w= d.width;
		int h= d.height-15;    
		if (af.getSampleSizeInBits() == 16) {
			int nlengthInSamples = audioBytes.length / 2;
			audioData = new double[nlengthInSamples];
			if (af.isBigEndian()) {
				for (int i = 0; i < nlengthInSamples; i++) {
					/* First byte is MSB (high order) */
					int MSB = (int) audioBytes[2*i];
					/* Second byte is LSB (low order) */
					int LSB = (int) audioBytes[2*i+1];
					audioData[i] = MSB << 8 | (255 & LSB);
				}
			} else {
				for (int i= 0; i < nlengthInSamples; i++) {
					/* First byte is LSB (low order) */
					int LSB= (int) audioBytes[2* i];
					/* Second byte is MSB (high order) */
					int MSB= (int) audioBytes[2* i+ 1];
					audioData[i]= MSB << 8 | (255 & LSB);
				}
			}
		} else if (af.getSampleSizeInBits() == 8) {
			int nlengthInSamples = audioBytes.length;
			audioData = new double[nlengthInSamples];
			if (af.getEncoding().toString().startsWith("PCM_SIGN")) {
				for (int i = 0; i < audioBytes.length; i++) {
					audioData[i] = audioBytes[i];
				}
			} else {
				for (int i = 0; i < audioBytes.length; i++) {
					audioData[i] = audioBytes[i] - 128;
				}
			}
		}
		int frames_per_pixel= audioBytes.length/af.getFrameSize()/w;
		byte my_byte= 0;
		double y_last= 0;
		int idx= 0;
		int numChannels= af.getChannels();
		double newdata[]= new double [w] ;
		double newdata1[]= new double [w] ;
		double fdata1[]= new double [w] ;
		double fdata2[]= new double [w] ;
		double cos[][]= new double [w][w] ;
		double sin[][]= new double [w][w] ;
		//caiyang
		for(int i=0; i < w && audioData != null;i++){
			idx = (int) (frames_per_pixel * numChannels * i);//到时候改成熵增。
			newdata[i]=audioData[w*2+ i];	
		}
		//ff
		v = new flt().clt4(dFT, lines, jpt, jp3, mlines1, mlines2, mlines3, mlines4, mlines5, mlines6
				, mlines7, mlines8, mlines9, mlines10, mlines11, mlines12, N, cos, sin, newdata, fdata1
				, cache_bz, cache_sj, forOutput, graphics, type);
		//pinlvguolv	
		Thread.sleep(200);
		return lines;
	}    
}