package JOGLOBJ_YaoguangLuo;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.media.opengl.GL2;

public class JOGLDrawOBJ {
	public JOGLDrawOBJ(GL2 gl, JOGLOBJShape m,String filename,double dd) 
	{
		
		JOGLObjLoader oml = new JOGLObjLoader();
   		try {
   				m = oml.loadFile(filename);
   		    } catch (FileNotFoundException e)
   		    	{
   		    	// TODO Auto-generated catch block
   		    		e.printStackTrace();
   		    	} catch (IOException e)
   		    		{
   		    		// TODO Auto-generated catch block
   		    		e.printStackTrace();
   		} 		
		new JOGLDrawOBJ(gl, m,dd); 
	}
	public JOGLDrawOBJ(GL2 gl, JOGLOBJShape m, double dd) 
	{
		 for (int i=0;i<m.numberOfFaces();i++)
	        {
	            gl.glBegin(GL2.GL_POLYGON);
	        	for (int j=0;j< m.getFaceList().get(i).getVerts().length;j++)
	        	{
	        		 JOGLOBJVec4 norm= m.getFaceList().get(i).getVerts()[j].getNormal();
	                 if(norm!= null)
	         		{
	         			gl.glNormal3d(norm.getX(),norm.getY(),norm.getZ());
	         		}
	        		JOGLOBJVec4 color = m.getFaceList().get(i).getVerts()[j].getTexcoords();
	        		if(color != null)
	        		{
	        			gl.glColor3d((color.getX()),(color.getY()),(color.getZ()));
	        		}
	        		JOGLOBJVec4 locat= m.getFaceList().get(i).getVerts()[j].getLocation();
	        		if(locat!= null)
	        		{
	        		    gl.glVertex3d(locat.getX()+Math.sin(locat.getY()/(5*dd))/10,locat.getY(), locat.getZ());	
	        		}
	        	}
	        	gl.glEnd(); 
	        }	
	}
}