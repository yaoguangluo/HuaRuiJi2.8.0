package org.bi.processor;
import java.awt.*;  

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.ByteBuffer;
import javax.swing.*;  
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.media.opengl.*;  
import JOGLOBJ_YaoguangLuo.JOGLOBJShape;
import com.jogamp.opengl.util.FPSAnimator;  
import com.jogamp.opengl.util.gl2.GLUT;
import javax.media.opengl.awt.GLCanvas;  
import javax.media.opengl.glu.GLU;
//import parserProcessor.timeCheck;
public class LineMed extends JPanel implements GLEventListener {  	
	public int c=0;
	public int []array;
	private static final long serialVersionUID = 1L;
    static FPSAnimator animator=null;  
    ChangeListener listener; 
    Box sliderBox = new Box(BoxLayout.Y_AXIS);  
    Box buttonBox = new Box(BoxLayout.X_AXIS);  
    JSlider  sliderx;
    JSlider  slidery;
    JSlider  sliderz;
    JSlider  slidert;
    JButton top;
    JButton down;
    JButton left;
    JButton right;
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
    float trot = 0.0f;  
    float lrot = -2.0f; 
    float brot = 0.0f; 
    ByteBuffer buffer;
    int[][] g;
    JOGLOBJShape shape=null;
    public double t = 1.0d;
   // timeCheck ch=new timeCheck();    
    public LineMed() throws HeadlessException 
    {  
    	this.setLayout(null);
        GLProfile glp = GLProfile.getDefault();
        GLCapabilities glcaps=new GLCapabilities(glp);      
        GLCanvas canvas=new GLCanvas(glcaps);  
        canvas.addGLEventListener(this);  
        canvas.setBounds(0, 0, 500, 500);
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
        		    new ChangeListener()  
        	        {    
        	            public void stateChanged(ChangeEvent event)  
        	            {    
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
        		    new ChangeListener()  
        	        {    
        	            public void stateChanged(ChangeEvent event)  
        	            {    
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
        		    new ChangeListener()  
        	        {    
        	            public void stateChanged(ChangeEvent event)  
        	            {    
        	                JSlider source = (JSlider) event.getSource();  
        	                zrot= source.getValue();  
        	            }
 
        	        }); 
        
        slidert = new JSlider(1 , 50); 
        slidert.setSnapToTicks(true);  
        slidert.setPaintTicks(true);  
        slidert.setMajorTickSpacing(20);  
        slidert.setMinorTickSpacing(1);  
        slidert.addChangeListener( 
        		    new ChangeListener()  
        	        {    
        	            public void stateChanged(ChangeEvent event)  
        	            {    
        	                JSlider source = (JSlider) event.getSource();  
        	                trot= source.getValue();  
        	            }
        	        });  
        
        top   = new JButton("top");
        top.addActionListener( 
    		    new ActionListener()  
    	        {    
    		    	public void actionPerformed(ActionEvent e)
    		    	{
    		    	 brot+=0.5;
    		    	}
    	        });  
        
        down  = new JButton("down");
        down.addActionListener( 
    		    new ActionListener()  
    	        {    
    		    	public void actionPerformed(ActionEvent e)
    		    	{
    		    		brot-=0.5;
    		    	}
    	        });  
        
        left  = new JButton("left");
        left.addActionListener( 
    		    new ActionListener()  
    	        {    
    		    	public void actionPerformed(ActionEvent e)
    		    	{
    		    		 lrot-=0.5;
    		    	}
    	        });  
        
        right = new JButton("right");
        right.addActionListener( 
    		    new ActionListener()  
    	        {    
    		    	public void actionPerformed(ActionEvent e)
    		    	{
    		    		 lrot+=0.5;
    		    	}
    	        });  
        
        buttonBox.add(top);
        buttonBox.add(down);
        buttonBox.add(left);
        buttonBox.add(right);
        
        sliderBox.add(sliderx);
        sliderBox.add(slidery);
        sliderBox.add(sliderz);
        sliderBox.add(slidert);
        sliderBox.add(buttonBox);
        sliderBox.setBounds(0, 500, 500, 700);
        add(sliderBox);
    }     
    private void centerWindow(Component frame)
    {
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
	public void init(GLAutoDrawable drawable) 
    {  
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
		array=arrayInit(); 
    }  
    
    
    private static int[] arrayInit() 
    {	
		int[] array=new int[12];	
		java.util.Random r=new java.util.Random(); 
		for(int i=12,j=0;i>0;i--,j++)
		{
			array[j]=r.nextInt(3);
		}
		// TODO Auto-generated method stub
		return array;
	}
    
    @SuppressWarnings("static-access")
	public void display(GLAutoDrawable drawable) 
    {  
     	GL2 gl = drawable.getGL().getGL2();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();
        gl.glTranslatef(lrot, brot, -6.0f); // translate left and into the screen
        gl.glRotatef(xrot,1.0f,0.0f,0.0f);                     // Rotate On The X Axis
        gl.glRotatef(yrot,0.0f,1.0f,0.0f);                     // Rotate On The Y Axis
        gl.glRotatef(zrot,0.0f,0.0f,1.0f);     
        gl.glPointSize(1);
        
      //  glu.gluLookAt(0,0,0, 2,2, 2,2, 2,2);

        gl.glOrtho(0, //left   
        		trot,  //right   
        	       0, //bottom   
        	       trot, //top   
        		   1, -1);  
        
       // gl.glBegin(GL.GL_POINTS);
// 
        int med=0;
        double last=0;
        double newt=0;
       for(double i=0;i<array.length;i++) {
    	   med=med+array[(int) i];
    	   newt=(med/(i+1));
    	   gl.glBegin(gl.GL_LINES);
    	   gl.glColor3f(0,0,255);
 		   gl.glVertex3d(i/3, last,0);
 		   gl.glVertex3d((i+1)/3, newt,0);
    	   gl.glEnd();
    	   gl.glBegin(gl.GL_LINES);
    	   gl.glColor3f(0,255,0);
 		   gl.glVertex3d(i/3, array[(int) i] , 0);
 		   gl.glVertex3d(i/3, newt,0);
    	   gl.glEnd();
    	   
    	   gl.glRasterPos3f((float) (i/3), array[(int) i] , 0);
           glut.glutBitmapString(GLUT.BITMAP_HELVETICA_18,//字的大小
                             i+"month");//显示的内容  
    	   last=newt; 
       }    
  	gl.glEnd();
    gl.glFlush();
   } 
    
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height)  {  
        float fAspect; 
        if (height == 0) 
        {  
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
    
//    public static void main(String[] args) {  
//        final lineMed app = new lineMed();  
//        app.setSize(850, 700);
//		app.setVisible(true);
//		JFrame f=new JFrame();
//		f.add(app);
//		f.setTitle("ButtonDemo");
//		f.setLocationRelativeTo(null);
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.setSize(650,700);
//		f.setVisible(true);
//	
//    }  
} 