package org.tinos.deta.cluster;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.tinos.deta.basic.Distance;
import org.tinos.deta.basic.Euclid;
import org.tinos.deta.demension.Position2D;
import org.tinos.deta.demension.Position3D;
//task 20191220-20191222 daytime
//通过scale 距离来进行坐标团集合 融聚。
//Theory yaoguang.luo 20191219， 欧基里德
//Application yaoguang.luo
//注意：做完计算可以删除冗余map数据来加速运算，但是考虑到 java对象入参是指针形式，于是取消删除思想，避免破坏函数上层逻辑。
//小伙伴有加速需要，可以自行修改。
public class Fusion{
	public static Map<Double, List<Position2D>> fusionPosition2DwithHeart
	(Map<Double, List<Position2D>> groups, Map<Double, Position2D> groupsHeart, double scale){
		//初始
		Map<Double, List<Position2D>> output= new HashMap<>();
		Map<Double, Position2D> outputHeart= new HashMap<>();
		//逐团比较重心距离
		Iterator<Double> outLoop= groupsHeart.keySet().iterator();
		Map<Double, Double> isDelete= new HashMap<>();
		//小于精度内融聚
		//HereOut:
		while(outLoop.hasNext()) {
			double out= outLoop.next();
			Iterator<Double> inLoop= groupsHeart.keySet().iterator();
			HereIn:
				while(inLoop.hasNext()) {
					double in= inLoop.next();
					if(out== in|| output.containsKey(in)|| isDelete.containsKey(in)) {
						continue HereIn;//out做融聚参照物，in做计算算子。output做观测物。
					}
					Position2D inHeart=	groupsHeart.get(in);
					//Position2D outHeart= groupsHeart.get(out);
					//如下因为java的指针被对象化，直接修改入参会产生问题于是新做了outputHeart变量来处理。
					Position2D outHeart= outputHeart.containsKey(out)
							? outputHeart.get(out): groupsHeart.get(out);
							double distance= Distance.getDistance2D(inHeart, outHeart);
							//比较 是融合
							if(distance< scale) {
								List<Position2D> outList;
								//比较有融媒
								if(output.containsKey(out)) {
									outList= output.get(out);
								}else {//比较无融媒
									//加融媒in to out 加out，删除 in
									outList= groups.get(out);
								}
								//加融媒in to out 删除 in
								List<Position2D> inList= groups.get(in);
								Iterator<Position2D> iterator= inList.iterator();
								while(iterator.hasNext()) {
									outList.add(iterator.next());
								}
								output.put(out, outList);
								//更新heart
								Position2D newHeart= Euclid.findCryptionPosition2D(outHeart, inHeart);
								outputHeart.put(out, newHeart);
								isDelete.put(in, in);
							}else {//比较 否融合）
								//比较有融媒
								if(!output.containsKey(out)) {//比较无融媒
									//加融媒 out，删除 out，加融媒 in 删除 in
									if(!output.containsKey(out)) {
										List<Position2D> outList= groups.get(out);
										output.put(out, outList);
										//更新heart
										outputHeart.put(out, outHeart);	
										isDelete.put(out, out);
									}
								}
								if(!output.containsKey(in)) {
									List<Position2D> inList= groups.get(in);
									output.put(in, inList);
									//更新heart
									outputHeart.put(in, inHeart);
									isDelete.put(in, in);
								}
							}
				}

		}
		return output;	
	}
	
	public static Map<Double, List<Position3D>> fusionPosition3DwithHeart
	(Map<Double, List<Position3D>> groups, Map<Double, Position3D> groupsHeart, double scale){
		//初始
		Map<Double, List<Position3D>> output= new HashMap<>();
		Map<Double, Position3D> outputHeart= new HashMap<>();
		//逐团比较重心距离
		Iterator<Double> outLoop= groupsHeart.keySet().iterator();
		Map<Double, Double> isDelete= new HashMap<>();
		//小于精度内融聚
		//HereOut:
		while(outLoop.hasNext()) {
			double out= outLoop.next();
			Iterator<Double> inLoop= groupsHeart.keySet().iterator();
			HereIn:
				while(inLoop.hasNext()) {
					double in= inLoop.next();
					if(out== in|| output.containsKey(in)|| isDelete.containsKey(in)) {
						continue HereIn;//out做融聚参照物，in做计算算子。output做观测物。
					}
					Position3D inHeart=	groupsHeart.get(in);
					//Position3D outHeart= groupsHeart.get(out);
					//如下因为java的指针被对象化，直接修改入参会产生问题于是新做了outputHeart变量来处理。
					Position3D outHeart= outputHeart.containsKey(out)
							? outputHeart.get(out): groupsHeart.get(out);
							double distance= Distance.getDistance3D(inHeart, outHeart);
							//比较 是融合
							if(distance< scale) {
								List<Position3D> outList;
								//比较有融媒
								if(output.containsKey(out)) {
									outList= output.get(out);
								}else {//比较无融媒
									//加融媒in to out 加out，删除 in
									outList= groups.get(out);
								}
								//加融媒in to out 删除 in
								List<Position3D> inList= groups.get(in);
								Iterator<Position3D> iterator= inList.iterator();
								while(iterator.hasNext()) {
									outList.add(iterator.next());
								}
								output.put(out, outList);
								//更新heart
								Position3D newHeart= Euclid.findCryptionPosition3D(outHeart, inHeart);
								outputHeart.put(out, newHeart);
								isDelete.put(in, in);
							}else {//比较 否融合）
								//比较有融媒
								if(!output.containsKey(out)) {//比较无融媒
									//加融媒 out，删除 out，加融媒 in 删除 in
									if(!output.containsKey(out)) {
										List<Position3D> outList= groups.get(out);
										output.put(out, outList);
										//更新heart
										outputHeart.put(out, outHeart);	
										isDelete.put(out, out);
									}
								}
								if(!output.containsKey(in)) {
									List<Position3D> inList= groups.get(in);
									output.put(in, inList);
									//更新heart
									outputHeart.put(in, inHeart);
									isDelete.put(in, in);
								}
							}
				}
		}
		return output;	
	}
} 