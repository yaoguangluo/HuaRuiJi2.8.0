package org.tinos.deta.isolation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.tinos.deta.basic.Distance;
import org.tinos.deta.demension.Position2D;
import org.tinos.deta.demension.Position3D;
public class ForestIsolation{
	//带精度 2维 商旅路径团簇 森林单元 隔离 算法
	//Theory 《神经网络: 权距》，欧基里德， Yaoguang.Luo 20191220
	//Application Yaoguang.Luo 
	//适用于 最短路径，最小距离，商旅分析预测，等项目中
	public static Map<Double, List<Position2D>> getTSPForestIsolationGroups2D(List<Position2D> groups, double scale) {
		Map<Double, List<Position2D>> output= new HashMap<>(); 
		Iterator<Position2D> iterator= groups.iterator();
		double i= 0;
		while(iterator.hasNext()) {
			i++;
			Position2D position2D= iterator.next();
			Iterator<Position2D> inIterator= groups.iterator();
			double j= 0;
			Here:
				while(inIterator.hasNext()) {
					j++;
					Position2D inPosition2D= inIterator.next();
					//计算
					if(i== j) {
						continue Here;
					}
					double distance= Distance.getDistance2D(position2D, inPosition2D);
					if(distance> scale) {
						continue Here;
					}
					//添加
					List<Position2D> list;
					if(output.containsKey(i)) {
						list= output.get(i);
					}else {
						list= new ArrayList<>();
						list.add(position2D);
					}
					list.add(inPosition2D);
					output.put(i, list);
				}
		}
		return output;	
	}

	//带精度 3维 商旅路径团簇 森林单元 隔离 算法
	//Theory 《神经网络: 权距》，欧基里德， Yaoguang.Luo 20191220
	//Application Yaoguang.Luo 
	//适用于 最短路径，最小距离，商旅分析预测，等项目中
	public static Map<Double, List<Position3D>> getTSPIsolationGroups3D(List<Position3D> groups, double scale) {
		Map<Double, List<Position3D>> output= new HashMap<>(); 
		Iterator<Position3D> iterator= groups.iterator();
		double i= 0;
		while(iterator.hasNext()) {
			i++;
			Position3D position3D= iterator.next();
			Iterator<Position3D> inIterator= groups.iterator();
			double j= 0;
			Here:
				while(inIterator.hasNext()) {
					j++;
					Position3D inPosition3D= inIterator.next();
					//计算
					if(i== j) {
						continue Here;
					}
					double distance= Distance.getDistance3D(position3D, inPosition3D);
					if(distance> scale) {
						continue Here;
					}
					//添加
					List<Position3D> list;
					if(output.containsKey(i)) {
						list= output.get(i);
					}else {
						list= new ArrayList<>();
						list.add(position3D);
					}
					list.add(inPosition3D);
					output.put(i, list);
				}
		}
		return output;	
	}
}