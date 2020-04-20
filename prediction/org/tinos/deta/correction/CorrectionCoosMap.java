package org.tinos.deta.correction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.tinos.deta.demension.Position2D;
import org.tinos.deta.demension.Position3D;
public class CorrectionCoosMap{
	//这个函数用于坐标集的计算观测优化。
	//思想 坐标系 平移 欧基里德，笛卡尔
	//实现 罗瑶光
	//range数组 0 为 x轴 ，1 为 y轴 ，2 为z轴 。
	public static double[] getPosition2DRange(List<Position2D> inputs) {
		Iterator<Position2D> iterator= inputs.iterator();
		double xMax= 0;
		double yMax= 0;
		double xMin= 0;
		double yMin= 0;
		double[] range= new double[2];
		if(iterator.hasNext()) {
			Position2D position2D= iterator.next();
			xMax= position2D.getX();
			xMin= position2D.getX();
			yMax= position2D.getY();
			yMin= position2D.getY();
		}
		while(iterator.hasNext()) {
			Position2D position2D= iterator.next();
			if(position2D.getX()> xMax) {
				xMax= position2D.getX();
			}
			if(position2D.getX()< xMin) {
				xMin= position2D.getX();
			}
			if(position2D.getY()> yMax) {
				yMax= position2D.getY();
			}
			if(position2D.getY()< yMin) {
				yMin= position2D.getY();
			}
		}
		range[0]= xMax- xMin;
		range[1]= yMax- yMin;
		return range;
	}
	
	public static double[] getPosition3DRange(List<Position3D> inputs) {
		Iterator<Position3D> iterator= inputs.iterator();
		double xMax= 0;
		double yMax= 0;
		double xMin= 0;
		double yMin= 0;
		double zMax= 0;
		double zMin= 0;
		double[] range= new double[3];
		if(iterator.hasNext()) {
			Position3D position3D= iterator.next();
			xMax= position3D.getX();
			xMin= position3D.getX();
			yMax= position3D.getY();
			yMin= position3D.getY();
			zMax= position3D.getZ();
			zMin= position3D.getZ();
		}
		while(iterator.hasNext()) {
			Position3D position3D= iterator.next();
			if(position3D.getX()> xMax) {
				xMax= position3D.getX();
			}
			if(position3D.getX()< xMin) {
				xMin= position3D.getX();
			}
			if(position3D.getY()> yMax) {
				yMax= position3D.getY();
			}
			if(position3D.getY()< yMin) {
				yMin= position3D.getY();
			}
			if(position3D.getZ()> zMax) {
				zMax= position3D.getZ();
			}
			if(position3D.getZ()< zMin) {
				zMin= position3D.getZ();
			}
		}
		range[0]= xMax- xMin;
		range[1]= yMax- yMin;
		range[2]= zMax- zMin;
		return range;
	}
	
	public static List<Position2D> CorrectionPosition2DMap(List<Position2D> inputs
			, double xRange, double yRange){
		List<Position2D> output= new ArrayList<>();
		Iterator<Position2D> iterator= inputs.iterator();
		while(iterator.hasNext()) {
			Position2D position2D= iterator.next();
			position2D.setX(position2D.getX()+ xRange);
			position2D.setY(position2D.getY()+ yRange);
			output.add(position2D);
		}
		return output;
	}
	
	public static List<Position3D> CorrectionPosition3DMap(List<Position3D> inputs
			, double xRange, double yRange, double zRange){
		List<Position3D> output=new ArrayList<>();
		Iterator<Position3D> iterator= inputs.iterator();
		while(iterator.hasNext()) {
			Position3D position3D= iterator.next();
			position3D.setX(position3D.getX()+ xRange);
			position3D.setY(position3D.getY()+ yRange);
			position3D.setZ(position3D.getZ()+ zRange);
			output.add(position3D);
		}
		return output;
	}
}