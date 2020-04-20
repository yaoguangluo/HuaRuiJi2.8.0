package org.tinos.deta.trace;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.tinos.deta.basic.Distance;
import org.tinos.deta.basic.Euclid;
import org.tinos.deta.demension.Position2D;
import org.tinos.deta.demension.Position3D;
public class TraceFissilePositionHearts{
	//Source: 《2维 3维 坐标集 切裂 重心 轨迹 跟踪算法JAVA源码》
	//出版日期2019 年 12 月 21 日  作品说明Gitee, Github, DetaOSS
	//作品说明适用于 坐标团 动态分析，增量轨迹分析，熵增信息单元记录。
	//作者 罗瑶光
	public static Map<Double, List<Position2D>> 
	trackTracePosition2DHeartsWithFissileGroups(List<Position2D> coods, double distanceScale){
		Map<Double, List<Position2D>> output= new HashMap<>(); 
		Map<Double, List<Position2D>> distanceGroups= new HashMap<>();
		Iterator<Position2D> iterator= coods.iterator();
		double i= 0.0;
		Here:
			while(iterator.hasNext()) {
				Position2D position2D= iterator.next();
				if(distanceGroups.isEmpty()) {
					List<Position2D> list= new ArrayList<>();
					list.add(position2D);
					distanceGroups.put(i, list);
					//
					List<Position2D> listHeartsTrace= output.get(i);
					listHeartsTrace.add(position2D);
					output.put(i, listHeartsTrace);
				}else {
					//遍历所有团
					//团重心匹配如果超精度新存，不是就融入。
					Iterator<Double> iteratorScale= output.keySet().iterator();
					boolean isFind= false;
					while(iteratorScale.hasNext()) {
						Double doubleScale= iteratorScale.next();
						Position2D currenctHeart= output.get(doubleScale).get(output.get(doubleScale).size()- 1);						
						double distance= Distance.getDistance2D(currenctHeart, position2D);
						if(distance< distanceScale) {
							//融入得到新的重心
							Position2D newHeart= Euclid.findCryptionPosition2D(currenctHeart, position2D);
							//删除当前增加坐标集，更新坐标集
							List<Position2D> list= distanceGroups.get(doubleScale);
							list.add(position2D);
							distanceGroups.put(doubleScale, list);
							//删除当前重心数据，更新重心数据轨迹
							List<Position2D> listHeartsTrace= output.get(doubleScale);
							listHeartsTrace.add(newHeart);
							output.put(doubleScale, listHeartsTrace);
							//找到
							isFind= true;
							//如果预测 坐标适应状态 可以把 continue 省略。
							continue Here;
						}	
					}
					//新存
					if(!isFind) {
						List<Position2D> list= new ArrayList<>();
						list.add(position2D);
						distanceGroups.put(++i, list);
						//加新hearts	
						List<Position2D> listHeartsTrace= output.get(i);
						listHeartsTrace.add(position2D);
						output.put(i, listHeartsTrace);
					}
				}
			}
		return output;
	}
	
	public static Map<Double, List<Position3D>> 
	trackTracePosition3DHeartsWithFissileGroups(List<Position3D> coods, double distanceScale){
		Map<Double, List<Position3D>> output= new HashMap<>(); 
		Map<Double, List<Position3D>> distanceGroups= new HashMap<>();
		Iterator<Position3D> iterator= coods.iterator();
		double i= 0.0;
		Here:
			while(iterator.hasNext()) {
				Position3D position3D= iterator.next();
				if(distanceGroups.isEmpty()) {
					List<Position3D> list= new ArrayList<>();
					list.add(position3D);
					distanceGroups.put(i, list);
					//
					List<Position3D> listHeartsTrace= output.get(i);
					listHeartsTrace.add(position3D);
					output.put(i, listHeartsTrace);
				}else {
					//遍历所有团
					//团重心匹配如果超精度新存，不是就融入。
					Iterator<Double> iteratorScale= output.keySet().iterator();
					boolean isFind= false;
					while(iteratorScale.hasNext()) {
						Double doubleScale= iteratorScale.next();
						Position3D currenctHeart= output.get(doubleScale).get(output.get(doubleScale).size()- 1);						
						double distance= Distance.getDistance3D(currenctHeart, position3D);
						if(distance< distanceScale) {
							//融入得到新的重心
							Position3D newHeart= Euclid.findCryptionPosition3D(currenctHeart, position3D);
							//删除当前增加坐标集，更新坐标集
							List<Position3D> list= distanceGroups.get(doubleScale);
							list.add(position3D);
							distanceGroups.put(doubleScale, list);
							//删除当前重心数据，更新重心数据轨迹
							List<Position3D> listHeartsTrace= output.get(doubleScale);
							listHeartsTrace.add(newHeart);
							output.put(doubleScale, listHeartsTrace);
							//找到
							isFind= true;
							//如果预测 坐标适应状态 可以把 continue 省略。
							continue Here;
						}	
					}
					//新存
					if(!isFind) {
						List<Position3D> list= new ArrayList<>();
						list.add(position3D);
						distanceGroups.put(++i, list);
						//加新hearts	
						List<Position3D> listHeartsTrace= output.get(i);
						listHeartsTrace.add(position3D);
						output.put(i, listHeartsTrace);
					}
				}
			}
		return output;
	}
}
