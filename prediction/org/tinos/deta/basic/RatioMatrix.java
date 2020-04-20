package org.tinos.deta.basic;
//Theory: ±´Ò¶Ë¹
//Application: Yaoguang.luo
public class RatioMatrix{
	public double getRightErrorRatio() {
		return rightErrorRatio;
	}
	public void setRightErrorRatio(double rightErrorRatio) {
		this.rightErrorRatio = rightErrorRatio;
	}
	public double getRightRightRatio() {
		return rightRightRatio;
	}
	public void setRightRightRatio(double rightRightRatio) {
		this.rightRightRatio = rightRightRatio;
	}
	public double getErrorErrorRatio() {
		return errorErrorRatio;
	}
	public void setErrorErrorRatio(double errorErrorRatio) {
		this.errorErrorRatio = errorErrorRatio;
	}
	public double getErrorRightRatio() {
		return errorRightRatio;
	}
	public void setErrorRightRatio(double errorRightRatio) {
		this.errorRightRatio = errorRightRatio;
	}
	public double rightErrorRatio;
	public double rightRightRatio;
	public double errorErrorRatio;
	public double errorRightRatio;
}