package org.tinos.deta.demension;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.tinos.deta.basic.Euclid;
public class FindMidPositions{
	//求坐标团的中心。
	public static Map<Double, Position2D> getPosition2DGroupsMids(Map<Double, ArrayList<Position2D>> groups){
		Map<Double, Position2D> output= new HashMap<>(); 
		Iterator<Double> iterator= output.keySet().iterator();
		while(iterator.hasNext()){
			double value= iterator.next();
			output.put(value, Euclid.findMidPosition2D(groups.get(value)));
		}
		return output;
		
	}
	
	public static Map<Double, Position3D> getPosition3DGroupsMids(Map<Double, List<Position3D>> groups){
		Map<Double, Position3D> output= new HashMap<>(); 
		Iterator<Double> iterator= output.keySet().iterator();
		while(iterator.hasNext()){
			double value= iterator.next();
			output.put(value, Euclid.findMidPosition3D(groups.get(value)));
		}
		return output;
	}
}