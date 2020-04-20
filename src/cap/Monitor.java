package cap;
import java.awt.*;


import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.bytedeco.javacpp.opencv_core.IplImage;
import org.bytedeco.javacv.Java2DFrameConverter;
import org.bytedeco.javacv.OpenCVFrameConverter;
import org.bytedeco.javacv.OpenCVFrameGrabber;
import org.tinos.deta.image.ImagePixGroupFilter;
import org.tinos.freetts.thread.read.ReadEnglish;

import comp.jbutton.DetaButton;

public class Monitor extends JApplet{
	private static final long serialVersionUID = 1L;
	public boolean isRedButton= false;
	public boolean isGreenButton= false;
	public boolean isBlueButton= false;
	public boolean isStreButton= false;
	public boolean isSblButton= false;
	public boolean isRcaButton= false;
	public boolean isPcaButton= false;
	public boolean isPcfButton= false;
	public boolean isbt52Stop= false;
	public boolean isbt53Stop= false;
	public boolean isbt60Stop= false;
	public boolean isbt73Stop= false;
	public boolean isbt80Stop= false;
	public boolean isbt81Stop= false;
	public boolean isbt82Stop= false;
	public boolean isbt83Stop= false;
	public boolean isbt62Stop= false;
	public boolean isbt43Stop= false;
	public boolean isbt41Stop= false;
	public boolean isbt88Stop= false;
	public boolean recordStop= true;
	public Map<String, Boolean> eyeShows=new HashMap<>();
	//模式识别1 识别上眼睛 
	int[][] eyeHeart=new int[][] {
		{ 2, 0, 0, 1, 1, 2 },
		{ 0, 0, 0, 1, 1, 1 },
		{ 0, 0, 0, 1, 1, 1 },
		{ 0, 0, 0, 1, 1, 1 },
		{ 0, 0, 0, 1, 1, 1 },
		{ 2, 0, 0, 1, 1, 2 }
	};					
	//模式识别1 识别上眼睛 
	int[][] eye=new int[][] {
		{12,12,12,12,12,12,12,19,19,19,19,19,19,19,19,19,19, 9, 9, 9,11,11,11,11,11},
		{12,12,12,12,12,12,12,19,19,19,19,19,19,19,19,19,19, 9, 9, 9, 9,11,11,11,11},
		{12,12,12,12,12,12,12,19,19,19,19,19,19,19,19,19,19, 9, 9, 9, 9, 9, 9,11,11},
		{12,12,12,12,12,12,12,19,19,19,19,19,19,19,19,19,19, 9, 9, 9, 9, 9, 9, 9,11},
		{12,12,12,12,12,12,12,19,19,19,19,19,19,19,19,19,19, 9, 9, 9, 9, 9, 9, 9, 9},
		{12,12,12,12,12,12,12,12,12,14,14,14,14,14,14,19,19, 9, 9, 9, 9, 9, 9, 9, 9},
		{12,12,12,12,12,12,12,12,13,14,14,14,14,14,14,14,10,10, 9, 9, 9, 9, 9, 9, 9},
		{12,12,12,12,12,12,12,13,13,14,14,14,14,14,14,10,10,10,10,10, 9, 9, 9, 9, 9},
		{4 ,12,12,12,12,12,12,13,13,20,20, 1, 1,14,14,10,10,10,10,10,10,10, 9, 9, 9},
		{2 , 2, 2, 2, 2,12,13,13,20,20,20, 1, 1, 1, 10,10,10,10,10,10,10,10,10, 9, 9},
		{2 , 2, 2, 2, 2,12,13,20,20,20,20, 1, 1, 1, 1,10,10,10,10,10,10,10, 9, 9, 9},
		{2 , 2, 2, 2, 2,12,13,20,20,20,20, 1, 1, 1, 1,10,10,10,10,10,10, 3, 3, 3, 3},
		{2 , 2, 2, 2, 2,12,13,20,20,20,20, 1, 1, 1, 1,10,10,10,10,10, 3, 3, 3, 3, 3},
		{2 , 2, 2, 2, 2,12,13,20,20,20,20, 1, 1, 1, 1,10,10,10,10,10, 3, 3, 3, 3, 3},
		{2 , 2, 2, 2, 2, 2,13,13,20,20,20, 1, 1, 1,10,10,10,10,10, 3, 3, 3, 3, 3, 3},
		{2 , 2, 2, 2, 2, 2,13,13,13,20,20, 1, 1,15,15,10,10,10,10, 3, 3, 3, 3, 3, 3},
		{5 , 2, 2, 2, 2, 2, 2,13,13,15,15,15,15,15,15,15,10,10, 3, 3, 3, 3, 3, 3, 3},
		{5 , 2, 2, 2, 2, 2, 2, 2,13,15,15,15,15,15,15,15,10, 3, 3, 3, 3, 3, 3, 3, 3},
		{5 , 5, 2, 2, 2,22,22, 2, 2,15,15,15,15,15,15,15, 3, 3, 3, 3, 3, 3, 3, 3, 8},
		{5 , 5, 4, 2, 2,22,22,22, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
		{5 , 5, 5, 5, 2,22,22,22, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 7, 3, 3},
		{5 , 5, 5, 5, 5,22,22,22, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 7, 7, 7, 3, 3},
		{5 , 5, 5, 5, 5, 5,22, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 7, 7, 7, 7, 3},
		{5 , 5, 5, 5, 5, 5, 5, 6, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 7, 7, 7, 7, 7, 7},
		{5 , 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 3, 3, 3, 3, 3, 3, 7, 7, 7, 7, 7, 7, 7}
	};
	public ArrayList<int[][]> imageList= new ArrayList<>();
	public boolean isStop= false;	
	public String time = "";
	public String newtime = "";
	public long mi = 0;
	public long newmi = 0;
	public IplImage ipl;
	public IplImage newcv;
	public JSlider sliderx;
	public JSlider sliderz;
	public JSlider slidery;
	public JSlider slidert;
	public JSlider sliderl;
	public Box br= new Box(BoxLayout.X_AXIS);  
	public Box bg= new Box(BoxLayout.X_AXIS);  
	public Box bb= new Box(BoxLayout.X_AXIS);  
	public JSlider sliderr;
	public JSlider sliderg;
	public JSlider sliderb;
	public JButton btr;
	public JButton btg;
	public JButton btb;
	public int facr= 0;
	public int facg= 0;
	public int facb= 0;

	public JButton bt1;
	public JButton bt2;
	public JButton bt3;
	public JButton bt4;
	public JButton bt5;

	public JButton bt00;
	public JButton bt01;
	public JButton bt02;
	public JButton bt03;

	public JButton bt10;
	public JButton bt11;
	public JButton bt12;
	public JButton bt13;

	public JButton bt20;
	public JButton bt21;
	public JButton bt22;
	public JButton bt23;

	public JButton bt30;
	public JButton bt31;
	public JButton bt32;
	public JButton bt33;

	public JButton bt40;
	public JButton bt41;
	public JButton bt42;
	public JButton bt43;

	public JButton bt50;
	public JButton bt51;
	public JButton bt52;
	public JButton bt53;

	public JButton bt60;
	public JButton bt61;
	public JButton bt62;
	public JButton bt63;

	public JButton bt70;
	public JButton bt71;
	public JButton bt72;
	public JButton bt73;

	public JButton bt80;
	public JButton bt81;
	public JButton bt82;
	public JButton bt83;

	public JButton bt84;
	public JButton bt85;
	public JButton bt86;
	public JButton bt87;

	public JButton bt88;
	public JButton bt89;
	public JButton bt90;
	public JButton bt91;

	public DetaButton bt92;	


	public org.bytedeco.javacv.Frame frame;
	public int encry[][][];
	public int encry_new[][][];
	public int encry_fs[][][];
	public IplImage difcv;
	public IplImage oldcv;
	public Image oldImage;
	public BufferedImage imageForOutput;
	public ReadEnglish readEnglish;
	public Image newImage;
	public Java2DFrameConverter paintConverter;
	public Image difImage;
	public Box sliderBox = new Box(BoxLayout.Y_AXIS);  
	public Box buttonBox0= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox1= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox2= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox3= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox4= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox5= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox6= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox7= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox8= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox9= new Box(BoxLayout.X_AXIS);  
	public Box buttonBox10= new Box(BoxLayout.X_AXIS);  

	public Box b1= new Box(BoxLayout.X_AXIS);  
	public Box b2= new Box(BoxLayout.X_AXIS);  
	public Box b3= new Box(BoxLayout.X_AXIS);  
	public Box b4= new Box(BoxLayout.X_AXIS);  
	public Box b5= new Box(BoxLayout.X_AXIS);  
	public Box b6= new Box(BoxLayout.X_AXIS);  
	public Box b7= new Box(BoxLayout.X_AXIS);  

	public int[][] diaMask= new int[][] {
		{1, 0, 1, 0, 1, 0, 1, 0, 1}
		,{0, 1, 0, 1, 0, 1, 0, 1, 0}
		,{1, 0, 1, 0, 1, 0, 1, 0, 1}
		,{0, 1, 0, 1, 0, 1, 0, 1, 0}
		,{1, 0, 1, 0, 1, 0, 1, 0, 1}
		,{0, 1, 0, 1, 0, 1, 0, 1, 0}
		,{1, 0, 1, 0, 1, 0, 1, 0, 1}
		,{0, 1, 0, 1, 0, 1, 0, 1, 0}
		,{1, 0, 1, 0, 1, 0, 1, 0, 1}};

		public Button btn;
		public int[][] gdif;
		public OpenCVFrameGrabber grabber;
		public OpenCVFrameConverter.ToIplImage converter;
		public int stop= 0;
		public int has= 0;
		public int reg= 0;
		public int facx= 7;
		public int facy= 100;
		public int facz= 0;
		public int fact= 0;
		public int facl= 3;
		public long last= 0;
		int encry_c= 2;
		int encry_c_new= 2;
		int encry_c_fs= 2;
		int[][] out;
		int[][] out_oldr= null;
		int[][] out_oldg= null;
		int[][] out_oldb= null;

		int[][] out_old2r= null;
		int[][] out_old2g= null;
		int[][] out_old2b= null;
		int[][] out_old1= null;
		int[][] out_old2= null;
		int[][] out_old3= null;
		int[][] out_old4= null;
		int[][] out_old5= null;
		int q= 0;
		int q_new= 0;
		int q_fs= 0;
		int finalEncry[][];
		int finalEncryNew[][];
		int finalEncryFs[][];
		public static void main(String[] argv) {
			Monitor m= new Monitor();
			m.init();
			m.setVisible(true);
			JFrame f= new JFrame();
			f.setLayout(null);
			f.add(m);
			m.sliderx= new JSlider(0, 360);
			m.sliderx.setSnapToTicks(true);
			m.sliderx.setPaintTicks(true);
			m.sliderx.setMajorTickSpacing(5);
			m.sliderx.setMinorTickSpacing(1);
			m.sliderx.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source= (JSlider) event.getSource();  
							m.facx= source.getValue(); 
						}
					});  

			m.slidery = new JSlider(0,360);
			m.slidery.setSnapToTicks(true);
			m.slidery.setPaintTicks(true);
			m.slidery.setMajorTickSpacing(5);
			m.slidery.setMinorTickSpacing(0);
			m.slidery.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							m.facy = source.getValue();  
						}
					});  

			m.sliderz = new JSlider(0,360);
			m.sliderz.setSnapToTicks(true);
			m.sliderz.setPaintTicks(true);
			m.sliderz.setMajorTickSpacing(5);
			m.sliderz.setMinorTickSpacing(0);
			m.sliderz.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							m.facz = source.getValue();  
						}
					});  
			m.slidert = new JSlider(0,360);
			m.slidert.setSnapToTicks(true);
			m.slidert.setPaintTicks(true);
			m.slidert.setMajorTickSpacing(5);
			m.slidert.setMinorTickSpacing(1);
			m.slidert.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							m.fact = source.getValue();  
						}
					});
			m.sliderl = new JSlider(0,360);
			m.sliderl.setSnapToTicks(true);
			m.sliderl.setPaintTicks(true);
			m.sliderl.setMajorTickSpacing(5);
			m.sliderl.setMinorTickSpacing(0);
			m.sliderl.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {
							JSlider source= (JSlider) event.getSource();
							m.facl= source.getValue();  
						}
					});
			m.sliderBox.add(m.sliderx);
			m.sliderBox.add(m.slidery);
			m.sliderBox.add(m.sliderz);
			m.sliderBox.add(m.slidert);
			m.sliderBox.add(m.sliderl);
			m.sliderBox.setBounds(000, 860, 1200, 750);
			f.add(m.sliderBox);
			f.setTitle("ButtonDemo");
			f.setLocationRelativeTo(null);
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f.setSize(1000,1050);
			f.setVisible(true);
		}
		@Override
		public void init() {
			readEnglish= new ReadEnglish();
			grabber= new OpenCVFrameGrabber(0);
			converter= new OpenCVFrameConverter.ToIplImage();
			try {
				if(!grabber.equals(null)) {
					grabber.start();
				}
				Thread.sleep(2000);
				frame = grabber.grab();
			} catch (Exception e) {
				e.printStackTrace();
			}
			paintConverter = new Java2DFrameConverter();
			difImage = paintConverter.getBufferedImage(frame, 1);
			BufferedImage imageInit = (BufferedImage) difImage;
			encry = new int[encry_c][imageInit.getWidth()][imageInit.getHeight()];
			encry_new = new int[encry_c_new][imageInit.getWidth()][imageInit.getHeight()];
			encry_fs = new int[encry_c_fs][imageInit.getWidth()][imageInit.getHeight()];	
			out_oldr = new int[imageInit.getWidth()][imageInit.getHeight()];
			out_oldg = new int[imageInit.getWidth()][imageInit.getHeight()];
			out_oldb = new int[imageInit.getWidth()][imageInit.getHeight()];
			out_old1 = new int[imageInit.getWidth()][imageInit.getHeight()];
			out_old2r = new int[imageInit.getWidth()][imageInit.getHeight()];
			out_old2g = new int[imageInit.getWidth()][imageInit.getHeight()];
			out_old2b = new int[imageInit.getWidth()][imageInit.getHeight()];
			out_old3 = new int[imageInit.getWidth()][imageInit.getHeight()];
			out_old4 = new int[imageInit.getWidth()][imageInit.getHeight()];
			out_old5 = new int[imageInit.getWidth()][imageInit.getHeight()];
			this.setBounds(5, 5, 895, 675);
			this.start();
		}

		public void stop() {
			try {
				if(grabber!=null) {
					grabber.stop();
				}
				stop = 1;
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		}

		public void start(){
		}

		@SuppressWarnings({"deprecation", "unused" })
		public void paint(Graphics g){
			try {
				if(grabber!= null) {
					if((frame= grabber.grab())!= null) {	 
						if(this.isStop) {
							return;
						}
						//预处理
						difImage= paintConverter.getBufferedImage(frame, 1);
						BufferedImage image= (BufferedImage) difImage;
						int[][] rp= new int[image.getWidth()][image.getHeight()];
						int[][] gp= new int[image.getWidth()][image.getHeight()];
						int[][] bp= new int[image.getWidth()][image.getHeight()];
						if(true== isbt88Stop){
							for (int i= 0; i< image.getHeight(); ++i) {
								for (int j= 0; j< image.getWidth(); ++j) {   
									if(isRedButton) {
										rp[j][i]= (image.getRGB(j, i)>> 16& 0xFF);
									}
									if(isGreenButton) {
										gp[j][i]= (image.getRGB(j, i)>> 8& 0xFF);
									}
									if(isBlueButton) {
										bp[j][i]= (image.getRGB(j, i)>> 0& 0xFF);
									}
								}
							}	
							rp= new imageProcessor.Strech().Processor(rp, 0.05, 0.95);
							rp= new imageProcessor.Guassian().Processor1D(rp, 3, 3, 1.66);
							int[][] mag= new imageProcessor.Sobel().Processor(rp, 1);
							int[][] dir= new imageProcessor.Sobel().Processor(rp, 2);
							mag= new imageProcessor.Threshold().Processor(mag, 7);
							mag= new imageProcessor.Mask().Processor(mag, dir);				
							mag= new imageProcessor.Threshold().ProcessorSection(mag, 25 ,110);		

							//将梯度的索贝尔分层后进行距离为2的 128像色素团小于1 大于50的像色素团噪声过滤输出。
							mag= ImagePixGroupFilter.getImagePix2DGroupFilter(mag, 128, 2, 1, 50);
							//将梯度的索贝尔分层后进行距离为2的 255像色素团小于1 大于50的像色素团噪声过滤输出。
							mag= ImagePixGroupFilter.getImagePix2DGroupFilter(mag, 255, 2, 1, 50);


							int[][] rp1= mag;
							int w= rp1.length;
							int h= rp1[0].length;
							int hy= eyeHeart.length;
							int wy= eyeHeart[0].length;
							int[][] output= new int[w][h];
							for(int i= 50; i< w-50; i++) {
								Here:
									for(int j= 50; j< h-150; j++) {
										int find997=0;int find996=0;int find995=0;int find998=0;
										if(i+wy<w-1&& j+hy< h-1) {
											for(int p=0;p<wy;p++) {
												for(int q=0; q<hy; q++) {
													if(eyeHeart[q][p]==1) {
														if(rp1[i+p][j+q]==128) {
															find997++;
														}
														if(rp1[i+p][j+q]!=0) {
															find995++;
														}
													}
													if(eyeHeart[q][p]==0) {
														if(rp1[i+p][j+q]==255) {
															find996++;
														}
														if(rp1[i+p][j+q]!=0) {
															find998++;
														}
													}
												}
											}
											if(find995>=13-4&&find995<13+3
													&&find996>12-1&&find996<12+1
													&&find997>9-1 &&find997<9+1
													&&find998>13-1 &&find998<13+1) {	
												int w1= 50;
												int h1= 50;
												int hy1= eye.length;
												int wy1= eye[0].length;
												int find1=  0; int find2 =0; int find3=0; int find4=0;int find5=0;
												int find6=  0; int find7 =0; int find8=0; int find9=0;int find10=0;
												int find11= 0; int find12=0; int find13=0; int find14=0;int find15=0;
												;int find16= 0;;int find17= 0; int find18=0; int find19=0;;int find20=0;
												int find21= 0;int find22= 0;
												for(int p= -wy1/2; p<wy1/2; p++) {
													for(int q= -hy1/2; q<hy1/2; q++) {				
														if(eye[q+ hy1/2][p+ wy1/2]==1) {
															if(rp1[i+p][j+q]==128) {
																find1++;
															}
														}
														if(eye[q+ hy1/2][p+ wy1/2]==20) {
															if(rp1[i+p][j+q]==255) {
																find2++;
															}
														}
														if(eye[q+ hy1/2][p+ wy1/2]==10) {
															if(rp1[i+p][j+q]==0) {
																find3++;
															}
															if(rp1[i+p][j+q]!=0) {
																find15++;
															}
														}
														if(eye[q+ hy1/2][p+ wy1/2]==15) {
															if(rp1[i+p][j+q]==0) {
																find4++;
															}
														}
														if(eye[q+ hy1/2][p+ wy1/2]==14) {
															if(rp1[i+p][j+q]==0) {
																find5++;
															}
														}
														if(eye[q+ hy1/2][p+ wy1/2]==13) {
															if(rp1[i+p][j+q]==0) {
																find6++;
															}
														}
														if(eye[q+ hy1/2][p+ wy1/2]==2) {
															if(rp1[i+p][j+q]==128) {
																find7++;
															}
															if(rp1[i+p][j+q]==255) {
																find21++;
															}
														}
														if(eye[q+ hy1/2][p+ wy1/2]==3) {
															if(rp1[i+p][j+q]==255) {
																find8++;
															}
															if(rp1[i+p][j+q]==128) {
																find16++;
															}
														}
														if(eye[q+ hy1/2][p+ wy1/2]==9) {
															if(rp1[i+p][j+q]==255) {
																find9++;
															}
															if(rp1[i+p][j+q]==128) {
																find20++;
															}
														}
														if(eye[q+ hy1/2][p+ wy1/2]==19) {
															if(rp1[i+p][j+q]==255) {
																find10++;
															}
															if(rp1[i+p][j+q]==0) {
																find17++;
															}
														}
														if(eye[q+ hy1/2][p+ wy1/2]==12) {
															if(rp1[i+p][j+q]==0) {
																find11++;
															}
															if(rp1[i+p][j+q]==255) {
																find18++;
															}
														}
														if(eye[q+ hy1/2][p+ wy1/2]==5) {
															if(rp1[i+p][j+q]==0) {
																find12++;
															}
														}
														if(eye[q+ hy1/2][p+ wy1/2]==7) {
															if(rp1[i+p][j+q]==0) {
																find13++;
															}
															if(rp1[i+p][j+q]==128) {
																find19++;
															}
														}
														if(eye[q+ hy1/2][p+ wy1/2]==11) {
															if(rp1[i+p][j+q]==0) {
																find14++;
															}
														}
														if(eye[q+ hy1/2][p+ wy1/2]==22) {
															if(rp1[i+p][j+q]==0) {
																find22++;
															}
														}
													}
												}
												int n=5;int nn=5;
												int m=5;int mm=25;
												if(
														find1>=00      
														&&find1<10+m
														&&find2<13+m
														&&find3>=12  -n   &&find3<50+m
														&&find4>=3      &&find4<20+m
														&&find5>=19 -n    &&find5<22+m
														&&find6>=8  -nn    &&find6<19
														&&find7>10  -nn    &&find7<35+m
														&&find8>20 -n     &&find8<75+m
														&&find9<10+m
														&&find10<1
														&&find11>=66  -n  &&find11<72+m
														&&find12>=10  -n   &&find12<30+m
														&&find13>=5      &&find13<15+m
														&&find14>=7   -nn   &&find14<9+m
														&&find15>=15  -nn   &&find15<35+m
														&&find16>=1     &&find16<20+m
														&&find17>=50 -nn  &&find17<=60+m
														&&find18<10+m
														&&find19<10+m
														&&find20<1
														&&find21<40+m
														&&find22>=0     
														&&find22<20 +m) {
													if(i>50&&i<550&&j>50&&j<400) {	
														System.out.println(find6);
														for(int m1= -wy1/2-20; m1< wy1/2+20; m1++) {
															for(int n1= -hy1/2-0; n1< hy1/2+10; n1++) {
																output[i+ m1][j+ n1]= 255;	
															}
														}
													}
												}
											}//59
										}//59
									}//59
							}
							rp1=output;
							rp= new imageProcessor.Mask().Processor(rp1, rp); 
							gp= new imageProcessor.Mask().Processor(rp1, gp); 
							bp= new imageProcessor.Mask().Processor(rp1, bp); 
							int[][]temp=  new imageProcessor.Mask().Processor(rp1, mag); 
							for (int i= 0; i< image.getHeight(); ++i) {
								for (int j= 0; j< image.getWidth(); ++j) {	
									int pixel= (rp[j][i]<< 16)| (gp[j][i]<< 8)| (bp[j][i]) ;
									image.setRGB(j, i, pixel);
								}
							}
							g.drawImage(image, 0, 0, 900, 680, this);// 绘出图形文件
							return;
						}
						for (int i= 0; i< image.getHeight(); ++i) {
							for (int j= 0; j< image.getWidth(); ++j) {   
								if(isRedButton) {
									rp[j][i]= (image.getRGB(j, i)>> 16& 0xFF);
									if(isbt53Stop&& rp[j][i]< 100) {
										rp[j][i]= 0;
									}else if(rp[j][i]< facr) {
										rp[j][i]= 0;
									}
								}
								if(isGreenButton) {
									gp[j][i]= (image.getRGB(j, i)>> 8& 0xFF);
									if(isbt53Stop&& gp[j][i]< 150) {
										gp[j][i]= 0;
									}else if(gp[j][i]< facg) {
										gp[j][i]= 0;
									}
								}
								if(isBlueButton){
									bp[j][i]= (image.getRGB(j, i) & 0xFF);
									if(isbt53Stop&& bp[j][i]< 100) {
										bp[j][i]= 0;
									}else if(bp[j][i]< facb) {
										bp[j][i]= 0;
									}
								}
							}
						}
						//PCA
						int[][] str= new int[image.getWidth()][image.getHeight()];
						int[][] stg= new int[image.getWidth()][image.getHeight()];
						int[][] stb= new int[image.getWidth()][image.getHeight()];
						if(isStreButton){
							if(isRedButton){
								str= new imageProcessor.Strech().Processor(rp, 0.1, 0.9); 
							}
							if(isGreenButton){
								stg= new imageProcessor.Strech().Processor(gp, 0.1, 0.9); 
							}
							if(isBlueButton){
								stb= new imageProcessor.Strech().Processor(bp, 0.1, 0.9); 
							}
						}else {
							str=rp;
							stg=gp;
							stb=bp;
						}
						int[][] r2r= new int[image.getWidth()][image.getHeight()];
						int[][] r2g= new int[image.getWidth()][image.getHeight()];
						int[][] r2b= new int[image.getWidth()][image.getHeight()];
						if(isSblButton) {
							if(isRedButton) {
								r2r= new imageProcessor.Sobel().Processor(str, 1);
							}
							if(isGreenButton) {
								r2g= new imageProcessor.Sobel().Processor(stg, 1);
							}
							if(isBlueButton) {
								r2b= new imageProcessor.Sobel().Processor(stb, 1);
							}
						}else {
							r2r= str;
							r2g= stg;
							r2b= stb;
						}
						int[][] gthdr= new int[image.getWidth()][image.getHeight()];
						int[][] gthdg= new int[image.getWidth()][image.getHeight()];
						int[][] gthdb= new int[image.getWidth()][image.getHeight()]; 
						if(isSblButton) {
							if(isRedButton) {
								gthdr= new imageProcessor.Threshold().Processor(r2r, facx);
							}
							if(isGreenButton) {
								gthdg= new imageProcessor.Threshold().Processor(r2g, facx);
							}
							if(isBlueButton) {
								gthdb= new imageProcessor.Threshold().Processor(r2b, facx);
							}
						}else {
							gthdr= r2r;
							gthdg= r2g;
							gthdb= r2b;
						}
						int[][] diffr= findDiff(gthdr, out_oldr);	
						int[][] diffg= findDiff(gthdg, out_oldg);	
						int[][] diffb= findDiff(gthdb, out_oldb);	
						//ICA
						int[][] mskr= new int[image.getWidth()][image.getHeight()];
						int[][] mskg= new int[image.getWidth()][image.getHeight()];
						int[][] mskb= new int[image.getWidth()][image.getHeight()];
						int[][] gpcar = new int[image.getWidth()][image.getHeight()];
						int[][] gpcag = new int[image.getWidth()][image.getHeight()];
						int[][] gpcab = new int[image.getWidth()][image.getHeight()];
						Map<String, Integer> map= new ConcurrentHashMap<>(); 
						if(isRcaButton) {
							for (int i= 0; i< image.getHeight(); ++i) {
								for (int j= 0; j< image.getWidth(); ++j) {
									if(isRedButton) {
										if(mskr[j][i]== 0) {
											map= new ConcurrentHashMap<>();
											int size= getMskFilter(diffr, mskr, i, j, 0, map);
											if(size> facy){
												Iterator< String> it= map.keySet().iterator();
												while(it.hasNext()){
													String temp= it.next();
													if(size> facy){
														int x= Integer.valueOf(temp.split(",")[0]);
														int y= Integer.valueOf(temp.split(",")[1]);
														gpcar[x][y]= 255;
													}
												}
											}
										}
									}
									if(isGreenButton) {
										if(mskg[j][i]== 0) {
											map= new ConcurrentHashMap<>();
											int size= getMskFilter(diffg, mskg, i, j, 0, map);
											if(size> facy) {
												Iterator< String> it= map.keySet().iterator();
												while(it.hasNext()){
													String temp= it.next();
													if(size> facy){
														int x= Integer.valueOf(temp.split(",")[0]);
														int y= Integer.valueOf(temp.split(",")[1]);
														gpcag[x][y]= 255;
													}
												}
											}
										}
									}
									if(isBlueButton) {
										if(isGreenButton) {
											if(mskb[j][i]== 0) {
												map= new ConcurrentHashMap<>();
												int size= getMskFilter(diffb, mskb, i, j, 0, map);
												if(size> facy) {
													Iterator< String> it = map.keySet().iterator();
													while(it.hasNext()){
														String temp= it.next();
														if(size> facy){
															int x= Integer.valueOf(temp.split(",")[0]);
															int y= Integer.valueOf(temp.split(",")[1]);
															gpcab[x][y]= 255;
														}
													}
												}
											}
										}
									} 
								}
							}
						}else {
							gpcar= diffr;
							gpcag= diffg;
							gpcab= diffb;
						}
						int[][] diff2r;
						int[][] diff2g;
						int[][] diff2b;
						int[][] ccar= new int[image.getWidth()][image.getHeight()];
						int[][] ccag= new int[image.getWidth()][image.getHeight()];
						int[][] ccab= new int[image.getWidth()][image.getHeight()];
						//CCA 关联成分分析				
						if(isPcaButton) {
							if(isRedButton) {
								diff2r= findDiff(gpcar, out_old2r);
								ccar= new imageProcessor.Dilation()
										.Processor(diff2r, diaMask);
							}
							if(isGreenButton == true) {
								diff2g = findDiff(gpcag, out_old2g);
								ccag = new imageProcessor.Dilation()
										.Processor(diff2g, diaMask);
							}
							if(isBlueButton == true) {
								diff2b = findDiff(gpcab, out_old2b);
								ccab = new imageProcessor.Dilation()
										.Processor(diff2b, diaMask);
							}
						}else {
							ccar= gpcar;
							ccag= gpcag;
							ccab= gpcab;	
						}
						//OJLID
						int cxr= 0;
						int cyr= 0;
						int findr= 0;
						int[][] showOCLDr= new int[image.getWidth()][image.getHeight()];
						int[][] showORGNr= new int[image.getWidth()][image.getHeight()];
						int cxg= 0;
						int cyg= 0;
						int findg= 0;
						int[][] showOCLDg= new int[image.getWidth()][image.getHeight()];
						int[][] showORGNg= new int[image.getWidth()][image.getHeight()];
						int cxb= 0;
						int cyb= 0;
						int findb= 0;
						int[][] showOCLDb= new int[image.getWidth()][image.getHeight()];
						int[][] showORGNb= new int[image.getWidth()][image.getHeight()];
						if(isPcfButton) {
							for(int i= 0; i< image.getHeight(); ++i) {
								for(int j= 0; j< image.getWidth(); ++j) {
									if(isRedButton) {
										if(ccar[j][i]> 0) {
											int x= j;
											int y= i;
											if(cxr== 0&& cyr== 0) {
												cxr= cxr+ x;
												cyr= cyr+ y;
											}
											cxr= cxr+ x;
											cyr= cyr+ y;
											findr= 1;
											showOCLDr[x][y]= 255;
											showORGNr[x][y]= 255;
											cxr= cxr>> 1;
							cyr= cyr>> 1;
									float dx= cxr- x;
									float dy= cyr- y;
									float co= dy/ dx;
									int dis = Math.abs(cxr- x);
									//欧基里德填充
									for(int k= 0; k< dis; k++) {
										if(cxr>= x&& cyr>= y) {
											showOCLDr[x+ k][y+ (int)(k* co)]= 255;	
											expand(showOCLDr, x+ k, y+ (int)(k* co), fact, 1);
										}
										if(cxr< x&& cyr>= y) {
											showOCLDr[x- k][y- (int)(k * co)]= 255;
											expand(showOCLDr, x- k, y- (int)(k* co), fact, 2);
										}
										if(cxr>= x&& cyr< y) {
											showOCLDr[x+ k][y+ (int)(k * co)]= 255;	
											expand(showOCLDr, x+ k, y+ (int)(k* co), fact, 3);
										}
										if(cxr< x&& cyr< y) {
											showOCLDr[x- k][y- (int)(k * co)]= 255;
											expand(showOCLDr, x- k, y- (int)(k* co), fact, 4);
										}
									}
										}
									}
									if(isGreenButton) {
										if(ccag[j][i]> 0) {
											int x= j;
											int y= i;
											if(cxg== 0&& cyg== 0) {
												cxg= cxg+ x;
												cyg= cyg+ y;
											}
											cxg=cxg+ x;
											cyg=cyg+ y;
											findg= 1;
											showOCLDg[x][y]= 255;
											showORGNg[x][y]= 255;
											cxg= cxg>> 1;
										cyg= cyg>> 1;
							float dx= cxg- x;
							float dy= cyg- y;
							float co= dy/ dx;
							int dis= Math.abs(cxg - x);
							//欧基里德填充
							for(int k= 0; k< dis; k++) {
								if(cxg>= x&& cyg>= y) {
									showOCLDg[x+ k][y+ (int)(k* co)]= 255;	
									expand(showOCLDg,x+ k, y+ (int)(k* co), fact, 1);
								}
								if(cxg< x&& cyg>= y) {
									showOCLDg[x- k][y - (int)(k* co)]= 255;
									expand(showOCLDg, x- k, y- (int)(k* co), fact, 2);
								}
								if(cxg>= x&& cyg< y) {
									showOCLDg[x+ k][y+ (int)(k* co)] = 255;	
									expand(showOCLDg, x+ k, y+ (int)(k * co), fact, 3);
								}
								if(cxg< x&& cyg< y) {
									showOCLDg[x- k][y- (int)(k* co)] = 255;
									expand(showOCLDg, x- k, y- (int)(k * co), fact, 4);
								}
							}
										}
									}
									if(isBlueButton) {
										if(ccab[j][i]> 0) {
											int x= j;
											int y= i;
											if(cxb== 0&& cyb== 0) {
												cxb= cxb+ x;
												cyb= cyb+ y;
											}
											cxb= cxb+ x;
											cyb= cyb+ y;
											findb= 1;
											showOCLDb[x][y]= 255;
											showORGNb[x][y]= 255;
											cxb= cxb>> 1;
								cyb= cyb>> 1;
														float dx= cxb- x;
														float dy= cyb- y;
														float co= dy/ dx;
														int dis= Math.abs(cxb- x);
														//欧基里德填充
														for(int k= 0; k< dis; k++) {
															if(cxb>= x && cyb>= y) {
																showOCLDb[x+ k][y+ (int)(k* co)]= 255;	
																expand(showOCLDb, x+ k, y+ (int)(k* co), fact, 1);
															}
															if(cxb< x && cyb>= y) {
																showOCLDb[x- k][y- (int)(k* co)]= 255;
																expand(showOCLDb, x- k, y- (int)(k* co), fact, 2);
															}
															if(cxb>= x&& cyb< y) {
																showOCLDb[x+ k][y+ (int)(k* co)]= 255;	
																expand(showOCLDb, x+ k, y + (int)(k* co), fact, 3);
															}
															if(cxb< x&& cyb< y) {
																showOCLDb[x- k][y- (int)(k* co)]= 255;
																expand(showOCLDb, x- k, y- (int)(k* co), fact, 4);
															}
														}
										}
									}
								}
							}
						}else {
							showOCLDr= ccar;
							showORGNr= ccar;

							showOCLDg= ccag;
							showORGNg= ccag;

							showOCLDb= ccab;
							showORGNb= ccab;
						}
						if(this.isbt62Stop) {
							rp= new imageProcessor.Emboss().Processor(rp);
							gp= new imageProcessor.Emboss().Processor(gp);
							bp= new imageProcessor.Emboss().Processor(bp);
						}
						if(this.isbt43Stop) {
							rp= new imageProcessor.Guassian().Processor1D(rp, 3, 3, 1.66);
							gp= new imageProcessor.Guassian().Processor1D(gp, 3, 3, 1.66);
							bp= new imageProcessor.Guassian().Processor1D(bp, 3, 3, 1.66);
						}
						if(this.isbt41Stop) {
							rp= new imageProcessor.Laplacian().Processor(rp);
							gp= new imageProcessor.Laplacian().Processor(gp);
							bp= new imageProcessor.Laplacian().Processor(bp);
						}

						for (int i= 0; i< image.getHeight(); ++i) {
							for (int j= 0; j< image.getWidth(); ++j) {	
								int pixel= (rp[j][i]<< 16)| (gp[j][i]<< 8)| (bp[j][i]) ;
								if(showOCLDr[j][i]== 255) {
									if(r2r[j][i]> 30) {
										pixel= (r2r[j][i]<< 16) ;
									}
								}
								if(showOCLDg[j][i]== 255) {
									if(r2g[j][i]> 30) {
										pixel= pixel| (r2g[j][i]<< 8) ;
									}
								}

								if(showOCLDb[j][i] == 255) {
									if(r2b[j][i]> 30) {
										pixel= pixel| r2b[j][i]  ;
									}
								}
								image.setRGB(j, i, pixel);
							}
						}
						if(!recordStop) {
							if(imageList.size()< 32*60*60) {
								System.out.println(1);
								int width= image.getWidth();
								int height= image.getHeight();
								int[][] flips= new int[width][height];
								for(int i= 0; i< image.getHeight(); ++i) {
									for(int j= 0; j< image.getWidth(); ++j) {
										flips[j][i]= image.getRGB(j, i);
									}
								}
								imageList.add(flips);
							}
						}
						g.drawImage(image, 0, 0, 900, 680, this);// 绘出图形文件
						imageForOutput= image;
						if(findr== 2) {
							if(readEnglish.finish== 1) {
								readEnglish= new ReadEnglish();
								readEnglish.setPreReadText("attension please");
								readEnglish.start();
							}
							//write
							Date d= new Date();
							newtime= "" + d.getDay() + d.getHours() + d.getMinutes();
							newmi= d.getTime();
							long v= Math.abs(newmi- mi);
							if(newtime.equalsIgnoreCase(time)&& v> 3000){
								File outputBin= new File("C:\\Users\\Administrator\\Desktop\\monit\\rec"
										+ newtime+ newmi+ ".jpg");
								ImageIO.write(image, "png", outputBin);	
								mi= newmi;
							}
							time= newtime.toString();
						}	
					}
					q+= 1;
					if(q>= encry_c) {
						q= 0;
					}
					q_new+= 1;
					if(q_new>= encry_c_new) {
						q_new= 0;
					}
					q_fs+= 1;
					if(q_fs>= encry_c_fs) {
						q_fs= 0;
					}
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

		private void expand(int[][] show, int i, int j, int fac, int k) {
			if(k== 1) {
				for(int v= 0; v< fac; v++) {
					for(int h= 0; h< fac; h++) {
						if(i+ v>= 0 && i+ v< show.length&& h+ j>= 0&& h+ j< show[0].length) {
							show[i+ v][h+ j]= 255;
						}
					}
				}
			}
			if(k== 2) {
				for(int v= -fac; v< 0; v++) {
					for(int h= 0; h< fac; h++) {
						if(i+ v>= 0&& i+ v< show.length&& h+ j>= 0&& h+ j< show[0].length) {
							show[i+ v][h+ j]= 255;
						}
					}
				}
			}
			if(k== 3) {
				for(int v= 0; v< fac; v++) {
					for(int h= -fac; h< 0; h++) {
						if(i+ v>= 0&& i+ v< show.length&& h+ j>= 0&& h+ j< show[0].length) {
							show[i+v][h+j]=255;
						}
					}
				}
			}
			if(k== 4) {
				for(int v= -fac; v< 0; v++) {
					for(int h= -fac; h< 0; h++) {
						if(i+ v>= 0 && i+ v< show.length&& h+ j>= 0&& h+ j< show[0].length) {
							show[i+ v][h+ j]=255;
						}
					}
				}
			}
		}
		private int[][] findDiff(int[][] out, int[][] out_old) {
			int[][] diff= new int[out.length][out[0].length];
			if(out_old!= null) {
				for (int i= 0; i< diff[0].length; ++i) {
					for (int j= 0; j< diff.length; ++j) {
						if(out[j][i]!= out_old[j][i]) {
							diff[j][i]= out[j][i];
						}
						out_old[j][i]= out[j][i];
					}
				}
			}else {
				diff= out;
			}	
			return diff;
		}

		private int getMskFilter(int[][] fb, int[][] msk, int i, int j, int size, Map<String, Integer> map) {
			if(fb[j][i]!= 255) {
				return size;
			}
			if(msk[j][i]== 1) {
				return size;
			}
			if(size> 3000) {
				return size;
			}
			size++;
			map.put(j+ ","+ i, 1);
			msk[j][i]= 1 ;
			if(i+ 1< fb[0].length) {
				size= getMskFilter(fb, msk, i+1, j, size, map);
			}
			if(i- 1 >= 0) {
				size = getMskFilter(fb, msk, i- 1, j, size, map);
			}
			if(j+ 1 < fb.length) {
				size= getMskFilter(fb, msk, i, j+ 1, size, map);
			}
			if(j- 1>= 0) {
				size= getMskFilter(fb, msk, i, j- 1, size, map);
			}	
			return size; 
		}

		public ArrayList<Cordination> findCordination() {
			ArrayList<Cordination> clist= new ArrayList<Cordination>();
			BufferedImage difTemp= (BufferedImage) difImage;
			int h= difTemp.getHeight();
			int w= difTemp.getWidth();
			gdif= new int[h][w];
			int cp= -16777216;
			// 得到map
			for(int i= 0; i< h; i++) {
				for(int j= 0; j< w; j++) {
					if(difTemp.getRGB(j, i)!= cp) {
						gdif[i][j]= 1;
					}
				}
			}
			// 计算边缘
			Cordination c= new Cordination();
			c.h0= 999999;
			c.w0= 999999;
			c.h1= 0;
			c.w1= 0;
			for(int i= 0; i< h; i++) {
				for(int j= 0; j< w; j++) {
					if (gdif[i][j]== 1) {
						if (c.h0> i) {
							c.h0= i;
						}
						if (c.w0> j) {
							c.w0= j;
						}
						if (c.h1< i) {
							c.h1= i;
						}
						if (c.w1< i) {
							c.w1= i;
						}
					}
				}
			}
			clist.add(c);
			return clist;
		}
}