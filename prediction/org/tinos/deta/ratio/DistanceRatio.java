package org.tinos.deta.ratio;
import org.tinos.deta.basic.ComputeSets;
import org.tinos.deta.demension.Position2D;
import org.tinos.deta.demension.Position3D;
//Theory: Yaoguang.luo
//一种仅仅通过坐标差值叠加来计算距离向量的使用方法。
//Application: Yaoguang.luo
public class DistanceRatio{
	//获取斜率梯度
	public static double getDistanceRatio2D(Position2D begin, Position2D end) {
		double x= begin.getX()- end.getX();
		double y= begin.getY()- end.getY();
		//1象限
		if(x>=0&& y>=0) {
			return Math.abs(x)/ Math.abs(y);
		}
		//4象限
		if(x>= 0 && y<0) {
			return 1+ Math.abs(x)/ Math.abs(y);
		}
		//2象限
		if(x< 0 && y>= 0) {
			return Math.abs(x)/ Math.abs(y);
		}
		//3象限
		if(x< 0&& y< 0) {
			return -1 - Math.abs(x)/ Math.abs(y);
		}
		return 0;
	}
	
	//降低计算速度来获取高准确斜率梯度 (早期傅里叶思想)
	public static double getARCDistanceRatio2D(Position2D begin, Position2D end) {
		double x= begin.getX()- end.getX();
		double y= begin.getY()- end.getY();
		double z= Math.sqrt(x* x+ y* y);	
		return Math.asin(x/z)+ Math.acos(y/z);
	}
	
	//降低计算速度来获取两点间线的真实角度 
	public static double getTrueARCDistanceRatio2D(Position2D begin, Position2D end) {
		double x= begin.getX()- end.getX();
		double y= begin.getY()- end.getY();
		double z= Math.sqrt(x* x+ y* y);
		//1象限
		if(x>=0&& y>=0) {
			return Math.asin(Math.abs(x)/z);
		}
		//4象限
		if(x>= 0 && y<0) {
			return 2* ComputeSets.getPi()- Math.asin(Math.abs(x)/z);
		}
		//2象限
		if(x< 0 && y>= 0) {
			return ComputeSets.getPi()- Math.asin(Math.abs(x)/z);
		}
		//3象限
		if(x< 0&& y< 0) {
			return ComputeSets.getPi()+ Math.asin(Math.abs(x)/z);
		}
		return 0;
	}
	//获取计算参照梯度
	public static double getDistanceRatio3D(Position3D begin, Position3D end) {
		double pi= 3.1415926;
		double x= begin.getX()- end.getX();
		double y= begin.getY()- end.getY();
		double z= begin.getZ()- end.getZ();
		//1象限
		if(x>= 0&& y>= 0) {
			if(z>= 0) {
				return Math.abs(x)/ Math.abs(y);	
			}else {
				return pi+ Math.abs(x)/ Math.abs(y);
			}
		}
		//4象限
		if(x>= 0&& y< 0) {
			if(z>= 0) {
				return pi*6+ Math.abs(x)/ Math.abs(y);	
			}else {
				return pi*7+ Math.abs(x)/ Math.abs(y);
			}
		}
		//2象限
		if(x< 0&& y>= 0) {
			if(z>= 0) {
				return pi*2+ Math.abs(x)/ Math.abs(y);	
			}else {
				return pi*3+ Math.abs(x)/ Math.abs(y);
			}
		}
		//3象限
		if(x< 0&& y< 0) {
			if(z>= 0) {
				return pi*4+ Math.abs(x)/ Math.abs(y);
			}else {
				return pi*5+ Math.abs(x)/ Math.abs(y);
			}
		}
		return 0;
	}
	
	//获取真实三维夹角
	public static double getTrueARCDistanceRatio3D(Position3D begin, Position3D end) {
		return 0;
		//球面参照无效。以后研究下有什么标准规范没。
	}
}