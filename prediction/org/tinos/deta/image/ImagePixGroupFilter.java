package org.tinos.deta.image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.tinos.deta.classification.FissileWithMatch;
import org.tinos.deta.demension.Position2D;
public class ImagePixGroupFilter{
	//思想：罗瑶光
	//作者：罗瑶光
	//将shareholder分层处理的图片像素数据 按指定的精度和对应像素进行按像素团的大小进行特定过滤。
	public static int[][] getImagePix2DGroupFilter(int[][] inputPixMatrix, int RBG, int distanceScale,int max, int min){
		//像素分类
		Map<Integer, ArrayList<Position2D>> map= ImagePixClassification.getImagePixClassificationMap(inputPixMatrix);
		//获取分类后的团簇
		Map<Double, ArrayList<Position2D>> mid= FissileWithMatch.fissilePosition2DWithMatch(map.get(RBG), distanceScale);
		//筛选团簇，过滤团簇
		Iterator<Double> iteratorMid= mid.keySet().iterator();
		while(iteratorMid.hasNext()) {
			ArrayList<Position2D> list= mid.get(iteratorMid.next());
			if(null!= list) {
				if(list.size()< min|| list.size()> max) {
					Iterator< Position2D> iterator= list.iterator();
					while(iterator.hasNext()) {
						Position2D position2D= iterator.next();
						inputPixMatrix[(int) position2D.getX()][(int) position2D.getY()]= 0;
					}
				}
			}
		}
		return inputPixMatrix;
	}
}
//团标
							