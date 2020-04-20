package sample;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class test{	
	public static void main(String argv[]){
		String a = "C:/Users/Administrator/Desktop/txt/a.txt";  
		String b = "C:/Users/Administrator/Desktop/txt/b.txt"; 
		String d = "C:/Users/Administrator/Desktop/txt/d.txt"; 
		String e = "C:/Users/Administrator/Desktop/txt/e.txt"; 
		String c = "C:/Users/Administrator/Desktop/txt/c.txt"; 
		List<String> Temp_A;
		List<String> Temp_B;
		List<String> Temp_C;
		List<String> Temp_D;
		List<String> Temp_E;
		File afile = new File(a);  
		File bfile = new File(b); 
		File dfile = new File(d);  
		File efile = new File(e); 
		BufferedReader areader = null;  
		BufferedReader breader = null;  
		BufferedReader dreader = null;  
		BufferedReader ereader = null;  
		try {  
			areader = new BufferedReader(new FileReader(afile));  
			breader = new BufferedReader(new FileReader(bfile));  
			dreader = new BufferedReader(new FileReader(dfile));  
			ereader = new BufferedReader(new FileReader(efile));  
			String atempString = null;  
			String btempString = null;  
			String dtempString = null;  
			String etempString = null;  
			Temp_A= new ArrayList<String>();
			Temp_B= new ArrayList<String>();
			Temp_D= new ArrayList<String>();
			Temp_E= new ArrayList<String>();
			Temp_C= new ArrayList<String>();
			while ((atempString = areader.readLine()) != null) {  
				Temp_A.add(atempString);  
			}  
			while ((btempString = breader.readLine()) != null) {  
				Temp_B.add(btempString);  
			}
			while ((dtempString = dreader.readLine()) != null) {  
				Temp_D.add(dtempString);  
			}  
			while ((etempString = ereader.readLine()) != null) {  
				Temp_E.add(etempString);  
			}
			areader.close();  
			breader.close(); 
			dreader.close();  
			ereader.close();  
			Temp_C.add("瑶光学药");
			int i1=0;
			for(int i= 0;i<Temp_A.size();i++) {
				String temp= Temp_A.get(i).toString();
				if(temp.contains("【")) {
					Temp_C.add("摘要"+(++i1));
					String temp_nor= temp.replace("【", "");
					temp_nor= temp_nor.replace("】", "");
					temp_nor= temp_nor.replace(" ", "");
					Temp_C.add("\n"+temp_nor+"\n");
					int l=i;
					while(++l<Temp_A.size()&&!Temp_A.get(l).contains("【")) {
						Temp_C.add(Temp_A.get(l).replace(",", "."));
					}
					//b

					for(int j=0;j<Temp_B.size();j++){
						if(Temp_B.get(j).replace(" ", "").equals(temp_nor)) {
							Temp_C.add("害利"+Temp_B.get(j).replace(",", "."));
							int k=j;
							while(++k<Temp_B.size() && !Temp_B.get(k).contains("药队")) {
								Temp_C.add(Temp_B.get(k).replace(",", "."));
							}
						}
					}
					//d
					for(int j=0;j<Temp_D.size();j++){
						if(Temp_D.get(j).replace(" ", "").equals(temp_nor)) {
							Temp_C.add("崇源"+Temp_D.get(j).replace(",", "."));
							int k=j;
							while(++k<Temp_D.size() && !(Temp_D.get(k).contains("卷下本经下品")||Temp_D.get(k).contains("卷中本经中品") ||Temp_D.get(k).contains("卷上本经上品"))) {
								Temp_C.add(Temp_D.get(k).replace(",", "."));
							}
						}
					}	
					//e
					for(int j=0;j<Temp_E.size();j++)
					{	
						if(Temp_E.get(j).replace(" ", "").replace("【", "").replace("】", "").equals(temp_nor)) {
							Temp_C.add("经解"+Temp_E.get(j).replace(",", "."));
							int k=j;
							while(++k<Temp_E.size() && !(Temp_E.get(k).contains("【")||Temp_E.get(k).contains("】")||Temp_E.get(k).contains("附余考证"))) {
								Temp_C.add(Temp_E.get(k).replace(",", "."));
							}
						}
					}
				}
			}
			FileWriter fw = null;
			BufferedReader br = null;
			try {
				fw = new FileWriter(c, true);
				br = new BufferedReader(new InputStreamReader(
						new FileInputStream(c), "UTF-8"));
				// String line = null;
				for(int i=0;i<Temp_C.size();i++)
				{  
					String VALID=Temp_C.get(i);
					if(Temp_C.get(i).contains("摘要")) {
						fw.write("\r\n");
						fw.write("\r\n");
						fw.write(Temp_C.get(i).replace(" ", "").replace(",", "."));
						fw.write("\r\n");
						fw.write("\r\n");
					}else if(Temp_C.get(i).contains("置方")||Temp_C.get(i).contains("〔利〕")
							||Temp_C.get(i).contains("〔害〕")||Temp_C.get(i).contains("经解")
							||Temp_C.get(i).contains("修治")||Temp_C.get(i).contains("崇源")
							||Temp_C.get(i).contains("愚按")||Temp_C.get(i).contains("害利")
							||Temp_C.get(i).contains("附余")) {
						fw.write("\r\n");  
						fw.write(Temp_C.get(i).replace(" ", "").replace(",", "."));
					}
					else if(!VALID.replace(" ","").replace(",", ".").equals("")){
						fw.write(Temp_C.get(i).replace(" ", "。").replace(",", "."));  
					}
					fw.flush();
				}
				br.close();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				if (fw != null) {
					try {
						fw.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		} catch (IOException e1) {  
			e1.printStackTrace();  
		} finally {  
			if (areader != null) {  
				try {  
					areader.close();  
					breader.close();  
					dreader.close();  
					ereader.close();  
				} catch (IOException e1) {  
				}  
			}  
		}  
	}  
}	
