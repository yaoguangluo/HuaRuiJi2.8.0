package org.tinos.deta.classification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.tinos.deta.basic.RatioMatrix;
//这个函数用于模糊概率集平均值采样分类
//思想：贝叶斯 模糊数学 统计于概率论
//实现：罗瑶光
public class FuzzProbabailityClassification{
	public static RatioMatrix getSimilarFuzzSet(RatioMatrix input, List<RatioMatrix> groups) {
		double shortestSumRight=0;
		boolean isFirst= true;
		int key = 0;
		int i= 0;
		//成功集
		Iterator<RatioMatrix> iterators= groups.iterator();
		while(iterators.hasNext()) {
			RatioMatrix ratio= iterators.next();
			double rightRightMean= ratio.getRightRightRatio();
			double rightErrorMean= ratio.getRightErrorRatio();
			double errorRightMean= ratio.getErrorRightRatio();
			double errorErrorMean= ratio.getErrorErrorRatio();
			double predictionRightRight= Math.abs(input.getRightRightRatio()- rightRightMean);
			double predictionRightError= Math.abs(input.getRightErrorRatio()- rightErrorMean);
			double predictionErrorRight= Math.abs(input.getErrorRightRatio()- errorRightMean);
			double predictionErrorError= Math.abs(input.getErrorErrorRatio()- errorErrorMean);
			double tempSumRight= predictionRightRight+ predictionRightError+ predictionErrorRight+ predictionErrorError;
			if(true== isFirst) {
				isFirst= false;
				shortestSumRight= tempSumRight;
				key=i;
			}else {
				if(shortestSumRight> tempSumRight) {
					shortestSumRight= tempSumRight;
					key= i;
				}
			}
			i++;
		}
		return groups.get(key);	
	}	
	
	public static List<RatioMatrix> getSimilarFuzzSetWithScale(RatioMatrix input, List<RatioMatrix> groups, double scale) {
		List<RatioMatrix> output= new ArrayList<>();
		Iterator<RatioMatrix> iterators= groups.iterator();
		while(iterators.hasNext()) {
			RatioMatrix ratio= iterators.next();
			double rightRightMean= ratio.getRightRightRatio();
			double rightErrorMean= ratio.getRightErrorRatio();
			double errorRightMean= ratio.getErrorRightRatio();
			double errorErrorMean= ratio.getErrorErrorRatio();
			double predictionRightRight= Math.abs(input.getRightRightRatio()- rightRightMean);
			double predictionRightError= Math.abs(input.getRightErrorRatio()- rightErrorMean);
			double predictionErrorRight= Math.abs(input.getErrorRightRatio()- errorRightMean);
			double predictionErrorError= Math.abs(input.getErrorErrorRatio()- errorErrorMean);
			double tempSumRight= predictionRightRight+ predictionRightError+ predictionErrorRight+ predictionErrorError;
			if(tempSumRight< scale) {
				output.add(ratio);
			}
		}
		return output;	
	}	
}