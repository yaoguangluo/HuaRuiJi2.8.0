package org.tinos.deta.demension;
//Theory: ÎÞ·¨¿¼Ö¤
//Application: Yaoguang.luo
public class QuarSide3D{
	public Line3D getTop() {
		return top;
	}
	public void setTop(Line3D top) {
		this.top = top;
	}
	public Line3D getDown() {
		return down;
	}
	public void setDown(Line3D down) {
		this.down = down;
	}
	public Line3D getLeft() {
		return left;
	}
	public void setLeft(Line3D left) {
		this.left = left;
	}
	public Line3D getRight() {
		return right;
	}
	public void setRight(Line3D right) {
		this.right = right;
	}
	private Line3D top;
	private Line3D down;
	private Line3D left;
	private Line3D right;
}