package JOGLOBJ_YaoguangLuo;

public class JOGLOBJFace {
	
	private JOGLOBJVertex verts[];
	
	public JOGLOBJFace() {
		super();
	}
	
	public JOGLOBJFace(JOGLOBJVertex[] faceverts) {
		verts = faceverts;
	}

	/**
	 * @return Returns the verts.
	 */
	public JOGLOBJVertex[] getVerts() {
		return verts;
	}

	/**
	 * @param verts The verts to set.
	 */
	public void setVerts(JOGLOBJVertex[] verts) {
		this.verts = verts;
	}

}
