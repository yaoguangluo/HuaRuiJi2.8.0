/**
 * 
 */
package JOGLOBJ_YaoguangLuo;

public class JOGLOBJVertex {
	private JOGLOBJVec4 location = null;
	private JOGLOBJVec4 texcoords = null;
	private JOGLOBJVec4 normal = null;
	public JOGLOBJVertex(double x, double y, double z) {
		location = new JOGLOBJVec4(x, y, z, 1.0);
	}
	public void setTexCoords(double u, double v, double w) {
		texcoords = new JOGLOBJVec4(u, v, w, 0.0);
	}
	public void setNormal(double x, double y, double z) {
		normal = new JOGLOBJVec4(x, y, z, 0.0);
	}
	/**
	 * @return Returns the location.
	 */
	public JOGLOBJVec4 getLocation() {
		return location;
	}

	/**
	 * @return Returns the normal.
	 */
	public JOGLOBJVec4 getNormal() {
		return normal;
	}

	/**
	 * @return Returns the texcoords.
	 */
	public JOGLOBJVec4 getTexcoords() {
		return texcoords;
	}

}
