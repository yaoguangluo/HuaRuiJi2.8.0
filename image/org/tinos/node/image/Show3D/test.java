package org.tinos.node.image.Show3D;
import java.awt.*;  


import java.nio.ByteBuffer;
import javax.swing.*;  
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.media.opengl.*;  

import com.jogamp.opengl.util.FPSAnimator;  
import com.jogamp.opengl.util.gl2.GLUT;
import javax.media.opengl.awt.GLCanvas;  
import javax.media.opengl.glu.GLU;
public class test extends JPanel implements GLEventListener {  
	String str=new String("c://playTest//assignment02.png");
	private static final long serialVersionUID = 1L;
	static FPSAnimator animator=null;  
	ChangeListener listener; 
	Box sliderBox = new Box(BoxLayout.Y_AXIS);  
	JSlider  sliderx;
	JSlider  slidery;
	JSlider  sliderz;
	// Image3d l2= new Image3d();
	GL2 gl;  
	GLU glu;  
	GLUT glut;  
	float whiteLight[] = {0.2f, 0.2f, 0.2f, 1.0f};  
	float sourceLight[] = {0.8f, 0.8f, 0.8f, 1.0f};  
	float lightPos[] = {0.0f, 0.0f, 0.0f, 1.0f};  
	float moveshape = 0.0f;  
	float fEarthRot = 0.0f; 
	float xrot = 0.0f;  
	float yrot = 0.0f;  
	float zrot = 0.0f;  
	ByteBuffer buffer;
	int[][] g;
	public test(int[][] gout) throws HeadlessException {  
		g=gout;
		//super("name"); 
		this.setLayout(null);
		setSize(600,480);  
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		GLProfile glp = GLProfile.getDefault();
		GLCapabilities glcaps=new GLCapabilities(glp);          //鑴欒尃鑴楃瘬鑴欓垾姣伄妫靛厽鈷氣懇鍋撳暘鑴�?瀯鑴欒尃鑴楁紡鑴欏�?�鑺掗垾姣優鍋埗鍐ｏ拷鑺掗埀顑藉妷鑴欒尃鑴楁ゼ鑴欏�?�鑺掗垾姣優鈶╋拷鍨勮剻閳ノ斥懇鍋撻埄鈷氬叅鎹�?伄銇ｅ啠锟�?�剹楣胯剻鍨勮姃閳ユ顑炲伄濮戝叅鎹�?伄銉冨厽鈷氣懇锟藉崲鑴楁幊鑴欑�?�鑴楅┐鑴楅檰鑴欒尃鑴楁悅鑴欓垾姣伄锟�??锟斤拷锟借剹鑱�?�剻鑼犺剹绡撹剻閳ノ冲伄鐘嗗厽鈷氣懇锟藉崲鑴滈殕鑴欒尃鑴楁悅鑴欓垾纬鍋埗鍏熲挌鈶╋拷鍗㈣劀鎴剻鑼犺剹闄囪剻閳ユ鍋够鍐ｏ拷鑴楁嫝鑴欒尃鑴楁悅鑴欓垾姣伄鐘嗗厽顕稿伄妫靛伄鐭叅鎹�?伄纬鍐ｏ拷鑺掗埀顑犳拋鍏熲挌鈶╋拷鍗㈣剹鎺宠剻鑼犺剹妤艰剻閳ノ斥懇鍋撻埄鈷氬啠锟借剹娼炶剻鑼犺剹妤艰剻閳ュ鈶╁亾鑱借剻閳ユ鍋拷  
		GLCanvas canvas=new GLCanvas(glcaps);  
		canvas.addGLEventListener(this);  
		canvas.setBounds(0, 0, 300, 300);
		//canvas.addMouseListener(listener);  
		//getContentPane().
		this.add(canvas);  
		animator=new FPSAnimator(canvas,60,true);                 
		centerWindow(this); 
		animator.start();
		sliderx = new JSlider(0 , 360); 
		sliderx.setSnapToTicks(true);  
		sliderx.setPaintTicks(true);  
		sliderx.setMajorTickSpacing(20);  
		sliderx.setMinorTickSpacing(5);  
		sliderx.addChangeListener( 
				new ChangeListener() {    
					public void stateChanged(ChangeEvent event) {    
						JSlider source = (JSlider) event.getSource();  
						xrot= source.getValue();  
					}

				});  
		slidery = new JSlider(0 , 360); 
		slidery.setSnapToTicks(true);  
		slidery.setPaintTicks(true);  
		slidery.setMajorTickSpacing(20);  
		slidery.setMinorTickSpacing(5);  
		slidery.addChangeListener( 
				new ChangeListener()  {    
					public void stateChanged(ChangeEvent event)  {    
						JSlider source = (JSlider) event.getSource();  
						yrot= source.getValue();  
					}

				});  
		sliderz = new JSlider(0 , 360); 
		sliderz.setSnapToTicks(true);  
		sliderz.setPaintTicks(true);  
		sliderz.setMajorTickSpacing(20);  
		sliderz.setMinorTickSpacing(5);  
		sliderz.addChangeListener( 
				new ChangeListener()  {    
					public void stateChanged(ChangeEvent event)  {    
						JSlider source = (JSlider) event.getSource();  
						zrot= source.getValue();  
					}

				});  
		sliderBox.add(sliderx);
		sliderBox.add(slidery);
		sliderBox.add(sliderz);
		//getContentPane().
		sliderBox.setBounds(0, 300, 300, 500);
		add(sliderBox);
	}     
	private void centerWindow(Component frame){ 
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();  
		Dimension frameSize = frame.getSize();  
		if (frameSize.width > screenSize.width)  
			frameSize.width = screenSize.width;  
		if (frameSize.height > screenSize.height)  
			frameSize.height = screenSize.height;  
		frame.setLocation((screenSize.width - frameSize.width) >> 1,  
				(screenSize.height - frameSize.height) >> 1);  
	}  
	@SuppressWarnings("static-access")
	public void init(GLAutoDrawable drawable) {  
		gl =  drawable.getGL().getGL2();    
		glu = new GLU();  
		glut= new GLUT();       
		gl.glEnable(GL.GL_TEXTURE_2D);
		gl.glTexParameteri(gl.GL_TEXTURE_2D,gl.GL_TEXTURE_MIN_FILTER,gl.GL_LINEAR);
		gl.glTexParameteri(gl.GL_TEXTURE_2D,gl.GL_TEXTURE_MAG_FILTER,gl.GL_NEAREST);      
		gl.glEnable(GL.GL_DEPTH_TEST);
		gl.glDepthFunc(GL.GL_LEQUAL);
		gl.glShadeModel(GL2.GL_SMOOTH);
		gl.glClearColor(0f, 0f, 0f, 0f);                        // The Type Of Depth Testing To Do
		gl.glHint(gl.GL_PERSPECTIVE_CORRECTION_HINT, gl.GL_NICEST);    
		System.out.println("error");
	}  
	public void display(GLAutoDrawable drawable) {  
		GL2 gl = drawable.getGL().getGL2();
		gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
		gl.glLoadIdentity();
		gl.glTranslatef(-1.5f, 0.0f, -6.0f); // translate left and into the screen
		gl.glRotatef(xrot,1.0f,0.0f,0.0f);                     // Rotate On The X Axis
		gl.glRotatef(yrot,0.0f,1.0f,0.0f);                     // Rotate On The Y Axis
		gl.glRotatef(zrot,0.0f,0.0f,1.0f);     
		gl.glPointSize(1);
		gl.glBegin(GL.GL_POINTS);
		for(int i=0;i<g.length;i++){
			for(int j=0;j<g[0].length;j++){
				gl.glColor3f((float)g[i][j]/255,(float)g[i][j]/255,(float)g[i][j]/255);
				gl.glVertex3d(i*0.005, j*0.005,g[i][j]*0.005);
			}
		}
		gl.glEnd();
		gl.glFlush();
	}  
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {  
		float fAspect; 
		if (height == 0) {  
			height = 1;  
		}      
		gl.glViewport(0, 0, width, height);  
		fAspect = (float) width / height;      
		gl.glMatrixMode(GL2.GL_PROJECTION);  
		gl.glLoadIdentity();       
		glu.gluPerspective(53.0f, fAspect, 1.0, 400.0);  
		gl.glMatrixMode(GL2.GL_MODELVIEW);  
		gl.glLoadIdentity();  
	}  
	public void dispose(GLAutoDrawable arg0) {       
	}  
	public static void main(String[] args) {  
		final test app = new test(null);      
		app.setSize(800, 600);
		app.setVisible(true);
		//		JFrame f=new JFrame();
		//		f.add(app);
		//		f.setTitle("ButtonDemo");
		//		f.setLocationRelativeTo(null);
		//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//		f.setSize(500,600);
		//		f.setVisible(true);
	}  
}  
