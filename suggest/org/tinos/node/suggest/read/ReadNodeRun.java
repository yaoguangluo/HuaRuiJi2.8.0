package org.tinos.node.suggest.read;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.tinos.engine.analysis.Analyzer;
import org.tinos.engine.analysis.imp.CogsBinaryForestAnalyzerImp;
import org.tinos.gui.osgi.*;
public class ReadNodeRun extends ObjectRun{
	private static final long serialVersionUID= 1L;
	public int value= 0;
	public String filepath;
	public File[] fileList;
	protected String addressString;
	protected String searchString;
	public List<String[]> indexResult;
	public Analyzer analyzer;
	public Map<String, String> pos;
	public Map<String, String> pose;
	public Map<String, String> posec;
	public Map<String, String> indexWords;
	
	public ReadNodeRun() throws IOException{	
	}

	public void run(final ReadNodeView thisView) throws IOException{
		analyzer= new CogsBinaryForestAnalyzerImp();
		analyzer.initMixed();
		//拿到中文数据
		pos= analyzer.getPosCnToCn();
		indexResult= new ArrayList<String[]>();
		System.out.println("runed"+ value); 
		//thisView.path= new String(filepath); 
		//thisView.out= new JTable(content, spec); 	
		System.out.println(addressString);
		System.out.println(searchString);
		//loop category
		File category= new File(addressString);
		if(!category.isDirectory()|| !category.exists()) {
			return;
		}
		String[] fileList= category.list();
		List<String> list= analyzer.parserMixedString(searchString);
		//list to map
		indexWords= new HashMap<String, String>(); 
		for(String string: list) {
			indexWords.put(string, pos.containsKey(string)?pos.get(string):"未知");
		}
		indexFile(addressString, fileList);
		System.out.println(fileList.length);
		thisView.indexResult= indexResult;
	}

	private void indexFile(String addressString, String[] fileList) throws IOException {
		if(null== fileList) {
			return;
		}
		
		Here:
			for(String string: fileList) {
				File file= new File(addressString+ "\\"+ string);
				if(file.isDirectory()) {
					indexFile(file.getPath(), file.list());
					continue Here;
				}
				if(!string.contains(".txt")) {
					continue Here;
				}
				score(file);
			}
	}

	private void score(File file) throws IOException {
		try {
			double rank= 0;
			double important= 0;
			String path= file.getAbsolutePath();
			System.out.println(path);
			String[] result= new String[3];
			if(!file.exists()) {
				return;
			}
			BufferedReader reader= new BufferedReader(new FileReader(file));
			String tempString;
			while ((tempString= reader.readLine())!= null) {
				List<String> list= analyzer.parserMixedString(tempString);
				Iterator<String> iterator= list.iterator();
				while(iterator.hasNext()) {
					String value= iterator.next();
					if(indexWords.containsKey(value)) {
						if(indexWords.get(value).contains("名")) {
							rank+= 6;
							important+= value.length();
						}else if(indexWords.get(value).contains("动")) {
							rank+= 5;
							important+= value.length();
						}else if(indexWords.get(value).contains("形")) {
							rank+= 4;
							important+= value.length();
						}else if(indexWords.get(value).contains("谓")) {
							rank+= 3;
							important+= value.length();
						}else if(indexWords.get(value).contains("副")) {
							rank+= 2;
							important+= value.length();
						}
						rank+= 0.01;
						important+= 0.01;
					}
				}
			}
			reader.close();
			result[0]= ""+ rank;
			result[1]= ""+ important;
			result[2]= path;
			indexResult.add(result);
		}catch(Exception e) {
			//e.printStackTrace();
		}
		//分词
		//一行一行匹配
		//统计次数。
		//排序。
	}
}
