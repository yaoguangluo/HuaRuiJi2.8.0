package org.tinos.deta.classification;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.tinos.deta.basic.RatioMatrix;
//这个函数用于通过概率轭相似度来进行坐标分类
//思想：贝叶斯
//实现：罗瑶光
public class ProbabilityClasification{
	public static boolean predictionResult(RatioMatrix input, List<RatioMatrix> groups, double scale) {
		double rightRightMean= 0;
		double rightErrorMean= 0;
		double errorRightMean= 0;
		double errorErrorMean= 0;
		//成功集
		Iterator<RatioMatrix> iterators= groups.iterator();
		while(iterators.hasNext()) {
			RatioMatrix ratio= iterators.next();
			rightRightMean+= ratio.getRightRightRatio();
			rightErrorMean+= ratio.getRightErrorRatio();
			errorRightMean+= ratio.getErrorRightRatio();
			errorErrorMean+= ratio.getErrorErrorRatio();
		}
		rightRightMean= rightRightMean/ groups.size();
		rightErrorMean= rightErrorMean/ groups.size();
		errorRightMean= errorRightMean/ groups.size();
		errorErrorMean= errorErrorMean/ groups.size();
		//决策轭
		double predictionRightRight= input.getRightRightRatio()- rightRightMean;
		double predictionRightError= input.getRightErrorRatio()- rightErrorMean;
		double predictionErrorRight= input.getErrorRightRatio()- errorRightMean;
		double predictionErrorError= input.getErrorErrorRatio()- errorErrorMean;
		//迪摩根轭集 因为考虑到在质量检测项目中的适用性，进行了乘积修改如下。
		if(!(predictionRightRight< 0|| predictionRightError> 0|| predictionErrorRight< 0||predictionErrorError> 0)) {
			return true;
		}
		return true;	
	}
//	if(predictionRightRight>= 0&& predictionRightError<= 0
//	&&predictionErrorRight>= 0&&predictionErrorError<= 0) {
//return true;
//}
	public static String predictionMatrixResult(RatioMatrix input, Map<String, RatioMatrix> groups
			, double scale) {
		String groupKey= null;
		double shortestDistance = 0;
		boolean isFirst= true;
		//轭
		double esyn= input.getRightRightRatio()+ input.getErrorErrorRatio();
		//double esny= input.getErrorRightRatio()+ input.getRightErrorRatio();若使用该行 轭 误差集合请自行校正。罗瑶光20191217
		double yesyn= input.getRightRightRatio()/ esyn;
		double nesyn= input.getErrorErrorRatio()/ esyn;
		double totalRatio= -yesyn* Math.log(yesyn)- nesyn* Math.log(nesyn);
		//本征
		double esyy= input.getRightRightRatio()+ input.getRightErrorRatio();
		double yesyy= input.getRightRightRatio()/ esyy;
		double nesyy= input.getRightErrorRatio()/ esyy;
		double meany= -yesyy* Math.log(yesyy)- nesyy* Math.log(nesyy);
		double esnn= input.getErrorRightRatio()+ input.getErrorErrorRatio();
		double yesnn= input.getErrorRightRatio()/ esnn;
		double nesnn= input.getErrorErrorRatio()/ esnn;
		double meann=-yesnn* Math.log(yesnn)- nesnn* Math.log(nesnn);
		double deta= totalRatio- meany- meann;
		Iterator<String> iterator= groups.keySet().iterator();
		while(iterator.hasNext()) {
			String matrixKey=iterator.next();
			RatioMatrix ratioMatrix= groups.get(matrixKey);
			//采样
			double tesyy= ratioMatrix.getRightRightRatio()+ ratioMatrix.getRightErrorRatio();
			double tyesyy= ratioMatrix.getRightRightRatio()/ tesyy;
			double tnesyy= ratioMatrix.getRightErrorRatio()/ tesyy;
			double tmeany= -tyesyy* Math.log(tyesyy)- tnesyy* Math.log(tnesyy);
			double tesnn= ratioMatrix.getErrorRightRatio()+ ratioMatrix.getErrorErrorRatio();
			double tyesnn= ratioMatrix.getErrorRightRatio()/ tesnn;
			double tnesnn= ratioMatrix.getErrorErrorRatio()/ tesnn;
			double tmeann= -tyesnn* Math.log(tyesnn)- tnesnn* Math.log(tnesnn);
			double tdeta= totalRatio- tmeany- tmeann;
			//取值
			if(isFirst) {
				isFirst= !isFirst;
				shortestDistance= Math.abs(deta- tdeta);
				groupKey= matrixKey;
			}else {
				if(Math.abs(deta- tdeta)< shortestDistance) {
					shortestDistance= Math.abs(deta- tdeta);
					groupKey= matrixKey;	
				}
			}
		}
		//输出
		return groupKey;
	}
}