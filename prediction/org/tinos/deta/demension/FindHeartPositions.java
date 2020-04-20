package org.tinos.deta.demension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.tinos.deta.basic.Euclid;
public class FindHeartPositions{
	//求坐标团的重心。
	public static Map<Double, Position2D> getPosition2DGroupsHearts(Map<Double, ArrayList<Position2D>> groups){
		Map<Double, Position2D> output= new HashMap<>(); 
		Iterator<Double> iterator= output.keySet().iterator();
		while(iterator.hasNext()){
			double value= iterator.next();
			output.put(value, Euclid.findHeartPosition2D(groups.get(value)));
		}
		return output;
		
	}
	
	public static Map<Double, Position3D> getPosition3DGroupsHearts(Map<Double, List<Position3D>> groups){
		Map<Double, Position3D> output= new HashMap<>(); 
		Iterator<Double> iterator= output.keySet().iterator();
		while(iterator.hasNext()){
			double value= iterator.next();
			output.put(value, Euclid.findHeartPosition3D(groups.get(value)));
		}
		return output;
		
	}
}