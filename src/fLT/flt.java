package fLT;
import java.awt.Graphics;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;
import java.io.IOException;
import java.util.Map;
import java.util.Vector;
import javax.swing.JPanel;
import SP.jp;
import SP.jpv;
import waveProcessor.DFT;
public class flt extends JPanel{
	private static final long serialVersionUID = 1L;
	double pi= 3.1415926;
	public void lt(Vector<Double> flines, int N, double[][] cos, double[][] sin
			, double[] newdata1, double[] fdata1) {
		for(int k= 0; k< N; k++){
			double v1 = 2* pi* k/ N;
			for(int n= 0; n< N; n++){
				double v= v1* n;
				cos[k][n]= Math.cos(v);
				sin[k][n]= Math.sin(v);
			}
		} 
		for(int k= 1; k< N; k++){
			double r= 0, i= 0;
			for(int n= 0; n< N; n++){
				r+= newdata1[n]* cos[k][n];
				i+= newdata1[n]* sin[k][n];
			}
			fdata1[k]= Math.sqrt(r* r+ i* i);
			flines.add(new Line2D.Double(k, 0, k, fdata1[k]/ 900));
		} 
	}

	public void clt(Vector<Double> flines, int N, double[][] cos, double[][] sin
			, double[] newdata1, double[] fdata1) {
		double set= 2* pi/ N;
		for(int k= 0; k< N; k++){
			for(int n= 1; n < N; n ++){
				cos[k][n]= cos[k][n- 1]+ newdata1[n]* Math.cos(set* n* k);
			} 	
			fdata1[k]= Math.abs(cos[k][N- 1]/N);
			flines.add(new Line2D.Double(k, 0, k, fdata1[k]));
		} 	
	}

