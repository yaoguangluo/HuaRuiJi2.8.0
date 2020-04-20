package org.tinos.deta.demension;
//Theory: Euclid
//Application: Yaoguang.luo
public class Position3D{
	public Position3D(int x, int y, int z) {
		this.setX(x);
		this.setY(y);
		this.setZ(z);
	}
	public Position3D() {
		// TODO Auto-generated constructor stub
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	private double x;
	private double y;
	private double z;
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	private String tag;
}