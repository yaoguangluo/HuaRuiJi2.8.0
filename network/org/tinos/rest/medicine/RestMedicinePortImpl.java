package org.tinos.rest.medicine;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.LYG.sets.stable.StableData;
import org.tinos.engine.base.translator.Translator;
import org.tinos.engine.base.translator.imp.TranslatorImp;
import org.tinos.view.obj.Verbal;
import org.tinos.view.obj.WordFrequency;

import sample.App3;
import sort.Quick6DLYGWithStringSwap;

public class RestMedicinePortImpl {	
	public static App3 kernel(App3 app, String string) {
		//Analyst
				String zhongyao="";
				String key= string;
				String forE = key.toLowerCase().toString();
				if(key != null && !key.replace(" ", "").equals("") && key.length()>50) {
					key = key.substring(0, 50);
				}
				if(forE != null && !forE.replace(" ", "").equals("") && forE.length()>110) {
					forE = forE.substring(0, 110);
				}
				key = key.length()==0?"":app.ts.MixedStringToChineseString(app.analyzer, key);
				if(key.replaceAll("\\s+", " ").equalsIgnoreCase(" ")){
					key="";
				}
				zhongyao= key.toString();
				Here:
					for(int i= 0; i< key.length(); i++) {
						if(StableData.feng.contains(""+ key.charAt(i))) {
							key+= "风";
							continue Here;
						}
						if(StableData.han.contains(""+ key.charAt(i))) {
							key+= "风寒";
							continue Here;
						}
						if(StableData.hot.contains(""+ key.charAt(i))) {
							key+= "风热";
							continue Here;
						}
						if(StableData.shi.contains(""+ key.charAt(i))) {
							key+= "风湿";
							continue Here;
						}
						if(StableData.huo.contains(""+ key.charAt(i))) {
							key+= "火";
							continue Here;
						}
						if(StableData.zao.contains(""+ key.charAt(i))) {
							key+= "燥";
							continue Here;
						}
						if(StableData.liuYin.contains(""+ key.charAt(i))) {
							key+= "六淫";
							continue Here;
						}
						if(StableData.qiQing.contains(""+ key.charAt(i))) {
							key+= "七情";
							continue Here;
						}
						if(StableData.wangYang.contains(""+ key.charAt(i))) {
							key+= "亡阳";
							continue Here;
						}
						if(StableData.wangYin.contains(""+ key.charAt(i))) {
							key+= "亡阴";
							continue Here;
						}
						if(StableData.jiBaoShiChang.contains(""+ key.charAt(i))) {
							key+= "饥饱失常";
							continue Here;
						}
						if(StableData.yinShiBuJie.contains(""+ key.charAt(i))) {
							key+= "饮食不洁";
							continue Here;
						}
						if(StableData.tiaoShiPianShe.contains(""+ key.charAt(i))) {
							key+= "挑食偏食";
							continue Here;
						}
						if(StableData.biaoHan.contains(""+ key.charAt(i))) {
							key+= "表寒";
							continue Here;
						}
						if(StableData.biaoRe.contains(""+ key.charAt(i))) {
							key+= "表热";
							continue Here;
						}
						if(StableData.yuXue.contains(""+ key.charAt(i))) {
							key+= "淤";
						}
					}
				if(app.jpanel6!=null) {
					app.jpanel6.key= zhongyao.toString();
					app.jpanel6.keyReleased(null);
				}
				if(app.jpanel7!=null) {
					app.jpanel7.key= zhongyao.toString();
					app.jpanel7.keyReleased(null);
				}
				if(app.jpanel8!= null) {
					app.jpanel8.key= zhongyao.toString();
					app.jpanel8.keyReleased(null);
				}
				if(app.jpanel9!= null) {
					app.jpanel9.key= zhongyao.toString();
					app.jpanel9.keyReleased(null);
				}
				if(app.jpanel10!= null) {
					app.jpanel10.key= zhongyao.toString();
					app.jpanel10.keyReleased(null);
				}
				if(app.jpanel11!= null) {
					app.jpanel11.key= zhongyao.toString();
					app.jpanel11.keyReleased(null);
				}
				if(app.jpanel12!= null) {
					app.jpanel12.key= zhongyao.toString();
					app.jpanel12.keyReleased(null);
				}
				if(app.jpanel13!= null) {
					app.jpanel13.key= zhongyao.toString();
					app.jpanel13.keyReleased(null);
				}
				if(app.jpanel14!= null) {
					app.jpanel14.key= zhongyao.toString();
					app.jpanel14.keyReleased(null);
				}
				if(app.jpanel15!= null) {
					app.jpanel15.key= zhongyao.toString();
					app.jpanel15.keyReleased(null);
				}
				if(app.jpanel16!= null) {
					app.jpanel16.key= zhongyao.toString();
					app.jpanel16.keyReleased(null);
				}
				Translator ts= new TranslatorImp();
				try {
					ts.init(app.analyzer);
				} catch (IOException e) {
				} 
				List<Verbal> verbals= ts.index(app.analyzer, forE);
				if(app.jpanel17!= null) {
					app.jpanel17.verbals= verbals;
					app.jpanel17.keyReleased(null);
				}
				String[] score= new String[app.copy.size()];
				int[] score_code= new int[app.copy.size()];
				double []reg= new double[app.copy.size()];
				int count= 0;
				Map<String, WordFrequency> mapSearchWithoutSort= null;
				if(key.split(" ")[0].length()> 5) {
					mapSearchWithoutSort= app.analyzer.parserMixStringByReturnFrequencyMap(key);
				}else {
					mapSearchWithoutSort= app.analyzer.parserMixStringByReturnFrequencyMap(zhongyao);	
				}
				Iterator<String> iteratorForCopy= app.copy.iterator();	
				int copyCount= 0;
				while(iteratorForCopy.hasNext()) {
					String iteratorForCopyString= iteratorForCopy.next();
					score[copyCount]= iteratorForCopyString;
					String temps= app.dic_map.get(iteratorForCopyString).toString();
					String tempsPCA= app.dic_li.get(iteratorForCopyString).toString();
					Iterator<String> iteratorWordFrequency= mapSearchWithoutSort.keySet().iterator();
					Here:
						while(iteratorWordFrequency.hasNext()) {  
							String mapSearchaAtII = iteratorWordFrequency.next();
							WordFrequency wordFrequencySearch = mapSearchWithoutSort.get(mapSearchaAtII);
							if(temps.contains(mapSearchaAtII)) {
								if(reg[copyCount] == 0){
									count += 1;
								}
								if(score[copyCount].contains(zhongyao.replace(" ", ""))) {
									reg[copyCount]+= 1000;
								}
								score[copyCount]= iteratorForCopyString;
								if(!app.pos.containsKey(mapSearchaAtII)) {
									reg[copyCount]+= 1;
									score_code[copyCount]+= 1<< mapSearchaAtII.length()<< wordFrequencySearch.getFrequency() ;
									if(tempsPCA.contains(mapSearchaAtII)) {
										score_code[copyCount] *= 2;
									}
									if(score[copyCount].contains(mapSearchaAtII)) {
										reg[copyCount]+= 1000;
									}
									continue Here;
								}
								if(app.pos.get(mapSearchaAtII).contains("名")|| app.pos.get(mapSearchaAtII).contains("动")
										|| app.pos.get(mapSearchaAtII).contains("形")|| app.pos.get(mapSearchaAtII).contains("谓")) {
									reg[copyCount]+= 2;
									if(tempsPCA.contains(mapSearchaAtII)) {
										reg[copyCount]*= 2;
									}
								}
								reg[copyCount] += 1;
								score_code[copyCount] += (iteratorForCopyString.contains(mapSearchaAtII) ? 2 : 1) 
									* (!app.pos.get(mapSearchaAtII).contains("名") ? app.pos.get(mapSearchaAtII).contains("动")? 45 : 1 : 50) 
										<< mapSearchaAtII.length() * wordFrequencySearch.getFrequency();
								if(score[copyCount].contains(mapSearchaAtII)) {
									reg[copyCount]+= 1000;
								}
								continue Here;
							}
							if(mapSearchaAtII.length()>1) {
								for(int j=0;j<mapSearchaAtII.length();j++) {
									if(temps.contains(String.valueOf(mapSearchaAtII.charAt(j)))) {
										if(reg[copyCount] == 0){
											count += 1;
										}
										score[copyCount] = iteratorForCopyString;
										score_code[copyCount]+=1;
										if(app.pos.containsKey(String.valueOf(mapSearchaAtII.charAt(j)))&&(
												app.pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("名")
												||app.pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("动")
												||app.pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("形")
												||app.pos.get(String.valueOf(mapSearchaAtII.charAt(j))).contains("谓")
												)) {
											reg[copyCount] += 2;
										}
										reg[copyCount] += 1;
										if(score[copyCount].contains(mapSearchaAtII)) {
											reg[copyCount]+= 1000;
										}
										continue Here;
									}
								}
							}
						}
					score_code[copyCount] = score_code[copyCount] * (int)reg[copyCount];
					copyCount++;
				}
					new Quick6DLYGWithStringSwap().sort(score_code, score);
					Object[][] tableData= new Object[count][13];
					int new_count = 0;
					app.newTableModel.getDataVector().clear();
					if(null== key|| key.equals("")) {
						for(int i= 0; i < app.tableData_old.length; i++) {
							app.newTableModel.insertRow(i, app.tableData_old[i]);
						}		
						app.newTableModel.fireTableDataChanged();	
						return null;
					}
					Here:
						for(int i = app.copy.size()-1; i > -1; i--) {
							if(score_code[i]< 1){
								continue Here;
							}
							if(app.risk_filter_box.isSelected()) {
								String hai= (app.dic_hai.get(score[i])==null?"null.":app.dic_hai.get(score[i]).toString().replaceAll("\\s*", "").equalsIgnoreCase("")?"null":app.dic_hai.get(score[i]).toString().replaceAll("\\s*", ""));
								String temp= app.name_filter.getText();
								for(int j=0;j<temp.length();j++) {
									if(hai.contains(""+ temp.charAt(j))) {
										continue Here;
									}	
								}
							}
							if(app.feel_filter_box.isSelected()) {
								String wei= app.dic_xw.get(score[i]).toString().replaceAll("\\s*", "");
								String temp= app.name_filter.getText();
								for(int j=0;j<temp.length();j++) {
									if(wei.contains(""+ temp.charAt(j))) {
										continue Here;
									}	
								}
							}
							String temp= app.dic_map.get(score[i]).toString();
							if(tableData.length<= new_count) {
								continue Here;
							}
							tableData[new_count]= new Object[]{new_count+1, score_code[i], score[i],
									app.dic_yw.get(score[i]).toString(),
									app.dic_li.get(score[i]).toString().replaceAll("\\s*", ""),
									(app.dic_hai.get(score[i])==null?"详情参考笔记原文列: 是药三分毒, 补药甚三分. 食材亦如此, 勤俭亦长生.":app.dic_hai.get(score[i]).toString().replaceAll("\\s*", "").equalsIgnoreCase("")?"详情参考笔记原文列":app.dic_hai.get(score[i]).toString().replaceAll("\\s*", "")), 				
									(app.dic_yl.get(score[i])==null?"":app.dic_yl.get(score[i])).toString().replaceAll("\\s*", ""),
									app.dic_xw.get(score[i]).toString().replaceAll("\\s*", "") ,
									app.dic_jm.get(score[i]).toString().replaceAll("\\s*", "") ,
									(app.dic_xz.get(score[i])==null?"":app.dic_xz.get(score[i])).toString().replaceAll("\\s*", "") , 
									(app.dic_jj.get(score[i])==null?"":app.dic_jj.get(score[i])).toString().replaceAll("\\s*", ""), 
									(app.dic_cy.get(score[i])==null?"":app.dic_cy.get(score[i])).toString().replaceAll("\\s*", ""),
									(app.dic_ya.get(score[i])==null?"":app.dic_ya.get(score[i])).toString().replaceAll("\\s*", "") , 
									(app.dic_zf.get(score[i])==null?"":app.dic_zf.get(score[i])).toString().replaceAll("\\s*", ""),
									(app.dic_cj.get(score[i])==null?"":app.dic_cj.get(score[i])).toString().replaceAll("\\s*", "")};
							if(zhongyao.contains("风寒")) {
								if(temp.contains("风寒")) {
									app.newTableModel.insertRow(new_count, tableData[new_count]);
									new_count += 1;
								}
							}else if(key.contains("风热")){
								if(temp.contains("风热")) {
									app.newTableModel.insertRow(new_count, tableData[new_count]);
									new_count += 1;
								}		
							}else {
								app.newTableModel.insertRow(new_count, tableData[new_count]);
								new_count+=1;
							}		 
						}	
					app.newTableModel.fireTableDataChanged();
					return app;
	}
	
