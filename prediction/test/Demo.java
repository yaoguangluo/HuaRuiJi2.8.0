package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.tinos.deta.PCA.FindPCAMeanDistance;
import org.tinos.deta.basic.Euclid;
import org.tinos.deta.classification.Fissile;
import org.tinos.deta.classification.PositionClasification;
import org.tinos.deta.cluster.Fusion;
import org.tinos.deta.demension.Position2D;
import org.tinos.deta.isolation.ForestIsolation;
import org.tinos.deta.isolation.Isolation;

@SuppressWarnings("unused")
public class Demo{
	public static void main(String[] argv) {
		//初始10个坐标
		List<Position2D> input= new ArrayList<>(); 
		Position2D position2D= new Position2D();
		position2D.setX(0);
		position2D.setY(0);
		input.add(position2D);
		
		Position2D position2D1= new Position2D();
		position2D1.setX(12);
		position2D1.setY(12);
		input.add(position2D1);
		
		Position2D position2D2= new Position2D();
		position2D2.setX(0);
		position2D2.setY(12);
		input.add(position2D2);
		
		Position2D position2D3= new Position2D();
		position2D3.setX(12);
		position2D3.setY(0);
		input.add(position2D3);
		
		Position2D position2D4= new Position2D();
		position2D4.setX(5);
		position2D4.setY(5);
		input.add(position2D4);
		//处理 side end
//		List<Position2D> output= SideEnd.getSideEnd2D(input, 10);
//		Iterator<Position2D> iterator= output.iterator();
//		while(iterator.hasNext()) {
//			Position2D temp= iterator.next();
//			System.out.println(temp.getX()+ ":"+ temp.getY());
//		}
		
		//处理fissile
//		Map<Double, List<Position2D>> output= Fissile.fissilePosition2D(input, 13);
//		Iterator<Double> iterator= output.keySet().iterator();
//		while(iterator.hasNext()) {
//			double temp= iterator.next();
//			System.out.println();
//			System.out.println(temp);
//			Iterator<Position2D> iterator1= output.get(temp).iterator();
//			while(iterator1.hasNext()) {
//				Position2D temp1= iterator1.next();
//				System.out.println(temp1.getX()+ ":"+ temp1.getY());
//			}	
//		}
		
//		//处理商旅森林 isolation
//		Map<Double, List<Position2D>> output= ForestIsolation.getTSPForestIsolationGroups2D(input, 12);
//		Iterator<Double> iterator= output.keySet().iterator();
//		while(iterator.hasNext()) {
//			double temp= iterator.next();
//			System.out.println();
//			System.out.println(temp);
//			Iterator<Position2D> iterator1= output.get(temp).iterator();
//			while(iterator1.hasNext()) {
//				Position2D temp1= iterator1.next();
//				System.out.println(temp1.getX()+ ":"+ temp1.getY());
//			}	
//		}
		
//		//处理商旅簇isolation
//				Map<Double, List<Position2D>> output= Isolation.getTSPIsolationGroups2D(input, 12);
//				Iterator<Double> iterator= output.keySet().iterator();
//				while(iterator.hasNext()) {
//					double temp= iterator.next();
//					System.out.println();
//					System.out.println(temp);
//					Iterator<Position2D> iterator1= output.get(temp).iterator();
//					while(iterator1.hasNext()) {
//						Position2D temp1= iterator1.next();
//						System.out.println(temp1.getX()+ ":"+ temp1.getY());
//					}	
//				}
//		
		//处理fusion 先 fissile 采样
//		Map<Double, List<Position2D>> output= Fissile.fissilePosition2D(input, 13);
//		Iterator<Double> iterator= output.keySet().iterator();
//		while(iterator.hasNext()) {
//			double temp= iterator.next();
//			System.out.println();
//			System.out.println(temp);
//			Iterator<Position2D> iterator1= output.get(temp).iterator();
//			while(iterator1.hasNext()) {
//				Position2D temp1= iterator1.next();
//				System.out.println(temp1.getX()+ ":"+ temp1.getY());
//			}	
//		}
//		//然后fusion 1 观测heart
//		Map<Double, Position2D> groupsHeart=new HashMap<>();
//		Iterator<Double> iterator2= output.keySet().iterator();
//		while(iterator2.hasNext()) {
//			double temp= iterator2.next();
//			Position2D heartTemp= Eclid.findHeartPosition2D(output.get(temp));
//			System.out.println("hearts->"+heartTemp.getX()+ ":"+ heartTemp.getY());
//			groupsHeart.put(temp, heartTemp);
//		}
//		//2观测结果 用10 和11分别带入可测试。
//		Map<Double, List<Position2D>> fusion= Fusion.fusionPosition2DwithHeart(output, groupsHeart, 11);
//		Iterator<Double> iterator3= fusion.keySet().iterator();
//		while(iterator3.hasNext()) {
//			double temp= iterator3.next();
//			System.out.println();
//			System.out.println(temp);
//			Iterator<Position2D> iterator1= output.get(temp).iterator();
//			while(iterator1.hasNext()) {
//				Position2D temp1= iterator1.next();
//				System.out.println(temp1.getX()+ ":"+ temp1.getY());
//			}	
//		}
		//
//		Position2D position2D5= new Position2D();
//		position2D5.setX(15);
//		position2D5.setY(25);
//	
//		Map<Double, List<Position2D>>inputMap= new HashMap<>();
//		inputMap.put(0.0, input);
//		Map<Double, List<Position2D>>output= PositionClasification.addNewPositionWithoutHeart(inputMap, position2D5, 29);//采样距离28.4
//		
//		Iterator<Double> iterator= output.keySet().iterator();
//		while(iterator.hasNext()) {
//			double temp= iterator.next();
//			System.out.println();
//			System.out.println(temp);
//			Iterator<Position2D> iterator1= output.get(temp).iterator();
//			while(iterator1.hasNext()) {
//				Position2D temp1= iterator1.next();
//				System.out.println(temp1.getX()+ ":"+ temp1.getY());
//			}	
//		}
		
		//
		Position2D position2D5= new Position2D();
		position2D5.setX(15);
		position2D5.setY(25);
		input.add(position2D5);
		//double v= FindPCAMeanDistance.findMeanDistanceFromPositions2D(input, 5, 4);
		//System.out.println(v);
		double[] v= FindPCAMeanDistance.findPascalMeanDistanceByEachPositions2D(input, 3, 4);
		for(int i= 0; i< v.length; i++) {
			System.out.println(v[i]);
		}
	}
}