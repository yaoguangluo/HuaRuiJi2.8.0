package org.tinos.deta.tsp;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.tinos.deta.basic.Distance;
import org.tinos.deta.demension.Line2D;
import org.tinos.deta.demension.Line3D;
import org.tinos.deta.demension.Position2D;
import org.tinos.deta.demension.Position3D;
import org.tinos.deta.statistic.LYG4DWithDoubleQuickSort4D;

public class YaoguangLuoEulerRingTSP2D{
	//Foundation: Euler
	//Theory: Yaoguang.Luo
	//Application: Yaoguang.Luo 20200114
	public List<Line2D> getYaoguangLuo2DEulerRingTSP2D(List<Position2D> positions){
		//1 annotations 
		List<Position2D> position2DTag= new ArrayList<>();
		Iterator<Position2D> iterator= positions.iterator();
		int i= 0;
		String tag= "tag";
		while(iterator.hasNext()) {
			Position2D position2D=  iterator.next();
			position2D.setTag(tag+ i++);
			position2DTag.add(position2D);
		}
		positions= position2DTag;
		//2 get all lines
		List<Line2D> linesMap= new ArrayList<>();
		Iterator<Position2D> iteratorOuter= positions.iterator();
		Map<String, Map<String, String>> indexMap= new HashMap<>();
		i= 0;
		while(iteratorOuter.hasNext()) {
			Position2D position2DOuter= iteratorOuter.next();
			Iterator<Position2D> iteratorInner= positions.iterator();
			Next:
			while(iteratorInner.hasNext()) {
				Position2D position2DInner= iteratorOuter.next();
				Line2D line2D= new Line2D();
				line2D.setBegin(position2DOuter);
				line2D.setEnd(position2DInner);
				//2.1 delete the De-reflection redundant lines
				if(indexMap.containsKey(position2DInner.getTag())) {
					continue Next;
				}
				//2.2 delete self positions lines
				if(!(position2DOuter.getX()!=position2DInner.getX()
						|| position2DOuter.getY()!=position2DInner.getY())) {
					continue Next;
				}
				Map<String, String> map= new HashMap<>();
				if(indexMap.containsKey(position2DOuter.getTag())) {
					map= indexMap.get(position2DOuter.getTag());
				}else {
					map= new HashMap<>();
				}
				map.put(position2DInner.getTag(), "");
				indexMap.put(position2DOuter.getTag(), map);
				linesMap.add(line2D);
			}
		}
		//3 sort line2D
		double[] distance= new double[positions.size()];
		Iterator<Line2D> linesKeySets= linesMap.iterator();
		//4 get each distance of line.
		i= 0;
		Map<Double, List<Line2D>> uniqueLines= new HashMap<>();
		while(linesKeySets.hasNext()) {
			Line2D line2D= linesKeySets.next();
			double distanceDouble= Distance.getDistance2D(line2D.getBegin(), line2D.getEnd());
			List<Line2D> list;
			if(uniqueLines.containsKey(distanceDouble)) {
				list= uniqueLines.get(distanceDouble);
			}else {
				list= new ArrayList<>();
				//5 normalization the unique key of the distance
				distance[i++]= distanceDouble;
			}
			list.add(line2D);
			uniqueLines.put(distanceDouble, list);
		}
		//6 Yaoguangluo's 4D Peak filter Theory Quick Sort the Distance Array
		int sortRangeScale= 4; //my default is 4. you should change it as your want.
		distance= new LYG4DWithDoubleQuickSort4D().sort(distance, sortRangeScale);
		//7 From small to big loop the distance and make a condition tree.
		List<Line2D> outputLine2D= new ArrayList<>(); 
		Map<String, Double> outputDouble2D= new HashMap<>(); 
		for(i= 0; i< distance.length; i++) {
			List<Line2D> list= uniqueLines.get(distance[i]);
			Iterator<Line2D> iteratorLines= list.iterator();
			Here:
				while(iteratorLines.hasNext()) {
					Line2D line2D= iteratorLines.next();
					Position2D begin= line2D.getBegin();
					Position2D end= line2D.getEnd();
					//8 decision tree add rights line
					if(outputDouble2D.containsKey(begin.getTag())) {
						double beginTimes= outputDouble2D.get(begin.getTag()).doubleValue();
						if(outputDouble2D.containsKey(end.getTag())) {	 
							double endTimes= outputDouble2D.get(end.getTag()).doubleValue();
							if(beginTimes> 1|| endTimes> 1) {
								continue Here;
							}
							outputDouble2D.put(begin.getTag(), beginTimes+ 1);
							outputDouble2D.put(end.getTag(), endTimes+ 1);
						}else {
							if(beginTimes> 1) {
								continue Here;
							}
							outputDouble2D.put(begin.getTag(), beginTimes+ 1);
							outputDouble2D.put(end.getTag(), 1.0);
						}
					}else {
						if(outputDouble2D.containsKey(end.getTag())) {
							double endTimes= outputDouble2D.get(end.getTag()).doubleValue();
							if(endTimes> 1) {
								continue Here;
							}
							outputDouble2D.put(begin.getTag(), 1.0);
							outputDouble2D.put(end.getTag(), endTimes+ 1);
						}else {
							outputDouble2D.put(begin.getTag(), 1.0);
							outputDouble2D.put(end.getTag(), 1.0);
						}
					}	
					outputLine2D.add(line2D);
				}	
		}
		return outputLine2D;	
	}
	