	public String clt4(DFT dFT, Vector<Double> lines,jp jpt,jpv jp3,Vector<Double> mlines1,
			Vector<Double> mlines2,
			Vector<Double> mlines3,
			Vector<Double> mlines4,
			Vector<Double> mlines5,
			Vector<Double> mlines6,
			Vector<Double> mlines7,
			Vector<Double> mlines8,
			Vector<Double> mlines9, 
			Vector<Double> mlines10,
			Vector<Double> mlines11,
			Vector<Double> mlines12, int N, double[][] cos, double[][] sin, double[] newdata, double[] fdata1,
			Map<String, String> cache_bz, Map<String, String> cache_sj,
			Vector<Double> forOutput, Graphics graphics, int type) throws IOException {
		double[] newdata1= newdata;
		newdata1= new waveProcessor.Median().median1d(newdata1, 0);
		double bili[]= new waveProcessor.Proportion().newYwithoutBound(newdata1, 0.002);
		double max= new waveProcessor.MaxAndMin().max_v(bili);
		double bili0[]= bili;
		if(max>= 2&& 0== type) {
			bili0= new waveProcessor.Proportion().newXYBest(bili0, 1024, 65);
			bili0= new waveProcessor.Guassian().guassian1d(bili0, 1.6);
			lines.clear();
			for(int i= 0; i< bili0.length; i++) {
				lines.add(new Line2D.Double(i, bili0[i], i, bili0[i]));
			} 
			jp3.paint(jpt.getGraphics(), lines, forOutput);
		}else if(1== type) {
			bili0= new waveProcessor.Proportion().newXY(bili0, 1024, 100);
			//			bili0= new waveProcessor.Proportion().newXYBest(bili0, 1024, 65);
			bili0= new waveProcessor.Guassian().guassian1d(bili0, 1.6);
			lines.clear();
			for(int i= 0; i< bili0.length; i++) {
				lines.add(new Line2D.Double(i, bili0[i], i,bili0[i]));
			} 
			jp3.paint(jpt.getGraphics(),lines, forOutput);
		}else{
			for(int i= 0; i< bili0.length; i++) {
				bili0[i]= 0;
			}
			lines.clear();
			for(int i=0; i<bili0.length; i++) {
				lines.add(new Line2D.Double(i, bili0[i], i,bili0[i]));
			} 
			mlines1.clear();
			mlines2.clear();
			mlines3.clear();
			mlines4.clear();
			mlines5.clear();
			mlines6.clear();
			mlines7.clear();
			mlines8.clear();
			mlines9.clear();
			return "";
		}
		double dft3[]= dFT.ft(bili0);
		double bili1[] = dft3;
		double caijian2[]= new waveProcessor.Tailor().caiJian1(dft3, 0, dft3.length/16);//64
		//二次傅里叶
		if(type== 0) {
			bili1= new waveProcessor.Proportion().newXY(caijian2, 256, 100);
		}else {
			bili1= new waveProcessor.Proportion().newXY(bili1, 1024, 100);
		}
		bili1= new waveProcessor.Quantification().liangHuaEqualDelete(bili1);
		mlines1.clear();
		for(int i=0;i<bili1.length;i++) {
			mlines1.add(new Line2D.Double(i, bili1[i], i,bili1[i]));
		} 
		jp3.paint1(mlines1);
		double bili2 []= new waveProcessor.Proportion().newXYBest(caijian2, 256 , 100);
		mlines2.clear();
		for(int i= 0;i< bili2.length; i++) {
			mlines2.add(new Line2D.Double(i, bili2[i], i,bili2[i]));
		} 
		jp3.paint2(mlines2);
		//3
		double guassian3[]= new waveProcessor.Median().median1d(bili2, 3);
		guassian3= new waveProcessor.Guassian().guassian1d(guassian3, 1.6);
		guassian3= new waveProcessor.Guassian().guassian1d(guassian3, 1.6);
		double bili3[] = new waveProcessor.Proportion().newXY(guassian3, 256 , 100);
		mlines3.clear();
		for(int i= 0;i< bili3.length; i++) {
			mlines3.add(new Line2D.Double(i, bili3[i], i,bili3[i]));
		} 
		jp3.paint3(mlines3);
		//lianghua4
		double xihua4[]= new waveProcessor.Quantification().liangHuaXiHua(bili3, 2);
		mlines4.clear();
		for(int i= 0; i< xihua4.length; i++) {
			mlines4.add(new Line2D.Double(i, xihua4[i], i,xihua4[i]));
		} 
		jp3.paint4(mlines4);
		//5 shehold
		double shehold5[]=new waveProcessor.Shehold().shehold1(xihua4, 25);
		mlines5.clear();
		for(int i=0;i<shehold5.length;i++) {
			mlines5.add(new Line2D.Double(i, shehold5[i], i,shehold5[i]));
		} 
		jp3.paint5(mlines5);
		//6 file left
		double left = 0;
		for(int i=0; i<shehold5.length; i++) {
			if(shehold5[i] > 0) {
				left = i;
				break;
			}
		}
		double caijian[] = new waveProcessor.Tailor().caiJian1(shehold5, left, left+128);
		mlines6.clear();
		for(int i=0; i<caijian.length; i++) {
			mlines6.add(new Line2D.Double(i, caijian[i], i,caijian[i]));
		} 
		jp3.paint6(mlines6);
		//7 二次傅里叶
		double sample[] = new double[1024];
		double bili_sample[] = new waveProcessor.Proportion().newX(caijian,32);
		for(int i= 0; i< bili_sample.length; i++) {
			sample[i]= bili_sample[i];
			sample[1024-i-1]= bili_sample[i];
		}
		double dft2[]= dFT.ft(sample);
		dft2= new waveProcessor.Copy().copy1d(dft2, 512);
		double bili7 []= new waveProcessor.Proportion().newXYBest(dft2, 256 , 100);
		mlines7.clear();
		for(int i= 0;i< bili7.length; i++) {
			mlines7.add(new Line2D.Double(i, bili7[i], i, bili7[i]));
		} 
		jp3.paint7(mlines7);
		//8 gaosi 
		double guassian7[]= new waveProcessor.Median().median1d(bili7, 0);
		guassian7= new waveProcessor.Guassian().guassian1d(guassian7, 1.6);
		mlines8.clear();
		for(int i= 0; i< guassian7.length; i++) {
			mlines8.add(new Line2D.Double(i, guassian7[i], i, guassian7[i]));
		} 
		jp3.paint7(mlines8);
		//8 bili
		double sihua8[] = new waveProcessor.Quantification().liangHuaXiHua(guassian7, 2);
		double fengtong[][] = new waveProcessor.PeakStatistic().fengTong1(sihua8);
		double fengtongYy[][] = new waveProcessor.PeakStatistic().fengPaiYy(fengtong);
		double r = fengtongYy[0][0]>fengtongYy[1][0]?fengtongYy[0][0]:fengtongYy[1][0];
		System.out.println(r);
		if(r>200) {
			return "";
		}
		double bili8[] = new waveProcessor.Tailor().caiJian1(guassian7,0 ,r);
		bili8= new waveProcessor.Proportion().newXYBest(bili8, 256 , 100);
		mlines8.clear();
		for(int i=0;i<bili8.length;i++) {
			mlines8.add(new Line2D.Double(i, bili8[i], i,bili8[i]));
		} 
		jp3.paint8(mlines8);
		//9 final
		double xihua9[] = new waveProcessor.Quantification().liangHuaXiHua(bili8, 2);
		mlines9.clear();
		for(int i= 0; i< xihua9.length; i++) {
			mlines9.add(new Line2D.Double(i, xihua9[i], i,xihua9[i]));
		} 
		jp3.paint9(mlines9);
		//10 shehold
		double she10[] = new waveProcessor.Shehold().shehold1(xihua9, 15);
		mlines10.clear();
		for(int i= 0; i< she10.length; i++) {
			mlines10.add(new Line2D.Double(i, she10[i], i,she10[i]));
		} 
		jp3.paint10(mlines10);
		//gaosi
		double median11[]= new waveProcessor.Guassian().guassian1d(she10, 1.6);
		median11= new waveProcessor.Proportion().newY(median11, 100);
		mlines11.clear();
		for(int i= 0; i< median11.length; i++) {
			mlines11.add(new Line2D.Double(i, median11[i], i,median11[i]));
		} 
		jp3.paint11(mlines11);
		return "";		
		//		//11 lianghua 
		//		cp="0";
		//		for(int i=1;i<she10.length;i++) {
		//			if(she10[i]>15) {
		//				if(i>10) {
		//					cp+="+1/"+(int)(i/10)+"π";
		//				}
		//			}
		//		} 
		//		@SuppressWarnings("rawtypes")
		//		Set llll=cache_sj.keySet();
		//		@SuppressWarnings("rawtypes")
		//		Iterator lllll=llll.iterator();
		//		//System.out.println("outsj");
		//		while(lllll.hasNext()) {
		//			//System.out.println(lllll.next());
		//		}
		//		String rt="no find in txt";
		//		InputStream ain = getClass().getResourceAsStream("a.txt");
		//		BufferedReader acReader = new BufferedReader(new InputStreamReader(ain));  
		//		String actempString = null; 
		//		while ((actempString = acReader.readLine()) != null) {
		//			if(actempString.replace(" ", "").equals(cp.replace(" ", ""))) {
		//				rt="a";
		//			}	
		//		}
		//		acReader.close();
		//		//read o
		//		InputStream oin = getClass().getResourceAsStream("o.txt");
		//		BufferedReader ocReader = new BufferedReader(new InputStreamReader(oin));  
		//		String octempString = null; 
		//		while ((octempString = ocReader.readLine()) != null) {
		//			if(octempString.replace(" ", "").equals(cp.replace(" ", ""))) {
		//				rt="o";
		//			}	
		//		}
		//		ocReader.close();
		//		//read e
		//		InputStream ein = getClass().getResourceAsStream("e.txt");
		//		BufferedReader ecReader = new BufferedReader(new InputStreamReader(ein));  
		//		String ectempString = null; 
		//		while ((ectempString = ecReader.readLine()) != null) {
		//			if(ectempString.replace(" ", "").equals(cp.replace(" ", ""))) {
		//				rt="e";
		//			}	
		//		}
		//		ecReader.close();
		//		//read i
		//		InputStream iin = getClass().getResourceAsStream("i.txt");
		//		BufferedReader icReader = new BufferedReader(new InputStreamReader(iin));  
		//		String ictempString = null; 
		//		while ((ictempString = icReader.readLine()) != null) {
		//			if(ictempString.replace(" ", "").equals(cp.replace(" ", ""))) {
		//				rt="i";
		//			}	
		//		}
		//		icReader.close();
		//		//read u
		//		InputStream uin = getClass().getResourceAsStream("u.txt");
		//		BufferedReader ucReader = new BufferedReader(new InputStreamReader(uin));  
		//		String uctempString = null; 
		//		while ((uctempString = ucReader.readLine()) != null) {
		//			if(uctempString.replace(" ", "").equals(cp.replace(" ", ""))) {
		//				rt="u";
		//			}	
		//		}
		//		ucReader.close();
		//		if(rt.equals("no find in txt")) {	
		//			rt=" "+cp;
		//			if(cache_bz.containsKey(cp)) {
		//				rt+="noise";
		//			}else {
		//				if(cache_sj.containsKey(cp)) {
		//					rt+="find";
		//				}else {
		//					cache_sj.put(cp, cp);
		//					rt+="add:";
		//				}
		//				rt+=cache_sj.size();
		//			}
		//		}
		//		jp3.paintvalue(rt);
		//		return rt;		
	}
}