	public static Map<String, Object> getMedicineBookFeedbackZY(App3 app,String string) {
		app= RestMedicinePortImpl.kernel(app, string);
		if(null==app) {
			return null;
		}
		//feedback
		String preAdd= "仅作病症预测推荐，不做行医诊治分析，请拥有医师资格证人员慎重分析病情，来做证候分析。谢谢!";
		//中医诊断：
		preAdd+= "中医诊断：\r\n\r\n";
		for(int i=0;i<10;i++) {
			preAdd+= "证候内容：" + app.jpanel8.table.getValueAt(i, 2).toString()
					+ "可能性：" + app.jpanel8.table.getValueAt(i, 1).toString();
			preAdd+= "\r\n\r\n";
		}

		preAdd+= "方剂推荐：\r\n\r\n";
		//方剂分析：
		for(int i=0;i<10;i++) {
			preAdd+= "证候内容："+ app.jpanel7.table.getValueAt(i, 2).toString()
					+ "可能性："+ app.jpanel7.table.getValueAt(i, 1).toString();
			preAdd+= "\r\n\r\n";
		}
		preAdd+= "\r\n\r\n";
		if(app.text.getText().length()>5000) {
			Map<String, Object> output= new HashMap<>();
			try {
				output.put(URLEncoder.encode("zy","UTF-8"), URLEncoder.encode(preAdd,"UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return output;
		}
		if(!app.text.getText().isEmpty()) {
			app.text.setText(app.text.getText() +"\r\n\r\n"+ preAdd);
		}else {
			app.text.setText(preAdd);
		}
		app.text.validate();
		Map<String, Object> output= new HashMap<>();
		try {
			output.put(URLEncoder.encode("zy","UTF-8"), URLEncoder.encode(preAdd,"UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return output;
	}
	
	public static Map<String, Object> getMedicineBookFeedbackXY(App3 app,String string) {
		app= RestMedicinePortImpl.kernel(app, string);
		if(null== app) {
			return null;
		}
		//feedback
		String preAdd= "仅作病症预测推荐，不做行医诊治分析，请拥有医师资格证人员慎重分析病情，来做证候分析。谢谢!";
		preAdd+= "西医诊断：\r\n\r\n";
		//西医急诊：
		for(int i=0;i<5;i++) {
			preAdd+= "证候内容："+ app.jpanel12.table.getValueAt(i, 2).toString()
					+ "可能性："+	app.jpanel12.table.getValueAt(i, 1).toString();
			preAdd+= "\r\n\r\n";
		}
		preAdd+= "外科诊断：\r\n\r\n";
		//外科分析：
		for(int i=0;i<5;i++) {
			preAdd+= "证候内容："+ app.jpanel13.table.getValueAt(i, 2).toString()
					+ "可能性："+	app.jpanel13.table.getValueAt(i, 1).toString();
			preAdd+= "\r\n\r\n";
		}
		preAdd+= "内科诊断：\r\n\r\n";
		//内科分析：
		for(int i=0;i<5;i++) {
			preAdd+= "证候内容："+ app.jpanel6.table.getValueAt(i, 2).toString()
					+ "可能性："+	app.jpanel6.table.getValueAt(i, 1).toString();
			preAdd+= "\r\n\r\n";
		}
		preAdd+= "妇幼诊断：\r\n\r\n";
		//妇幼分析：
		for(int i=0;i<5;i++) {
			preAdd+= "证候内容："+ app.jpanel11.table.getValueAt(i, 2).toString()
					+ "可能性："+	app.jpanel11.table.getValueAt(i, 1).toString();
			preAdd+= "\r\n\r\n";
		}

		preAdd+= "伤科：\r\n\r\n";
		//伤科分析：
		for(int i=0;i<5;i++) {
			preAdd+= "证候内容："+ app.jpanel14.table.getValueAt(i, 2).toString()
					+ "可能性："+	app.jpanel14.table.getValueAt(i, 1).toString();
			preAdd+= "\r\n\r\n";
		}
		Map<String, Object> output= new HashMap<>();
		try {
			output.put(URLEncoder.encode("xy","UTF-8"), URLEncoder.encode(preAdd, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return output;
	}
	
	public static Map<String, Object> getMedicineBookFeedbackZT(App3 app, String string) {
		app= RestMedicinePortImpl.kernel(app, string);
		//feedback
		String preAdd= "仅作病症预测推荐，不做行医诊治分析，请拥有医师资格证人员慎重分析病情，来做证候分析。谢谢!";
		preAdd+= "\r\n\r\n";
		preAdd+= "*****************************************************************";
		preAdd+= "仅作中药推荐，不做处方权分析，请拥有处方权职业药师慎重分析药理根据病情搭配修改。谢谢!";
		preAdd+= "\r\n\r\n";
		for(int r= 0; r< (app.newTableModel.getRowCount()< 50? app.newTableModel.getRowCount(): 50); r++) {
			Object temp= app.newTableModel.getValueAt(r, 2);
			if(temp!= null&& !temp.toString().isEmpty()) {
				if(temp.toString().contains("穴位")||temp.toString().contains("武术")||temp.toString().contains("瓜果")
						||temp.toString().contains("果蔬")||temp.toString().contains("食物")||temp.toString().contains("菜谱")
						||temp.toString().contains("音乐")||temp.toString().contains("零食")||temp.toString().contains("书法")
						||temp.toString().contains("诗词")) {
				}else {
					preAdd+= app.newTableModel.getValueAt(r, 2);
					preAdd+= "/";
					if(app.newTableModel.getValueAt(r, 6)!= null&&!app.newTableModel.getValueAt(r, 6).toString().isEmpty()) {
					    temp= app.newTableModel.getValueAt(r, 6).toString();
						String value= "";
						for(int i = 0; i < temp.toString().length(); i++){
							if(temp.toString().charAt(i)<128 || temp.toString().charAt(i)=='—') {
								value+=temp.toString().charAt(i);
							}else {
								value+=" ";
							}
						}
						String[] temps = value.replaceAll("\\s+", " ").split(" ");
						if(temps.length>0 && temps[0].split("—").length > 1) {
							value = temps[0].split("—")[1];
							value += "g;";
						}else {
							value = "请酌情添加;";
						}
						preAdd += value;
					}else {
						preAdd += "请酌情添加;";
					}
					if(r%2!=0) {
						preAdd += "\r\n\r\n";
					}else {
						preAdd += "    ";
					}
				}
			}
		}
		if(app.text.getText().length()>5000) {
			Map<String, Object> output= new HashMap<>();
			try {
				output.put(URLEncoder.encode("zt","UTF-8"), URLEncoder.encode(preAdd,"UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return output;
		}
		if(!app.text.getText().isEmpty()) {
			app.text.setText(app.text.getText() +"\r\n\r\n"+ preAdd);
		}else {
			app.text.setText(preAdd);
		}
		app.text.validate();
		Map<String, Object> output= new HashMap<>();
		try {
			output.put(URLEncoder.encode("zt","UTF-8"), URLEncoder.encode(preAdd,"UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return output;
	}
	
	public static Map<String, Object> getMedicineBookFeedbackXT(App3 app, String string) {
		app= RestMedicinePortImpl.kernel(app, string);
		//feedback
		String preAdd= "仅作病症预测推荐，不做行医诊治分析，请拥有医师资格证人员慎重分析病情，来做证候分析。谢谢!";
		preAdd+= "西药推荐：\r\n\r\n";
		//分析：
		for(int i=0;i<25;i++) {
			preAdd+= "证候内容："+ app.jpanel15.table.getValueAt(i, 2).toString()
					+ "可能性："+	 app.jpanel15.table.getValueAt(i, 1).toString()
					+ "适应性："+	 app.jpanel15.table.getValueAt(i, 8).toString();
			preAdd+= "\r\n\r\n";
		}
		preAdd+= "\r\n\r\n";
		app.text.validate();
		Map<String, Object> output= new HashMap<>();
		try {
			output.put(URLEncoder.encode("xt", "UTF-8"), URLEncoder.encode(preAdd,"UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return output;
	}
	
	public static Map<String, Object> getMedicineBookFeedbackYT(App3 app, String string) {
		app= RestMedicinePortImpl.kernel(app, string);
		//feedback
		String preAdd= "仅作病症预测推荐，不做行医诊治分析，请拥有医师资格证人员慎重分析病情，来做证候分析。谢谢!";
		preAdd+= "\r\n\r\n";
		//
		preAdd+= "*****************************************************************";
		preAdd+= "仅作养生保健推荐，不做处方权分析，请拥有处方权职业药师慎重分析药理根据病情搭配修改。谢谢!";
		preAdd+= "\r\n\r\n";
		for(int r= 0; r< (app.newTableModel.getRowCount()< 150? app.newTableModel.getRowCount(): 150); r++) {
			Object temp= app.newTableModel.getValueAt(r, 2);
			if(temp!= null&& !temp.toString().isEmpty()) {
				if(temp.toString().contains("穴位")||temp.toString().contains("武术")||temp.toString().contains("瓜果")
						||temp.toString().contains("果蔬")||temp.toString().contains("食物")||temp.toString().contains("菜谱")
						||temp.toString().contains("音乐")||temp.toString().contains("零食")||temp.toString().contains("书法")
						||temp.toString().contains("诗词")) {
					preAdd+= app.newTableModel.getValueAt(r, 2);
					preAdd+= "/";
					if(app.newTableModel.getValueAt(r, 6)!= null&&!app.newTableModel.getValueAt(r, 6).toString().isEmpty()) {
						temp= app.newTableModel.getValueAt(r, 6).toString();
						String value= "";
						for(int i = 0; i < temp.toString().length(); i++){
							if(temp.toString().charAt(i)<128 || temp.toString().charAt(i)=='—') {
								value+=temp.toString().charAt(i);
							}else {
								value+=" ";
							}
						}
						String[] temps = value.replaceAll("\\s+", " ").split(" ");
						if(temps.length>0 && temps[0].split("—").length > 1) {
							value = temps[0].split("—")[1];
							value += "g;";
						}else {
							value = "请酌情添加;";
						}
						preAdd += value;
					}else {
						preAdd += "请酌情添加;";
					}
					if(r%2!=0) {
						preAdd += "\r\n\r\n";
					}else {
						preAdd += "    ";
					}
				}
			}
		}
		if(app.text.getText().length()>5000) {
			Map<String, Object> output= new HashMap<>();
			try {
				output.put(URLEncoder.encode("yt","UTF-8"), URLEncoder.encode(preAdd,"UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return output;
		}
		if(!app.text.getText().isEmpty()) {
			app.text.setText(app.text.getText() +"\r\n\r\n"+ preAdd);
		}else {
			app.text.setText(preAdd);
		}
		app.text.validate();
		Map<String, Object> output= new HashMap<>();
		try {
			output.put(URLEncoder.encode("yt","UTF-8"), URLEncoder.encode(preAdd,"UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return output;
	}
	
	public static Map<String, Object> getMedicineBookFeedback(App3 app, String string) {
		app= RestMedicinePortImpl.kernel(app, string);
		//feedback
		String preAdd= "仅作病症预测推荐，不做行医诊治分析，请拥有医师资格证人员慎重分析病情，来做证候分析。谢谢!";
		//中医诊断：
		preAdd+= "中医诊断：\r\n\r\n";
		for(int i=0;i<5;i++) {
			preAdd+= "证候内容：" + app.jpanel8.table.getValueAt(i, 2).toString()
					+ "可能性：" +	app.jpanel8.table.getValueAt(i, 1).toString();
			preAdd+= "\r\n\r\n";
		}
		preAdd+= "西医诊断：\r\n\r\n";
		//西医急诊：
		for(int i=0;i<5;i++) {
			preAdd+= "证候内容："+ app.jpanel12.table.getValueAt(i, 2).toString()
					+ "可能性："+	app.jpanel12.table.getValueAt(i, 1).toString();
			preAdd+= "\r\n\r\n";
		}
		preAdd+= "外科诊断：\r\n\r\n";
		//外科分析：
		for(int i=0;i<5;i++) {
			preAdd+= "证候内容："+ app.jpanel13.table.getValueAt(i, 2).toString()
					+ "可能性："+	app.jpanel13.table.getValueAt(i, 1).toString();
			preAdd+= "\r\n\r\n";
		}
		preAdd+= "内科诊断：\r\n\r\n";
		//内科分析：
		for(int i=0;i<5;i++) {
			preAdd+= "证候内容："+ app.jpanel6.table.getValueAt(i, 2).toString()
					+ "可能性："+	app.jpanel6.table.getValueAt(i, 1).toString();
			preAdd+= "\r\n\r\n";
		}
		preAdd+= "妇幼诊断：\r\n\r\n";
		//妇幼分析：
		for(int i=0;i<5;i++) {
			preAdd+= "证候内容："+ app.jpanel11.table.getValueAt(i, 2).toString()
					+ "可能性："+	app.jpanel11.table.getValueAt(i, 1).toString();
			preAdd+= "\r\n\r\n";
		}

		preAdd+= "伤科：\r\n\r\n";
		//伤科分析：
		for(int i=0;i<5;i++) {
			preAdd+= "证候内容："+ app.jpanel14.table.getValueAt(i, 2).toString()
					+ "可能性："+	app.jpanel14.table.getValueAt(i, 1).toString();
			preAdd+= "\r\n\r\n";
		}

		preAdd+= "方剂推荐：\r\n\r\n";
		//方剂分析：
		for(int i=0;i<5;i++) {
			preAdd+= "证候内容："+ app.jpanel7.table.getValueAt(i, 2).toString()
					+ "可能性："+	app.jpanel7.table.getValueAt(i, 1).toString();
			preAdd+= "\r\n\r\n";
		}

		preAdd+= "西药推荐：\r\n\r\n";
		//分析：
		for(int i=0;i<5;i++) {
			preAdd+= "证候内容："+ app.jpanel15.table.getValueAt(i, 2).toString()
					+ "可能性："+	 app.jpanel15.table.getValueAt(i, 1).toString()
					+ "适应性："+	 app.jpanel15.table.getValueAt(i, 8).toString();
			preAdd+= "\r\n\r\n";
		}
		preAdd+= "\r\n\r\n";
		//
		preAdd+= "*****************************************************************";
		preAdd+= "仅作中药推荐，不做处方权分析，请拥有处方权职业药师慎重分析药理根据病情搭配修改。谢谢!";
		preAdd+= "\r\n\r\n";
		for(int r= 0; r< (app.newTableModel.getRowCount()< 50? app.newTableModel.getRowCount(): 50); r++) {
			if(app.newTableModel.getValueAt(r, 2)!= null&& !app.newTableModel.getValueAt(r, 2).toString().isEmpty()) {
				preAdd+= app.newTableModel.getValueAt(r, 2);
				preAdd+= "/";
				if(app.newTableModel.getValueAt(r, 6)!= null&&!app.newTableModel.getValueAt(r, 6).toString().isEmpty()) {
					String temp= app.newTableModel.getValueAt(r, 6).toString();
					String value= "";
					for(int i = 0; i < temp.length(); i++){
						if(temp.charAt(i)<128 || temp.charAt(i)=='—') {
							value+=temp.charAt(i);
						}else {
							value+=" ";
						}
					}
					String[] temps = value.replaceAll("\\s+", " ").split(" ");
					if(temps.length>0 && temps[0].split("—").length > 1) {
						value = temps[0].split("—")[1];
						value += "g;";
					}else {
						value = "请酌情添加;";
					}
					preAdd += value;
				}else {
					preAdd += "请酌情添加;";
				}
				if(r%2!=0) {
					preAdd += "\r\n\r\n";
				}else {
					preAdd += "    ";
				}
			}
		}
		if(app.text.getText().length()>5000) {
			Map<String, Object> output= new HashMap<>();
			try {
				output.put(URLEncoder.encode("yl","UTF-8"), URLEncoder.encode(preAdd,"UTF-8"));
			} catch (UnsupportedEncodingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return output;
		}
		if(!app.text.getText().isEmpty()) {
			app.text.setText(app.text.getText() +"\r\n\r\n"+ preAdd);
		}else {
			app.text.setText(preAdd);
		}
		app.text.validate();
		Map<String, Object> output= new HashMap<>();
		try {
			output.put(URLEncoder.encode("yl","UTF-8"), URLEncoder.encode(preAdd,"UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return output;
	}

	public static Object doSearch(App3 app, String string) {
		System.out.println(app.name.getText());
		if(!app.name.getText().contains(string)) {
			app.name.setText(app.name.getText()+string);
		}
		app.name.validate();
		app.jsp_name.validate();
		app.validate();
		return null;
	}
}