	public List<Line3D> getYaoguangLuo3DEulerRingTSP2D(List<Position3D> positions){
		//1 annotations 
		List<Position3D> position3DTag= new ArrayList<>();
		Iterator<Position3D> iterator= positions.iterator();
		int i= 0;
		String tag= "tag";
		while(iterator.hasNext()) {
			Position3D position3D=  iterator.next();
			position3D.setTag(tag+ i++);
			position3DTag.add(position3D);
		}
		positions= position3DTag;
		//2 get all lines
		List<Line3D> linesMap= new ArrayList<>();
		Iterator<Position3D> iteratorOuter= positions.iterator();
		Map<String, Map<String, String>> indexMap= new HashMap<>();
		i= 0;
		while(iteratorOuter.hasNext()) {
			Position3D position3DOuter= iteratorOuter.next();
			Iterator<Position3D> iteratorInner= positions.iterator();
			Next:
			while(iteratorInner.hasNext()) {
				Position3D position3DInner= iteratorOuter.next();
				Line3D line3D= new Line3D();
				line3D.setBegin(position3DOuter);
				line3D.setEnd(position3DInner);
				//2.1 delete the De-reflection redundant lines
				if(indexMap.containsKey(position3DInner.getTag())) {
					continue Next;
				}
				//2.2 delete self positions lines
				if(!(position3DOuter.getX()!= position3DInner.getX()
						|| position3DOuter.getY()!= position3DInner.getY()
						|| position3DOuter.getZ()!= position3DInner.getZ())) {
					continue Next;
				}
				Map<String, String> map= new HashMap<>();
				if(indexMap.containsKey(position3DOuter.getTag())) {
					map= indexMap.get(position3DOuter.getTag());
				}else {
					map= new HashMap<>();
				}
				map.put(position3DInner.getTag(), "");
				indexMap.put(position3DOuter.getTag(), map);
				linesMap.add(line3D);
			}
		}
		//3 sort line3D
		double[] distance= new double[positions.size()];
		Iterator<Line3D> linesKeySets= linesMap.iterator();
		//4 get each distance of line.
		i= 0;
		Map<Double, List<Line3D>> uniqueLines= new HashMap<>();
		while(linesKeySets.hasNext()) {
			Line3D line3D= linesKeySets.next();
			double distanceDouble= Distance.getDistance3D(line3D.getBegin(), line3D.getEnd());
			List<Line3D> list;
			if(uniqueLines.containsKey(distanceDouble)) {
				list= uniqueLines.get(distanceDouble);
			}else {
				list= new ArrayList<>();
				//5 normalization the unique key of the distance
				distance[i++]= distanceDouble;
			}
			list.add(line3D);
			uniqueLines.put(distanceDouble, list);
		}
		//6 Yaoguangluo's 4D Peak filter Theory Quick Sort the Distance Array
		int sortRangeScale= 4; //my default is 4. you should change it as your want.
		distance= new LYG4DWithDoubleQuickSort4D().sort(distance, sortRangeScale);
		//7 From small to big loop the distance and make a condition tree.
		List<Line3D> outputLine3D= new ArrayList<>(); 
		Map<String, Double> outputDouble3D= new HashMap<>(); 
		for(i= 0; i< distance.length; i++) {
			List<Line3D> list= uniqueLines.get(distance[i]);
			Iterator<Line3D> iteratorLines= list.iterator();
			Here:
				while(iteratorLines.hasNext()) {
					Line3D line3D= iteratorLines.next();
					Position3D begin= line3D.getBegin();
					Position3D end= line3D.getEnd();
					//8 decision tree add rights line
					if(outputDouble3D.containsKey(begin.getTag())) {
						double beginTimes= outputDouble3D.get(begin.getTag()).doubleValue();
						if(outputDouble3D.containsKey(end.getTag())) {	 
							double endTimes= outputDouble3D.get(end.getTag()).doubleValue();
							if(beginTimes> 1|| endTimes> 1) {
								continue Here;
							}
							outputDouble3D.put(begin.getTag(), beginTimes+ 1);
							outputDouble3D.put(end.getTag(), endTimes+ 1);
						}else {
							if(beginTimes> 1) {
								continue Here;
							}
							outputDouble3D.put(begin.getTag(), beginTimes+ 1);
							outputDouble3D.put(end.getTag(), 1.0);
						}
					}else {
						if(outputDouble3D.containsKey(end.getTag())) {
							double endTimes= outputDouble3D.get(end.getTag()).doubleValue();
							if(endTimes> 1) {
								continue Here;
							}
							outputDouble3D.put(begin.getTag(), 1.0);
							outputDouble3D.put(end.getTag(), endTimes+ 1);
						}else {
							outputDouble3D.put(begin.getTag(), 1.0);
							outputDouble3D.put(end.getTag(), 1.0);
						}
					}	
					outputLine3D.add(line3D);
				}	
		}
		return outputLine3D;	
	}
}