package thread;
import java.awt.Color;
import java.awt.Container;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JSlider;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.tinos.engine.analysis.Analyzer;
import cap.Monitor;
import comp.filenameFilter.TXTFilter;
import comp.jbutton.DetaButton;
import sample.AppBoot;
import vedio.PlayerControl;
import vedio.PlayerShow;
public class MakeContainerZNXZ extends Thread implements Runnable{
	public Container jpanelThird;
	public AppBoot u;
	public JTabbedPane jTabbedpane;
	public String[] tabNames;
	public Analyzer analyzer;
	public Thread thread;
	public Map<String, String> pos;
	public Map<String, String> pose;
	public Map<String, String> etc;
	public Map<String, String> cte;
	public MakeContainerZNXZ(Analyzer analyzer, Container jpanelThird, AppBoot u2
			, JTabbedPane jTabbedpane, String[] tabNames, Map<String, String> pos
			, Map<String, String> pose, Map<String, String> etc, Map<String, String> cte) {
		super();
		this.jpanelThird= jpanelThird;
		this.u= u2;
		this.tabNames= tabNames;
		this.jTabbedpane= jTabbedpane;
		this.analyzer= analyzer;
		this.pos= pos;
		this.pose= pose;
		this.etc= etc;
		this.cte= cte;	
	}
	public void run(){ 
		try {
			jTabbedpane.validate();
			Thread.sleep(1000*65);
			jpanelThird.setLayout(null);
			jpanelThird.setBounds(0, 0, 1490, 980);	
			u.m = new Monitor();
			u.m.setVisible(true);
			u.m.init();
			u.m.sliderx = new JSlider(0,360);
			u.m.sliderx.setSnapToTicks(true);
			u.m.sliderx.setPaintTicks(true);
			u.m.sliderx.setMajorTickSpacing(5);
			u.m.sliderx.setMinorTickSpacing(1);
			u.m.sliderx.setBackground(Color.black);
			u.m.sliderx.setForeground(Color.white);
			u.m.sliderx.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							u.m.facx = source.getValue();  
						}
					});  

			u.m.slidery = new JSlider(0,360);
			u.m.slidery.setSnapToTicks(true);
			u.m.slidery.setPaintTicks(true);
			u.m.slidery.setMajorTickSpacing(5);
			u.m.slidery.setMinorTickSpacing(1);
			u.m.slidery.setBackground(Color.black);
			u.m.slidery.setForeground(Color.white);
			u.m.slidery.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							u.m.facy = source.getValue();  
						}
					});  

			u.m.sliderz = new JSlider(0,360);
			u.m.sliderz.setSnapToTicks(true);
			u.m.sliderz.setPaintTicks(true);
			u.m.sliderz.setMajorTickSpacing(5);
			u.m.sliderz.setMinorTickSpacing(1);
			u.m.sliderz.setBackground(Color.black);
			u.m.sliderz.setForeground(Color.white);
			u.m.sliderz.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							u.m.facz = source.getValue(); 
						}
					});  
			u.m.slidert = new JSlider(0,10);
			u.m.slidert.setSnapToTicks(true);
			u.m.slidert.setPaintTicks(true);
			u.m.slidert.setMajorTickSpacing(5);
			u.m.slidert.setMinorTickSpacing(1);
			u.m.slidert.setBackground(Color.black);
			u.m.slidert.setForeground(Color.white);
			u.m.slidert.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							u.m.fact = source.getValue();  
						}
					});  
			u.m.sliderl = new JSlider(0,360);
			u.m.sliderl.setSnapToTicks(true);
			u.m.sliderl.setPaintTicks(true);
			u.m.sliderl.setMajorTickSpacing(5);
			u.m.sliderl.setMinorTickSpacing(1);
			u.m.sliderl.setBackground(Color.black);
			u.m.sliderl.setForeground(Color.white);
			u.m.sliderl.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							u.m.facl = source.getValue();  
						}
					});  

			u.m.bt00 = new DetaButton ("初始化重置",100,50, Color.red);
			u.m.bt00.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							u.m.isRedButton = false;
							u.m.isGreenButton = false;
							u.m.isBlueButton = false;
							u.m.isStreButton = false;
							u.m.isSblButton = false;
							u.m.isRcaButton = false;
							u.m.isPcaButton = false;
							u.m.isPcfButton = false;	
							u.m.isStop = false;	
							u.m.recordStop = true;	
							u.m.imageList.clear();	
							u.m.bt01.setLabel("红色光谱关");
							u.m.bt02.setLabel("绿色光谱关");
							u.m.bt03.setLabel("蓝色光谱关");
							u.m.bt10.setLabel("锐化拉伸关");
							u.m.bt11.setLabel("纹理检测关");
							u.m.bt12.setLabel("熵增过滤关");
							u.m.bt13.setLabel("成份分析关");
							u.m.bt20.setLabel("成份过滤关");
							u.m.bt20.setLabel("暂停视屏关");
							u.m.bt31.setLabel("开始录制流");
							u.m.facx=7;
							u.m.facy=100;
							u.m.facz=0;
							u.m.fact=0;
							u.m.facl=3;
							u.m.facr=0;
							u.m.facg=0;
							u.m.facb=0;
						}
					});

			u.m.bt01= new DetaButton ("红色光谱关",100,50, Color.red);
			u.m.bt01.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isRedButton==false) {
								u.m.isRedButton=true;
								u.m.bt01.setLabel("红色光谱开");
							}else {
								u.m.isRedButton=false;
								u.m.bt01.setLabel("红色光谱关");
							}
						}
					});

			u.m.bt02= new DetaButton ("绿色光谱关",100,50, Color.green);
			u.m.bt02.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isGreenButton==false) {
								u.m.isGreenButton=true;
								u.m.bt02.setLabel("绿色光谱开");
							}else {
								u.m.isGreenButton=false;
								u.m.bt02.setLabel("绿色光谱关");
							}
						}
					});

			u.m.bt03= new DetaButton ("蓝色光谱关",100,50, Color.blue);
			u.m.bt03.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isBlueButton==false) {
								u.m.isBlueButton=true;
								u.m.bt03.setLabel("蓝色光谱开");
							}else {
								u.m.isBlueButton=false;
								u.m.bt03.setLabel("蓝色光谱关");
							}
						}
					});

			u.m.bt10= new DetaButton ("锐化拉伸关",100,50, Color.magenta);
			u.m.bt10.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isStreButton==false) {
								u.m.isStreButton=true;
								u.m.bt10.setLabel("锐化拉伸开");
							}else {
								u.m.isStreButton=false;
								u.m.bt10.setLabel("锐化拉伸关");
							}
						}
					});

			u.m.bt11= new DetaButton ("纹理检测关",100,50, Color.pink);
			u.m.bt11.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isSblButton==false) {
								u.m.isSblButton=true;
								u.m.bt11.setLabel("纹理检测开");
							}else {
								u.m.isSblButton=false;
								u.m.bt11.setLabel("纹理检测关");
							}
						}
					});

			u.m.bt12= new DetaButton ("熵增过滤关",100,50, Color.pink);
			u.m.bt12.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isRcaButton==false) {
								u.m.isRcaButton=true;
								u.m.bt12.setLabel("熵增过滤开");
							}else {
								u.m.isRcaButton=false;
								u.m.bt12.setLabel("熵增过滤关");
							}
						}
					});

			u.m.bt13= new DetaButton ("成份分析关",100,50, Color.pink);
			u.m.bt13.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isPcaButton==false) {
								u.m.isPcaButton=true;
								u.m.bt13.setLabel("成份分析开");
							}else {
								u.m.isPcaButton=false;
								u.m.bt13.setLabel("成份分析关");
							}
						}
					});

			u.m.bt20= new DetaButton ("成份过滤关",100,50, Color.pink);
			u.m.bt20.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isPcfButton==false) {
								u.m.isPcfButton=true;
								u.m.bt20.setLabel("成份过滤开");
							}else {
								u.m.isPcfButton=false;
								u.m.bt20.setLabel("成份过滤关");
							}
						}
					});

			u.m.bt21= new DetaButton ("动态裁剪面",100,50, Color.pink);
			u.m.bt21.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt22= new DetaButton ("暂停视屏关",100,50, Color.pink);
			u.m.bt22.addActionListener(
					new ActionListener(){
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isStop == false) {
								u.m.isStop = true;
								u.m.bt22.setLabel("暂停视屏开");
							}else {
								u.m.isStop = false;
								u.m.bt22.setLabel("暂停视屏关");
							}
						}
					});

			u.m.bt23= new DetaButton ("保存该图片",100,50, Color.pink);
			u.m.bt23.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							//获取图片
							//弹出保存框
							if(null== u.m.imageForOutput) {
								return;
							}
							//get path
							FileDialog filedialog= new FileDialog(new Frame(), "导入到这里", FileDialog.LOAD);
							filedialog.setFilenameFilter(new TXTFilter("png"));
							filedialog.setVisible(true);
							String filepath= filedialog.getDirectory() + filedialog.getFile();
							System.out.println(filepath);
							try {
								File outputBin = new File(filepath+ ".png");
								if(null== u.m.imageForOutput) {
									return;
								}
								ImageIO.write(u.m.imageForOutput, "png", outputBin);	
							} catch (IOException writePngError) {
								System.out.println(filepath);
							}	
							//输出图片
						}
					});

			u.m.bt30= new DetaButton ("录制配置项",100,50, Color.pink);
			u.m.bt30.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt31= new DetaButton ("开始录制流",100,50, Color.pink);
			u.m.bt31.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.recordStop == true) {
								u.m.recordStop = false;
								u.m.bt31.setLabel("暂停录制流");
							}else {
								u.m.recordStop = true;
								u.m.bt31.setLabel("开始录制流");
							}
						}
					});

			u.m.bt32 = new DetaButton ("保存视屏流",100,50, Color.pink);
			u.m.bt32.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							if(u.m.imageList.size()<= 0|| !u.m.recordStop) {
								return;
							}
							FileDialog filedialog= new FileDialog(new Frame(), "导入到这里", FileDialog.LOAD);
							filedialog.setFilenameFilter(new TXTFilter("lyg"));
							filedialog.setVisible(true);
							String filepath= filedialog.getDirectory() + filedialog.getFile();
							System.out.println(filepath);
							File outputBin= new File(filepath+ ".lyg");
							Iterator<int[][]> iterator= u.m.imageList.iterator();
							try {
								FileOutputStream wr= new FileOutputStream(outputBin);
								//写头， 宽，长
								if(iterator.hasNext()) {
									int[][] bufferedImage= iterator.next(); 
									int width= bufferedImage.length;
									int height= bufferedImage[0].length;
									int flips= u.m.imageList.size();
									byte[] flipBytes= new byte[height* width* 4];
									
									byte[] widthBytes= new byte[4];
									widthBytes[0]=(byte)(width&0xff);
									widthBytes[1]=(byte)(width>>8&0xff);
									widthBytes[2]=(byte)(width>>16&0xff);
									widthBytes[3]=(byte)(width>>24&0xff);
									wr.write(widthBytes);
									
									byte[] heightBytes= new byte[4];
									heightBytes[0]=(byte)(height&0xff);
									heightBytes[1]=(byte)(height>>8&0xff);
									heightBytes[2]=(byte)(height>>16&0xff);
									heightBytes[3]=(byte)(height>>24&0xff);
									wr.write(heightBytes);
									
									byte[] flipsBytes= new byte[4];
									flipsBytes[0]=(byte)(flips&0xff);
									flipsBytes[1]=(byte)(flips>>8&0xff);
									flipsBytes[2]=(byte)(flips>>16&0xff);
									flipsBytes[3]=(byte)(flips>>24&0xff);
									wr.write(flipsBytes);
									//写头桢
									for(int i= 0; i< height; i++){
										for(int j= 0; j< width; j++){
											int pix= bufferedImage[j][i];	
											flipBytes[i* (width* 4)+ j* 4+ 0]= (byte)(pix    &0xff);
											flipBytes[i* (width* 4)+ j* 4+ 1]= (byte)(pix>>8 &0xff);
											flipBytes[i* (width* 4)+ j* 4+ 2]= (byte)(pix>>16&0xff);
											flipBytes[i* (width* 4)+ j* 4+ 3]= (byte)(pix>>24&0xff);
											
										}
									}
									wr.write(flipBytes);
									wr.flush();
									//写身体
									while(iterator.hasNext()) {
										//写身体每一帧
										int[][] flipImage= iterator.next(); 
										for(int i= 0; i< height; i++){
											for(int j= 0; j< width; j++){
												int pix= flipImage[j][i];	
												//byte[] flip=new byte[4];
												flipBytes[i* (width* 4)+ j* 4+ 0]= (byte)(pix    &0xff);
												flipBytes[i* (width* 4)+ j* 4+ 1]= (byte)(pix>>8 &0xff);
												flipBytes[i* (width* 4)+ j* 4+ 2]= (byte)(pix>>16&0xff);
												flipBytes[i* (width* 4)+ j* 4+ 3]= (byte)(pix>>24&0xff);
											}
										}
										wr.write(flipBytes);
										wr.flush();
									}
								}
								wr.close();
								u.m.imageList.clear();
							} catch (FileNotFoundException e1) {
								e1.printStackTrace();
							} catch (IOException e1) {
								e1.printStackTrace();
							}
						}
					});

			u.m.bt33= new DetaButton ("读取录制流",100,50, Color.pink);
			u.m.bt33.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							FileDialog filedialog= new FileDialog(new Frame(), "读取lyg 视频文件", FileDialog.LOAD);
							filedialog.setFilenameFilter(new TXTFilter("lyg"));
							filedialog.setVisible(true);
							String filepath= filedialog.getDirectory() + filedialog.getFile();
							System.out.println(filepath);
							File inputBin= new File(filepath);
							//读取头
							//ArrayList<BufferedImage> arrayList=new ArrayList<>();
							//读取宽
							try {
								@SuppressWarnings("resource")
								RandomAccessFile randomAccessFile= new RandomAccessFile(inputBin, "r");
								byte[] width= new byte[4];
								int w3= 0;
								int w2= 0;
								int w1= 0;
								int w0= 0;
								if (randomAccessFile.read(width) != 0) {  
									//bytes to int
									w3= (int)width[3]<<24 &0xff000000;
									w2= (int)width[2]<<16&0x00ff0000;
									w1= (int)width[1]<<8&0x0000ff00;
									w0= (int)width[0]&0x000000ff;
								}
								final int widthInt=  w3|w2|w1|w0;
								//读取长
								byte[] height= new byte[4];
								int h3= 0;
								int h2= 0;
								int h1= 0;
								int h0= 0;
								if (randomAccessFile.read(height) != 0) {  
									//bytes to int
									h3= (int)height[3]<<24 &0xff000000;
									h2= (int)height[2]<<16 &0x00ff0000;
									h1= (int)height[1]<<8 &0x0000ff00;
									h0= (int)height[0] &0x000000ff;

								}
								final int heightInt= h3|h2|h1|h0;
								//读取帧数
								byte[] flips= new byte[4];
								int f3= 0;
								int f2= 0;
								int f1= 0;
								int f0= 0;
								if (randomAccessFile.read(flips) != 0) {  
									//bytes to int
									f3= (int)flips[3]<<24 &0xff000000;
									f2= (int)flips[2]<<16 &0x00ff0000;
									f1= (int)flips[1]<<8 &0x0000ff00;
									f0= (int)flips[0] &0x000000ff;
								}	
								final int flipsInt= f3|f2|f1|f0;
								//初始桢
								Map<Integer, BufferedImage> flipImage= new HashMap<>();
								for(int i= 0; i< flipsInt; i++) {
									byte[] filp= new byte[widthInt* heightInt* 4];
									try {
										if (randomAccessFile.read(filp)!= 0) {  
											//filp to image
											BufferedImage image= new BufferedImage(widthInt, heightInt, BufferedImage.TYPE_INT_RGB);
											for(int h= 0; h< heightInt; h++) {
												for(int w= 0; w< widthInt; w++) {
													int p3= (int)filp[h* (widthInt* 4)+ w* 4+ 3]<< 24& 0xff000000;
													int p2= (int)filp[h* (widthInt* 4)+ w* 4+ 2]<< 16& 0x00ff0000;
													int p1= (int)filp[h* (widthInt* 4)+ w* 4+ 1]<< 8 & 0x0000ff00;
													int p0= (int)filp[h* (widthInt* 4)+ w* 4+ 0]     & 0x000000ff;
													int pix= p3|p2|p1|p0;
													image.setRGB(w, h, pix);
												}
											}												
											flipImage.put(i, image);
										}
									} catch (IOException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
								}
								int[] control= new int[8];
								control[5]= flipImage.size();
								PlayerControl playerControl= new PlayerControl(control, flipImage);
								playerControl.run();
								PlayerShow playerShow= new PlayerShow(playerControl, widthInt
										, heightInt, flipImage, control);
								playerShow.start();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}

					});

			u.m.bt43 = new DetaButton ("高斯谱分析",100,50, Color.pink);
			u.m.bt43.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt43Stop== false) {
								u.m.isbt43Stop= true;
								u.m.bt43.setLabel("高斯谱开启");
							}else {
								u.m.isbt43Stop= false;
								u.m.bt43.setLabel("高斯谱关闭");
							}
						}
					});

			u.m.bt42= new DetaButton ("巴特沃斯流",100,50, Color.pink);
			u.m.bt42.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt41= new DetaButton ("拉普拉斯流",100,50, Color.pink);
			u.m.bt41.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt41Stop== false) {
								u.m.isbt41Stop= true;
								u.m.bt41.setLabel("拉普拉斯开");
							}else {
								u.m.isbt41Stop= false;
								u.m.bt41.setLabel("拉普拉斯关");
							}
						}
					});

			u.m.bt40= new DetaButton ("线性傅里叶",100,50, Color.pink);
			u.m.bt40.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt50= new DetaButton ("欧基里德流",100,50, Color.pink);
			u.m.bt50.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt51= new DetaButton ("皮脂层透显",100,50, Color.pink);
			u.m.bt51.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt52= new DetaButton ("肝像色处理",100,50, Color.pink);
			u.m.bt52.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt52Stop== false) {
								u.m.isbt52Stop= true;
								u.m.bt52.setLabel("肝相视屏开");
								u.m.facr=130;
								u.m.facg=110;
								u.m.facb=160;
							}else {
								u.m.isbt52Stop= false;
								u.m.bt52.setLabel("肝相视屏关");
								u.m.facr=0;
								u.m.facg=0;
								u.m.facb=0;
							}
						}
					});

			u.m.bt53= new DetaButton ("心相视屏关",100,50, Color.pink);
			u.m.bt53.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt53Stop== false) {
								u.m.isbt53Stop= true;
								u.m.bt53.setLabel("心相视屏开");
							}else {
								u.m.isbt53Stop= false;
								u.m.bt53.setLabel("心相视屏关");
							}
						}
					});

			u.m.bt60 = new DetaButton ("肾相色处理",100,50, Color.pink);
			u.m.bt60.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt60Stop== false) {
								u.m.isbt60Stop= true;
								u.m.bt60.setLabel("肾相视屏开");
								u.m.facr=146;
								u.m.facg=126;
								u.m.facb=126;
							}else {
								u.m.isbt60Stop= false;
								u.m.bt60.setLabel("肾相视屏关");
								u.m.facr=0;
								u.m.facg=0;
								u.m.facb=0;
							}
						}
					});

			u.m.bt61 = new DetaButton ("伤口炎症状",100,50, Color.pink);
			u.m.bt61.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});


			u.m.bt1 = new DetaButton ("主要成份",100,50, Color.pink);
			u.m.bt1.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt62 = new DetaButton ("因博思关闭",100,50, Color.pink);
			u.m.bt62.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt62Stop== false) {
								u.m.isbt62Stop= true;
								u.m.bt62.setLabel("因博思开启");
							}else {
								u.m.isbt62Stop= false;
								u.m.bt62.setLabel("因博思关闭");
							}
						}
					});

			u.m.bt63 = new DetaButton ("鼻相色分析",100,50, Color.pink);
			u.m.bt63.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt70 = new DetaButton ("眼相色分析",100,50, Color.pink);
			u.m.bt70.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt71 = new DetaButton ("耳相色分析",100,50, Color.pink);
			u.m.bt71.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});


			u.m.bt72 = new DetaButton ("唇相色分析",100,50, Color.pink);
			u.m.bt72.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt73= new DetaButton ("白舌相色关",100,50, Color.white);
			u.m.bt73.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt73Stop== false) {
								u.m.isbt73Stop= true;
								u.m.bt73.setLabel("白舌相色开");
								u.m.facr=145;
								u.m.facg=115;
								u.m.facb=95;
							}else {
								u.m.isbt73Stop= false;
								u.m.bt73.setLabel("白舌相色关");
								u.m.facr=0;
								u.m.facg=0;
								u.m.facb=0;
							}
						}
					});

			u.m.bt80 = new DetaButton("青舌相色关",100,50, Color.blue);
			u.m.bt80.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt80Stop== false) {
								u.m.isbt80Stop= true;
								u.m.bt80.setLabel("青舌相色开");
								u.m.facr=205;
								u.m.facg=125;
								u.m.facb=140;
							}else {
								u.m.isbt80Stop= false;
								u.m.bt80.setLabel("青舌相色关");
								u.m.facr=0;
								u.m.facg=0;
								u.m.facb=0;
							}
						}
					});
			
			u.m.bt81 = new DetaButton ("紫舌相色关",100,50, Color.magenta);
			u.m.bt81.addActionListener( 
					new ActionListener()  {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt81Stop== false) {
								u.m.isbt81Stop= true;
								u.m.bt81.setLabel("紫舌相色开");
								u.m.facr=140;
								u.m.facg=200;
								u.m.facb=135;
							}else {
								u.m.isbt81Stop= false;
								u.m.bt81.setLabel("紫舌相色关");
								u.m.facr=0;
								u.m.facg=0;
								u.m.facb=0;
							}
						}
					});
			
			
			u.m.bt82= new DetaButton ("黄舌相色关",100,50, Color.yellow);
			u.m.bt82.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt82Stop== false) {
								u.m.isbt82Stop= true;
								u.m.bt82.setLabel("黄舌相色开");
								u.m.facr= 160;
								u.m.facg= 110;
								u.m.facb= 160;
							}else {
								u.m.isbt82Stop= false;
								u.m.bt82.setLabel("黄舌相色关");
								u.m.facr= 0;
								u.m.facg= 0;
								u.m.facb= 0;
							}
						}
					});
			
			u.m.bt83= new DetaButton ("红舌相色关",100,50, Color.red);
			u.m.bt83.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt83Stop== false) {
								u.m.isbt83Stop= true;
								u.m.bt83.setLabel("红舌相色开");
								u.m.facr= 100;
								u.m.facg= 125;
								u.m.facb= 135;
							}else {
								u.m.isbt83Stop= false;
								u.m.bt83.setLabel("红舌相色关");
								u.m.facr= 0;
								u.m.facg= 0;
								u.m.facb= 0;
							}
						}
					});

			u.m.bt84= new DetaButton ("上传视频项",100,50, Color.pink);
			u.m.bt84.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			u.m.bt85= new DetaButton ("上传声频项",100,50, Color.pink);
			u.m.bt85.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			u.m.bt86= new DetaButton ("上传图片项",100,50, Color.pink);
			u.m.bt86.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			u.m.bt87= new DetaButton ("上传文档项",100,50, Color.pink);
			u.m.bt87.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			u.m.bt88= new DetaButton ("识别眼睛关",100,50, Color.pink);
			u.m.bt88.addActionListener( 
					new ActionListener() {    
						@SuppressWarnings("deprecation")
						public void actionPerformed(ActionEvent e){
							if(u.m.isbt88Stop== false) {
								u.m.isbt88Stop= true;
								u.m.bt88.setLabel("识别眼睛开");
							}else {
								u.m.isbt88Stop= false;
								u.m.bt88.setLabel("识别眼睛关");
							}
						}
					});
			
			u.m.bt89= new DetaButton ("识别鼻子关",100,50, Color.pink);
			u.m.bt89.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			
			u.m.bt90= new DetaButton ("识别五官关",100,50, Color.pink);
			u.m.bt90.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			u.m.bt91= new DetaButton ("识别嘴巴关",100,50, Color.pink);
			u.m.bt91.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							
						}
					});
			
			u.m.bt92= new DetaButton ("播放多媒体",100,50, Color.orange);
			u.m.bt92.addActionListener( 
					new ActionListener() {    
						public void actionPerformed(ActionEvent e){
							FileDialog filedialog= new FileDialog(new Frame(), "播放多媒体", FileDialog.LOAD);
						//	filedialog.setFilenameFilter(new TXTFilter("lyg"));
							filedialog.setVisible(true);
							String filepath= filedialog.getDirectory() + filedialog.getFile();
							System.out.println(filepath);
						//	File inputBin= new File(filepath);
							//
							try {
								Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+filepath);
							} catch (IOException e1) {	
								jTabbedpane.validate();
							}
						}
					});
			
			
			
			u.m.bt2 = new DetaButton ("线性成份",100,50, Color.pink);
			u.m.bt2.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt3= new DetaButton ("独立成份",100,50, Color.pink);
			u.m.bt3.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt4= new DetaButton ("特征成份",100,50, Color.pink);
			u.m.bt4.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.bt5 = new DetaButton ("向量成份",100,50, Color.pink);
			u.m.bt5.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});


			u.m.btr = new DetaButton ("荧光谱红",100,50, Color.red);
			u.m.btr.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.btg = new DetaButton ("荧光谱绿",100,50, Color.green);
			u.m.btg.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.btb = new DetaButton ("荧光谱蓝",100,50, Color.blue);
			u.m.btb.addActionListener( 
					new ActionListener()  {    
						public void actionPerformed(ActionEvent e){
						}
					});

			u.m.sliderr = new JSlider(0,255);
			u.m.sliderr.setSnapToTicks(true);
			u.m.sliderr.setPaintTicks(true);
			u.m.sliderr.setMajorTickSpacing(5);
			u.m.sliderr.setMinorTickSpacing(0);
			u.m.sliderr.setBackground(Color.black);
			u.m.sliderr.setForeground(Color.red);
			u.m.sliderr.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							u.m.facr = source.getValue();  
							System.out.println(u.m.facr);
						}
					});

			u.m.sliderg = new JSlider(0,255);
			u.m.sliderg.setSnapToTicks(true);
			u.m.sliderg.setPaintTicks(true);
			u.m.sliderg.setMajorTickSpacing(5);
			u.m.sliderg.setMinorTickSpacing(0);
			u.m.sliderg.setBackground(Color.black);
			u.m.sliderg.setForeground(Color.green);
			u.m.sliderg.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							u.m.facg = source.getValue();  
							System.out.println(u.m.facg);
						}
					});

			u.m.sliderb = new JSlider(0,255);
			u.m.sliderb.setSnapToTicks(true);
			u.m.sliderb.setPaintTicks(true);
			u.m.sliderb.setMajorTickSpacing(5);
			u.m.sliderb.setMinorTickSpacing(0);
			u.m.sliderb.setBackground(Color.black);
			u.m.sliderb.setForeground(Color.blue);
			u.m.sliderb.addChangeListener( 
					new ChangeListener() {
						public void stateChanged(ChangeEvent event)  {    
							JSlider source = (JSlider) event.getSource();  
							u.m.facb = source.getValue();  
							System.out.println(u.m.facb);
						}
					});  
			u.m.br.add(u.m.btr);
			u.m.br.add(u.m.sliderr);
			u.m.sliderBox.add(u.m.br);

			u.m.bg.add(u.m.btg);
			u.m.bg.add(u.m.sliderg);
			u.m.sliderBox.add(u.m.bg);

			u.m.bb.add(u.m.btb);
			u.m.bb.add(u.m.sliderb);
			u.m.sliderBox.add(u.m.bb);

			u.m.b1.add(u.m.bt1);
			u.m.b1.add(u.m.sliderx);
			u.m.sliderBox.add(u.m.b1);

			u.m.b2.add(u.m.bt2);
			u.m.b2.add(u.m.slidery);
			u.m.sliderBox.add(u.m.b2);

			u.m.b3.add(u.m.bt3);
			u.m.b3.add(u.m.sliderz);
			u.m.sliderBox.add(u.m.b3);

			u.m.b4.add(u.m.bt4);
			u.m.b4.add(u.m.slidert);
			u.m.sliderBox.add(u.m.b4);

			u.m.b5.add(u.m.bt5);
			u.m.b5.add(u.m.sliderl);
			u.m.sliderBox.add(u.m.b5);

			u.m.buttonBox0.add(u.m.bt00);
			u.m.buttonBox0.add(u.m.bt01);
			u.m.buttonBox0.add(u.m.bt02);
			u.m.buttonBox0.add(u.m.bt03);
			u.m.sliderBox.add(u.m.buttonBox0);

			u.m.buttonBox1.add(u.m.bt10);
			u.m.buttonBox1.add(u.m.bt11);
			u.m.buttonBox1.add(u.m.bt12);
			u.m.buttonBox1.add(u.m.bt13);
			u.m.sliderBox.add(u.m.buttonBox1);

			u.m.buttonBox2.add(u.m.bt20);
			u.m.buttonBox2.add(u.m.bt21);
			u.m.buttonBox2.add(u.m.bt22);
			u.m.buttonBox2.add(u.m.bt23);
			u.m.sliderBox.add(u.m.buttonBox2);

			u.m.buttonBox3.add(u.m.bt30);
			u.m.buttonBox3.add(u.m.bt31);
			u.m.buttonBox3.add(u.m.bt32);
			u.m.buttonBox3.add(u.m.bt33);
			u.m.sliderBox.add(u.m.buttonBox3);

			u.m.buttonBox4.add(u.m.bt40);
			u.m.buttonBox4.add(u.m.bt41);
			u.m.buttonBox4.add(u.m.bt42);
			u.m.buttonBox4.add(u.m.bt43);
			u.m.sliderBox.add(u.m.buttonBox4);

			u.m.buttonBox5.add(u.m.bt50);
			u.m.buttonBox5.add(u.m.bt51);
			u.m.buttonBox5.add(u.m.bt52);
			u.m.buttonBox5.add(u.m.bt53);
			u.m.sliderBox.add(u.m.buttonBox5);

			u.m.buttonBox6.add(u.m.bt60);
			u.m.buttonBox6.add(u.m.bt61);
			u.m.buttonBox6.add(u.m.bt62);
			u.m.buttonBox6.add(u.m.bt63);
			u.m.sliderBox.add(u.m.buttonBox6);

			u.m.buttonBox7.add(u.m.bt70);
			u.m.buttonBox7.add(u.m.bt71);
			u.m.buttonBox7.add(u.m.bt72);
			u.m.buttonBox7.add(u.m.bt73);
			u.m.sliderBox.add(u.m.buttonBox7);
			
			u.m.buttonBox8.add(u.m.bt80);
			u.m.buttonBox8.add(u.m.bt81);
			u.m.buttonBox8.add(u.m.bt82);
			u.m.buttonBox8.add(u.m.bt83);
			u.m.sliderBox.add(u.m.buttonBox8);
			
			u.m.buttonBox9.add(u.m.bt84);
			u.m.buttonBox9.add(u.m.bt85);
			u.m.buttonBox9.add(u.m.bt86);
			u.m.buttonBox9.add(u.m.bt87);
			u.m.sliderBox.add(u.m.buttonBox9);

			u.m.buttonBox10.add(u.m.bt88);
			u.m.buttonBox10.add(u.m.bt89);
			u.m.buttonBox10.add(u.m.bt90);
			u.m.buttonBox10.add(u.m.bt92);
			u.m.sliderBox.add(u.m.buttonBox10);

			u.m.sliderBox.setBounds(910, 15, 400, 750);
			jpanelThird.add(u.m);
			jpanelThird.add(u.m.sliderBox);
			jTabbedpane.addTab(tabNames[2], new ImageIcon(), jpanelThird, "相诊");// 加入第一个页面  
			jTabbedpane.validate();	
			while(0 == u.m.stop) {
				Thread.sleep(50);
				Graphics g =u.m.getGraphics();
				if(g!=null) {
					u.m.paint(g);
				}	 
			} 
		}catch (InterruptedException e) {
			jTabbedpane.validate();
		}
	}
}