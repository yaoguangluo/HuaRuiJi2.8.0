package org.tinos.deta.trace;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.tinos.deta.basic.Euclid;
import org.tinos.deta.demension.Position2D;
import org.tinos.deta.demension.Position3D;
public class TracePositionHearts{
	//Source: 《2维 3维 坐标集 切裂 重心 轨迹 跟踪算法JAVA源码》
	//出版日期2019 年 12 月 21 日  作品说明Gitee, Github, DetaOSS
	//作品说明适用于 坐标团 动态分析，增量轨迹分析，熵增信息单元记录。
	//作者 罗瑶光
	public static List<Position2D> trackTracePosition2DHeartsWithSingerGroup(List<Position2D> coods){
		List<Position2D> hearts= new ArrayList<>();
		Iterator<Position2D> iterator= coods.iterator();
		boolean isFirst= true;
		while(iterator.hasNext()) {
			if(isFirst) {
				isFirst= !isFirst;
				hearts.add(iterator.next());
			}else {
				Position2D position2D= iterator.next();
				Position2D CryptHeart
				= Euclid.findCryptionPosition2D(hearts.get(hearts.size()- 1), position2D);
				hearts.add(CryptHeart);
			}
		}
		return hearts;
	}
	
	public static List<Position3D> trackTracePosition3DHeartsWithSingerGroup(List<Position3D> coods){
		List<Position3D> hearts= new ArrayList<>();
		Iterator<Position3D> iterator= coods.iterator();
		boolean isFirst= true;
		while(iterator.hasNext()) {
			if(isFirst) {
				isFirst= !isFirst;
				hearts.add(iterator.next());
			}else {
				Position3D position3D= iterator.next();
				Position3D CryptHeart
				= Euclid.findCryptionPosition3D(hearts.get(hearts.size()- 1), position3D);
				hearts.add(CryptHeart);
			}
		}
		return hearts;
	}
}