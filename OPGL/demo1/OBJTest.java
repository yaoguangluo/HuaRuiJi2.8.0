

package demo1;
import JOGLOBJ_YaoguangLuo.*;
import com.jogamp.opengl.util.gl2.GLUT;    
import javax.media.opengl.GL;  
import javax.media.opengl.GL2;  
import javax.media.opengl.GL2ES1;
import javax.media.opengl.GLAutoDrawable;  
import javax.media.opengl.GLEventListener;  
import javax.media.opengl.fixedfunc.GLLightingFunc;
import javax.media.opengl.glu.GLU;                //脙茠脗篓脙鈥毭偮棵兟⒚⑩偓啪脗垄脙茠脗漏脙垄芒鈥毬偮∶冣�γ⑩偓鈩⒚兤捗偮冣�毭偮泵冣�毭偮幻兤捗偮γ兟⒚⑩�毬偮懊兟⒚⑩偓拧脗卢脙茠脗楼脙鈥γ⑩偓艙脙鈥毭偮兤捗偮ッ冣�γ⑩偓鈩⒚兟⒚⑩�毬偮γ兤捗偮γ兟⒚⑩�毬柯矫冣�毭偮姑兤捗偮ッ兟偮棵偮矫冣�姑呪�溍兤捗偮っ冣�毭偮好兟⒚⑩�毬偮�  
import javax.swing.JPanel;


/** 
 * 
 * @脙茠脗娄脙鈥毭偮冣�毭偮⒚兤捗偮冣�毭偮棵冣�γ偮矫兤捗偮γ兟偮棵偮矫冣�毭偮ッ兤捗偮ッ冣�姑⑩偓聽脙鈥毭偮懊兤捗偮ッ冣�毭偮兟偮棵偮矫兤捗偮兟⒚⑩�毬嬇撁冣�γ⑩偓艙IT脙茠脗楼脙炉脗驴脗陆脙鈥γ偮∶兤捗偮ッ冣�毭偮冣�毭偮⒚兤捗偮冣�毭偮┟冣�毭偮好兤捗偮┟兟⒚⑩�毬⑩偓锟矫冣�毭偮� 
 *  
 */  
public class OBJTest extends JPanel implements GLEventListener 
{    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	GL2 gl;  
    GLU glu;  
    GLUT glut;  
    float whiteLight[] = {0.2f, 0.2f, 0.2f, 1.0f};  
    float sourceLight[] = {0.8f, 0.8f, 0.8f, 1.0f};  
    float lightPos[] = {0.0f, 0.0f, 0.0f, 1.0f};  
    float moveshape = 0.0f;  
    float fEarthRot = 0.0f; 
    JOGLOBJShape shape=null;
    public double t = 1.0d;
    float xrot = 0.0f;  
    float yrot = 0.0f;  
    float zrot = 0.0f;  
    public void init(GLAutoDrawable drawable) 
    {  
        gl =  drawable.getGL().getGL2();    //脙茠脗陇脙鈥毭偮该冣�毭偮幻兤捗偮冣�毭偮γ兟偮棵偮矫兤捗偮ッ冣�毭偮懊冣�毭偮泵兤捗偮γ冣�姑呪�溍冣�毭偮兤捗偮冣�毭偮棵兟⒚⑩偓啪脗垄脙茠脗漏脙垄芒鈥毬偮∶冣�γ⑩偓鈩⒚兤捗偮ッ兟偮棵偮矫兟⒚⑩�毬嬇撁兤捗偮兟⒚⑩�毬柯矫冣�γ偮该兤捗偮ッ兟偮棵偮矫冣�姑呪�溍兤捗偮ッ冣�γ⑩偓鈩⒚兟⒚⑩�毬⑩偓艙  
        glu = new GLU();  
        glut= new GLUT();  
        glu = GLU.createGLU(); 
        gl.glShadeModel(GLLightingFunc.GL_SMOOTH);
        gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        gl.glClearDepth(1.0f);         // clear z-buffer to the farthest
        gl.glEnable(GL.GL_DEPTH_TEST); // enables depth testing
        gl.glDepthFunc(GL.GL_LEQUAL);  // the type of depth test to do
        gl.glHint(GL2ES1.GL_PERSPECTIVE_CORRECTION_HINT, GL.GL_NICEST);   
        
    }  
    public void display(GLAutoDrawable drawable) 
    {  
    	GL2 gl = drawable.getGL().getGL2();
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();
        gl.glTranslatef(-1.5f, 0.0f, -6.0f); // translate left and into the screen
        gl.glRotatef(moveshape,0.0f,1.0f,0.0f);  
        
        gl.glRotatef(xrot,1.0f,0.0f,0.0f);                     // Rotate On The X Axis
        gl.glRotatef(yrot,0.0f,1.0f,0.0f);                     // Rotate On The Y Axis
        gl.glRotatef(zrot,0.0f,0.0f,1.0f);
        
        new JOGLDrawOBJ(gl,shape,"/demo1/suzanne2.obj",Math.PI/t); 
 
        t += 6.0d;
   		if(t > 360.d){
   			t = 36.0d;
   		 }
   		
   		
   	  xrot+=0.5f;   
      if(xrot > 360.0f)  
      	xrot = 0.0f;  
      

      yrot+=0.5f;   
      if(yrot > 360.0f)  
      	yrot = 0.0f;  

      zrot+=0.5f;   
      if(zrot > 360.0f)  
      	zrot = 0.0f;  
   		
   		
   		
   }  
	public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) 
    {  
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
    public void dispose(GLAutoDrawable arg0) 
    {       
    }  
}  