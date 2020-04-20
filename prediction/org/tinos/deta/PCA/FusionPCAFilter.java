package org.tinos.deta.PCA;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.tinos.deta.demension.Position2D;
import org.tinos.deta.demension.Position3D;
//这个函数用于坐标融聚团的主要条件过滤。
//思想：统计与概率论，立体几何，数据挖掘
//实现：罗瑶光
public class FusionPCAFilter{
	public static Map<Double, List<Position2D>> filterFusion2DSetsWithCountScale
	(Map<Double, List<Position2D>> groups, double countScale){
		Map<Double, List<Position2D>> output= new HashMap<>();
		Iterator<Double> iterator= groups.keySet().iterator();
		while(iterator.hasNext()) {
			double value= iterator.next();
			if(groups.get(value).size()>= countScale) {
				output.put(value, groups.get(value));
			}
		}
		return output;
	}
	
	public static Map<Double, List<Position3D>> filterFusion3DSetsWithCountScale
	(Map<Double, List<Position3D>> groups, double countScale){
		Map<Double, List<Position3D>> output= new HashMap<>();
		Iterator<Double> iterator= groups.keySet().iterator();
		while(iterator.hasNext()) {
			double value= iterator.next();
			if(groups.get(value).size()>= countScale) {
				output.put(value, groups.get(value));
			}
		}
		return output;
	}
}