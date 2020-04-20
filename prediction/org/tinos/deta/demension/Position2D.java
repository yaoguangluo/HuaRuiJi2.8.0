package org.tinos.deta.demension;
//Theory: Eclid
//Application: Yaoguang.luo
public class Position2D{
	public Position2D(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	public Position2D() {
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
	private double x;
	private double y;
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	private String tag;
}