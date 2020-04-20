package org.tinos.deta.hint;
import java.util.List;
import org.tinos.deta.basic.Euclid;
import org.tinos.deta.demension.Line2D;
import org.tinos.deta.demension.Line3D;
import org.tinos.deta.demension.Position2D;
import org.tinos.deta.demension.Position3D;
public class PositionsHintDirection{
	//坐标集隐藏运动趋势预测算法。
	//这个函数适用于在坐标团中观测 中心 与重心的 长度 来预测坐标团的稳定状态和轨迹预判。
	//适用于 游戏，数据建模，化学，物理等领域。
	//思想：流体内部分子力 统计
	//实现：罗瑶光
	public static Line2D getHintDirectionTrendFromPosition2Ds(List<Position2D> inputs) {
		Position2D mid= Euclid.findMidPosition2D(inputs);
		Position2D heart= Euclid.findHeartPosition2D(inputs);
		Line2D line2D= new Line2D();
		line2D.setBegin(mid);
		line2D.setEnd(heart);
		return line2D;	
	} 
	
	public static Line3D getHintDirectionTrendFromPosition3Ds(List<Position3D> inputs) {
		Position3D mid= Euclid.findMidPosition3D(inputs);
		Position3D heart= Euclid.findHeartPosition3D(inputs);
		Line3D line3D= new Line3D();
		line3D.setBegin(mid);
		line3D.setEnd(heart);
		return line3D;	
	} 
}