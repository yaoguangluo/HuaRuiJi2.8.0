package org.tinos.deta.classification;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.tinos.deta.basic.Distance;
import org.tinos.deta.basic.Euclid;
import org.tinos.deta.demension.Position2D;
import org.tinos.deta.demension.Position3D;
//这个函数用于坐标集团距离采样匹配输出
//思想: 欧基里德 
//实现：罗瑶光
public class PositionHeartsSample{
	public static List<Position2D> getShortestSamplePosition2DGroup(Position2D inputHeart
			, Map<Double, List<Position2D>> groups) {
		double shortestDistance= 0;
		boolean isFirst= true;
		double key= 0;
		Iterator<Double> iterators= groups.keySet().iterator();
		while(iterators.hasNext()) {
			double mapKey= iterators.next();
			List<Position2D> positions= groups.get(mapKey);
			Position2D heart= Euclid.findHeartPosition2D(positions);
			double distance= Distance.getDistance2D(inputHeart, heart);
			if(true== isFirst) {
				isFirst= false;
				shortestDistance= distance;
				key= mapKey;
			}else {
				if(shortestDistance> distance) {
					shortestDistance= distance;
					key= mapKey;
				}
			}
		}
		return groups.get(key);	
	}	

	public static Map<Double, List<Position2D>> getShorterSamplePosition2DGroupsWithScale(Position2D inputHeart
			, Map<Double, List<Position2D>> groups, double scale) {
		Map<Double, List<Position2D>> output= new HashMap<>();
		Iterator<Double> iterators= groups.keySet().iterator();
		while(iterators.hasNext()) {
			double mapKey= iterators.next();
			List<Position2D> positions= groups.get(mapKey);
			Position2D heart= Euclid.findHeartPosition2D(positions);
			double distance= Distance.getDistance2D(inputHeart, heart);
			if(scale> distance) {
				output.put(mapKey, positions);
			}
		}
		return output;	
	}	

	public static List<Position3D> getShortestSamplePosition3DGroup(Position3D inputHeart
			, Map<Double, List<Position3D>> groups) {
		double shortestDistance= 0;
		boolean isFirst= true;
		double key= 0;
		Iterator<Double> iterators= groups.keySet().iterator();
		while(iterators.hasNext()) {
			double mapKey= iterators.next();
			List<Position3D> positions= groups.get(mapKey);
			Position3D heart= Euclid.findHeartPosition3D(positions);
			double distance= Distance.getDistance3D(inputHeart, heart);
			if(true== isFirst) {
				isFirst= false;
				shortestDistance= distance;
				key= mapKey;
			}else {
				if(shortestDistance> distance) {
					shortestDistance= distance;
					key= mapKey;
				}
			}
		}
		return groups.get(key);	
	}	

	public static Map<Double, List<Position3D>> getShortestSamplePosition3DGroupsWithScale(Position3D inputHeart
			, Map<Double, List<Position3D>> groups, double scale) {
		Map<Double, List<Position3D>> output= new HashMap<>();
		Iterator<Double> iterators= groups.keySet().iterator();
		while(iterators.hasNext()) {
			double mapKey= iterators.next();
			List<Position3D> positions= groups.get(mapKey);
			Position3D heart= Euclid.findHeartPosition3D(positions);
			double distance= Distance.getDistance3D(inputHeart, heart);
			if(scale> distance) {
				output.put(mapKey, positions);
			}
		}
		return output;	
	}	
}