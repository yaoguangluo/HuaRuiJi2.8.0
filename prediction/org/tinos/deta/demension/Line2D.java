package org.tinos.deta.demension;
//Theory: 平面几何
//Application: Yaoguang.luo
public class Line2D{
	public Position2D getBegin() {
		return begin;
	}
	public void setBegin(Position2D begin) {
		this.begin = begin;
	}
	public Position2D getEnd() {
		return end;
	}
	public void setEnd(Position2D end) {
		this.end = end;
	}
	public String getBeginTag() {
		return beginTag;
	}
	public void setBeginTag(String beginTag) {
		this.beginTag = beginTag;
	}
	public String getEndTag() {
		return endTag;
	}
	public void setEndTag(String endTag) {
		this.endTag = endTag;
	}
	
	private Position2D begin;
	private Position2D end;
	private String beginTag;
	private String endTag;
	
}